package com.development.easysensortools

import android.annotation.SuppressLint
import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.icu.util.DateInterval
import android.os.Build
import android.os.CountDownTimer
import android.os.Looper
import android.provider.Settings
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.development.sensor.SensorOuterClass.*
import com.google.android.gms.location.*
import java.util.*
import java.util.concurrent.TimeUnit


class SensorManager : SensorEventListener {

    /* activity variables
    * */
    private lateinit var mainActivity  : AppCompatActivity
    private lateinit var sensorManager : SensorManager
    private lateinit var timerObject   : CountDownTimer
    private lateinit var databaseTools : DatabaseTools
    private lateinit var storageTools  : StorageTools


    private lateinit var fusedLocationClient: FusedLocationProviderClient
    private lateinit var locationCallback: LocationCallback
    private lateinit var locationRequest: LocationRequest

    private var samplingRate    = 100
    private var refreshInterval = 1
    private var refreshCounter  = 0
    private var amplifyEnabled  = false

    /* Sensor Values
    * */
    private var startingTimestamp : Long = 0
    private var currentTimestamp  : Long = 0
    private lateinit var deviceId : String  //Settings.Secure.getString(mainActivity.contentResolver, Settings.Secure.ANDROID_ID)
    private lateinit var tripId   : String

    private var sensorSet : MutableList<Map<String,Any>> = mutableListOf()
    private var sensor    : MutableMap<String, Any> = mutableMapOf(
        "timestamp" to 0,
        "loc" to emptyMap<String,Any>(),
        "acc" to emptyMap<String,Any>(),
        "rot" to emptyMap<String,Any>(),
        "gyr" to emptyMap<String,Any>(),
        "lin" to emptyMap<String,Any>(),
        "gra" to emptyMap<String,Any>(),
        "mag" to emptyMap<String,Any>(),
    )
    private val sensorMap : Map<String, Int> = mapOf(
        "TYPE_ACCELEROMETER"       to Sensor.TYPE_ACCELEROMETER,
        "TYPE_ROTATION_VECTOR"     to Sensor.TYPE_ROTATION_VECTOR,
        "TYPE_GYROSCOPE"           to Sensor.TYPE_GYROSCOPE,
        "TYPE_LINEAR_ACCELERATION" to Sensor.TYPE_LINEAR_ACCELERATION,
        "TYPE_GRAVITY"             to Sensor.TYPE_GRAVITY,
        "TYPE_MAGNETIC_FIELD"      to Sensor.TYPE_MAGNETIC_FIELD,
    )

    private var subscriptions : List<String> = emptyList()

    constructor(
        activity: AppCompatActivity,
        mSubscriptions: List<String>,
        mStorageTools: StorageTools,
        mSamplingRate : Int = 100,
        mRefreshInterval: Int = 2
    ) {
        // device vars
        mainActivity = activity
        deviceId = Settings.Secure.getString(mainActivity.contentResolver, Settings.Secure.ANDROID_ID)
        tripId   = UUID.randomUUID().toString().substring(0,15)
        // subscription based vars
        subscriptions = mSubscriptions
        subscriptions = mSubscriptions
        samplingRate = mSamplingRate
        // special objects
        validateSubscriptions(mSubscriptions)
        sensorManager = mainActivity.getSystemService(Context.SENSOR_SERVICE) as SensorManager
        databaseTools = DatabaseTools(mainActivity, deviceId, tripId)
        storageTools  = mStorageTools
    }

    @SuppressLint("MissingPermission")
    private fun setupFusedLocation() {
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(mainActivity)

        locationRequest = LocationRequest.create().apply {
            interval        = 10 //TimeUnit.SECONDS.toMillis(60)
            fastestInterval = 10 //TimeUnit.SECONDS.toMillis(60)
            maxWaitTime     = 10 //TimeUnit.MINUTES.toMillis(2)
        }

        locationCallback = object : LocationCallback() {
            @RequiresApi(Build.VERSION_CODES.O)
            override fun onLocationResult(p0: LocationResult) { p0 ?: return
                for (location in p0.locations){
                    Log.i("DEV", "location - {${location.latitude}}")
                        sensor["loc"] = mapOf(
                            "latitude"  to location.latitude,
                            "longitude" to location.longitude,
                            "altitude"  to location.altitude,
                            "speed"     to location.speed,
                            "time"      to location.time,
                            "accuracy"  to location.accuracy,
                            "verticalAccuracyMeters"        to location.verticalAccuracyMeters,
                            "speedAccuracyMetersPerSecond"  to location.speedAccuracyMetersPerSecond,
                            "bearingAccuracyDegrees"        to location.bearingAccuracyDegrees,
                        )
                } }
        }
    }

    @SuppressLint("MissingPermission")
    private fun startUpdatingLocation() {
        setupFusedLocation()
        fusedLocationClient.requestLocationUpdates(locationRequest, locationCallback, Looper.myLooper()!! /* Looper */)
    }

    private fun stopUpdatingLocation() {
        fusedLocationClient.removeLocationUpdates(locationCallback)
    }

    private fun startStamping() {
        // set start time [the time in nanoseconds]
        startingTimestamp = System.currentTimeMillis();

        Log.i("diff", currentTimestamp.toString())
        timerObject = object : CountDownTimer(10000, samplingRate.toLong()) { //1000 is 1 second
            override fun onTick(millisUntilFinished: Long) {
                Log.d("TIMER", sensor.toString())
                Log.d("TIMER", samplingRate.toString())
                currentTimestamp = System.currentTimeMillis()
                var temp : Map<String,Any> = sensor["loc"] as Map<String, Any>
                if ("latitude" in temp) { databaseTools.dumpSensor(sensor) }

                val diffInMin: Long = TimeUnit.MILLISECONDS.toMinutes((currentTimestamp-startingTimestamp))
                if (diffInMin >= refreshInterval) {
                    Log.i("diff", "$refreshInterval minutes have passed")
                    refresh()
                }
            }
            override fun onFinish() { timerObject.start() }
        }
        timerObject.start()
    }

    fun refresh() {
        Log.i("refresh", "Refresh was called")
        if (amplifyEnabled) storageTools.uploadAll()
        refreshCounter += 1
        startingTimestamp = System.currentTimeMillis()
        var meta : Map<String, Any> = mapOf(
            "startingTimestamp" to startingTimestamp,
            "endingTimestamp"   to currentTimestamp,
            "deviceId"          to deviceId
        )
        databaseTools.dumpProtobuf(meta)
        databaseTools.incrementDatabase()
    }

    private fun stopStamping() {
        startingTimestamp = System.currentTimeMillis();
        timerObject.cancel()
    }

    fun start(mSamplingPeriodUs: Int, mRefreshInterval: Int, mAmplifyEnabled: Boolean) {
        samplingRate   = mSamplingPeriodUs
        refreshInterval = mRefreshInterval
        amplifyEnabled = mAmplifyEnabled

        databaseTools.refreshDatabase(tripId)
        registerListeners()
        startUpdatingLocation()
        startStamping()
    }
    fun stop() {
        var meta : Map<String, Any> = mapOf(
            "startingTimestamp" to startingTimestamp,
            "endingTimestamp"   to currentTimestamp,
            "deviceId"          to deviceId
        )
        databaseTools.dumpProtobuf(meta)
        unregisterListeners()
        stopUpdatingLocation()
        stopStamping()
        refreshCounter = 0
        startingTimestamp = 0
        currentTimestamp   = 0
        sensorSet = mutableListOf()
        tripId   = UUID.randomUUID().toString().substring(0,15)
    }

    private fun validateSubscriptions(subscriptions: List<String>) {
        subscriptions.forEach {
            if (it !in sensorMap.keys) { throw Exception("Subscriptions: INVALID SENSOR TYPES") }
        }
        Log.i("test",subscriptions.toString())
        if (!subscriptions.contains("TYPE_ACCELEROMETER"))   { throw Exception("Subscriptions: TYPE_ACCELEROMETER") }
        if (!subscriptions.contains("TYPE_ROTATION_VECTOR")) { throw Exception("Subscriptions: TYPE_ROTATION_VECTOR") }
        if (!subscriptions.contains("TYPE_GYROSCOPE"))       { throw Exception("Subscriptions: TYPE_GYROSCOPE") }
    }

    fun registerListeners()   { subscriptions.forEach() { sensorMap[it]?.let { it1 -> startSensorUpdates(sensorManager.getDefaultSensor(it1)) } } }
    fun unregisterListeners() { subscriptions.forEach() { sensorMap[it]?.let { it1 -> stopSensorUpdates(sensorManager.getDefaultSensor(it1)) } } }
    private fun startSensorUpdates(sensor: Sensor) { sensorManager.registerListener( this, sensor, SensorManager.SENSOR_DELAY_NORMAL, SensorManager.SENSOR_DELAY_NORMAL ) }
    private fun stopSensorUpdates(sensor: Sensor)  { sensorManager.unregisterListener(this, sensor) }

    override fun onSensorChanged(event: SensorEvent) {

        Log.i("DEV","{$event.type}, {$event.timestamp}")
        sensor["timestamp"] = event.timestamp

        when (event.sensor.type) {
            Sensor.TYPE_ACCELEROMETER       ->{ sensor["acc"] = mapOf(
                "x" to event.values[0],
                "y" to event.values[1],
                "z" to event.values[2]
            )}
            Sensor.TYPE_ROTATION_VECTOR     ->{ sensor["rot"] = mapOf(
                "x" to event.values[0],
                "y" to event.values[1],
                "z" to event.values[2],
                "cos"      to event.values[3],
                "accuracy" to event.values[4],
            )}
            Sensor.TYPE_GYROSCOPE           ->{ sensor["gyr"] = mapOf(
                "x" to event.values[0],
                "y" to event.values[1],
                "z" to event.values[2]
            )}
            Sensor.TYPE_LINEAR_ACCELERATION ->{ sensor["lin"] = mapOf(
                "x" to event.values[0],
                "y" to event.values[1],
                "z" to event.values[2]
            )}
            Sensor.TYPE_GRAVITY             ->{ sensor["gra"] = mapOf(
                "x" to event.values[0],
                "y" to event.values[1],
                "z" to event.values[2]
            )}
            Sensor.TYPE_MAGNETIC_FIELD      ->{ sensor["mag"] = mapOf(
                "x" to event.values[0],
                "y" to event.values[1],
                "z" to event.values[2]
            )}
        }
    }



    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {
        Log.i("EST", "onAccuracyChangedCalled")
    }
}


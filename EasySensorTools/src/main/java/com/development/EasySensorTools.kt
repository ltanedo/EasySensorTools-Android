package com.development
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.development.easysensortools.AmplifyTools
import com.development.easysensortools.ProtobufTools
import com.development.easysensortools.SensorManager
import com.development.easysensortools.StorageTools
import com.development.sensor.SensorOuterClass
import java.io.File
import java.io.FileOutputStream
import java.lang.Exception


class EasySensorTools {

    // Configuration
    private var samplingPeriodUs : Int      = 20000
    private var refreshInterval  : Int      = 20000
    private var amplifyEnabled   : Boolean  = false
    private var runCleanup       : Boolean  = false


    // References to main app
    private lateinit var mainActivity  : AppCompatActivity
    private lateinit var sensorManager : SensorManager
    private lateinit var storageTools  : StorageTools
    private lateinit var amplifyTools  : AmplifyTools


    constructor(activity: AppCompatActivity, mSubscriptions: List<String>) {
        storageTools = StorageTools(activity)
        sensorManager = SensorManager(activity, mSubscriptions, storageTools)

//        amplifyTools = AmplifyTools(activity)
    }

    fun start(
        mSamplingPeriodUs : Int = 100,
        mRefreshInterval  : Int = 1,
        mAmplifyEnabled : Boolean = true,
        mRunCleanup     : Boolean = false
    ) {
        samplingPeriodUs = mSamplingPeriodUs
        refreshInterval  = mRefreshInterval
        amplifyEnabled   = mAmplifyEnabled
        runCleanup       = mRunCleanup
        sensorManager.start(mSamplingPeriodUs, mRefreshInterval, mAmplifyEnabled)
    }

    fun stop() {
        sensorManager.stop()

        if (amplifyEnabled) storageTools.uploadAll()
        if (amplifyEnabled) storageTools.cleanup()
    }

}
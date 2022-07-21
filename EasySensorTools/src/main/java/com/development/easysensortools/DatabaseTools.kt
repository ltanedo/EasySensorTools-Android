package com.development.easysensortools

import android.annotation.SuppressLint
import android.content.Context
import android.database.Cursor
import android.provider.Settings
import com.development.easiestsqllib.Column
import com.development.easiestsqllib.Datum
import com.development.easiestsqllib.EasiestDB
import com.development.sensor.SensorOuterClass
import com.google.protobuf.util.JsonFormat
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.lang.Exception
import java.lang.RuntimeException
import java.util.*


class DatabaseTools {

    private var context : Context
    private lateinit var easiestDB : EasiestDB

    private var dbName   : String = "invalid.db"
    private var deviceId : String
    var randomId : String
    private var refreshCounter = 0

    @SuppressLint("HardwareIds")
    constructor(mContext: Context, mDeviceId : String, mRandomId : String) {
        context  = mContext
        deviceId = mDeviceId
        randomId = mRandomId
        dbName   = "TRIP_${deviceId}_${randomId}_${refreshCounter}"
    }

    fun incrementDatabase() {
        refreshCounter += 1
        dbName   = "TRIP_${deviceId}_${randomId}_${refreshCounter}"
        generateDatabase()
    }

    fun refreshDatabase(NewRandomId : String) {
        refreshCounter = 0
        dbName   = "TRIP_${deviceId}_${NewRandomId}_${refreshCounter}"
        generateDatabase()
    }

    fun generateDatabase() {
        easiestDB = EasiestDB.init(context, dbName)
            .addTableColumns(
                "Meta",
                Column("Meta", "text"),
            )
            .addTableColumns(
                "SensorSet",
                Column("Sensor", "text"),
            )
            .doneAddingTables()
    }

    fun dumpProtobuf() {
        var tripString : String = unpackAll()
        try {
            var temp = ProtobufTools.toProto(
                tripString,
                SensorOuterClass.Trip.getDefaultInstance()
            )
            dbName = dbName.replace(".DB",".pb")
            val file = File(context.filesDir, "$dbName.pb")
            FileOutputStream(file).use { output ->
                temp.writeTo(output)
            }
        } catch (e: Exception) { }
        easiestDB.deleteDatabase()

        incrementDatabase()
    }

    private fun unpackAll(): String {

        val metaJSON      = unpackMeta()
        val metaSensorSet = unpackSensorSet()

        var Trip : Map<String, Any> = mapOf(
            "startingTimestamp" to 0,
            "endingTimestamp"   to 2,
            "deviceId"          to "hello",

            "SensorSet" to metaSensorSet
        )

        return JSONObject(Trip).toString()
    }

    private fun unpackSensorSet(): MutableList<JSONObject> {
        var cursor       : Cursor= easiestDB.getAllDataFrom(1)
        var listUnpacked : MutableList<JSONObject> = mutableListOf()
        while (cursor.moveToNext()) {
            listUnpacked.add(JSONObject(cursor.getString(1)))
        }
        cursor.close()
        return listUnpacked
    }

    private fun unpackMeta(): JSONObject {
        var cursor = easiestDB.getOneRowData("META", 1) // rowNumber starts from 1 but tableIndex starts from 0
        var packedMeta = ""
        if (cursor != null) {
            cursor.moveToFirst()
            packedMeta = cursor.getString(1)
        }
        cursor?.close()

        return JSONObject(packedMeta)
    }

    fun dumpMeta(meta : Map<String, Any>) {
        var packed_str : String = JSONObject(meta).toString()
        easiestDB.addDataInTable(
            0,
            Datum(1, packed_str),
        )
    }

    fun dumpSensor(sensor : Map<String, Any>) {
        var packed_str : String = JSONObject(sensor).toString()
        easiestDB.addDataInTable(
            1,
            Datum(1, packed_str),
        )
    }






}
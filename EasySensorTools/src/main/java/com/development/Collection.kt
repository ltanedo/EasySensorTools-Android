package com.development
import androidx.appcompat.app.AppCompatActivity
import com.development.easysensortools.DatabaseTools
import com.development.easysensortools.SensorManager
import com.development.easysensortools.StorageTools


class Collection {

    // Configuration
    private val samplingPeriodUs : Int      = 20000
    private val refreshInterval  : Int      = 20000
    private val amplifyEnabled   : Boolean  = false
    private val runCleanup       : Boolean  = false


    // References to main app
    private lateinit var mainActivity  : AppCompatActivity
    private lateinit var sensorManager: SensorManager
    private lateinit var storageTools: StorageTools


    constructor(activity: AppCompatActivity, mSubscriptions: List<String>) {
        sensorManager = SensorManager(activity, mSubscriptions)
        storageTools = StorageTools(activity)
    }

    fun start(
        samplingPeriodUs : Int = 2000,
        refreshInterval  : Int = 2,
        amplifyEnabled : Boolean = false,
        runCleanup     : Boolean = false
    ) {
        // TODO: 1. check for databases without proto -> build [StorageTools]
        // TODO: 2. check for proto not pushed -> push         [StorageTools]
        sensorManager.start()
    }

    fun stop() {
        sensorManager.stop()
        // TODO: check for proto not pushed -> push            [StorageTools]
    }

}
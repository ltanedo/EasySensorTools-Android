package com.development.example

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.ActivityCompat
import com.development.example.databinding.ActivityMainBinding

import com.development.Collection

class MainActivity : AppCompatActivity() {

    // Activity binding
    private lateinit var binding: ActivityMainBinding
    // Layout IDs
    private lateinit var startServiceButton : Button
    private lateinit var dataTextView: TextView

    private lateinit var mTestSDK : Collection
    private var isRunning = false

    override fun onCreate(savedInstanceState: Bundle?) {

        // Standard onCreate code
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        requestPermissions()

        // Set Button Listener Code
        startServiceButton = this.findViewById(R.id.startServiceButton) as Button
        startServiceButton.setOnClickListener() {
            when (isRunning) {
                false -> startCollectionExample()
                true  -> stopCollectionExample()
            }
        }

        mTestSDK = Collection(
            this,
            listOf(
                "TYPE_ACCELEROMETER",
                "TYPE_ROTATION_VECTOR",
                "TYPE_GYROSCOPE",
                "TYPE_LINEAR_ACCELERATION",
                "TYPE_GRAVITY",
                "TYPE_MAGNETIC_FIELD"
            )
        )

//        try {
//            // Add these lines to add the AWSCognitoAuthPlugin and AWSS3StoragePlugin plugins
//            Amplify.addPlugin(AWSCognitoAuthPlugin())
//            Amplify.addPlugin(AWSS3StoragePlugin())
//            Amplify.configure(mainActivity.applicationContext)
//
//            Log.d("MyAmplifyApp", "Initialized Amplify")
//        } catch (error: AmplifyException) {
//            Log.e("MyAmplifyApp", "Could not initialize Amplify", error)
//        }
    }

    private fun requestPermissions() {

        var mainContext = applicationContext

        if (ActivityCompat.checkSelfPermission(
                mainContext!!,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED &&
            ActivityCompat.checkSelfPermission(
                mainContext!!,
                Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(
                this, arrayOf(
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.ACCESS_FINE_LOCATION,
//                    Manifest.permission.READ_EXTERNAL_STORAGE
                ),
                1
            )
        } else {
            Log.e("DB", "PERMISSION ALREADY GRANTED")
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        Log.e("Permissions","onRequestPermissionsResult called")
        when (requestCode) {
            1 -> {
                Toast.makeText(this, "Permission Granted", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun startCollectionExample() {
        startServiceButton.text = "STOP COLLECTING";
        mTestSDK.start()
        isRunning = true
    }

    private fun stopCollectionExample() {
        startServiceButton.text = "START COLLECTING"
        mTestSDK.stop()
        isRunning = false
    }
}
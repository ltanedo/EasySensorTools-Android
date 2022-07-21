package com.development.easysensortools

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.test.core.app.ApplicationProvider
import androidx.test.core.app.ApplicationProvider.getApplicationContext

import com.amplifyframework.AmplifyException
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin
import com.amplifyframework.core.Amplify
import com.amplifyframework.core.Amplify.*
import com.amplifyframework.storage.s3.AWSS3StoragePlugin
import java.io.BufferedWriter
import java.io.File
import java.io.FileWriter

//npm install aws-amplify
//amplify init
class AmplifyTools {

    private lateinit var Context: Context

    constructor(context: Context) {
        Context = context
        Log.e("AMP", "Initialized Amplify")
        try {
            // Add these lines to add the AWSCognitoAuthPlugin and AWSS3StoragePlugin plugins
            Amplify.addPlugin(AWSCognitoAuthPlugin())
            Amplify.addPlugin(AWSS3StoragePlugin())
            Amplify.configure(Context)

            Log.d("MyAmplifyApp", "Initialized Amplify")
        } catch (error: AmplifyException) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error)
        }
    }

    fun uploadfile(file: File) {

        val exampleFile = File(Context.filesDir, "ExampleKey")
        exampleFile.writeText("Example file contents")

        Amplify.Storage.uploadFile("temp1.pb", file,
            { Log.i("MyAmplifyApp", "Successfully uploaded: ${it.key}");  file.delete() },
            { Log.e("MyAmplifyApp", "Upload failed", it) }
        )
    }
}

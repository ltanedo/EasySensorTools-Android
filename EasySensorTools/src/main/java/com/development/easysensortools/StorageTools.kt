package com.development.easysensortools

import android.content.Context
import android.util.Log
import com.development.easiestsqllib.Column
import com.development.easiestsqllib.EasiestDB
import java.io.File
import java.lang.Exception

class StorageTools {

    private lateinit var context      : Context
    private lateinit var amplifyTools : AmplifyTools


    constructor(mContext: Context) {
        context = mContext
        amplifyTools = AmplifyTools(context)
    }

    fun getDatabases(): Array<File> {
        val path = context.filesDir.toString().substring(0, context.filesDir.toString().lastIndexOf("/")) + "/databases"
        val directory = File(path)
        val files: Array<File> = directory.listFiles()
        Log.d("Files", "Path: $path" + "Size: " + files.size)
        for (i in files.indices) { Log.d("Files", "FileName:" + files[i].getName()) }
        return files
    }

    fun getFiles(): Array<File> {
        Log.i("AWS", "i was called")
        val directory = context.filesDir
        val path = directory.toString()
        val files: Array<File> = directory.listFiles()
        Log.d("Files", "Path: $path" + "Size: " + files.size)
        for (i in files.indices) { Log.d("Files", "FileName:" + files[i].getName()) }
        return files
    }

    fun uploadAll() {
        var files : Array<File> = getFiles()
        files.forEach { file ->
            try {
                amplifyTools.uploadFile(file,file.name)
                Log.i("AWS", "${file.extension} - ${file.toString()}")
            } catch (e: Exception) { Log.i("AWS", "$file - Upload failure") }
        }
    }

    fun cleanup() {
//        var files : Array<File> = storageTools.getDatabases()
//        files.forEach { file ->
//            if (
//                "DEMO_DATABASE" in file.toString()      ||
//                "awss3transfertable" in file.toString() ||
//                file.extension == "db-journal"          ||
//                file.extension == "DB-journal"
//            ) return@forEach
//
//            Log.i("convertDBtoProto()", "${file.extension} - ${file.toString()}")
//            try {
//                var temp = ProtobufTools.toProto(
//                    tripString,
//                    SensorOuterClass.Trip.getDefaultInstance()
//                )
//                dbName = dbName.replace(".DB",".pb")
//                val file = File(context.filesDir, "$dbName.pb")
//                FileOutputStream(file).use { output ->
//                    temp.writeTo(output)
//                }
//            } catch (e: Exception) { }
//        }
    }

}
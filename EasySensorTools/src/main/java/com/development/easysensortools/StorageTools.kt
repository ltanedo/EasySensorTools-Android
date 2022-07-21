package com.development.easysensortools

import android.content.Context
import android.util.Log
import com.development.easiestsqllib.Column
import com.development.easiestsqllib.EasiestDB
import java.io.File

class StorageTools {

    private lateinit var context : Context

    constructor(mContext: Context) {
        context = mContext
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
        val directory = context.filesDir
        val path = directory.toString()
        val files: Array<File> = directory.listFiles()
        Log.d("Files", "Path: $path" + "Size: " + files.size)
        for (i in files.indices) { Log.d("Files", "FileName:" + files[i].getName()) }
        return files
    }

    fun convertDBtoProto() {
        // TODO: for loop -> alldb toprotobuff
        // if failed delete db
        var files : Array<File> = getDatabases()
        if (files.isEmpty()) return


        files.forEach { file ->
            if (
                "DEMO_DATABASE" in file.toString()      ||
                "awss3transfertable" in file.toString() ||
                file.extension == "db-journal"          ||
                file.extension == "DB-journal"
            ) return@forEach

            Log.i("convertDBtoProto()", "${file.extension} - ${file.toString()}")
        }
    }

    fun pushAllProto() {
        // TODO: for loop
        // push all proto
    }
}
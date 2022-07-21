package com.development.easysensortools

import android.util.Log
import com.google.protobuf.Message
import com.google.protobuf.util.JsonFormat
import com.google.protobuf.MessageOrBuilder
import org.json.JSONObject
import java.io.File
import java.io.FileOutputStream
import java.lang.Exception
import java.lang.RuntimeException

import com.development.sensor.SensorOuterClass


/**
 * Author @espresso stackoverflow.
 * Sample use:
 * Model.Person reqObj = ProtoUtil.toProto(reqJson, Model.Person.getDefaultInstance());
 * Model.Person res = personSvc.update(reqObj);
 * final String resJson = ProtoUtil.toJson(res);
 */
object ProtobufTools {
    fun <T : Message?> toJson(obj: T): String {
        return try {
            JsonFormat.printer().print(obj)
        } catch (e: Exception) {
            throw RuntimeException("Error converting Proto to json", e)
        }
    }

    fun <T : MessageOrBuilder?> toProto(protoJsonStr: String?, message: T): T {
        return try {
            val builder =
                message!!.defaultInstanceForType.toBuilder()
            JsonFormat.parser().ignoringUnknownFields().merge(protoJsonStr, builder)
            builder.build() as T
        } catch (e: Exception) {
            throw RuntimeException("Error converting Json to proto", e)
        }
    }

    fun toFile(directory : File, Trip : Map<String, Any>): File {
        var temp = ProtobufTools.toProto(
            JSONObject(Trip).toString(),
            SensorOuterClass.Trip.getDefaultInstance()
        )
//        Log.d("PROTO", temp!!::class.qualifiedName.toString())
//        Log.d("PROTO", temp.toString())

        val file = File(directory, "temp.pb")
        FileOutputStream(file).use { output ->
            temp.writeTo(output)
        }

        return file
    }
}
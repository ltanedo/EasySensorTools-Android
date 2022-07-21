# EasySensorTools-Android
An android sdk to easy collect batches of multiple sensor values at synconized rates.  Extra features includ dual caching to sqllite and protobuf with type checking.  An AWS Amplify Storage wrapper is also included for easy uploading to AWS S3.

## Usage
1. Copy EasySensorTools folder into directory of Android Project
2. Add project implementation into build.gradle [module: app] of main project
```   
implementation project(path: ':EasySensorTools')
```
3. Use the library (example code below)
- import class (library)
- instantiate the EasySensorTools() object
- pass "this" (the context/mainActivity)
- pass listOf(SensorType) as String
```
import com.development.EasySensorTools

class MainActivity : AppCompatActivity() {
    easySensorTools = EasySensorTools(
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
    
    // To Start
    easySensorTools.start(
      mSamplingPeriodUs = period (miliseconds) to collect sensor values, 
      mRefreshInterval  = period (minutes)     to dump and/or upload sensor values, 
      mAmplifyEnabled   = boolean (true/false) to enable uploading
    )
    
    // To Stop
    easySensorTools.stop()
    
    // To upload all ".pb" files(if AWSAmplify Storage is setup)
    easySensorTools.storageManager.uploadAll()
    
```

## Example Protobuf Schema
- output will be in pure protobuf 
- needs to be decded with included "sensor.proto" schema file
- incomplete example below
```
/*****************************************************************************
            Relevant Documents Below
----------------------------------------------------------------------------
https://developers.google.com/protocol-buffers/docs/proto3
https://developer.android.com/reference/android/hardware/SensorEvent#values
******************************************************************************/

syntax = "proto3";

message Sensor {

    int64 timestamp = 1;
    LOCATION loc    = 2;

    /* required */
    TYPE_ACCELEROMETER    acc = 3;
    TYPE_ROTATION_VECTOR  rot = 4;
    TYPE_GYROSCOPE        gyr = 5;

    /* optional */
    optional TYPE_LINEAR_ACCELERATION  lin = 6;
    optional TYPE_GRAVITY              gra = 7;
    optional TYPE_MAGNETIC_FIELD       mag = 8;
    optional TYPE_ORIENTATION          ori = 9;
}

message Trip { 
    int64  startingTimestamp = 1;
    int64  endingTimestamp   = 2;
    string deviceId          = 3;

    repeated Sensor SensorSet  = 4;
}

...


```
 

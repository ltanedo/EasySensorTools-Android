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

## Example Output (that's JSON Parsed)
```
startingTimestamp: 1658433552592
endingTimestamp: 1658433556695
deviceId: "769c90af39fcfbd4"
SensorSet {
  timestamp: 121513809464881
  loc {
    latitude: 37.4216863
    longitude: -122.0842771
    time: 1658433553020
    accuracy: 600
  }
  acc {
    y: 9.776321
    z: 0.812345
  }
  rot {
    x: 0.6771978
    y: 1.1314983e-08
    z: 9.0172836e-07
    cos: 0.73580104
  }
  gyr {
  }
  lin {
    x: 0.0010053776
    y: 0.0033864975
    z: -0.00014686584
  }
  gra {
    x: -0.0010053776
    y: 9.772935
    z: 0.8124919
  }
  mag {
    y: 9.875
    z: -47.75
  }
}
SensorSet {
  timestamp: 121515809464881
  loc {
    latitude: 37.4216863
    longitude: -122.0842771
    time: 1658433553020
    accuracy: 600
  }
  acc {
    y: 9.776321
    z: 0.812345
  }
  rot {
    x: 0.67719775
    y: 1.19095134e-07
    z: 9.550031e-07
    cos: 0.73580104
  }
  gyr {
  }
  lin {
    x: 0.00047054014
    y: 0.003417015
    z: -0.00050503016
  }
  gra {
    x: -0.00047054014
    y: 9.772904
    z: 0.81285006
  }
  mag {
    y: 9.875
    z: -47.75
  }
}
```

## Example Protobuf Schema
- necessary to decode outputed ".pb" file
- needs to be decoded with included "sensor.proto" schema file (python is easiest to decode with)
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
 

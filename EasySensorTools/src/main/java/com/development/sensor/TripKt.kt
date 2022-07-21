//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: sensor.proto
import com.development.sensor.SensorOuterClass

@kotlin.jvm.JvmName("-initializetrip")
inline fun trip(block: TripKt.Dsl.() -> kotlin.Unit): SensorOuterClass.Trip =
  TripKt.Dsl._create(SensorOuterClass.Trip.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `Trip`
 */
object TripKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: SensorOuterClass.Trip.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: SensorOuterClass.Trip.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): SensorOuterClass.Trip = _builder.build()

    /**
     * `int64 startingTimestamp = 1;`
     */
    var startingTimestamp: kotlin.Long
      @JvmName("getStartingTimestamp")
      get() = _builder.getStartingTimestamp()
      @JvmName("setStartingTimestamp")
      set(value) {
        _builder.setStartingTimestamp(value)
      }
    /**
     * `int64 startingTimestamp = 1;`
     */
    fun clearStartingTimestamp() {
      _builder.clearStartingTimestamp()
    }

    /**
     * `int64 endingTimestamp = 2;`
     */
    var endingTimestamp: kotlin.Long
      @JvmName("getEndingTimestamp")
      get() = _builder.getEndingTimestamp()
      @JvmName("setEndingTimestamp")
      set(value) {
        _builder.setEndingTimestamp(value)
      }
    /**
     * `int64 endingTimestamp = 2;`
     */
    fun clearEndingTimestamp() {
      _builder.clearEndingTimestamp()
    }

    /**
     * `string deviceId = 3;`
     */
    var deviceId: kotlin.String
      @JvmName("getDeviceId")
      get() = _builder.getDeviceId()
      @JvmName("setDeviceId")
      set(value) {
        _builder.setDeviceId(value)
      }
    /**
     * `string deviceId = 3;`
     */
    fun clearDeviceId() {
      _builder.clearDeviceId()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    class SensorSetProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `repeated .Sensor SensorSet = 4;`
     */
     val sensorSet: com.google.protobuf.kotlin.DslList<SensorOuterClass.Sensor, SensorSetProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getSensorSetList()
      )
    /**
     * `repeated .Sensor SensorSet = 4;`
     * @param value The sensorSet to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addSensorSet")
    fun com.google.protobuf.kotlin.DslList<SensorOuterClass.Sensor, SensorSetProxy>.add(value: SensorOuterClass.Sensor) {
      _builder.addSensorSet(value)
    }
    /**
     * `repeated .Sensor SensorSet = 4;`
     * @param value The sensorSet to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignSensorSet")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<SensorOuterClass.Sensor, SensorSetProxy>.plusAssign(value: SensorOuterClass.Sensor) {
      add(value)
    }
    /**
     * `repeated .Sensor SensorSet = 4;`
     * @param values The sensorSet to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllSensorSet")
    fun com.google.protobuf.kotlin.DslList<SensorOuterClass.Sensor, SensorSetProxy>.addAll(values: kotlin.collections.Iterable<SensorOuterClass.Sensor>) {
      _builder.addAllSensorSet(values)
    }
    /**
     * `repeated .Sensor SensorSet = 4;`
     * @param values The sensorSet to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllSensorSet")
    @Suppress("NOTHING_TO_INLINE")
    inline operator fun com.google.protobuf.kotlin.DslList<SensorOuterClass.Sensor, SensorSetProxy>.plusAssign(values: kotlin.collections.Iterable<SensorOuterClass.Sensor>) {
      addAll(values)
    }
    /**
     * `repeated .Sensor SensorSet = 4;`
     * @param index The index to set the value at.
     * @param value The sensorSet to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setSensorSet")
    operator fun com.google.protobuf.kotlin.DslList<SensorOuterClass.Sensor, SensorSetProxy>.set(index: kotlin.Int, value: SensorOuterClass.Sensor) {
      _builder.setSensorSet(index, value)
    }
    /**
     * `repeated .Sensor SensorSet = 4;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearSensorSet")
    fun com.google.protobuf.kotlin.DslList<SensorOuterClass.Sensor, SensorSetProxy>.clear() {
      _builder.clearSensorSet()
    }

  }
}
@kotlin.jvm.JvmSynthetic
inline fun SensorOuterClass.Trip.copy(block: TripKt.Dsl.() -> kotlin.Unit): SensorOuterClass.Trip =
  TripKt.Dsl._create(this.toBuilder()).apply { block() }._build()


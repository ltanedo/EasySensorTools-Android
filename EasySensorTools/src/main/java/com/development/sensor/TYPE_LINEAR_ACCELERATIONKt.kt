//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: sensor.proto
import com.development.sensor.SensorOuterClass

@kotlin.jvm.JvmName("-initializetYPELINEARACCELERATION")
inline fun tYPELINEARACCELERATION(block: TYPE_LINEAR_ACCELERATIONKt.Dsl.() -> kotlin.Unit): SensorOuterClass.TYPE_LINEAR_ACCELERATION =
  TYPE_LINEAR_ACCELERATIONKt.Dsl._create(SensorOuterClass.TYPE_LINEAR_ACCELERATION.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `TYPE_LINEAR_ACCELERATION`
 */
object TYPE_LINEAR_ACCELERATIONKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  class Dsl private constructor(
    private val _builder: SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder
  ) {
    companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): SensorOuterClass.TYPE_LINEAR_ACCELERATION = _builder.build()

    /**
     * `double x = 1;`
     */
    var x: kotlin.Double
      @JvmName("getX")
      get() = _builder.getX()
      @JvmName("setX")
      set(value) {
        _builder.setX(value)
      }
    /**
     * `double x = 1;`
     */
    fun clearX() {
      _builder.clearX()
    }

    /**
     * `double y = 2;`
     */
    var y: kotlin.Double
      @JvmName("getY")
      get() = _builder.getY()
      @JvmName("setY")
      set(value) {
        _builder.setY(value)
      }
    /**
     * `double y = 2;`
     */
    fun clearY() {
      _builder.clearY()
    }

    /**
     * `double z = 3;`
     */
    var z: kotlin.Double
      @JvmName("getZ")
      get() = _builder.getZ()
      @JvmName("setZ")
      set(value) {
        _builder.setZ(value)
      }
    /**
     * `double z = 3;`
     */
    fun clearZ() {
      _builder.clearZ()
    }
  }
}
@kotlin.jvm.JvmSynthetic
inline fun SensorOuterClass.TYPE_LINEAR_ACCELERATION.copy(block: TYPE_LINEAR_ACCELERATIONKt.Dsl.() -> kotlin.Unit): SensorOuterClass.TYPE_LINEAR_ACCELERATION =
  TYPE_LINEAR_ACCELERATIONKt.Dsl._create(this.toBuilder()).apply { block() }._build()


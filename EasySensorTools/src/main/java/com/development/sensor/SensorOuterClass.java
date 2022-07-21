// source: sensor.proto
package com.development.sensor;

public final class SensorOuterClass {
  private SensorOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SensorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Sensor)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 timestamp = 1;</code>
     * @return The timestamp.
     */
    long getTimestamp();

    /**
     * <code>.LOCATION loc = 2;</code>
     * @return Whether the loc field is set.
     */
    boolean hasLoc();
    /**
     * <code>.LOCATION loc = 2;</code>
     * @return The loc.
     */
    SensorOuterClass.LOCATION getLoc();
    /**
     * <code>.LOCATION loc = 2;</code>
     */
    SensorOuterClass.LOCATIONOrBuilder getLocOrBuilder();

    /**
     * <pre>
     * required 
     * </pre>
     *
     * <code>.TYPE_ACCELEROMETER acc = 3;</code>
     * @return Whether the acc field is set.
     */
    boolean hasAcc();
    /**
     * <pre>
     * required 
     * </pre>
     *
     * <code>.TYPE_ACCELEROMETER acc = 3;</code>
     * @return The acc.
     */
    SensorOuterClass.TYPE_ACCELEROMETER getAcc();
    /**
     * <pre>
     * required 
     * </pre>
     *
     * <code>.TYPE_ACCELEROMETER acc = 3;</code>
     */
    SensorOuterClass.TYPE_ACCELEROMETEROrBuilder getAccOrBuilder();

    /**
     * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
     * @return Whether the rot field is set.
     */
    boolean hasRot();
    /**
     * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
     * @return The rot.
     */
    SensorOuterClass.TYPE_ROTATION_VECTOR getRot();
    /**
     * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
     */
    SensorOuterClass.TYPE_ROTATION_VECTOROrBuilder getRotOrBuilder();

    /**
     * <code>.TYPE_GYROSCOPE gyr = 5;</code>
     * @return Whether the gyr field is set.
     */
    boolean hasGyr();
    /**
     * <code>.TYPE_GYROSCOPE gyr = 5;</code>
     * @return The gyr.
     */
    SensorOuterClass.TYPE_GYROSCOPE getGyr();
    /**
     * <code>.TYPE_GYROSCOPE gyr = 5;</code>
     */
    SensorOuterClass.TYPE_GYROSCOPEOrBuilder getGyrOrBuilder();

    /**
     * <pre>
     * optional 
     * </pre>
     *
     * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
     * @return Whether the lin field is set.
     */
    boolean hasLin();
    /**
     * <pre>
     * optional 
     * </pre>
     *
     * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
     * @return The lin.
     */
    SensorOuterClass.TYPE_LINEAR_ACCELERATION getLin();
    /**
     * <pre>
     * optional 
     * </pre>
     *
     * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
     */
    SensorOuterClass.TYPE_LINEAR_ACCELERATIONOrBuilder getLinOrBuilder();

    /**
     * <code>optional .TYPE_GRAVITY gra = 7;</code>
     * @return Whether the gra field is set.
     */
    boolean hasGra();
    /**
     * <code>optional .TYPE_GRAVITY gra = 7;</code>
     * @return The gra.
     */
    SensorOuterClass.TYPE_GRAVITY getGra();
    /**
     * <code>optional .TYPE_GRAVITY gra = 7;</code>
     */
    SensorOuterClass.TYPE_GRAVITYOrBuilder getGraOrBuilder();

    /**
     * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
     * @return Whether the mag field is set.
     */
    boolean hasMag();
    /**
     * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
     * @return The mag.
     */
    SensorOuterClass.TYPE_MAGNETIC_FIELD getMag();
    /**
     * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
     */
    SensorOuterClass.TYPE_MAGNETIC_FIELDOrBuilder getMagOrBuilder();

    /**
     * <code>optional .TYPE_ORIENTATION ori = 9;</code>
     * @return Whether the ori field is set.
     */
    boolean hasOri();
    /**
     * <code>optional .TYPE_ORIENTATION ori = 9;</code>
     * @return The ori.
     */
    SensorOuterClass.TYPE_ORIENTATION getOri();
    /**
     * <code>optional .TYPE_ORIENTATION ori = 9;</code>
     */
    SensorOuterClass.TYPE_ORIENTATIONOrBuilder getOriOrBuilder();
  }
  /**
   * Protobuf type {@code Sensor}
   */
  public static final class Sensor extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Sensor)
      SensorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Sensor.newBuilder() to construct.
    private Sensor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Sensor() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Sensor();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Sensor(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              timestamp_ = input.readInt64();
              break;
            }
            case 18: {
              SensorOuterClass.LOCATION.Builder subBuilder = null;
              if (loc_ != null) {
                subBuilder = loc_.toBuilder();
              }
              loc_ = input.readMessage(SensorOuterClass.LOCATION.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(loc_);
                loc_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              SensorOuterClass.TYPE_ACCELEROMETER.Builder subBuilder = null;
              if (acc_ != null) {
                subBuilder = acc_.toBuilder();
              }
              acc_ = input.readMessage(SensorOuterClass.TYPE_ACCELEROMETER.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(acc_);
                acc_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              SensorOuterClass.TYPE_ROTATION_VECTOR.Builder subBuilder = null;
              if (rot_ != null) {
                subBuilder = rot_.toBuilder();
              }
              rot_ = input.readMessage(SensorOuterClass.TYPE_ROTATION_VECTOR.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(rot_);
                rot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 42: {
              SensorOuterClass.TYPE_GYROSCOPE.Builder subBuilder = null;
              if (gyr_ != null) {
                subBuilder = gyr_.toBuilder();
              }
              gyr_ = input.readMessage(SensorOuterClass.TYPE_GYROSCOPE.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gyr_);
                gyr_ = subBuilder.buildPartial();
              }

              break;
            }
            case 50: {
              SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder subBuilder = null;
              if (((bitField0_ & 0x00000001) != 0)) {
                subBuilder = lin_.toBuilder();
              }
              lin_ = input.readMessage(SensorOuterClass.TYPE_LINEAR_ACCELERATION.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lin_);
                lin_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000001;
              break;
            }
            case 58: {
              SensorOuterClass.TYPE_GRAVITY.Builder subBuilder = null;
              if (((bitField0_ & 0x00000002) != 0)) {
                subBuilder = gra_.toBuilder();
              }
              gra_ = input.readMessage(SensorOuterClass.TYPE_GRAVITY.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gra_);
                gra_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000002;
              break;
            }
            case 66: {
              SensorOuterClass.TYPE_MAGNETIC_FIELD.Builder subBuilder = null;
              if (((bitField0_ & 0x00000004) != 0)) {
                subBuilder = mag_.toBuilder();
              }
              mag_ = input.readMessage(SensorOuterClass.TYPE_MAGNETIC_FIELD.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(mag_);
                mag_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000004;
              break;
            }
            case 74: {
              SensorOuterClass.TYPE_ORIENTATION.Builder subBuilder = null;
              if (((bitField0_ & 0x00000008) != 0)) {
                subBuilder = ori_.toBuilder();
              }
              ori_ = input.readMessage(SensorOuterClass.TYPE_ORIENTATION.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(ori_);
                ori_ = subBuilder.buildPartial();
              }
              bitField0_ |= 0x00000008;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_Sensor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_Sensor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.Sensor.class, SensorOuterClass.Sensor.Builder.class);
    }

    private int bitField0_;
    public static final int TIMESTAMP_FIELD_NUMBER = 1;
    private long timestamp_;
    /**
     * <code>int64 timestamp = 1;</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int LOC_FIELD_NUMBER = 2;
    private SensorOuterClass.LOCATION loc_;
    /**
     * <code>.LOCATION loc = 2;</code>
     * @return Whether the loc field is set.
     */
    @java.lang.Override
    public boolean hasLoc() {
      return loc_ != null;
    }
    /**
     * <code>.LOCATION loc = 2;</code>
     * @return The loc.
     */
    @java.lang.Override
    public SensorOuterClass.LOCATION getLoc() {
      return loc_ == null ? SensorOuterClass.LOCATION.getDefaultInstance() : loc_;
    }
    /**
     * <code>.LOCATION loc = 2;</code>
     */
    @java.lang.Override
    public SensorOuterClass.LOCATIONOrBuilder getLocOrBuilder() {
      return getLoc();
    }

    public static final int ACC_FIELD_NUMBER = 3;
    private SensorOuterClass.TYPE_ACCELEROMETER acc_;
    /**
     * <pre>
     * required 
     * </pre>
     *
     * <code>.TYPE_ACCELEROMETER acc = 3;</code>
     * @return Whether the acc field is set.
     */
    @java.lang.Override
    public boolean hasAcc() {
      return acc_ != null;
    }
    /**
     * <pre>
     * required 
     * </pre>
     *
     * <code>.TYPE_ACCELEROMETER acc = 3;</code>
     * @return The acc.
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_ACCELEROMETER getAcc() {
      return acc_ == null ? SensorOuterClass.TYPE_ACCELEROMETER.getDefaultInstance() : acc_;
    }
    /**
     * <pre>
     * required 
     * </pre>
     *
     * <code>.TYPE_ACCELEROMETER acc = 3;</code>
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_ACCELEROMETEROrBuilder getAccOrBuilder() {
      return getAcc();
    }

    public static final int ROT_FIELD_NUMBER = 4;
    private SensorOuterClass.TYPE_ROTATION_VECTOR rot_;
    /**
     * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
     * @return Whether the rot field is set.
     */
    @java.lang.Override
    public boolean hasRot() {
      return rot_ != null;
    }
    /**
     * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
     * @return The rot.
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_ROTATION_VECTOR getRot() {
      return rot_ == null ? SensorOuterClass.TYPE_ROTATION_VECTOR.getDefaultInstance() : rot_;
    }
    /**
     * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_ROTATION_VECTOROrBuilder getRotOrBuilder() {
      return getRot();
    }

    public static final int GYR_FIELD_NUMBER = 5;
    private SensorOuterClass.TYPE_GYROSCOPE gyr_;
    /**
     * <code>.TYPE_GYROSCOPE gyr = 5;</code>
     * @return Whether the gyr field is set.
     */
    @java.lang.Override
    public boolean hasGyr() {
      return gyr_ != null;
    }
    /**
     * <code>.TYPE_GYROSCOPE gyr = 5;</code>
     * @return The gyr.
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_GYROSCOPE getGyr() {
      return gyr_ == null ? SensorOuterClass.TYPE_GYROSCOPE.getDefaultInstance() : gyr_;
    }
    /**
     * <code>.TYPE_GYROSCOPE gyr = 5;</code>
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_GYROSCOPEOrBuilder getGyrOrBuilder() {
      return getGyr();
    }

    public static final int LIN_FIELD_NUMBER = 6;
    private SensorOuterClass.TYPE_LINEAR_ACCELERATION lin_;
    /**
     * <pre>
     * optional 
     * </pre>
     *
     * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
     * @return Whether the lin field is set.
     */
    @java.lang.Override
    public boolean hasLin() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * optional 
     * </pre>
     *
     * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
     * @return The lin.
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_LINEAR_ACCELERATION getLin() {
      return lin_ == null ? SensorOuterClass.TYPE_LINEAR_ACCELERATION.getDefaultInstance() : lin_;
    }
    /**
     * <pre>
     * optional 
     * </pre>
     *
     * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_LINEAR_ACCELERATIONOrBuilder getLinOrBuilder() {
      return lin_ == null ? SensorOuterClass.TYPE_LINEAR_ACCELERATION.getDefaultInstance() : lin_;
    }

    public static final int GRA_FIELD_NUMBER = 7;
    private SensorOuterClass.TYPE_GRAVITY gra_;
    /**
     * <code>optional .TYPE_GRAVITY gra = 7;</code>
     * @return Whether the gra field is set.
     */
    @java.lang.Override
    public boolean hasGra() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .TYPE_GRAVITY gra = 7;</code>
     * @return The gra.
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_GRAVITY getGra() {
      return gra_ == null ? SensorOuterClass.TYPE_GRAVITY.getDefaultInstance() : gra_;
    }
    /**
     * <code>optional .TYPE_GRAVITY gra = 7;</code>
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_GRAVITYOrBuilder getGraOrBuilder() {
      return gra_ == null ? SensorOuterClass.TYPE_GRAVITY.getDefaultInstance() : gra_;
    }

    public static final int MAG_FIELD_NUMBER = 8;
    private SensorOuterClass.TYPE_MAGNETIC_FIELD mag_;
    /**
     * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
     * @return Whether the mag field is set.
     */
    @java.lang.Override
    public boolean hasMag() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
     * @return The mag.
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_MAGNETIC_FIELD getMag() {
      return mag_ == null ? SensorOuterClass.TYPE_MAGNETIC_FIELD.getDefaultInstance() : mag_;
    }
    /**
     * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_MAGNETIC_FIELDOrBuilder getMagOrBuilder() {
      return mag_ == null ? SensorOuterClass.TYPE_MAGNETIC_FIELD.getDefaultInstance() : mag_;
    }

    public static final int ORI_FIELD_NUMBER = 9;
    private SensorOuterClass.TYPE_ORIENTATION ori_;
    /**
     * <code>optional .TYPE_ORIENTATION ori = 9;</code>
     * @return Whether the ori field is set.
     */
    @java.lang.Override
    public boolean hasOri() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .TYPE_ORIENTATION ori = 9;</code>
     * @return The ori.
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_ORIENTATION getOri() {
      return ori_ == null ? SensorOuterClass.TYPE_ORIENTATION.getDefaultInstance() : ori_;
    }
    /**
     * <code>optional .TYPE_ORIENTATION ori = 9;</code>
     */
    @java.lang.Override
    public SensorOuterClass.TYPE_ORIENTATIONOrBuilder getOriOrBuilder() {
      return ori_ == null ? SensorOuterClass.TYPE_ORIENTATION.getDefaultInstance() : ori_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (timestamp_ != 0L) {
        output.writeInt64(1, timestamp_);
      }
      if (loc_ != null) {
        output.writeMessage(2, getLoc());
      }
      if (acc_ != null) {
        output.writeMessage(3, getAcc());
      }
      if (rot_ != null) {
        output.writeMessage(4, getRot());
      }
      if (gyr_ != null) {
        output.writeMessage(5, getGyr());
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(6, getLin());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeMessage(7, getGra());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeMessage(8, getMag());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(9, getOri());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, timestamp_);
      }
      if (loc_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLoc());
      }
      if (acc_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getAcc());
      }
      if (rot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getRot());
      }
      if (gyr_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, getGyr());
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, getLin());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getGra());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, getMag());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getOri());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.Sensor)) {
        return super.equals(obj);
      }
      SensorOuterClass.Sensor other = (SensorOuterClass.Sensor) obj;

      if (getTimestamp()
          != other.getTimestamp()) return false;
      if (hasLoc() != other.hasLoc()) return false;
      if (hasLoc()) {
        if (!getLoc()
            .equals(other.getLoc())) return false;
      }
      if (hasAcc() != other.hasAcc()) return false;
      if (hasAcc()) {
        if (!getAcc()
            .equals(other.getAcc())) return false;
      }
      if (hasRot() != other.hasRot()) return false;
      if (hasRot()) {
        if (!getRot()
            .equals(other.getRot())) return false;
      }
      if (hasGyr() != other.hasGyr()) return false;
      if (hasGyr()) {
        if (!getGyr()
            .equals(other.getGyr())) return false;
      }
      if (hasLin() != other.hasLin()) return false;
      if (hasLin()) {
        if (!getLin()
            .equals(other.getLin())) return false;
      }
      if (hasGra() != other.hasGra()) return false;
      if (hasGra()) {
        if (!getGra()
            .equals(other.getGra())) return false;
      }
      if (hasMag() != other.hasMag()) return false;
      if (hasMag()) {
        if (!getMag()
            .equals(other.getMag())) return false;
      }
      if (hasOri() != other.hasOri()) return false;
      if (hasOri()) {
        if (!getOri()
            .equals(other.getOri())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTimestamp());
      if (hasLoc()) {
        hash = (37 * hash) + LOC_FIELD_NUMBER;
        hash = (53 * hash) + getLoc().hashCode();
      }
      if (hasAcc()) {
        hash = (37 * hash) + ACC_FIELD_NUMBER;
        hash = (53 * hash) + getAcc().hashCode();
      }
      if (hasRot()) {
        hash = (37 * hash) + ROT_FIELD_NUMBER;
        hash = (53 * hash) + getRot().hashCode();
      }
      if (hasGyr()) {
        hash = (37 * hash) + GYR_FIELD_NUMBER;
        hash = (53 * hash) + getGyr().hashCode();
      }
      if (hasLin()) {
        hash = (37 * hash) + LIN_FIELD_NUMBER;
        hash = (53 * hash) + getLin().hashCode();
      }
      if (hasGra()) {
        hash = (37 * hash) + GRA_FIELD_NUMBER;
        hash = (53 * hash) + getGra().hashCode();
      }
      if (hasMag()) {
        hash = (37 * hash) + MAG_FIELD_NUMBER;
        hash = (53 * hash) + getMag().hashCode();
      }
      if (hasOri()) {
        hash = (37 * hash) + ORI_FIELD_NUMBER;
        hash = (53 * hash) + getOri().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.Sensor parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.Sensor parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.Sensor parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.Sensor parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.Sensor parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.Sensor parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.Sensor parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.Sensor parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.Sensor parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.Sensor parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.Sensor parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.Sensor parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.Sensor prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Sensor}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Sensor)
        SensorOuterClass.SensorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_Sensor_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_Sensor_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.Sensor.class, SensorOuterClass.Sensor.Builder.class);
      }

      // Construct using SensorOuterClass.Sensor.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getLinFieldBuilder();
          getGraFieldBuilder();
          getMagFieldBuilder();
          getOriFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        timestamp_ = 0L;

        if (locBuilder_ == null) {
          loc_ = null;
        } else {
          loc_ = null;
          locBuilder_ = null;
        }
        if (accBuilder_ == null) {
          acc_ = null;
        } else {
          acc_ = null;
          accBuilder_ = null;
        }
        if (rotBuilder_ == null) {
          rot_ = null;
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }
        if (gyrBuilder_ == null) {
          gyr_ = null;
        } else {
          gyr_ = null;
          gyrBuilder_ = null;
        }
        if (linBuilder_ == null) {
          lin_ = null;
        } else {
          linBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        if (graBuilder_ == null) {
          gra_ = null;
        } else {
          graBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        if (magBuilder_ == null) {
          mag_ = null;
        } else {
          magBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (oriBuilder_ == null) {
          ori_ = null;
        } else {
          oriBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_Sensor_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.Sensor getDefaultInstanceForType() {
        return SensorOuterClass.Sensor.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.Sensor build() {
        SensorOuterClass.Sensor result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.Sensor buildPartial() {
        SensorOuterClass.Sensor result = new SensorOuterClass.Sensor(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.timestamp_ = timestamp_;
        if (locBuilder_ == null) {
          result.loc_ = loc_;
        } else {
          result.loc_ = locBuilder_.build();
        }
        if (accBuilder_ == null) {
          result.acc_ = acc_;
        } else {
          result.acc_ = accBuilder_.build();
        }
        if (rotBuilder_ == null) {
          result.rot_ = rot_;
        } else {
          result.rot_ = rotBuilder_.build();
        }
        if (gyrBuilder_ == null) {
          result.gyr_ = gyr_;
        } else {
          result.gyr_ = gyrBuilder_.build();
        }
        if (((from_bitField0_ & 0x00000001) != 0)) {
          if (linBuilder_ == null) {
            result.lin_ = lin_;
          } else {
            result.lin_ = linBuilder_.build();
          }
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          if (graBuilder_ == null) {
            result.gra_ = gra_;
          } else {
            result.gra_ = graBuilder_.build();
          }
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          if (magBuilder_ == null) {
            result.mag_ = mag_;
          } else {
            result.mag_ = magBuilder_.build();
          }
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (oriBuilder_ == null) {
            result.ori_ = ori_;
          } else {
            result.ori_ = oriBuilder_.build();
          }
          to_bitField0_ |= 0x00000008;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.Sensor) {
          return mergeFrom((SensorOuterClass.Sensor)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.Sensor other) {
        if (other == SensorOuterClass.Sensor.getDefaultInstance()) return this;
        if (other.getTimestamp() != 0L) {
          setTimestamp(other.getTimestamp());
        }
        if (other.hasLoc()) {
          mergeLoc(other.getLoc());
        }
        if (other.hasAcc()) {
          mergeAcc(other.getAcc());
        }
        if (other.hasRot()) {
          mergeRot(other.getRot());
        }
        if (other.hasGyr()) {
          mergeGyr(other.getGyr());
        }
        if (other.hasLin()) {
          mergeLin(other.getLin());
        }
        if (other.hasGra()) {
          mergeGra(other.getGra());
        }
        if (other.hasMag()) {
          mergeMag(other.getMag());
        }
        if (other.hasOri()) {
          mergeOri(other.getOri());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.Sensor parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.Sensor) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long timestamp_ ;
      /**
       * <code>int64 timestamp = 1;</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {
        
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 timestamp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private SensorOuterClass.LOCATION loc_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.LOCATION, SensorOuterClass.LOCATION.Builder, SensorOuterClass.LOCATIONOrBuilder> locBuilder_;
      /**
       * <code>.LOCATION loc = 2;</code>
       * @return Whether the loc field is set.
       */
      public boolean hasLoc() {
        return locBuilder_ != null || loc_ != null;
      }
      /**
       * <code>.LOCATION loc = 2;</code>
       * @return The loc.
       */
      public SensorOuterClass.LOCATION getLoc() {
        if (locBuilder_ == null) {
          return loc_ == null ? SensorOuterClass.LOCATION.getDefaultInstance() : loc_;
        } else {
          return locBuilder_.getMessage();
        }
      }
      /**
       * <code>.LOCATION loc = 2;</code>
       */
      public Builder setLoc(SensorOuterClass.LOCATION value) {
        if (locBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          loc_ = value;
          onChanged();
        } else {
          locBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.LOCATION loc = 2;</code>
       */
      public Builder setLoc(
          SensorOuterClass.LOCATION.Builder builderForValue) {
        if (locBuilder_ == null) {
          loc_ = builderForValue.build();
          onChanged();
        } else {
          locBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.LOCATION loc = 2;</code>
       */
      public Builder mergeLoc(SensorOuterClass.LOCATION value) {
        if (locBuilder_ == null) {
          if (loc_ != null) {
            loc_ =
              SensorOuterClass.LOCATION.newBuilder(loc_).mergeFrom(value).buildPartial();
          } else {
            loc_ = value;
          }
          onChanged();
        } else {
          locBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.LOCATION loc = 2;</code>
       */
      public Builder clearLoc() {
        if (locBuilder_ == null) {
          loc_ = null;
          onChanged();
        } else {
          loc_ = null;
          locBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.LOCATION loc = 2;</code>
       */
      public SensorOuterClass.LOCATION.Builder getLocBuilder() {
        
        onChanged();
        return getLocFieldBuilder().getBuilder();
      }
      /**
       * <code>.LOCATION loc = 2;</code>
       */
      public SensorOuterClass.LOCATIONOrBuilder getLocOrBuilder() {
        if (locBuilder_ != null) {
          return locBuilder_.getMessageOrBuilder();
        } else {
          return loc_ == null ?
              SensorOuterClass.LOCATION.getDefaultInstance() : loc_;
        }
      }
      /**
       * <code>.LOCATION loc = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.LOCATION, SensorOuterClass.LOCATION.Builder, SensorOuterClass.LOCATIONOrBuilder> 
          getLocFieldBuilder() {
        if (locBuilder_ == null) {
          locBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SensorOuterClass.LOCATION, SensorOuterClass.LOCATION.Builder, SensorOuterClass.LOCATIONOrBuilder>(
                  getLoc(),
                  getParentForChildren(),
                  isClean());
          loc_ = null;
        }
        return locBuilder_;
      }

      private SensorOuterClass.TYPE_ACCELEROMETER acc_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_ACCELEROMETER, SensorOuterClass.TYPE_ACCELEROMETER.Builder, SensorOuterClass.TYPE_ACCELEROMETEROrBuilder> accBuilder_;
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       * @return Whether the acc field is set.
       */
      public boolean hasAcc() {
        return accBuilder_ != null || acc_ != null;
      }
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       * @return The acc.
       */
      public SensorOuterClass.TYPE_ACCELEROMETER getAcc() {
        if (accBuilder_ == null) {
          return acc_ == null ? SensorOuterClass.TYPE_ACCELEROMETER.getDefaultInstance() : acc_;
        } else {
          return accBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       */
      public Builder setAcc(SensorOuterClass.TYPE_ACCELEROMETER value) {
        if (accBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          acc_ = value;
          onChanged();
        } else {
          accBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       */
      public Builder setAcc(
          SensorOuterClass.TYPE_ACCELEROMETER.Builder builderForValue) {
        if (accBuilder_ == null) {
          acc_ = builderForValue.build();
          onChanged();
        } else {
          accBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       */
      public Builder mergeAcc(SensorOuterClass.TYPE_ACCELEROMETER value) {
        if (accBuilder_ == null) {
          if (acc_ != null) {
            acc_ =
              SensorOuterClass.TYPE_ACCELEROMETER.newBuilder(acc_).mergeFrom(value).buildPartial();
          } else {
            acc_ = value;
          }
          onChanged();
        } else {
          accBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       */
      public Builder clearAcc() {
        if (accBuilder_ == null) {
          acc_ = null;
          onChanged();
        } else {
          acc_ = null;
          accBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       */
      public SensorOuterClass.TYPE_ACCELEROMETER.Builder getAccBuilder() {
        
        onChanged();
        return getAccFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       */
      public SensorOuterClass.TYPE_ACCELEROMETEROrBuilder getAccOrBuilder() {
        if (accBuilder_ != null) {
          return accBuilder_.getMessageOrBuilder();
        } else {
          return acc_ == null ?
              SensorOuterClass.TYPE_ACCELEROMETER.getDefaultInstance() : acc_;
        }
      }
      /**
       * <pre>
       * required 
       * </pre>
       *
       * <code>.TYPE_ACCELEROMETER acc = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_ACCELEROMETER, SensorOuterClass.TYPE_ACCELEROMETER.Builder, SensorOuterClass.TYPE_ACCELEROMETEROrBuilder> 
          getAccFieldBuilder() {
        if (accBuilder_ == null) {
          accBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SensorOuterClass.TYPE_ACCELEROMETER, SensorOuterClass.TYPE_ACCELEROMETER.Builder, SensorOuterClass.TYPE_ACCELEROMETEROrBuilder>(
                  getAcc(),
                  getParentForChildren(),
                  isClean());
          acc_ = null;
        }
        return accBuilder_;
      }

      private SensorOuterClass.TYPE_ROTATION_VECTOR rot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_ROTATION_VECTOR, SensorOuterClass.TYPE_ROTATION_VECTOR.Builder, SensorOuterClass.TYPE_ROTATION_VECTOROrBuilder> rotBuilder_;
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       * @return Whether the rot field is set.
       */
      public boolean hasRot() {
        return rotBuilder_ != null || rot_ != null;
      }
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       * @return The rot.
       */
      public SensorOuterClass.TYPE_ROTATION_VECTOR getRot() {
        if (rotBuilder_ == null) {
          return rot_ == null ? SensorOuterClass.TYPE_ROTATION_VECTOR.getDefaultInstance() : rot_;
        } else {
          return rotBuilder_.getMessage();
        }
      }
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       */
      public Builder setRot(SensorOuterClass.TYPE_ROTATION_VECTOR value) {
        if (rotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          rot_ = value;
          onChanged();
        } else {
          rotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       */
      public Builder setRot(
          SensorOuterClass.TYPE_ROTATION_VECTOR.Builder builderForValue) {
        if (rotBuilder_ == null) {
          rot_ = builderForValue.build();
          onChanged();
        } else {
          rotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       */
      public Builder mergeRot(SensorOuterClass.TYPE_ROTATION_VECTOR value) {
        if (rotBuilder_ == null) {
          if (rot_ != null) {
            rot_ =
              SensorOuterClass.TYPE_ROTATION_VECTOR.newBuilder(rot_).mergeFrom(value).buildPartial();
          } else {
            rot_ = value;
          }
          onChanged();
        } else {
          rotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       */
      public Builder clearRot() {
        if (rotBuilder_ == null) {
          rot_ = null;
          onChanged();
        } else {
          rot_ = null;
          rotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       */
      public SensorOuterClass.TYPE_ROTATION_VECTOR.Builder getRotBuilder() {
        
        onChanged();
        return getRotFieldBuilder().getBuilder();
      }
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       */
      public SensorOuterClass.TYPE_ROTATION_VECTOROrBuilder getRotOrBuilder() {
        if (rotBuilder_ != null) {
          return rotBuilder_.getMessageOrBuilder();
        } else {
          return rot_ == null ?
              SensorOuterClass.TYPE_ROTATION_VECTOR.getDefaultInstance() : rot_;
        }
      }
      /**
       * <code>.TYPE_ROTATION_VECTOR rot = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_ROTATION_VECTOR, SensorOuterClass.TYPE_ROTATION_VECTOR.Builder, SensorOuterClass.TYPE_ROTATION_VECTOROrBuilder> 
          getRotFieldBuilder() {
        if (rotBuilder_ == null) {
          rotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SensorOuterClass.TYPE_ROTATION_VECTOR, SensorOuterClass.TYPE_ROTATION_VECTOR.Builder, SensorOuterClass.TYPE_ROTATION_VECTOROrBuilder>(
                  getRot(),
                  getParentForChildren(),
                  isClean());
          rot_ = null;
        }
        return rotBuilder_;
      }

      private SensorOuterClass.TYPE_GYROSCOPE gyr_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_GYROSCOPE, SensorOuterClass.TYPE_GYROSCOPE.Builder, SensorOuterClass.TYPE_GYROSCOPEOrBuilder> gyrBuilder_;
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       * @return Whether the gyr field is set.
       */
      public boolean hasGyr() {
        return gyrBuilder_ != null || gyr_ != null;
      }
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       * @return The gyr.
       */
      public SensorOuterClass.TYPE_GYROSCOPE getGyr() {
        if (gyrBuilder_ == null) {
          return gyr_ == null ? SensorOuterClass.TYPE_GYROSCOPE.getDefaultInstance() : gyr_;
        } else {
          return gyrBuilder_.getMessage();
        }
      }
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       */
      public Builder setGyr(SensorOuterClass.TYPE_GYROSCOPE value) {
        if (gyrBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          gyr_ = value;
          onChanged();
        } else {
          gyrBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       */
      public Builder setGyr(
          SensorOuterClass.TYPE_GYROSCOPE.Builder builderForValue) {
        if (gyrBuilder_ == null) {
          gyr_ = builderForValue.build();
          onChanged();
        } else {
          gyrBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       */
      public Builder mergeGyr(SensorOuterClass.TYPE_GYROSCOPE value) {
        if (gyrBuilder_ == null) {
          if (gyr_ != null) {
            gyr_ =
              SensorOuterClass.TYPE_GYROSCOPE.newBuilder(gyr_).mergeFrom(value).buildPartial();
          } else {
            gyr_ = value;
          }
          onChanged();
        } else {
          gyrBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       */
      public Builder clearGyr() {
        if (gyrBuilder_ == null) {
          gyr_ = null;
          onChanged();
        } else {
          gyr_ = null;
          gyrBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       */
      public SensorOuterClass.TYPE_GYROSCOPE.Builder getGyrBuilder() {
        
        onChanged();
        return getGyrFieldBuilder().getBuilder();
      }
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       */
      public SensorOuterClass.TYPE_GYROSCOPEOrBuilder getGyrOrBuilder() {
        if (gyrBuilder_ != null) {
          return gyrBuilder_.getMessageOrBuilder();
        } else {
          return gyr_ == null ?
              SensorOuterClass.TYPE_GYROSCOPE.getDefaultInstance() : gyr_;
        }
      }
      /**
       * <code>.TYPE_GYROSCOPE gyr = 5;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_GYROSCOPE, SensorOuterClass.TYPE_GYROSCOPE.Builder, SensorOuterClass.TYPE_GYROSCOPEOrBuilder> 
          getGyrFieldBuilder() {
        if (gyrBuilder_ == null) {
          gyrBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SensorOuterClass.TYPE_GYROSCOPE, SensorOuterClass.TYPE_GYROSCOPE.Builder, SensorOuterClass.TYPE_GYROSCOPEOrBuilder>(
                  getGyr(),
                  getParentForChildren(),
                  isClean());
          gyr_ = null;
        }
        return gyrBuilder_;
      }

      private SensorOuterClass.TYPE_LINEAR_ACCELERATION lin_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_LINEAR_ACCELERATION, SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder, SensorOuterClass.TYPE_LINEAR_ACCELERATIONOrBuilder> linBuilder_;
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       * @return Whether the lin field is set.
       */
      public boolean hasLin() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       * @return The lin.
       */
      public SensorOuterClass.TYPE_LINEAR_ACCELERATION getLin() {
        if (linBuilder_ == null) {
          return lin_ == null ? SensorOuterClass.TYPE_LINEAR_ACCELERATION.getDefaultInstance() : lin_;
        } else {
          return linBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       */
      public Builder setLin(SensorOuterClass.TYPE_LINEAR_ACCELERATION value) {
        if (linBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lin_ = value;
          onChanged();
        } else {
          linBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       */
      public Builder setLin(
          SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder builderForValue) {
        if (linBuilder_ == null) {
          lin_ = builderForValue.build();
          onChanged();
        } else {
          linBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       */
      public Builder mergeLin(SensorOuterClass.TYPE_LINEAR_ACCELERATION value) {
        if (linBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
              lin_ != null &&
              lin_ != SensorOuterClass.TYPE_LINEAR_ACCELERATION.getDefaultInstance()) {
            lin_ =
              SensorOuterClass.TYPE_LINEAR_ACCELERATION.newBuilder(lin_).mergeFrom(value).buildPartial();
          } else {
            lin_ = value;
          }
          onChanged();
        } else {
          linBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000001;
        return this;
      }
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       */
      public Builder clearLin() {
        if (linBuilder_ == null) {
          lin_ = null;
          onChanged();
        } else {
          linBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       */
      public SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder getLinBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getLinFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       */
      public SensorOuterClass.TYPE_LINEAR_ACCELERATIONOrBuilder getLinOrBuilder() {
        if (linBuilder_ != null) {
          return linBuilder_.getMessageOrBuilder();
        } else {
          return lin_ == null ?
              SensorOuterClass.TYPE_LINEAR_ACCELERATION.getDefaultInstance() : lin_;
        }
      }
      /**
       * <pre>
       * optional 
       * </pre>
       *
       * <code>optional .TYPE_LINEAR_ACCELERATION lin = 6;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_LINEAR_ACCELERATION, SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder, SensorOuterClass.TYPE_LINEAR_ACCELERATIONOrBuilder> 
          getLinFieldBuilder() {
        if (linBuilder_ == null) {
          linBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SensorOuterClass.TYPE_LINEAR_ACCELERATION, SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder, SensorOuterClass.TYPE_LINEAR_ACCELERATIONOrBuilder>(
                  getLin(),
                  getParentForChildren(),
                  isClean());
          lin_ = null;
        }
        return linBuilder_;
      }

      private SensorOuterClass.TYPE_GRAVITY gra_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_GRAVITY, SensorOuterClass.TYPE_GRAVITY.Builder, SensorOuterClass.TYPE_GRAVITYOrBuilder> graBuilder_;
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       * @return Whether the gra field is set.
       */
      public boolean hasGra() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       * @return The gra.
       */
      public SensorOuterClass.TYPE_GRAVITY getGra() {
        if (graBuilder_ == null) {
          return gra_ == null ? SensorOuterClass.TYPE_GRAVITY.getDefaultInstance() : gra_;
        } else {
          return graBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       */
      public Builder setGra(SensorOuterClass.TYPE_GRAVITY value) {
        if (graBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          gra_ = value;
          onChanged();
        } else {
          graBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       */
      public Builder setGra(
          SensorOuterClass.TYPE_GRAVITY.Builder builderForValue) {
        if (graBuilder_ == null) {
          gra_ = builderForValue.build();
          onChanged();
        } else {
          graBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       */
      public Builder mergeGra(SensorOuterClass.TYPE_GRAVITY value) {
        if (graBuilder_ == null) {
          if (((bitField0_ & 0x00000002) != 0) &&
              gra_ != null &&
              gra_ != SensorOuterClass.TYPE_GRAVITY.getDefaultInstance()) {
            gra_ =
              SensorOuterClass.TYPE_GRAVITY.newBuilder(gra_).mergeFrom(value).buildPartial();
          } else {
            gra_ = value;
          }
          onChanged();
        } else {
          graBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       */
      public Builder clearGra() {
        if (graBuilder_ == null) {
          gra_ = null;
          onChanged();
        } else {
          graBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       */
      public SensorOuterClass.TYPE_GRAVITY.Builder getGraBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getGraFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       */
      public SensorOuterClass.TYPE_GRAVITYOrBuilder getGraOrBuilder() {
        if (graBuilder_ != null) {
          return graBuilder_.getMessageOrBuilder();
        } else {
          return gra_ == null ?
              SensorOuterClass.TYPE_GRAVITY.getDefaultInstance() : gra_;
        }
      }
      /**
       * <code>optional .TYPE_GRAVITY gra = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_GRAVITY, SensorOuterClass.TYPE_GRAVITY.Builder, SensorOuterClass.TYPE_GRAVITYOrBuilder> 
          getGraFieldBuilder() {
        if (graBuilder_ == null) {
          graBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SensorOuterClass.TYPE_GRAVITY, SensorOuterClass.TYPE_GRAVITY.Builder, SensorOuterClass.TYPE_GRAVITYOrBuilder>(
                  getGra(),
                  getParentForChildren(),
                  isClean());
          gra_ = null;
        }
        return graBuilder_;
      }

      private SensorOuterClass.TYPE_MAGNETIC_FIELD mag_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_MAGNETIC_FIELD, SensorOuterClass.TYPE_MAGNETIC_FIELD.Builder, SensorOuterClass.TYPE_MAGNETIC_FIELDOrBuilder> magBuilder_;
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       * @return Whether the mag field is set.
       */
      public boolean hasMag() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       * @return The mag.
       */
      public SensorOuterClass.TYPE_MAGNETIC_FIELD getMag() {
        if (magBuilder_ == null) {
          return mag_ == null ? SensorOuterClass.TYPE_MAGNETIC_FIELD.getDefaultInstance() : mag_;
        } else {
          return magBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       */
      public Builder setMag(SensorOuterClass.TYPE_MAGNETIC_FIELD value) {
        if (magBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          mag_ = value;
          onChanged();
        } else {
          magBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       */
      public Builder setMag(
          SensorOuterClass.TYPE_MAGNETIC_FIELD.Builder builderForValue) {
        if (magBuilder_ == null) {
          mag_ = builderForValue.build();
          onChanged();
        } else {
          magBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       */
      public Builder mergeMag(SensorOuterClass.TYPE_MAGNETIC_FIELD value) {
        if (magBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0) &&
              mag_ != null &&
              mag_ != SensorOuterClass.TYPE_MAGNETIC_FIELD.getDefaultInstance()) {
            mag_ =
              SensorOuterClass.TYPE_MAGNETIC_FIELD.newBuilder(mag_).mergeFrom(value).buildPartial();
          } else {
            mag_ = value;
          }
          onChanged();
        } else {
          magBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000004;
        return this;
      }
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       */
      public Builder clearMag() {
        if (magBuilder_ == null) {
          mag_ = null;
          onChanged();
        } else {
          magBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       */
      public SensorOuterClass.TYPE_MAGNETIC_FIELD.Builder getMagBuilder() {
        bitField0_ |= 0x00000004;
        onChanged();
        return getMagFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       */
      public SensorOuterClass.TYPE_MAGNETIC_FIELDOrBuilder getMagOrBuilder() {
        if (magBuilder_ != null) {
          return magBuilder_.getMessageOrBuilder();
        } else {
          return mag_ == null ?
              SensorOuterClass.TYPE_MAGNETIC_FIELD.getDefaultInstance() : mag_;
        }
      }
      /**
       * <code>optional .TYPE_MAGNETIC_FIELD mag = 8;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_MAGNETIC_FIELD, SensorOuterClass.TYPE_MAGNETIC_FIELD.Builder, SensorOuterClass.TYPE_MAGNETIC_FIELDOrBuilder> 
          getMagFieldBuilder() {
        if (magBuilder_ == null) {
          magBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SensorOuterClass.TYPE_MAGNETIC_FIELD, SensorOuterClass.TYPE_MAGNETIC_FIELD.Builder, SensorOuterClass.TYPE_MAGNETIC_FIELDOrBuilder>(
                  getMag(),
                  getParentForChildren(),
                  isClean());
          mag_ = null;
        }
        return magBuilder_;
      }

      private SensorOuterClass.TYPE_ORIENTATION ori_;
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_ORIENTATION, SensorOuterClass.TYPE_ORIENTATION.Builder, SensorOuterClass.TYPE_ORIENTATIONOrBuilder> oriBuilder_;
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       * @return Whether the ori field is set.
       */
      public boolean hasOri() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       * @return The ori.
       */
      public SensorOuterClass.TYPE_ORIENTATION getOri() {
        if (oriBuilder_ == null) {
          return ori_ == null ? SensorOuterClass.TYPE_ORIENTATION.getDefaultInstance() : ori_;
        } else {
          return oriBuilder_.getMessage();
        }
      }
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       */
      public Builder setOri(SensorOuterClass.TYPE_ORIENTATION value) {
        if (oriBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ori_ = value;
          onChanged();
        } else {
          oriBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       */
      public Builder setOri(
          SensorOuterClass.TYPE_ORIENTATION.Builder builderForValue) {
        if (oriBuilder_ == null) {
          ori_ = builderForValue.build();
          onChanged();
        } else {
          oriBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       */
      public Builder mergeOri(SensorOuterClass.TYPE_ORIENTATION value) {
        if (oriBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
              ori_ != null &&
              ori_ != SensorOuterClass.TYPE_ORIENTATION.getDefaultInstance()) {
            ori_ =
              SensorOuterClass.TYPE_ORIENTATION.newBuilder(ori_).mergeFrom(value).buildPartial();
          } else {
            ori_ = value;
          }
          onChanged();
        } else {
          oriBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       */
      public Builder clearOri() {
        if (oriBuilder_ == null) {
          ori_ = null;
          onChanged();
        } else {
          oriBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       */
      public SensorOuterClass.TYPE_ORIENTATION.Builder getOriBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getOriFieldBuilder().getBuilder();
      }
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       */
      public SensorOuterClass.TYPE_ORIENTATIONOrBuilder getOriOrBuilder() {
        if (oriBuilder_ != null) {
          return oriBuilder_.getMessageOrBuilder();
        } else {
          return ori_ == null ?
              SensorOuterClass.TYPE_ORIENTATION.getDefaultInstance() : ori_;
        }
      }
      /**
       * <code>optional .TYPE_ORIENTATION ori = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          SensorOuterClass.TYPE_ORIENTATION, SensorOuterClass.TYPE_ORIENTATION.Builder, SensorOuterClass.TYPE_ORIENTATIONOrBuilder> 
          getOriFieldBuilder() {
        if (oriBuilder_ == null) {
          oriBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              SensorOuterClass.TYPE_ORIENTATION, SensorOuterClass.TYPE_ORIENTATION.Builder, SensorOuterClass.TYPE_ORIENTATIONOrBuilder>(
                  getOri(),
                  getParentForChildren(),
                  isClean());
          ori_ = null;
        }
        return oriBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Sensor)
    }

    // @@protoc_insertion_point(class_scope:Sensor)
    private static final SensorOuterClass.Sensor DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.Sensor();
    }

    public static SensorOuterClass.Sensor getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Sensor>
        PARSER = new com.google.protobuf.AbstractParser<Sensor>() {
      @java.lang.Override
      public Sensor parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Sensor(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Sensor> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Sensor> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.Sensor getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TripOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Trip)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int64 startingTimestamp = 1;</code>
     * @return The startingTimestamp.
     */
    long getStartingTimestamp();

    /**
     * <code>int64 endingTimestamp = 2;</code>
     * @return The endingTimestamp.
     */
    long getEndingTimestamp();

    /**
     * <code>string deviceId = 3;</code>
     * @return The deviceId.
     */
    java.lang.String getDeviceId();
    /**
     * <code>string deviceId = 3;</code>
     * @return The bytes for deviceId.
     */
    com.google.protobuf.ByteString
        getDeviceIdBytes();

    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    java.util.List<SensorOuterClass.Sensor> 
        getSensorSetList();
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    SensorOuterClass.Sensor getSensorSet(int index);
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    int getSensorSetCount();
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    java.util.List<? extends SensorOuterClass.SensorOrBuilder> 
        getSensorSetOrBuilderList();
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    SensorOuterClass.SensorOrBuilder getSensorSetOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Trip}
   */
  public static final class Trip extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Trip)
      TripOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Trip.newBuilder() to construct.
    private Trip(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Trip() {
      deviceId_ = "";
      sensorSet_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Trip();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Trip(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              startingTimestamp_ = input.readInt64();
              break;
            }
            case 16: {

              endingTimestamp_ = input.readInt64();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              deviceId_ = s;
              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                sensorSet_ = new java.util.ArrayList<SensorOuterClass.Sensor>();
                mutable_bitField0_ |= 0x00000001;
              }
              sensorSet_.add(
                  input.readMessage(SensorOuterClass.Sensor.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          sensorSet_ = java.util.Collections.unmodifiableList(sensorSet_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_Trip_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_Trip_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.Trip.class, SensorOuterClass.Trip.Builder.class);
    }

    public static final int STARTINGTIMESTAMP_FIELD_NUMBER = 1;
    private long startingTimestamp_;
    /**
     * <code>int64 startingTimestamp = 1;</code>
     * @return The startingTimestamp.
     */
    @java.lang.Override
    public long getStartingTimestamp() {
      return startingTimestamp_;
    }

    public static final int ENDINGTIMESTAMP_FIELD_NUMBER = 2;
    private long endingTimestamp_;
    /**
     * <code>int64 endingTimestamp = 2;</code>
     * @return The endingTimestamp.
     */
    @java.lang.Override
    public long getEndingTimestamp() {
      return endingTimestamp_;
    }

    public static final int DEVICEID_FIELD_NUMBER = 3;
    private volatile java.lang.Object deviceId_;
    /**
     * <code>string deviceId = 3;</code>
     * @return The deviceId.
     */
    @java.lang.Override
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceId_ = s;
        return s;
      }
    }
    /**
     * <code>string deviceId = 3;</code>
     * @return The bytes for deviceId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SENSORSET_FIELD_NUMBER = 4;
    private java.util.List<SensorOuterClass.Sensor> sensorSet_;
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    @java.lang.Override
    public java.util.List<SensorOuterClass.Sensor> getSensorSetList() {
      return sensorSet_;
    }
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends SensorOuterClass.SensorOrBuilder> 
        getSensorSetOrBuilderList() {
      return sensorSet_;
    }
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    @java.lang.Override
    public int getSensorSetCount() {
      return sensorSet_.size();
    }
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    @java.lang.Override
    public SensorOuterClass.Sensor getSensorSet(int index) {
      return sensorSet_.get(index);
    }
    /**
     * <code>repeated .Sensor SensorSet = 4;</code>
     */
    @java.lang.Override
    public SensorOuterClass.SensorOrBuilder getSensorSetOrBuilder(
        int index) {
      return sensorSet_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (startingTimestamp_ != 0L) {
        output.writeInt64(1, startingTimestamp_);
      }
      if (endingTimestamp_ != 0L) {
        output.writeInt64(2, endingTimestamp_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deviceId_);
      }
      for (int i = 0; i < sensorSet_.size(); i++) {
        output.writeMessage(4, sensorSet_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (startingTimestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, startingTimestamp_);
      }
      if (endingTimestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, endingTimestamp_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deviceId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deviceId_);
      }
      for (int i = 0; i < sensorSet_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, sensorSet_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.Trip)) {
        return super.equals(obj);
      }
      SensorOuterClass.Trip other = (SensorOuterClass.Trip) obj;

      if (getStartingTimestamp()
          != other.getStartingTimestamp()) return false;
      if (getEndingTimestamp()
          != other.getEndingTimestamp()) return false;
      if (!getDeviceId()
          .equals(other.getDeviceId())) return false;
      if (!getSensorSetList()
          .equals(other.getSensorSetList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + STARTINGTIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getStartingTimestamp());
      hash = (37 * hash) + ENDINGTIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getEndingTimestamp());
      hash = (37 * hash) + DEVICEID_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceId().hashCode();
      if (getSensorSetCount() > 0) {
        hash = (37 * hash) + SENSORSET_FIELD_NUMBER;
        hash = (53 * hash) + getSensorSetList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.Trip parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.Trip parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.Trip parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.Trip parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.Trip parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.Trip parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.Trip parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.Trip parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.Trip parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.Trip parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.Trip parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.Trip parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.Trip prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Trip}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Trip)
        SensorOuterClass.TripOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_Trip_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_Trip_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.Trip.class, SensorOuterClass.Trip.Builder.class);
      }

      // Construct using SensorOuterClass.Trip.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getSensorSetFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        startingTimestamp_ = 0L;

        endingTimestamp_ = 0L;

        deviceId_ = "";

        if (sensorSetBuilder_ == null) {
          sensorSet_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          sensorSetBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_Trip_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.Trip getDefaultInstanceForType() {
        return SensorOuterClass.Trip.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.Trip build() {
        SensorOuterClass.Trip result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.Trip buildPartial() {
        SensorOuterClass.Trip result = new SensorOuterClass.Trip(this);
        int from_bitField0_ = bitField0_;
        result.startingTimestamp_ = startingTimestamp_;
        result.endingTimestamp_ = endingTimestamp_;
        result.deviceId_ = deviceId_;
        if (sensorSetBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            sensorSet_ = java.util.Collections.unmodifiableList(sensorSet_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.sensorSet_ = sensorSet_;
        } else {
          result.sensorSet_ = sensorSetBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.Trip) {
          return mergeFrom((SensorOuterClass.Trip)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.Trip other) {
        if (other == SensorOuterClass.Trip.getDefaultInstance()) return this;
        if (other.getStartingTimestamp() != 0L) {
          setStartingTimestamp(other.getStartingTimestamp());
        }
        if (other.getEndingTimestamp() != 0L) {
          setEndingTimestamp(other.getEndingTimestamp());
        }
        if (!other.getDeviceId().isEmpty()) {
          deviceId_ = other.deviceId_;
          onChanged();
        }
        if (sensorSetBuilder_ == null) {
          if (!other.sensorSet_.isEmpty()) {
            if (sensorSet_.isEmpty()) {
              sensorSet_ = other.sensorSet_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureSensorSetIsMutable();
              sensorSet_.addAll(other.sensorSet_);
            }
            onChanged();
          }
        } else {
          if (!other.sensorSet_.isEmpty()) {
            if (sensorSetBuilder_.isEmpty()) {
              sensorSetBuilder_.dispose();
              sensorSetBuilder_ = null;
              sensorSet_ = other.sensorSet_;
              bitField0_ = (bitField0_ & ~0x00000001);
              sensorSetBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getSensorSetFieldBuilder() : null;
            } else {
              sensorSetBuilder_.addAllMessages(other.sensorSet_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.Trip parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.Trip) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long startingTimestamp_ ;
      /**
       * <code>int64 startingTimestamp = 1;</code>
       * @return The startingTimestamp.
       */
      @java.lang.Override
      public long getStartingTimestamp() {
        return startingTimestamp_;
      }
      /**
       * <code>int64 startingTimestamp = 1;</code>
       * @param value The startingTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setStartingTimestamp(long value) {
        
        startingTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 startingTimestamp = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartingTimestamp() {
        
        startingTimestamp_ = 0L;
        onChanged();
        return this;
      }

      private long endingTimestamp_ ;
      /**
       * <code>int64 endingTimestamp = 2;</code>
       * @return The endingTimestamp.
       */
      @java.lang.Override
      public long getEndingTimestamp() {
        return endingTimestamp_;
      }
      /**
       * <code>int64 endingTimestamp = 2;</code>
       * @param value The endingTimestamp to set.
       * @return This builder for chaining.
       */
      public Builder setEndingTimestamp(long value) {
        
        endingTimestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int64 endingTimestamp = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndingTimestamp() {
        
        endingTimestamp_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object deviceId_ = "";
      /**
       * <code>string deviceId = 3;</code>
       * @return The deviceId.
       */
      public java.lang.String getDeviceId() {
        java.lang.Object ref = deviceId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          deviceId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string deviceId = 3;</code>
       * @return The bytes for deviceId.
       */
      public com.google.protobuf.ByteString
          getDeviceIdBytes() {
        java.lang.Object ref = deviceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string deviceId = 3;</code>
       * @param value The deviceId to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        deviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string deviceId = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearDeviceId() {
        
        deviceId_ = getDefaultInstance().getDeviceId();
        onChanged();
        return this;
      }
      /**
       * <code>string deviceId = 3;</code>
       * @param value The bytes for deviceId to set.
       * @return This builder for chaining.
       */
      public Builder setDeviceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        deviceId_ = value;
        onChanged();
        return this;
      }

      private java.util.List<SensorOuterClass.Sensor> sensorSet_ =
        java.util.Collections.emptyList();
      private void ensureSensorSetIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          sensorSet_ = new java.util.ArrayList<SensorOuterClass.Sensor>(sensorSet_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          SensorOuterClass.Sensor, SensorOuterClass.Sensor.Builder, SensorOuterClass.SensorOrBuilder> sensorSetBuilder_;

      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public java.util.List<SensorOuterClass.Sensor> getSensorSetList() {
        if (sensorSetBuilder_ == null) {
          return java.util.Collections.unmodifiableList(sensorSet_);
        } else {
          return sensorSetBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public int getSensorSetCount() {
        if (sensorSetBuilder_ == null) {
          return sensorSet_.size();
        } else {
          return sensorSetBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public SensorOuterClass.Sensor getSensorSet(int index) {
        if (sensorSetBuilder_ == null) {
          return sensorSet_.get(index);
        } else {
          return sensorSetBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder setSensorSet(
          int index, SensorOuterClass.Sensor value) {
        if (sensorSetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSensorSetIsMutable();
          sensorSet_.set(index, value);
          onChanged();
        } else {
          sensorSetBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder setSensorSet(
          int index, SensorOuterClass.Sensor.Builder builderForValue) {
        if (sensorSetBuilder_ == null) {
          ensureSensorSetIsMutable();
          sensorSet_.set(index, builderForValue.build());
          onChanged();
        } else {
          sensorSetBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder addSensorSet(SensorOuterClass.Sensor value) {
        if (sensorSetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSensorSetIsMutable();
          sensorSet_.add(value);
          onChanged();
        } else {
          sensorSetBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder addSensorSet(
          int index, SensorOuterClass.Sensor value) {
        if (sensorSetBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureSensorSetIsMutable();
          sensorSet_.add(index, value);
          onChanged();
        } else {
          sensorSetBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder addSensorSet(
          SensorOuterClass.Sensor.Builder builderForValue) {
        if (sensorSetBuilder_ == null) {
          ensureSensorSetIsMutable();
          sensorSet_.add(builderForValue.build());
          onChanged();
        } else {
          sensorSetBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder addSensorSet(
          int index, SensorOuterClass.Sensor.Builder builderForValue) {
        if (sensorSetBuilder_ == null) {
          ensureSensorSetIsMutable();
          sensorSet_.add(index, builderForValue.build());
          onChanged();
        } else {
          sensorSetBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder addAllSensorSet(
          java.lang.Iterable<? extends SensorOuterClass.Sensor> values) {
        if (sensorSetBuilder_ == null) {
          ensureSensorSetIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, sensorSet_);
          onChanged();
        } else {
          sensorSetBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder clearSensorSet() {
        if (sensorSetBuilder_ == null) {
          sensorSet_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          sensorSetBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public Builder removeSensorSet(int index) {
        if (sensorSetBuilder_ == null) {
          ensureSensorSetIsMutable();
          sensorSet_.remove(index);
          onChanged();
        } else {
          sensorSetBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public SensorOuterClass.Sensor.Builder getSensorSetBuilder(
          int index) {
        return getSensorSetFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public SensorOuterClass.SensorOrBuilder getSensorSetOrBuilder(
          int index) {
        if (sensorSetBuilder_ == null) {
          return sensorSet_.get(index);  } else {
          return sensorSetBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public java.util.List<? extends SensorOuterClass.SensorOrBuilder> 
           getSensorSetOrBuilderList() {
        if (sensorSetBuilder_ != null) {
          return sensorSetBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(sensorSet_);
        }
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public SensorOuterClass.Sensor.Builder addSensorSetBuilder() {
        return getSensorSetFieldBuilder().addBuilder(
            SensorOuterClass.Sensor.getDefaultInstance());
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public SensorOuterClass.Sensor.Builder addSensorSetBuilder(
          int index) {
        return getSensorSetFieldBuilder().addBuilder(
            index, SensorOuterClass.Sensor.getDefaultInstance());
      }
      /**
       * <code>repeated .Sensor SensorSet = 4;</code>
       */
      public java.util.List<SensorOuterClass.Sensor.Builder> 
           getSensorSetBuilderList() {
        return getSensorSetFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          SensorOuterClass.Sensor, SensorOuterClass.Sensor.Builder, SensorOuterClass.SensorOrBuilder> 
          getSensorSetFieldBuilder() {
        if (sensorSetBuilder_ == null) {
          sensorSetBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              SensorOuterClass.Sensor, SensorOuterClass.Sensor.Builder, SensorOuterClass.SensorOrBuilder>(
                  sensorSet_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          sensorSet_ = null;
        }
        return sensorSetBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:Trip)
    }

    // @@protoc_insertion_point(class_scope:Trip)
    private static final SensorOuterClass.Trip DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.Trip();
    }

    public static SensorOuterClass.Trip getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Trip>
        PARSER = new com.google.protobuf.AbstractParser<Trip>() {
      @java.lang.Override
      public Trip parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Trip(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Trip> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Trip> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.Trip getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LOCATIONOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LOCATION)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double latitude = 1;</code>
     * @return The latitude.
     */
    double getLatitude();

    /**
     * <code>double longitude = 2;</code>
     * @return The longitude.
     */
    double getLongitude();

    /**
     * <code>double altitude = 3;</code>
     * @return The altitude.
     */
    double getAltitude();

    /**
     * <code>double speed = 4;</code>
     * @return The speed.
     */
    double getSpeed();

    /**
     * <pre>
     * time in "Sensor" class 
     * </pre>
     *
     * <code>int64 time = 5;</code>
     * @return The time.
     */
    long getTime();

    /**
     * <code>double accuracy = 6;</code>
     * @return The accuracy.
     */
    double getAccuracy();

    /**
     * <code>double verticalAccuracyMeters = 7;</code>
     * @return The verticalAccuracyMeters.
     */
    double getVerticalAccuracyMeters();

    /**
     * <code>double speedAccuracyMetersPerSecond = 8;</code>
     * @return The speedAccuracyMetersPerSecond.
     */
    double getSpeedAccuracyMetersPerSecond();

    /**
     * <code>double bearingAccuracyDegrees = 9;</code>
     * @return The bearingAccuracyDegrees.
     */
    double getBearingAccuracyDegrees();
  }
  /**
   * Protobuf type {@code LOCATION}
   */
  public static final class LOCATION extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LOCATION)
      LOCATIONOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LOCATION.newBuilder() to construct.
    private LOCATION(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LOCATION() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LOCATION();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LOCATION(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              latitude_ = input.readDouble();
              break;
            }
            case 17: {

              longitude_ = input.readDouble();
              break;
            }
            case 25: {

              altitude_ = input.readDouble();
              break;
            }
            case 33: {

              speed_ = input.readDouble();
              break;
            }
            case 40: {

              time_ = input.readInt64();
              break;
            }
            case 49: {

              accuracy_ = input.readDouble();
              break;
            }
            case 57: {

              verticalAccuracyMeters_ = input.readDouble();
              break;
            }
            case 65: {

              speedAccuracyMetersPerSecond_ = input.readDouble();
              break;
            }
            case 73: {

              bearingAccuracyDegrees_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_LOCATION_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_LOCATION_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.LOCATION.class, SensorOuterClass.LOCATION.Builder.class);
    }

    public static final int LATITUDE_FIELD_NUMBER = 1;
    private double latitude_;
    /**
     * <code>double latitude = 1;</code>
     * @return The latitude.
     */
    @java.lang.Override
    public double getLatitude() {
      return latitude_;
    }

    public static final int LONGITUDE_FIELD_NUMBER = 2;
    private double longitude_;
    /**
     * <code>double longitude = 2;</code>
     * @return The longitude.
     */
    @java.lang.Override
    public double getLongitude() {
      return longitude_;
    }

    public static final int ALTITUDE_FIELD_NUMBER = 3;
    private double altitude_;
    /**
     * <code>double altitude = 3;</code>
     * @return The altitude.
     */
    @java.lang.Override
    public double getAltitude() {
      return altitude_;
    }

    public static final int SPEED_FIELD_NUMBER = 4;
    private double speed_;
    /**
     * <code>double speed = 4;</code>
     * @return The speed.
     */
    @java.lang.Override
    public double getSpeed() {
      return speed_;
    }

    public static final int TIME_FIELD_NUMBER = 5;
    private long time_;
    /**
     * <pre>
     * time in "Sensor" class 
     * </pre>
     *
     * <code>int64 time = 5;</code>
     * @return The time.
     */
    @java.lang.Override
    public long getTime() {
      return time_;
    }

    public static final int ACCURACY_FIELD_NUMBER = 6;
    private double accuracy_;
    /**
     * <code>double accuracy = 6;</code>
     * @return The accuracy.
     */
    @java.lang.Override
    public double getAccuracy() {
      return accuracy_;
    }

    public static final int VERTICALACCURACYMETERS_FIELD_NUMBER = 7;
    private double verticalAccuracyMeters_;
    /**
     * <code>double verticalAccuracyMeters = 7;</code>
     * @return The verticalAccuracyMeters.
     */
    @java.lang.Override
    public double getVerticalAccuracyMeters() {
      return verticalAccuracyMeters_;
    }

    public static final int SPEEDACCURACYMETERSPERSECOND_FIELD_NUMBER = 8;
    private double speedAccuracyMetersPerSecond_;
    /**
     * <code>double speedAccuracyMetersPerSecond = 8;</code>
     * @return The speedAccuracyMetersPerSecond.
     */
    @java.lang.Override
    public double getSpeedAccuracyMetersPerSecond() {
      return speedAccuracyMetersPerSecond_;
    }

    public static final int BEARINGACCURACYDEGREES_FIELD_NUMBER = 9;
    private double bearingAccuracyDegrees_;
    /**
     * <code>double bearingAccuracyDegrees = 9;</code>
     * @return The bearingAccuracyDegrees.
     */
    @java.lang.Override
    public double getBearingAccuracyDegrees() {
      return bearingAccuracyDegrees_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(latitude_) != 0) {
        output.writeDouble(1, latitude_);
      }
      if (java.lang.Double.doubleToRawLongBits(longitude_) != 0) {
        output.writeDouble(2, longitude_);
      }
      if (java.lang.Double.doubleToRawLongBits(altitude_) != 0) {
        output.writeDouble(3, altitude_);
      }
      if (java.lang.Double.doubleToRawLongBits(speed_) != 0) {
        output.writeDouble(4, speed_);
      }
      if (time_ != 0L) {
        output.writeInt64(5, time_);
      }
      if (java.lang.Double.doubleToRawLongBits(accuracy_) != 0) {
        output.writeDouble(6, accuracy_);
      }
      if (java.lang.Double.doubleToRawLongBits(verticalAccuracyMeters_) != 0) {
        output.writeDouble(7, verticalAccuracyMeters_);
      }
      if (java.lang.Double.doubleToRawLongBits(speedAccuracyMetersPerSecond_) != 0) {
        output.writeDouble(8, speedAccuracyMetersPerSecond_);
      }
      if (java.lang.Double.doubleToRawLongBits(bearingAccuracyDegrees_) != 0) {
        output.writeDouble(9, bearingAccuracyDegrees_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(latitude_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, latitude_);
      }
      if (java.lang.Double.doubleToRawLongBits(longitude_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, longitude_);
      }
      if (java.lang.Double.doubleToRawLongBits(altitude_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, altitude_);
      }
      if (java.lang.Double.doubleToRawLongBits(speed_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, speed_);
      }
      if (time_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(5, time_);
      }
      if (java.lang.Double.doubleToRawLongBits(accuracy_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(6, accuracy_);
      }
      if (java.lang.Double.doubleToRawLongBits(verticalAccuracyMeters_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(7, verticalAccuracyMeters_);
      }
      if (java.lang.Double.doubleToRawLongBits(speedAccuracyMetersPerSecond_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(8, speedAccuracyMetersPerSecond_);
      }
      if (java.lang.Double.doubleToRawLongBits(bearingAccuracyDegrees_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(9, bearingAccuracyDegrees_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.LOCATION)) {
        return super.equals(obj);
      }
      SensorOuterClass.LOCATION other = (SensorOuterClass.LOCATION) obj;

      if (java.lang.Double.doubleToLongBits(getLatitude())
          != java.lang.Double.doubleToLongBits(
              other.getLatitude())) return false;
      if (java.lang.Double.doubleToLongBits(getLongitude())
          != java.lang.Double.doubleToLongBits(
              other.getLongitude())) return false;
      if (java.lang.Double.doubleToLongBits(getAltitude())
          != java.lang.Double.doubleToLongBits(
              other.getAltitude())) return false;
      if (java.lang.Double.doubleToLongBits(getSpeed())
          != java.lang.Double.doubleToLongBits(
              other.getSpeed())) return false;
      if (getTime()
          != other.getTime()) return false;
      if (java.lang.Double.doubleToLongBits(getAccuracy())
          != java.lang.Double.doubleToLongBits(
              other.getAccuracy())) return false;
      if (java.lang.Double.doubleToLongBits(getVerticalAccuracyMeters())
          != java.lang.Double.doubleToLongBits(
              other.getVerticalAccuracyMeters())) return false;
      if (java.lang.Double.doubleToLongBits(getSpeedAccuracyMetersPerSecond())
          != java.lang.Double.doubleToLongBits(
              other.getSpeedAccuracyMetersPerSecond())) return false;
      if (java.lang.Double.doubleToLongBits(getBearingAccuracyDegrees())
          != java.lang.Double.doubleToLongBits(
              other.getBearingAccuracyDegrees())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLatitude()));
      hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLongitude()));
      hash = (37 * hash) + ALTITUDE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAltitude()));
      hash = (37 * hash) + SPEED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getSpeed()));
      hash = (37 * hash) + TIME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTime());
      hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAccuracy()));
      hash = (37 * hash) + VERTICALACCURACYMETERS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getVerticalAccuracyMeters()));
      hash = (37 * hash) + SPEEDACCURACYMETERSPERSECOND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getSpeedAccuracyMetersPerSecond()));
      hash = (37 * hash) + BEARINGACCURACYDEGREES_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getBearingAccuracyDegrees()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.LOCATION parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.LOCATION parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.LOCATION parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.LOCATION parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.LOCATION parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.LOCATION parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.LOCATION parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.LOCATION parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.LOCATION parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.LOCATION parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.LOCATION parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.LOCATION parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.LOCATION prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code LOCATION}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LOCATION)
        SensorOuterClass.LOCATIONOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_LOCATION_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_LOCATION_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.LOCATION.class, SensorOuterClass.LOCATION.Builder.class);
      }

      // Construct using SensorOuterClass.LOCATION.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        latitude_ = 0D;

        longitude_ = 0D;

        altitude_ = 0D;

        speed_ = 0D;

        time_ = 0L;

        accuracy_ = 0D;

        verticalAccuracyMeters_ = 0D;

        speedAccuracyMetersPerSecond_ = 0D;

        bearingAccuracyDegrees_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_LOCATION_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.LOCATION getDefaultInstanceForType() {
        return SensorOuterClass.LOCATION.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.LOCATION build() {
        SensorOuterClass.LOCATION result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.LOCATION buildPartial() {
        SensorOuterClass.LOCATION result = new SensorOuterClass.LOCATION(this);
        result.latitude_ = latitude_;
        result.longitude_ = longitude_;
        result.altitude_ = altitude_;
        result.speed_ = speed_;
        result.time_ = time_;
        result.accuracy_ = accuracy_;
        result.verticalAccuracyMeters_ = verticalAccuracyMeters_;
        result.speedAccuracyMetersPerSecond_ = speedAccuracyMetersPerSecond_;
        result.bearingAccuracyDegrees_ = bearingAccuracyDegrees_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.LOCATION) {
          return mergeFrom((SensorOuterClass.LOCATION)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.LOCATION other) {
        if (other == SensorOuterClass.LOCATION.getDefaultInstance()) return this;
        if (other.getLatitude() != 0D) {
          setLatitude(other.getLatitude());
        }
        if (other.getLongitude() != 0D) {
          setLongitude(other.getLongitude());
        }
        if (other.getAltitude() != 0D) {
          setAltitude(other.getAltitude());
        }
        if (other.getSpeed() != 0D) {
          setSpeed(other.getSpeed());
        }
        if (other.getTime() != 0L) {
          setTime(other.getTime());
        }
        if (other.getAccuracy() != 0D) {
          setAccuracy(other.getAccuracy());
        }
        if (other.getVerticalAccuracyMeters() != 0D) {
          setVerticalAccuracyMeters(other.getVerticalAccuracyMeters());
        }
        if (other.getSpeedAccuracyMetersPerSecond() != 0D) {
          setSpeedAccuracyMetersPerSecond(other.getSpeedAccuracyMetersPerSecond());
        }
        if (other.getBearingAccuracyDegrees() != 0D) {
          setBearingAccuracyDegrees(other.getBearingAccuracyDegrees());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.LOCATION parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.LOCATION) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double latitude_ ;
      /**
       * <code>double latitude = 1;</code>
       * @return The latitude.
       */
      @java.lang.Override
      public double getLatitude() {
        return latitude_;
      }
      /**
       * <code>double latitude = 1;</code>
       * @param value The latitude to set.
       * @return This builder for chaining.
       */
      public Builder setLatitude(double value) {
        
        latitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double latitude = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLatitude() {
        
        latitude_ = 0D;
        onChanged();
        return this;
      }

      private double longitude_ ;
      /**
       * <code>double longitude = 2;</code>
       * @return The longitude.
       */
      @java.lang.Override
      public double getLongitude() {
        return longitude_;
      }
      /**
       * <code>double longitude = 2;</code>
       * @param value The longitude to set.
       * @return This builder for chaining.
       */
      public Builder setLongitude(double value) {
        
        longitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double longitude = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLongitude() {
        
        longitude_ = 0D;
        onChanged();
        return this;
      }

      private double altitude_ ;
      /**
       * <code>double altitude = 3;</code>
       * @return The altitude.
       */
      @java.lang.Override
      public double getAltitude() {
        return altitude_;
      }
      /**
       * <code>double altitude = 3;</code>
       * @param value The altitude to set.
       * @return This builder for chaining.
       */
      public Builder setAltitude(double value) {
        
        altitude_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double altitude = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAltitude() {
        
        altitude_ = 0D;
        onChanged();
        return this;
      }

      private double speed_ ;
      /**
       * <code>double speed = 4;</code>
       * @return The speed.
       */
      @java.lang.Override
      public double getSpeed() {
        return speed_;
      }
      /**
       * <code>double speed = 4;</code>
       * @param value The speed to set.
       * @return This builder for chaining.
       */
      public Builder setSpeed(double value) {
        
        speed_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double speed = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeed() {
        
        speed_ = 0D;
        onChanged();
        return this;
      }

      private long time_ ;
      /**
       * <pre>
       * time in "Sensor" class 
       * </pre>
       *
       * <code>int64 time = 5;</code>
       * @return The time.
       */
      @java.lang.Override
      public long getTime() {
        return time_;
      }
      /**
       * <pre>
       * time in "Sensor" class 
       * </pre>
       *
       * <code>int64 time = 5;</code>
       * @param value The time to set.
       * @return This builder for chaining.
       */
      public Builder setTime(long value) {
        
        time_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * time in "Sensor" class 
       * </pre>
       *
       * <code>int64 time = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearTime() {
        
        time_ = 0L;
        onChanged();
        return this;
      }

      private double accuracy_ ;
      /**
       * <code>double accuracy = 6;</code>
       * @return The accuracy.
       */
      @java.lang.Override
      public double getAccuracy() {
        return accuracy_;
      }
      /**
       * <code>double accuracy = 6;</code>
       * @param value The accuracy to set.
       * @return This builder for chaining.
       */
      public Builder setAccuracy(double value) {
        
        accuracy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double accuracy = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccuracy() {
        
        accuracy_ = 0D;
        onChanged();
        return this;
      }

      private double verticalAccuracyMeters_ ;
      /**
       * <code>double verticalAccuracyMeters = 7;</code>
       * @return The verticalAccuracyMeters.
       */
      @java.lang.Override
      public double getVerticalAccuracyMeters() {
        return verticalAccuracyMeters_;
      }
      /**
       * <code>double verticalAccuracyMeters = 7;</code>
       * @param value The verticalAccuracyMeters to set.
       * @return This builder for chaining.
       */
      public Builder setVerticalAccuracyMeters(double value) {
        
        verticalAccuracyMeters_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double verticalAccuracyMeters = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearVerticalAccuracyMeters() {
        
        verticalAccuracyMeters_ = 0D;
        onChanged();
        return this;
      }

      private double speedAccuracyMetersPerSecond_ ;
      /**
       * <code>double speedAccuracyMetersPerSecond = 8;</code>
       * @return The speedAccuracyMetersPerSecond.
       */
      @java.lang.Override
      public double getSpeedAccuracyMetersPerSecond() {
        return speedAccuracyMetersPerSecond_;
      }
      /**
       * <code>double speedAccuracyMetersPerSecond = 8;</code>
       * @param value The speedAccuracyMetersPerSecond to set.
       * @return This builder for chaining.
       */
      public Builder setSpeedAccuracyMetersPerSecond(double value) {
        
        speedAccuracyMetersPerSecond_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double speedAccuracyMetersPerSecond = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearSpeedAccuracyMetersPerSecond() {
        
        speedAccuracyMetersPerSecond_ = 0D;
        onChanged();
        return this;
      }

      private double bearingAccuracyDegrees_ ;
      /**
       * <code>double bearingAccuracyDegrees = 9;</code>
       * @return The bearingAccuracyDegrees.
       */
      @java.lang.Override
      public double getBearingAccuracyDegrees() {
        return bearingAccuracyDegrees_;
      }
      /**
       * <code>double bearingAccuracyDegrees = 9;</code>
       * @param value The bearingAccuracyDegrees to set.
       * @return This builder for chaining.
       */
      public Builder setBearingAccuracyDegrees(double value) {
        
        bearingAccuracyDegrees_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double bearingAccuracyDegrees = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearBearingAccuracyDegrees() {
        
        bearingAccuracyDegrees_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LOCATION)
    }

    // @@protoc_insertion_point(class_scope:LOCATION)
    private static final SensorOuterClass.LOCATION DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.LOCATION();
    }

    public static SensorOuterClass.LOCATION getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LOCATION>
        PARSER = new com.google.protobuf.AbstractParser<LOCATION>() {
      @java.lang.Override
      public LOCATION parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LOCATION(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LOCATION> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LOCATION> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.LOCATION getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TYPE_ACCELEROMETEROrBuilder extends
      // @@protoc_insertion_point(interface_extends:TYPE_ACCELEROMETER)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    double getX();

    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    double getY();

    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    double getZ();
  }
  /**
   * <pre>
   *All values are in SI units (m/s^2)
   *- values[0]: Acceleration minus Gx on the x-axis
   *- values[1]: Acceleration minus Gy on the y-axis
   *- values[2]: Acceleration minus Gz on the z-axis
   * </pre>
   *
   * Protobuf type {@code TYPE_ACCELEROMETER}
   */
  public static final class TYPE_ACCELEROMETER extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TYPE_ACCELEROMETER)
      TYPE_ACCELEROMETEROrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TYPE_ACCELEROMETER.newBuilder() to construct.
    private TYPE_ACCELEROMETER(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TYPE_ACCELEROMETER() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TYPE_ACCELEROMETER();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TYPE_ACCELEROMETER(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              x_ = input.readDouble();
              break;
            }
            case 17: {

              y_ = input.readDouble();
              break;
            }
            case 25: {

              z_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_TYPE_ACCELEROMETER_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_TYPE_ACCELEROMETER_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.TYPE_ACCELEROMETER.class, SensorOuterClass.TYPE_ACCELEROMETER.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public double getZ() {
      return z_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        output.writeDouble(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        output.writeDouble(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        output.writeDouble(3, z_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.TYPE_ACCELEROMETER)) {
        return super.equals(obj);
      }
      SensorOuterClass.TYPE_ACCELEROMETER other = (SensorOuterClass.TYPE_ACCELEROMETER) obj;

      if (java.lang.Double.doubleToLongBits(getX())
          != java.lang.Double.doubleToLongBits(
              other.getX())) return false;
      if (java.lang.Double.doubleToLongBits(getY())
          != java.lang.Double.doubleToLongBits(
              other.getY())) return false;
      if (java.lang.Double.doubleToLongBits(getZ())
          != java.lang.Double.doubleToLongBits(
              other.getZ())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getX()));
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getY()));
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getZ()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ACCELEROMETER parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.TYPE_ACCELEROMETER prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *All values are in SI units (m/s^2)
     *- values[0]: Acceleration minus Gx on the x-axis
     *- values[1]: Acceleration minus Gy on the y-axis
     *- values[2]: Acceleration minus Gz on the z-axis
     * </pre>
     *
     * Protobuf type {@code TYPE_ACCELEROMETER}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TYPE_ACCELEROMETER)
        SensorOuterClass.TYPE_ACCELEROMETEROrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_TYPE_ACCELEROMETER_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_TYPE_ACCELEROMETER_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.TYPE_ACCELEROMETER.class, SensorOuterClass.TYPE_ACCELEROMETER.Builder.class);
      }

      // Construct using SensorOuterClass.TYPE_ACCELEROMETER.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        x_ = 0D;

        y_ = 0D;

        z_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_TYPE_ACCELEROMETER_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ACCELEROMETER getDefaultInstanceForType() {
        return SensorOuterClass.TYPE_ACCELEROMETER.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ACCELEROMETER build() {
        SensorOuterClass.TYPE_ACCELEROMETER result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ACCELEROMETER buildPartial() {
        SensorOuterClass.TYPE_ACCELEROMETER result = new SensorOuterClass.TYPE_ACCELEROMETER(this);
        result.x_ = x_;
        result.y_ = y_;
        result.z_ = z_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.TYPE_ACCELEROMETER) {
          return mergeFrom((SensorOuterClass.TYPE_ACCELEROMETER)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.TYPE_ACCELEROMETER other) {
        if (other == SensorOuterClass.TYPE_ACCELEROMETER.getDefaultInstance()) return this;
        if (other.getX() != 0D) {
          setX(other.getX());
        }
        if (other.getY() != 0D) {
          setY(other.getY());
        }
        if (other.getZ() != 0D) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.TYPE_ACCELEROMETER parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.TYPE_ACCELEROMETER) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double x_ ;
      /**
       * <code>double x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public double getX() {
        return x_;
      }
      /**
       * <code>double x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(double value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>double y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public double getY() {
        return y_;
      }
      /**
       * <code>double y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(double value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>double z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public double getZ() {
        return z_;
      }
      /**
       * <code>double z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(double value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TYPE_ACCELEROMETER)
    }

    // @@protoc_insertion_point(class_scope:TYPE_ACCELEROMETER)
    private static final SensorOuterClass.TYPE_ACCELEROMETER DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.TYPE_ACCELEROMETER();
    }

    public static SensorOuterClass.TYPE_ACCELEROMETER getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TYPE_ACCELEROMETER>
        PARSER = new com.google.protobuf.AbstractParser<TYPE_ACCELEROMETER>() {
      @java.lang.Override
      public TYPE_ACCELEROMETER parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TYPE_ACCELEROMETER(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TYPE_ACCELEROMETER> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TYPE_ACCELEROMETER> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.TYPE_ACCELEROMETER getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TYPE_ROTATION_VECTOROrBuilder extends
      // @@protoc_insertion_point(interface_extends:TYPE_ROTATION_VECTOR)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    double getX();

    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    double getY();

    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    double getZ();

    /**
     * <code>double cos = 4;</code>
     * @return The cos.
     */
    double getCos();

    /**
     * <code>double accuracy = 5;</code>
     * @return The accuracy.
     */
    double getAccuracy();
  }
  /**
   * <pre>
   *values[0]: x*sin(θ/2)
   *values[1]: y*sin(θ/2)
   *values[2]: z*sin(θ/2)
   *values[3]: cos(θ/2)
   *values[4]: estimated heading Accuracy (in radians) (-1 if unavailable)
   * </pre>
   *
   * Protobuf type {@code TYPE_ROTATION_VECTOR}
   */
  public static final class TYPE_ROTATION_VECTOR extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TYPE_ROTATION_VECTOR)
      TYPE_ROTATION_VECTOROrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TYPE_ROTATION_VECTOR.newBuilder() to construct.
    private TYPE_ROTATION_VECTOR(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TYPE_ROTATION_VECTOR() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TYPE_ROTATION_VECTOR();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TYPE_ROTATION_VECTOR(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              x_ = input.readDouble();
              break;
            }
            case 17: {

              y_ = input.readDouble();
              break;
            }
            case 25: {

              z_ = input.readDouble();
              break;
            }
            case 33: {

              cos_ = input.readDouble();
              break;
            }
            case 41: {

              accuracy_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_TYPE_ROTATION_VECTOR_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_TYPE_ROTATION_VECTOR_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.TYPE_ROTATION_VECTOR.class, SensorOuterClass.TYPE_ROTATION_VECTOR.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public double getZ() {
      return z_;
    }

    public static final int COS_FIELD_NUMBER = 4;
    private double cos_;
    /**
     * <code>double cos = 4;</code>
     * @return The cos.
     */
    @java.lang.Override
    public double getCos() {
      return cos_;
    }

    public static final int ACCURACY_FIELD_NUMBER = 5;
    private double accuracy_;
    /**
     * <code>double accuracy = 5;</code>
     * @return The accuracy.
     */
    @java.lang.Override
    public double getAccuracy() {
      return accuracy_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        output.writeDouble(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        output.writeDouble(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        output.writeDouble(3, z_);
      }
      if (java.lang.Double.doubleToRawLongBits(cos_) != 0) {
        output.writeDouble(4, cos_);
      }
      if (java.lang.Double.doubleToRawLongBits(accuracy_) != 0) {
        output.writeDouble(5, accuracy_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
      }
      if (java.lang.Double.doubleToRawLongBits(cos_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(4, cos_);
      }
      if (java.lang.Double.doubleToRawLongBits(accuracy_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, accuracy_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.TYPE_ROTATION_VECTOR)) {
        return super.equals(obj);
      }
      SensorOuterClass.TYPE_ROTATION_VECTOR other = (SensorOuterClass.TYPE_ROTATION_VECTOR) obj;

      if (java.lang.Double.doubleToLongBits(getX())
          != java.lang.Double.doubleToLongBits(
              other.getX())) return false;
      if (java.lang.Double.doubleToLongBits(getY())
          != java.lang.Double.doubleToLongBits(
              other.getY())) return false;
      if (java.lang.Double.doubleToLongBits(getZ())
          != java.lang.Double.doubleToLongBits(
              other.getZ())) return false;
      if (java.lang.Double.doubleToLongBits(getCos())
          != java.lang.Double.doubleToLongBits(
              other.getCos())) return false;
      if (java.lang.Double.doubleToLongBits(getAccuracy())
          != java.lang.Double.doubleToLongBits(
              other.getAccuracy())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getX()));
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getY()));
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getZ()));
      hash = (37 * hash) + COS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getCos()));
      hash = (37 * hash) + ACCURACY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getAccuracy()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ROTATION_VECTOR parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.TYPE_ROTATION_VECTOR prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *values[0]: x*sin(θ/2)
     *values[1]: y*sin(θ/2)
     *values[2]: z*sin(θ/2)
     *values[3]: cos(θ/2)
     *values[4]: estimated heading Accuracy (in radians) (-1 if unavailable)
     * </pre>
     *
     * Protobuf type {@code TYPE_ROTATION_VECTOR}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TYPE_ROTATION_VECTOR)
        SensorOuterClass.TYPE_ROTATION_VECTOROrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_TYPE_ROTATION_VECTOR_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_TYPE_ROTATION_VECTOR_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.TYPE_ROTATION_VECTOR.class, SensorOuterClass.TYPE_ROTATION_VECTOR.Builder.class);
      }

      // Construct using SensorOuterClass.TYPE_ROTATION_VECTOR.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        x_ = 0D;

        y_ = 0D;

        z_ = 0D;

        cos_ = 0D;

        accuracy_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_TYPE_ROTATION_VECTOR_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ROTATION_VECTOR getDefaultInstanceForType() {
        return SensorOuterClass.TYPE_ROTATION_VECTOR.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ROTATION_VECTOR build() {
        SensorOuterClass.TYPE_ROTATION_VECTOR result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ROTATION_VECTOR buildPartial() {
        SensorOuterClass.TYPE_ROTATION_VECTOR result = new SensorOuterClass.TYPE_ROTATION_VECTOR(this);
        result.x_ = x_;
        result.y_ = y_;
        result.z_ = z_;
        result.cos_ = cos_;
        result.accuracy_ = accuracy_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.TYPE_ROTATION_VECTOR) {
          return mergeFrom((SensorOuterClass.TYPE_ROTATION_VECTOR)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.TYPE_ROTATION_VECTOR other) {
        if (other == SensorOuterClass.TYPE_ROTATION_VECTOR.getDefaultInstance()) return this;
        if (other.getX() != 0D) {
          setX(other.getX());
        }
        if (other.getY() != 0D) {
          setY(other.getY());
        }
        if (other.getZ() != 0D) {
          setZ(other.getZ());
        }
        if (other.getCos() != 0D) {
          setCos(other.getCos());
        }
        if (other.getAccuracy() != 0D) {
          setAccuracy(other.getAccuracy());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.TYPE_ROTATION_VECTOR parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.TYPE_ROTATION_VECTOR) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double x_ ;
      /**
       * <code>double x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public double getX() {
        return x_;
      }
      /**
       * <code>double x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(double value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>double y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public double getY() {
        return y_;
      }
      /**
       * <code>double y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(double value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>double z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public double getZ() {
        return z_;
      }
      /**
       * <code>double z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(double value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0D;
        onChanged();
        return this;
      }

      private double cos_ ;
      /**
       * <code>double cos = 4;</code>
       * @return The cos.
       */
      @java.lang.Override
      public double getCos() {
        return cos_;
      }
      /**
       * <code>double cos = 4;</code>
       * @param value The cos to set.
       * @return This builder for chaining.
       */
      public Builder setCos(double value) {
        
        cos_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double cos = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCos() {
        
        cos_ = 0D;
        onChanged();
        return this;
      }

      private double accuracy_ ;
      /**
       * <code>double accuracy = 5;</code>
       * @return The accuracy.
       */
      @java.lang.Override
      public double getAccuracy() {
        return accuracy_;
      }
      /**
       * <code>double accuracy = 5;</code>
       * @param value The accuracy to set.
       * @return This builder for chaining.
       */
      public Builder setAccuracy(double value) {
        
        accuracy_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double accuracy = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearAccuracy() {
        
        accuracy_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TYPE_ROTATION_VECTOR)
    }

    // @@protoc_insertion_point(class_scope:TYPE_ROTATION_VECTOR)
    private static final SensorOuterClass.TYPE_ROTATION_VECTOR DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.TYPE_ROTATION_VECTOR();
    }

    public static SensorOuterClass.TYPE_ROTATION_VECTOR getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TYPE_ROTATION_VECTOR>
        PARSER = new com.google.protobuf.AbstractParser<TYPE_ROTATION_VECTOR>() {
      @java.lang.Override
      public TYPE_ROTATION_VECTOR parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TYPE_ROTATION_VECTOR(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TYPE_ROTATION_VECTOR> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TYPE_ROTATION_VECTOR> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.TYPE_ROTATION_VECTOR getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TYPE_GYROSCOPEOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TYPE_GYROSCOPE)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    double getX();

    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    double getY();

    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    double getZ();
  }
  /**
   * <pre>
   * Differrent
   * </pre>
   *
   * Protobuf type {@code TYPE_GYROSCOPE}
   */
  public static final class TYPE_GYROSCOPE extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TYPE_GYROSCOPE)
      TYPE_GYROSCOPEOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TYPE_GYROSCOPE.newBuilder() to construct.
    private TYPE_GYROSCOPE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TYPE_GYROSCOPE() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TYPE_GYROSCOPE();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TYPE_GYROSCOPE(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              x_ = input.readDouble();
              break;
            }
            case 17: {

              y_ = input.readDouble();
              break;
            }
            case 25: {

              z_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_TYPE_GYROSCOPE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_TYPE_GYROSCOPE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.TYPE_GYROSCOPE.class, SensorOuterClass.TYPE_GYROSCOPE.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public double getZ() {
      return z_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        output.writeDouble(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        output.writeDouble(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        output.writeDouble(3, z_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.TYPE_GYROSCOPE)) {
        return super.equals(obj);
      }
      SensorOuterClass.TYPE_GYROSCOPE other = (SensorOuterClass.TYPE_GYROSCOPE) obj;

      if (java.lang.Double.doubleToLongBits(getX())
          != java.lang.Double.doubleToLongBits(
              other.getX())) return false;
      if (java.lang.Double.doubleToLongBits(getY())
          != java.lang.Double.doubleToLongBits(
              other.getY())) return false;
      if (java.lang.Double.doubleToLongBits(getZ())
          != java.lang.Double.doubleToLongBits(
              other.getZ())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getX()));
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getY()));
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getZ()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_GYROSCOPE parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.TYPE_GYROSCOPE prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Differrent
     * </pre>
     *
     * Protobuf type {@code TYPE_GYROSCOPE}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TYPE_GYROSCOPE)
        SensorOuterClass.TYPE_GYROSCOPEOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_TYPE_GYROSCOPE_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_TYPE_GYROSCOPE_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.TYPE_GYROSCOPE.class, SensorOuterClass.TYPE_GYROSCOPE.Builder.class);
      }

      // Construct using SensorOuterClass.TYPE_GYROSCOPE.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        x_ = 0D;

        y_ = 0D;

        z_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_TYPE_GYROSCOPE_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_GYROSCOPE getDefaultInstanceForType() {
        return SensorOuterClass.TYPE_GYROSCOPE.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_GYROSCOPE build() {
        SensorOuterClass.TYPE_GYROSCOPE result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_GYROSCOPE buildPartial() {
        SensorOuterClass.TYPE_GYROSCOPE result = new SensorOuterClass.TYPE_GYROSCOPE(this);
        result.x_ = x_;
        result.y_ = y_;
        result.z_ = z_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.TYPE_GYROSCOPE) {
          return mergeFrom((SensorOuterClass.TYPE_GYROSCOPE)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.TYPE_GYROSCOPE other) {
        if (other == SensorOuterClass.TYPE_GYROSCOPE.getDefaultInstance()) return this;
        if (other.getX() != 0D) {
          setX(other.getX());
        }
        if (other.getY() != 0D) {
          setY(other.getY());
        }
        if (other.getZ() != 0D) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.TYPE_GYROSCOPE parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.TYPE_GYROSCOPE) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double x_ ;
      /**
       * <code>double x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public double getX() {
        return x_;
      }
      /**
       * <code>double x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(double value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>double y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public double getY() {
        return y_;
      }
      /**
       * <code>double y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(double value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>double z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public double getZ() {
        return z_;
      }
      /**
       * <code>double z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(double value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TYPE_GYROSCOPE)
    }

    // @@protoc_insertion_point(class_scope:TYPE_GYROSCOPE)
    private static final SensorOuterClass.TYPE_GYROSCOPE DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.TYPE_GYROSCOPE();
    }

    public static SensorOuterClass.TYPE_GYROSCOPE getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TYPE_GYROSCOPE>
        PARSER = new com.google.protobuf.AbstractParser<TYPE_GYROSCOPE>() {
      @java.lang.Override
      public TYPE_GYROSCOPE parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TYPE_GYROSCOPE(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TYPE_GYROSCOPE> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TYPE_GYROSCOPE> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.TYPE_GYROSCOPE getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TYPE_LINEAR_ACCELERATIONOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TYPE_LINEAR_ACCELERATION)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    double getX();

    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    double getY();

    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    double getZ();
  }
  /**
   * Protobuf type {@code TYPE_LINEAR_ACCELERATION}
   */
  public static final class TYPE_LINEAR_ACCELERATION extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TYPE_LINEAR_ACCELERATION)
      TYPE_LINEAR_ACCELERATIONOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TYPE_LINEAR_ACCELERATION.newBuilder() to construct.
    private TYPE_LINEAR_ACCELERATION(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TYPE_LINEAR_ACCELERATION() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TYPE_LINEAR_ACCELERATION();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TYPE_LINEAR_ACCELERATION(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              x_ = input.readDouble();
              break;
            }
            case 17: {

              y_ = input.readDouble();
              break;
            }
            case 25: {

              z_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_TYPE_LINEAR_ACCELERATION_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_TYPE_LINEAR_ACCELERATION_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.TYPE_LINEAR_ACCELERATION.class, SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public double getZ() {
      return z_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        output.writeDouble(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        output.writeDouble(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        output.writeDouble(3, z_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.TYPE_LINEAR_ACCELERATION)) {
        return super.equals(obj);
      }
      SensorOuterClass.TYPE_LINEAR_ACCELERATION other = (SensorOuterClass.TYPE_LINEAR_ACCELERATION) obj;

      if (java.lang.Double.doubleToLongBits(getX())
          != java.lang.Double.doubleToLongBits(
              other.getX())) return false;
      if (java.lang.Double.doubleToLongBits(getY())
          != java.lang.Double.doubleToLongBits(
              other.getY())) return false;
      if (java.lang.Double.doubleToLongBits(getZ())
          != java.lang.Double.doubleToLongBits(
              other.getZ())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getX()));
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getY()));
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getZ()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.TYPE_LINEAR_ACCELERATION prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TYPE_LINEAR_ACCELERATION}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TYPE_LINEAR_ACCELERATION)
        SensorOuterClass.TYPE_LINEAR_ACCELERATIONOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_TYPE_LINEAR_ACCELERATION_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_TYPE_LINEAR_ACCELERATION_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.TYPE_LINEAR_ACCELERATION.class, SensorOuterClass.TYPE_LINEAR_ACCELERATION.Builder.class);
      }

      // Construct using SensorOuterClass.TYPE_LINEAR_ACCELERATION.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        x_ = 0D;

        y_ = 0D;

        z_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_TYPE_LINEAR_ACCELERATION_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_LINEAR_ACCELERATION getDefaultInstanceForType() {
        return SensorOuterClass.TYPE_LINEAR_ACCELERATION.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_LINEAR_ACCELERATION build() {
        SensorOuterClass.TYPE_LINEAR_ACCELERATION result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_LINEAR_ACCELERATION buildPartial() {
        SensorOuterClass.TYPE_LINEAR_ACCELERATION result = new SensorOuterClass.TYPE_LINEAR_ACCELERATION(this);
        result.x_ = x_;
        result.y_ = y_;
        result.z_ = z_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.TYPE_LINEAR_ACCELERATION) {
          return mergeFrom((SensorOuterClass.TYPE_LINEAR_ACCELERATION)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.TYPE_LINEAR_ACCELERATION other) {
        if (other == SensorOuterClass.TYPE_LINEAR_ACCELERATION.getDefaultInstance()) return this;
        if (other.getX() != 0D) {
          setX(other.getX());
        }
        if (other.getY() != 0D) {
          setY(other.getY());
        }
        if (other.getZ() != 0D) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.TYPE_LINEAR_ACCELERATION parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.TYPE_LINEAR_ACCELERATION) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double x_ ;
      /**
       * <code>double x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public double getX() {
        return x_;
      }
      /**
       * <code>double x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(double value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>double y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public double getY() {
        return y_;
      }
      /**
       * <code>double y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(double value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>double z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public double getZ() {
        return z_;
      }
      /**
       * <code>double z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(double value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TYPE_LINEAR_ACCELERATION)
    }

    // @@protoc_insertion_point(class_scope:TYPE_LINEAR_ACCELERATION)
    private static final SensorOuterClass.TYPE_LINEAR_ACCELERATION DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.TYPE_LINEAR_ACCELERATION();
    }

    public static SensorOuterClass.TYPE_LINEAR_ACCELERATION getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TYPE_LINEAR_ACCELERATION>
        PARSER = new com.google.protobuf.AbstractParser<TYPE_LINEAR_ACCELERATION>() {
      @java.lang.Override
      public TYPE_LINEAR_ACCELERATION parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TYPE_LINEAR_ACCELERATION(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TYPE_LINEAR_ACCELERATION> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TYPE_LINEAR_ACCELERATION> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.TYPE_LINEAR_ACCELERATION getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TYPE_GRAVITYOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TYPE_GRAVITY)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    double getX();

    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    double getY();

    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    double getZ();
  }
  /**
   * Protobuf type {@code TYPE_GRAVITY}
   */
  public static final class TYPE_GRAVITY extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TYPE_GRAVITY)
      TYPE_GRAVITYOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TYPE_GRAVITY.newBuilder() to construct.
    private TYPE_GRAVITY(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TYPE_GRAVITY() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TYPE_GRAVITY();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TYPE_GRAVITY(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              x_ = input.readDouble();
              break;
            }
            case 17: {

              y_ = input.readDouble();
              break;
            }
            case 25: {

              z_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_TYPE_GRAVITY_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_TYPE_GRAVITY_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.TYPE_GRAVITY.class, SensorOuterClass.TYPE_GRAVITY.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public double getZ() {
      return z_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        output.writeDouble(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        output.writeDouble(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        output.writeDouble(3, z_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.TYPE_GRAVITY)) {
        return super.equals(obj);
      }
      SensorOuterClass.TYPE_GRAVITY other = (SensorOuterClass.TYPE_GRAVITY) obj;

      if (java.lang.Double.doubleToLongBits(getX())
          != java.lang.Double.doubleToLongBits(
              other.getX())) return false;
      if (java.lang.Double.doubleToLongBits(getY())
          != java.lang.Double.doubleToLongBits(
              other.getY())) return false;
      if (java.lang.Double.doubleToLongBits(getZ())
          != java.lang.Double.doubleToLongBits(
              other.getZ())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getX()));
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getY()));
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getZ()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.TYPE_GRAVITY parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_GRAVITY parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.TYPE_GRAVITY prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TYPE_GRAVITY}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TYPE_GRAVITY)
        SensorOuterClass.TYPE_GRAVITYOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_TYPE_GRAVITY_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_TYPE_GRAVITY_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.TYPE_GRAVITY.class, SensorOuterClass.TYPE_GRAVITY.Builder.class);
      }

      // Construct using SensorOuterClass.TYPE_GRAVITY.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        x_ = 0D;

        y_ = 0D;

        z_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_TYPE_GRAVITY_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_GRAVITY getDefaultInstanceForType() {
        return SensorOuterClass.TYPE_GRAVITY.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_GRAVITY build() {
        SensorOuterClass.TYPE_GRAVITY result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_GRAVITY buildPartial() {
        SensorOuterClass.TYPE_GRAVITY result = new SensorOuterClass.TYPE_GRAVITY(this);
        result.x_ = x_;
        result.y_ = y_;
        result.z_ = z_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.TYPE_GRAVITY) {
          return mergeFrom((SensorOuterClass.TYPE_GRAVITY)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.TYPE_GRAVITY other) {
        if (other == SensorOuterClass.TYPE_GRAVITY.getDefaultInstance()) return this;
        if (other.getX() != 0D) {
          setX(other.getX());
        }
        if (other.getY() != 0D) {
          setY(other.getY());
        }
        if (other.getZ() != 0D) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.TYPE_GRAVITY parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.TYPE_GRAVITY) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double x_ ;
      /**
       * <code>double x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public double getX() {
        return x_;
      }
      /**
       * <code>double x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(double value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>double y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public double getY() {
        return y_;
      }
      /**
       * <code>double y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(double value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>double z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public double getZ() {
        return z_;
      }
      /**
       * <code>double z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(double value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TYPE_GRAVITY)
    }

    // @@protoc_insertion_point(class_scope:TYPE_GRAVITY)
    private static final SensorOuterClass.TYPE_GRAVITY DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.TYPE_GRAVITY();
    }

    public static SensorOuterClass.TYPE_GRAVITY getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TYPE_GRAVITY>
        PARSER = new com.google.protobuf.AbstractParser<TYPE_GRAVITY>() {
      @java.lang.Override
      public TYPE_GRAVITY parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TYPE_GRAVITY(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TYPE_GRAVITY> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TYPE_GRAVITY> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.TYPE_GRAVITY getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TYPE_MAGNETIC_FIELDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TYPE_MAGNETIC_FIELD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    double getX();

    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    double getY();

    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    double getZ();
  }
  /**
   * Protobuf type {@code TYPE_MAGNETIC_FIELD}
   */
  public static final class TYPE_MAGNETIC_FIELD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TYPE_MAGNETIC_FIELD)
      TYPE_MAGNETIC_FIELDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TYPE_MAGNETIC_FIELD.newBuilder() to construct.
    private TYPE_MAGNETIC_FIELD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TYPE_MAGNETIC_FIELD() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TYPE_MAGNETIC_FIELD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TYPE_MAGNETIC_FIELD(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              x_ = input.readDouble();
              break;
            }
            case 17: {

              y_ = input.readDouble();
              break;
            }
            case 25: {

              z_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_TYPE_MAGNETIC_FIELD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_TYPE_MAGNETIC_FIELD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.TYPE_MAGNETIC_FIELD.class, SensorOuterClass.TYPE_MAGNETIC_FIELD.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public double getZ() {
      return z_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        output.writeDouble(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        output.writeDouble(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        output.writeDouble(3, z_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.TYPE_MAGNETIC_FIELD)) {
        return super.equals(obj);
      }
      SensorOuterClass.TYPE_MAGNETIC_FIELD other = (SensorOuterClass.TYPE_MAGNETIC_FIELD) obj;

      if (java.lang.Double.doubleToLongBits(getX())
          != java.lang.Double.doubleToLongBits(
              other.getX())) return false;
      if (java.lang.Double.doubleToLongBits(getY())
          != java.lang.Double.doubleToLongBits(
              other.getY())) return false;
      if (java.lang.Double.doubleToLongBits(getZ())
          != java.lang.Double.doubleToLongBits(
              other.getZ())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getX()));
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getY()));
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getZ()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_MAGNETIC_FIELD parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.TYPE_MAGNETIC_FIELD prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TYPE_MAGNETIC_FIELD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TYPE_MAGNETIC_FIELD)
        SensorOuterClass.TYPE_MAGNETIC_FIELDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_TYPE_MAGNETIC_FIELD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_TYPE_MAGNETIC_FIELD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.TYPE_MAGNETIC_FIELD.class, SensorOuterClass.TYPE_MAGNETIC_FIELD.Builder.class);
      }

      // Construct using SensorOuterClass.TYPE_MAGNETIC_FIELD.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        x_ = 0D;

        y_ = 0D;

        z_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_TYPE_MAGNETIC_FIELD_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_MAGNETIC_FIELD getDefaultInstanceForType() {
        return SensorOuterClass.TYPE_MAGNETIC_FIELD.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_MAGNETIC_FIELD build() {
        SensorOuterClass.TYPE_MAGNETIC_FIELD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_MAGNETIC_FIELD buildPartial() {
        SensorOuterClass.TYPE_MAGNETIC_FIELD result = new SensorOuterClass.TYPE_MAGNETIC_FIELD(this);
        result.x_ = x_;
        result.y_ = y_;
        result.z_ = z_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.TYPE_MAGNETIC_FIELD) {
          return mergeFrom((SensorOuterClass.TYPE_MAGNETIC_FIELD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.TYPE_MAGNETIC_FIELD other) {
        if (other == SensorOuterClass.TYPE_MAGNETIC_FIELD.getDefaultInstance()) return this;
        if (other.getX() != 0D) {
          setX(other.getX());
        }
        if (other.getY() != 0D) {
          setY(other.getY());
        }
        if (other.getZ() != 0D) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.TYPE_MAGNETIC_FIELD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.TYPE_MAGNETIC_FIELD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double x_ ;
      /**
       * <code>double x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public double getX() {
        return x_;
      }
      /**
       * <code>double x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(double value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>double y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public double getY() {
        return y_;
      }
      /**
       * <code>double y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(double value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>double z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public double getZ() {
        return z_;
      }
      /**
       * <code>double z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(double value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TYPE_MAGNETIC_FIELD)
    }

    // @@protoc_insertion_point(class_scope:TYPE_MAGNETIC_FIELD)
    private static final SensorOuterClass.TYPE_MAGNETIC_FIELD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.TYPE_MAGNETIC_FIELD();
    }

    public static SensorOuterClass.TYPE_MAGNETIC_FIELD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TYPE_MAGNETIC_FIELD>
        PARSER = new com.google.protobuf.AbstractParser<TYPE_MAGNETIC_FIELD>() {
      @java.lang.Override
      public TYPE_MAGNETIC_FIELD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TYPE_MAGNETIC_FIELD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TYPE_MAGNETIC_FIELD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TYPE_MAGNETIC_FIELD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.TYPE_MAGNETIC_FIELD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TYPE_ORIENTATIONOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TYPE_ORIENTATION)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    double getX();

    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    double getY();

    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    double getZ();
  }
  /**
   * Protobuf type {@code TYPE_ORIENTATION}
   */
  public static final class TYPE_ORIENTATION extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TYPE_ORIENTATION)
      TYPE_ORIENTATIONOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TYPE_ORIENTATION.newBuilder() to construct.
    private TYPE_ORIENTATION(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TYPE_ORIENTATION() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TYPE_ORIENTATION();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TYPE_ORIENTATION(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              x_ = input.readDouble();
              break;
            }
            case 17: {

              y_ = input.readDouble();
              break;
            }
            case 25: {

              z_ = input.readDouble();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SensorOuterClass.internal_static_TYPE_ORIENTATION_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SensorOuterClass.internal_static_TYPE_ORIENTATION_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SensorOuterClass.TYPE_ORIENTATION.class, SensorOuterClass.TYPE_ORIENTATION.Builder.class);
    }

    public static final int X_FIELD_NUMBER = 1;
    private double x_;
    /**
     * <code>double x = 1;</code>
     * @return The x.
     */
    @java.lang.Override
    public double getX() {
      return x_;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private double y_;
    /**
     * <code>double y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public double getY() {
      return y_;
    }

    public static final int Z_FIELD_NUMBER = 3;
    private double z_;
    /**
     * <code>double z = 3;</code>
     * @return The z.
     */
    @java.lang.Override
    public double getZ() {
      return z_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        output.writeDouble(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        output.writeDouble(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        output.writeDouble(3, z_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (java.lang.Double.doubleToRawLongBits(x_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, x_);
      }
      if (java.lang.Double.doubleToRawLongBits(y_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, y_);
      }
      if (java.lang.Double.doubleToRawLongBits(z_) != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(3, z_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SensorOuterClass.TYPE_ORIENTATION)) {
        return super.equals(obj);
      }
      SensorOuterClass.TYPE_ORIENTATION other = (SensorOuterClass.TYPE_ORIENTATION) obj;

      if (java.lang.Double.doubleToLongBits(getX())
          != java.lang.Double.doubleToLongBits(
              other.getX())) return false;
      if (java.lang.Double.doubleToLongBits(getY())
          != java.lang.Double.doubleToLongBits(
              other.getY())) return false;
      if (java.lang.Double.doubleToLongBits(getZ())
          != java.lang.Double.doubleToLongBits(
              other.getZ())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getX()));
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getY()));
      hash = (37 * hash) + Z_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getZ()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SensorOuterClass.TYPE_ORIENTATION parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SensorOuterClass.TYPE_ORIENTATION prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TYPE_ORIENTATION}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TYPE_ORIENTATION)
        SensorOuterClass.TYPE_ORIENTATIONOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SensorOuterClass.internal_static_TYPE_ORIENTATION_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SensorOuterClass.internal_static_TYPE_ORIENTATION_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SensorOuterClass.TYPE_ORIENTATION.class, SensorOuterClass.TYPE_ORIENTATION.Builder.class);
      }

      // Construct using SensorOuterClass.TYPE_ORIENTATION.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        x_ = 0D;

        y_ = 0D;

        z_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SensorOuterClass.internal_static_TYPE_ORIENTATION_descriptor;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ORIENTATION getDefaultInstanceForType() {
        return SensorOuterClass.TYPE_ORIENTATION.getDefaultInstance();
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ORIENTATION build() {
        SensorOuterClass.TYPE_ORIENTATION result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SensorOuterClass.TYPE_ORIENTATION buildPartial() {
        SensorOuterClass.TYPE_ORIENTATION result = new SensorOuterClass.TYPE_ORIENTATION(this);
        result.x_ = x_;
        result.y_ = y_;
        result.z_ = z_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SensorOuterClass.TYPE_ORIENTATION) {
          return mergeFrom((SensorOuterClass.TYPE_ORIENTATION)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SensorOuterClass.TYPE_ORIENTATION other) {
        if (other == SensorOuterClass.TYPE_ORIENTATION.getDefaultInstance()) return this;
        if (other.getX() != 0D) {
          setX(other.getX());
        }
        if (other.getY() != 0D) {
          setY(other.getY());
        }
        if (other.getZ() != 0D) {
          setZ(other.getZ());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        SensorOuterClass.TYPE_ORIENTATION parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (SensorOuterClass.TYPE_ORIENTATION) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double x_ ;
      /**
       * <code>double x = 1;</code>
       * @return The x.
       */
      @java.lang.Override
      public double getX() {
        return x_;
      }
      /**
       * <code>double x = 1;</code>
       * @param value The x to set.
       * @return This builder for chaining.
       */
      public Builder setX(double value) {
        
        x_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double x = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearX() {
        
        x_ = 0D;
        onChanged();
        return this;
      }

      private double y_ ;
      /**
       * <code>double y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public double getY() {
        return y_;
      }
      /**
       * <code>double y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(double value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0D;
        onChanged();
        return this;
      }

      private double z_ ;
      /**
       * <code>double z = 3;</code>
       * @return The z.
       */
      @java.lang.Override
      public double getZ() {
        return z_;
      }
      /**
       * <code>double z = 3;</code>
       * @param value The z to set.
       * @return This builder for chaining.
       */
      public Builder setZ(double value) {
        
        z_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double z = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearZ() {
        
        z_ = 0D;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TYPE_ORIENTATION)
    }

    // @@protoc_insertion_point(class_scope:TYPE_ORIENTATION)
    private static final SensorOuterClass.TYPE_ORIENTATION DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SensorOuterClass.TYPE_ORIENTATION();
    }

    public static SensorOuterClass.TYPE_ORIENTATION getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TYPE_ORIENTATION>
        PARSER = new com.google.protobuf.AbstractParser<TYPE_ORIENTATION>() {
      @java.lang.Override
      public TYPE_ORIENTATION parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TYPE_ORIENTATION(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TYPE_ORIENTATION> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TYPE_ORIENTATION> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SensorOuterClass.TYPE_ORIENTATION getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Sensor_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Sensor_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Trip_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Trip_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LOCATION_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LOCATION_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TYPE_ACCELEROMETER_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TYPE_ACCELEROMETER_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TYPE_ROTATION_VECTOR_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TYPE_ROTATION_VECTOR_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TYPE_GYROSCOPE_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TYPE_GYROSCOPE_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TYPE_LINEAR_ACCELERATION_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TYPE_LINEAR_ACCELERATION_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TYPE_GRAVITY_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TYPE_GRAVITY_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TYPE_MAGNETIC_FIELD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TYPE_MAGNETIC_FIELD_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TYPE_ORIENTATION_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TYPE_ORIENTATION_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014sensor.proto\"\322\002\n\006Sensor\022\021\n\ttimestamp\030\001" +
      " \001(\003\022\026\n\003loc\030\002 \001(\0132\t.LOCATION\022 \n\003acc\030\003 \001(" +
      "\0132\023.TYPE_ACCELEROMETER\022\"\n\003rot\030\004 \001(\0132\025.TY" +
      "PE_ROTATION_VECTOR\022\034\n\003gyr\030\005 \001(\0132\017.TYPE_G" +
      "YROSCOPE\022+\n\003lin\030\006 \001(\0132\031.TYPE_LINEAR_ACCE" +
      "LERATIONH\000\210\001\001\022\037\n\003gra\030\007 \001(\0132\r.TYPE_GRAVIT" +
      "YH\001\210\001\001\022&\n\003mag\030\010 \001(\0132\024.TYPE_MAGNETIC_FIEL" +
      "DH\002\210\001\001\022#\n\003ori\030\t \001(\0132\021.TYPE_ORIENTATIONH\003" +
      "\210\001\001B\006\n\004_linB\006\n\004_graB\006\n\004_magB\006\n\004_ori\"h\n\004T" +
      "rip\022\031\n\021startingTimestamp\030\001 \001(\003\022\027\n\017ending" +
      "Timestamp\030\002 \001(\003\022\020\n\010deviceId\030\003 \001(\t\022\032\n\tSen" +
      "sorSet\030\004 \003(\0132\007.Sensor\"\326\001\n\010LOCATION\022\020\n\010la" +
      "titude\030\001 \001(\001\022\021\n\tlongitude\030\002 \001(\001\022\020\n\010altit" +
      "ude\030\003 \001(\001\022\r\n\005speed\030\004 \001(\001\022\014\n\004time\030\005 \001(\003\022\020" +
      "\n\010accuracy\030\006 \001(\001\022\036\n\026verticalAccuracyMete" +
      "rs\030\007 \001(\001\022$\n\034speedAccuracyMetersPerSecond" +
      "\030\010 \001(\001\022\036\n\026bearingAccuracyDegrees\030\t \001(\001\"5" +
      "\n\022TYPE_ACCELEROMETER\022\t\n\001x\030\001 \001(\001\022\t\n\001y\030\002 \001" +
      "(\001\022\t\n\001z\030\003 \001(\001\"V\n\024TYPE_ROTATION_VECTOR\022\t\n" +
      "\001x\030\001 \001(\001\022\t\n\001y\030\002 \001(\001\022\t\n\001z\030\003 \001(\001\022\013\n\003cos\030\004 " +
      "\001(\001\022\020\n\010accuracy\030\005 \001(\001\"1\n\016TYPE_GYROSCOPE\022" +
      "\t\n\001x\030\001 \001(\001\022\t\n\001y\030\002 \001(\001\022\t\n\001z\030\003 \001(\001\";\n\030TYPE" +
      "_LINEAR_ACCELERATION\022\t\n\001x\030\001 \001(\001\022\t\n\001y\030\002 \001" +
      "(\001\022\t\n\001z\030\003 \001(\001\"/\n\014TYPE_GRAVITY\022\t\n\001x\030\001 \001(\001" +
      "\022\t\n\001y\030\002 \001(\001\022\t\n\001z\030\003 \001(\001\"6\n\023TYPE_MAGNETIC_" +
      "FIELD\022\t\n\001x\030\001 \001(\001\022\t\n\001y\030\002 \001(\001\022\t\n\001z\030\003 \001(\001\"3" +
      "\n\020TYPE_ORIENTATION\022\t\n\001x\030\001 \001(\001\022\t\n\001y\030\002 \001(\001" +
      "\022\t\n\001z\030\003 \001(\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Sensor_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Sensor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Sensor_descriptor,
        new java.lang.String[] { "Timestamp", "Loc", "Acc", "Rot", "Gyr", "Lin", "Gra", "Mag", "Ori", "Lin", "Gra", "Mag", "Ori", });
    internal_static_Trip_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Trip_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Trip_descriptor,
        new java.lang.String[] { "StartingTimestamp", "EndingTimestamp", "DeviceId", "SensorSet", });
    internal_static_LOCATION_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LOCATION_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LOCATION_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", "Altitude", "Speed", "Time", "Accuracy", "VerticalAccuracyMeters", "SpeedAccuracyMetersPerSecond", "BearingAccuracyDegrees", });
    internal_static_TYPE_ACCELEROMETER_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_TYPE_ACCELEROMETER_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TYPE_ACCELEROMETER_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    internal_static_TYPE_ROTATION_VECTOR_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_TYPE_ROTATION_VECTOR_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TYPE_ROTATION_VECTOR_descriptor,
        new java.lang.String[] { "X", "Y", "Z", "Cos", "Accuracy", });
    internal_static_TYPE_GYROSCOPE_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_TYPE_GYROSCOPE_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TYPE_GYROSCOPE_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    internal_static_TYPE_LINEAR_ACCELERATION_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_TYPE_LINEAR_ACCELERATION_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TYPE_LINEAR_ACCELERATION_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    internal_static_TYPE_GRAVITY_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_TYPE_GRAVITY_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TYPE_GRAVITY_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    internal_static_TYPE_MAGNETIC_FIELD_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_TYPE_MAGNETIC_FIELD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TYPE_MAGNETIC_FIELD_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
    internal_static_TYPE_ORIENTATION_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_TYPE_ORIENTATION_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TYPE_ORIENTATION_descriptor,
        new java.lang.String[] { "X", "Y", "Z", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}

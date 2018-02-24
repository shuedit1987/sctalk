// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: depart.proto

package com.depart.grpc;

/**
 * Protobuf type {@code com.depart.grpc.DepartRequest}
 */
public  final class DepartRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.depart.grpc.DepartRequest)
    DepartRequestOrBuilder {
  // Use DepartRequest.newBuilder() to construct.
  private DepartRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DepartRequest() {
    id_ = 0;
    departname_ = "";
    priority_ = 0;
    parentid_ = 0;
    depart_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private DepartRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            departname_ = s;
            break;
          }
          case 24: {

            priority_ = input.readInt32();
            break;
          }
          case 32: {

            parentid_ = input.readInt32();
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
              depart_ = new java.util.ArrayList<com.depart.grpc.Depart>();
              mutable_bitField0_ |= 0x00000010;
            }
            depart_.add(
                input.readMessage(com.depart.grpc.Depart.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
        depart_ = java.util.Collections.unmodifiableList(depart_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_DepartRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_DepartRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.depart.grpc.DepartRequest.class, com.depart.grpc.DepartRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int DEPARTNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object departname_;
  /**
   * <code>string departname = 2;</code>
   */
  public java.lang.String getDepartname() {
    java.lang.Object ref = departname_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      departname_ = s;
      return s;
    }
  }
  /**
   * <code>string departname = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDepartnameBytes() {
    java.lang.Object ref = departname_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      departname_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIORITY_FIELD_NUMBER = 3;
  private int priority_;
  /**
   * <code>int32 priority = 3;</code>
   */
  public int getPriority() {
    return priority_;
  }

  public static final int PARENTID_FIELD_NUMBER = 4;
  private int parentid_;
  /**
   * <code>int32 parentid = 4;</code>
   */
  public int getParentid() {
    return parentid_;
  }

  public static final int DEPART_FIELD_NUMBER = 5;
  private java.util.List<com.depart.grpc.Depart> depart_;
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
   */
  public java.util.List<com.depart.grpc.Depart> getDepartList() {
    return depart_;
  }
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
   */
  public java.util.List<? extends com.depart.grpc.DepartOrBuilder> 
      getDepartOrBuilderList() {
    return depart_;
  }
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
   */
  public int getDepartCount() {
    return depart_.size();
  }
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
   */
  public com.depart.grpc.Depart getDepart(int index) {
    return depart_.get(index);
  }
  /**
   * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
   */
  public com.depart.grpc.DepartOrBuilder getDepartOrBuilder(
      int index) {
    return depart_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getDepartnameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, departname_);
    }
    if (priority_ != 0) {
      output.writeInt32(3, priority_);
    }
    if (parentid_ != 0) {
      output.writeInt32(4, parentid_);
    }
    for (int i = 0; i < depart_.size(); i++) {
      output.writeMessage(5, depart_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getDepartnameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, departname_);
    }
    if (priority_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, priority_);
    }
    if (parentid_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, parentid_);
    }
    for (int i = 0; i < depart_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, depart_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.depart.grpc.DepartRequest)) {
      return super.equals(obj);
    }
    com.depart.grpc.DepartRequest other = (com.depart.grpc.DepartRequest) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getDepartname()
        .equals(other.getDepartname());
    result = result && (getPriority()
        == other.getPriority());
    result = result && (getParentid()
        == other.getParentid());
    result = result && getDepartList()
        .equals(other.getDepartList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + DEPARTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getDepartname().hashCode();
    hash = (37 * hash) + PRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + getPriority();
    hash = (37 * hash) + PARENTID_FIELD_NUMBER;
    hash = (53 * hash) + getParentid();
    if (getDepartCount() > 0) {
      hash = (37 * hash) + DEPART_FIELD_NUMBER;
      hash = (53 * hash) + getDepartList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.depart.grpc.DepartRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.depart.grpc.DepartRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.depart.grpc.DepartRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.depart.grpc.DepartRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.depart.grpc.DepartRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.depart.grpc.DepartRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.depart.grpc.DepartRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.depart.grpc.DepartRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.depart.grpc.DepartRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.depart.grpc.DepartRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.depart.grpc.DepartRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.depart.grpc.DepartRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.depart.grpc.DepartRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code com.depart.grpc.DepartRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.depart.grpc.DepartRequest)
      com.depart.grpc.DepartRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_DepartRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_DepartRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.depart.grpc.DepartRequest.class, com.depart.grpc.DepartRequest.Builder.class);
    }

    // Construct using com.depart.grpc.DepartRequest.newBuilder()
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
        getDepartFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      id_ = 0;

      departname_ = "";

      priority_ = 0;

      parentid_ = 0;

      if (departBuilder_ == null) {
        depart_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
      } else {
        departBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.depart.grpc.DepartOuterClass.internal_static_com_depart_grpc_DepartRequest_descriptor;
    }

    public com.depart.grpc.DepartRequest getDefaultInstanceForType() {
      return com.depart.grpc.DepartRequest.getDefaultInstance();
    }

    public com.depart.grpc.DepartRequest build() {
      com.depart.grpc.DepartRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.depart.grpc.DepartRequest buildPartial() {
      com.depart.grpc.DepartRequest result = new com.depart.grpc.DepartRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.id_ = id_;
      result.departname_ = departname_;
      result.priority_ = priority_;
      result.parentid_ = parentid_;
      if (departBuilder_ == null) {
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          depart_ = java.util.Collections.unmodifiableList(depart_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.depart_ = depart_;
      } else {
        result.depart_ = departBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.depart.grpc.DepartRequest) {
        return mergeFrom((com.depart.grpc.DepartRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.depart.grpc.DepartRequest other) {
      if (other == com.depart.grpc.DepartRequest.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getDepartname().isEmpty()) {
        departname_ = other.departname_;
        onChanged();
      }
      if (other.getPriority() != 0) {
        setPriority(other.getPriority());
      }
      if (other.getParentid() != 0) {
        setParentid(other.getParentid());
      }
      if (departBuilder_ == null) {
        if (!other.depart_.isEmpty()) {
          if (depart_.isEmpty()) {
            depart_ = other.depart_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureDepartIsMutable();
            depart_.addAll(other.depart_);
          }
          onChanged();
        }
      } else {
        if (!other.depart_.isEmpty()) {
          if (departBuilder_.isEmpty()) {
            departBuilder_.dispose();
            departBuilder_ = null;
            depart_ = other.depart_;
            bitField0_ = (bitField0_ & ~0x00000010);
            departBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDepartFieldBuilder() : null;
          } else {
            departBuilder_.addAllMessages(other.depart_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.depart.grpc.DepartRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.depart.grpc.DepartRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object departname_ = "";
    /**
     * <code>string departname = 2;</code>
     */
    public java.lang.String getDepartname() {
      java.lang.Object ref = departname_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        departname_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string departname = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDepartnameBytes() {
      java.lang.Object ref = departname_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        departname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string departname = 2;</code>
     */
    public Builder setDepartname(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      departname_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string departname = 2;</code>
     */
    public Builder clearDepartname() {
      
      departname_ = getDefaultInstance().getDepartname();
      onChanged();
      return this;
    }
    /**
     * <code>string departname = 2;</code>
     */
    public Builder setDepartnameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      departname_ = value;
      onChanged();
      return this;
    }

    private int priority_ ;
    /**
     * <code>int32 priority = 3;</code>
     */
    public int getPriority() {
      return priority_;
    }
    /**
     * <code>int32 priority = 3;</code>
     */
    public Builder setPriority(int value) {
      
      priority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 priority = 3;</code>
     */
    public Builder clearPriority() {
      
      priority_ = 0;
      onChanged();
      return this;
    }

    private int parentid_ ;
    /**
     * <code>int32 parentid = 4;</code>
     */
    public int getParentid() {
      return parentid_;
    }
    /**
     * <code>int32 parentid = 4;</code>
     */
    public Builder setParentid(int value) {
      
      parentid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 parentid = 4;</code>
     */
    public Builder clearParentid() {
      
      parentid_ = 0;
      onChanged();
      return this;
    }

    private java.util.List<com.depart.grpc.Depart> depart_ =
      java.util.Collections.emptyList();
    private void ensureDepartIsMutable() {
      if (!((bitField0_ & 0x00000010) == 0x00000010)) {
        depart_ = new java.util.ArrayList<com.depart.grpc.Depart>(depart_);
        bitField0_ |= 0x00000010;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.depart.grpc.Depart, com.depart.grpc.Depart.Builder, com.depart.grpc.DepartOrBuilder> departBuilder_;

    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public java.util.List<com.depart.grpc.Depart> getDepartList() {
      if (departBuilder_ == null) {
        return java.util.Collections.unmodifiableList(depart_);
      } else {
        return departBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public int getDepartCount() {
      if (departBuilder_ == null) {
        return depart_.size();
      } else {
        return departBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public com.depart.grpc.Depart getDepart(int index) {
      if (departBuilder_ == null) {
        return depart_.get(index);
      } else {
        return departBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder setDepart(
        int index, com.depart.grpc.Depart value) {
      if (departBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDepartIsMutable();
        depart_.set(index, value);
        onChanged();
      } else {
        departBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder setDepart(
        int index, com.depart.grpc.Depart.Builder builderForValue) {
      if (departBuilder_ == null) {
        ensureDepartIsMutable();
        depart_.set(index, builderForValue.build());
        onChanged();
      } else {
        departBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder addDepart(com.depart.grpc.Depart value) {
      if (departBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDepartIsMutable();
        depart_.add(value);
        onChanged();
      } else {
        departBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder addDepart(
        int index, com.depart.grpc.Depart value) {
      if (departBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDepartIsMutable();
        depart_.add(index, value);
        onChanged();
      } else {
        departBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder addDepart(
        com.depart.grpc.Depart.Builder builderForValue) {
      if (departBuilder_ == null) {
        ensureDepartIsMutable();
        depart_.add(builderForValue.build());
        onChanged();
      } else {
        departBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder addDepart(
        int index, com.depart.grpc.Depart.Builder builderForValue) {
      if (departBuilder_ == null) {
        ensureDepartIsMutable();
        depart_.add(index, builderForValue.build());
        onChanged();
      } else {
        departBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder addAllDepart(
        java.lang.Iterable<? extends com.depart.grpc.Depart> values) {
      if (departBuilder_ == null) {
        ensureDepartIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, depart_);
        onChanged();
      } else {
        departBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder clearDepart() {
      if (departBuilder_ == null) {
        depart_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
      } else {
        departBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public Builder removeDepart(int index) {
      if (departBuilder_ == null) {
        ensureDepartIsMutable();
        depart_.remove(index);
        onChanged();
      } else {
        departBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public com.depart.grpc.Depart.Builder getDepartBuilder(
        int index) {
      return getDepartFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public com.depart.grpc.DepartOrBuilder getDepartOrBuilder(
        int index) {
      if (departBuilder_ == null) {
        return depart_.get(index);  } else {
        return departBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public java.util.List<? extends com.depart.grpc.DepartOrBuilder> 
         getDepartOrBuilderList() {
      if (departBuilder_ != null) {
        return departBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(depart_);
      }
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public com.depart.grpc.Depart.Builder addDepartBuilder() {
      return getDepartFieldBuilder().addBuilder(
          com.depart.grpc.Depart.getDefaultInstance());
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public com.depart.grpc.Depart.Builder addDepartBuilder(
        int index) {
      return getDepartFieldBuilder().addBuilder(
          index, com.depart.grpc.Depart.getDefaultInstance());
    }
    /**
     * <code>repeated .com.depart.grpc.Depart depart = 5;</code>
     */
    public java.util.List<com.depart.grpc.Depart.Builder> 
         getDepartBuilderList() {
      return getDepartFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.depart.grpc.Depart, com.depart.grpc.Depart.Builder, com.depart.grpc.DepartOrBuilder> 
        getDepartFieldBuilder() {
      if (departBuilder_ == null) {
        departBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.depart.grpc.Depart, com.depart.grpc.Depart.Builder, com.depart.grpc.DepartOrBuilder>(
                depart_,
                ((bitField0_ & 0x00000010) == 0x00000010),
                getParentForChildren(),
                isClean());
        depart_ = null;
      }
      return departBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:com.depart.grpc.DepartRequest)
  }

  // @@protoc_insertion_point(class_scope:com.depart.grpc.DepartRequest)
  private static final com.depart.grpc.DepartRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.depart.grpc.DepartRequest();
  }

  public static com.depart.grpc.DepartRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DepartRequest>
      PARSER = new com.google.protobuf.AbstractParser<DepartRequest>() {
    public DepartRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new DepartRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DepartRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DepartRequest> getParserForType() {
    return PARSER;
  }

  public com.depart.grpc.DepartRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

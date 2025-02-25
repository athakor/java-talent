/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/filters.proto

package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Employer filter of the search.
 * </pre>
 *
 * Protobuf type {@code google.cloud.talent.v4beta1.EmployerFilter}
 */
public final class EmployerFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.talent.v4beta1.EmployerFilter)
    EmployerFilterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EmployerFilter.newBuilder() to construct.
  private EmployerFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EmployerFilter() {
    employer_ = "";
    mode_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EmployerFilter(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              employer_ = s;
              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              mode_ = rawValue;
              break;
            }
          case 24:
            {
              negated_ = input.readBool();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.talent.v4beta1.FiltersProto
        .internal_static_google_cloud_talent_v4beta1_EmployerFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.talent.v4beta1.EmployerFilter.class,
            com.google.cloud.talent.v4beta1.EmployerFilter.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enum indicating which set of
   * [Profile.employment_records][google.cloud.talent.v4beta1.Profile.employment_records]
   * to search against.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode}
   */
  public enum EmployerFilterMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>EMPLOYER_FILTER_MODE_UNSPECIFIED = 0;</code>
     */
    EMPLOYER_FILTER_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Apply to all employers in
     * [Profile.employment_records][google.cloud.talent.v4beta1.Profile.employment_records].
     * </pre>
     *
     * <code>ALL_EMPLOYMENT_RECORDS = 1;</code>
     */
    ALL_EMPLOYMENT_RECORDS(1),
    /**
     *
     *
     * <pre>
     * Apply only to current employer in
     * [Profile.employment_records][google.cloud.talent.v4beta1.Profile.employment_records].
     * </pre>
     *
     * <code>CURRENT_EMPLOYMENT_RECORDS_ONLY = 2;</code>
     */
    CURRENT_EMPLOYMENT_RECORDS_ONLY(2),
    /**
     *
     *
     * <pre>
     * Apply only to past (not current) employers in
     * [Profile.employment_records][google.cloud.talent.v4beta1.Profile.employment_records].
     * </pre>
     *
     * <code>PAST_EMPLOYMENT_RECORDS_ONLY = 3;</code>
     */
    PAST_EMPLOYMENT_RECORDS_ONLY(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value.
     * </pre>
     *
     * <code>EMPLOYER_FILTER_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int EMPLOYER_FILTER_MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Apply to all employers in
     * [Profile.employment_records][google.cloud.talent.v4beta1.Profile.employment_records].
     * </pre>
     *
     * <code>ALL_EMPLOYMENT_RECORDS = 1;</code>
     */
    public static final int ALL_EMPLOYMENT_RECORDS_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Apply only to current employer in
     * [Profile.employment_records][google.cloud.talent.v4beta1.Profile.employment_records].
     * </pre>
     *
     * <code>CURRENT_EMPLOYMENT_RECORDS_ONLY = 2;</code>
     */
    public static final int CURRENT_EMPLOYMENT_RECORDS_ONLY_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Apply only to past (not current) employers in
     * [Profile.employment_records][google.cloud.talent.v4beta1.Profile.employment_records].
     * </pre>
     *
     * <code>PAST_EMPLOYMENT_RECORDS_ONLY = 3;</code>
     */
    public static final int PAST_EMPLOYMENT_RECORDS_ONLY_VALUE = 3;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static EmployerFilterMode valueOf(int value) {
      return forNumber(value);
    }

    public static EmployerFilterMode forNumber(int value) {
      switch (value) {
        case 0:
          return EMPLOYER_FILTER_MODE_UNSPECIFIED;
        case 1:
          return ALL_EMPLOYMENT_RECORDS;
        case 2:
          return CURRENT_EMPLOYMENT_RECORDS_ONLY;
        case 3:
          return PAST_EMPLOYMENT_RECORDS_ONLY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<EmployerFilterMode>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<EmployerFilterMode>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<EmployerFilterMode>() {
              public EmployerFilterMode findValueByNumber(int number) {
                return EmployerFilterMode.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.EmployerFilter.getDescriptor().getEnumTypes().get(0);
    }

    private static final EmployerFilterMode[] VALUES = values();

    public static EmployerFilterMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private EmployerFilterMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode)
  }

  public static final int EMPLOYER_FIELD_NUMBER = 1;
  private volatile java.lang.Object employer_;
  /**
   *
   *
   * <pre>
   * Required. The name of the employer, for example "Google", "Alphabet".
   * </pre>
   *
   * <code>string employer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public java.lang.String getEmployer() {
    java.lang.Object ref = employer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      employer_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the employer, for example "Google", "Alphabet".
   * </pre>
   *
   * <code>string employer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getEmployerBytes() {
    java.lang.Object ref = employer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      employer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MODE_FIELD_NUMBER = 2;
  private int mode_;
  /**
   *
   *
   * <pre>
   * Define set of
   * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
   * against.
   * Defaults to
   * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
   */
  public int getModeValue() {
    return mode_;
  }
  /**
   *
   *
   * <pre>
   * Define set of
   * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
   * against.
   * Defaults to
   * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
   */
  public com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode getMode() {
    @SuppressWarnings("deprecation")
    com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode result =
        com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.valueOf(mode_);
    return result == null
        ? com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.UNRECOGNIZED
        : result;
  }

  public static final int NEGATED_FIELD_NUMBER = 3;
  private boolean negated_;
  /**
   *
   *
   * <pre>
   * Whether to apply negation to the filter so profiles matching the filter
   * is excluded.
   * </pre>
   *
   * <code>bool negated = 3;</code>
   */
  public boolean getNegated() {
    return negated_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getEmployerBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, employer_);
    }
    if (mode_
        != com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode
            .EMPLOYER_FILTER_MODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, mode_);
    }
    if (negated_ != false) {
      output.writeBool(3, negated_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEmployerBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, employer_);
    }
    if (mode_
        != com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode
            .EMPLOYER_FILTER_MODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, mode_);
    }
    if (negated_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, negated_);
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
    if (!(obj instanceof com.google.cloud.talent.v4beta1.EmployerFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.talent.v4beta1.EmployerFilter other =
        (com.google.cloud.talent.v4beta1.EmployerFilter) obj;

    if (!getEmployer().equals(other.getEmployer())) return false;
    if (mode_ != other.mode_) return false;
    if (getNegated() != other.getNegated()) return false;
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
    hash = (37 * hash) + EMPLOYER_FIELD_NUMBER;
    hash = (53 * hash) + getEmployer().hashCode();
    hash = (37 * hash) + MODE_FIELD_NUMBER;
    hash = (53 * hash) + mode_;
    hash = (37 * hash) + NEGATED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getNegated());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.talent.v4beta1.EmployerFilter prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Employer filter of the search.
   * </pre>
   *
   * Protobuf type {@code google.cloud.talent.v4beta1.EmployerFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.talent.v4beta1.EmployerFilter)
      com.google.cloud.talent.v4beta1.EmployerFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_EmployerFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.talent.v4beta1.EmployerFilter.class,
              com.google.cloud.talent.v4beta1.EmployerFilter.Builder.class);
    }

    // Construct using com.google.cloud.talent.v4beta1.EmployerFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      employer_ = "";

      mode_ = 0;

      negated_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.talent.v4beta1.FiltersProto
          .internal_static_google_cloud_talent_v4beta1_EmployerFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.EmployerFilter getDefaultInstanceForType() {
      return com.google.cloud.talent.v4beta1.EmployerFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.EmployerFilter build() {
      com.google.cloud.talent.v4beta1.EmployerFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.talent.v4beta1.EmployerFilter buildPartial() {
      com.google.cloud.talent.v4beta1.EmployerFilter result =
          new com.google.cloud.talent.v4beta1.EmployerFilter(this);
      result.employer_ = employer_;
      result.mode_ = mode_;
      result.negated_ = negated_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.talent.v4beta1.EmployerFilter) {
        return mergeFrom((com.google.cloud.talent.v4beta1.EmployerFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.talent.v4beta1.EmployerFilter other) {
      if (other == com.google.cloud.talent.v4beta1.EmployerFilter.getDefaultInstance()) return this;
      if (!other.getEmployer().isEmpty()) {
        employer_ = other.employer_;
        onChanged();
      }
      if (other.mode_ != 0) {
        setModeValue(other.getModeValue());
      }
      if (other.getNegated() != false) {
        setNegated(other.getNegated());
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
      com.google.cloud.talent.v4beta1.EmployerFilter parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.talent.v4beta1.EmployerFilter) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object employer_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the employer, for example "Google", "Alphabet".
     * </pre>
     *
     * <code>string employer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public java.lang.String getEmployer() {
      java.lang.Object ref = employer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        employer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the employer, for example "Google", "Alphabet".
     * </pre>
     *
     * <code>string employer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getEmployerBytes() {
      java.lang.Object ref = employer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        employer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the employer, for example "Google", "Alphabet".
     * </pre>
     *
     * <code>string employer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEmployer(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      employer_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the employer, for example "Google", "Alphabet".
     * </pre>
     *
     * <code>string employer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearEmployer() {

      employer_ = getDefaultInstance().getEmployer();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the employer, for example "Google", "Alphabet".
     * </pre>
     *
     * <code>string employer = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setEmployerBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      employer_ = value;
      onChanged();
      return this;
    }

    private int mode_ = 0;
    /**
     *
     *
     * <pre>
     * Define set of
     * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
     * against.
     * Defaults to
     * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
     */
    public int getModeValue() {
      return mode_;
    }
    /**
     *
     *
     * <pre>
     * Define set of
     * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
     * against.
     * Defaults to
     * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
     */
    public Builder setModeValue(int value) {
      mode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Define set of
     * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
     * against.
     * Defaults to
     * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
     */
    public com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode getMode() {
      @SuppressWarnings("deprecation")
      com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode result =
          com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.valueOf(mode_);
      return result == null
          ? com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Define set of
     * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
     * against.
     * Defaults to
     * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
     */
    public Builder setMode(
        com.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode value) {
      if (value == null) {
        throw new NullPointerException();
      }

      mode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Define set of
     * [EmploymentRecord][google.cloud.talent.v4beta1.EmploymentRecord]s to search
     * against.
     * Defaults to
     * [EmployerFilterMode.ALL_EMPLOYMENT_RECORDS][google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode.ALL_EMPLOYMENT_RECORDS].
     * </pre>
     *
     * <code>.google.cloud.talent.v4beta1.EmployerFilter.EmployerFilterMode mode = 2;</code>
     */
    public Builder clearMode() {

      mode_ = 0;
      onChanged();
      return this;
    }

    private boolean negated_;
    /**
     *
     *
     * <pre>
     * Whether to apply negation to the filter so profiles matching the filter
     * is excluded.
     * </pre>
     *
     * <code>bool negated = 3;</code>
     */
    public boolean getNegated() {
      return negated_;
    }
    /**
     *
     *
     * <pre>
     * Whether to apply negation to the filter so profiles matching the filter
     * is excluded.
     * </pre>
     *
     * <code>bool negated = 3;</code>
     */
    public Builder setNegated(boolean value) {

      negated_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to apply negation to the filter so profiles matching the filter
     * is excluded.
     * </pre>
     *
     * <code>bool negated = 3;</code>
     */
    public Builder clearNegated() {

      negated_ = false;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.talent.v4beta1.EmployerFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.talent.v4beta1.EmployerFilter)
  private static final com.google.cloud.talent.v4beta1.EmployerFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.talent.v4beta1.EmployerFilter();
  }

  public static com.google.cloud.talent.v4beta1.EmployerFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmployerFilter> PARSER =
      new com.google.protobuf.AbstractParser<EmployerFilter>() {
        @java.lang.Override
        public EmployerFilter parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EmployerFilter(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EmployerFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmployerFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.talent.v4beta1.EmployerFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

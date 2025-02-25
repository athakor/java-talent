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

public interface SkillFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.SkillFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The skill name. For example, "java", "j2ee", and so on.
   * </pre>
   *
   * <code>string skill = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getSkill();
  /**
   *
   *
   * <pre>
   * Required. The skill name. For example, "java", "j2ee", and so on.
   * </pre>
   *
   * <code>string skill = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getSkillBytes();

  /**
   *
   *
   * <pre>
   * Whether to apply negation to the filter so profiles matching the filter
   * are excluded.
   * </pre>
   *
   * <code>bool negated = 2;</code>
   */
  boolean getNegated();
}

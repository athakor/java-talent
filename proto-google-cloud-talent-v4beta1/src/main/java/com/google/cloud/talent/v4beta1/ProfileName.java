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

package com.google.cloud.talent.v4beta1;

import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class ProfileName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding(
          "projects/{project}/tenants/{tenant}/profiles/{profile}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String tenant;
  private final String profile;

  public String getProject() {
    return project;
  }

  public String getTenant() {
    return tenant;
  }

  public String getProfile() {
    return profile;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private ProfileName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    tenant = Preconditions.checkNotNull(builder.getTenant());
    profile = Preconditions.checkNotNull(builder.getProfile());
  }

  public static ProfileName of(String project, String tenant, String profile) {
    return newBuilder().setProject(project).setTenant(tenant).setProfile(profile).build();
  }

  public static String format(String project, String tenant, String profile) {
    return newBuilder()
        .setProject(project)
        .setTenant(tenant)
        .setProfile(profile)
        .build()
        .toString();
  }

  public static ProfileName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "ProfileName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("tenant"), matchMap.get("profile"));
  }

  public static List<ProfileName> parseList(List<String> formattedStrings) {
    List<ProfileName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<ProfileName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (ProfileName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("project", project);
          fieldMapBuilder.put("tenant", tenant);
          fieldMapBuilder.put("profile", profile);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("project", project, "tenant", tenant, "profile", profile);
  }

  /** Builder for ProfileName. */
  public static class Builder {

    private String project;
    private String tenant;
    private String profile;

    public String getProject() {
      return project;
    }

    public String getTenant() {
      return tenant;
    }

    public String getProfile() {
      return profile;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setTenant(String tenant) {
      this.tenant = tenant;
      return this;
    }

    public Builder setProfile(String profile) {
      this.profile = profile;
      return this;
    }

    private Builder() {}

    private Builder(ProfileName profileName) {
      project = profileName.project;
      tenant = profileName.tenant;
      profile = profileName.profile;
    }

    public ProfileName build() {
      return new ProfileName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ProfileName) {
      ProfileName that = (ProfileName) o;
      return (this.project.equals(that.project))
          && (this.tenant.equals(that.tenant))
          && (this.profile.equals(that.profile));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= tenant.hashCode();
    h *= 1000003;
    h ^= profile.hashCode();
    return h;
  }
}

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
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class CompanyWithoutTenantName extends CompanyName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("projects/{project}/companies/{company}");

  private volatile Map<String, String> fieldValuesMap;

  private final String project;
  private final String company;

  public String getProject() {
    return project;
  }

  public String getCompany() {
    return company;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private CompanyWithoutTenantName(Builder builder) {
    project = Preconditions.checkNotNull(builder.getProject());
    company = Preconditions.checkNotNull(builder.getCompany());
  }

  public static CompanyWithoutTenantName of(String project, String company) {
    return newBuilder().setProject(project).setCompany(company).build();
  }

  public static String format(String project, String company) {
    return newBuilder().setProject(project).setCompany(company).build().toString();
  }

  public static CompanyWithoutTenantName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(
            formattedString, "CompanyWithoutTenantName.parse: formattedString not in valid format");
    return of(matchMap.get("project"), matchMap.get("company"));
  }

  public static List<CompanyWithoutTenantName> parseList(List<String> formattedStrings) {
    List<CompanyWithoutTenantName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<CompanyWithoutTenantName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (CompanyWithoutTenantName value : values) {
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
          fieldMapBuilder.put("company", company);
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
    return PATH_TEMPLATE.instantiate("project", project, "company", company);
  }

  /** Builder for CompanyWithoutTenantName. */
  public static class Builder {

    private String project;
    private String company;

    public String getProject() {
      return project;
    }

    public String getCompany() {
      return company;
    }

    public Builder setProject(String project) {
      this.project = project;
      return this;
    }

    public Builder setCompany(String company) {
      this.company = company;
      return this;
    }

    private Builder() {}

    private Builder(CompanyWithoutTenantName companyWithoutTenantName) {
      project = companyWithoutTenantName.project;
      company = companyWithoutTenantName.company;
    }

    public CompanyWithoutTenantName build() {
      return new CompanyWithoutTenantName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof CompanyWithoutTenantName) {
      CompanyWithoutTenantName that = (CompanyWithoutTenantName) o;
      return (this.project.equals(that.project)) && (this.company.equals(that.company));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= project.hashCode();
    h *= 1000003;
    h ^= company.hashCode();
    return h;
  }
}

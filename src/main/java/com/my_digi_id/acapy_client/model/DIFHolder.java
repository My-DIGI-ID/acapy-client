/*
 * IBM-Deutschland
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.my_digi_id.acapy_client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * DIFHolder
 */
@JsonPropertyOrder({
  DIFHolder.JSON_PROPERTY_DIRECTIVE,
  DIFHolder.JSON_PROPERTY_FIELD_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class DIFHolder {
  /**
   * Preference
   */
  public enum DirectiveEnum {
    REQUIRED("required"),
    
    PREFERRED("preferred");

    private String value;

    DirectiveEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DirectiveEnum fromValue(String value) {
      for (DirectiveEnum b : DirectiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_DIRECTIVE = "directive";
  private DirectiveEnum directive;

  public static final String JSON_PROPERTY_FIELD_ID = "field_id";
  private List<String> fieldId = null;


  public DIFHolder directive(DirectiveEnum directive) {
    this.directive = directive;
    return this;
  }

   /**
   * Preference
   * @return directive
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Preference")
  @JsonProperty(JSON_PROPERTY_DIRECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DirectiveEnum getDirective() {
    return directive;
  }


  @JsonProperty(JSON_PROPERTY_DIRECTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDirective(DirectiveEnum directive) {
    this.directive = directive;
  }


  public DIFHolder fieldId(List<String> fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  public DIFHolder addFieldIdItem(String fieldIdItem) {
    if (this.fieldId == null) {
      this.fieldId = new ArrayList<>();
    }
    this.fieldId.add(fieldIdItem);
    return this;
  }

   /**
   * Get fieldId
   * @return fieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIELD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFieldId() {
    return fieldId;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldId(List<String> fieldId) {
    this.fieldId = fieldId;
  }


  /**
   * Return true if this DIFHolder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DIFHolder diFHolder = (DIFHolder) o;
    return Objects.equals(this.directive, diFHolder.directive) &&
        Objects.equals(this.fieldId, diFHolder.fieldId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(directive, fieldId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DIFHolder {\n");
    sb.append("    directive: ").append(toIndentedString(directive)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


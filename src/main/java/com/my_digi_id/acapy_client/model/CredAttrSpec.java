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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * CredAttrSpec
 */
@JsonPropertyOrder({
  CredAttrSpec.JSON_PROPERTY_MIME_TYPE,
  CredAttrSpec.JSON_PROPERTY_NAME,
  CredAttrSpec.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class CredAttrSpec {
  public static final String JSON_PROPERTY_MIME_TYPE = "mime-type";
  private JsonNullable<String> mimeType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;


  public CredAttrSpec mimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
    return this;
  }

   /**
   * MIME type: omit for (null) default
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "image/jpeg", value = "MIME type: omit for (null) default")
  @JsonIgnore

  public String getMimeType() {
        return mimeType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getMimeType_JsonNullable() {
    return mimeType;
  }
  
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  public void setMimeType_JsonNullable(JsonNullable<String> mimeType) {
    this.mimeType = mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = JsonNullable.<String>of(mimeType);
  }


  public CredAttrSpec name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Attribute name
   * @return name
  **/
  @ApiModelProperty(example = "favourite_drink", required = true, value = "Attribute name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public CredAttrSpec value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Attribute value: base64-encode if MIME type is present
   * @return value
  **/
  @ApiModelProperty(example = "martini", required = true, value = "Attribute value: base64-encode if MIME type is present")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this CredAttrSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredAttrSpec credAttrSpec = (CredAttrSpec) o;
    return Objects.equals(this.mimeType, credAttrSpec.mimeType) &&
        Objects.equals(this.name, credAttrSpec.name) &&
        Objects.equals(this.value, credAttrSpec.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mimeType, name, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredAttrSpec {\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


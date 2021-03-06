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
import com.my_digi_id.acapy_client.model.CredDefValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * CredentialDefinition
 */
@JsonPropertyOrder({
  CredentialDefinition.JSON_PROPERTY_ID,
  CredentialDefinition.JSON_PROPERTY_SCHEMA_ID,
  CredentialDefinition.JSON_PROPERTY_TAG,
  CredentialDefinition.JSON_PROPERTY_TYPE,
  CredentialDefinition.JSON_PROPERTY_VALUE,
  CredentialDefinition.JSON_PROPERTY_VER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class CredentialDefinition {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SCHEMA_ID = "schemaId";
  private String schemaId;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Object type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private CredDefValue value;

  public static final String JSON_PROPERTY_VER = "ver";
  private String ver;


  public CredentialDefinition id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Credential definition identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:3:CL:20:tag", value = "Credential definition identifier")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public CredentialDefinition schemaId(String schemaId) {
    this.schemaId = schemaId;
    return this;
  }

   /**
   * Schema identifier within credential definition identifier
   * @return schemaId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "Schema identifier within credential definition identifier")
  @JsonProperty(JSON_PROPERTY_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSchemaId() {
    return schemaId;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaId(String schemaId) {
    this.schemaId = schemaId;
  }


  public CredentialDefinition tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Tag within credential definition identifier
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "tag", value = "Tag within credential definition identifier")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public CredentialDefinition type(Object type) {
    this.type = type;
    return this;
  }

   /**
   * Signature type: CL for Camenisch-Lysyanskaya
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CL", value = "Signature type: CL for Camenisch-Lysyanskaya")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Object type) {
    this.type = type;
  }


  public CredentialDefinition value(CredDefValue value) {
    this.value = value;
    return this;
  }

   /**
   * Credential definition primary and revocation values
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credential definition primary and revocation values")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CredDefValue getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(CredDefValue value) {
    this.value = value;
  }


  public CredentialDefinition ver(String ver) {
    this.ver = ver;
    return this;
  }

   /**
   * Node protocol version
   * @return ver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Node protocol version")
  @JsonProperty(JSON_PROPERTY_VER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVer() {
    return ver;
  }


  @JsonProperty(JSON_PROPERTY_VER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVer(String ver) {
    this.ver = ver;
  }


  /**
   * Return true if this CredentialDefinition object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialDefinition credentialDefinition = (CredentialDefinition) o;
    return Objects.equals(this.id, credentialDefinition.id) &&
        Objects.equals(this.schemaId, credentialDefinition.schemaId) &&
        Objects.equals(this.tag, credentialDefinition.tag) &&
        Objects.equals(this.type, credentialDefinition.type) &&
        Objects.equals(this.value, credentialDefinition.value) &&
        Objects.equals(this.ver, credentialDefinition.ver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, schemaId, tag, type, value, ver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialDefinition {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
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


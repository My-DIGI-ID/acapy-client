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


package com.ibm.ssi.acapy_client.model;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * IndyPresAttrSpec
 */
@JsonPropertyOrder({
  IndyPresAttrSpec.JSON_PROPERTY_CRED_DEF_ID,
  IndyPresAttrSpec.JSON_PROPERTY_MIME_TYPE,
  IndyPresAttrSpec.JSON_PROPERTY_NAME,
  IndyPresAttrSpec.JSON_PROPERTY_REFERENT,
  IndyPresAttrSpec.JSON_PROPERTY_VALUE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class IndyPresAttrSpec {
  public static final String JSON_PROPERTY_CRED_DEF_ID = "cred_def_id";
  private String credDefId;

  public static final String JSON_PROPERTY_MIME_TYPE = "mime-type";
  private String mimeType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REFERENT = "referent";
  private String referent;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;


  public IndyPresAttrSpec credDefId(String credDefId) {
    this.credDefId = credDefId;
    return this;
  }

   /**
   * Get credDefId
   * @return credDefId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:3:CL:20:tag", value = "")
  @JsonProperty(JSON_PROPERTY_CRED_DEF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredDefId() {
    return credDefId;
  }


  @JsonProperty(JSON_PROPERTY_CRED_DEF_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredDefId(String credDefId) {
    this.credDefId = credDefId;
  }


  public IndyPresAttrSpec mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * MIME type (default null)
   * @return mimeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "image/jpeg", value = "MIME type (default null)")
  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMimeType() {
    return mimeType;
  }


  @JsonProperty(JSON_PROPERTY_MIME_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public IndyPresAttrSpec name(String name) {
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


  public IndyPresAttrSpec referent(String referent) {
    this.referent = referent;
    return this;
  }

   /**
   * Credential referent
   * @return referent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Credential referent")
  @JsonProperty(JSON_PROPERTY_REFERENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReferent() {
    return referent;
  }


  @JsonProperty(JSON_PROPERTY_REFERENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReferent(String referent) {
    this.referent = referent;
  }


  public IndyPresAttrSpec value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Attribute value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "martini", value = "Attribute value")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Return true if this IndyPresAttrSpec object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndyPresAttrSpec indyPresAttrSpec = (IndyPresAttrSpec) o;
    return Objects.equals(this.credDefId, indyPresAttrSpec.credDefId) &&
        Objects.equals(this.mimeType, indyPresAttrSpec.mimeType) &&
        Objects.equals(this.name, indyPresAttrSpec.name) &&
        Objects.equals(this.referent, indyPresAttrSpec.referent) &&
        Objects.equals(this.value, indyPresAttrSpec.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credDefId, mimeType, name, referent, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndyPresAttrSpec {\n");
    sb.append("    credDefId: ").append(toIndentedString(credDefId)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    referent: ").append(toIndentedString(referent)).append("\n");
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

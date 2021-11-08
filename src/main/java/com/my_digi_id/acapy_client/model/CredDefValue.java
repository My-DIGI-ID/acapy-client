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
import com.my_digi_id.acapy_client.model.CredDefValuePrimary;
import com.my_digi_id.acapy_client.model.CredDefValueRevocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * CredDefValue
 */
@JsonPropertyOrder({
  CredDefValue.JSON_PROPERTY_PRIMARY,
  CredDefValue.JSON_PROPERTY_REVOCATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class CredDefValue {
  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private CredDefValuePrimary primary;

  public static final String JSON_PROPERTY_REVOCATION = "revocation";
  private CredDefValueRevocation revocation;


  public CredDefValue primary(CredDefValuePrimary primary) {
    this.primary = primary;
    return this;
  }

   /**
   * Primary value for credential definition
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Primary value for credential definition")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CredDefValuePrimary getPrimary() {
    return primary;
  }


  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrimary(CredDefValuePrimary primary) {
    this.primary = primary;
  }


  public CredDefValue revocation(CredDefValueRevocation revocation) {
    this.revocation = revocation;
    return this;
  }

   /**
   * Revocation value for credential definition
   * @return revocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Revocation value for credential definition")
  @JsonProperty(JSON_PROPERTY_REVOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CredDefValueRevocation getRevocation() {
    return revocation;
  }


  @JsonProperty(JSON_PROPERTY_REVOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRevocation(CredDefValueRevocation revocation) {
    this.revocation = revocation;
  }


  /**
   * Return true if this CredDefValue object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredDefValue credDefValue = (CredDefValue) o;
    return Objects.equals(this.primary, credDefValue.primary) &&
        Objects.equals(this.revocation, credDefValue.revocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primary, revocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredDefValue {\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    revocation: ").append(toIndentedString(revocation)).append("\n");
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


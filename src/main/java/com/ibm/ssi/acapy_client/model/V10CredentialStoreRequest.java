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
 * V10CredentialStoreRequest
 */
@JsonPropertyOrder({
  V10CredentialStoreRequest.JSON_PROPERTY_CREDENTIAL_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class V10CredentialStoreRequest {
  public static final String JSON_PROPERTY_CREDENTIAL_ID = "credential_id";
  private String credentialId;


  public V10CredentialStoreRequest credentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

   /**
   * Get credentialId
   * @return credentialId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredentialId() {
    return credentialId;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }


  /**
   * Return true if this V10CredentialStoreRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V10CredentialStoreRequest v10CredentialStoreRequest = (V10CredentialStoreRequest) o;
    return Objects.equals(this.credentialId, v10CredentialStoreRequest.credentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V10CredentialStoreRequest {\n");
    sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
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


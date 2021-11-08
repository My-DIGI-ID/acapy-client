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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * RevRegCreateRequest
 */
@JsonPropertyOrder({
  RevRegCreateRequest.JSON_PROPERTY_CREDENTIAL_DEFINITION_ID,
  RevRegCreateRequest.JSON_PROPERTY_MAX_CRED_NUM
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class RevRegCreateRequest {
  public static final String JSON_PROPERTY_CREDENTIAL_DEFINITION_ID = "credential_definition_id";
  private String credentialDefinitionId;

  public static final String JSON_PROPERTY_MAX_CRED_NUM = "max_cred_num";
  private Integer maxCredNum;


  public RevRegCreateRequest credentialDefinitionId(String credentialDefinitionId) {
    this.credentialDefinitionId = credentialDefinitionId;
    return this;
  }

   /**
   * Credential definition identifier
   * @return credentialDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:3:CL:20:tag", value = "Credential definition identifier")
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCredentialDefinitionId() {
    return credentialDefinitionId;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialDefinitionId(String credentialDefinitionId) {
    this.credentialDefinitionId = credentialDefinitionId;
  }


  public RevRegCreateRequest maxCredNum(Integer maxCredNum) {
    this.maxCredNum = maxCredNum;
    return this;
  }

   /**
   * Revocation registry size
   * minimum: 4
   * maximum: 32768
   * @return maxCredNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "Revocation registry size")
  @JsonProperty(JSON_PROPERTY_MAX_CRED_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxCredNum() {
    return maxCredNum;
  }


  @JsonProperty(JSON_PROPERTY_MAX_CRED_NUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxCredNum(Integer maxCredNum) {
    this.maxCredNum = maxCredNum;
  }


  /**
   * Return true if this RevRegCreateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevRegCreateRequest revRegCreateRequest = (RevRegCreateRequest) o;
    return Objects.equals(this.credentialDefinitionId, revRegCreateRequest.credentialDefinitionId) &&
        Objects.equals(this.maxCredNum, revRegCreateRequest.maxCredNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialDefinitionId, maxCredNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevRegCreateRequest {\n");
    sb.append("    credentialDefinitionId: ").append(toIndentedString(credentialDefinitionId)).append("\n");
    sb.append("    maxCredNum: ").append(toIndentedString(maxCredNum)).append("\n");
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


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
import com.ibm.ssi.acapy_client.model.CredentialDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * CredentialDefinitionGetResult
 */
@JsonPropertyOrder({
  CredentialDefinitionGetResult.JSON_PROPERTY_CREDENTIAL_DEFINITION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class CredentialDefinitionGetResult {
  public static final String JSON_PROPERTY_CREDENTIAL_DEFINITION = "credential_definition";
  private CredentialDefinition credentialDefinition;


  public CredentialDefinitionGetResult credentialDefinition(CredentialDefinition credentialDefinition) {
    this.credentialDefinition = credentialDefinition;
    return this;
  }

   /**
   * Get credentialDefinition
   * @return credentialDefinition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREDENTIAL_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CredentialDefinition getCredentialDefinition() {
    return credentialDefinition;
  }


  @JsonProperty(JSON_PROPERTY_CREDENTIAL_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCredentialDefinition(CredentialDefinition credentialDefinition) {
    this.credentialDefinition = credentialDefinition;
  }


  /**
   * Return true if this CredentialDefinitionGetResult object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CredentialDefinitionGetResult credentialDefinitionGetResult = (CredentialDefinitionGetResult) o;
    return Objects.equals(this.credentialDefinition, credentialDefinitionGetResult.credentialDefinition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialDefinition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CredentialDefinitionGetResult {\n");
    sb.append("    credentialDefinition: ").append(toIndentedString(credentialDefinition)).append("\n");
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


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
 * GetNymRoleResponse
 */
@JsonPropertyOrder({
  GetNymRoleResponse.JSON_PROPERTY_ROLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class GetNymRoleResponse {
  /**
   * Ledger role
   */
  public enum RoleEnum {
    STEWARD("STEWARD"),
    
    TRUSTEE("TRUSTEE"),
    
    ENDORSER("ENDORSER"),
    
    NETWORK_MONITOR("NETWORK_MONITOR"),
    
    USER("USER"),
    
    ROLE_REMOVE("ROLE_REMOVE");

    private String value;

    RoleEnum(String value) {
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
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLE = "role";
  private RoleEnum role;


  public GetNymRoleResponse role(RoleEnum role) {
    this.role = role;
    return this;
  }

   /**
   * Ledger role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENDORSER", value = "Ledger role")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RoleEnum getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRole(RoleEnum role) {
    this.role = role;
  }


  /**
   * Return true if this GetNymRoleResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetNymRoleResponse getNymRoleResponse = (GetNymRoleResponse) o;
    return Objects.equals(this.role, getNymRoleResponse.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetNymRoleResponse {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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


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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * MediationGrant
 */
@JsonPropertyOrder({
  MediationGrant.JSON_PROPERTY_AT_ID,
  MediationGrant.JSON_PROPERTY_AT_TYPE,
  MediationGrant.JSON_PROPERTY_ENDPOINT,
  MediationGrant.JSON_PROPERTY_ROUTING_KEYS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class MediationGrant {
  public static final String JSON_PROPERTY_AT_ID = "@id";
  private String atId;

  public static final String JSON_PROPERTY_AT_TYPE = "@type";
  private String atType;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_ROUTING_KEYS = "routing_keys";
  private List<String> routingKeys = null;


  public MediationGrant atId(String atId) {
    this.atId = atId;
    return this;
  }

   /**
   * Message identifier
   * @return atId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Message identifier")
  @JsonProperty(JSON_PROPERTY_AT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAtId() {
    return atId;
  }


  @JsonProperty(JSON_PROPERTY_AT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAtId(String atId) {
    this.atId = atId;
  }


   /**
   * Message type
   * @return atType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://didcomm.org/my-family/1.0/my-message-type", value = "Message type")
  @JsonProperty(JSON_PROPERTY_AT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAtType() {
    return atType;
  }




  public MediationGrant endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

   /**
   * endpoint on which messages destined for the recipient are received.
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://192.168.56.102:8020/", value = "endpoint on which messages destined for the recipient are received.")
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndpoint() {
    return endpoint;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public MediationGrant routingKeys(List<String> routingKeys) {
    this.routingKeys = routingKeys;
    return this;
  }

  public MediationGrant addRoutingKeysItem(String routingKeysItem) {
    if (this.routingKeys == null) {
      this.routingKeys = new ArrayList<>();
    }
    this.routingKeys.add(routingKeysItem);
    return this;
  }

   /**
   * Get routingKeys
   * @return routingKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROUTING_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRoutingKeys() {
    return routingKeys;
  }


  @JsonProperty(JSON_PROPERTY_ROUTING_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoutingKeys(List<String> routingKeys) {
    this.routingKeys = routingKeys;
  }


  /**
   * Return true if this MediationGrant object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediationGrant mediationGrant = (MediationGrant) o;
    return Objects.equals(this.atId, mediationGrant.atId) &&
        Objects.equals(this.atType, mediationGrant.atType) &&
        Objects.equals(this.endpoint, mediationGrant.endpoint) &&
        Objects.equals(this.routingKeys, mediationGrant.routingKeys);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, endpoint, routingKeys);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediationGrant {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    routingKeys: ").append(toIndentedString(routingKeys)).append("\n");
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


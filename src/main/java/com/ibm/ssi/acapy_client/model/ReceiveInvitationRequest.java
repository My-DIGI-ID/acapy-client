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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * ReceiveInvitationRequest
 */
@JsonPropertyOrder({
  ReceiveInvitationRequest.JSON_PROPERTY_AT_ID,
  ReceiveInvitationRequest.JSON_PROPERTY_AT_TYPE,
  ReceiveInvitationRequest.JSON_PROPERTY_DID,
  ReceiveInvitationRequest.JSON_PROPERTY_IMAGE_URL,
  ReceiveInvitationRequest.JSON_PROPERTY_LABEL,
  ReceiveInvitationRequest.JSON_PROPERTY_RECIPIENT_KEYS,
  ReceiveInvitationRequest.JSON_PROPERTY_ROUTING_KEYS,
  ReceiveInvitationRequest.JSON_PROPERTY_SERVICE_ENDPOINT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class ReceiveInvitationRequest {
  public static final String JSON_PROPERTY_AT_ID = "@id";
  private String atId;

  public static final String JSON_PROPERTY_AT_TYPE = "@type";
  private String atType;

  public static final String JSON_PROPERTY_DID = "did";
  private String did;

  public static final String JSON_PROPERTY_IMAGE_URL = "imageUrl";
  private JsonNullable<String> imageUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_RECIPIENT_KEYS = "recipientKeys";
  private List<String> recipientKeys = null;

  public static final String JSON_PROPERTY_ROUTING_KEYS = "routingKeys";
  private List<String> routingKeys = null;

  public static final String JSON_PROPERTY_SERVICE_ENDPOINT = "serviceEndpoint";
  private String serviceEndpoint;


  public ReceiveInvitationRequest atId(String atId) {
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




  public ReceiveInvitationRequest did(String did) {
    this.did = did;
    return this;
  }

   /**
   * DID for connection invitation
   * @return did
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "DID for connection invitation")
  @JsonProperty(JSON_PROPERTY_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDid() {
    return did;
  }


  @JsonProperty(JSON_PROPERTY_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDid(String did) {
    this.did = did;
  }


  public ReceiveInvitationRequest imageUrl(String imageUrl) {
    this.imageUrl = JsonNullable.<String>of(imageUrl);
    return this;
  }

   /**
   * Optional image URL for connection invitation
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://192.168.56.101/img/logo.jpg", value = "Optional image URL for connection invitation")
  @JsonIgnore

  public String getImageUrl() {
        return imageUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getImageUrl_JsonNullable() {
    return imageUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_IMAGE_URL)
  public void setImageUrl_JsonNullable(JsonNullable<String> imageUrl) {
    this.imageUrl = imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = JsonNullable.<String>of(imageUrl);
  }


  public ReceiveInvitationRequest label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Optional label for connection invitation
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Bob", value = "Optional label for connection invitation")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public ReceiveInvitationRequest recipientKeys(List<String> recipientKeys) {
    this.recipientKeys = recipientKeys;
    return this;
  }

  public ReceiveInvitationRequest addRecipientKeysItem(String recipientKeysItem) {
    if (this.recipientKeys == null) {
      this.recipientKeys = new ArrayList<>();
    }
    this.recipientKeys.add(recipientKeysItem);
    return this;
  }

   /**
   * List of recipient keys
   * @return recipientKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of recipient keys")
  @JsonProperty(JSON_PROPERTY_RECIPIENT_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRecipientKeys() {
    return recipientKeys;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_KEYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientKeys(List<String> recipientKeys) {
    this.recipientKeys = recipientKeys;
  }


  public ReceiveInvitationRequest routingKeys(List<String> routingKeys) {
    this.routingKeys = routingKeys;
    return this;
  }

  public ReceiveInvitationRequest addRoutingKeysItem(String routingKeysItem) {
    if (this.routingKeys == null) {
      this.routingKeys = new ArrayList<>();
    }
    this.routingKeys.add(routingKeysItem);
    return this;
  }

   /**
   * List of routing keys
   * @return routingKeys
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of routing keys")
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


  public ReceiveInvitationRequest serviceEndpoint(String serviceEndpoint) {
    this.serviceEndpoint = serviceEndpoint;
    return this;
  }

   /**
   * Service endpoint at which to reach this agent
   * @return serviceEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://192.168.56.101:8020", value = "Service endpoint at which to reach this agent")
  @JsonProperty(JSON_PROPERTY_SERVICE_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceEndpoint() {
    return serviceEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceEndpoint(String serviceEndpoint) {
    this.serviceEndpoint = serviceEndpoint;
  }


  /**
   * Return true if this ReceiveInvitationRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiveInvitationRequest receiveInvitationRequest = (ReceiveInvitationRequest) o;
    return Objects.equals(this.atId, receiveInvitationRequest.atId) &&
        Objects.equals(this.atType, receiveInvitationRequest.atType) &&
        Objects.equals(this.did, receiveInvitationRequest.did) &&
        Objects.equals(this.imageUrl, receiveInvitationRequest.imageUrl) &&
        Objects.equals(this.label, receiveInvitationRequest.label) &&
        Objects.equals(this.recipientKeys, receiveInvitationRequest.recipientKeys) &&
        Objects.equals(this.routingKeys, receiveInvitationRequest.routingKeys) &&
        Objects.equals(this.serviceEndpoint, receiveInvitationRequest.serviceEndpoint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, did, imageUrl, label, recipientKeys, routingKeys, serviceEndpoint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiveInvitationRequest {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    did: ").append(toIndentedString(did)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    recipientKeys: ").append(toIndentedString(recipientKeys)).append("\n");
    sb.append("    routingKeys: ").append(toIndentedString(routingKeys)).append("\n");
    sb.append("    serviceEndpoint: ").append(toIndentedString(serviceEndpoint)).append("\n");
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


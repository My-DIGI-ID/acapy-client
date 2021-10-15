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
 * ConnectionStaticRequest
 */
@JsonPropertyOrder({
  ConnectionStaticRequest.JSON_PROPERTY_ALIAS,
  ConnectionStaticRequest.JSON_PROPERTY_MY_DID,
  ConnectionStaticRequest.JSON_PROPERTY_MY_SEED,
  ConnectionStaticRequest.JSON_PROPERTY_THEIR_DID,
  ConnectionStaticRequest.JSON_PROPERTY_THEIR_ENDPOINT,
  ConnectionStaticRequest.JSON_PROPERTY_THEIR_LABEL,
  ConnectionStaticRequest.JSON_PROPERTY_THEIR_SEED,
  ConnectionStaticRequest.JSON_PROPERTY_THEIR_VERKEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class ConnectionStaticRequest {
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_MY_DID = "my_did";
  private String myDid;

  public static final String JSON_PROPERTY_MY_SEED = "my_seed";
  private String mySeed;

  public static final String JSON_PROPERTY_THEIR_DID = "their_did";
  private String theirDid;

  public static final String JSON_PROPERTY_THEIR_ENDPOINT = "their_endpoint";
  private String theirEndpoint;

  public static final String JSON_PROPERTY_THEIR_LABEL = "their_label";
  private String theirLabel;

  public static final String JSON_PROPERTY_THEIR_SEED = "their_seed";
  private String theirSeed;

  public static final String JSON_PROPERTY_THEIR_VERKEY = "their_verkey";
  private String theirVerkey;


  public ConnectionStaticRequest alias(String alias) {
    this.alias = alias;
    return this;
  }

   /**
   * Alias to assign to this connection
   * @return alias
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Alias to assign to this connection")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlias() {
    return alias;
  }


  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlias(String alias) {
    this.alias = alias;
  }


  public ConnectionStaticRequest myDid(String myDid) {
    this.myDid = myDid;
    return this;
  }

   /**
   * Local DID
   * @return myDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "Local DID")
  @JsonProperty(JSON_PROPERTY_MY_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMyDid() {
    return myDid;
  }


  @JsonProperty(JSON_PROPERTY_MY_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyDid(String myDid) {
    this.myDid = myDid;
  }


  public ConnectionStaticRequest mySeed(String mySeed) {
    this.mySeed = mySeed;
    return this;
  }

   /**
   * Seed to use for the local DID
   * @return mySeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seed to use for the local DID")
  @JsonProperty(JSON_PROPERTY_MY_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMySeed() {
    return mySeed;
  }


  @JsonProperty(JSON_PROPERTY_MY_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMySeed(String mySeed) {
    this.mySeed = mySeed;
  }


  public ConnectionStaticRequest theirDid(String theirDid) {
    this.theirDid = theirDid;
    return this;
  }

   /**
   * Remote DID
   * @return theirDid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv", value = "Remote DID")
  @JsonProperty(JSON_PROPERTY_THEIR_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTheirDid() {
    return theirDid;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_DID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirDid(String theirDid) {
    this.theirDid = theirDid;
  }


  public ConnectionStaticRequest theirEndpoint(String theirEndpoint) {
    this.theirEndpoint = theirEndpoint;
    return this;
  }

   /**
   * URL endpoint for other party
   * @return theirEndpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://myhost:8021", value = "URL endpoint for other party")
  @JsonProperty(JSON_PROPERTY_THEIR_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTheirEndpoint() {
    return theirEndpoint;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirEndpoint(String theirEndpoint) {
    this.theirEndpoint = theirEndpoint;
  }


  public ConnectionStaticRequest theirLabel(String theirLabel) {
    this.theirLabel = theirLabel;
    return this;
  }

   /**
   * Other party&#39;s label for this connection
   * @return theirLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Other party's label for this connection")
  @JsonProperty(JSON_PROPERTY_THEIR_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTheirLabel() {
    return theirLabel;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirLabel(String theirLabel) {
    this.theirLabel = theirLabel;
  }


  public ConnectionStaticRequest theirSeed(String theirSeed) {
    this.theirSeed = theirSeed;
    return this;
  }

   /**
   * Seed to use for the remote DID
   * @return theirSeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Seed to use for the remote DID")
  @JsonProperty(JSON_PROPERTY_THEIR_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTheirSeed() {
    return theirSeed;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_SEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirSeed(String theirSeed) {
    this.theirSeed = theirSeed;
  }


  public ConnectionStaticRequest theirVerkey(String theirVerkey) {
    this.theirVerkey = theirVerkey;
    return this;
  }

   /**
   * Remote verification key
   * @return theirVerkey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Remote verification key")
  @JsonProperty(JSON_PROPERTY_THEIR_VERKEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTheirVerkey() {
    return theirVerkey;
  }


  @JsonProperty(JSON_PROPERTY_THEIR_VERKEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTheirVerkey(String theirVerkey) {
    this.theirVerkey = theirVerkey;
  }


  /**
   * Return true if this ConnectionStaticRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectionStaticRequest connectionStaticRequest = (ConnectionStaticRequest) o;
    return Objects.equals(this.alias, connectionStaticRequest.alias) &&
        Objects.equals(this.myDid, connectionStaticRequest.myDid) &&
        Objects.equals(this.mySeed, connectionStaticRequest.mySeed) &&
        Objects.equals(this.theirDid, connectionStaticRequest.theirDid) &&
        Objects.equals(this.theirEndpoint, connectionStaticRequest.theirEndpoint) &&
        Objects.equals(this.theirLabel, connectionStaticRequest.theirLabel) &&
        Objects.equals(this.theirSeed, connectionStaticRequest.theirSeed) &&
        Objects.equals(this.theirVerkey, connectionStaticRequest.theirVerkey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, myDid, mySeed, theirDid, theirEndpoint, theirLabel, theirSeed, theirVerkey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectionStaticRequest {\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    myDid: ").append(toIndentedString(myDid)).append("\n");
    sb.append("    mySeed: ").append(toIndentedString(mySeed)).append("\n");
    sb.append("    theirDid: ").append(toIndentedString(theirDid)).append("\n");
    sb.append("    theirEndpoint: ").append(toIndentedString(theirEndpoint)).append("\n");
    sb.append("    theirLabel: ").append(toIndentedString(theirLabel)).append("\n");
    sb.append("    theirSeed: ").append(toIndentedString(theirSeed)).append("\n");
    sb.append("    theirVerkey: ").append(toIndentedString(theirVerkey)).append("\n");
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


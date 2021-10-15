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
 * MediationCreateRequest
 */
@JsonPropertyOrder({
  MediationCreateRequest.JSON_PROPERTY_MEDIATOR_TERMS,
  MediationCreateRequest.JSON_PROPERTY_RECIPIENT_TERMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class MediationCreateRequest {
  public static final String JSON_PROPERTY_MEDIATOR_TERMS = "mediator_terms";
  private List<String> mediatorTerms = null;

  public static final String JSON_PROPERTY_RECIPIENT_TERMS = "recipient_terms";
  private List<String> recipientTerms = null;


  public MediationCreateRequest mediatorTerms(List<String> mediatorTerms) {
    this.mediatorTerms = mediatorTerms;
    return this;
  }

  public MediationCreateRequest addMediatorTermsItem(String mediatorTermsItem) {
    if (this.mediatorTerms == null) {
      this.mediatorTerms = new ArrayList<>();
    }
    this.mediatorTerms.add(mediatorTermsItem);
    return this;
  }

   /**
   * List of mediator rules for recipient
   * @return mediatorTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of mediator rules for recipient")
  @JsonProperty(JSON_PROPERTY_MEDIATOR_TERMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getMediatorTerms() {
    return mediatorTerms;
  }


  @JsonProperty(JSON_PROPERTY_MEDIATOR_TERMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMediatorTerms(List<String> mediatorTerms) {
    this.mediatorTerms = mediatorTerms;
  }


  public MediationCreateRequest recipientTerms(List<String> recipientTerms) {
    this.recipientTerms = recipientTerms;
    return this;
  }

  public MediationCreateRequest addRecipientTermsItem(String recipientTermsItem) {
    if (this.recipientTerms == null) {
      this.recipientTerms = new ArrayList<>();
    }
    this.recipientTerms.add(recipientTermsItem);
    return this;
  }

   /**
   * List of recipient rules for mediation
   * @return recipientTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of recipient rules for mediation")
  @JsonProperty(JSON_PROPERTY_RECIPIENT_TERMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRecipientTerms() {
    return recipientTerms;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_TERMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientTerms(List<String> recipientTerms) {
    this.recipientTerms = recipientTerms;
  }


  /**
   * Return true if this MediationCreateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediationCreateRequest mediationCreateRequest = (MediationCreateRequest) o;
    return Objects.equals(this.mediatorTerms, mediationCreateRequest.mediatorTerms) &&
        Objects.equals(this.recipientTerms, mediationCreateRequest.recipientTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediatorTerms, recipientTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediationCreateRequest {\n");
    sb.append("    mediatorTerms: ").append(toIndentedString(mediatorTerms)).append("\n");
    sb.append("    recipientTerms: ").append(toIndentedString(recipientTerms)).append("\n");
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


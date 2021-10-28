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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * W3CCredentialsListRequest
 */
@JsonPropertyOrder({
  W3CCredentialsListRequest.JSON_PROPERTY_CONTEXTS,
  W3CCredentialsListRequest.JSON_PROPERTY_GIVEN_ID,
  W3CCredentialsListRequest.JSON_PROPERTY_ISSUER_ID,
  W3CCredentialsListRequest.JSON_PROPERTY_MAX_RESULTS,
  W3CCredentialsListRequest.JSON_PROPERTY_PROOF_TYPES,
  W3CCredentialsListRequest.JSON_PROPERTY_SCHEMA_IDS,
  W3CCredentialsListRequest.JSON_PROPERTY_SUBJECT_IDS,
  W3CCredentialsListRequest.JSON_PROPERTY_TAG_QUERY,
  W3CCredentialsListRequest.JSON_PROPERTY_TYPES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class W3CCredentialsListRequest {
  public static final String JSON_PROPERTY_CONTEXTS = "contexts";
  private List<String> contexts = null;

  public static final String JSON_PROPERTY_GIVEN_ID = "given_id";
  private String givenId;

  public static final String JSON_PROPERTY_ISSUER_ID = "issuer_id";
  private String issuerId;

  public static final String JSON_PROPERTY_MAX_RESULTS = "max_results";
  private Integer maxResults;

  public static final String JSON_PROPERTY_PROOF_TYPES = "proof_types";
  private List<String> proofTypes = null;

  public static final String JSON_PROPERTY_SCHEMA_IDS = "schema_ids";
  private List<String> schemaIds = null;

  public static final String JSON_PROPERTY_SUBJECT_IDS = "subject_ids";
  private List<String> subjectIds = null;

  public static final String JSON_PROPERTY_TAG_QUERY = "tag_query";
  private Map<String, String> tagQuery = null;

  public static final String JSON_PROPERTY_TYPES = "types";
  private List<String> types = null;


  public W3CCredentialsListRequest contexts(List<String> contexts) {
    this.contexts = contexts;
    return this;
  }

  public W3CCredentialsListRequest addContextsItem(String contextsItem) {
    if (this.contexts == null) {
      this.contexts = new ArrayList<>();
    }
    this.contexts.add(contextsItem);
    return this;
  }

   /**
   * Get contexts
   * @return contexts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTEXTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getContexts() {
    return contexts;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContexts(List<String> contexts) {
    this.contexts = contexts;
  }


  public W3CCredentialsListRequest givenId(String givenId) {
    this.givenId = givenId;
    return this;
  }

   /**
   * Given credential id to match
   * @return givenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Given credential id to match")
  @JsonProperty(JSON_PROPERTY_GIVEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenId() {
    return givenId;
  }


  @JsonProperty(JSON_PROPERTY_GIVEN_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGivenId(String givenId) {
    this.givenId = givenId;
  }


  public W3CCredentialsListRequest issuerId(String issuerId) {
    this.issuerId = issuerId;
    return this;
  }

   /**
   * Credential issuer identifier to match
   * @return issuerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Credential issuer identifier to match")
  @JsonProperty(JSON_PROPERTY_ISSUER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIssuerId() {
    return issuerId;
  }


  @JsonProperty(JSON_PROPERTY_ISSUER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIssuerId(String issuerId) {
    this.issuerId = issuerId;
  }


  public W3CCredentialsListRequest maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * Maximum number of results to return
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum number of results to return")
  @JsonProperty(JSON_PROPERTY_MAX_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxResults() {
    return maxResults;
  }


  @JsonProperty(JSON_PROPERTY_MAX_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }


  public W3CCredentialsListRequest proofTypes(List<String> proofTypes) {
    this.proofTypes = proofTypes;
    return this;
  }

  public W3CCredentialsListRequest addProofTypesItem(String proofTypesItem) {
    if (this.proofTypes == null) {
      this.proofTypes = new ArrayList<>();
    }
    this.proofTypes.add(proofTypesItem);
    return this;
  }

   /**
   * Get proofTypes
   * @return proofTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROOF_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getProofTypes() {
    return proofTypes;
  }


  @JsonProperty(JSON_PROPERTY_PROOF_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProofTypes(List<String> proofTypes) {
    this.proofTypes = proofTypes;
  }


  public W3CCredentialsListRequest schemaIds(List<String> schemaIds) {
    this.schemaIds = schemaIds;
    return this;
  }

  public W3CCredentialsListRequest addSchemaIdsItem(String schemaIdsItem) {
    if (this.schemaIds == null) {
      this.schemaIds = new ArrayList<>();
    }
    this.schemaIds.add(schemaIdsItem);
    return this;
  }

   /**
   * Schema identifiers, all of which to match
   * @return schemaIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Schema identifiers, all of which to match")
  @JsonProperty(JSON_PROPERTY_SCHEMA_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSchemaIds() {
    return schemaIds;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchemaIds(List<String> schemaIds) {
    this.schemaIds = schemaIds;
  }


  public W3CCredentialsListRequest subjectIds(List<String> subjectIds) {
    this.subjectIds = subjectIds;
    return this;
  }

  public W3CCredentialsListRequest addSubjectIdsItem(String subjectIdsItem) {
    if (this.subjectIds == null) {
      this.subjectIds = new ArrayList<>();
    }
    this.subjectIds.add(subjectIdsItem);
    return this;
  }

   /**
   * Subject identifiers, all of which to match
   * @return subjectIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject identifiers, all of which to match")
  @JsonProperty(JSON_PROPERTY_SUBJECT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubjectIds() {
    return subjectIds;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubjectIds(List<String> subjectIds) {
    this.subjectIds = subjectIds;
  }


  public W3CCredentialsListRequest tagQuery(Map<String, String> tagQuery) {
    this.tagQuery = tagQuery;
    return this;
  }

  public W3CCredentialsListRequest putTagQueryItem(String key, String tagQueryItem) {
    if (this.tagQuery == null) {
      this.tagQuery = new HashMap<>();
    }
    this.tagQuery.put(key, tagQueryItem);
    return this;
  }

   /**
   * Tag filter
   * @return tagQuery
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tag filter")
  @JsonProperty(JSON_PROPERTY_TAG_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getTagQuery() {
    return tagQuery;
  }


  @JsonProperty(JSON_PROPERTY_TAG_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTagQuery(Map<String, String> tagQuery) {
    this.tagQuery = tagQuery;
  }


  public W3CCredentialsListRequest types(List<String> types) {
    this.types = types;
    return this;
  }

  public W3CCredentialsListRequest addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getTypes() {
    return types;
  }


  @JsonProperty(JSON_PROPERTY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTypes(List<String> types) {
    this.types = types;
  }


  /**
   * Return true if this W3CCredentialsListRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    W3CCredentialsListRequest w3CCredentialsListRequest = (W3CCredentialsListRequest) o;
    return Objects.equals(this.contexts, w3CCredentialsListRequest.contexts) &&
        Objects.equals(this.givenId, w3CCredentialsListRequest.givenId) &&
        Objects.equals(this.issuerId, w3CCredentialsListRequest.issuerId) &&
        Objects.equals(this.maxResults, w3CCredentialsListRequest.maxResults) &&
        Objects.equals(this.proofTypes, w3CCredentialsListRequest.proofTypes) &&
        Objects.equals(this.schemaIds, w3CCredentialsListRequest.schemaIds) &&
        Objects.equals(this.subjectIds, w3CCredentialsListRequest.subjectIds) &&
        Objects.equals(this.tagQuery, w3CCredentialsListRequest.tagQuery) &&
        Objects.equals(this.types, w3CCredentialsListRequest.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contexts, givenId, issuerId, maxResults, proofTypes, schemaIds, subjectIds, tagQuery, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class W3CCredentialsListRequest {\n");
    sb.append("    contexts: ").append(toIndentedString(contexts)).append("\n");
    sb.append("    givenId: ").append(toIndentedString(givenId)).append("\n");
    sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    proofTypes: ").append(toIndentedString(proofTypes)).append("\n");
    sb.append("    schemaIds: ").append(toIndentedString(schemaIds)).append("\n");
    sb.append("    subjectIds: ").append(toIndentedString(subjectIds)).append("\n");
    sb.append("    tagQuery: ").append(toIndentedString(tagQuery)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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


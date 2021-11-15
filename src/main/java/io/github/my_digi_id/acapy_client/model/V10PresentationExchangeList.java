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


package io.github.my_digi_id.acapy_client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.my_digi_id.acapy_client.model.V10PresentationExchange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.my_digi_id.acapy_client.invoker.JSON;


/**
 * V10PresentationExchangeList
 */
@JsonPropertyOrder({
  V10PresentationExchangeList.JSON_PROPERTY_RESULTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T14:46:41.984298+01:00[Europe/Berlin]")
public class V10PresentationExchangeList {
  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<V10PresentationExchange> results = null;


  public V10PresentationExchangeList results(List<V10PresentationExchange> results) {
    this.results = results;
    return this;
  }

  public V10PresentationExchangeList addResultsItem(V10PresentationExchange resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Aries RFC 37 v1.0 presentation exchange records
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Aries RFC 37 v1.0 presentation exchange records")
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<V10PresentationExchange> getResults() {
    return results;
  }


  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResults(List<V10PresentationExchange> results) {
    this.results = results;
  }


  /**
   * Return true if this V10PresentationExchangeList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V10PresentationExchangeList v10PresentationExchangeList = (V10PresentationExchangeList) o;
    return Objects.equals(this.results, v10PresentationExchangeList.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V10PresentationExchangeList {\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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

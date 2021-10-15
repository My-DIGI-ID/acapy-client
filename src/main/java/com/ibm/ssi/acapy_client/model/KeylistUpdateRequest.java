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
import com.ibm.ssi.acapy_client.model.KeylistUpdateRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * KeylistUpdateRequest
 */
@JsonPropertyOrder({
  KeylistUpdateRequest.JSON_PROPERTY_UPDATES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class KeylistUpdateRequest {
  public static final String JSON_PROPERTY_UPDATES = "updates";
  private List<KeylistUpdateRule> updates = null;


  public KeylistUpdateRequest updates(List<KeylistUpdateRule> updates) {
    this.updates = updates;
    return this;
  }

  public KeylistUpdateRequest addUpdatesItem(KeylistUpdateRule updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }
    this.updates.add(updatesItem);
    return this;
  }

   /**
   * Get updates
   * @return updates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<KeylistUpdateRule> getUpdates() {
    return updates;
  }


  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdates(List<KeylistUpdateRule> updates) {
    this.updates = updates;
  }


  /**
   * Return true if this KeylistUpdateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeylistUpdateRequest keylistUpdateRequest = (KeylistUpdateRequest) o;
    return Objects.equals(this.updates, keylistUpdateRequest.updates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeylistUpdateRequest {\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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


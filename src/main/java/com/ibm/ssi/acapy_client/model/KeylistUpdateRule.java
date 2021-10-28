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
 * KeylistUpdateRule
 */
@JsonPropertyOrder({
  KeylistUpdateRule.JSON_PROPERTY_ACTION,
  KeylistUpdateRule.JSON_PROPERTY_RECIPIENT_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-28T08:24:27.640452+02:00[Europe/Berlin]")
public class KeylistUpdateRule {
  /**
   * Action for specific key
   */
  public enum ActionEnum {
    ADD("add"),
    
    REMOVE("remove");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACTION = "action";
  private ActionEnum action;

  public static final String JSON_PROPERTY_RECIPIENT_KEY = "recipient_key";
  private String recipientKey;


  public KeylistUpdateRule action(ActionEnum action) {
    this.action = action;
    return this;
  }

   /**
   * Action for specific key
   * @return action
  **/
  @ApiModelProperty(example = "add", required = true, value = "Action for specific key")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ActionEnum getAction() {
    return action;
  }


  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  public KeylistUpdateRule recipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
    return this;
  }

   /**
   * Key to remove or add
   * @return recipientKey
  **/
  @ApiModelProperty(example = "H3C2AVvLMv6gmMNam3uVAjZpfkcJCwDwnZn6z3wXmqPV", required = true, value = "Key to remove or add")
  @JsonProperty(JSON_PROPERTY_RECIPIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRecipientKey() {
    return recipientKey;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRecipientKey(String recipientKey) {
    this.recipientKey = recipientKey;
  }


  /**
   * Return true if this KeylistUpdateRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeylistUpdateRule keylistUpdateRule = (KeylistUpdateRule) o;
    return Objects.equals(this.action, keylistUpdateRule.action) &&
        Objects.equals(this.recipientKey, keylistUpdateRule.recipientKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, recipientKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeylistUpdateRule {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    recipientKey: ").append(toIndentedString(recipientKey)).append("\n");
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


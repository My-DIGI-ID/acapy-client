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
import com.ibm.ssi.acapy_client.model.MenuOption;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * Menu
 */
@JsonPropertyOrder({
  Menu.JSON_PROPERTY_AT_ID,
  Menu.JSON_PROPERTY_AT_TYPE,
  Menu.JSON_PROPERTY_DESCRIPTION,
  Menu.JSON_PROPERTY_ERRORMSG,
  Menu.JSON_PROPERTY_OPTIONS,
  Menu.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class Menu {
  public static final String JSON_PROPERTY_AT_ID = "@id";
  private String atId;

  public static final String JSON_PROPERTY_AT_TYPE = "@type";
  private String atType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ERRORMSG = "errormsg";
  private String errormsg;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private List<MenuOption> options = new ArrayList<>();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;


  public Menu atId(String atId) {
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




  public Menu description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Introductory text for the menu
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "This menu presents options", value = "Introductory text for the menu")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Menu errormsg(String errormsg) {
    this.errormsg = errormsg;
    return this;
  }

   /**
   * An optional error message to display in menu header
   * @return errormsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Error: item not found", value = "An optional error message to display in menu header")
  @JsonProperty(JSON_PROPERTY_ERRORMSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrormsg() {
    return errormsg;
  }


  @JsonProperty(JSON_PROPERTY_ERRORMSG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrormsg(String errormsg) {
    this.errormsg = errormsg;
  }


  public Menu options(List<MenuOption> options) {
    this.options = options;
    return this;
  }

  public Menu addOptionsItem(MenuOption optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

   /**
   * List of menu options
   * @return options
  **/
  @ApiModelProperty(required = true, value = "List of menu options")
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MenuOption> getOptions() {
    return options;
  }


  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptions(List<MenuOption> options) {
    this.options = options;
  }


  public Menu title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Menu title
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Menu", value = "Menu title")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this Menu object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Menu menu = (Menu) o;
    return Objects.equals(this.atId, menu.atId) &&
        Objects.equals(this.atType, menu.atType) &&
        Objects.equals(this.description, menu.description) &&
        Objects.equals(this.errormsg, menu.errormsg) &&
        Objects.equals(this.options, menu.options) &&
        Objects.equals(this.title, menu.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, description, errormsg, options, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Menu {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    errormsg: ").append(toIndentedString(errormsg)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

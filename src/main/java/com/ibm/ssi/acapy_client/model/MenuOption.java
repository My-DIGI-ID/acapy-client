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
import com.ibm.ssi.acapy_client.model.MenuForm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * MenuOption
 */
@JsonPropertyOrder({
  MenuOption.JSON_PROPERTY_DESCRIPTION,
  MenuOption.JSON_PROPERTY_DISABLED,
  MenuOption.JSON_PROPERTY_FORM,
  MenuOption.JSON_PROPERTY_NAME,
  MenuOption.JSON_PROPERTY_TITLE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class MenuOption {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_FORM = "form";
  private MenuForm form;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;


  public MenuOption description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Additional descriptive text for menu option
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Window display preferences", value = "Additional descriptive text for menu option")
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


  public MenuOption disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

   /**
   * Whether to show option as disabled
   * @return disabled
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether to show option as disabled")
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDisabled() {
    return disabled;
  }


  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  public MenuOption form(MenuForm form) {
    this.form = form;
    return this;
  }

   /**
   * Get form
   * @return form
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MenuForm getForm() {
    return form;
  }


  @JsonProperty(JSON_PROPERTY_FORM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForm(MenuForm form) {
    this.form = form;
  }


  public MenuOption name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Menu option name (unique identifier)
   * @return name
  **/
  @ApiModelProperty(example = "window_prefs", required = true, value = "Menu option name (unique identifier)")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public MenuOption title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Menu option title
   * @return title
  **/
  @ApiModelProperty(example = "Window Preferences", required = true, value = "Menu option title")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Return true if this MenuOption object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MenuOption menuOption = (MenuOption) o;
    return Objects.equals(this.description, menuOption.description) &&
        Objects.equals(this.disabled, menuOption.disabled) &&
        Objects.equals(this.form, menuOption.form) &&
        Objects.equals(this.name, menuOption.name) &&
        Objects.equals(this.title, menuOption.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, disabled, form, name, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MenuOption {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    form: ").append(toIndentedString(form)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


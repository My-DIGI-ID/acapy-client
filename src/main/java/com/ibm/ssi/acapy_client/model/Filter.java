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
 * Filter
 */
@JsonPropertyOrder({
  Filter.JSON_PROPERTY_CONST,
  Filter.JSON_PROPERTY_ENUM,
  Filter.JSON_PROPERTY_EXCLUSIVE_MAXIMUM,
  Filter.JSON_PROPERTY_EXCLUSIVE_MINIMUM,
  Filter.JSON_PROPERTY_FORMAT,
  Filter.JSON_PROPERTY_MAX_LENGTH,
  Filter.JSON_PROPERTY_MAXIMUM,
  Filter.JSON_PROPERTY_MIN_LENGTH,
  Filter.JSON_PROPERTY_MINIMUM,
  Filter.JSON_PROPERTY_NOT,
  Filter.JSON_PROPERTY_PATTERN,
  Filter.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class Filter {
  public static final String JSON_PROPERTY_CONST = "const";
  private Object _const;

  public static final String JSON_PROPERTY_ENUM = "enum";
  private List<Object> _enum = null;

  public static final String JSON_PROPERTY_EXCLUSIVE_MAXIMUM = "exclusiveMaximum";
  private Object exclusiveMaximum;

  public static final String JSON_PROPERTY_EXCLUSIVE_MINIMUM = "exclusiveMinimum";
  private Object exclusiveMinimum;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private String format;

  public static final String JSON_PROPERTY_MAX_LENGTH = "maxLength";
  private Integer maxLength;

  public static final String JSON_PROPERTY_MAXIMUM = "maximum";
  private Object maximum;

  public static final String JSON_PROPERTY_MIN_LENGTH = "minLength";
  private Integer minLength;

  public static final String JSON_PROPERTY_MINIMUM = "minimum";
  private Object minimum;

  public static final String JSON_PROPERTY_NOT = "not";
  private Boolean not;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;


  public Filter _const(Object _const) {
    this._const = _const;
    return this;
  }

   /**
   * Const
   * @return _const
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Const")
  @JsonProperty(JSON_PROPERTY_CONST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getConst() {
    return _const;
  }


  @JsonProperty(JSON_PROPERTY_CONST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConst(Object _const) {
    this._const = _const;
  }


  public Filter _enum(List<Object> _enum) {
    this._enum = _enum;
    return this;
  }

  public Filter addEnumItem(Object _enumItem) {
    if (this._enum == null) {
      this._enum = new ArrayList<>();
    }
    this._enum.add(_enumItem);
    return this;
  }

   /**
   * Get _enum
   * @return _enum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getEnum() {
    return _enum;
  }


  @JsonProperty(JSON_PROPERTY_ENUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnum(List<Object> _enum) {
    this._enum = _enum;
  }


  public Filter exclusiveMaximum(Object exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
    return this;
  }

   /**
   * ExclusiveMaximum
   * @return exclusiveMaximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExclusiveMaximum")
  @JsonProperty(JSON_PROPERTY_EXCLUSIVE_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getExclusiveMaximum() {
    return exclusiveMaximum;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUSIVE_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclusiveMaximum(Object exclusiveMaximum) {
    this.exclusiveMaximum = exclusiveMaximum;
  }


  public Filter exclusiveMinimum(Object exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
    return this;
  }

   /**
   * ExclusiveMinimum
   * @return exclusiveMinimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ExclusiveMinimum")
  @JsonProperty(JSON_PROPERTY_EXCLUSIVE_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getExclusiveMinimum() {
    return exclusiveMinimum;
  }


  @JsonProperty(JSON_PROPERTY_EXCLUSIVE_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExclusiveMinimum(Object exclusiveMinimum) {
    this.exclusiveMinimum = exclusiveMinimum;
  }


  public Filter format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Format")
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormat() {
    return format;
  }


  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormat(String format) {
    this.format = format;
  }


  public Filter maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * Max Length
   * @return maxLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Max Length")
  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxLength() {
    return maxLength;
  }


  @JsonProperty(JSON_PROPERTY_MAX_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }


  public Filter maximum(Object maximum) {
    this.maximum = maximum;
    return this;
  }

   /**
   * Maximum
   * @return maximum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maximum")
  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMaximum() {
    return maximum;
  }


  @JsonProperty(JSON_PROPERTY_MAXIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaximum(Object maximum) {
    this.maximum = maximum;
  }


  public Filter minLength(Integer minLength) {
    this.minLength = minLength;
    return this;
  }

   /**
   * Min Length
   * @return minLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234", value = "Min Length")
  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinLength() {
    return minLength;
  }


  @JsonProperty(JSON_PROPERTY_MIN_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinLength(Integer minLength) {
    this.minLength = minLength;
  }


  public Filter minimum(Object minimum) {
    this.minimum = minimum;
    return this;
  }

   /**
   * Minimum
   * @return minimum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Minimum")
  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMinimum() {
    return minimum;
  }


  @JsonProperty(JSON_PROPERTY_MINIMUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinimum(Object minimum) {
    this.minimum = minimum;
  }


  public Filter not(Boolean not) {
    this.not = not;
    return this;
  }

   /**
   * Not
   * @return not
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Not")
  @JsonProperty(JSON_PROPERTY_NOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNot() {
    return not;
  }


  @JsonProperty(JSON_PROPERTY_NOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNot(Boolean not) {
    this.not = not;
  }


  public Filter pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

   /**
   * Pattern
   * @return pattern
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pattern")
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPattern() {
    return pattern;
  }


  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public Filter type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Return true if this Filter object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Filter filter = (Filter) o;
    return Objects.equals(this._const, filter._const) &&
        Objects.equals(this._enum, filter._enum) &&
        Objects.equals(this.exclusiveMaximum, filter.exclusiveMaximum) &&
        Objects.equals(this.exclusiveMinimum, filter.exclusiveMinimum) &&
        Objects.equals(this.format, filter.format) &&
        Objects.equals(this.maxLength, filter.maxLength) &&
        Objects.equals(this.maximum, filter.maximum) &&
        Objects.equals(this.minLength, filter.minLength) &&
        Objects.equals(this.minimum, filter.minimum) &&
        Objects.equals(this.not, filter.not) &&
        Objects.equals(this.pattern, filter.pattern) &&
        Objects.equals(this.type, filter.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_const, _enum, exclusiveMaximum, exclusiveMinimum, format, maxLength, maximum, minLength, minimum, not, pattern, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Filter {\n");
    sb.append("    _const: ").append(toIndentedString(_const)).append("\n");
    sb.append("    _enum: ").append(toIndentedString(_enum)).append("\n");
    sb.append("    exclusiveMaximum: ").append(toIndentedString(exclusiveMaximum)).append("\n");
    sb.append("    exclusiveMinimum: ").append(toIndentedString(exclusiveMinimum)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maximum: ").append(toIndentedString(maximum)).append("\n");
    sb.append("    minLength: ").append(toIndentedString(minLength)).append("\n");
    sb.append("    minimum: ").append(toIndentedString(minimum)).append("\n");
    sb.append("    not: ").append(toIndentedString(not)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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


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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.my_digi_id.acapy_client.invoker.JSON;


/**
 * Schema
 */
@JsonPropertyOrder({
  Schema.JSON_PROPERTY_ATTR_NAMES,
  Schema.JSON_PROPERTY_ID,
  Schema.JSON_PROPERTY_NAME,
  Schema.JSON_PROPERTY_SEQ_NO,
  Schema.JSON_PROPERTY_VER,
  Schema.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T14:46:41.984298+01:00[Europe/Berlin]")
public class Schema {
  public static final String JSON_PROPERTY_ATTR_NAMES = "attrNames";
  private List<String> attrNames = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEQ_NO = "seqNo";
  private Integer seqNo;

  public static final String JSON_PROPERTY_VER = "ver";
  private String ver;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;


  public Schema attrNames(List<String> attrNames) {
    this.attrNames = attrNames;
    return this;
  }

  public Schema addAttrNamesItem(String attrNamesItem) {
    if (this.attrNames == null) {
      this.attrNames = new ArrayList<>();
    }
    this.attrNames.add(attrNamesItem);
    return this;
  }

   /**
   * Schema attribute names
   * @return attrNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Schema attribute names")
  @JsonProperty(JSON_PROPERTY_ATTR_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAttrNames() {
    return attrNames;
  }


  @JsonProperty(JSON_PROPERTY_ATTR_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttrNames(List<String> attrNames) {
    this.attrNames = attrNames;
  }


  public Schema id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Schema identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "WgWxqztrNooG92RXvxSTWv:2:schema_name:1.0", value = "Schema identifier")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Schema name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Schema name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "schema_name", value = "Schema name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Schema seqNo(Integer seqNo) {
    this.seqNo = seqNo;
    return this;
  }

   /**
   * Schema sequence number
   * minimum: 1
   * @return seqNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "Schema sequence number")
  @JsonProperty(JSON_PROPERTY_SEQ_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSeqNo() {
    return seqNo;
  }


  @JsonProperty(JSON_PROPERTY_SEQ_NO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeqNo(Integer seqNo) {
    this.seqNo = seqNo;
  }


  public Schema ver(String ver) {
    this.ver = ver;
    return this;
  }

   /**
   * Node protocol version
   * @return ver
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Node protocol version")
  @JsonProperty(JSON_PROPERTY_VER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVer() {
    return ver;
  }


  @JsonProperty(JSON_PROPERTY_VER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVer(String ver) {
    this.ver = ver;
  }


  public Schema version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Schema version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.0", value = "Schema version")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this Schema object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Schema schema = (Schema) o;
    return Objects.equals(this.attrNames, schema.attrNames) &&
        Objects.equals(this.id, schema.id) &&
        Objects.equals(this.name, schema.name) &&
        Objects.equals(this.seqNo, schema.seqNo) &&
        Objects.equals(this.ver, schema.ver) &&
        Objects.equals(this.version, schema.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attrNames, id, name, seqNo, ver, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Schema {\n");
    sb.append("    attrNames: ").append(toIndentedString(attrNames)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    seqNo: ").append(toIndentedString(seqNo)).append("\n");
    sb.append("    ver: ").append(toIndentedString(ver)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

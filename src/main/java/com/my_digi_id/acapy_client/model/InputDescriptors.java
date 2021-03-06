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


package com.my_digi_id.acapy_client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.my_digi_id.acapy_client.model.Constraints;
import com.my_digi_id.acapy_client.model.SchemaInputDescriptor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.my_digi_id.acapy_client.invoker.JSON;


/**
 * InputDescriptors
 */
@JsonPropertyOrder({
  InputDescriptors.JSON_PROPERTY_CONSTRAINTS,
  InputDescriptors.JSON_PROPERTY_GROUP,
  InputDescriptors.JSON_PROPERTY_ID,
  InputDescriptors.JSON_PROPERTY_METADATA,
  InputDescriptors.JSON_PROPERTY_NAME,
  InputDescriptors.JSON_PROPERTY_PURPOSE,
  InputDescriptors.JSON_PROPERTY_SCHEMA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-08T11:11:35.214106+01:00[Europe/Berlin]")
public class InputDescriptors {
  public static final String JSON_PROPERTY_CONSTRAINTS = "constraints";
  private Constraints constraints;

  public static final String JSON_PROPERTY_GROUP = "group";
  private List<String> group = null;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PURPOSE = "purpose";
  private String purpose;

  public static final String JSON_PROPERTY_SCHEMA = "schema";
  private List<SchemaInputDescriptor> schema = null;


  public InputDescriptors constraints(Constraints constraints) {
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Constraints getConstraints() {
    return constraints;
  }


  @JsonProperty(JSON_PROPERTY_CONSTRAINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConstraints(Constraints constraints) {
    this.constraints = constraints;
  }


  public InputDescriptors group(List<String> group) {
    this.group = group;
    return this;
  }

  public InputDescriptors addGroupItem(String groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<>();
    }
    this.group.add(groupItem);
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(List<String> group) {
    this.group = group;
  }


  public InputDescriptors id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID")
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


  public InputDescriptors metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Metadata dictionary
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata dictionary")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public InputDescriptors name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name")
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


  public InputDescriptors purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Purpose
   * @return purpose
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Purpose")
  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPurpose() {
    return purpose;
  }


  @JsonProperty(JSON_PROPERTY_PURPOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }


  public InputDescriptors schema(List<SchemaInputDescriptor> schema) {
    this.schema = schema;
    return this;
  }

  public InputDescriptors addSchemaItem(SchemaInputDescriptor schemaItem) {
    if (this.schema == null) {
      this.schema = new ArrayList<>();
    }
    this.schema.add(schemaItem);
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SchemaInputDescriptor> getSchema() {
    return schema;
  }


  @JsonProperty(JSON_PROPERTY_SCHEMA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchema(List<SchemaInputDescriptor> schema) {
    this.schema = schema;
  }


  /**
   * Return true if this InputDescriptors object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InputDescriptors inputDescriptors = (InputDescriptors) o;
    return Objects.equals(this.constraints, inputDescriptors.constraints) &&
        Objects.equals(this.group, inputDescriptors.group) &&
        Objects.equals(this.id, inputDescriptors.id) &&
        Objects.equals(this.metadata, inputDescriptors.metadata) &&
        Objects.equals(this.name, inputDescriptors.name) &&
        Objects.equals(this.purpose, inputDescriptors.purpose) &&
        Objects.equals(this.schema, inputDescriptors.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraints, group, id, metadata, name, purpose, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InputDescriptors {\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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


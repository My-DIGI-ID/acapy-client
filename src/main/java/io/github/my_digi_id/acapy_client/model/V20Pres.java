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
import io.github.my_digi_id.acapy_client.model.AttachDecorator;
import io.github.my_digi_id.acapy_client.model.V20PresFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.my_digi_id.acapy_client.invoker.JSON;


/**
 * V20Pres
 */
@JsonPropertyOrder({
  V20Pres.JSON_PROPERTY_AT_ID,
  V20Pres.JSON_PROPERTY_AT_TYPE,
  V20Pres.JSON_PROPERTY_COMMENT,
  V20Pres.JSON_PROPERTY_FORMATS,
  V20Pres.JSON_PROPERTY_PRESENTATIONS_TILDE_ATTACH
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-11-12T14:46:41.984298+01:00[Europe/Berlin]")
public class V20Pres {
  public static final String JSON_PROPERTY_AT_ID = "@id";
  private String atId;

  public static final String JSON_PROPERTY_AT_TYPE = "@type";
  private String atType;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private JsonNullable<String> comment = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_FORMATS = "formats";
  private List<V20PresFormat> formats = new ArrayList<>();

  public static final String JSON_PROPERTY_PRESENTATIONS_TILDE_ATTACH = "presentations~attach";
  private List<AttachDecorator> presentationsTildeAttach = new ArrayList<>();


  public V20Pres atId(String atId) {
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




  public V20Pres comment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
    return this;
  }

   /**
   * Human-readable comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Human-readable comment")
  @JsonIgnore

  public String getComment() {
        return comment.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getComment_JsonNullable() {
    return comment;
  }
  
  @JsonProperty(JSON_PROPERTY_COMMENT)
  public void setComment_JsonNullable(JsonNullable<String> comment) {
    this.comment = comment;
  }

  public void setComment(String comment) {
    this.comment = JsonNullable.<String>of(comment);
  }


  public V20Pres formats(List<V20PresFormat> formats) {
    this.formats = formats;
    return this;
  }

  public V20Pres addFormatsItem(V20PresFormat formatsItem) {
    this.formats.add(formatsItem);
    return this;
  }

   /**
   * Acceptable attachment formats
   * @return formats
  **/
  @ApiModelProperty(required = true, value = "Acceptable attachment formats")
  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<V20PresFormat> getFormats() {
    return formats;
  }


  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFormats(List<V20PresFormat> formats) {
    this.formats = formats;
  }


  public V20Pres presentationsTildeAttach(List<AttachDecorator> presentationsTildeAttach) {
    this.presentationsTildeAttach = presentationsTildeAttach;
    return this;
  }

  public V20Pres addPresentationsTildeAttachItem(AttachDecorator presentationsTildeAttachItem) {
    this.presentationsTildeAttach.add(presentationsTildeAttachItem);
    return this;
  }

   /**
   * Get presentationsTildeAttach
   * @return presentationsTildeAttach
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRESENTATIONS_TILDE_ATTACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AttachDecorator> getPresentationsTildeAttach() {
    return presentationsTildeAttach;
  }


  @JsonProperty(JSON_PROPERTY_PRESENTATIONS_TILDE_ATTACH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPresentationsTildeAttach(List<AttachDecorator> presentationsTildeAttach) {
    this.presentationsTildeAttach = presentationsTildeAttach;
  }


  /**
   * Return true if this V20Pres object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V20Pres v20Pres = (V20Pres) o;
    return Objects.equals(this.atId, v20Pres.atId) &&
        Objects.equals(this.atType, v20Pres.atType) &&
        Objects.equals(this.comment, v20Pres.comment) &&
        Objects.equals(this.formats, v20Pres.formats) &&
        Objects.equals(this.presentationsTildeAttach, v20Pres.presentationsTildeAttach);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atId, atType, comment, formats, presentationsTildeAttach);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V20Pres {\n");
    sb.append("    atId: ").append(toIndentedString(atId)).append("\n");
    sb.append("    atType: ").append(toIndentedString(atType)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    presentationsTildeAttach: ").append(toIndentedString(presentationsTildeAttach)).append("\n");
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

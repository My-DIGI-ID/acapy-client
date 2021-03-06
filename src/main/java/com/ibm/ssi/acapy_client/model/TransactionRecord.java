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
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.ibm.ssi.acapy_client.invoker.JSON;


/**
 * TransactionRecord
 */
@JsonPropertyOrder({
  TransactionRecord.JSON_PROPERTY_TYPE,
  TransactionRecord.JSON_PROPERTY_CONNECTION_ID,
  TransactionRecord.JSON_PROPERTY_CREATED_AT,
  TransactionRecord.JSON_PROPERTY_ENDORSER_WRITE_TXN,
  TransactionRecord.JSON_PROPERTY_FORMATS,
  TransactionRecord.JSON_PROPERTY_MESSAGES_ATTACH,
  TransactionRecord.JSON_PROPERTY_SIGNATURE_REQUEST,
  TransactionRecord.JSON_PROPERTY_SIGNATURE_RESPONSE,
  TransactionRecord.JSON_PROPERTY_STATE,
  TransactionRecord.JSON_PROPERTY_THREAD_ID,
  TransactionRecord.JSON_PROPERTY_TIMING,
  TransactionRecord.JSON_PROPERTY_TRACE,
  TransactionRecord.JSON_PROPERTY_TRANSACTION_ID,
  TransactionRecord.JSON_PROPERTY_UPDATED_AT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class TransactionRecord {
  public static final String JSON_PROPERTY_TYPE = "_type";
  private String type;

  public static final String JSON_PROPERTY_CONNECTION_ID = "connection_id";
  private String connectionId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_ENDORSER_WRITE_TXN = "endorser_write_txn";
  private Boolean endorserWriteTxn;

  public static final String JSON_PROPERTY_FORMATS = "formats";
  private List<Map<String, String>> formats = null;

  public static final String JSON_PROPERTY_MESSAGES_ATTACH = "messages_attach";
  private List<Object> messagesAttach = null;

  public static final String JSON_PROPERTY_SIGNATURE_REQUEST = "signature_request";
  private List<Object> signatureRequest = null;

  public static final String JSON_PROPERTY_SIGNATURE_RESPONSE = "signature_response";
  private List<Object> signatureResponse = null;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_THREAD_ID = "thread_id";
  private String threadId;

  public static final String JSON_PROPERTY_TIMING = "timing";
  private Object timing;

  public static final String JSON_PROPERTY_TRACE = "trace";
  private Boolean trace;

  public static final String JSON_PROPERTY_TRANSACTION_ID = "transaction_id";
  private String transactionId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;


  public TransactionRecord type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Transaction type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "101", value = "Transaction type")
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


  public TransactionRecord connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }

   /**
   * The connection identifier for thie particular transaction record
   * @return connectionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "The connection identifier for thie particular transaction record")
  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConnectionId() {
    return connectionId;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  public TransactionRecord createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Time of record creation
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-25 08:37:04Z", value = "Time of record creation")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public TransactionRecord endorserWriteTxn(Boolean endorserWriteTxn) {
    this.endorserWriteTxn = endorserWriteTxn;
    return this;
  }

   /**
   * If True, Endorser will write the transaction after endorsing it
   * @return endorserWriteTxn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "If True, Endorser will write the transaction after endorsing it")
  @JsonProperty(JSON_PROPERTY_ENDORSER_WRITE_TXN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEndorserWriteTxn() {
    return endorserWriteTxn;
  }


  @JsonProperty(JSON_PROPERTY_ENDORSER_WRITE_TXN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndorserWriteTxn(Boolean endorserWriteTxn) {
    this.endorserWriteTxn = endorserWriteTxn;
  }


  public TransactionRecord formats(List<Map<String, String>> formats) {
    this.formats = formats;
    return this;
  }

  public TransactionRecord addFormatsItem(Map<String, String> formatsItem) {
    if (this.formats == null) {
      this.formats = new ArrayList<>();
    }
    this.formats.add(formatsItem);
    return this;
  }

   /**
   * Get formats
   * @return formats
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Map<String, String>> getFormats() {
    return formats;
  }


  @JsonProperty(JSON_PROPERTY_FORMATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFormats(List<Map<String, String>> formats) {
    this.formats = formats;
  }


  public TransactionRecord messagesAttach(List<Object> messagesAttach) {
    this.messagesAttach = messagesAttach;
    return this;
  }

  public TransactionRecord addMessagesAttachItem(Object messagesAttachItem) {
    if (this.messagesAttach == null) {
      this.messagesAttach = new ArrayList<>();
    }
    this.messagesAttach.add(messagesAttachItem);
    return this;
  }

   /**
   * Get messagesAttach
   * @return messagesAttach
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MESSAGES_ATTACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getMessagesAttach() {
    return messagesAttach;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGES_ATTACH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessagesAttach(List<Object> messagesAttach) {
    this.messagesAttach = messagesAttach;
  }


  public TransactionRecord signatureRequest(List<Object> signatureRequest) {
    this.signatureRequest = signatureRequest;
    return this;
  }

  public TransactionRecord addSignatureRequestItem(Object signatureRequestItem) {
    if (this.signatureRequest == null) {
      this.signatureRequest = new ArrayList<>();
    }
    this.signatureRequest.add(signatureRequestItem);
    return this;
  }

   /**
   * Get signatureRequest
   * @return signatureRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getSignatureRequest() {
    return signatureRequest;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureRequest(List<Object> signatureRequest) {
    this.signatureRequest = signatureRequest;
  }


  public TransactionRecord signatureResponse(List<Object> signatureResponse) {
    this.signatureResponse = signatureResponse;
    return this;
  }

  public TransactionRecord addSignatureResponseItem(Object signatureResponseItem) {
    if (this.signatureResponse == null) {
      this.signatureResponse = new ArrayList<>();
    }
    this.signatureResponse.add(signatureResponseItem);
    return this;
  }

   /**
   * Get signatureResponse
   * @return signatureResponse
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNATURE_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getSignatureResponse() {
    return signatureResponse;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSignatureResponse(List<Object> signatureResponse) {
    this.signatureResponse = signatureResponse;
  }


  public TransactionRecord state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Current record state
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "active", value = "Current record state")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setState(String state) {
    this.state = state;
  }


  public TransactionRecord threadId(String threadId) {
    this.threadId = threadId;
    return this;
  }

   /**
   * Thread Identifier
   * @return threadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Thread Identifier")
  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getThreadId() {
    return threadId;
  }


  @JsonProperty(JSON_PROPERTY_THREAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setThreadId(String threadId) {
    this.threadId = threadId;
  }


  public TransactionRecord timing(Object timing) {
    this.timing = timing;
    return this;
  }

   /**
   * Get timing
   * @return timing
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"expires_time\":\"2020-12-13T17:29:06+0000\"}", value = "")
  @JsonProperty(JSON_PROPERTY_TIMING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getTiming() {
    return timing;
  }


  @JsonProperty(JSON_PROPERTY_TIMING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTiming(Object timing) {
    this.timing = timing;
  }


  public TransactionRecord trace(Boolean trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Record trace information, based on agent configuration
   * @return trace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Record trace information, based on agent configuration")
  @JsonProperty(JSON_PROPERTY_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTrace() {
    return trace;
  }


  @JsonProperty(JSON_PROPERTY_TRACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrace(Boolean trace) {
    this.trace = trace;
  }


  public TransactionRecord transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Transaction identifier
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3fa85f64-5717-4562-b3fc-2c963f66afa6", value = "Transaction identifier")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransactionId() {
    return transactionId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public TransactionRecord updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Time of last record update
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-25 08:37:04Z", value = "Time of last record update")
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  /**
   * Return true if this TransactionRecord object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionRecord transactionRecord = (TransactionRecord) o;
    return Objects.equals(this.type, transactionRecord.type) &&
        Objects.equals(this.connectionId, transactionRecord.connectionId) &&
        Objects.equals(this.createdAt, transactionRecord.createdAt) &&
        Objects.equals(this.endorserWriteTxn, transactionRecord.endorserWriteTxn) &&
        Objects.equals(this.formats, transactionRecord.formats) &&
        Objects.equals(this.messagesAttach, transactionRecord.messagesAttach) &&
        Objects.equals(this.signatureRequest, transactionRecord.signatureRequest) &&
        Objects.equals(this.signatureResponse, transactionRecord.signatureResponse) &&
        Objects.equals(this.state, transactionRecord.state) &&
        Objects.equals(this.threadId, transactionRecord.threadId) &&
        Objects.equals(this.timing, transactionRecord.timing) &&
        Objects.equals(this.trace, transactionRecord.trace) &&
        Objects.equals(this.transactionId, transactionRecord.transactionId) &&
        Objects.equals(this.updatedAt, transactionRecord.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, connectionId, createdAt, endorserWriteTxn, formats, messagesAttach, signatureRequest, signatureResponse, state, threadId, timing, trace, transactionId, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionRecord {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endorserWriteTxn: ").append(toIndentedString(endorserWriteTxn)).append("\n");
    sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
    sb.append("    messagesAttach: ").append(toIndentedString(messagesAttach)).append("\n");
    sb.append("    signatureRequest: ").append(toIndentedString(signatureRequest)).append("\n");
    sb.append("    signatureResponse: ").append(toIndentedString(signatureResponse)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    timing: ").append(toIndentedString(timing)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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


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
 * TransactionJobs
 */
@JsonPropertyOrder({
  TransactionJobs.JSON_PROPERTY_TRANSACTION_MY_JOB,
  TransactionJobs.JSON_PROPERTY_TRANSACTION_THEIR_JOB
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-10-11T17:04:23.656276+02:00[Europe/Berlin]")
public class TransactionJobs {
  /**
   * My transaction related job
   */
  public enum TransactionMyJobEnum {
    TRANSACTION_AUTHOR("TRANSACTION_AUTHOR"),
    
    TRANSACTION_ENDORSER("TRANSACTION_ENDORSER"),
    
    RESET("reset");

    private String value;

    TransactionMyJobEnum(String value) {
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
    public static TransactionMyJobEnum fromValue(String value) {
      for (TransactionMyJobEnum b : TransactionMyJobEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSACTION_MY_JOB = "transaction_my_job";
  private TransactionMyJobEnum transactionMyJob;

  /**
   * Their transaction related job
   */
  public enum TransactionTheirJobEnum {
    TRANSACTION_AUTHOR("TRANSACTION_AUTHOR"),
    
    TRANSACTION_ENDORSER("TRANSACTION_ENDORSER"),
    
    RESET("reset");

    private String value;

    TransactionTheirJobEnum(String value) {
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
    public static TransactionTheirJobEnum fromValue(String value) {
      for (TransactionTheirJobEnum b : TransactionTheirJobEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSACTION_THEIR_JOB = "transaction_their_job";
  private TransactionTheirJobEnum transactionTheirJob;


  public TransactionJobs transactionMyJob(TransactionMyJobEnum transactionMyJob) {
    this.transactionMyJob = transactionMyJob;
    return this;
  }

   /**
   * My transaction related job
   * @return transactionMyJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "My transaction related job")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_MY_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionMyJobEnum getTransactionMyJob() {
    return transactionMyJob;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_MY_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionMyJob(TransactionMyJobEnum transactionMyJob) {
    this.transactionMyJob = transactionMyJob;
  }


  public TransactionJobs transactionTheirJob(TransactionTheirJobEnum transactionTheirJob) {
    this.transactionTheirJob = transactionTheirJob;
    return this;
  }

   /**
   * Their transaction related job
   * @return transactionTheirJob
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Their transaction related job")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_THEIR_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionTheirJobEnum getTransactionTheirJob() {
    return transactionTheirJob;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_THEIR_JOB)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionTheirJob(TransactionTheirJobEnum transactionTheirJob) {
    this.transactionTheirJob = transactionTheirJob;
  }


  /**
   * Return true if this TransactionJobs object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionJobs transactionJobs = (TransactionJobs) o;
    return Objects.equals(this.transactionMyJob, transactionJobs.transactionMyJob) &&
        Objects.equals(this.transactionTheirJob, transactionJobs.transactionTheirJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionMyJob, transactionTheirJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionJobs {\n");
    sb.append("    transactionMyJob: ").append(toIndentedString(transactionMyJob)).append("\n");
    sb.append("    transactionTheirJob: ").append(toIndentedString(transactionTheirJob)).append("\n");
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


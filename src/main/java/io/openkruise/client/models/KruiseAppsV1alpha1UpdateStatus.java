/*
 * Kruise
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * UpdateStatus defines the observed update state of UnitedDeployment.
 */
@ApiModel(description = "UpdateStatus defines the observed update state of UnitedDeployment.")

public class KruiseAppsV1alpha1UpdateStatus {
  @SerializedName("currentPartitions")
  private Map<String, Integer> currentPartitions = null;

  @SerializedName("updatedRevision")
  private String updatedRevision = null;

  public KruiseAppsV1alpha1UpdateStatus currentPartitions(Map<String, Integer> currentPartitions) {
    this.currentPartitions = currentPartitions;
    return this;
  }

  public KruiseAppsV1alpha1UpdateStatus putCurrentPartitionsItem(String key, Integer currentPartitionsItem) {
    if (this.currentPartitions == null) {
      this.currentPartitions = new HashMap<String, Integer>();
    }
    this.currentPartitions.put(key, currentPartitionsItem);
    return this;
  }

   /**
   * Records the current partition.
   * @return currentPartitions
  **/
  @ApiModelProperty(value = "Records the current partition.")
  public Map<String, Integer> getCurrentPartitions() {
    return currentPartitions;
  }

  public void setCurrentPartitions(Map<String, Integer> currentPartitions) {
    this.currentPartitions = currentPartitions;
  }

  public KruiseAppsV1alpha1UpdateStatus updatedRevision(String updatedRevision) {
    this.updatedRevision = updatedRevision;
    return this;
  }

   /**
   * Records the latest revision.
   * @return updatedRevision
  **/
  @ApiModelProperty(value = "Records the latest revision.")
  public String getUpdatedRevision() {
    return updatedRevision;
  }

  public void setUpdatedRevision(String updatedRevision) {
    this.updatedRevision = updatedRevision;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1UpdateStatus kruiseAppsV1alpha1UpdateStatus = (KruiseAppsV1alpha1UpdateStatus) o;
    return Objects.equals(this.currentPartitions, kruiseAppsV1alpha1UpdateStatus.currentPartitions) &&
        Objects.equals(this.updatedRevision, kruiseAppsV1alpha1UpdateStatus.updatedRevision);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPartitions, updatedRevision);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1UpdateStatus {\n");
    
    sb.append("    currentPartitions: ").append(toIndentedString(currentPartitions)).append("\n");
    sb.append("    updatedRevision: ").append(toIndentedString(updatedRevision)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

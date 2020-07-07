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
import org.joda.time.DateTime;

import java.io.IOException;

/**
 * ImageTagStatus defines the pulling status of an image tag
 */
@ApiModel(description = "ImageTagStatus defines the pulling status of an image tag")

public class KruiseAppsV1alpha1ImageTagStatus {
  @SerializedName("completionTime")
  private DateTime completionTime = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("progress")
  private Integer progress = null;

  @SerializedName("startTime")
  private DateTime startTime = null;

  @SerializedName("tag")
  private String tag = null;

  public KruiseAppsV1alpha1ImageTagStatus completionTime(DateTime completionTime) {
    this.completionTime = completionTime;
    return this;
  }

   /**
   * Represents time when the pulling task was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return completionTime
  **/
  @ApiModelProperty(value = "Represents time when the pulling task was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getCompletionTime() {
    return completionTime;
  }

  public void setCompletionTime(DateTime completionTime) {
    this.completionTime = completionTime;
  }

  public KruiseAppsV1alpha1ImageTagStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Represents the summary informations of this node
   * @return message
  **/
  @ApiModelProperty(value = "Represents the summary informations of this node")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public KruiseAppsV1alpha1ImageTagStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Represents the image pulling task phase.
   * @return phase
  **/
  @ApiModelProperty(required = true, value = "Represents the image pulling task phase.")
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public KruiseAppsV1alpha1ImageTagStatus progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Represents the pulling progress of this tag, which is beetween 0-100. There is no guarantee of monotonic consistency, and it may be a rollback due to retry during pulling.
   * @return progress
  **/
  @ApiModelProperty(value = "Represents the pulling progress of this tag, which is beetween 0-100. There is no guarantee of monotonic consistency, and it may be a rollback due to retry during pulling.")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public KruiseAppsV1alpha1ImageTagStatus startTime(DateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Represents time when the pulling task was acknowledged by the image puller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.
   * @return startTime
  **/
  @ApiModelProperty(value = "Represents time when the pulling task was acknowledged by the image puller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC.")
  public DateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }

  public KruiseAppsV1alpha1ImageTagStatus tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Represents the image tag.
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "Represents the image tag.")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1ImageTagStatus kruiseAppsV1alpha1ImageTagStatus = (KruiseAppsV1alpha1ImageTagStatus) o;
    return Objects.equals(this.completionTime, kruiseAppsV1alpha1ImageTagStatus.completionTime) &&
        Objects.equals(this.message, kruiseAppsV1alpha1ImageTagStatus.message) &&
        Objects.equals(this.phase, kruiseAppsV1alpha1ImageTagStatus.phase) &&
        Objects.equals(this.progress, kruiseAppsV1alpha1ImageTagStatus.progress) &&
        Objects.equals(this.startTime, kruiseAppsV1alpha1ImageTagStatus.startTime) &&
        Objects.equals(this.tag, kruiseAppsV1alpha1ImageTagStatus.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(completionTime, message, phase, progress, startTime, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ImageTagStatus {\n");
    
    sb.append("    completionTime: ").append(toIndentedString(completionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

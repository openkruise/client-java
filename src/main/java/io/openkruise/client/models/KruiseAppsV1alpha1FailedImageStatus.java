/*
* Kruise
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.openkruise.client.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import javax.annotation.Generated;

/**
 * FailedImageStatus the state of ImagePullJob which has the failed nodes(status.Failed&gt;0)
 */
@ApiModel(description = "FailedImageStatus the state of ImagePullJob which has the failed nodes(status.Failed>0)")
@Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2023-07-21T15:55:09.049+08:00")
public class KruiseAppsV1alpha1FailedImageStatus {
  @SerializedName("imagePullJob")
  private String imagePullJob = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("name")
  private String name = null;

  public KruiseAppsV1alpha1FailedImageStatus imagePullJob(String imagePullJob) {
    this.imagePullJob = imagePullJob;
    return this;
  }

   /**
   * The name of ImagePullJob which has the failed nodes(status.Failed&gt;0)
   * @return imagePullJob
  **/
  @ApiModelProperty(value = "The name of ImagePullJob which has the failed nodes(status.Failed>0)")
  public String getImagePullJob() {
    return imagePullJob;
  }

  public void setImagePullJob(String imagePullJob) {
    this.imagePullJob = imagePullJob;
  }

  public KruiseAppsV1alpha1FailedImageStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The text prompt for job running status.
   * @return message
  **/
  @ApiModelProperty(value = "The text prompt for job running status.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public KruiseAppsV1alpha1FailedImageStatus name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the image
   * @return name
  **/
  @ApiModelProperty(value = "Name of the image")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof KruiseAppsV1alpha1FailedImageStatus)) {
      return false;
    }
    KruiseAppsV1alpha1FailedImageStatus ioKruiseAppsV1alpha1ImageListPullJobStatusFailedImageStatuses = (KruiseAppsV1alpha1FailedImageStatus) o;
    return Objects.equals(this.imagePullJob, ioKruiseAppsV1alpha1ImageListPullJobStatusFailedImageStatuses.imagePullJob) &&
        Objects.equals(this.message, ioKruiseAppsV1alpha1ImageListPullJobStatusFailedImageStatuses.message) &&
        Objects.equals(this.name, ioKruiseAppsV1alpha1ImageListPullJobStatusFailedImageStatuses.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagePullJob, message, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ImageListPullJobStatusFailedImageStatuses {\n");
    
    sb.append("    imagePullJob: ").append(toIndentedString(imagePullJob)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

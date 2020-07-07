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
import io.kubernetes.client.models.V1ObjectReference;
import io.openkruise.client.models.KruiseAppsV1alpha1ImageTagPullPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ImageTagSpec defines the pulling spec of an image tag
 */
@ApiModel(description = "ImageTagSpec defines the pulling spec of an image tag")

public class KruiseAppsV1alpha1ImageTagSpec {
  @SerializedName("createdAt")
  private DateTime createdAt = null;

  @SerializedName("ownerReferences")
  private List<V1ObjectReference> ownerReferences = null;

  @SerializedName("pullPolicy")
  private KruiseAppsV1alpha1ImageTagPullPolicy pullPolicy = null;

  @SerializedName("tag")
  private String tag = null;

  public KruiseAppsV1alpha1ImageTagSpec createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Specifies the create time of this tag
   * @return createdAt
  **/
  @ApiModelProperty(value = "Specifies the create time of this tag")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public KruiseAppsV1alpha1ImageTagSpec ownerReferences(List<V1ObjectReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
    return this;
  }

  public KruiseAppsV1alpha1ImageTagSpec addOwnerReferencesItem(V1ObjectReference ownerReferencesItem) {
    if (this.ownerReferences == null) {
      this.ownerReferences = new ArrayList<V1ObjectReference>();
    }
    this.ownerReferences.add(ownerReferencesItem);
    return this;
  }

   /**
   * List of objects depended by this object. If this image is managed by a controller, then an entry in this list will point to this controller.
   * @return ownerReferences
  **/
  @ApiModelProperty(value = "List of objects depended by this object. If this image is managed by a controller, then an entry in this list will point to this controller.")
  public List<V1ObjectReference> getOwnerReferences() {
    return ownerReferences;
  }

  public void setOwnerReferences(List<V1ObjectReference> ownerReferences) {
    this.ownerReferences = ownerReferences;
  }

  public KruiseAppsV1alpha1ImageTagSpec pullPolicy(KruiseAppsV1alpha1ImageTagPullPolicy pullPolicy) {
    this.pullPolicy = pullPolicy;
    return this;
  }

   /**
   * PullPolicy is an optional field to set parameters of the pulling task. If not specified, the system will use the default values.
   * @return pullPolicy
  **/
  @ApiModelProperty(value = "PullPolicy is an optional field to set parameters of the pulling task. If not specified, the system will use the default values.")
  public KruiseAppsV1alpha1ImageTagPullPolicy getPullPolicy() {
    return pullPolicy;
  }

  public void setPullPolicy(KruiseAppsV1alpha1ImageTagPullPolicy pullPolicy) {
    this.pullPolicy = pullPolicy;
  }

  public KruiseAppsV1alpha1ImageTagSpec tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Specifies the image tag
   * @return tag
  **/
  @ApiModelProperty(required = true, value = "Specifies the image tag")
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
    KruiseAppsV1alpha1ImageTagSpec kruiseAppsV1alpha1ImageTagSpec = (KruiseAppsV1alpha1ImageTagSpec) o;
    return Objects.equals(this.createdAt, kruiseAppsV1alpha1ImageTagSpec.createdAt) &&
        Objects.equals(this.ownerReferences, kruiseAppsV1alpha1ImageTagSpec.ownerReferences) &&
        Objects.equals(this.pullPolicy, kruiseAppsV1alpha1ImageTagSpec.pullPolicy) &&
        Objects.equals(this.tag, kruiseAppsV1alpha1ImageTagSpec.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, ownerReferences, pullPolicy, tag);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1ImageTagSpec {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    ownerReferences: ").append(toIndentedString(ownerReferences)).append("\n");
    sb.append("    pullPolicy: ").append(toIndentedString(pullPolicy)).append("\n");
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

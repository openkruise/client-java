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
import io.openkruise.client.models.KruiseAppsV1alpha1ImageSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * NodeImageSpec defines the desired state of NodeImage
 */
@ApiModel(description = "NodeImageSpec defines the desired state of NodeImage")

public class KruiseAppsV1alpha1NodeImageSpec {
  @SerializedName("images")
  private Map<String, KruiseAppsV1alpha1ImageSpec> images = null;

  public KruiseAppsV1alpha1NodeImageSpec images(Map<String, KruiseAppsV1alpha1ImageSpec> images) {
    this.images = images;
    return this;
  }

  public KruiseAppsV1alpha1NodeImageSpec putImagesItem(String key, KruiseAppsV1alpha1ImageSpec imagesItem) {
    if (this.images == null) {
      this.images = new HashMap<String, KruiseAppsV1alpha1ImageSpec>();
    }
    this.images.put(key, imagesItem);
    return this;
  }

   /**
   * Specifies images to be pulled on this node It can not be more than 256 for each NodeImage
   * @return images
  **/
  @ApiModelProperty(value = "Specifies images to be pulled on this node It can not be more than 256 for each NodeImage")
  public Map<String, KruiseAppsV1alpha1ImageSpec> getImages() {
    return images;
  }

  public void setImages(Map<String, KruiseAppsV1alpha1ImageSpec> images) {
    this.images = images;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1NodeImageSpec kruiseAppsV1alpha1NodeImageSpec = (KruiseAppsV1alpha1NodeImageSpec) o;
    return Objects.equals(this.images, kruiseAppsV1alpha1NodeImageSpec.images);
  }

  @Override
  public int hashCode() {
    return Objects.hash(images);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1NodeImageSpec {\n");
    
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
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


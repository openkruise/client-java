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
import io.kubernetes.client.models.V1LabelSelector;
import io.openkruise.client.models.KruiseAppsV1alpha1SubsetTemplate;
import io.openkruise.client.models.KruiseAppsV1alpha1Topology;
import io.openkruise.client.models.KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UnitedDeploymentSpec defines the desired state of UnitedDeployment.
 */
@ApiModel(description = "UnitedDeploymentSpec defines the desired state of UnitedDeployment.")

public class KruiseAppsV1alpha1UnitedDeploymentSpec {
  @SerializedName("replicas")
  private Integer replicas = null;

  @SerializedName("revisionHistoryLimit")
  private Integer revisionHistoryLimit = null;

  @SerializedName("selector")
  private V1LabelSelector selector = null;

  @SerializedName("template")
  private KruiseAppsV1alpha1SubsetTemplate template = null;

  @SerializedName("topology")
  private KruiseAppsV1alpha1Topology topology = null;

  @SerializedName("updateStrategy")
  private KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy updateStrategy = null;

  public KruiseAppsV1alpha1UnitedDeploymentSpec replicas(Integer replicas) {
    this.replicas = replicas;
    return this;
  }

   /**
   * Replicas is the total desired replicas of all the subsets. If unspecified, defaults to 1.
   * @return replicas
  **/
  @ApiModelProperty(value = "Replicas is the total desired replicas of all the subsets. If unspecified, defaults to 1.")
  public Integer getReplicas() {
    return replicas;
  }

  public void setReplicas(Integer replicas) {
    this.replicas = replicas;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec revisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
    return this;
  }

   /**
   * Indicates the number of histories to be conserved. If unspecified, defaults to 10.
   * @return revisionHistoryLimit
  **/
  @ApiModelProperty(value = "Indicates the number of histories to be conserved. If unspecified, defaults to 10.")
  public Integer getRevisionHistoryLimit() {
    return revisionHistoryLimit;
  }

  public void setRevisionHistoryLimit(Integer revisionHistoryLimit) {
    this.revisionHistoryLimit = revisionHistoryLimit;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec selector(V1LabelSelector selector) {
    this.selector = selector;
    return this;
  }

   /**
   * Selector is a label query over pods that should match the replica count. It must match the pod template&#39;s labels.
   * @return selector
  **/
  @ApiModelProperty(required = true, value = "Selector is a label query over pods that should match the replica count. It must match the pod template's labels.")
  public V1LabelSelector getSelector() {
    return selector;
  }

  public void setSelector(V1LabelSelector selector) {
    this.selector = selector;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec template(KruiseAppsV1alpha1SubsetTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Template describes the subset that will be created.
   * @return template
  **/
  @ApiModelProperty(value = "Template describes the subset that will be created.")
  public KruiseAppsV1alpha1SubsetTemplate getTemplate() {
    return template;
  }

  public void setTemplate(KruiseAppsV1alpha1SubsetTemplate template) {
    this.template = template;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec topology(KruiseAppsV1alpha1Topology topology) {
    this.topology = topology;
    return this;
  }

   /**
   * Topology describes the pods distribution detail between each of subsets.
   * @return topology
  **/
  @ApiModelProperty(value = "Topology describes the pods distribution detail between each of subsets.")
  public KruiseAppsV1alpha1Topology getTopology() {
    return topology;
  }

  public void setTopology(KruiseAppsV1alpha1Topology topology) {
    this.topology = topology;
  }

  public KruiseAppsV1alpha1UnitedDeploymentSpec updateStrategy(KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
    return this;
  }

   /**
   * UpdateStrategy indicates the strategy the UnitedDeployment use to preform the update, when template is changed.
   * @return updateStrategy
  **/
  @ApiModelProperty(value = "UpdateStrategy indicates the strategy the UnitedDeployment use to preform the update, when template is changed.")
  public KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy getUpdateStrategy() {
    return updateStrategy;
  }

  public void setUpdateStrategy(KruiseAppsV1alpha1UnitedDeploymentUpdateStrategy updateStrategy) {
    this.updateStrategy = updateStrategy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1UnitedDeploymentSpec kruiseAppsV1alpha1UnitedDeploymentSpec = (KruiseAppsV1alpha1UnitedDeploymentSpec) o;
    return Objects.equals(this.replicas, kruiseAppsV1alpha1UnitedDeploymentSpec.replicas) &&
        Objects.equals(this.revisionHistoryLimit, kruiseAppsV1alpha1UnitedDeploymentSpec.revisionHistoryLimit) &&
        Objects.equals(this.selector, kruiseAppsV1alpha1UnitedDeploymentSpec.selector) &&
        Objects.equals(this.template, kruiseAppsV1alpha1UnitedDeploymentSpec.template) &&
        Objects.equals(this.topology, kruiseAppsV1alpha1UnitedDeploymentSpec.topology) &&
        Objects.equals(this.updateStrategy, kruiseAppsV1alpha1UnitedDeploymentSpec.updateStrategy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicas, revisionHistoryLimit, selector, template, topology, updateStrategy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1UnitedDeploymentSpec {\n");
    
    sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
    sb.append("    revisionHistoryLimit: ").append(toIndentedString(revisionHistoryLimit)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    updateStrategy: ").append(toIndentedString(updateStrategy)).append("\n");
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

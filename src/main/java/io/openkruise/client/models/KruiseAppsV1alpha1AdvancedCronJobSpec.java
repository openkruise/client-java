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
import io.openkruise.client.models.KruiseAppsV1alpha1CronJobTemplate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AdvancedCronJobSpec defines the desired state of AdvancedCronJob
 */
@ApiModel(description = "AdvancedCronJobSpec defines the desired state of AdvancedCronJob")

public class KruiseAppsV1alpha1AdvancedCronJobSpec {
  @SerializedName("concurrencyPolicy")
  private String concurrencyPolicy = null;

  @SerializedName("failedJobsHistoryLimit")
  private Integer failedJobsHistoryLimit = null;

  @SerializedName("paused")
  private Boolean paused = null;

  @SerializedName("schedule")
  private String schedule = null;

  @SerializedName("startingDeadlineSeconds")
  private Long startingDeadlineSeconds = null;

  @SerializedName("successfulJobsHistoryLimit")
  private Integer successfulJobsHistoryLimit = null;

  @SerializedName("template")
  private KruiseAppsV1alpha1CronJobTemplate template = null;

  public KruiseAppsV1alpha1AdvancedCronJobSpec concurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
    return this;
  }

   /**
   * Specifies how to treat concurrent executions of a Job. Valid values are: - \&quot;Allow\&quot; (default): allows CronJobs to run concurrently; - \&quot;Forbid\&quot;: forbids concurrent runs, skipping next run if previous run hasn&#39;t finished yet; - \&quot;Replace\&quot;: cancels currently running job and replaces it with a new one
   * @return concurrencyPolicy
  **/
  @ApiModelProperty(value = "Specifies how to treat concurrent executions of a Job. Valid values are: - \"Allow\" (default): allows CronJobs to run concurrently; - \"Forbid\": forbids concurrent runs, skipping next run if previous run hasn't finished yet; - \"Replace\": cancels currently running job and replaces it with a new one")
  public String getConcurrencyPolicy() {
    return concurrencyPolicy;
  }

  public void setConcurrencyPolicy(String concurrencyPolicy) {
    this.concurrencyPolicy = concurrencyPolicy;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpec failedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
    return this;
  }

   /**
   * The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
   * @return failedJobsHistoryLimit
  **/
  @ApiModelProperty(value = "The number of failed finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.")
  public Integer getFailedJobsHistoryLimit() {
    return failedJobsHistoryLimit;
  }

  public void setFailedJobsHistoryLimit(Integer failedJobsHistoryLimit) {
    this.failedJobsHistoryLimit = failedJobsHistoryLimit;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpec paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

   /**
   * Paused will pause the cron job.
   * @return paused
  **/
  @ApiModelProperty(value = "Paused will pause the cron job.")
  public Boolean isPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpec schedule(String schedule) {
    this.schedule = schedule;
    return this;
  }

   /**
   * The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "The schedule in Cron format, see https://en.wikipedia.org/wiki/Cron.")
  public String getSchedule() {
    return schedule;
  }

  public void setSchedule(String schedule) {
    this.schedule = schedule;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpec startingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
    return this;
  }

   /**
   * Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.
   * @return startingDeadlineSeconds
  **/
  @ApiModelProperty(value = "Optional deadline in seconds for starting the job if it misses scheduled time for any reason.  Missed jobs executions will be counted as failed ones.")
  public Long getStartingDeadlineSeconds() {
    return startingDeadlineSeconds;
  }

  public void setStartingDeadlineSeconds(Long startingDeadlineSeconds) {
    this.startingDeadlineSeconds = startingDeadlineSeconds;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpec successfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
    return this;
  }

   /**
   * The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.
   * @return successfulJobsHistoryLimit
  **/
  @ApiModelProperty(value = "The number of successful finished jobs to retain. This is a pointer to distinguish between explicit zero and not specified.")
  public Integer getSuccessfulJobsHistoryLimit() {
    return successfulJobsHistoryLimit;
  }

  public void setSuccessfulJobsHistoryLimit(Integer successfulJobsHistoryLimit) {
    this.successfulJobsHistoryLimit = successfulJobsHistoryLimit;
  }

  public KruiseAppsV1alpha1AdvancedCronJobSpec template(KruiseAppsV1alpha1CronJobTemplate template) {
    this.template = template;
    return this;
  }

   /**
   * Specifies the job that will be created when executing a CronJob.
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Specifies the job that will be created when executing a CronJob.")
  public KruiseAppsV1alpha1CronJobTemplate getTemplate() {
    return template;
  }

  public void setTemplate(KruiseAppsV1alpha1CronJobTemplate template) {
    this.template = template;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KruiseAppsV1alpha1AdvancedCronJobSpec kruiseAppsV1alpha1AdvancedCronJobSpec = (KruiseAppsV1alpha1AdvancedCronJobSpec) o;
    return Objects.equals(this.concurrencyPolicy, kruiseAppsV1alpha1AdvancedCronJobSpec.concurrencyPolicy) &&
        Objects.equals(this.failedJobsHistoryLimit, kruiseAppsV1alpha1AdvancedCronJobSpec.failedJobsHistoryLimit) &&
        Objects.equals(this.paused, kruiseAppsV1alpha1AdvancedCronJobSpec.paused) &&
        Objects.equals(this.schedule, kruiseAppsV1alpha1AdvancedCronJobSpec.schedule) &&
        Objects.equals(this.startingDeadlineSeconds, kruiseAppsV1alpha1AdvancedCronJobSpec.startingDeadlineSeconds) &&
        Objects.equals(this.successfulJobsHistoryLimit, kruiseAppsV1alpha1AdvancedCronJobSpec.successfulJobsHistoryLimit) &&
        Objects.equals(this.template, kruiseAppsV1alpha1AdvancedCronJobSpec.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(concurrencyPolicy, failedJobsHistoryLimit, paused, schedule, startingDeadlineSeconds, successfulJobsHistoryLimit, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KruiseAppsV1alpha1AdvancedCronJobSpec {\n");
    
    sb.append("    concurrencyPolicy: ").append(toIndentedString(concurrencyPolicy)).append("\n");
    sb.append("    failedJobsHistoryLimit: ").append(toIndentedString(failedJobsHistoryLimit)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    startingDeadlineSeconds: ").append(toIndentedString(startingDeadlineSeconds)).append("\n");
    sb.append("    successfulJobsHistoryLimit: ").append(toIndentedString(successfulJobsHistoryLimit)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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

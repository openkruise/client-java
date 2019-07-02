
# IoOpenkruiseAppsV1alpha1CompletionPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **Long** | Specifies the duration in seconds relative to the startTime that the job may be active before the system tries to terminate it; value must be positive integer. Only works for Always type |  [optional]
**backoffLimit** | **Integer** | Specifies the number of retries before marking this job failed. Not setting value means no limit. Only works for Always type |  [optional]
**ttlSecondsAfterFinished** | **Integer** | ttlSecondsAfterFinished limits the lifetime of a Job that has finished execution (either Complete or Failed). If this field is set, ttlSecondsAfterFinished after the Job finishes, it is eligible to be automatically deleted. When the Job is being deleted, its lifecycle guarantees (e.g. finalizers) will be honored. If this field is unset, the Job won&#39;t be automatically deleted. If this field is set to zero, the Job becomes eligible to be deleted immediately after it finishes. This field is alpha-level and is only honored by servers that enable the TTLAfterFinished feature. Only works for Always type |  [optional]
**type** | **String** | Type indicates the type of the CompletionPolicy Default is Always |  [optional]




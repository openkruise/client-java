
# IoOpenkruiseAppsV1alpha1BroadcastJobSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionPolicy** | [**IoOpenkruiseAppsV1alpha1CompletionPolicy**](IoOpenkruiseAppsV1alpha1CompletionPolicy.md) | CompletionPolicy indicates the completion policy of the job. Default is Always CompletionPolicyType |  [optional]
**parallelism** | **Integer** | Specifies the maximum desired number of pods the job should run at any given time. The actual number of pods running in steady state will be less than this number when the work left to do is less than max parallelism. Not setting this value means no limit. |  [optional]
**template** | [**IoK8sApiCoreV1PodTemplateSpec**](IoK8sApiCoreV1PodTemplateSpec.md) | Describes the pod that will be created when executing a job. | 




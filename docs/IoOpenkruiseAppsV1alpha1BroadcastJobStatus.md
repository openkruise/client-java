
# IoOpenkruiseAppsV1alpha1BroadcastJobStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Integer** | The number of actively running pods. |  [optional]
**completionTime** | [**IoK8sApimachineryPkgApisMetaV1Time**](IoK8sApimachineryPkgApisMetaV1Time.md) | Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**conditions** | [**List&lt;IoOpenkruiseAppsV1alpha1JobCondition&gt;**](IoOpenkruiseAppsV1alpha1JobCondition.md) | The latest available observations of an object&#39;s current state. |  [optional]
**desired** | **Integer** | The desired number of pods, this is typically equal to the number of nodes satisfied to run pods. |  [optional]
**failed** | **Integer** | The number of pods which reached phase Failed. |  [optional]
**startTime** | [**IoK8sApimachineryPkgApisMetaV1Time**](IoK8sApimachineryPkgApisMetaV1Time.md) | Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. |  [optional]
**succeeded** | **Integer** | The number of pods which reached phase Succeeded. |  [optional]




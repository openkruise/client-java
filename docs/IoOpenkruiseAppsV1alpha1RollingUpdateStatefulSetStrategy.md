
# IoOpenkruiseAppsV1alpha1RollingUpdateStatefulSetStrategy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**maxUnavailable** | [**IoK8sApimachineryPkgUtilIntstrIntOrString**](IoK8sApimachineryPkgUtilIntstrIntOrString.md) | The maximum number of pods that can be unavailable during the update. Value can be an absolute number (ex: 5) or a percentage of desired pods (ex: 10%). Absolute number is calculated from percentage by rounding down. Also, maxUnavailable can just be allowed to work with Parallel podManagementPolicy. Defaults to 1. |  [optional]
**partition** | **Integer** | Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0. |  [optional]
**podUpdatePolicy** | **String** | PodUpdatePolicy indicates how pods should be updated Default value is \&quot;ReCreate\&quot; |  [optional]





# IoOpenkruiseAppsV1alpha1SidecarSetSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**containers** | [**List&lt;IoOpenkruiseAppsV1alpha1SidecarContainer&gt;**](IoOpenkruiseAppsV1alpha1SidecarContainer.md) | containers contains two pieces of information: 1. normal container info that should be injected into pod 2. custom fields to control insert behavior(currently empty) |  [optional]
**selector** | [**IoK8sApimachineryPkgApisMetaV1LabelSelector**](IoK8sApimachineryPkgApisMetaV1LabelSelector.md) | selector is a label query over pods that should be injected |  [optional]




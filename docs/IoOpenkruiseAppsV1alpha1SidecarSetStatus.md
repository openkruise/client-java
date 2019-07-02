
# IoOpenkruiseAppsV1alpha1SidecarSetStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchedPods** | **Integer** | matchedPods is the number of Pods whose labels are matched with this SidecarSet&#39;s selector | 
**observedGeneration** | **Long** | observedGeneration is the most recent generation observed for this SidecarSet. It corresponds to the SidecarSet&#39;s generation, which is updated on mutation by the API Server. |  [optional]
**readyPods** | **Integer** | readyPods is the number of matched Pods that have a ready condition | 
**updatedPods** | **Integer** | updatedPods is the number of matched Pods that are injected with the latest SidecarSet&#39;s containers | 




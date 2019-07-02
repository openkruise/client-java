# client-java

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.openkruise</groupId>
    <artifactId>client-java</artifactId>
    <version>0.1.1</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.openkruise:client-java:0.1.1"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-java-1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

It is suggested that you should use ApiClient and CustomObjectsApi from `io.kubernetes:client-java` instead of `io.openkruise:client-java`.
The only thing you should import from `io.openkruise:client-java` is `io.openkruise.client.models.*`.

```java
import io.kubernetes.client.ApiClient;
import io.kubernetes.client.apis.CustomObjectsApi;

import io.openkruise.client.models.*;

public class MyExample {

    // generate this client from a kubeconfig file or something else
    ApiClient apiClient;

    public void createStatefulSet(String namespace, KruiseAppsV1alpha1StatefulSet statefulSet) throws ApiException {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        customObjectsApi.createNamespacedCustomObject(
                KruiseAppsV1alpha1StatefulSet.group,
                KruiseAppsV1alpha1StatefulSet.version,
                namespace,
                KruiseAppsV1alpha1StatefulSet.plural,
                statefulSet,
                "true"
        );
    }

    public KruiseAppsV1alpha1StatefulSet getStatefulSet(String namespace, String name) throws Exception {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object obj = customObjectsApi.getNamespacedCustomObject(
                KruiseAppsV1alpha1StatefulSet.group,
                KruiseAppsV1alpha1StatefulSet.version,
                namespace,
                KruiseAppsV1alpha1StatefulSet.plural,
                name
        );
        Gson gson = new JSON().getGson();
        return gson.fromJson(gson.toJsonTree(obj).getAsJsonObject(), KruiseAppsV1alpha1StatefulSet.class);
    }

    public void patchStatefulSet(String namespace, String name, String patchBody) throws ApiException {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        customObjectsApi.patchNamespacedCustomObject(
                KruiseAppsV1alpha1StatefulSet.group,
                KruiseAppsV1alpha1StatefulSet.version,
                namespace,
                KruiseAppsV1alpha1StatefulSet.plural,
                name,
                patchBody
        );
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CustomObjectsApi* | [**createClusterCustomObject**](docs/CustomObjectsApi.md#createClusterCustomObject) | **POST** /apis/{group}/{version}/{plural} | 
*CustomObjectsApi* | [**createNamespacedCustomObject**](docs/CustomObjectsApi.md#createNamespacedCustomObject) | **POST** /apis/{group}/{version}/namespaces/{namespace}/{plural} | 
*CustomObjectsApi* | [**deleteClusterCustomObject**](docs/CustomObjectsApi.md#deleteClusterCustomObject) | **DELETE** /apis/{group}/{version}/{plural}/{name} | 
*CustomObjectsApi* | [**deleteNamespacedCustomObject**](docs/CustomObjectsApi.md#deleteNamespacedCustomObject) | **DELETE** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
*CustomObjectsApi* | [**getClusterCustomObject**](docs/CustomObjectsApi.md#getClusterCustomObject) | **GET** /apis/{group}/{version}/{plural}/{name} | 
*CustomObjectsApi* | [**getNamespacedCustomObject**](docs/CustomObjectsApi.md#getNamespacedCustomObject) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
*CustomObjectsApi* | [**listClusterCustomObject**](docs/CustomObjectsApi.md#listClusterCustomObject) | **GET** /apis/{group}/{version}/{plural} | 
*CustomObjectsApi* | [**listNamespacedCustomObject**](docs/CustomObjectsApi.md#listNamespacedCustomObject) | **GET** /apis/{group}/{version}/namespaces/{namespace}/{plural} | 
*CustomObjectsApi* | [**patchClusterCustomObject**](docs/CustomObjectsApi.md#patchClusterCustomObject) | **PATCH** /apis/{group}/{version}/{plural}/{name} | 
*CustomObjectsApi* | [**patchNamespacedCustomObject**](docs/CustomObjectsApi.md#patchNamespacedCustomObject) | **PATCH** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 
*CustomObjectsApi* | [**replaceClusterCustomObject**](docs/CustomObjectsApi.md#replaceClusterCustomObject) | **PUT** /apis/{group}/{version}/{plural}/{name} | 
*CustomObjectsApi* | [**replaceNamespacedCustomObject**](docs/CustomObjectsApi.md#replaceNamespacedCustomObject) | **PUT** /apis/{group}/{version}/namespaces/{namespace}/{plural}/{name} | 


## Documentation for Models

 - [IoOpenkruiseAppsV1alpha1BroadcastJob](docs/IoOpenkruiseAppsV1alpha1BroadcastJob.md)
 - [IoOpenkruiseAppsV1alpha1BroadcastJobList](docs/IoOpenkruiseAppsV1alpha1BroadcastJobList.md)
 - [IoOpenkruiseAppsV1alpha1BroadcastJobSpec](docs/IoOpenkruiseAppsV1alpha1BroadcastJobSpec.md)
 - [IoOpenkruiseAppsV1alpha1BroadcastJobStatus](docs/IoOpenkruiseAppsV1alpha1BroadcastJobStatus.md)
 - [IoOpenkruiseAppsV1alpha1CompletionPolicy](docs/IoOpenkruiseAppsV1alpha1CompletionPolicy.md)
 - [IoOpenkruiseAppsV1alpha1InPlaceUpdateContainerStatus](docs/IoOpenkruiseAppsV1alpha1InPlaceUpdateContainerStatus.md)
 - [IoOpenkruiseAppsV1alpha1InPlaceUpdateState](docs/IoOpenkruiseAppsV1alpha1InPlaceUpdateState.md)
 - [IoOpenkruiseAppsV1alpha1JobCondition](docs/IoOpenkruiseAppsV1alpha1JobCondition.md)
 - [IoOpenkruiseAppsV1alpha1RollingUpdateStatefulSetStrategy](docs/IoOpenkruiseAppsV1alpha1RollingUpdateStatefulSetStrategy.md)
 - [IoOpenkruiseAppsV1alpha1SidecarContainer](docs/IoOpenkruiseAppsV1alpha1SidecarContainer.md)
 - [IoOpenkruiseAppsV1alpha1SidecarSet](docs/IoOpenkruiseAppsV1alpha1SidecarSet.md)
 - [IoOpenkruiseAppsV1alpha1SidecarSetList](docs/IoOpenkruiseAppsV1alpha1SidecarSetList.md)
 - [IoOpenkruiseAppsV1alpha1SidecarSetSpec](docs/IoOpenkruiseAppsV1alpha1SidecarSetSpec.md)
 - [IoOpenkruiseAppsV1alpha1SidecarSetStatus](docs/IoOpenkruiseAppsV1alpha1SidecarSetStatus.md)
 - [IoOpenkruiseAppsV1alpha1StatefulSet](docs/IoOpenkruiseAppsV1alpha1StatefulSet.md)
 - [IoOpenkruiseAppsV1alpha1StatefulSetList](docs/IoOpenkruiseAppsV1alpha1StatefulSetList.md)
 - [IoOpenkruiseAppsV1alpha1StatefulSetSpec](docs/IoOpenkruiseAppsV1alpha1StatefulSetSpec.md)
 - [IoOpenkruiseAppsV1alpha1StatefulSetStatus](docs/IoOpenkruiseAppsV1alpha1StatefulSetStatus.md)
 - [IoOpenkruiseAppsV1alpha1StatefulSetUpdateStrategy](docs/IoOpenkruiseAppsV1alpha1StatefulSetUpdateStrategy.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




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

Note that this package has not been uploaded to the maven official repository.
Currently, you should manually download this repo and package it to use.

### Manually

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-java-1.0-SNAPSHOT.jar
* target/lib/*.jar

## Getting Started

It is suggested that you should use ApiClient and CustomObjectsApi from `io.kubernetes:client-java` instead of `io.openkruise:client-java`.
The only thing you should import from `io.openkruise:client-java` is `io.openkruise.client.models.*`.

```java
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;

import io.openkruise.client.models.*;

public class MyExample {

    // generate this client from a kubeconfig file or something else
    ApiClient apiClient;

    public void createStatefulSet(String namespace, KruiseAppsV1alpha1StatefulSet statefulSet) throws ApiException {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        customObjectsApi.createNamespacedCustomObject(
                "apps.kruise.io",
                "v1alpha1",
                namespace,
                "statefulsets",
                statefulSet,
                "true",
                null,
                null
        );
    }

    public KruiseAppsV1alpha1StatefulSet getStatefulSet(String namespace, String name) throws Exception {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object obj = customObjectsApi.getNamespacedCustomObject(
                "apps.kruise.io",
                "v1alpha1",
                namespace,
                "statefulsets",
                name
        );
        Gson gson = new JSON().getGson();
        return gson.fromJson(gson.toJsonTree(obj).getAsJsonObject(), KruiseAppsV1alpha1StatefulSet.class);
    }

    public boolean updateStatefulSet(String namespace, String name, String image, int partition, int maxUnavailable) throws ApiException {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        boolean updateSuccess = false;
        // a loop to handle update conflicts
        for (int i=0; i<5; i++) {
            KruiseAppsV1alpha1StatefulSet statefulSet = this.getStatefulSet(namespace, name);

            // update image in first container
            statefulSet.getSpec().getTemplate().getSpec().getContainers().get(0).setImage(image);
            // update partition
            statefulSet.getSpec().getUpdateStrategy().getRollingUpdate().setPartition(partition);
            // update maxUnavailable
            statefulSet.getSpec().getUpdateStrategy().getRollingUpdate().setMaxUnavailable(new IntOrString(maxUnavailable));

            try {
                customObjectsApi.replaceNamespacedCustomObject(
                        "apps.kruise.io",
                        "v1alpha1",
                        namespace,
                        "statefulsets",
                        name,
                        statefulSet,
                        null,
                        null
                );
                updateSuccess = true;
                break;
            } catch (ApiException e) {
                logger.error(e.getResponseBody());
                // 409 means conflict, just retry to update
                if (e.getCode() != 409) {
                    break;
                }
            }
        }
        return updateSuccess;
    }
}

```

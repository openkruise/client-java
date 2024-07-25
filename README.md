# client-java

## Usage

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.openkruise</groupId>
    <artifactId>client-java</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

**Note that this package has not been uploaded to the maven official repository. Currently, you should manually download this repo and package it to use.**

You should also add the dependency of Kubernetes official java SDK:

```xml
<dependency>
    <groupId>io.kubernetes</groupId>
    <artifactId>client-java</artifactId>
    <version>18.0.1</version>
</dependency>
```

### Manually package

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/client-java-1.0.0.jar
* target/lib/*.jar

## Getting Started

You have to use `ApiClient` and `CustomObjectsApi` in `io.kubernetes:client-java` package.
The only thing you should import from `io.openkruise:client-java` is `io.openkruise.client.models.*`.

```java
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;

import io.openkruise.client.models.*;

public class MyExample {

    // generate this client from a kubeconfig file or something else
    ApiClient apiClient;

    public void createCloneSet(String namespace, KruiseAppsV1alpha1CloneSet cloneSet) throws ApiException {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        customObjectsApi.createNamespacedCustomObject(
                "apps.kruise.io",
                "v1alpha1",
                namespace,
                "clonesets",
                cloneSet,
                "true",
                null,
                null
        );
    }

    public KruiseAppsV1alpha1CloneSet getCloneSet(String namespace, String name) throws Exception {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object obj = customObjectsApi.getNamespacedCustomObject(
                "apps.kruise.io",
                "v1alpha1",
                namespace,
                "clonesets",
                name
        );
        Gson gson = new JSON().getGson();
        return gson.fromJson(gson.toJsonTree(obj).getAsJsonObject(), KruiseAppsV1alpha1CloneSet.class);
    }

    public boolean updateCloneSet(String namespace, String name, String image, int partition, int maxUnavailable) throws ApiException {
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        boolean updateSuccess = false;
        // a loop to handle update conflicts
        for (int i=0; i<5; i++) {
            KruiseAppsV1alpha1CloneSet cloneSet = this.getCloneSet(namespace, name);

            // update image in first container
            cloneSet.getSpec().getTemplate().getSpec().getContainers().get(0).setImage(image);
            // update partition
            cloneSet.getSpec().getUpdateStrategy().setPartition(new IntOrString(partition));
            // update maxUnavailable
            cloneSet.getSpec().getUpdateStrategy().setMaxUnavailable(new IntOrString(maxUnavailable));

            try {
                customObjectsApi.replaceNamespacedCustomObject(
                        "apps.kruise.io",
                        "v1alpha1",
                        namespace,
                        "clonesets",
                        name,
                        cloneSet,
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

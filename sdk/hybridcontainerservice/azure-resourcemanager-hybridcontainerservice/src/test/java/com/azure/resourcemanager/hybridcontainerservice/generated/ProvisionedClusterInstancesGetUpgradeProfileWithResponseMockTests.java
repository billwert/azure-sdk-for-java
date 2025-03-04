// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterUpgradeProfile;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProvisionedClusterInstancesGetUpgradeProfileWithResponseMockTests {
    @Test
    public void testGetUpgradeProfileWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Updating\",\"controlPlaneProfile\":{\"kubernetesVersion\":\"itsmypyyn\",\"osType\":\"Linux\",\"upgrades\":[{\"kubernetesVersion\":\"nzgmwznmabik\",\"isPreview\":true},{\"kubernetesVersion\":\"gj\",\"isPreview\":false},{\"kubernetesVersion\":\"dtlwwrlkd\",\"isPreview\":true},{\"kubernetesVersion\":\"vokotllxdyh\",\"isPreview\":false}]}},\"id\":\"cogjltdtbn\",\"name\":\"hadoocrk\",\"type\":\"cikhnv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HybridContainerServiceManager manager = HybridContainerServiceManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ProvisionedClusterUpgradeProfile response = manager.provisionedClusterInstances()
            .getUpgradeProfileWithResponse("nkedyatrwyhqmib", com.azure.core.util.Context.NONE)
            .getValue();

    }
}

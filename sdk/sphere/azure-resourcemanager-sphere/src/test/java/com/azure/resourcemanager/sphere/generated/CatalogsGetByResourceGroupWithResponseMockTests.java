// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.sphere.AzureSphereManager;
import com.azure.resourcemanager.sphere.models.Catalog;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class CatalogsGetByResourceGroupWithResponseMockTests {
    @Test
    public void testGetByResourceGroupWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"tenantId\":\"ag\",\"provisioningState\":\"Accepted\"},\"location\":\"elmqk\",\"tags\":{\"dhmdua\":\"hvljuahaquh\",\"pvfadmwsrcr\":\"aex\",\"fmisg\":\"vxpvgomz\"},\"id\":\"bnbbeldawkz\",\"name\":\"ali\",\"type\":\"urqhaka\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        AzureSphereManager manager = AzureSphereManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        Catalog response = manager.catalogs()
            .getByResourceGroupWithResponse("ehhseyvjusrts", "hspkdeemao", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("elmqk", response.location());
        Assertions.assertEquals("hvljuahaquh", response.tags().get("dhmdua"));
    }
}

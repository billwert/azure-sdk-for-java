// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.datafactory.DataFactoryManager;
import com.azure.resourcemanager.datafactory.models.GlobalParameterResource;
import com.azure.resourcemanager.datafactory.models.GlobalParameterSpecification;
import com.azure.resourcemanager.datafactory.models.GlobalParameterType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class GlobalParametersCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"cdzul\":{\"type\":\"Float\",\"value\":\"datadvey\"},\"xzszhvjfijxthojb\":{\"type\":\"String\",\"value\":\"datafxedm\"},\"qyapn\":{\"type\":\"Int\",\"value\":\"dataipc\"},\"dwdaugdgvshf\":{\"type\":\"Int\",\"value\":\"databyhdtjynus\"}},\"name\":\"ii\",\"type\":\"ki\",\"etag\":\"okjuehcrywwfnsr\",\"id\":\"jadnwafjiba\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DataFactoryManager manager = DataFactoryManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        GlobalParameterResource response = manager.globalParameters()
            .define("agsx")
            .withExistingFactory("jh", "emlw")
            .withProperties(mapOf("utu",
                new GlobalParameterSpecification().withType(GlobalParameterType.OBJECT).withValue("dataaugenpipptpre")))
            .create();

        Assertions.assertEquals("jadnwafjiba", response.id());
        Assertions.assertEquals(GlobalParameterType.FLOAT, response.properties().get("cdzul").type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

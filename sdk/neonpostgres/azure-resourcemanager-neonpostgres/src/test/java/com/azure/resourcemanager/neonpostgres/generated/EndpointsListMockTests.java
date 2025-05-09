// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.neonpostgres.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.neonpostgres.NeonPostgresManager;
import com.azure.resourcemanager.neonpostgres.models.Endpoint;
import com.azure.resourcemanager.neonpostgres.models.EndpointType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class EndpointsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"entityId\":\"q\",\"entityName\":\"ytgkiql\",\"createdAt\":\"hqtwv\",\"provisioningState\":\"Failed\",\"attributes\":[{\"name\":\"d\",\"value\":\"dzffzjwztsmpchg\"},{\"name\":\"ryelgfyatigfg\",\"value\":\"rrkdknczgor\"},{\"name\":\"wnvojtvmdev\",\"value\":\"lhqvbk\"}],\"projectId\":\"bpyhssrlvkpkp\",\"branchId\":\"cmaccebx\",\"endpointType\":\"read_only\"},\"id\":\"icyvspeslh\",\"name\":\"y\",\"type\":\"kgv\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NeonPostgresManager manager = NeonPostgresManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        PagedIterable<Endpoint> response
            = manager.endpoints().list("c", "xwbpwyykdig", "zlrz", "dasdni", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ytgkiql", response.iterator().next().properties().entityName());
        Assertions.assertEquals("d", response.iterator().next().properties().attributes().get(0).name());
        Assertions.assertEquals("dzffzjwztsmpchg", response.iterator().next().properties().attributes().get(0).value());
        Assertions.assertEquals("bpyhssrlvkpkp", response.iterator().next().properties().projectId());
        Assertions.assertEquals("cmaccebx", response.iterator().next().properties().branchId());
        Assertions.assertEquals(EndpointType.READ_ONLY, response.iterator().next().properties().endpointType());
    }
}

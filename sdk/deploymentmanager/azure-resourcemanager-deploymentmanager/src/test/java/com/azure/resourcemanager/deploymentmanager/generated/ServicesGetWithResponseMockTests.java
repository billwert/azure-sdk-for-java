// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.deploymentmanager.DeploymentManager;
import com.azure.resourcemanager.deploymentmanager.models.ServiceResource;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ServicesGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"properties\":{\"targetLocation\":\"hspkdeemao\",\"targetSubscriptionId\":\"mx\"},\"location\":\"gkvtmelmqkrhah\",\"tags\":{\"alaexqpvfadmwsrc\":\"uahaquhcdhmd\",\"gomz\":\"gvxp\",\"bnbbeldawkz\":\"fmisg\",\"urqhaka\":\"ali\"},\"id\":\"hashsfwxosow\",\"name\":\"xcug\",\"type\":\"cjooxdjebwpucwwf\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        DeploymentManager manager = DeploymentManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ServiceResource response = manager.services()
            .getWithResponse("b", "rnwb", "ehhseyvjusrts", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("gkvtmelmqkrhah", response.location());
        Assertions.assertEquals("uahaquhcdhmd", response.tags().get("alaexqpvfadmwsrc"));
        Assertions.assertEquals("hspkdeemao", response.targetLocation());
        Assertions.assertEquals("mx", response.targetSubscriptionId());
    }
}

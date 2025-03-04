// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.customerinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.customerinsights.CustomerInsightsManager;
import com.azure.resourcemanager.customerinsights.models.PredictionModelLifeCycle;
import com.azure.resourcemanager.customerinsights.models.PredictionModelStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PredictionsGetModelStatusWithResponseMockTests {
    @Test
    public void testGetModelStatusWithResponse() throws Exception {
        String responseStr
            = "{\"tenantId\":\"ewcffrxgg\",\"predictionName\":\"khzpr\",\"predictionGuidId\":\"issenerru\",\"status\":\"PendingTraining\",\"message\":\"aivnpsjnpckplu\",\"trainingSetCount\":490706865,\"testSetCount\":621916401,\"validationSetCount\":902641639,\"signalsUsed\":516656741,\"modelVersion\":\"aoplvv\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        CustomerInsightsManager manager = CustomerInsightsManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PredictionModelStatus response = manager.predictions()
            .getModelStatusWithResponse("udhvos", "jzscuezalivdf", "gq", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals(PredictionModelLifeCycle.PENDING_TRAINING, response.status());
    }
}

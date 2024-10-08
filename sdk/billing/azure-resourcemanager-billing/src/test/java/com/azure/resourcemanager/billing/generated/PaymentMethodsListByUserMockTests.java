// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.PaymentMethod;
import com.azure.resourcemanager.billing.models.PaymentMethodFamily;
import com.azure.resourcemanager.billing.models.PaymentMethodStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PaymentMethodsListByUserMockTests {
    @Test
    public void testListByUser() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"id\":\"n\",\"accountHolderName\":\"za\",\"displayName\":\"vcze\",\"expiration\":\"ewcrblksddb\",\"family\":\"DirectDebit\",\"lastFourDigits\":\"jhoezjikwsu\",\"logos\":[{\"mimeType\":\"xtx\",\"url\":\"ypdcgx\"},{\"mimeType\":\"bwvuwbbzcmp\",\"url\":\"msg\"},{\"mimeType\":\"ksmrgjfyfmj\",\"url\":\"ctybhsg\"}],\"paymentMethodType\":\"umkts\",\"status\":\"inactive\"},\"tags\":{\"mawxrg\":\"ncxje\",\"wwkhiyubykxzcvut\":\"tynqbhhfhi\"},\"id\":\"ih\",\"name\":\"srj\",\"type\":\"pvojw\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PaymentMethod> response = manager.paymentMethods().listByUser(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("ncxje", response.iterator().next().tags().get("mawxrg"));
        Assertions.assertEquals(PaymentMethodFamily.DIRECT_DEBIT, response.iterator().next().family());
        Assertions.assertEquals(PaymentMethodStatus.INACTIVE, response.iterator().next().status());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.models.AzureCloud;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.netapp.NetAppFilesManager;
import com.azure.resourcemanager.netapp.models.Backup;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class BackupsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"backupId\":\"tzejetjklnt\",\"creationDate\":\"2021-05-29T06:35:10Z\",\"snapshotCreationDate\":\"2021-10-12T06:41:45Z\",\"completionDate\":\"2021-01-26T13:29:27Z\",\"provisioningState\":\"bqzolxr\",\"size\":3415302757230506107,\"label\":\"wtrhtgv\",\"backupType\":\"Manual\",\"failureReason\":\"rrkolawjmjs\",\"volumeResourceId\":\"wro\",\"useExistingSnapshot\":true,\"snapshotName\":\"fzzzwyjafitlhg\",\"backupPolicyResourceId\":\"nuchlgmltxdwhmo\",\"isLargeVolume\":false},\"id\":\"zvlnsnnjz\",\"name\":\"pafolp\",\"type\":\"mwamxqzragpgdph\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        NetAppFilesManager manager = NetAppFilesManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureCloud.AZURE_PUBLIC_CLOUD));

        Backup response = manager.backups()
            .getWithResponse("zrvjfnmjmvlwyzgi", "lkujrllfojui", "jpu", "yjucejikzoeo",
                com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("wtrhtgv", response.label());
        Assertions.assertEquals("wro", response.volumeResourceId());
        Assertions.assertEquals(true, response.useExistingSnapshot());
        Assertions.assertEquals("fzzzwyjafitlhg", response.snapshotName());
    }
}

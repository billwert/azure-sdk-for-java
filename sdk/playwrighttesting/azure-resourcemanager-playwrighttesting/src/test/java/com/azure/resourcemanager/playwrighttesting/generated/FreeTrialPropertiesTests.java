// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.playwrighttesting.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.playwrighttesting.models.FreeTrialProperties;

public final class FreeTrialPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FreeTrialProperties model = BinaryData.fromString("{\"accountId\":\"jqul\",\"state\":\"NotRegistered\"}")
            .toObject(FreeTrialProperties.class);
    }
}

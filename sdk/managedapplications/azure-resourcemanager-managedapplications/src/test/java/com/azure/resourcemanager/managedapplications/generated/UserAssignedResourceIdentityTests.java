// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managedapplications.models.UserAssignedResourceIdentity;

public final class UserAssignedResourceIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserAssignedResourceIdentity model = BinaryData.fromString("{\"principalId\":\"ot\",\"tenantId\":\"qgoulznd\"}")
            .toObject(UserAssignedResourceIdentity.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserAssignedResourceIdentity model = new UserAssignedResourceIdentity();
        model = BinaryData.fromObject(model).toObject(UserAssignedResourceIdentity.class);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.models.CommandOutputSettings;
import com.azure.resourcemanager.networkcloud.models.IdentitySelector;
import com.azure.resourcemanager.networkcloud.models.ManagedServiceIdentitySelectorType;
import org.junit.jupiter.api.Assertions;

public final class CommandOutputSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CommandOutputSettings model = BinaryData.fromString(
            "{\"associatedIdentity\":{\"identityType\":\"SystemAssignedIdentity\",\"userAssignedIdentityResourceId\":\"uijfqk\"},\"containerUrl\":\"e\"}")
            .toObject(CommandOutputSettings.class);
        Assertions.assertEquals(ManagedServiceIdentitySelectorType.SYSTEM_ASSIGNED_IDENTITY,
            model.associatedIdentity().identityType());
        Assertions.assertEquals("uijfqk", model.associatedIdentity().userAssignedIdentityResourceId());
        Assertions.assertEquals("e", model.containerUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CommandOutputSettings model
            = new CommandOutputSettings()
                .withAssociatedIdentity(
                    new IdentitySelector().withIdentityType(ManagedServiceIdentitySelectorType.SYSTEM_ASSIGNED_IDENTITY)
                        .withUserAssignedIdentityResourceId("uijfqk"))
                .withContainerUrl("e");
        model = BinaryData.fromObject(model).toObject(CommandOutputSettings.class);
        Assertions.assertEquals(ManagedServiceIdentitySelectorType.SYSTEM_ASSIGNED_IDENTITY,
            model.associatedIdentity().identityType());
        Assertions.assertEquals("uijfqk", model.associatedIdentity().userAssignedIdentityResourceId());
        Assertions.assertEquals("e", model.containerUrl());
    }
}

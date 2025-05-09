// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automanage.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automanage.fluent.models.ConfigurationProfileAssignmentInner;
import com.azure.resourcemanager.automanage.models.ConfigurationProfileAssignmentProperties;
import org.junit.jupiter.api.Assertions;

public final class ConfigurationProfileAssignmentInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConfigurationProfileAssignmentInner model = BinaryData.fromString(
            "{\"properties\":{\"configurationProfile\":\"zxtheotusivyevcc\",\"targetId\":\"ihnhun\",\"status\":\"wjzrnfygxgisp\"},\"managedBy\":\"vtz\",\"id\":\"ufubl\",\"name\":\"ofx\",\"type\":\"eofjaeqjh\"}")
            .toObject(ConfigurationProfileAssignmentInner.class);
        Assertions.assertEquals("zxtheotusivyevcc", model.properties().configurationProfile());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConfigurationProfileAssignmentInner model = new ConfigurationProfileAssignmentInner().withProperties(
            new ConfigurationProfileAssignmentProperties().withConfigurationProfile("zxtheotusivyevcc"));
        model = BinaryData.fromObject(model).toObject(ConfigurationProfileAssignmentInner.class);
        Assertions.assertEquals("zxtheotusivyevcc", model.properties().configurationProfile());
    }
}

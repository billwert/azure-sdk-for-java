// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.fluent.models.ResourceProviderOperationInner;
import com.azure.resourcemanager.kubernetesconfiguration.models.ResourceProviderOperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class ResourceProviderOperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ResourceProviderOperationInner model = BinaryData.fromString(
            "{\"name\":\"ts\",\"display\":{\"provider\":\"cbpwxqpsrknft\",\"resource\":\"vriuhprwmdyvx\",\"operation\":\"ayriwwroyqbexrm\",\"description\":\"ibycno\"},\"isDataAction\":false,\"origin\":\"mefqsgzvahapjyzh\"}")
            .toObject(ResourceProviderOperationInner.class);
        Assertions.assertEquals("ts", model.name());
        Assertions.assertEquals("cbpwxqpsrknft", model.display().provider());
        Assertions.assertEquals("vriuhprwmdyvx", model.display().resource());
        Assertions.assertEquals("ayriwwroyqbexrm", model.display().operation());
        Assertions.assertEquals("ibycno", model.display().description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ResourceProviderOperationInner model = new ResourceProviderOperationInner().withName("ts")
            .withDisplay(new ResourceProviderOperationDisplay().withProvider("cbpwxqpsrknft")
                .withResource("vriuhprwmdyvx")
                .withOperation("ayriwwroyqbexrm")
                .withDescription("ibycno"));
        model = BinaryData.fromObject(model).toObject(ResourceProviderOperationInner.class);
        Assertions.assertEquals("ts", model.name());
        Assertions.assertEquals("cbpwxqpsrknft", model.display().provider());
        Assertions.assertEquals("vriuhprwmdyvx", model.display().resource());
        Assertions.assertEquals("ayriwwroyqbexrm", model.display().operation());
        Assertions.assertEquals("ibycno", model.display().description());
    }
}

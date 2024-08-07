// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.informaticadatamanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.informaticadatamanagement.models.ComputeUnitsMetadata;
import org.junit.jupiter.api.Assertions;

public final class ComputeUnitsMetadataTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComputeUnitsMetadata model
            = BinaryData.fromString("{\"name\":\"e\",\"value\":[\"arrwlquu\"]}").toObject(ComputeUnitsMetadata.class);
        Assertions.assertEquals("e", model.name());
        Assertions.assertEquals("arrwlquu", model.value().get(0));
    }
}

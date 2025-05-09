// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.resourcehealth.models.ServiceImpactingEventStatus;
import org.junit.jupiter.api.Assertions;

public final class ServiceImpactingEventStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceImpactingEventStatus model
            = BinaryData.fromString("{\"value\":\"mngnzscxaqw\"}").toObject(ServiceImpactingEventStatus.class);
        Assertions.assertEquals("mngnzscxaqw", model.value());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceImpactingEventStatus model = new ServiceImpactingEventStatus().withValue("mngnzscxaqw");
        model = BinaryData.fromObject(model).toObject(ServiceImpactingEventStatus.class);
        Assertions.assertEquals("mngnzscxaqw", model.value());
    }
}

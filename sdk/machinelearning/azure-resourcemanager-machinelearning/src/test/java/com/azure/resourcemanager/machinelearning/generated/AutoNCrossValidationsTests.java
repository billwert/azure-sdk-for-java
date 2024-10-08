// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.AutoNCrossValidations;

public final class AutoNCrossValidationsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutoNCrossValidations model
            = BinaryData.fromString("{\"mode\":\"Auto\"}").toObject(AutoNCrossValidations.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutoNCrossValidations model = new AutoNCrossValidations();
        model = BinaryData.fromObject(model).toObject(AutoNCrossValidations.class);
    }
}

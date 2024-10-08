// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.fabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.fabric.fluent.models.RpSkuDetailsForExistingResourceInner;
import com.azure.resourcemanager.fabric.models.RpSkuTier;
import org.junit.jupiter.api.Assertions;

public final class RpSkuDetailsForExistingResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RpSkuDetailsForExistingResourceInner model = BinaryData
            .fromString("{\"resourceType\":\"yqduujit\",\"sku\":{\"name\":\"jczdzevndh\",\"tier\":\"Fabric\"}}")
            .toObject(RpSkuDetailsForExistingResourceInner.class);
        Assertions.assertEquals("yqduujit", model.resourceType());
        Assertions.assertEquals("jczdzevndh", model.sku().name());
        Assertions.assertEquals(RpSkuTier.FABRIC, model.sku().tier());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.billing.models.ReservationSwapProperties;
import org.junit.jupiter.api.Assertions;

public final class ReservationSwapPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReservationSwapProperties model
            = BinaryData.fromString("{\"swapSource\":\"cqsxrmdvewu\",\"swapDestination\":\"aeohpjhgejkbvhh\"}")
                .toObject(ReservationSwapProperties.class);
        Assertions.assertEquals("cqsxrmdvewu", model.swapSource());
        Assertions.assertEquals("aeohpjhgejkbvhh", model.swapDestination());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReservationSwapProperties model
            = new ReservationSwapProperties().withSwapSource("cqsxrmdvewu").withSwapDestination("aeohpjhgejkbvhh");
        model = BinaryData.fromObject(model).toObject(ReservationSwapProperties.class);
        Assertions.assertEquals("cqsxrmdvewu", model.swapSource());
        Assertions.assertEquals("aeohpjhgejkbvhh", model.swapDestination());
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresql.fluent.models.LogFileProperties;
import org.junit.jupiter.api.Assertions;

public final class LogFilePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LogFileProperties model = BinaryData.fromString(
            "{\"sizeInKB\":5446401731314405625,\"createdTime\":\"2021-03-05T21:12:23Z\",\"lastModifiedTime\":\"2021-05-15T00:01:52Z\",\"type\":\"ifsjttgzfbishcb\",\"url\":\"ajdeyeamdphaga\"}")
            .toObject(LogFileProperties.class);
        Assertions.assertEquals(5446401731314405625L, model.sizeInKB());
        Assertions.assertEquals("ifsjttgzfbishcb", model.type());
        Assertions.assertEquals("ajdeyeamdphaga", model.url());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LogFileProperties model = new LogFileProperties().withSizeInKB(5446401731314405625L)
            .withType("ifsjttgzfbishcb")
            .withUrl("ajdeyeamdphaga");
        model = BinaryData.fromObject(model).toObject(LogFileProperties.class);
        Assertions.assertEquals(5446401731314405625L, model.sizeInKB());
        Assertions.assertEquals("ifsjttgzfbishcb", model.type());
        Assertions.assertEquals("ajdeyeamdphaga", model.url());
    }
}

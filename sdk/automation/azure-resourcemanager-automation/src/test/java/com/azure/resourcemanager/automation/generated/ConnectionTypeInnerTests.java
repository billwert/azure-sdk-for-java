// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.automation.fluent.models.ConnectionTypeInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ConnectionTypeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ConnectionTypeInner model = BinaryData.fromString(
            "{\"id\":\"x\",\"name\":\"mwutwbdsre\",\"type\":\"drhneuyow\",\"properties\":{\"isGlobal\":false,\"fieldDefinitions\":{\"mejzanlfzxia\":{\"isEncrypted\":true,\"isOptional\":false,\"type\":\"ircgpikpz\"}},\"creationTime\":\"2021-11-26T01:54:29Z\",\"lastModifiedTime\":\"2021-09-16T17:22:47Z\",\"description\":\"nokixrjqcirgz\"}}")
            .toObject(ConnectionTypeInner.class);
        Assertions.assertEquals(false, model.isGlobal());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-16T17:22:47Z"), model.lastModifiedTime());
        Assertions.assertEquals("nokixrjqcirgz", model.description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ConnectionTypeInner model = new ConnectionTypeInner().withIsGlobal(false)
            .withLastModifiedTime(OffsetDateTime.parse("2021-09-16T17:22:47Z"))
            .withDescription("nokixrjqcirgz");
        model = BinaryData.fromObject(model).toObject(ConnectionTypeInner.class);
        Assertions.assertEquals(false, model.isGlobal());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-16T17:22:47Z"), model.lastModifiedTime());
        Assertions.assertEquals("nokixrjqcirgz", model.description());
    }
}

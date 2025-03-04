// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.TagContractInner;
import com.azure.resourcemanager.apimanagement.models.TagCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TagCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TagCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"displayName\":\"iprglvawu\"},\"id\":\"z\",\"name\":\"ufypiv\",\"type\":\"sbbjpmcu\"},{\"properties\":{\"displayName\":\"mifoxxkub\"},\"id\":\"phavpmhbrb\",\"name\":\"gvgovpbbttefjo\",\"type\":\"nssqyzqed\"},{\"properties\":{\"displayName\":\"dfrdbi\"},\"id\":\"mrjgeihfqlggwfi\",\"name\":\"zcxmjpbyep\",\"type\":\"mgtvlj\"}],\"count\":5030460959235510617,\"nextLink\":\"fqip\"}")
            .toObject(TagCollection.class);
        Assertions.assertEquals("iprglvawu", model.value().get(0).displayName());
        Assertions.assertEquals(5030460959235510617L, model.count());
        Assertions.assertEquals("fqip", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TagCollection model = new TagCollection()
            .withValue(Arrays.asList(new TagContractInner().withDisplayName("iprglvawu"),
                new TagContractInner().withDisplayName("mifoxxkub"), new TagContractInner().withDisplayName("dfrdbi")))
            .withCount(5030460959235510617L)
            .withNextLink("fqip");
        model = BinaryData.fromObject(model).toObject(TagCollection.class);
        Assertions.assertEquals("iprglvawu", model.value().get(0).displayName());
        Assertions.assertEquals(5030460959235510617L, model.count());
        Assertions.assertEquals("fqip", model.nextLink());
    }
}

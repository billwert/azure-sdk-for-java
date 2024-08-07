// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.NodeTypeSkuCapacity;

public final class NodeTypeSkuCapacityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NodeTypeSkuCapacity model = BinaryData
            .fromString("{\"minimum\":866301348,\"maximum\":572300163,\"default\":1872766965,\"scaleType\":\"None\"}")
            .toObject(NodeTypeSkuCapacity.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NodeTypeSkuCapacity model = new NodeTypeSkuCapacity();
        model = BinaryData.fromObject(model).toObject(NodeTypeSkuCapacity.class);
    }
}

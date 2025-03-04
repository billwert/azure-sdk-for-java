// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.models.IpCommunityAddOperationProperties;
import com.azure.resourcemanager.managednetworkfabric.models.IpCommunityIdList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class IpCommunityAddOperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IpCommunityAddOperationProperties model = BinaryData
            .fromString("{\"add\":{\"ipCommunityIds\":[\"gkuirxxeuwiiir\",\"vnfgbdviwxo\",\"ktxagfujdb\"]}}")
            .toObject(IpCommunityAddOperationProperties.class);
        Assertions.assertEquals("gkuirxxeuwiiir", model.add().ipCommunityIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IpCommunityAddOperationProperties model = new IpCommunityAddOperationProperties().withAdd(
            new IpCommunityIdList().withIpCommunityIds(Arrays.asList("gkuirxxeuwiiir", "vnfgbdviwxo", "ktxagfujdb")));
        model = BinaryData.fromObject(model).toObject(IpCommunityAddOperationProperties.class);
        Assertions.assertEquals("gkuirxxeuwiiir", model.add().ipCommunityIds().get(0));
    }
}

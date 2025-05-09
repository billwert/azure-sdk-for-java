// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.fluent.models.RegionInfoResourceInner;
import com.azure.resourcemanager.netapp.models.RegionInfoAvailabilityZoneMappingsItem;
import com.azure.resourcemanager.netapp.models.RegionInfosList;
import com.azure.resourcemanager.netapp.models.RegionStorageToNetworkProximity;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class RegionInfosListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RegionInfosList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"storageToNetworkProximity\":\"T2AndAcrossT2\",\"availabilityZoneMappings\":[{\"availabilityZone\":\"ghsauuimjmvxied\",\"isAvailable\":false},{\"availabilityZone\":\"dyjrrfbyaosv\",\"isAvailable\":true},{\"availabilityZone\":\"onpc\",\"isAvailable\":true}]},\"id\":\"ohslkevlegg\",\"name\":\"fbuhfmvfaxkffe\",\"type\":\"ithlvmezyvshxm\"}],\"nextLink\":\"bbzoggig\"}")
            .toObject(RegionInfosList.class);
        Assertions.assertEquals(RegionStorageToNetworkProximity.T2AND_ACROSS_T2,
            model.value().get(0).storageToNetworkProximity());
        Assertions.assertEquals("ghsauuimjmvxied",
            model.value().get(0).availabilityZoneMappings().get(0).availabilityZone());
        Assertions.assertEquals(false, model.value().get(0).availabilityZoneMappings().get(0).isAvailable());
        Assertions.assertEquals("bbzoggig", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RegionInfosList model = new RegionInfosList().withValue(Arrays.asList(new RegionInfoResourceInner()
            .withStorageToNetworkProximity(RegionStorageToNetworkProximity.T2AND_ACROSS_T2)
            .withAvailabilityZoneMappings(Arrays.asList(
                new RegionInfoAvailabilityZoneMappingsItem().withAvailabilityZone("ghsauuimjmvxied")
                    .withIsAvailable(false),
                new RegionInfoAvailabilityZoneMappingsItem().withAvailabilityZone("dyjrrfbyaosv").withIsAvailable(true),
                new RegionInfoAvailabilityZoneMappingsItem().withAvailabilityZone("onpc").withIsAvailable(true)))))
            .withNextLink("bbzoggig");
        model = BinaryData.fromObject(model).toObject(RegionInfosList.class);
        Assertions.assertEquals(RegionStorageToNetworkProximity.T2AND_ACROSS_T2,
            model.value().get(0).storageToNetworkProximity());
        Assertions.assertEquals("ghsauuimjmvxied",
            model.value().get(0).availabilityZoneMappings().get(0).availabilityZone());
        Assertions.assertEquals(false, model.value().get(0).availabilityZoneMappings().get(0).isAvailable());
        Assertions.assertEquals("bbzoggig", model.nextLink());
    }
}

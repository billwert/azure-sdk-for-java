// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.NicInfo;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NicInfoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NicInfo model = BinaryData
            .fromString("{\"ipAddress\":\"hgyxzkonoc\",\"volumeResourceIds\":[\"klyaxuconu\",\"szfkbe\",\"pewr\"]}")
            .toObject(NicInfo.class);
        Assertions.assertEquals("klyaxuconu", model.volumeResourceIds().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NicInfo model = new NicInfo().withVolumeResourceIds(Arrays.asList("klyaxuconu", "szfkbe", "pewr"));
        model = BinaryData.fromObject(model).toObject(NicInfo.class);
        Assertions.assertEquals("klyaxuconu", model.volumeResourceIds().get(0));
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridconnectivity.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridconnectivity.fluent.models.ServiceConfigurationResourceInner;
import com.azure.resourcemanager.hybridconnectivity.models.ServiceConfigurationList;
import com.azure.resourcemanager.hybridconnectivity.models.ServiceName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ServiceConfigurationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceConfigurationList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"serviceName\":\"SSH\",\"resourceId\":\"sprozvcput\",\"port\":7394887039726775075,\"provisioningState\":\"Creating\"},\"id\":\"datscmd\",\"name\":\"pjhulsuuvmkj\",\"type\":\"zkrwfn\"},{\"properties\":{\"serviceName\":\"WAC\",\"resourceId\":\"jpslwejd\",\"port\":2711659806667039097,\"provisioningState\":\"Succeeded\"},\"id\":\"psoacctazakljl\",\"name\":\"hbcryffdfdosyge\",\"type\":\"paojakhmsbzjh\"},{\"properties\":{\"serviceName\":\"SSH\",\"resourceId\":\"vdphlxaolthqtr\",\"port\":2607282935918519139,\"provisioningState\":\"Failed\"},\"id\":\"fsinzgvfcjrwzoxx\",\"name\":\"tfell\",\"type\":\"wfzitonpeqfpjk\"}],\"nextLink\":\"xofpdvhpfxxypi\"}")
            .toObject(ServiceConfigurationList.class);
        Assertions.assertEquals(ServiceName.SSH, model.value().get(0).serviceName());
        Assertions.assertEquals("sprozvcput", model.value().get(0).resourceId());
        Assertions.assertEquals(7394887039726775075L, model.value().get(0).port());
        Assertions.assertEquals("xofpdvhpfxxypi", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceConfigurationList model = new ServiceConfigurationList().withValue(Arrays.asList(
            new ServiceConfigurationResourceInner().withServiceName(ServiceName.SSH)
                .withResourceId("sprozvcput")
                .withPort(7394887039726775075L),
            new ServiceConfigurationResourceInner().withServiceName(ServiceName.WAC)
                .withResourceId("jpslwejd")
                .withPort(2711659806667039097L),
            new ServiceConfigurationResourceInner().withServiceName(ServiceName.SSH)
                .withResourceId("vdphlxaolthqtr")
                .withPort(2607282935918519139L)))
            .withNextLink("xofpdvhpfxxypi");
        model = BinaryData.fromObject(model).toObject(ServiceConfigurationList.class);
        Assertions.assertEquals(ServiceName.SSH, model.value().get(0).serviceName());
        Assertions.assertEquals("sprozvcput", model.value().get(0).resourceId());
        Assertions.assertEquals(7394887039726775075L, model.value().get(0).port());
        Assertions.assertEquals("xofpdvhpfxxypi", model.nextLink());
    }
}

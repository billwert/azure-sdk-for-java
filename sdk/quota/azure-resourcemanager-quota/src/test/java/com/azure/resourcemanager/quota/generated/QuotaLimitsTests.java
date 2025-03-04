// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.fluent.models.CurrentQuotaLimitBaseInner;
import com.azure.resourcemanager.quota.models.LimitJsonObject;
import com.azure.resourcemanager.quota.models.QuotaLimits;
import com.azure.resourcemanager.quota.models.QuotaProperties;
import com.azure.resourcemanager.quota.models.ResourceName;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class QuotaLimitsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        QuotaLimits model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"limit\":{\"limitObjectType\":\"LimitJsonObject\"},\"unit\":\"idokgjlj\",\"name\":{\"value\":\"gvcl\",\"localizedValue\":\"gsncghkjeszz\"},\"resourceType\":\"ijhtxf\",\"quotaPeriod\":\"xbf\",\"isQuotaApplicable\":true,\"properties\":\"dataeh\"},\"id\":\"pvecxgodeb\",\"name\":\"qkkrb\",\"type\":\"pukgriwflzlfb\"},{\"properties\":{\"limit\":{\"limitObjectType\":\"LimitJsonObject\"},\"unit\":\"zycispn\",\"name\":{\"value\":\"hmgkbrpyy\",\"localizedValue\":\"ibnuqqkpik\"},\"resourceType\":\"rgvtqag\",\"quotaPeriod\":\"uynhijg\",\"isQuotaApplicable\":false,\"properties\":\"datafsiarbutr\"},\"id\":\"vpnazzm\",\"name\":\"jrunmpxtt\",\"type\":\"bh\"}],\"nextLink\":\"nlankxmyskpb\"}")
            .toObject(QuotaLimits.class);
        Assertions.assertEquals("gvcl", model.value().get(0).properties().name().value());
        Assertions.assertEquals("ijhtxf", model.value().get(0).properties().resourceType());
        Assertions.assertEquals("nlankxmyskpb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        QuotaLimits model = new QuotaLimits().withValue(Arrays.asList(
            new CurrentQuotaLimitBaseInner().withProperties(new QuotaProperties().withLimit(new LimitJsonObject())
                .withName(new ResourceName().withValue("gvcl"))
                .withResourceType("ijhtxf")
                .withProperties("dataeh")),
            new CurrentQuotaLimitBaseInner().withProperties(new QuotaProperties().withLimit(new LimitJsonObject())
                .withName(new ResourceName().withValue("hmgkbrpyy"))
                .withResourceType("rgvtqag")
                .withProperties("datafsiarbutr"))))
            .withNextLink("nlankxmyskpb");
        model = BinaryData.fromObject(model).toObject(QuotaLimits.class);
        Assertions.assertEquals("gvcl", model.value().get(0).properties().name().value());
        Assertions.assertEquals("ijhtxf", model.value().get(0).properties().resourceType());
        Assertions.assertEquals("nlankxmyskpb", model.nextLink());
    }
}

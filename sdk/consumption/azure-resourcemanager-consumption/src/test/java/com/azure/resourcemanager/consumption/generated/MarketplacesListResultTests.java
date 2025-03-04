// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.consumption.models.MarketplacesListResult;

public final class MarketplacesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MarketplacesListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"billingPeriodId\":\"slwejdpvw\",\"usageStart\":\"2021-07-13T16:59:20Z\",\"usageEnd\":\"2021-09-27T20:49:26Z\",\"offerName\":\"acctazakljla\",\"resourceGroup\":\"cr\",\"additionalInfo\":\"fdfdosygexpa\",\"orderNumber\":\"akhmsbzjhcrz\",\"instanceName\":\"dphlxaolt\",\"instanceId\":\"trg\",\"currency\":\"bpf\",\"unitOfMeasure\":\"inzgvfcj\",\"isEstimated\":true,\"meterId\":\"e166684a-7eb9-446b-b49a-d6fd32533ba9\",\"subscriptionGuid\":\"a32692d2-3aff-4093-8c7b-33ae806b15aa\",\"subscriptionName\":\"tfell\",\"accountName\":\"fziton\",\"departmentName\":\"qfpjk\",\"consumedService\":\"xofpdvhpfxxypi\",\"costCenter\":\"nmayhuybb\",\"additionalProperties\":\"odepoogin\",\"publisherName\":\"amiheognarxz\",\"planName\":\"heotusiv\",\"isRecurringCharge\":false},\"etag\":\"ciqihnhung\",\"tags\":{\"gxg\":\"zrnf\",\"fublj\":\"spemvtzfk\"},\"id\":\"fxqeof\",\"name\":\"aeqjhqjbasvms\",\"type\":\"jqul\"},{\"properties\":{\"billingPeriodId\":\"ntnbybkzg\",\"usageStart\":\"2021-06-16T21:35:22Z\",\"usageEnd\":\"2021-10-31T07:08:50Z\",\"offerName\":\"xwrljdouskcqvkoc\",\"resourceGroup\":\"jdkwtnhxbnjb\",\"additionalInfo\":\"sqrglssainq\",\"orderNumber\":\"wnzlljfmppeeb\",\"instanceName\":\"gxsabkyq\",\"instanceId\":\"ujitcjcz\",\"currency\":\"evndh\",\"unitOfMeasure\":\"pdappds\",\"isEstimated\":false,\"meterId\":\"7b9736a1-97b0-4460-add5-153c0d04209f\",\"subscriptionGuid\":\"7739a494-c2e9-46a9-a324-4d12dda58a3c\",\"subscriptionName\":\"jfeusnh\",\"accountName\":\"je\",\"departmentName\":\"mrldhu\",\"consumedService\":\"zzd\",\"costCenter\":\"qxhocdgeablgphut\",\"additionalProperties\":\"ndv\",\"publisherName\":\"ozwyiftyhxhuro\",\"planName\":\"tyxolniwpwc\",\"isRecurringCharge\":true},\"etag\":\"kgiawxklryplwck\",\"tags\":{\"koty\":\"yypnddhsgcbacphe\"},\"id\":\"qgoulznd\",\"name\":\"i\",\"type\":\"wyqkgfgibm\"}],\"nextLink\":\"gakeqsr\"}")
            .toObject(MarketplacesListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MarketplacesListResult model = new MarketplacesListResult();
        model = BinaryData.fromObject(model).toObject(MarketplacesListResult.class);
    }
}

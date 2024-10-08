// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.HciNicDetail;

public final class HciNicDetailTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HciNicDetail model = BinaryData.fromString(
            "{\"adapterName\":\"ajbrzmqxucy\",\"interfaceDescription\":\"joclxiutgjcyzy\",\"componentId\":\"dnrqjbtxj\",\"driverVersion\":\"oqa\",\"ip4Address\":\"z\",\"subnetMask\":\"hfw\",\"defaultGateway\":\"uatbwbqamteuliy\",\"dnsServers\":[\"kcvmwfauxxepmy\",\"bormcqmiciijqpkz\"],\"defaultIsolationId\":\"ojxjmcsmyqwix\",\"macAddress\":\"pwnkwywzwo\",\"slot\":\"lickduoi\",\"switchName\":\"amt\",\"nicType\":\"sknxrwzawnvsbcf\",\"vlanId\":\"agxnvhycvdimw\",\"nicStatus\":\"regzgyufutrwpwer\"}")
            .toObject(HciNicDetail.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HciNicDetail model = new HciNicDetail();
        model = BinaryData.fromObject(model).toObject(HciNicDetail.class);
    }
}

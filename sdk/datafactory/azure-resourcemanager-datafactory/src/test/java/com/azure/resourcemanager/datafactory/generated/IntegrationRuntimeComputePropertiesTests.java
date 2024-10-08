// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.CopyComputeScaleProperties;
import com.azure.resourcemanager.datafactory.models.DataFlowComputeType;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeComputeProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataFlowProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeVNetProperties;
import com.azure.resourcemanager.datafactory.models.PipelineExternalComputeScaleProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeComputePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeComputeProperties model = BinaryData.fromString(
            "{\"location\":\"zxxzndwtomin\",\"nodeSize\":\"f\",\"numberOfNodes\":1479856776,\"maxParallelExecutionsPerNode\":2091496981,\"dataFlowProperties\":{\"computeType\":\"General\",\"coreCount\":610534246,\"timeToLive\":513393962,\"cleanup\":false,\"customProperties\":[{\"name\":\"q\",\"value\":\"t\"},{\"name\":\"uzc\",\"value\":\"lirybytcaqp\"},{\"name\":\"hlc\",\"value\":\"rvxyyh\"}],\"\":{\"eqiwduukaamimkj\":\"datasztqfrpan\"}},\"vNetProperties\":{\"vNetId\":\"ysjdfxvksijr\",\"subnet\":\"yindex\",\"publicIPs\":[\"vuyxuu\",\"zea\"],\"subnetId\":\"atopdtphvj\",\"\":{\"ngqyiyjxzxbtht\":\"datazy\",\"cve\":\"datayzpuonrmdlkoab\"}},\"copyComputeScaleProperties\":{\"dataIntegrationUnit\":1097849397,\"timeToLive\":2091236479,\"\":{\"yuyutkbxr\":\"dataqshsasm\"}},\"pipelineExternalComputeScaleProperties\":{\"timeToLive\":670066514,\"numberOfPipelineNodes\":2055140017,\"numberOfExternalNodes\":1136227748,\"\":{\"dfeemxiurpf\":\"datauuihkybgkyncyzj\"}},\"\":{\"o\":\"datapmwdzajpcroxp\"}}")
            .toObject(IntegrationRuntimeComputeProperties.class);
        Assertions.assertEquals("zxxzndwtomin", model.location());
        Assertions.assertEquals("f", model.nodeSize());
        Assertions.assertEquals(1479856776, model.numberOfNodes());
        Assertions.assertEquals(2091496981, model.maxParallelExecutionsPerNode());
        Assertions.assertEquals(DataFlowComputeType.GENERAL, model.dataFlowProperties().computeType());
        Assertions.assertEquals(610534246, model.dataFlowProperties().coreCount());
        Assertions.assertEquals(513393962, model.dataFlowProperties().timeToLive());
        Assertions.assertEquals(false, model.dataFlowProperties().cleanup());
        Assertions.assertEquals("q", model.dataFlowProperties().customProperties().get(0).name());
        Assertions.assertEquals("t", model.dataFlowProperties().customProperties().get(0).value());
        Assertions.assertEquals("ysjdfxvksijr", model.vNetProperties().vNetId());
        Assertions.assertEquals("yindex", model.vNetProperties().subnet());
        Assertions.assertEquals("vuyxuu", model.vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("atopdtphvj", model.vNetProperties().subnetId());
        Assertions.assertEquals(1097849397, model.copyComputeScaleProperties().dataIntegrationUnit());
        Assertions.assertEquals(2091236479, model.copyComputeScaleProperties().timeToLive());
        Assertions.assertEquals(670066514, model.pipelineExternalComputeScaleProperties().timeToLive());
        Assertions.assertEquals(2055140017, model.pipelineExternalComputeScaleProperties().numberOfPipelineNodes());
        Assertions.assertEquals(1136227748, model.pipelineExternalComputeScaleProperties().numberOfExternalNodes());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeComputeProperties model = new IntegrationRuntimeComputeProperties()
            .withLocation("zxxzndwtomin")
            .withNodeSize("f")
            .withNumberOfNodes(1479856776)
            .withMaxParallelExecutionsPerNode(2091496981)
            .withDataFlowProperties(new IntegrationRuntimeDataFlowProperties()
                .withComputeType(DataFlowComputeType.GENERAL)
                .withCoreCount(610534246)
                .withTimeToLive(513393962)
                .withCleanup(false)
                .withCustomProperties(Arrays.asList(
                    new IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem().withName("q").withValue("t"),
                    new IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem().withName("uzc")
                        .withValue("lirybytcaqp"),
                    new IntegrationRuntimeDataFlowPropertiesCustomPropertiesItem().withName("hlc").withValue("rvxyyh")))
                .withAdditionalProperties(mapOf()))
            .withVNetProperties(new IntegrationRuntimeVNetProperties().withVNetId("ysjdfxvksijr")
                .withSubnet("yindex")
                .withPublicIPs(Arrays.asList("vuyxuu", "zea"))
                .withSubnetId("atopdtphvj")
                .withAdditionalProperties(mapOf()))
            .withCopyComputeScaleProperties(new CopyComputeScaleProperties().withDataIntegrationUnit(1097849397)
                .withTimeToLive(2091236479)
                .withAdditionalProperties(mapOf()))
            .withPipelineExternalComputeScaleProperties(
                new PipelineExternalComputeScaleProperties().withTimeToLive(670066514)
                    .withNumberOfPipelineNodes(2055140017)
                    .withNumberOfExternalNodes(1136227748)
                    .withAdditionalProperties(mapOf()))
            .withAdditionalProperties(mapOf());
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeComputeProperties.class);
        Assertions.assertEquals("zxxzndwtomin", model.location());
        Assertions.assertEquals("f", model.nodeSize());
        Assertions.assertEquals(1479856776, model.numberOfNodes());
        Assertions.assertEquals(2091496981, model.maxParallelExecutionsPerNode());
        Assertions.assertEquals(DataFlowComputeType.GENERAL, model.dataFlowProperties().computeType());
        Assertions.assertEquals(610534246, model.dataFlowProperties().coreCount());
        Assertions.assertEquals(513393962, model.dataFlowProperties().timeToLive());
        Assertions.assertEquals(false, model.dataFlowProperties().cleanup());
        Assertions.assertEquals("q", model.dataFlowProperties().customProperties().get(0).name());
        Assertions.assertEquals("t", model.dataFlowProperties().customProperties().get(0).value());
        Assertions.assertEquals("ysjdfxvksijr", model.vNetProperties().vNetId());
        Assertions.assertEquals("yindex", model.vNetProperties().subnet());
        Assertions.assertEquals("vuyxuu", model.vNetProperties().publicIPs().get(0));
        Assertions.assertEquals("atopdtphvj", model.vNetProperties().subnetId());
        Assertions.assertEquals(1097849397, model.copyComputeScaleProperties().dataIntegrationUnit());
        Assertions.assertEquals(2091236479, model.copyComputeScaleProperties().timeToLive());
        Assertions.assertEquals(670066514, model.pipelineExternalComputeScaleProperties().timeToLive());
        Assertions.assertEquals(2055140017, model.pipelineExternalComputeScaleProperties().numberOfPipelineNodes());
        Assertions.assertEquals(1136227748, model.pipelineExternalComputeScaleProperties().numberOfExternalNodes());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}

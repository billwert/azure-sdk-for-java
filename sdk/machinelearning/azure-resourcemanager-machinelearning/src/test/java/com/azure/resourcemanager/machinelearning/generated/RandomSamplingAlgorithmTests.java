// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.RandomSamplingAlgorithm;
import com.azure.resourcemanager.machinelearning.models.RandomSamplingAlgorithmRule;
import org.junit.jupiter.api.Assertions;

public final class RandomSamplingAlgorithmTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RandomSamplingAlgorithm model
            = BinaryData.fromString("{\"samplingAlgorithmType\":\"Random\",\"seed\":1840024509,\"rule\":\"Random\"}")
                .toObject(RandomSamplingAlgorithm.class);
        Assertions.assertEquals(1840024509, model.seed());
        Assertions.assertEquals(RandomSamplingAlgorithmRule.RANDOM, model.rule());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RandomSamplingAlgorithm model
            = new RandomSamplingAlgorithm().withSeed(1840024509).withRule(RandomSamplingAlgorithmRule.RANDOM);
        model = BinaryData.fromObject(model).toObject(RandomSamplingAlgorithm.class);
        Assertions.assertEquals(1840024509, model.seed());
        Assertions.assertEquals(RandomSamplingAlgorithmRule.RANDOM, model.rule());
    }
}

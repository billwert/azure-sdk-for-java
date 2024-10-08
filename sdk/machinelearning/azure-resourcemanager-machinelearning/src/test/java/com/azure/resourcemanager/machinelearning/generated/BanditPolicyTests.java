// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.BanditPolicy;
import org.junit.jupiter.api.Assertions;

public final class BanditPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BanditPolicy model = BinaryData.fromString(
            "{\"policyType\":\"Bandit\",\"slackFactor\":60.285545,\"slackAmount\":73.91734,\"evaluationInterval\":1123560800,\"delayEvaluation\":1370389329}")
            .toObject(BanditPolicy.class);
        Assertions.assertEquals(1123560800, model.evaluationInterval());
        Assertions.assertEquals(1370389329, model.delayEvaluation());
        Assertions.assertEquals(60.285545F, model.slackFactor());
        Assertions.assertEquals(73.91734F, model.slackAmount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BanditPolicy model = new BanditPolicy().withEvaluationInterval(1123560800)
            .withDelayEvaluation(1370389329)
            .withSlackFactor(60.285545F)
            .withSlackAmount(73.91734F);
        model = BinaryData.fromObject(model).toObject(BanditPolicy.class);
        Assertions.assertEquals(1123560800, model.evaluationInterval());
        Assertions.assertEquals(1370389329, model.delayEvaluation());
        Assertions.assertEquals(60.285545F, model.slackFactor());
        Assertions.assertEquals(73.91734F, model.slackAmount());
    }
}

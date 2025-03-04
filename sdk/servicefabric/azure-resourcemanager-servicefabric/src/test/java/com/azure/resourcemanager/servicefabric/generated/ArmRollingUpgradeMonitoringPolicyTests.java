// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.ArmRollingUpgradeMonitoringPolicy;
import com.azure.resourcemanager.servicefabric.models.ArmUpgradeFailureAction;
import org.junit.jupiter.api.Assertions;

public final class ArmRollingUpgradeMonitoringPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ArmRollingUpgradeMonitoringPolicy model = BinaryData.fromString(
            "{\"failureAction\":\"Manual\",\"healthCheckWaitDuration\":\"ovasrruvwbhsqfsu\",\"healthCheckStableDuration\":\"gjb\",\"healthCheckRetryTimeout\":\"xb\",\"upgradeTimeout\":\"bsrfbj\",\"upgradeDomainTimeout\":\"twss\"}")
            .toObject(ArmRollingUpgradeMonitoringPolicy.class);
        Assertions.assertEquals(ArmUpgradeFailureAction.MANUAL, model.failureAction());
        Assertions.assertEquals("ovasrruvwbhsqfsu", model.healthCheckWaitDuration());
        Assertions.assertEquals("gjb", model.healthCheckStableDuration());
        Assertions.assertEquals("xb", model.healthCheckRetryTimeout());
        Assertions.assertEquals("bsrfbj", model.upgradeTimeout());
        Assertions.assertEquals("twss", model.upgradeDomainTimeout());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ArmRollingUpgradeMonitoringPolicy model
            = new ArmRollingUpgradeMonitoringPolicy().withFailureAction(ArmUpgradeFailureAction.MANUAL)
                .withHealthCheckWaitDuration("ovasrruvwbhsqfsu")
                .withHealthCheckStableDuration("gjb")
                .withHealthCheckRetryTimeout("xb")
                .withUpgradeTimeout("bsrfbj")
                .withUpgradeDomainTimeout("twss");
        model = BinaryData.fromObject(model).toObject(ArmRollingUpgradeMonitoringPolicy.class);
        Assertions.assertEquals(ArmUpgradeFailureAction.MANUAL, model.failureAction());
        Assertions.assertEquals("ovasrruvwbhsqfsu", model.healthCheckWaitDuration());
        Assertions.assertEquals("gjb", model.healthCheckStableDuration());
        Assertions.assertEquals("xb", model.healthCheckRetryTimeout());
        Assertions.assertEquals("bsrfbj", model.upgradeTimeout());
        Assertions.assertEquals("twss", model.upgradeDomainTimeout());
    }
}

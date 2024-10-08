// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.ProbeSettings;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class ProbeSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProbeSettings model = BinaryData.fromString(
            "{\"failureThreshold\":1074790994,\"successThreshold\":190325570,\"timeout\":\"PT185H38M37S\",\"period\":\"PT155H32M4S\",\"initialDelay\":\"PT161H44M50S\"}")
            .toObject(ProbeSettings.class);
        Assertions.assertEquals(1074790994, model.failureThreshold());
        Assertions.assertEquals(190325570, model.successThreshold());
        Assertions.assertEquals(Duration.parse("PT185H38M37S"), model.timeout());
        Assertions.assertEquals(Duration.parse("PT155H32M4S"), model.period());
        Assertions.assertEquals(Duration.parse("PT161H44M50S"), model.initialDelay());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProbeSettings model = new ProbeSettings().withFailureThreshold(1074790994)
            .withSuccessThreshold(190325570)
            .withTimeout(Duration.parse("PT185H38M37S"))
            .withPeriod(Duration.parse("PT155H32M4S"))
            .withInitialDelay(Duration.parse("PT161H44M50S"));
        model = BinaryData.fromObject(model).toObject(ProbeSettings.class);
        Assertions.assertEquals(1074790994, model.failureThreshold());
        Assertions.assertEquals(190325570, model.successThreshold());
        Assertions.assertEquals(Duration.parse("PT185H38M37S"), model.timeout());
        Assertions.assertEquals(Duration.parse("PT155H32M4S"), model.period());
        Assertions.assertEquals(Duration.parse("PT161H44M50S"), model.initialDelay());
    }
}

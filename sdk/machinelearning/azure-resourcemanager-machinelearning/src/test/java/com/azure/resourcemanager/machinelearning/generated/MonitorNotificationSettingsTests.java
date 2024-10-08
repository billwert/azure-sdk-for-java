// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.MonitorEmailNotificationSettings;
import com.azure.resourcemanager.machinelearning.models.MonitorNotificationSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MonitorNotificationSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MonitorNotificationSettings model = BinaryData
            .fromString("{\"emailNotificationSettings\":{\"emails\":[\"mrjctryldsxeb\",\"hsxrznmgsdaluyc\",\"hefr\"]}}")
            .toObject(MonitorNotificationSettings.class);
        Assertions.assertEquals("mrjctryldsxeb", model.emailNotificationSettings().emails().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MonitorNotificationSettings model
            = new MonitorNotificationSettings().withEmailNotificationSettings(new MonitorEmailNotificationSettings()
                .withEmails(Arrays.asList("mrjctryldsxeb", "hsxrznmgsdaluyc", "hefr")));
        model = BinaryData.fromObject(model).toObject(MonitorNotificationSettings.class);
        Assertions.assertEquals("mrjctryldsxeb", model.emailNotificationSettings().emails().get(0));
    }
}

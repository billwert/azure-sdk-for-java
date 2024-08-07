// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.fluent.models.MonitoringSettingResourceInner;
import com.azure.resourcemanager.appplatform.models.MonitoringSettingProperties;

/**
 * Samples for MonitoringSettings UpdatePut.
 */
public final class MonitoringSettingsUpdatePutSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * MonitoringSettings_UpdatePut.json
     */
    /**
     * Sample code: MonitoringSettings_UpdatePut.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void monitoringSettingsUpdatePut(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getMonitoringSettings()
            .updatePut("myResourceGroup", "myservice",
                new MonitoringSettingResourceInner()
                    .withProperties(new MonitoringSettingProperties().withTraceEnabled(true)
                        .withAppInsightsInstrumentationKey("fakeTokenPlaceholder")
                        .withAppInsightsSamplingRate(10.0D)),
                com.azure.core.util.Context.NONE);
    }
}

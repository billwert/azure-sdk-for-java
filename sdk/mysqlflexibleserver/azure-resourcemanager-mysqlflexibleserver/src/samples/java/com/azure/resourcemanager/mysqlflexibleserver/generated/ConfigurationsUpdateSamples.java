// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.resourcemanager.mysqlflexibleserver.fluent.models.ConfigurationInner;
import com.azure.resourcemanager.mysqlflexibleserver.models.ConfigurationSource;

/**
 * Samples for Configurations Update.
 */
public final class ConfigurationsUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/mysql/resource-manager/Microsoft.DBforMySQL/legacy/stable/2021-05-01/examples/ConfigurationUpdate.
     * json
     */
    /**
     * Sample code: Update a user configuration.
     * 
     * @param manager Entry point to MySqlManager.
     */
    public static void updateAUserConfiguration(com.azure.resourcemanager.mysqlflexibleserver.MySqlManager manager) {
        manager.configurations()
            .update("testrg", "testserver", "event_scheduler",
                new ConfigurationInner().withValue("on").withSource(ConfigurationSource.USER_OVERRIDE),
                com.azure.core.util.Context.NONE);
    }
}

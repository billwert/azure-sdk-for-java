// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.resourcemanager.hybridnetwork.models.ConfigurationGroupSchemaPropertiesFormat;

/**
 * Samples for ConfigurationGroupSchemas CreateOrUpdate.
 */
public final class ConfigurationGroupSchemasCreateOrUpdateSamples {
    /*
     * x-ms-original-file:
     * specification/hybridnetwork/resource-manager/Microsoft.HybridNetwork/stable/2023-09-01/examples/
     * ConfigurationGroupSchemaCreate.json
     */
    /**
     * Sample code: Create or update the network function definition group.
     * 
     * @param manager Entry point to HybridNetworkManager.
     */
    public static void createOrUpdateTheNetworkFunctionDefinitionGroup(
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager) {
        manager.configurationGroupSchemas()
            .define("testConfigurationGroupSchema")
            .withRegion("westUs2")
            .withExistingPublisher("rg1", "testPublisher")
            .withProperties(new ConfigurationGroupSchemaPropertiesFormat().withDescription("Schema with no secrets")
                .withSchemaDefinition(
                    "{\"type\":\"object\",\"properties\":{\"interconnect-groups\":{\"type\":\"object\",\"properties\":{\"type\":\"object\",\"properties\":{\"name\":{\"type\":\"string\"},\"international-interconnects\":{\"type\":\"array\",\"item\":{\"type\":\"string\"}},\"domestic-interconnects\":{\"type\":\"array\",\"item\":{\"type\":\"string\"}}}}},\"interconnect-group-assignments\":{\"type\":\"object\",\"properties\":{\"type\":\"object\",\"properties\":{\"ssc\":{\"type\":\"string\"},\"interconnects-interconnects\":{\"type\":\"string\"}}}}},\"required\":[\"interconnect-groups\",\"interconnect-group-assignments\"]}"))
            .create();
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

/**
 * Samples for BuildServiceAgentPool Get.
 */
public final class BuildServiceAgentPoolGetSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/stable/2023-12-01/examples/
     * BuildServiceAgentPool_Get.json
     */
    /**
     * Sample code: BuildServiceAgentPool_Get.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void buildServiceAgentPoolGet(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.springServices()
            .manager()
            .serviceClient()
            .getBuildServiceAgentPools()
            .getWithResponse("myResourceGroup", "myservice", "default", "default", com.azure.core.util.Context.NONE);
    }
}

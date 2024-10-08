// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.standbypool.generated;

/**
 * Samples for StandbyContainerGroupPools ListByResourceGroup.
 */
public final class StandbyContainerGroupPoolsListByResourceGroupSamples {
    /*
     * x-ms-original-file: 2024-03-01-preview/StandbyContainerGroupPools_ListByResourceGroup.json
     */
    /**
     * Sample code: StandbyContainerGroupPools_ListByResourceGroup.
     * 
     * @param manager Entry point to StandbyPoolManager.
     */
    public static void standbyContainerGroupPoolsListByResourceGroup(
        com.azure.resourcemanager.standbypool.StandbyPoolManager manager) {
        manager.standbyContainerGroupPools().listByResourceGroup("rgstandbypool", com.azure.core.util.Context.NONE);
    }
}

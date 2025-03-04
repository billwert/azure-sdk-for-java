// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.resourcemanager.quota.models.LimitObject;
import com.azure.resourcemanager.quota.models.QuotaProperties;
import com.azure.resourcemanager.quota.models.ResourceName;

/**
 * Samples for Quota CreateOrUpdate.
 */
public final class QuotaCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2024-12-18-preview/examples/
     * putMachineLearningServicesQuotaRequestLowPriority.json
     */
    /**
     * Sample code: Quotas_Request_ForMachineLearningServices_LowPriorityResource.
     * 
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasRequestForMachineLearningServicesLowPriorityResource(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager.quotas()
            .define("TotalLowPriorityCores")
            .withExistingScope(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.MachineLearningServices/locations/eastus")
            .withProperties(new QuotaProperties().withLimit(new LimitObject().withValue(10))
                .withName(new ResourceName().withValue("TotalLowPriorityCores"))
                .withResourceType("lowPriority"))
            .create();
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2024-12-18-preview/examples/
     * putNetworkOneSkuQuotaRequestStandardSkuPublicIpAddresses.json
     */
    /**
     * Sample code: Quotas_PutRequest_ForNetwork_StandardSkuPublicIpAddressesResource.
     * 
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasPutRequestForNetworkStandardSkuPublicIpAddressesResource(
        com.azure.resourcemanager.quota.QuotaManager manager) {
        manager.quotas()
            .define("StandardSkuPublicIpAddresses")
            .withExistingScope(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Network/locations/eastus")
            .withProperties(new QuotaProperties().withLimit(new LimitObject().withValue(10))
                .withName(new ResourceName().withValue("StandardSkuPublicIpAddresses"))
                .withResourceType("PublicIpAddresses"))
            .create();
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2024-12-18-preview/examples/
     * putComputeOneSkuQuotaRequest.json
     */
    /**
     * Sample code: Quotas_Put_Request_ForCompute.
     * 
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasPutRequestForCompute(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager.quotas()
            .define("standardFSv2Family")
            .withExistingScope(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Compute/locations/eastus")
            .withProperties(new QuotaProperties().withLimit(new LimitObject().withValue(10))
                .withName(new ResourceName().withValue("standardFSv2Family")))
            .create();
    }

    /*
     * x-ms-original-file: specification/quota/resource-manager/Microsoft.Quota/preview/2024-12-18-preview/examples/
     * putNetworkOneSkuQuotaRequest.json
     */
    /**
     * Sample code: Quotas_PutRequest_ForNetwork.
     * 
     * @param manager Entry point to QuotaManager.
     */
    public static void quotasPutRequestForNetwork(com.azure.resourcemanager.quota.QuotaManager manager) {
        manager.quotas()
            .define("MinPublicIpInterNetworkPrefixLength")
            .withExistingScope(
                "subscriptions/D7EC67B3-7657-4966-BFFC-41EFD36BAAB3/providers/Microsoft.Network/locations/eastus")
            .withProperties(new QuotaProperties().withLimit(new LimitObject().withValue(10))
                .withName(new ResourceName().withValue("MinPublicIpInterNetworkPrefixLength"))
                .withResourceType("MinPublicIpInterNetworkPrefixLength"))
            .create();
    }
}

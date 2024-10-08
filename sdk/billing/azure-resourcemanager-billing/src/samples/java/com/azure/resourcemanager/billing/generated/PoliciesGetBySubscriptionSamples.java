// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for Policies GetBySubscription.
 */
public final class PoliciesGetBySubscriptionSamples {
    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/policiesGetBySubscription.
     * json
     */
    /**
     * Sample code: PoliciesGetBySubscription.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void policiesGetBySubscription(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.policies().getBySubscriptionWithResponse(com.azure.core.util.Context.NONE);
    }
}

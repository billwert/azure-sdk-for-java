// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

/**
 * Samples for BillingAccounts List.
 */
public final class BillingAccountsListSamples {
    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * billingAccountForLegacyAccountDetails.json
     */
    /**
     * Sample code: BillingAccountForLegacyAccountDetails.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountForLegacyAccountDetails(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts()
            .list(null, null, null, null, null, null, null, null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/billingAccountsList.json
     */
    /**
     * Sample code: BillingAccountsList.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void billingAccountsList(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts()
            .list(null, null, null, null, null, null, null, null, null, null, null, null,
                com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/billing/resource-manager/Microsoft.Billing/stable/2024-04-01/examples/
     * billingAccountsListWithExpandForPONumber.json
     */
    /**
     * Sample code: BillingAccountsListWithExpandForPONumber.
     * 
     * @param manager Entry point to BillingManager.
     */
    public static void
        billingAccountsListWithExpandForPONumber(com.azure.resourcemanager.billing.BillingManager manager) {
        manager.billingAccounts()
            .list(null, null, null, null, null, null, null, null, "soldTo,enrollmentDetails/poNumber", null, null, null,
                com.azure.core.util.Context.NONE);
    }
}

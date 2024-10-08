// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.billing.fluent.models.SavingsPlanOrderModelInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * An immutable client-side representation of SavingsPlanOrderModel.
 */
public interface SavingsPlanOrderModel {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the tags property: Dictionary of metadata associated with the resource. It may not be populated for all
     * resource types. Maximum key/value length supported of 256 characters. Keys/value should not empty value nor null.
     * Keys can not contain &lt; &gt; % &amp; \ ? /.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the sku property: Savings plan SKU.
     * 
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the displayName property: Display name.
     * 
     * @return the displayName value.
     */
    String displayName();

    /**
     * Gets the provisioningState property: The provisioning state of the savings plan, e.g. Succeeded.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the billingScopeId property: Subscription that will be charged for purchasing SavingsPlan.
     * 
     * @return the billingScopeId value.
     */
    String billingScopeId();

    /**
     * Gets the billingProfileId property: Fully-qualified identifier of the billing profile where the savings plan is
     * applied. Present only for Field-led or Customer-led customers.
     * 
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * Gets the customerId property: Fully-qualified identifier of the customer where the savings plan is applied.
     * Present only for Partner-led customers.
     * 
     * @return the customerId value.
     */
    String customerId();

    /**
     * Gets the billingAccountId property: Fully-qualified identifier of the billing account where the savings plan is
     * applied.
     * 
     * @return the billingAccountId value.
     */
    String billingAccountId();

    /**
     * Gets the term property: Represents the Savings plan term in ISO 8601 format.
     * 
     * @return the term value.
     */
    SavingsPlanTerm term();

    /**
     * Gets the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly
     * purchases.
     * 
     * @return the billingPlan value.
     */
    BillingPlan billingPlan();

    /**
     * Gets the benefitStartTime property: DateTime when the savings plan benefit started.
     * 
     * @return the benefitStartTime value.
     */
    OffsetDateTime benefitStartTime();

    /**
     * Gets the expiryDateTime property: DateTime when the savings plan will expire.
     * 
     * @return the expiryDateTime value.
     */
    OffsetDateTime expiryDateTime();

    /**
     * Gets the planInformation property: Information describing the type of billing plan for this savings plan.
     * 
     * @return the planInformation value.
     */
    BillingPlanInformation planInformation();

    /**
     * Gets the savingsPlans property: The savingsPlans property.
     * 
     * @return the savingsPlans value.
     */
    List<String> savingsPlans();

    /**
     * Gets the extendedStatusInfo property: Extended status information.
     * 
     * @return the extendedStatusInfo value.
     */
    ExtendedStatusInfo extendedStatusInfo();

    /**
     * Gets the productCode property: Represents UPN.
     * 
     * @return the productCode value.
     */
    String productCode();

    /**
     * Gets the inner com.azure.resourcemanager.billing.fluent.models.SavingsPlanOrderModelInner object.
     * 
     * @return the inner object.
     */
    SavingsPlanOrderModelInner innerModel();
}

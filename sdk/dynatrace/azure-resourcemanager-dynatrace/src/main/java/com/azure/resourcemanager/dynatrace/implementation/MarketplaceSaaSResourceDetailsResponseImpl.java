// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.implementation;

import com.azure.resourcemanager.dynatrace.fluent.models.MarketplaceSaaSResourceDetailsResponseInner;
import com.azure.resourcemanager.dynatrace.models.MarketplaceSaaSResourceDetailsResponse;
import com.azure.resourcemanager.dynatrace.models.MarketplaceSubscriptionStatus;

public final class MarketplaceSaaSResourceDetailsResponseImpl implements MarketplaceSaaSResourceDetailsResponse {
    private MarketplaceSaaSResourceDetailsResponseInner innerObject;

    private final com.azure.resourcemanager.dynatrace.DynatraceManager serviceManager;

    MarketplaceSaaSResourceDetailsResponseImpl(MarketplaceSaaSResourceDetailsResponseInner innerObject,
        com.azure.resourcemanager.dynatrace.DynatraceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String marketplaceSaaSResourceId() {
        return this.innerModel().marketplaceSaaSResourceId();
    }

    public String planId() {
        return this.innerModel().planId();
    }

    public MarketplaceSubscriptionStatus marketplaceSubscriptionStatus() {
        return this.innerModel().marketplaceSubscriptionStatus();
    }

    public MarketplaceSaaSResourceDetailsResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dynatrace.DynatraceManager manager() {
        return this.serviceManager;
    }
}

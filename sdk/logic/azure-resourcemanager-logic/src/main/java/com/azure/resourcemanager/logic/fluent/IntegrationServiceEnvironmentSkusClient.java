// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.logic.fluent.models.IntegrationServiceEnvironmentSkuDefinitionInner;

/**
 * An instance of this class provides access to all the operations defined in IntegrationServiceEnvironmentSkusClient.
 */
public interface IntegrationServiceEnvironmentSkusClient {
    /**
     * Gets a list of integration service environment Skus.
     * 
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration service environment Skus as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationServiceEnvironmentSkuDefinitionInner> list(String resourceGroup,
        String integrationServiceEnvironmentName);

    /**
     * Gets a list of integration service environment Skus.
     * 
     * @param resourceGroup The resource group.
     * @param integrationServiceEnvironmentName The integration service environment name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of integration service environment Skus as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<IntegrationServiceEnvironmentSkuDefinitionInner> list(String resourceGroup,
        String integrationServiceEnvironmentName, Context context);
}

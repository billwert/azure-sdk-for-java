// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyDescriptionCollectionInner;
import com.azure.resourcemanager.apimanagement.models.PolicyScopeContract;

/**
 * An instance of this class provides access to all the operations defined in PolicyDescriptionsClient.
 */
public interface PolicyDescriptionsClient {
    /**
     * Lists all policy descriptions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @param scope Policy scope.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return descriptions of API Management policies along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicyDescriptionCollectionInner> listByServiceWithResponse(String resourceGroupName, String serviceName,
        PolicyScopeContract scope, Context context);

    /**
     * Lists all policy descriptions.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return descriptions of API Management policies.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicyDescriptionCollectionInner listByService(String resourceGroupName, String serviceName);
}

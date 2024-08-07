// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabricmanagedclusters.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.servicefabricmanagedclusters.fluent.OperationResultsClient;
import com.azure.resourcemanager.servicefabricmanagedclusters.models.OperationResultsGetResponse;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in OperationResultsClient.
 */
public final class OperationResultsClientImpl implements OperationResultsClient {
    /**
     * The proxy service used to perform REST calls.
     */
    private final OperationResultsService service;

    /**
     * The service client containing this operation class.
     */
    private final ServiceFabricManagedClustersMgmtClientImpl client;

    /**
     * Initializes an instance of OperationResultsClientImpl.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    OperationResultsClientImpl(ServiceFabricManagedClustersMgmtClientImpl client) {
        this.service
            = RestProxy.create(OperationResultsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ServiceFabricManagedClustersMgmtClientOperationResults to be used by
     * the proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ServiceFabricManaged")
    public interface OperationResultsService {
        @Headers({ "Content-Type: application/json" })
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.ServiceFabric/locations/{location}/managedClusterOperationResults/{operationId}")
        @ExpectedResponses({ 200, 202, 204 })
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<OperationResultsGetResponse> get(@HostParam("$host") String endpoint,
            @PathParam("subscriptionId") String subscriptionId, @PathParam("location") String location,
            @PathParam("operationId") String operationId, @QueryParam("api-version") String apiVersion,
            @HeaderParam("Accept") String accept, Context context);
    }

    /**
     * Get long running operation result.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param operationId operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return long running operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationResultsGetResponse> getWithResponseAsync(String location, String operationId) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(context -> service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), location,
                operationId, this.client.getApiVersion(), accept, context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Get long running operation result.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param operationId operation identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return long running operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<OperationResultsGetResponse> getWithResponseAsync(String location, String operationId,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono.error(
                new IllegalArgumentException("Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(new IllegalArgumentException(
                "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (operationId == null) {
            return Mono.error(new IllegalArgumentException("Parameter operationId is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service.get(this.client.getEndpoint(), this.client.getSubscriptionId(), location, operationId,
            this.client.getApiVersion(), accept, context);
    }

    /**
     * Get long running operation result.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param operationId operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return long running operation result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Void> getAsync(String location, String operationId) {
        return getWithResponseAsync(location, operationId).flatMap(ignored -> Mono.empty());
    }

    /**
     * Get long running operation result.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param operationId operation identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return long running operation result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public OperationResultsGetResponse getWithResponse(String location, String operationId, Context context) {
        return getWithResponseAsync(location, operationId, context).block();
    }

    /**
     * Get long running operation result.
     * 
     * @param location The location for the cluster code versions. This is different from cluster location.
     * @param operationId operation identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void get(String location, String operationId) {
        getWithResponse(location, operationId, Context.NONE);
    }
}

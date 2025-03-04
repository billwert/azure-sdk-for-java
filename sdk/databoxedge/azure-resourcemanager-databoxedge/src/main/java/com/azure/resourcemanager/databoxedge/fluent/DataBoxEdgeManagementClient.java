// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for DataBoxEdgeManagementClient class.
 */
public interface DataBoxEdgeManagementClient {
    /**
     * Gets The subscription ID.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the DevicesClient object to access its operations.
     * 
     * @return the DevicesClient object.
     */
    DevicesClient getDevices();

    /**
     * Gets the AlertsClient object to access its operations.
     * 
     * @return the AlertsClient object.
     */
    AlertsClient getAlerts();

    /**
     * Gets the BandwidthSchedulesClient object to access its operations.
     * 
     * @return the BandwidthSchedulesClient object.
     */
    BandwidthSchedulesClient getBandwidthSchedules();

    /**
     * Gets the JobsClient object to access its operations.
     * 
     * @return the JobsClient object.
     */
    JobsClient getJobs();

    /**
     * Gets the NodesClient object to access its operations.
     * 
     * @return the NodesClient object.
     */
    NodesClient getNodes();

    /**
     * Gets the OperationsStatusClient object to access its operations.
     * 
     * @return the OperationsStatusClient object.
     */
    OperationsStatusClient getOperationsStatus();

    /**
     * Gets the OrdersClient object to access its operations.
     * 
     * @return the OrdersClient object.
     */
    OrdersClient getOrders();

    /**
     * Gets the RolesClient object to access its operations.
     * 
     * @return the RolesClient object.
     */
    RolesClient getRoles();

    /**
     * Gets the SharesClient object to access its operations.
     * 
     * @return the SharesClient object.
     */
    SharesClient getShares();

    /**
     * Gets the StorageAccountCredentialsClient object to access its operations.
     * 
     * @return the StorageAccountCredentialsClient object.
     */
    StorageAccountCredentialsClient getStorageAccountCredentials();

    /**
     * Gets the StorageAccountsClient object to access its operations.
     * 
     * @return the StorageAccountsClient object.
     */
    StorageAccountsClient getStorageAccounts();

    /**
     * Gets the ContainersClient object to access its operations.
     * 
     * @return the ContainersClient object.
     */
    ContainersClient getContainers();

    /**
     * Gets the TriggersClient object to access its operations.
     * 
     * @return the TriggersClient object.
     */
    TriggersClient getTriggers();

    /**
     * Gets the UsersClient object to access its operations.
     * 
     * @return the UsersClient object.
     */
    UsersClient getUsers();

    /**
     * Gets the SkusClient object to access its operations.
     * 
     * @return the SkusClient object.
     */
    SkusClient getSkus();
}

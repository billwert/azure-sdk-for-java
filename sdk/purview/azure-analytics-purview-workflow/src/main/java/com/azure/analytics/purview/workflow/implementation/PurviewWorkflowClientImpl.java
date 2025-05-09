// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.implementation;

import com.azure.analytics.purview.workflow.PurviewWorkflowServiceVersion;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;

/**
 * Initializes a new instance of the PurviewWorkflowClient type.
 */
public final class PurviewWorkflowClientImpl {
    /**
     * The account endpoint of your Purview account. Example: https://{accountName}.purview.azure.com/.
     */
    private final String endpoint;

    /**
     * Gets The account endpoint of your Purview account. Example: https://{accountName}.purview.azure.com/.
     * 
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * Service version.
     */
    private final PurviewWorkflowServiceVersion serviceVersion;

    /**
     * Gets Service version.
     * 
     * @return the serviceVersion value.
     */
    public PurviewWorkflowServiceVersion getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * The HTTP pipeline to send requests through.
     */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /**
     * The serializer to serialize an object into a string.
     */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     * 
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * The WorkflowsImpl object to access its operations.
     */
    private final WorkflowsImpl workflows;

    /**
     * Gets the WorkflowsImpl object to access its operations.
     * 
     * @return the WorkflowsImpl object.
     */
    public WorkflowsImpl getWorkflows() {
        return this.workflows;
    }

    /**
     * The WorkflowsOperationsImpl object to access its operations.
     */
    private final WorkflowsOperationsImpl workflowsOperations;

    /**
     * Gets the WorkflowsOperationsImpl object to access its operations.
     * 
     * @return the WorkflowsOperationsImpl object.
     */
    public WorkflowsOperationsImpl getWorkflowsOperations() {
        return this.workflowsOperations;
    }

    /**
     * The UserRequestsImpl object to access its operations.
     */
    private final UserRequestsImpl userRequests;

    /**
     * Gets the UserRequestsImpl object to access its operations.
     * 
     * @return the UserRequestsImpl object.
     */
    public UserRequestsImpl getUserRequests() {
        return this.userRequests;
    }

    /**
     * The WorkflowRunsImpl object to access its operations.
     */
    private final WorkflowRunsImpl workflowRuns;

    /**
     * Gets the WorkflowRunsImpl object to access its operations.
     * 
     * @return the WorkflowRunsImpl object.
     */
    public WorkflowRunsImpl getWorkflowRuns() {
        return this.workflowRuns;
    }

    /**
     * The WorkflowRunsOperationsImpl object to access its operations.
     */
    private final WorkflowRunsOperationsImpl workflowRunsOperations;

    /**
     * Gets the WorkflowRunsOperationsImpl object to access its operations.
     * 
     * @return the WorkflowRunsOperationsImpl object.
     */
    public WorkflowRunsOperationsImpl getWorkflowRunsOperations() {
        return this.workflowRunsOperations;
    }

    /**
     * The WorkflowTasksImpl object to access its operations.
     */
    private final WorkflowTasksImpl workflowTasks;

    /**
     * Gets the WorkflowTasksImpl object to access its operations.
     * 
     * @return the WorkflowTasksImpl object.
     */
    public WorkflowTasksImpl getWorkflowTasks() {
        return this.workflowTasks;
    }

    /**
     * The WorkflowTasksOperationsImpl object to access its operations.
     */
    private final WorkflowTasksOperationsImpl workflowTasksOperations;

    /**
     * Gets the WorkflowTasksOperationsImpl object to access its operations.
     * 
     * @return the WorkflowTasksOperationsImpl object.
     */
    public WorkflowTasksOperationsImpl getWorkflowTasksOperations() {
        return this.workflowTasksOperations;
    }

    /**
     * The ApprovalsImpl object to access its operations.
     */
    private final ApprovalsImpl approvals;

    /**
     * Gets the ApprovalsImpl object to access its operations.
     * 
     * @return the ApprovalsImpl object.
     */
    public ApprovalsImpl getApprovals() {
        return this.approvals;
    }

    /**
     * The TaskStatusImpl object to access its operations.
     */
    private final TaskStatusImpl taskStatus;

    /**
     * Gets the TaskStatusImpl object to access its operations.
     * 
     * @return the TaskStatusImpl object.
     */
    public TaskStatusImpl getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * Initializes an instance of PurviewWorkflowClient client.
     * 
     * @param endpoint The account endpoint of your Purview account. Example: https://{accountName}.purview.azure.com/.
     * @param serviceVersion Service version.
     */
    public PurviewWorkflowClientImpl(String endpoint, PurviewWorkflowServiceVersion serviceVersion) {
        this(new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
            JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of PurviewWorkflowClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param endpoint The account endpoint of your Purview account. Example: https://{accountName}.purview.azure.com/.
     * @param serviceVersion Service version.
     */
    public PurviewWorkflowClientImpl(HttpPipeline httpPipeline, String endpoint,
        PurviewWorkflowServiceVersion serviceVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, serviceVersion);
    }

    /**
     * Initializes an instance of PurviewWorkflowClient client.
     * 
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param endpoint The account endpoint of your Purview account. Example: https://{accountName}.purview.azure.com/.
     * @param serviceVersion Service version.
     */
    public PurviewWorkflowClientImpl(HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String endpoint,
        PurviewWorkflowServiceVersion serviceVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.endpoint = endpoint;
        this.serviceVersion = serviceVersion;
        this.workflows = new WorkflowsImpl(this);
        this.workflowsOperations = new WorkflowsOperationsImpl(this);
        this.userRequests = new UserRequestsImpl(this);
        this.workflowRuns = new WorkflowRunsImpl(this);
        this.workflowRunsOperations = new WorkflowRunsOperationsImpl(this);
        this.workflowTasks = new WorkflowTasksImpl(this);
        this.workflowTasksOperations = new WorkflowTasksOperationsImpl(this);
        this.approvals = new ApprovalsImpl(this);
        this.taskStatus = new TaskStatusImpl(this);
    }
}

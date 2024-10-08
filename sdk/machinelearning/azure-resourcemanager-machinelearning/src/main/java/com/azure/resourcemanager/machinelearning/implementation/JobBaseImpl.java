// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.JobBaseInner;
import com.azure.resourcemanager.machinelearning.models.JobBase;
import com.azure.resourcemanager.machinelearning.models.JobBaseProperties;

public final class JobBaseImpl implements JobBase, JobBase.Definition, JobBase.Update {
    private JobBaseInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public JobBaseProperties properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public JobBaseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String id;

    public JobBaseImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public JobBase create() {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, id, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public JobBase create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, id, this.innerModel(), context)
            .getValue();
        return this;
    }

    JobBaseImpl(String name, com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new JobBaseInner();
        this.serviceManager = serviceManager;
        this.id = name;
    }

    public JobBaseImpl update() {
        return this;
    }

    public JobBase apply() {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, id, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public JobBase apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .createOrUpdateWithResponse(resourceGroupName, workspaceName, id, this.innerModel(), context)
            .getValue();
        return this;
    }

    JobBaseImpl(JobBaseInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.id = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "jobs");
    }

    public JobBase refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .getWithResponse(resourceGroupName, workspaceName, id, Context.NONE)
            .getValue();
        return this;
    }

    public JobBase refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getJobs()
            .getWithResponse(resourceGroupName, workspaceName, id, context)
            .getValue();
        return this;
    }

    public void cancel() {
        serviceManager.jobs().cancel(resourceGroupName, workspaceName, id);
    }

    public void cancel(Context context) {
        serviceManager.jobs().cancel(resourceGroupName, workspaceName, id, context);
    }

    public JobBaseImpl withProperties(JobBaseProperties properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}

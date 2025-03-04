// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.containerservice;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpPipeline;
import com.azure.resourcemanager.containerservice.fluent.ContainerServiceManagementClient;
import com.azure.resourcemanager.containerservice.implementation.ContainerServiceManagementClientBuilder;
import com.azure.resourcemanager.containerservice.implementation.KubernetesClustersImpl;
import com.azure.resourcemanager.containerservice.models.KubernetesClusters;
import com.azure.resourcemanager.resources.fluentcore.arm.AzureConfigurable;
import com.azure.resourcemanager.resources.fluentcore.arm.Manager;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.resources.fluentcore.arm.implementation.AzureConfigurableImpl;
import com.azure.resourcemanager.resources.fluentcore.utils.HttpPipelineProvider;

import java.util.Objects;

/** Entry point to Azure Container Service management. */
public final class ContainerServiceManager extends Manager<ContainerServiceManagementClient> {
    // The service managers
    private KubernetesClustersImpl kubernetesClusters;

    /**
     * Get a Configurable instance that can be used to create ContainerServiceManager with optional configuration.
     *
     * @return Configurable
     */
    public static Configurable configure() {
        return new ContainerServiceManager.ConfigurableImpl();
    }

    /**
     * Creates an instance of ContainerServiceManager that exposes Azure Container Service resource management API entry
     * points.
     *
     * @param credential the credential to use
     * @param profile the profile to use
     * @return the ContainerServiceManager
     */
    public static ContainerServiceManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return authenticate(HttpPipelineProvider.buildHttpPipeline(credential, profile), profile);
    }

    /**
     * Creates an instance of ContainerServiceManager that exposes Service resource management API entry points.
     *
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the profile to use
     * @return the ContainerServiceManager
     */
    public static ContainerServiceManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new ContainerServiceManager(httpPipeline, profile);
    }

    /** The interface allowing configurations to be set. */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
         * Creates an instance of ContainerServiceManager that exposes Service resource management API entry points.
         *
         * @param credential the credential to use
         * @param profile the profile to use
         * @return the ContainerServiceManager
         */
        ContainerServiceManager authenticate(TokenCredential credential, AzureProfile profile);
    }

    /** The implementation for Configurable interface. */
    private static final class ConfigurableImpl extends AzureConfigurableImpl<Configurable> implements Configurable {
        @Override
        public ContainerServiceManager authenticate(TokenCredential credential, AzureProfile profile) {
            return ContainerServiceManager.authenticate(buildHttpPipeline(credential, profile), profile);
        }
    }

    private ContainerServiceManager(HttpPipeline httpPipeline, AzureProfile profile) {
        super(httpPipeline, profile,
            new ContainerServiceManagementClientBuilder()
                .endpoint(profile.getEnvironment().getResourceManagerEndpoint())
                .pipeline(httpPipeline)
                .subscriptionId(profile.getSubscriptionId())
                .buildClient());
    }

    /**
     * Gets the Azure Kubernetes cluster resource management API entry point.
     *
     * @return the Azure Kubernetes cluster resource management API entry point
     */
    public KubernetesClusters kubernetesClusters() {
        if (this.kubernetesClusters == null) {
            this.kubernetesClusters = new KubernetesClustersImpl(this);
        }
        return this.kubernetesClusters;
    }
}

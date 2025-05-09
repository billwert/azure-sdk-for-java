// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridkubernetes.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hybridkubernetes.models.AadProfile;
import com.azure.resourcemanager.hybridkubernetes.models.ArcAgentProfile;
import com.azure.resourcemanager.hybridkubernetes.models.ArcAgentryConfigurations;
import com.azure.resourcemanager.hybridkubernetes.models.AzureHybridBenefit;
import com.azure.resourcemanager.hybridkubernetes.models.ConnectivityStatus;
import com.azure.resourcemanager.hybridkubernetes.models.Gateway;
import com.azure.resourcemanager.hybridkubernetes.models.OidcIssuerProfile;
import com.azure.resourcemanager.hybridkubernetes.models.PrivateLinkState;
import com.azure.resourcemanager.hybridkubernetes.models.ProvisioningState;
import com.azure.resourcemanager.hybridkubernetes.models.SecurityProfile;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/**
 * Properties of the connected cluster.
 */
@Fluent
public final class ConnectedClusterProperties implements JsonSerializable<ConnectedClusterProperties> {
    /*
     * Base64 encoded public certificate used by the agent to do the initial handshake to the backend services in Azure.
     */
    private String agentPublicKeyCertificate;

    /*
     * The Kubernetes version of the connected cluster resource
     */
    private String kubernetesVersion;

    /*
     * Number of nodes present in the connected cluster resource
     */
    private Integer totalNodeCount;

    /*
     * Number of CPU cores present in the connected cluster resource
     */
    private Integer totalCoreCount;

    /*
     * Version of the agent running on the connected cluster resource
     */
    private String agentVersion;

    /*
     * Provisioning state of the connected cluster resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The Kubernetes distribution running on this connected cluster.
     */
    private String distribution;

    /*
     * The Kubernetes distribution version on this connected cluster.
     */
    private String distributionVersion;

    /*
     * The infrastructure on which the Kubernetes cluster represented by this connected cluster is running on.
     */
    private String infrastructure;

    /*
     * Connected cluster offering
     */
    private String offering;

    /*
     * Expiration time of the managed identity certificate
     */
    private OffsetDateTime managedIdentityCertificateExpirationTime;

    /*
     * Time representing the last instance when heart beat was received from the cluster
     */
    private OffsetDateTime lastConnectivityTime;

    /*
     * Represents the connectivity status of the connected cluster.
     */
    private ConnectivityStatus connectivityStatus;

    /*
     * Property which describes the state of private link on a connected cluster resource.
     */
    private PrivateLinkState privateLinkState;

    /*
     * This is populated only if privateLinkState is enabled. The resource id of the private link scope this connected
     * cluster is assigned to, if any.
     */
    private String privateLinkScopeResourceId;

    /*
     * Indicates whether Azure Hybrid Benefit is opted in
     */
    private AzureHybridBenefit azureHybridBenefit;

    /*
     * AAD profile for the connected cluster.
     */
    private AadProfile aadProfile;

    /*
     * Arc agentry configuration for the provisioned cluster.
     */
    private ArcAgentProfile arcAgentProfile;

    /*
     * Security profile for the connected cluster.
     */
    private SecurityProfile securityProfile;

    /*
     * Open ID Connect (OIDC) Issuer Profile for the connected cluster.
     */
    private OidcIssuerProfile oidcIssuerProfile;

    /*
     * Details of the gateway used by the Arc router for connectivity.
     */
    private Gateway gateway;

    /*
     * Configuration settings for customizing the behavior of the connected cluster.
     */
    private List<ArcAgentryConfigurations> arcAgentryConfigurations;

    /*
     * More properties related to the Connected Cluster
     */
    private Map<String, String> miscellaneousProperties;

    /**
     * Creates an instance of ConnectedClusterProperties class.
     */
    public ConnectedClusterProperties() {
    }

    /**
     * Get the agentPublicKeyCertificate property: Base64 encoded public certificate used by the agent to do the initial
     * handshake to the backend services in Azure.
     * 
     * @return the agentPublicKeyCertificate value.
     */
    public String agentPublicKeyCertificate() {
        return this.agentPublicKeyCertificate;
    }

    /**
     * Set the agentPublicKeyCertificate property: Base64 encoded public certificate used by the agent to do the initial
     * handshake to the backend services in Azure.
     * 
     * @param agentPublicKeyCertificate the agentPublicKeyCertificate value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withAgentPublicKeyCertificate(String agentPublicKeyCertificate) {
        this.agentPublicKeyCertificate = agentPublicKeyCertificate;
        return this;
    }

    /**
     * Get the kubernetesVersion property: The Kubernetes version of the connected cluster resource.
     * 
     * @return the kubernetesVersion value.
     */
    public String kubernetesVersion() {
        return this.kubernetesVersion;
    }

    /**
     * Get the totalNodeCount property: Number of nodes present in the connected cluster resource.
     * 
     * @return the totalNodeCount value.
     */
    public Integer totalNodeCount() {
        return this.totalNodeCount;
    }

    /**
     * Get the totalCoreCount property: Number of CPU cores present in the connected cluster resource.
     * 
     * @return the totalCoreCount value.
     */
    public Integer totalCoreCount() {
        return this.totalCoreCount;
    }

    /**
     * Get the agentVersion property: Version of the agent running on the connected cluster resource.
     * 
     * @return the agentVersion value.
     */
    public String agentVersion() {
        return this.agentVersion;
    }

    /**
     * Get the provisioningState property: Provisioning state of the connected cluster resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the connected cluster resource.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the distribution property: The Kubernetes distribution running on this connected cluster.
     * 
     * @return the distribution value.
     */
    public String distribution() {
        return this.distribution;
    }

    /**
     * Set the distribution property: The Kubernetes distribution running on this connected cluster.
     * 
     * @param distribution the distribution value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withDistribution(String distribution) {
        this.distribution = distribution;
        return this;
    }

    /**
     * Get the distributionVersion property: The Kubernetes distribution version on this connected cluster.
     * 
     * @return the distributionVersion value.
     */
    public String distributionVersion() {
        return this.distributionVersion;
    }

    /**
     * Set the distributionVersion property: The Kubernetes distribution version on this connected cluster.
     * 
     * @param distributionVersion the distributionVersion value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withDistributionVersion(String distributionVersion) {
        this.distributionVersion = distributionVersion;
        return this;
    }

    /**
     * Get the infrastructure property: The infrastructure on which the Kubernetes cluster represented by this connected
     * cluster is running on.
     * 
     * @return the infrastructure value.
     */
    public String infrastructure() {
        return this.infrastructure;
    }

    /**
     * Set the infrastructure property: The infrastructure on which the Kubernetes cluster represented by this connected
     * cluster is running on.
     * 
     * @param infrastructure the infrastructure value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withInfrastructure(String infrastructure) {
        this.infrastructure = infrastructure;
        return this;
    }

    /**
     * Get the offering property: Connected cluster offering.
     * 
     * @return the offering value.
     */
    public String offering() {
        return this.offering;
    }

    /**
     * Get the managedIdentityCertificateExpirationTime property: Expiration time of the managed identity certificate.
     * 
     * @return the managedIdentityCertificateExpirationTime value.
     */
    public OffsetDateTime managedIdentityCertificateExpirationTime() {
        return this.managedIdentityCertificateExpirationTime;
    }

    /**
     * Get the lastConnectivityTime property: Time representing the last instance when heart beat was received from the
     * cluster.
     * 
     * @return the lastConnectivityTime value.
     */
    public OffsetDateTime lastConnectivityTime() {
        return this.lastConnectivityTime;
    }

    /**
     * Get the connectivityStatus property: Represents the connectivity status of the connected cluster.
     * 
     * @return the connectivityStatus value.
     */
    public ConnectivityStatus connectivityStatus() {
        return this.connectivityStatus;
    }

    /**
     * Get the privateLinkState property: Property which describes the state of private link on a connected cluster
     * resource.
     * 
     * @return the privateLinkState value.
     */
    public PrivateLinkState privateLinkState() {
        return this.privateLinkState;
    }

    /**
     * Set the privateLinkState property: Property which describes the state of private link on a connected cluster
     * resource.
     * 
     * @param privateLinkState the privateLinkState value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withPrivateLinkState(PrivateLinkState privateLinkState) {
        this.privateLinkState = privateLinkState;
        return this;
    }

    /**
     * Get the privateLinkScopeResourceId property: This is populated only if privateLinkState is enabled. The resource
     * id of the private link scope this connected cluster is assigned to, if any.
     * 
     * @return the privateLinkScopeResourceId value.
     */
    public String privateLinkScopeResourceId() {
        return this.privateLinkScopeResourceId;
    }

    /**
     * Set the privateLinkScopeResourceId property: This is populated only if privateLinkState is enabled. The resource
     * id of the private link scope this connected cluster is assigned to, if any.
     * 
     * @param privateLinkScopeResourceId the privateLinkScopeResourceId value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withPrivateLinkScopeResourceId(String privateLinkScopeResourceId) {
        this.privateLinkScopeResourceId = privateLinkScopeResourceId;
        return this;
    }

    /**
     * Get the azureHybridBenefit property: Indicates whether Azure Hybrid Benefit is opted in.
     * 
     * @return the azureHybridBenefit value.
     */
    public AzureHybridBenefit azureHybridBenefit() {
        return this.azureHybridBenefit;
    }

    /**
     * Set the azureHybridBenefit property: Indicates whether Azure Hybrid Benefit is opted in.
     * 
     * @param azureHybridBenefit the azureHybridBenefit value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withAzureHybridBenefit(AzureHybridBenefit azureHybridBenefit) {
        this.azureHybridBenefit = azureHybridBenefit;
        return this;
    }

    /**
     * Get the aadProfile property: AAD profile for the connected cluster.
     * 
     * @return the aadProfile value.
     */
    public AadProfile aadProfile() {
        return this.aadProfile;
    }

    /**
     * Set the aadProfile property: AAD profile for the connected cluster.
     * 
     * @param aadProfile the aadProfile value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withAadProfile(AadProfile aadProfile) {
        this.aadProfile = aadProfile;
        return this;
    }

    /**
     * Get the arcAgentProfile property: Arc agentry configuration for the provisioned cluster.
     * 
     * @return the arcAgentProfile value.
     */
    public ArcAgentProfile arcAgentProfile() {
        return this.arcAgentProfile;
    }

    /**
     * Set the arcAgentProfile property: Arc agentry configuration for the provisioned cluster.
     * 
     * @param arcAgentProfile the arcAgentProfile value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withArcAgentProfile(ArcAgentProfile arcAgentProfile) {
        this.arcAgentProfile = arcAgentProfile;
        return this;
    }

    /**
     * Get the securityProfile property: Security profile for the connected cluster.
     * 
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: Security profile for the connected cluster.
     * 
     * @param securityProfile the securityProfile value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the oidcIssuerProfile property: Open ID Connect (OIDC) Issuer Profile for the connected cluster.
     * 
     * @return the oidcIssuerProfile value.
     */
    public OidcIssuerProfile oidcIssuerProfile() {
        return this.oidcIssuerProfile;
    }

    /**
     * Set the oidcIssuerProfile property: Open ID Connect (OIDC) Issuer Profile for the connected cluster.
     * 
     * @param oidcIssuerProfile the oidcIssuerProfile value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withOidcIssuerProfile(OidcIssuerProfile oidcIssuerProfile) {
        this.oidcIssuerProfile = oidcIssuerProfile;
        return this;
    }

    /**
     * Get the gateway property: Details of the gateway used by the Arc router for connectivity.
     * 
     * @return the gateway value.
     */
    public Gateway gateway() {
        return this.gateway;
    }

    /**
     * Set the gateway property: Details of the gateway used by the Arc router for connectivity.
     * 
     * @param gateway the gateway value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties withGateway(Gateway gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Get the arcAgentryConfigurations property: Configuration settings for customizing the behavior of the connected
     * cluster.
     * 
     * @return the arcAgentryConfigurations value.
     */
    public List<ArcAgentryConfigurations> arcAgentryConfigurations() {
        return this.arcAgentryConfigurations;
    }

    /**
     * Set the arcAgentryConfigurations property: Configuration settings for customizing the behavior of the connected
     * cluster.
     * 
     * @param arcAgentryConfigurations the arcAgentryConfigurations value to set.
     * @return the ConnectedClusterProperties object itself.
     */
    public ConnectedClusterProperties
        withArcAgentryConfigurations(List<ArcAgentryConfigurations> arcAgentryConfigurations) {
        this.arcAgentryConfigurations = arcAgentryConfigurations;
        return this;
    }

    /**
     * Get the miscellaneousProperties property: More properties related to the Connected Cluster.
     * 
     * @return the miscellaneousProperties value.
     */
    public Map<String, String> miscellaneousProperties() {
        return this.miscellaneousProperties;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (agentPublicKeyCertificate() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property agentPublicKeyCertificate in model ConnectedClusterProperties"));
        }
        if (aadProfile() != null) {
            aadProfile().validate();
        }
        if (arcAgentProfile() != null) {
            arcAgentProfile().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
        if (oidcIssuerProfile() != null) {
            oidcIssuerProfile().validate();
        }
        if (gateway() != null) {
            gateway().validate();
        }
        if (arcAgentryConfigurations() != null) {
            arcAgentryConfigurations().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectedClusterProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("agentPublicKeyCertificate", this.agentPublicKeyCertificate);
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        jsonWriter.writeStringField("distribution", this.distribution);
        jsonWriter.writeStringField("distributionVersion", this.distributionVersion);
        jsonWriter.writeStringField("infrastructure", this.infrastructure);
        jsonWriter.writeStringField("privateLinkState",
            this.privateLinkState == null ? null : this.privateLinkState.toString());
        jsonWriter.writeStringField("privateLinkScopeResourceId", this.privateLinkScopeResourceId);
        jsonWriter.writeStringField("azureHybridBenefit",
            this.azureHybridBenefit == null ? null : this.azureHybridBenefit.toString());
        jsonWriter.writeJsonField("aadProfile", this.aadProfile);
        jsonWriter.writeJsonField("arcAgentProfile", this.arcAgentProfile);
        jsonWriter.writeJsonField("securityProfile", this.securityProfile);
        jsonWriter.writeJsonField("oidcIssuerProfile", this.oidcIssuerProfile);
        jsonWriter.writeJsonField("gateway", this.gateway);
        jsonWriter.writeArrayField("arcAgentryConfigurations", this.arcAgentryConfigurations,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectedClusterProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectedClusterProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ConnectedClusterProperties.
     */
    public static ConnectedClusterProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectedClusterProperties deserializedConnectedClusterProperties = new ConnectedClusterProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("agentPublicKeyCertificate".equals(fieldName)) {
                    deserializedConnectedClusterProperties.agentPublicKeyCertificate = reader.getString();
                } else if ("kubernetesVersion".equals(fieldName)) {
                    deserializedConnectedClusterProperties.kubernetesVersion = reader.getString();
                } else if ("totalNodeCount".equals(fieldName)) {
                    deserializedConnectedClusterProperties.totalNodeCount = reader.getNullable(JsonReader::getInt);
                } else if ("totalCoreCount".equals(fieldName)) {
                    deserializedConnectedClusterProperties.totalCoreCount = reader.getNullable(JsonReader::getInt);
                } else if ("agentVersion".equals(fieldName)) {
                    deserializedConnectedClusterProperties.agentVersion = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedConnectedClusterProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("distribution".equals(fieldName)) {
                    deserializedConnectedClusterProperties.distribution = reader.getString();
                } else if ("distributionVersion".equals(fieldName)) {
                    deserializedConnectedClusterProperties.distributionVersion = reader.getString();
                } else if ("infrastructure".equals(fieldName)) {
                    deserializedConnectedClusterProperties.infrastructure = reader.getString();
                } else if ("offering".equals(fieldName)) {
                    deserializedConnectedClusterProperties.offering = reader.getString();
                } else if ("managedIdentityCertificateExpirationTime".equals(fieldName)) {
                    deserializedConnectedClusterProperties.managedIdentityCertificateExpirationTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("lastConnectivityTime".equals(fieldName)) {
                    deserializedConnectedClusterProperties.lastConnectivityTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("connectivityStatus".equals(fieldName)) {
                    deserializedConnectedClusterProperties.connectivityStatus
                        = ConnectivityStatus.fromString(reader.getString());
                } else if ("privateLinkState".equals(fieldName)) {
                    deserializedConnectedClusterProperties.privateLinkState
                        = PrivateLinkState.fromString(reader.getString());
                } else if ("privateLinkScopeResourceId".equals(fieldName)) {
                    deserializedConnectedClusterProperties.privateLinkScopeResourceId = reader.getString();
                } else if ("azureHybridBenefit".equals(fieldName)) {
                    deserializedConnectedClusterProperties.azureHybridBenefit
                        = AzureHybridBenefit.fromString(reader.getString());
                } else if ("aadProfile".equals(fieldName)) {
                    deserializedConnectedClusterProperties.aadProfile = AadProfile.fromJson(reader);
                } else if ("arcAgentProfile".equals(fieldName)) {
                    deserializedConnectedClusterProperties.arcAgentProfile = ArcAgentProfile.fromJson(reader);
                } else if ("securityProfile".equals(fieldName)) {
                    deserializedConnectedClusterProperties.securityProfile = SecurityProfile.fromJson(reader);
                } else if ("oidcIssuerProfile".equals(fieldName)) {
                    deserializedConnectedClusterProperties.oidcIssuerProfile = OidcIssuerProfile.fromJson(reader);
                } else if ("gateway".equals(fieldName)) {
                    deserializedConnectedClusterProperties.gateway = Gateway.fromJson(reader);
                } else if ("arcAgentryConfigurations".equals(fieldName)) {
                    List<ArcAgentryConfigurations> arcAgentryConfigurations
                        = reader.readArray(reader1 -> ArcAgentryConfigurations.fromJson(reader1));
                    deserializedConnectedClusterProperties.arcAgentryConfigurations = arcAgentryConfigurations;
                } else if ("miscellaneousProperties".equals(fieldName)) {
                    Map<String, String> miscellaneousProperties = reader.readMap(reader1 -> reader1.getString());
                    deserializedConnectedClusterProperties.miscellaneousProperties = miscellaneousProperties;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectedClusterProperties;
        });
    }
}

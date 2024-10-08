// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The cluster create parameters.
 */
@Fluent
public final class ClusterCreateProperties implements JsonSerializable<ClusterCreateProperties> {
    /*
     * The version of the cluster.
     */
    private String clusterVersion;

    /*
     * The type of operating system.
     */
    private OSType osType;

    /*
     * The cluster tier.
     */
    private Tier tier;

    /*
     * The cluster definition.
     */
    private ClusterDefinition clusterDefinition;

    /*
     * The cluster kafka rest proxy configuration.
     */
    private KafkaRestProperties kafkaRestProperties;

    /*
     * The security profile.
     */
    private SecurityProfile securityProfile;

    /*
     * The compute profile.
     */
    private ComputeProfile computeProfile;

    /*
     * The storage profile.
     */
    private StorageProfile storageProfile;

    /*
     * The disk encryption properties.
     */
    private DiskEncryptionProperties diskEncryptionProperties;

    /*
     * The encryption-in-transit properties.
     */
    private EncryptionInTransitProperties encryptionInTransitProperties;

    /*
     * The minimal supported tls version.
     */
    private String minSupportedTlsVersion;

    /*
     * The network properties.
     */
    private NetworkProperties networkProperties;

    /*
     * The compute isolation properties.
     */
    private ComputeIsolationProperties computeIsolationProperties;

    /*
     * The private link configurations.
     */
    private List<PrivateLinkConfiguration> privateLinkConfigurations;

    /**
     * Creates an instance of ClusterCreateProperties class.
     */
    public ClusterCreateProperties() {
    }

    /**
     * Get the clusterVersion property: The version of the cluster.
     * 
     * @return the clusterVersion value.
     */
    public String clusterVersion() {
        return this.clusterVersion;
    }

    /**
     * Set the clusterVersion property: The version of the cluster.
     * 
     * @param clusterVersion the clusterVersion value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * Get the osType property: The type of operating system.
     * 
     * @return the osType value.
     */
    public OSType osType() {
        return this.osType;
    }

    /**
     * Set the osType property: The type of operating system.
     * 
     * @param osType the osType value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withOsType(OSType osType) {
        this.osType = osType;
        return this;
    }

    /**
     * Get the tier property: The cluster tier.
     * 
     * @return the tier value.
     */
    public Tier tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The cluster tier.
     * 
     * @param tier the tier value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withTier(Tier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the clusterDefinition property: The cluster definition.
     * 
     * @return the clusterDefinition value.
     */
    public ClusterDefinition clusterDefinition() {
        return this.clusterDefinition;
    }

    /**
     * Set the clusterDefinition property: The cluster definition.
     * 
     * @param clusterDefinition the clusterDefinition value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withClusterDefinition(ClusterDefinition clusterDefinition) {
        this.clusterDefinition = clusterDefinition;
        return this;
    }

    /**
     * Get the kafkaRestProperties property: The cluster kafka rest proxy configuration.
     * 
     * @return the kafkaRestProperties value.
     */
    public KafkaRestProperties kafkaRestProperties() {
        return this.kafkaRestProperties;
    }

    /**
     * Set the kafkaRestProperties property: The cluster kafka rest proxy configuration.
     * 
     * @param kafkaRestProperties the kafkaRestProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withKafkaRestProperties(KafkaRestProperties kafkaRestProperties) {
        this.kafkaRestProperties = kafkaRestProperties;
        return this;
    }

    /**
     * Get the securityProfile property: The security profile.
     * 
     * @return the securityProfile value.
     */
    public SecurityProfile securityProfile() {
        return this.securityProfile;
    }

    /**
     * Set the securityProfile property: The security profile.
     * 
     * @param securityProfile the securityProfile value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withSecurityProfile(SecurityProfile securityProfile) {
        this.securityProfile = securityProfile;
        return this;
    }

    /**
     * Get the computeProfile property: The compute profile.
     * 
     * @return the computeProfile value.
     */
    public ComputeProfile computeProfile() {
        return this.computeProfile;
    }

    /**
     * Set the computeProfile property: The compute profile.
     * 
     * @param computeProfile the computeProfile value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withComputeProfile(ComputeProfile computeProfile) {
        this.computeProfile = computeProfile;
        return this;
    }

    /**
     * Get the storageProfile property: The storage profile.
     * 
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: The storage profile.
     * 
     * @param storageProfile the storageProfile value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

    /**
     * Get the diskEncryptionProperties property: The disk encryption properties.
     * 
     * @return the diskEncryptionProperties value.
     */
    public DiskEncryptionProperties diskEncryptionProperties() {
        return this.diskEncryptionProperties;
    }

    /**
     * Set the diskEncryptionProperties property: The disk encryption properties.
     * 
     * @param diskEncryptionProperties the diskEncryptionProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withDiskEncryptionProperties(DiskEncryptionProperties diskEncryptionProperties) {
        this.diskEncryptionProperties = diskEncryptionProperties;
        return this;
    }

    /**
     * Get the encryptionInTransitProperties property: The encryption-in-transit properties.
     * 
     * @return the encryptionInTransitProperties value.
     */
    public EncryptionInTransitProperties encryptionInTransitProperties() {
        return this.encryptionInTransitProperties;
    }

    /**
     * Set the encryptionInTransitProperties property: The encryption-in-transit properties.
     * 
     * @param encryptionInTransitProperties the encryptionInTransitProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties
        withEncryptionInTransitProperties(EncryptionInTransitProperties encryptionInTransitProperties) {
        this.encryptionInTransitProperties = encryptionInTransitProperties;
        return this;
    }

    /**
     * Get the minSupportedTlsVersion property: The minimal supported tls version.
     * 
     * @return the minSupportedTlsVersion value.
     */
    public String minSupportedTlsVersion() {
        return this.minSupportedTlsVersion;
    }

    /**
     * Set the minSupportedTlsVersion property: The minimal supported tls version.
     * 
     * @param minSupportedTlsVersion the minSupportedTlsVersion value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withMinSupportedTlsVersion(String minSupportedTlsVersion) {
        this.minSupportedTlsVersion = minSupportedTlsVersion;
        return this;
    }

    /**
     * Get the networkProperties property: The network properties.
     * 
     * @return the networkProperties value.
     */
    public NetworkProperties networkProperties() {
        return this.networkProperties;
    }

    /**
     * Set the networkProperties property: The network properties.
     * 
     * @param networkProperties the networkProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties withNetworkProperties(NetworkProperties networkProperties) {
        this.networkProperties = networkProperties;
        return this;
    }

    /**
     * Get the computeIsolationProperties property: The compute isolation properties.
     * 
     * @return the computeIsolationProperties value.
     */
    public ComputeIsolationProperties computeIsolationProperties() {
        return this.computeIsolationProperties;
    }

    /**
     * Set the computeIsolationProperties property: The compute isolation properties.
     * 
     * @param computeIsolationProperties the computeIsolationProperties value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties
        withComputeIsolationProperties(ComputeIsolationProperties computeIsolationProperties) {
        this.computeIsolationProperties = computeIsolationProperties;
        return this;
    }

    /**
     * Get the privateLinkConfigurations property: The private link configurations.
     * 
     * @return the privateLinkConfigurations value.
     */
    public List<PrivateLinkConfiguration> privateLinkConfigurations() {
        return this.privateLinkConfigurations;
    }

    /**
     * Set the privateLinkConfigurations property: The private link configurations.
     * 
     * @param privateLinkConfigurations the privateLinkConfigurations value to set.
     * @return the ClusterCreateProperties object itself.
     */
    public ClusterCreateProperties
        withPrivateLinkConfigurations(List<PrivateLinkConfiguration> privateLinkConfigurations) {
        this.privateLinkConfigurations = privateLinkConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterDefinition() != null) {
            clusterDefinition().validate();
        }
        if (kafkaRestProperties() != null) {
            kafkaRestProperties().validate();
        }
        if (securityProfile() != null) {
            securityProfile().validate();
        }
        if (computeProfile() != null) {
            computeProfile().validate();
        }
        if (storageProfile() != null) {
            storageProfile().validate();
        }
        if (diskEncryptionProperties() != null) {
            diskEncryptionProperties().validate();
        }
        if (encryptionInTransitProperties() != null) {
            encryptionInTransitProperties().validate();
        }
        if (networkProperties() != null) {
            networkProperties().validate();
        }
        if (computeIsolationProperties() != null) {
            computeIsolationProperties().validate();
        }
        if (privateLinkConfigurations() != null) {
            privateLinkConfigurations().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("clusterVersion", this.clusterVersion);
        jsonWriter.writeStringField("osType", this.osType == null ? null : this.osType.toString());
        jsonWriter.writeStringField("tier", this.tier == null ? null : this.tier.toString());
        jsonWriter.writeJsonField("clusterDefinition", this.clusterDefinition);
        jsonWriter.writeJsonField("kafkaRestProperties", this.kafkaRestProperties);
        jsonWriter.writeJsonField("securityProfile", this.securityProfile);
        jsonWriter.writeJsonField("computeProfile", this.computeProfile);
        jsonWriter.writeJsonField("storageProfile", this.storageProfile);
        jsonWriter.writeJsonField("diskEncryptionProperties", this.diskEncryptionProperties);
        jsonWriter.writeJsonField("encryptionInTransitProperties", this.encryptionInTransitProperties);
        jsonWriter.writeStringField("minSupportedTlsVersion", this.minSupportedTlsVersion);
        jsonWriter.writeJsonField("networkProperties", this.networkProperties);
        jsonWriter.writeJsonField("computeIsolationProperties", this.computeIsolationProperties);
        jsonWriter.writeArrayField("privateLinkConfigurations", this.privateLinkConfigurations,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterCreateProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterCreateProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterCreateProperties.
     */
    public static ClusterCreateProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterCreateProperties deserializedClusterCreateProperties = new ClusterCreateProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("clusterVersion".equals(fieldName)) {
                    deserializedClusterCreateProperties.clusterVersion = reader.getString();
                } else if ("osType".equals(fieldName)) {
                    deserializedClusterCreateProperties.osType = OSType.fromString(reader.getString());
                } else if ("tier".equals(fieldName)) {
                    deserializedClusterCreateProperties.tier = Tier.fromString(reader.getString());
                } else if ("clusterDefinition".equals(fieldName)) {
                    deserializedClusterCreateProperties.clusterDefinition = ClusterDefinition.fromJson(reader);
                } else if ("kafkaRestProperties".equals(fieldName)) {
                    deserializedClusterCreateProperties.kafkaRestProperties = KafkaRestProperties.fromJson(reader);
                } else if ("securityProfile".equals(fieldName)) {
                    deserializedClusterCreateProperties.securityProfile = SecurityProfile.fromJson(reader);
                } else if ("computeProfile".equals(fieldName)) {
                    deserializedClusterCreateProperties.computeProfile = ComputeProfile.fromJson(reader);
                } else if ("storageProfile".equals(fieldName)) {
                    deserializedClusterCreateProperties.storageProfile = StorageProfile.fromJson(reader);
                } else if ("diskEncryptionProperties".equals(fieldName)) {
                    deserializedClusterCreateProperties.diskEncryptionProperties
                        = DiskEncryptionProperties.fromJson(reader);
                } else if ("encryptionInTransitProperties".equals(fieldName)) {
                    deserializedClusterCreateProperties.encryptionInTransitProperties
                        = EncryptionInTransitProperties.fromJson(reader);
                } else if ("minSupportedTlsVersion".equals(fieldName)) {
                    deserializedClusterCreateProperties.minSupportedTlsVersion = reader.getString();
                } else if ("networkProperties".equals(fieldName)) {
                    deserializedClusterCreateProperties.networkProperties = NetworkProperties.fromJson(reader);
                } else if ("computeIsolationProperties".equals(fieldName)) {
                    deserializedClusterCreateProperties.computeIsolationProperties
                        = ComputeIsolationProperties.fromJson(reader);
                } else if ("privateLinkConfigurations".equals(fieldName)) {
                    List<PrivateLinkConfiguration> privateLinkConfigurations
                        = reader.readArray(reader1 -> PrivateLinkConfiguration.fromJson(reader1));
                    deserializedClusterCreateProperties.privateLinkConfigurations = privateLinkConfigurations;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterCreateProperties;
        });
    }
}

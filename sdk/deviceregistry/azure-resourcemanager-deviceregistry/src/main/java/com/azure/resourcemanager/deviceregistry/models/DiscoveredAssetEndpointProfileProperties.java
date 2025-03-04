// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.deviceregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines the Discovered Asset Endpoint Profile properties.
 */
@Fluent
public final class DiscoveredAssetEndpointProfileProperties
    implements JsonSerializable<DiscoveredAssetEndpointProfileProperties> {
    /*
     * The local valid URI specifying the network address/DNS name of a southbound device. The scheme part of the
     * targetAddress URI specifies the type of the device. The additionalConfiguration field holds further connector
     * type specific configuration.
     */
    private String targetAddress;

    /*
     * Stringified JSON that contains connectivity type specific further configuration (e.g. OPC UA, Modbus, ONVIF).
     */
    private String additionalConfiguration;

    /*
     * List of supported authentication methods supported by the target server.
     */
    private List<AuthenticationMethod> supportedAuthenticationMethods;

    /*
     * Defines the configuration for the connector type that is being used with the endpoint profile.
     */
    private String endpointProfileType;

    /*
     * Identifier used to detect changes in the asset endpoint profile.
     */
    private String discoveryId;

    /*
     * An integer that is incremented each time the resource is modified.
     */
    private long version;

    /*
     * Provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of DiscoveredAssetEndpointProfileProperties class.
     */
    public DiscoveredAssetEndpointProfileProperties() {
    }

    /**
     * Get the targetAddress property: The local valid URI specifying the network address/DNS name of a southbound
     * device. The scheme part of the targetAddress URI specifies the type of the device. The additionalConfiguration
     * field holds further connector type specific configuration.
     * 
     * @return the targetAddress value.
     */
    public String targetAddress() {
        return this.targetAddress;
    }

    /**
     * Set the targetAddress property: The local valid URI specifying the network address/DNS name of a southbound
     * device. The scheme part of the targetAddress URI specifies the type of the device. The additionalConfiguration
     * field holds further connector type specific configuration.
     * 
     * @param targetAddress the targetAddress value to set.
     * @return the DiscoveredAssetEndpointProfileProperties object itself.
     */
    public DiscoveredAssetEndpointProfileProperties withTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
        return this;
    }

    /**
     * Get the additionalConfiguration property: Stringified JSON that contains connectivity type specific further
     * configuration (e.g. OPC UA, Modbus, ONVIF).
     * 
     * @return the additionalConfiguration value.
     */
    public String additionalConfiguration() {
        return this.additionalConfiguration;
    }

    /**
     * Set the additionalConfiguration property: Stringified JSON that contains connectivity type specific further
     * configuration (e.g. OPC UA, Modbus, ONVIF).
     * 
     * @param additionalConfiguration the additionalConfiguration value to set.
     * @return the DiscoveredAssetEndpointProfileProperties object itself.
     */
    public DiscoveredAssetEndpointProfileProperties withAdditionalConfiguration(String additionalConfiguration) {
        this.additionalConfiguration = additionalConfiguration;
        return this;
    }

    /**
     * Get the supportedAuthenticationMethods property: List of supported authentication methods supported by the target
     * server.
     * 
     * @return the supportedAuthenticationMethods value.
     */
    public List<AuthenticationMethod> supportedAuthenticationMethods() {
        return this.supportedAuthenticationMethods;
    }

    /**
     * Set the supportedAuthenticationMethods property: List of supported authentication methods supported by the target
     * server.
     * 
     * @param supportedAuthenticationMethods the supportedAuthenticationMethods value to set.
     * @return the DiscoveredAssetEndpointProfileProperties object itself.
     */
    public DiscoveredAssetEndpointProfileProperties
        withSupportedAuthenticationMethods(List<AuthenticationMethod> supportedAuthenticationMethods) {
        this.supportedAuthenticationMethods = supportedAuthenticationMethods;
        return this;
    }

    /**
     * Get the endpointProfileType property: Defines the configuration for the connector type that is being used with
     * the endpoint profile.
     * 
     * @return the endpointProfileType value.
     */
    public String endpointProfileType() {
        return this.endpointProfileType;
    }

    /**
     * Set the endpointProfileType property: Defines the configuration for the connector type that is being used with
     * the endpoint profile.
     * 
     * @param endpointProfileType the endpointProfileType value to set.
     * @return the DiscoveredAssetEndpointProfileProperties object itself.
     */
    public DiscoveredAssetEndpointProfileProperties withEndpointProfileType(String endpointProfileType) {
        this.endpointProfileType = endpointProfileType;
        return this;
    }

    /**
     * Get the discoveryId property: Identifier used to detect changes in the asset endpoint profile.
     * 
     * @return the discoveryId value.
     */
    public String discoveryId() {
        return this.discoveryId;
    }

    /**
     * Set the discoveryId property: Identifier used to detect changes in the asset endpoint profile.
     * 
     * @param discoveryId the discoveryId value to set.
     * @return the DiscoveredAssetEndpointProfileProperties object itself.
     */
    public DiscoveredAssetEndpointProfileProperties withDiscoveryId(String discoveryId) {
        this.discoveryId = discoveryId;
        return this;
    }

    /**
     * Get the version property: An integer that is incremented each time the resource is modified.
     * 
     * @return the version value.
     */
    public long version() {
        return this.version;
    }

    /**
     * Set the version property: An integer that is incremented each time the resource is modified.
     * 
     * @param version the version value to set.
     * @return the DiscoveredAssetEndpointProfileProperties object itself.
     */
    public DiscoveredAssetEndpointProfileProperties withVersion(long version) {
        this.version = version;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetAddress() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetAddress in model DiscoveredAssetEndpointProfileProperties"));
        }
        if (endpointProfileType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endpointProfileType in model DiscoveredAssetEndpointProfileProperties"));
        }
        if (discoveryId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property discoveryId in model DiscoveredAssetEndpointProfileProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DiscoveredAssetEndpointProfileProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetAddress", this.targetAddress);
        jsonWriter.writeStringField("endpointProfileType", this.endpointProfileType);
        jsonWriter.writeStringField("discoveryId", this.discoveryId);
        jsonWriter.writeLongField("version", this.version);
        jsonWriter.writeStringField("additionalConfiguration", this.additionalConfiguration);
        jsonWriter.writeArrayField("supportedAuthenticationMethods", this.supportedAuthenticationMethods,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiscoveredAssetEndpointProfileProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiscoveredAssetEndpointProfileProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DiscoveredAssetEndpointProfileProperties.
     */
    public static DiscoveredAssetEndpointProfileProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiscoveredAssetEndpointProfileProperties deserializedDiscoveredAssetEndpointProfileProperties
                = new DiscoveredAssetEndpointProfileProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetAddress".equals(fieldName)) {
                    deserializedDiscoveredAssetEndpointProfileProperties.targetAddress = reader.getString();
                } else if ("endpointProfileType".equals(fieldName)) {
                    deserializedDiscoveredAssetEndpointProfileProperties.endpointProfileType = reader.getString();
                } else if ("discoveryId".equals(fieldName)) {
                    deserializedDiscoveredAssetEndpointProfileProperties.discoveryId = reader.getString();
                } else if ("version".equals(fieldName)) {
                    deserializedDiscoveredAssetEndpointProfileProperties.version = reader.getLong();
                } else if ("additionalConfiguration".equals(fieldName)) {
                    deserializedDiscoveredAssetEndpointProfileProperties.additionalConfiguration = reader.getString();
                } else if ("supportedAuthenticationMethods".equals(fieldName)) {
                    List<AuthenticationMethod> supportedAuthenticationMethods
                        = reader.readArray(reader1 -> AuthenticationMethod.fromString(reader1.getString()));
                    deserializedDiscoveredAssetEndpointProfileProperties.supportedAuthenticationMethods
                        = supportedAuthenticationMethods;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedDiscoveredAssetEndpointProfileProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiscoveredAssetEndpointProfileProperties;
        });
    }
}

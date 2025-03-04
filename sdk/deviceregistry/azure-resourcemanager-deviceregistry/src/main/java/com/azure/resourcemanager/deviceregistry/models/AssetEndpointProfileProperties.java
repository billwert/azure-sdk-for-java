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

/**
 * Defines the Asset Endpoint Profile properties.
 */
@Fluent
public final class AssetEndpointProfileProperties implements JsonSerializable<AssetEndpointProfileProperties> {
    /*
     * Globally unique, immutable, non-reusable id.
     */
    private String uuid;

    /*
     * The local valid URI specifying the network address/DNS name of a southbound device. The scheme part of the
     * targetAddress URI specifies the type of the device. The additionalConfiguration field holds further connector
     * type specific configuration.
     */
    private String targetAddress;

    /*
     * Defines the configuration for the connector type that is being used with the endpoint profile.
     */
    private String endpointProfileType;

    /*
     * Defines the client authentication mechanism to the server.
     */
    private Authentication authentication;

    /*
     * Stringified JSON that contains connectivity type specific further configuration (e.g. OPC UA, Modbus, ONVIF).
     */
    private String additionalConfiguration;

    /*
     * Reference to a discovered asset endpoint profile. Populated only if the asset endpoint profile has been created
     * from discovery flow. Discovered asset endpoint profile name must be provided.
     */
    private String discoveredAssetEndpointProfileRef;

    /*
     * Read only object to reflect changes that have occurred on the Edge. Similar to Kubernetes status property for
     * custom resources.
     */
    private AssetEndpointProfileStatus status;

    /*
     * Provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of AssetEndpointProfileProperties class.
     */
    public AssetEndpointProfileProperties() {
    }

    /**
     * Get the uuid property: Globally unique, immutable, non-reusable id.
     * 
     * @return the uuid value.
     */
    public String uuid() {
        return this.uuid;
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
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties withTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
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
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties withEndpointProfileType(String endpointProfileType) {
        this.endpointProfileType = endpointProfileType;
        return this;
    }

    /**
     * Get the authentication property: Defines the client authentication mechanism to the server.
     * 
     * @return the authentication value.
     */
    public Authentication authentication() {
        return this.authentication;
    }

    /**
     * Set the authentication property: Defines the client authentication mechanism to the server.
     * 
     * @param authentication the authentication value to set.
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties withAuthentication(Authentication authentication) {
        this.authentication = authentication;
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
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties withAdditionalConfiguration(String additionalConfiguration) {
        this.additionalConfiguration = additionalConfiguration;
        return this;
    }

    /**
     * Get the discoveredAssetEndpointProfileRef property: Reference to a discovered asset endpoint profile. Populated
     * only if the asset endpoint profile has been created from discovery flow. Discovered asset endpoint profile name
     * must be provided.
     * 
     * @return the discoveredAssetEndpointProfileRef value.
     */
    public String discoveredAssetEndpointProfileRef() {
        return this.discoveredAssetEndpointProfileRef;
    }

    /**
     * Set the discoveredAssetEndpointProfileRef property: Reference to a discovered asset endpoint profile. Populated
     * only if the asset endpoint profile has been created from discovery flow. Discovered asset endpoint profile name
     * must be provided.
     * 
     * @param discoveredAssetEndpointProfileRef the discoveredAssetEndpointProfileRef value to set.
     * @return the AssetEndpointProfileProperties object itself.
     */
    public AssetEndpointProfileProperties
        withDiscoveredAssetEndpointProfileRef(String discoveredAssetEndpointProfileRef) {
        this.discoveredAssetEndpointProfileRef = discoveredAssetEndpointProfileRef;
        return this;
    }

    /**
     * Get the status property: Read only object to reflect changes that have occurred on the Edge. Similar to
     * Kubernetes status property for custom resources.
     * 
     * @return the status value.
     */
    public AssetEndpointProfileStatus status() {
        return this.status;
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
                    "Missing required property targetAddress in model AssetEndpointProfileProperties"));
        }
        if (endpointProfileType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property endpointProfileType in model AssetEndpointProfileProperties"));
        }
        if (authentication() != null) {
            authentication().validate();
        }
        if (status() != null) {
            status().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssetEndpointProfileProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("targetAddress", this.targetAddress);
        jsonWriter.writeStringField("endpointProfileType", this.endpointProfileType);
        jsonWriter.writeJsonField("authentication", this.authentication);
        jsonWriter.writeStringField("additionalConfiguration", this.additionalConfiguration);
        jsonWriter.writeStringField("discoveredAssetEndpointProfileRef", this.discoveredAssetEndpointProfileRef);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssetEndpointProfileProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssetEndpointProfileProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AssetEndpointProfileProperties.
     */
    public static AssetEndpointProfileProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssetEndpointProfileProperties deserializedAssetEndpointProfileProperties
                = new AssetEndpointProfileProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetAddress".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.targetAddress = reader.getString();
                } else if ("endpointProfileType".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.endpointProfileType = reader.getString();
                } else if ("uuid".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.uuid = reader.getString();
                } else if ("authentication".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.authentication = Authentication.fromJson(reader);
                } else if ("additionalConfiguration".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.additionalConfiguration = reader.getString();
                } else if ("discoveredAssetEndpointProfileRef".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.discoveredAssetEndpointProfileRef = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.status = AssetEndpointProfileStatus.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAssetEndpointProfileProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssetEndpointProfileProperties;
        });
    }
}

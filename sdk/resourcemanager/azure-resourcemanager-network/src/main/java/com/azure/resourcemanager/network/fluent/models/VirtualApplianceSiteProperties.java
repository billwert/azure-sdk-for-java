// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.Office365PolicyProperties;
import com.azure.resourcemanager.network.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of the rule group.
 */
@Fluent
public final class VirtualApplianceSiteProperties implements JsonSerializable<VirtualApplianceSiteProperties> {
    /*
     * Address Prefix.
     */
    private String addressPrefix;

    /*
     * Office 365 Policy.
     */
    private Office365PolicyProperties o365Policy;

    /*
     * The provisioning state of the resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VirtualApplianceSiteProperties class.
     */
    public VirtualApplianceSiteProperties() {
    }

    /**
     * Get the addressPrefix property: Address Prefix.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: Address Prefix.
     * 
     * @param addressPrefix the addressPrefix value to set.
     * @return the VirtualApplianceSiteProperties object itself.
     */
    public VirtualApplianceSiteProperties withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the o365Policy property: Office 365 Policy.
     * 
     * @return the o365Policy value.
     */
    public Office365PolicyProperties o365Policy() {
        return this.o365Policy;
    }

    /**
     * Set the o365Policy property: Office 365 Policy.
     * 
     * @param o365Policy the o365Policy value to set.
     * @return the VirtualApplianceSiteProperties object itself.
     */
    public VirtualApplianceSiteProperties withO365Policy(Office365PolicyProperties o365Policy) {
        this.o365Policy = o365Policy;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
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
        if (o365Policy() != null) {
            o365Policy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("addressPrefix", this.addressPrefix);
        jsonWriter.writeJsonField("o365Policy", this.o365Policy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VirtualApplianceSiteProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VirtualApplianceSiteProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VirtualApplianceSiteProperties.
     */
    public static VirtualApplianceSiteProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VirtualApplianceSiteProperties deserializedVirtualApplianceSiteProperties
                = new VirtualApplianceSiteProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("addressPrefix".equals(fieldName)) {
                    deserializedVirtualApplianceSiteProperties.addressPrefix = reader.getString();
                } else if ("o365Policy".equals(fieldName)) {
                    deserializedVirtualApplianceSiteProperties.o365Policy = Office365PolicyProperties.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVirtualApplianceSiteProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVirtualApplianceSiteProperties;
        });
    }
}

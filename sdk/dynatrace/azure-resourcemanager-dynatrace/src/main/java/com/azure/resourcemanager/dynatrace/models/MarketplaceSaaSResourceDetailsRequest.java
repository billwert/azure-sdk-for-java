// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Request for getting Marketplace SaaS resource details for a tenant Id.
 */
@Fluent
public final class MarketplaceSaaSResourceDetailsRequest
    implements JsonSerializable<MarketplaceSaaSResourceDetailsRequest> {
    /*
     * Tenant Id
     */
    private String tenantId;

    /**
     * Creates an instance of MarketplaceSaaSResourceDetailsRequest class.
     */
    public MarketplaceSaaSResourceDetailsRequest() {
    }

    /**
     * Get the tenantId property: Tenant Id.
     * 
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: Tenant Id.
     * 
     * @param tenantId the tenantId value to set.
     * @return the MarketplaceSaaSResourceDetailsRequest object itself.
     */
    public MarketplaceSaaSResourceDetailsRequest withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (tenantId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property tenantId in model MarketplaceSaaSResourceDetailsRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MarketplaceSaaSResourceDetailsRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("tenantId", this.tenantId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MarketplaceSaaSResourceDetailsRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MarketplaceSaaSResourceDetailsRequest if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MarketplaceSaaSResourceDetailsRequest.
     */
    public static MarketplaceSaaSResourceDetailsRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MarketplaceSaaSResourceDetailsRequest deserializedMarketplaceSaaSResourceDetailsRequest
                = new MarketplaceSaaSResourceDetailsRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tenantId".equals(fieldName)) {
                    deserializedMarketplaceSaaSResourceDetailsRequest.tenantId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMarketplaceSaaSResourceDetailsRequest;
        });
    }
}

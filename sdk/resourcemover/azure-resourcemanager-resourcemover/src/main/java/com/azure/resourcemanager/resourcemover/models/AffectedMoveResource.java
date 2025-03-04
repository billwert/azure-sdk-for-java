// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcemover.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The RP custom operation error info.
 */
@Immutable
public final class AffectedMoveResource implements JsonSerializable<AffectedMoveResource> {
    /*
     * The affected move resource id.
     */
    private String id;

    /*
     * The affected move resource source id.
     */
    private String sourceId;

    /*
     * The affected move resources.
     */
    private List<AffectedMoveResource> moveResources;

    /**
     * Creates an instance of AffectedMoveResource class.
     */
    public AffectedMoveResource() {
    }

    /**
     * Get the id property: The affected move resource id.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the sourceId property: The affected move resource source id.
     * 
     * @return the sourceId value.
     */
    public String sourceId() {
        return this.sourceId;
    }

    /**
     * Get the moveResources property: The affected move resources.
     * 
     * @return the moveResources value.
     */
    public List<AffectedMoveResource> moveResources() {
        return this.moveResources;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (moveResources() != null) {
            moveResources().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AffectedMoveResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AffectedMoveResource if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AffectedMoveResource.
     */
    public static AffectedMoveResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AffectedMoveResource deserializedAffectedMoveResource = new AffectedMoveResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedAffectedMoveResource.id = reader.getString();
                } else if ("sourceId".equals(fieldName)) {
                    deserializedAffectedMoveResource.sourceId = reader.getString();
                } else if ("moveResources".equals(fieldName)) {
                    List<AffectedMoveResource> moveResources
                        = reader.readArray(reader1 -> AffectedMoveResource.fromJson(reader1));
                    deserializedAffectedMoveResource.moveResources = moveResources;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAffectedMoveResource;
        });
    }
}

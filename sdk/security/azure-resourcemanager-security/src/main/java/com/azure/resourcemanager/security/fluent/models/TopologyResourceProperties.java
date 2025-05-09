// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.security.models.TopologySingleResource;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The TopologyResourceProperties model.
 */
@Immutable
public final class TopologyResourceProperties implements JsonSerializable<TopologyResourceProperties> {
    /*
     * The UTC time on which the topology was calculated
     */
    private OffsetDateTime calculatedDateTime;

    /*
     * Azure resources which are part of this topology resource
     */
    private List<TopologySingleResource> topologyResources;

    /**
     * Creates an instance of TopologyResourceProperties class.
     */
    public TopologyResourceProperties() {
    }

    /**
     * Get the calculatedDateTime property: The UTC time on which the topology was calculated.
     * 
     * @return the calculatedDateTime value.
     */
    public OffsetDateTime calculatedDateTime() {
        return this.calculatedDateTime;
    }

    /**
     * Get the topologyResources property: Azure resources which are part of this topology resource.
     * 
     * @return the topologyResources value.
     */
    public List<TopologySingleResource> topologyResources() {
        return this.topologyResources;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (topologyResources() != null) {
            topologyResources().forEach(e -> e.validate());
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
     * Reads an instance of TopologyResourceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TopologyResourceProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the TopologyResourceProperties.
     */
    public static TopologyResourceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TopologyResourceProperties deserializedTopologyResourceProperties = new TopologyResourceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("calculatedDateTime".equals(fieldName)) {
                    deserializedTopologyResourceProperties.calculatedDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("topologyResources".equals(fieldName)) {
                    List<TopologySingleResource> topologyResources
                        = reader.readArray(reader1 -> TopologySingleResource.fromJson(reader1));
                    deserializedTopologyResourceProperties.topologyResources = topologyResources;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTopologyResourceProperties;
        });
    }
}

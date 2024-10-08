// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The metric dimension name and value.
 */
@Fluent
public final class MetricSingleDimension implements JsonSerializable<MetricSingleDimension> {
    /*
     * Name of the dimension.
     */
    private String name;

    /*
     * Value of the dimension.
     */
    private String value;

    /**
     * Creates an instance of MetricSingleDimension class.
     */
    public MetricSingleDimension() {
    }

    /**
     * Get the name property: Name of the dimension.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the dimension.
     * 
     * @param name the name value to set.
     * @return the MetricSingleDimension object itself.
     */
    public MetricSingleDimension withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: Value of the dimension.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the dimension.
     * 
     * @param value the value value to set.
     * @return the MetricSingleDimension object itself.
     */
    public MetricSingleDimension withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model MetricSingleDimension"));
        }
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model MetricSingleDimension"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MetricSingleDimension.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MetricSingleDimension from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MetricSingleDimension if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MetricSingleDimension.
     */
    public static MetricSingleDimension fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MetricSingleDimension deserializedMetricSingleDimension = new MetricSingleDimension();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMetricSingleDimension.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedMetricSingleDimension.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMetricSingleDimension;
        });
    }
}

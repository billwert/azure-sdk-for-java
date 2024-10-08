// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The WafMetricsResponseSeriesPropertiesItemsItem model.
 */
@Fluent
public final class WafMetricsResponseSeriesPropertiesItemsItem
    implements JsonSerializable<WafMetricsResponseSeriesPropertiesItemsItem> {
    /*
     * The name property.
     */
    private String name;

    /*
     * The value property.
     */
    private String value;

    /**
     * Creates an instance of WafMetricsResponseSeriesPropertiesItemsItem class.
     */
    public WafMetricsResponseSeriesPropertiesItemsItem() {
    }

    /**
     * Get the name property: The name property.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     * 
     * @param name the name value to set.
     * @return the WafMetricsResponseSeriesPropertiesItemsItem object itself.
     */
    public WafMetricsResponseSeriesPropertiesItemsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the WafMetricsResponseSeriesPropertiesItemsItem object itself.
     */
    public WafMetricsResponseSeriesPropertiesItemsItem withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

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
     * Reads an instance of WafMetricsResponseSeriesPropertiesItemsItem from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WafMetricsResponseSeriesPropertiesItemsItem if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the WafMetricsResponseSeriesPropertiesItemsItem.
     */
    public static WafMetricsResponseSeriesPropertiesItemsItem fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WafMetricsResponseSeriesPropertiesItemsItem deserializedWafMetricsResponseSeriesPropertiesItemsItem
                = new WafMetricsResponseSeriesPropertiesItemsItem();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedWafMetricsResponseSeriesPropertiesItemsItem.name = reader.getString();
                } else if ("value".equals(fieldName)) {
                    deserializedWafMetricsResponseSeriesPropertiesItemsItem.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWafMetricsResponseSeriesPropertiesItemsItem;
        });
    }
}

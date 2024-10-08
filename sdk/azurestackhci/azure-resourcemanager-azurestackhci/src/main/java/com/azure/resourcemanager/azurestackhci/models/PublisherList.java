// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.azurestackhci.fluent.models.PublisherInner;
import java.io.IOException;
import java.util.List;

/**
 * List of Publisher proxy resources for the HCI cluster.
 */
@Immutable
public final class PublisherList implements JsonSerializable<PublisherList> {
    /*
     * List of Publisher proxy resources.
     */
    private List<PublisherInner> value;

    /*
     * Link to the next set of results.
     */
    private String nextLink;

    /**
     * Creates an instance of PublisherList class.
     */
    public PublisherList() {
    }

    /**
     * Get the value property: List of Publisher proxy resources.
     * 
     * @return the value value.
     */
    public List<PublisherInner> value() {
        return this.value;
    }

    /**
     * Get the nextLink property: Link to the next set of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
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
     * Reads an instance of PublisherList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PublisherList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the PublisherList.
     */
    public static PublisherList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PublisherList deserializedPublisherList = new PublisherList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PublisherInner> value = reader.readArray(reader1 -> PublisherInner.fromJson(reader1));
                    deserializedPublisherList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedPublisherList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPublisherList;
        });
    }
}

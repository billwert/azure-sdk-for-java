// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloads.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.workloads.fluent.models.SapApplicationServerInstanceInner;
import java.io.IOException;
import java.util.List;

/**
 * Defines the collection of SAP Application Server Instance resources.
 */
@Fluent
public final class SapApplicationServerInstanceList implements JsonSerializable<SapApplicationServerInstanceList> {
    /*
     * Gets the list of SAP Application Server instance resources.
     */
    private List<SapApplicationServerInstanceInner> value;

    /*
     * Gets the value of next link.
     */
    private String nextLink;

    /**
     * Creates an instance of SapApplicationServerInstanceList class.
     */
    public SapApplicationServerInstanceList() {
    }

    /**
     * Get the value property: Gets the list of SAP Application Server instance resources.
     * 
     * @return the value value.
     */
    public List<SapApplicationServerInstanceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets the list of SAP Application Server instance resources.
     * 
     * @param value the value value to set.
     * @return the SapApplicationServerInstanceList object itself.
     */
    public SapApplicationServerInstanceList withValue(List<SapApplicationServerInstanceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets the value of next link.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets the value of next link.
     * 
     * @param nextLink the nextLink value to set.
     * @return the SapApplicationServerInstanceList object itself.
     */
    public SapApplicationServerInstanceList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SapApplicationServerInstanceList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SapApplicationServerInstanceList if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SapApplicationServerInstanceList.
     */
    public static SapApplicationServerInstanceList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SapApplicationServerInstanceList deserializedSapApplicationServerInstanceList
                = new SapApplicationServerInstanceList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<SapApplicationServerInstanceInner> value
                        = reader.readArray(reader1 -> SapApplicationServerInstanceInner.fromJson(reader1));
                    deserializedSapApplicationServerInstanceList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedSapApplicationServerInstanceList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSapApplicationServerInstanceList;
        });
    }
}

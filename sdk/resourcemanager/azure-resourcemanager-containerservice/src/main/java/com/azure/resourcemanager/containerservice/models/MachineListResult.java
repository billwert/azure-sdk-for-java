// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.containerservice.fluent.models.MachineInner;
import java.io.IOException;
import java.util.List;

/**
 * The response from the List Machines operation.
 */
@Fluent
public final class MachineListResult implements JsonSerializable<MachineListResult> {
    /*
     * The URL to get the next set of machine results.
     */
    private String nextLink;

    /*
     * The list of Machines in cluster.
     */
    private List<MachineInner> value;

    /**
     * Creates an instance of MachineListResult class.
     */
    public MachineListResult() {
    }

    /**
     * Get the nextLink property: The URL to get the next set of machine results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Get the value property: The list of Machines in cluster.
     * 
     * @return the value value.
     */
    public List<MachineInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Machines in cluster.
     * 
     * @param value the value value to set.
     * @return the MachineListResult object itself.
     */
    public MachineListResult withValue(List<MachineInner> value) {
        this.value = value;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MachineListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MachineListResult if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MachineListResult.
     */
    public static MachineListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MachineListResult deserializedMachineListResult = new MachineListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nextLink".equals(fieldName)) {
                    deserializedMachineListResult.nextLink = reader.getString();
                } else if ("value".equals(fieldName)) {
                    List<MachineInner> value = reader.readArray(reader1 -> MachineInner.fromJson(reader1));
                    deserializedMachineListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMachineListResult;
        });
    }
}

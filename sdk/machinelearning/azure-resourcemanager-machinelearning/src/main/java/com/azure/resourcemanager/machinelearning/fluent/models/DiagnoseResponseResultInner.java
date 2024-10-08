// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.DiagnoseResponseResultValue;
import java.io.IOException;

/**
 * The DiagnoseResponseResult model.
 */
@Fluent
public final class DiagnoseResponseResultInner implements JsonSerializable<DiagnoseResponseResultInner> {
    /*
     * The value property.
     */
    private DiagnoseResponseResultValue value;

    /**
     * Creates an instance of DiagnoseResponseResultInner class.
     */
    public DiagnoseResponseResultInner() {
    }

    /**
     * Get the value property: The value property.
     * 
     * @return the value value.
     */
    public DiagnoseResponseResultValue value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     * 
     * @param value the value value to set.
     * @return the DiagnoseResponseResultInner object itself.
     */
    public DiagnoseResponseResultInner withValue(DiagnoseResponseResultValue value) {
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
            value().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DiagnoseResponseResultInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DiagnoseResponseResultInner if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DiagnoseResponseResultInner.
     */
    public static DiagnoseResponseResultInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DiagnoseResponseResultInner deserializedDiagnoseResponseResultInner = new DiagnoseResponseResultInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    deserializedDiagnoseResponseResultInner.value = DiagnoseResponseResultValue.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDiagnoseResponseResultInner;
        });
    }
}

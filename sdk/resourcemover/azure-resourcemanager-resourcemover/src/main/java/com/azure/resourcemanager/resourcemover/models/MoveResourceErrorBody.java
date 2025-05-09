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
 * An error response from the Azure Migrate service.
 */
@Immutable
public final class MoveResourceErrorBody implements JsonSerializable<MoveResourceErrorBody> {
    /*
     * An identifier for the error. Codes are invariant and are intended to be consumed programmatically.
     */
    private String code;

    /*
     * A message describing the error, intended to be suitable for display in a user interface.
     */
    private String message;

    /*
     * The target of the particular error. For example, the name of the property in error.
     */
    private String target;

    /*
     * A list of additional details about the error.
     */
    private List<MoveResourceErrorBody> details;

    /**
     * Creates an instance of MoveResourceErrorBody class.
     */
    public MoveResourceErrorBody() {
    }

    /**
     * Get the code property: An identifier for the error. Codes are invariant and are intended to be consumed
     * programmatically.
     * 
     * @return the code value.
     */
    public String code() {
        return this.code;
    }

    /**
     * Get the message property: A message describing the error, intended to be suitable for display in a user
     * interface.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Get the target property: The target of the particular error. For example, the name of the property in error.
     * 
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Get the details property: A list of additional details about the error.
     * 
     * @return the details value.
     */
    public List<MoveResourceErrorBody> details() {
        return this.details;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (details() != null) {
            details().forEach(e -> e.validate());
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
     * Reads an instance of MoveResourceErrorBody from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MoveResourceErrorBody if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MoveResourceErrorBody.
     */
    public static MoveResourceErrorBody fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MoveResourceErrorBody deserializedMoveResourceErrorBody = new MoveResourceErrorBody();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("code".equals(fieldName)) {
                    deserializedMoveResourceErrorBody.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedMoveResourceErrorBody.message = reader.getString();
                } else if ("target".equals(fieldName)) {
                    deserializedMoveResourceErrorBody.target = reader.getString();
                } else if ("details".equals(fieldName)) {
                    List<MoveResourceErrorBody> details
                        = reader.readArray(reader1 -> MoveResourceErrorBody.fromJson(reader1));
                    deserializedMoveResourceErrorBody.details = details;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMoveResourceErrorBody;
        });
    }
}

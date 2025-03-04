// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The get random bytes request object.
 */
@Fluent
public final class GetRandomBytesRequest implements JsonSerializable<GetRandomBytesRequest> {
    /*
     * The requested number of random bytes.
     */
    private int count;

    /**
     * Creates an instance of GetRandomBytesRequest class.
     */
    public GetRandomBytesRequest() {
    }

    /**
     * Get the count property: The requested number of random bytes.
     * 
     * @return the count value.
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Set the count property: The requested number of random bytes.
     * 
     * @param count the count value to set.
     * @return the GetRandomBytesRequest object itself.
     */
    public GetRandomBytesRequest setCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("count", this.count);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GetRandomBytesRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GetRandomBytesRequest if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the GetRandomBytesRequest.
     */
    public static GetRandomBytesRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GetRandomBytesRequest deserializedGetRandomBytesRequest = new GetRandomBytesRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedGetRandomBytesRequest.count = reader.getInt();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGetRandomBytesRequest;
        });
    }
}

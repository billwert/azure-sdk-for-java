// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * An error encountered by the Batch service when deleting a Certificate.
 */
@Immutable
public final class DeleteBatchCertificateError implements JsonSerializable<DeleteBatchCertificateError> {

    /*
     * An identifier for the Certificate deletion error. Codes are invariant and are intended to be consumed
     * programmatically.
     */
    @Generated
    private String code;

    /*
     * A message describing the Certificate deletion error, intended to be suitable for display in a user interface.
     */
    @Generated
    private String message;

    /*
     * A list of additional error details related to the Certificate deletion error. This list includes details such as
     * the active Pools and Compute Nodes referencing this Certificate. However, if a large number of resources
     * reference the Certificate, the list contains only about the first hundred.
     */
    @Generated
    private List<NameValuePair> values;

    /**
     * Creates an instance of DeleteBatchCertificateError class.
     */
    @Generated
    private DeleteBatchCertificateError() {
    }

    /**
     * Get the code property: An identifier for the Certificate deletion error. Codes are invariant and are intended to
     * be consumed programmatically.
     *
     * @return the code value.
     */
    @Generated
    public String getCode() {
        return this.code;
    }

    /**
     * Get the message property: A message describing the Certificate deletion error, intended to be suitable for
     * display in a user interface.
     *
     * @return the message value.
     */
    @Generated
    public String getMessage() {
        return this.message;
    }

    /**
     * Get the values property: A list of additional error details related to the Certificate deletion error. This list
     * includes details such as the active Pools and Compute Nodes referencing this Certificate. However, if a large
     * number of resources reference the Certificate, the list contains only about the first hundred.
     *
     * @return the values value.
     */
    @Generated
    public List<NameValuePair> getValues() {
        return this.values;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("code", this.code);
        jsonWriter.writeStringField("message", this.message);
        jsonWriter.writeArrayField("values", this.values, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeleteBatchCertificateError from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeleteBatchCertificateError if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the DeleteBatchCertificateError.
     */
    @Generated
    public static DeleteBatchCertificateError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeleteBatchCertificateError deserializedDeleteBatchCertificateError = new DeleteBatchCertificateError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("code".equals(fieldName)) {
                    deserializedDeleteBatchCertificateError.code = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedDeleteBatchCertificateError.message = reader.getString();
                } else if ("values".equals(fieldName)) {
                    List<NameValuePair> values = reader.readArray(reader1 -> NameValuePair.fromJson(reader1));
                    deserializedDeleteBatchCertificateError.values = values;
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedDeleteBatchCertificateError;
        });
    }
}

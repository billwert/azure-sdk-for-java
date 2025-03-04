// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Search job execution statistics.
 */
@Immutable
public final class ResultStatistics implements JsonSerializable<ResultStatistics> {
    /*
     * Search job completion percentage.
     */
    private Float progress;

    /*
     * The number of rows that were returned by the search job.
     */
    private Integer ingestedRecords;

    /*
     * Search job: Amount of scanned data.
     */
    private Float scannedGb;

    /**
     * Creates an instance of ResultStatistics class.
     */
    public ResultStatistics() {
    }

    /**
     * Get the progress property: Search job completion percentage.
     * 
     * @return the progress value.
     */
    public Float progress() {
        return this.progress;
    }

    /**
     * Get the ingestedRecords property: The number of rows that were returned by the search job.
     * 
     * @return the ingestedRecords value.
     */
    public Integer ingestedRecords() {
        return this.ingestedRecords;
    }

    /**
     * Get the scannedGb property: Search job: Amount of scanned data.
     * 
     * @return the scannedGb value.
     */
    public Float scannedGb() {
        return this.scannedGb;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResultStatistics from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResultStatistics if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResultStatistics.
     */
    public static ResultStatistics fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResultStatistics deserializedResultStatistics = new ResultStatistics();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("progress".equals(fieldName)) {
                    deserializedResultStatistics.progress = reader.getNullable(JsonReader::getFloat);
                } else if ("ingestedRecords".equals(fieldName)) {
                    deserializedResultStatistics.ingestedRecords = reader.getNullable(JsonReader::getInt);
                } else if ("scannedGb".equals(fieldName)) {
                    deserializedResultStatistics.scannedGb = reader.getNullable(JsonReader::getFloat);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResultStatistics;
        });
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.anomalydetector.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Detection results for the resultId value.
 */
@Immutable
public final class MultivariateDetectionResult implements JsonSerializable<MultivariateDetectionResult> {

    /*
     * Result identifier that's used to fetch the results of an inference call.
     */
    @Generated
    private String resultId;

    /*
     * Multivariate anomaly detection status.
     */
    @Generated
    private final MultivariateBatchDetectionResultSummary summary;

    /*
     * Detection result for each time stamp.
     */
    @Generated
    private final List<AnomalyState> results;

    /**
     * Creates an instance of MultivariateDetectionResult class.
     *
     * @param summary the summary value to set.
     * @param results the results value to set.
     */
    @Generated
    private MultivariateDetectionResult(MultivariateBatchDetectionResultSummary summary, List<AnomalyState> results) {
        this.summary = summary;
        this.results = results;
    }

    /**
     * Get the resultId property: Result identifier that's used to fetch the results of an inference call.
     *
     * @return the resultId value.
     */
    @Generated
    public String getResultId() {
        return this.resultId;
    }

    /**
     * Get the summary property: Multivariate anomaly detection status.
     *
     * @return the summary value.
     */
    @Generated
    public MultivariateBatchDetectionResultSummary getSummary() {
        return this.summary;
    }

    /**
     * Get the results property: Detection result for each time stamp.
     *
     * @return the results value.
     */
    @Generated
    public List<AnomalyState> getResults() {
        return this.results;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("summary", this.summary);
        jsonWriter.writeArrayField("results", this.results, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MultivariateDetectionResult from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MultivariateDetectionResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MultivariateDetectionResult.
     */
    @Generated
    public static MultivariateDetectionResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String resultId = null;
            MultivariateBatchDetectionResultSummary summary = null;
            List<AnomalyState> results = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("resultId".equals(fieldName)) {
                    resultId = reader.getString();
                } else if ("summary".equals(fieldName)) {
                    summary = MultivariateBatchDetectionResultSummary.fromJson(reader);
                } else if ("results".equals(fieldName)) {
                    results = reader.readArray(reader1 -> AnomalyState.fromJson(reader1));
                } else {
                    reader.skipChildren();
                }
            }
            MultivariateDetectionResult deserializedMultivariateDetectionResult
                = new MultivariateDetectionResult(summary, results);
            deserializedMultivariateDetectionResult.resultId = resultId;
            return deserializedMultivariateDetectionResult;
        });
    }
}

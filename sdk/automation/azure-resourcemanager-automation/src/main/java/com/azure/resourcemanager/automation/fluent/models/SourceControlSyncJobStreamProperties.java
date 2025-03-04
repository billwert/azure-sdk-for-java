// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.automation.models.StreamType;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Definition of source control sync job stream properties.
 */
@Fluent
public final class SourceControlSyncJobStreamProperties
    implements JsonSerializable<SourceControlSyncJobStreamProperties> {
    /*
     * The sync job stream id.
     */
    private String sourceControlSyncJobStreamId;

    /*
     * The summary of the sync job stream.
     */
    private String summary;

    /*
     * The time of the sync job stream.
     */
    private OffsetDateTime time;

    /*
     * The type of the sync job stream.
     */
    private StreamType streamType;

    /**
     * Creates an instance of SourceControlSyncJobStreamProperties class.
     */
    public SourceControlSyncJobStreamProperties() {
    }

    /**
     * Get the sourceControlSyncJobStreamId property: The sync job stream id.
     * 
     * @return the sourceControlSyncJobStreamId value.
     */
    public String sourceControlSyncJobStreamId() {
        return this.sourceControlSyncJobStreamId;
    }

    /**
     * Set the sourceControlSyncJobStreamId property: The sync job stream id.
     * 
     * @param sourceControlSyncJobStreamId the sourceControlSyncJobStreamId value to set.
     * @return the SourceControlSyncJobStreamProperties object itself.
     */
    public SourceControlSyncJobStreamProperties withSourceControlSyncJobStreamId(String sourceControlSyncJobStreamId) {
        this.sourceControlSyncJobStreamId = sourceControlSyncJobStreamId;
        return this;
    }

    /**
     * Get the summary property: The summary of the sync job stream.
     * 
     * @return the summary value.
     */
    public String summary() {
        return this.summary;
    }

    /**
     * Set the summary property: The summary of the sync job stream.
     * 
     * @param summary the summary value to set.
     * @return the SourceControlSyncJobStreamProperties object itself.
     */
    public SourceControlSyncJobStreamProperties withSummary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get the time property: The time of the sync job stream.
     * 
     * @return the time value.
     */
    public OffsetDateTime time() {
        return this.time;
    }

    /**
     * Get the streamType property: The type of the sync job stream.
     * 
     * @return the streamType value.
     */
    public StreamType streamType() {
        return this.streamType;
    }

    /**
     * Set the streamType property: The type of the sync job stream.
     * 
     * @param streamType the streamType value to set.
     * @return the SourceControlSyncJobStreamProperties object itself.
     */
    public SourceControlSyncJobStreamProperties withStreamType(StreamType streamType) {
        this.streamType = streamType;
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
        jsonWriter.writeStringField("sourceControlSyncJobStreamId", this.sourceControlSyncJobStreamId);
        jsonWriter.writeStringField("summary", this.summary);
        jsonWriter.writeStringField("streamType", this.streamType == null ? null : this.streamType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SourceControlSyncJobStreamProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SourceControlSyncJobStreamProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the SourceControlSyncJobStreamProperties.
     */
    public static SourceControlSyncJobStreamProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SourceControlSyncJobStreamProperties deserializedSourceControlSyncJobStreamProperties
                = new SourceControlSyncJobStreamProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sourceControlSyncJobStreamId".equals(fieldName)) {
                    deserializedSourceControlSyncJobStreamProperties.sourceControlSyncJobStreamId = reader.getString();
                } else if ("summary".equals(fieldName)) {
                    deserializedSourceControlSyncJobStreamProperties.summary = reader.getString();
                } else if ("time".equals(fieldName)) {
                    deserializedSourceControlSyncJobStreamProperties.time = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("streamType".equals(fieldName)) {
                    deserializedSourceControlSyncJobStreamProperties.streamType
                        = StreamType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSourceControlSyncJobStreamProperties;
        });
    }
}

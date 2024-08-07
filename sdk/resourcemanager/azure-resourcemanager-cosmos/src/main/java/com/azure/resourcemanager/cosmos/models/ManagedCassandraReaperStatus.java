// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Map;

/**
 * The ManagedCassandraReaperStatus model.
 */
@Fluent
public final class ManagedCassandraReaperStatus implements JsonSerializable<ManagedCassandraReaperStatus> {
    /*
     * The healthy property.
     */
    private Boolean healthy;

    /*
     * Dictionary of <string>
     */
    private Map<String, String> repairRunIds;

    /*
     * Dictionary of <string>
     */
    private Map<String, String> repairSchedules;

    /**
     * Creates an instance of ManagedCassandraReaperStatus class.
     */
    public ManagedCassandraReaperStatus() {
    }

    /**
     * Get the healthy property: The healthy property.
     * 
     * @return the healthy value.
     */
    public Boolean healthy() {
        return this.healthy;
    }

    /**
     * Set the healthy property: The healthy property.
     * 
     * @param healthy the healthy value to set.
     * @return the ManagedCassandraReaperStatus object itself.
     */
    public ManagedCassandraReaperStatus withHealthy(Boolean healthy) {
        this.healthy = healthy;
        return this;
    }

    /**
     * Get the repairRunIds property: Dictionary of &lt;string&gt;.
     * 
     * @return the repairRunIds value.
     */
    public Map<String, String> repairRunIds() {
        return this.repairRunIds;
    }

    /**
     * Set the repairRunIds property: Dictionary of &lt;string&gt;.
     * 
     * @param repairRunIds the repairRunIds value to set.
     * @return the ManagedCassandraReaperStatus object itself.
     */
    public ManagedCassandraReaperStatus withRepairRunIds(Map<String, String> repairRunIds) {
        this.repairRunIds = repairRunIds;
        return this;
    }

    /**
     * Get the repairSchedules property: Dictionary of &lt;string&gt;.
     * 
     * @return the repairSchedules value.
     */
    public Map<String, String> repairSchedules() {
        return this.repairSchedules;
    }

    /**
     * Set the repairSchedules property: Dictionary of &lt;string&gt;.
     * 
     * @param repairSchedules the repairSchedules value to set.
     * @return the ManagedCassandraReaperStatus object itself.
     */
    public ManagedCassandraReaperStatus withRepairSchedules(Map<String, String> repairSchedules) {
        this.repairSchedules = repairSchedules;
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
        jsonWriter.writeBooleanField("healthy", this.healthy);
        jsonWriter.writeMapField("repairRunIds", this.repairRunIds, (writer, element) -> writer.writeString(element));
        jsonWriter.writeMapField("repairSchedules", this.repairSchedules,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedCassandraReaperStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedCassandraReaperStatus if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagedCassandraReaperStatus.
     */
    public static ManagedCassandraReaperStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedCassandraReaperStatus deserializedManagedCassandraReaperStatus = new ManagedCassandraReaperStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("healthy".equals(fieldName)) {
                    deserializedManagedCassandraReaperStatus.healthy = reader.getNullable(JsonReader::getBoolean);
                } else if ("repairRunIds".equals(fieldName)) {
                    Map<String, String> repairRunIds = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedCassandraReaperStatus.repairRunIds = repairRunIds;
                } else if ("repairSchedules".equals(fieldName)) {
                    Map<String, String> repairSchedules = reader.readMap(reader1 -> reader1.getString());
                    deserializedManagedCassandraReaperStatus.repairSchedules = repairSchedules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedCassandraReaperStatus;
        });
    }
}

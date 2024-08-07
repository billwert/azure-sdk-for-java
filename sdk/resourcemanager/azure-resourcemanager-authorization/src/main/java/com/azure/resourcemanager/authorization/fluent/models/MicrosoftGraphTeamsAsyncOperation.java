// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * teamsAsyncOperation.
 */
@Fluent
public final class MicrosoftGraphTeamsAsyncOperation extends MicrosoftGraphEntity {
    /*
     * Number of times the operation was attempted before being marked successful or failed.
     */
    private Integer attemptsCount;

    /*
     * Time when the operation was created.
     */
    private OffsetDateTime createdDateTime;

    /*
     * operationError
     */
    private MicrosoftGraphOperationError error;

    /*
     * Time when the async operation was last updated.
     */
    private OffsetDateTime lastActionDateTime;

    /*
     * teamsAsyncOperationType
     */
    private MicrosoftGraphTeamsAsyncOperationType operationType;

    /*
     * teamsAsyncOperationStatus
     */
    private MicrosoftGraphTeamsAsyncOperationStatus status;

    /*
     * The ID of the object that's created or modified as result of this async operation, typically a team.
     */
    private String targetResourceId;

    /*
     * The location of the object that's created or modified as result of this async operation. This URL should be
     * treated as an opaque value and not parsed into its component paths.
     */
    private String targetResourceLocation;

    /*
     * teamsAsyncOperation
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphTeamsAsyncOperation class.
     */
    public MicrosoftGraphTeamsAsyncOperation() {
    }

    /**
     * Get the attemptsCount property: Number of times the operation was attempted before being marked successful or
     * failed.
     * 
     * @return the attemptsCount value.
     */
    public Integer attemptsCount() {
        return this.attemptsCount;
    }

    /**
     * Set the attemptsCount property: Number of times the operation was attempted before being marked successful or
     * failed.
     * 
     * @param attemptsCount the attemptsCount value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withAttemptsCount(Integer attemptsCount) {
        this.attemptsCount = attemptsCount;
        return this;
    }

    /**
     * Get the createdDateTime property: Time when the operation was created.
     * 
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: Time when the operation was created.
     * 
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the error property: operationError.
     * 
     * @return the error value.
     */
    public MicrosoftGraphOperationError error() {
        return this.error;
    }

    /**
     * Set the error property: operationError.
     * 
     * @param error the error value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withError(MicrosoftGraphOperationError error) {
        this.error = error;
        return this;
    }

    /**
     * Get the lastActionDateTime property: Time when the async operation was last updated.
     * 
     * @return the lastActionDateTime value.
     */
    public OffsetDateTime lastActionDateTime() {
        return this.lastActionDateTime;
    }

    /**
     * Set the lastActionDateTime property: Time when the async operation was last updated.
     * 
     * @param lastActionDateTime the lastActionDateTime value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withLastActionDateTime(OffsetDateTime lastActionDateTime) {
        this.lastActionDateTime = lastActionDateTime;
        return this;
    }

    /**
     * Get the operationType property: teamsAsyncOperationType.
     * 
     * @return the operationType value.
     */
    public MicrosoftGraphTeamsAsyncOperationType operationType() {
        return this.operationType;
    }

    /**
     * Set the operationType property: teamsAsyncOperationType.
     * 
     * @param operationType the operationType value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withOperationType(MicrosoftGraphTeamsAsyncOperationType operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * Get the status property: teamsAsyncOperationStatus.
     * 
     * @return the status value.
     */
    public MicrosoftGraphTeamsAsyncOperationStatus status() {
        return this.status;
    }

    /**
     * Set the status property: teamsAsyncOperationStatus.
     * 
     * @param status the status value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withStatus(MicrosoftGraphTeamsAsyncOperationStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the targetResourceId property: The ID of the object that's created or modified as result of this async
     * operation, typically a team.
     * 
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the targetResourceId property: The ID of the object that's created or modified as result of this async
     * operation, typically a team.
     * 
     * @param targetResourceId the targetResourceId value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the targetResourceLocation property: The location of the object that's created or modified as result of this
     * async operation. This URL should be treated as an opaque value and not parsed into its component paths.
     * 
     * @return the targetResourceLocation value.
     */
    public String targetResourceLocation() {
        return this.targetResourceLocation;
    }

    /**
     * Set the targetResourceLocation property: The location of the object that's created or modified as result of this
     * async operation. This URL should be treated as an opaque value and not parsed into its component paths.
     * 
     * @param targetResourceLocation the targetResourceLocation value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withTargetResourceLocation(String targetResourceLocation) {
        this.targetResourceLocation = targetResourceLocation;
        return this;
    }

    /**
     * Get the additionalProperties property: teamsAsyncOperation.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: teamsAsyncOperation.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTeamsAsyncOperation object itself.
     */
    public MicrosoftGraphTeamsAsyncOperation withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MicrosoftGraphTeamsAsyncOperation withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (error() != null) {
            error().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", id());
        jsonWriter.writeNumberField("attemptsCount", this.attemptsCount);
        jsonWriter.writeStringField("createdDateTime",
            this.createdDateTime == null ? null : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.createdDateTime));
        jsonWriter.writeJsonField("error", this.error);
        jsonWriter.writeStringField("lastActionDateTime",
            this.lastActionDateTime == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.lastActionDateTime));
        jsonWriter.writeStringField("operationType", this.operationType == null ? null : this.operationType.toString());
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("targetResourceId", this.targetResourceId);
        jsonWriter.writeStringField("targetResourceLocation", this.targetResourceLocation);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphTeamsAsyncOperation from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphTeamsAsyncOperation if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphTeamsAsyncOperation.
     */
    public static MicrosoftGraphTeamsAsyncOperation fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphTeamsAsyncOperation deserializedMicrosoftGraphTeamsAsyncOperation
                = new MicrosoftGraphTeamsAsyncOperation();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.withId(reader.getString());
                } else if ("attemptsCount".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.attemptsCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("createdDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.createdDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("error".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.error = MicrosoftGraphOperationError.fromJson(reader);
                } else if ("lastActionDateTime".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.lastActionDateTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("operationType".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.operationType
                        = MicrosoftGraphTeamsAsyncOperationType.fromString(reader.getString());
                } else if ("status".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.status
                        = MicrosoftGraphTeamsAsyncOperationStatus.fromString(reader.getString());
                } else if ("targetResourceId".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.targetResourceId = reader.getString();
                } else if ("targetResourceLocation".equals(fieldName)) {
                    deserializedMicrosoftGraphTeamsAsyncOperation.targetResourceLocation = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphTeamsAsyncOperation.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphTeamsAsyncOperation;
        });
    }
}

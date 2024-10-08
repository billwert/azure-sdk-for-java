// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * A restorable dropped managed database resource.
 */
@Fluent
public final class RestorableDroppedManagedDatabaseInner extends Resource {
    /*
     * Resource properties.
     */
    private RestorableDroppedManagedDatabaseProperties innerProperties;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of RestorableDroppedManagedDatabaseInner class.
     */
    public RestorableDroppedManagedDatabaseInner() {
    }

    /**
     * Get the innerProperties property: Resource properties.
     * 
     * @return the innerProperties value.
     */
    private RestorableDroppedManagedDatabaseProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestorableDroppedManagedDatabaseInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RestorableDroppedManagedDatabaseInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the databaseName property: The name of the database.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.innerProperties() == null ? null : this.innerProperties().databaseName();
    }

    /**
     * Get the creationDate property: The creation date of the database (ISO8601 format).
     * 
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.innerProperties() == null ? null : this.innerProperties().creationDate();
    }

    /**
     * Get the deletionDate property: The deletion date of the database (ISO8601 format).
     * 
     * @return the deletionDate value.
     */
    public OffsetDateTime deletionDate() {
        return this.innerProperties() == null ? null : this.innerProperties().deletionDate();
    }

    /**
     * Get the earliestRestoreDate property: The earliest restore date of the database (ISO8601 format).
     * 
     * @return the earliestRestoreDate value.
     */
    public OffsetDateTime earliestRestoreDate() {
        return this.innerProperties() == null ? null : this.innerProperties().earliestRestoreDate();
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RestorableDroppedManagedDatabaseInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RestorableDroppedManagedDatabaseInner if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RestorableDroppedManagedDatabaseInner.
     */
    public static RestorableDroppedManagedDatabaseInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RestorableDroppedManagedDatabaseInner deserializedRestorableDroppedManagedDatabaseInner
                = new RestorableDroppedManagedDatabaseInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedRestorableDroppedManagedDatabaseInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedRestorableDroppedManagedDatabaseInner.innerProperties
                        = RestorableDroppedManagedDatabaseProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRestorableDroppedManagedDatabaseInner;
        });
    }
}

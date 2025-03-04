// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.logic.models.ContentLink;
import com.azure.resourcemanager.logic.models.SchemaType;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * The integration account schema properties.
 */
@Fluent
public final class IntegrationAccountSchemaProperties implements JsonSerializable<IntegrationAccountSchemaProperties> {
    /*
     * The schema type.
     */
    private SchemaType schemaType;

    /*
     * The target namespace of the schema.
     */
    private String targetNamespace;

    /*
     * The document name.
     */
    private String documentName;

    /*
     * The file name.
     */
    private String fileName;

    /*
     * The created time.
     */
    private OffsetDateTime createdTime;

    /*
     * The changed time.
     */
    private OffsetDateTime changedTime;

    /*
     * The metadata.
     */
    private Object metadata;

    /*
     * The content.
     */
    private String content;

    /*
     * The content type.
     */
    private String contentType;

    /*
     * The content link.
     */
    private ContentLink contentLink;

    /**
     * Creates an instance of IntegrationAccountSchemaProperties class.
     */
    public IntegrationAccountSchemaProperties() {
    }

    /**
     * Get the schemaType property: The schema type.
     * 
     * @return the schemaType value.
     */
    public SchemaType schemaType() {
        return this.schemaType;
    }

    /**
     * Set the schemaType property: The schema type.
     * 
     * @param schemaType the schemaType value to set.
     * @return the IntegrationAccountSchemaProperties object itself.
     */
    public IntegrationAccountSchemaProperties withSchemaType(SchemaType schemaType) {
        this.schemaType = schemaType;
        return this;
    }

    /**
     * Get the targetNamespace property: The target namespace of the schema.
     * 
     * @return the targetNamespace value.
     */
    public String targetNamespace() {
        return this.targetNamespace;
    }

    /**
     * Set the targetNamespace property: The target namespace of the schema.
     * 
     * @param targetNamespace the targetNamespace value to set.
     * @return the IntegrationAccountSchemaProperties object itself.
     */
    public IntegrationAccountSchemaProperties withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    /**
     * Get the documentName property: The document name.
     * 
     * @return the documentName value.
     */
    public String documentName() {
        return this.documentName;
    }

    /**
     * Set the documentName property: The document name.
     * 
     * @param documentName the documentName value to set.
     * @return the IntegrationAccountSchemaProperties object itself.
     */
    public IntegrationAccountSchemaProperties withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * Get the fileName property: The file name.
     * 
     * @return the fileName value.
     */
    public String fileName() {
        return this.fileName;
    }

    /**
     * Set the fileName property: The file name.
     * 
     * @param fileName the fileName value to set.
     * @return the IntegrationAccountSchemaProperties object itself.
     */
    public IntegrationAccountSchemaProperties withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the createdTime property: The created time.
     * 
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.createdTime;
    }

    /**
     * Get the changedTime property: The changed time.
     * 
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.changedTime;
    }

    /**
     * Get the metadata property: The metadata.
     * 
     * @return the metadata value.
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the IntegrationAccountSchemaProperties object itself.
     */
    public IntegrationAccountSchemaProperties withMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the content property: The content.
     * 
     * @return the content value.
     */
    public String content() {
        return this.content;
    }

    /**
     * Set the content property: The content.
     * 
     * @param content the content value to set.
     * @return the IntegrationAccountSchemaProperties object itself.
     */
    public IntegrationAccountSchemaProperties withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * Get the contentType property: The content type.
     * 
     * @return the contentType value.
     */
    public String contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type.
     * 
     * @param contentType the contentType value to set.
     * @return the IntegrationAccountSchemaProperties object itself.
     */
    public IntegrationAccountSchemaProperties withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentLink property: The content link.
     * 
     * @return the contentLink value.
     */
    public ContentLink contentLink() {
        return this.contentLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (schemaType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property schemaType in model IntegrationAccountSchemaProperties"));
        }
        if (contentLink() != null) {
            contentLink().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IntegrationAccountSchemaProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("schemaType", this.schemaType == null ? null : this.schemaType.toString());
        jsonWriter.writeStringField("targetNamespace", this.targetNamespace);
        jsonWriter.writeStringField("documentName", this.documentName);
        jsonWriter.writeStringField("fileName", this.fileName);
        jsonWriter.writeUntypedField("metadata", this.metadata);
        jsonWriter.writeStringField("content", this.content);
        jsonWriter.writeStringField("contentType", this.contentType);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IntegrationAccountSchemaProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of IntegrationAccountSchemaProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the IntegrationAccountSchemaProperties.
     */
    public static IntegrationAccountSchemaProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            IntegrationAccountSchemaProperties deserializedIntegrationAccountSchemaProperties
                = new IntegrationAccountSchemaProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("schemaType".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.schemaType
                        = SchemaType.fromString(reader.getString());
                } else if ("targetNamespace".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.targetNamespace = reader.getString();
                } else if ("documentName".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.documentName = reader.getString();
                } else if ("fileName".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.fileName = reader.getString();
                } else if ("createdTime".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.createdTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("changedTime".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.changedTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("metadata".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.metadata = reader.readUntyped();
                } else if ("content".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.content = reader.getString();
                } else if ("contentType".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.contentType = reader.getString();
                } else if ("contentLink".equals(fieldName)) {
                    deserializedIntegrationAccountSchemaProperties.contentLink = ContentLink.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedIntegrationAccountSchemaProperties;
        });
    }
}

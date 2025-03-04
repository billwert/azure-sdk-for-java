// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.sharing.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;

import java.io.IOException;

/**
 * An InPlace share kind.
 */
@Fluent
public final class InPlaceSentShare extends SentShare {
    /*
     * Defines the supported types for share.
     */
    private ShareKind shareKind = ShareKind.IN_PLACE_SHARE_KIND;

    /*
     * Properties for InPlace sent share.
     */
    private InPlaceSentShareProperties properties;

    /*
     * Type of the resource.
     */
    private String type;

    /*
     * The unique id of the resource.
     */
    private String id;

    /**
     * Creates an instance of InPlaceSentShare class.
     */
    public InPlaceSentShare() {
    }

    /**
     * Get the shareKind property: Defines the supported types for share.
     *
     * @return the shareKind value.
     */
    @Override
    public ShareKind getShareKind() {
        return this.shareKind;
    }

    /**
     * Get the properties property: Properties for InPlace sent share.
     *
     * @return the properties value.
     */
    public InPlaceSentShareProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties for InPlace sent share.
     *
     * @param properties the properties value to set.
     * @return the InPlaceSentShare object itself.
     */
    public InPlaceSentShare setProperties(InPlaceSentShareProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the id property: The unique id of the resource.
     *
     * @return the id value.
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeStringField("shareKind", this.shareKind == null ? null : this.shareKind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InPlaceSentShare from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of InPlaceSentShare if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the InPlaceSentShare.
     */
    public static InPlaceSentShare fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InPlaceSentShare deserializedInPlaceSentShare = new InPlaceSentShare();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedInPlaceSentShare.id = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedInPlaceSentShare.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedInPlaceSentShare.properties = InPlaceSentShareProperties.fromJson(reader);
                } else if ("shareKind".equals(fieldName)) {
                    deserializedInPlaceSentShare.shareKind = ShareKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInPlaceSentShare;
        });
    }
}

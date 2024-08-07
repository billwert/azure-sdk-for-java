// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * sharingLink.
 */
@Fluent
public final class MicrosoftGraphSharingLink implements JsonSerializable<MicrosoftGraphSharingLink> {
    /*
     * identity
     */
    private MicrosoftGraphIdentity application;

    /*
     * If true then the user can only use this link to view the item on the web, and cannot use it to download the
     * contents of the item. Only for OneDrive for Business and SharePoint.
     */
    private Boolean preventsDownload;

    /*
     * The scope of the link represented by this permission. Value anonymous indicates the link is usable by anyone,
     * organization indicates the link is only usable for users signed into the same tenant.
     */
    private String scope;

    /*
     * The type of the link created.
     */
    private String type;

    /*
     * For embed links, this property contains the HTML code for an <iframe> element that will embed the item in a
     * webpage.
     */
    private String webHtml;

    /*
     * A URL that opens the item in the browser on the OneDrive website.
     */
    private String webUrl;

    /*
     * sharingLink
     */
    private Map<String, Object> additionalProperties;

    /**
     * Creates an instance of MicrosoftGraphSharingLink class.
     */
    public MicrosoftGraphSharingLink() {
    }

    /**
     * Get the application property: identity.
     * 
     * @return the application value.
     */
    public MicrosoftGraphIdentity application() {
        return this.application;
    }

    /**
     * Set the application property: identity.
     * 
     * @param application the application value to set.
     * @return the MicrosoftGraphSharingLink object itself.
     */
    public MicrosoftGraphSharingLink withApplication(MicrosoftGraphIdentity application) {
        this.application = application;
        return this;
    }

    /**
     * Get the preventsDownload property: If true then the user can only use this link to view the item on the web, and
     * cannot use it to download the contents of the item. Only for OneDrive for Business and SharePoint.
     * 
     * @return the preventsDownload value.
     */
    public Boolean preventsDownload() {
        return this.preventsDownload;
    }

    /**
     * Set the preventsDownload property: If true then the user can only use this link to view the item on the web, and
     * cannot use it to download the contents of the item. Only for OneDrive for Business and SharePoint.
     * 
     * @param preventsDownload the preventsDownload value to set.
     * @return the MicrosoftGraphSharingLink object itself.
     */
    public MicrosoftGraphSharingLink withPreventsDownload(Boolean preventsDownload) {
        this.preventsDownload = preventsDownload;
        return this;
    }

    /**
     * Get the scope property: The scope of the link represented by this permission. Value anonymous indicates the link
     * is usable by anyone, organization indicates the link is only usable for users signed into the same tenant.
     * 
     * @return the scope value.
     */
    public String scope() {
        return this.scope;
    }

    /**
     * Set the scope property: The scope of the link represented by this permission. Value anonymous indicates the link
     * is usable by anyone, organization indicates the link is only usable for users signed into the same tenant.
     * 
     * @param scope the scope value to set.
     * @return the MicrosoftGraphSharingLink object itself.
     */
    public MicrosoftGraphSharingLink withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get the type property: The type of the link created.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of the link created.
     * 
     * @param type the type value to set.
     * @return the MicrosoftGraphSharingLink object itself.
     */
    public MicrosoftGraphSharingLink withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the webHtml property: For embed links, this property contains the HTML code for an &lt;iframe&gt; element
     * that will embed the item in a webpage.
     * 
     * @return the webHtml value.
     */
    public String webHtml() {
        return this.webHtml;
    }

    /**
     * Set the webHtml property: For embed links, this property contains the HTML code for an &lt;iframe&gt; element
     * that will embed the item in a webpage.
     * 
     * @param webHtml the webHtml value to set.
     * @return the MicrosoftGraphSharingLink object itself.
     */
    public MicrosoftGraphSharingLink withWebHtml(String webHtml) {
        this.webHtml = webHtml;
        return this;
    }

    /**
     * Get the webUrl property: A URL that opens the item in the browser on the OneDrive website.
     * 
     * @return the webUrl value.
     */
    public String webUrl() {
        return this.webUrl;
    }

    /**
     * Set the webUrl property: A URL that opens the item in the browser on the OneDrive website.
     * 
     * @param webUrl the webUrl value to set.
     * @return the MicrosoftGraphSharingLink object itself.
     */
    public MicrosoftGraphSharingLink withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * Get the additionalProperties property: sharingLink.
     * 
     * @return the additionalProperties value.
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: sharingLink.
     * 
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSharingLink object itself.
     */
    public MicrosoftGraphSharingLink withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (application() != null) {
            application().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("application", this.application);
        jsonWriter.writeBooleanField("preventsDownload", this.preventsDownload);
        jsonWriter.writeStringField("scope", this.scope);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeStringField("webHtml", this.webHtml);
        jsonWriter.writeStringField("webUrl", this.webUrl);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MicrosoftGraphSharingLink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MicrosoftGraphSharingLink if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MicrosoftGraphSharingLink.
     */
    public static MicrosoftGraphSharingLink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MicrosoftGraphSharingLink deserializedMicrosoftGraphSharingLink = new MicrosoftGraphSharingLink();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("application".equals(fieldName)) {
                    deserializedMicrosoftGraphSharingLink.application = MicrosoftGraphIdentity.fromJson(reader);
                } else if ("preventsDownload".equals(fieldName)) {
                    deserializedMicrosoftGraphSharingLink.preventsDownload = reader.getNullable(JsonReader::getBoolean);
                } else if ("scope".equals(fieldName)) {
                    deserializedMicrosoftGraphSharingLink.scope = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMicrosoftGraphSharingLink.type = reader.getString();
                } else if ("webHtml".equals(fieldName)) {
                    deserializedMicrosoftGraphSharingLink.webHtml = reader.getString();
                } else if ("webUrl".equals(fieldName)) {
                    deserializedMicrosoftGraphSharingLink.webUrl = reader.getString();
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedMicrosoftGraphSharingLink.additionalProperties = additionalProperties;

            return deserializedMicrosoftGraphSharingLink;
        });
    }
}

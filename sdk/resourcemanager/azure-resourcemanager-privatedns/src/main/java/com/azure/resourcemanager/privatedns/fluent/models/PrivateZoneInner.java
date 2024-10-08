// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.privatedns.models.ProvisioningState;
import java.io.IOException;
import java.util.Map;

/**
 * Describes a Private DNS zone.
 */
@Fluent
public final class PrivateZoneInner extends Resource {
    /*
     * The ETag of the zone.
     */
    private String etag;

    /*
     * Properties of the Private DNS zone.
     */
    private PrivateZoneProperties innerProperties;

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
     * Creates an instance of PrivateZoneInner class.
     */
    public PrivateZoneInner() {
    }

    /**
     * Get the etag property: The ETag of the zone.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: The ETag of the zone.
     * 
     * @param etag the etag value to set.
     * @return the PrivateZoneInner object itself.
     */
    public PrivateZoneInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the innerProperties property: Properties of the Private DNS zone.
     * 
     * @return the innerProperties value.
     */
    private PrivateZoneProperties innerProperties() {
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
    public PrivateZoneInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PrivateZoneInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the maxNumberOfRecordSets property: The maximum number of record sets that can be created in this Private DNS
     * zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     * @return the maxNumberOfRecordSets value.
     */
    public Long maxNumberOfRecordSets() {
        return this.innerProperties() == null ? null : this.innerProperties().maxNumberOfRecordSets();
    }

    /**
     * Get the numberOfRecordSets property: The current number of record sets in this Private DNS zone. This is a
     * read-only property and any attempt to set this value will be ignored.
     * 
     * @return the numberOfRecordSets value.
     */
    public Long numberOfRecordSets() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfRecordSets();
    }

    /**
     * Get the maxNumberOfVirtualNetworkLinks property: The maximum number of virtual networks that can be linked to
     * this Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     * @return the maxNumberOfVirtualNetworkLinks value.
     */
    public Long maxNumberOfVirtualNetworkLinks() {
        return this.innerProperties() == null ? null : this.innerProperties().maxNumberOfVirtualNetworkLinks();
    }

    /**
     * Get the numberOfVirtualNetworkLinks property: The current number of virtual networks that are linked to this
     * Private DNS zone. This is a read-only property and any attempt to set this value will be ignored.
     * 
     * @return the numberOfVirtualNetworkLinks value.
     */
    public Long numberOfVirtualNetworkLinks() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfVirtualNetworkLinks();
    }

    /**
     * Get the maxNumberOfVirtualNetworkLinksWithRegistration property: The maximum number of virtual networks that can
     * be linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set
     * this value will be ignored.
     * 
     * @return the maxNumberOfVirtualNetworkLinksWithRegistration value.
     */
    public Long maxNumberOfVirtualNetworkLinksWithRegistration() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().maxNumberOfVirtualNetworkLinksWithRegistration();
    }

    /**
     * Get the numberOfVirtualNetworkLinksWithRegistration property: The current number of virtual networks that are
     * linked to this Private DNS zone with registration enabled. This is a read-only property and any attempt to set
     * this value will be ignored.
     * 
     * @return the numberOfVirtualNetworkLinksWithRegistration value.
     */
    public Long numberOfVirtualNetworkLinksWithRegistration() {
        return this.innerProperties() == null
            ? null
            : this.innerProperties().numberOfVirtualNetworkLinksWithRegistration();
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource. This is a read-only property and any
     * attempt to set this value will be ignored.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the internalId property: Private zone internal Id.
     * 
     * @return the internalId value.
     */
    public String internalId() {
        return this.innerProperties() == null ? null : this.innerProperties().internalId();
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
        if (location() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property location in model PrivateZoneInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PrivateZoneInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("etag", this.etag);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateZoneInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateZoneInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the PrivateZoneInner.
     */
    public static PrivateZoneInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateZoneInner deserializedPrivateZoneInner = new PrivateZoneInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateZoneInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateZoneInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateZoneInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedPrivateZoneInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedPrivateZoneInner.withTags(tags);
                } else if ("etag".equals(fieldName)) {
                    deserializedPrivateZoneInner.etag = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateZoneInner.innerProperties = PrivateZoneProperties.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateZoneInner;
        });
    }
}

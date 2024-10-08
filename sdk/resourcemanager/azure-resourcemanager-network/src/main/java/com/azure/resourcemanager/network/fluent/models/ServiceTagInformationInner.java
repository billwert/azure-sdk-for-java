// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.models.ServiceTagInformationPropertiesFormat;
import java.io.IOException;

/**
 * The service tag information.
 */
@Immutable
public final class ServiceTagInformationInner implements JsonSerializable<ServiceTagInformationInner> {
    /*
     * Properties of the service tag information.
     */
    private ServiceTagInformationPropertiesFormat properties;

    /*
     * The name of service tag.
     */
    private String name;

    /*
     * The ID of service tag.
     */
    private String id;

    /*
     * The iteration number of service tag object for region.
     */
    private String serviceTagChangeNumber;

    /**
     * Creates an instance of ServiceTagInformationInner class.
     */
    public ServiceTagInformationInner() {
    }

    /**
     * Get the properties property: Properties of the service tag information.
     * 
     * @return the properties value.
     */
    public ServiceTagInformationPropertiesFormat properties() {
        return this.properties;
    }

    /**
     * Get the name property: The name of service tag.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: The ID of service tag.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the serviceTagChangeNumber property: The iteration number of service tag object for region.
     * 
     * @return the serviceTagChangeNumber value.
     */
    public String serviceTagChangeNumber() {
        return this.serviceTagChangeNumber;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
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
     * Reads an instance of ServiceTagInformationInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceTagInformationInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceTagInformationInner.
     */
    public static ServiceTagInformationInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceTagInformationInner deserializedServiceTagInformationInner = new ServiceTagInformationInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedServiceTagInformationInner.properties
                        = ServiceTagInformationPropertiesFormat.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedServiceTagInformationInner.name = reader.getString();
                } else if ("id".equals(fieldName)) {
                    deserializedServiceTagInformationInner.id = reader.getString();
                } else if ("serviceTagChangeNumber".equals(fieldName)) {
                    deserializedServiceTagInformationInner.serviceTagChangeNumber = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceTagInformationInner;
        });
    }
}

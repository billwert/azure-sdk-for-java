// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.machinelearning.models.BatchEndpointProperties;
import com.azure.resourcemanager.machinelearning.models.ManagedServiceIdentity;
import com.azure.resourcemanager.machinelearning.models.Sku;
import java.io.IOException;
import java.util.Map;

/**
 * The BatchEndpoint model.
 */
@Fluent
public final class BatchEndpointInner extends Resource {
    /*
     * [Required] Additional attributes of the entity.
     */
    private BatchEndpointProperties properties;

    /*
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type.
     */
    private String kind;

    /*
     * Managed service identity (system assigned and/or user assigned identities)
     */
    private ManagedServiceIdentity identity;

    /*
     * Sku details required for ARM contract for Autoscaling.
     */
    private Sku sku;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of BatchEndpointInner class.
     */
    public BatchEndpointInner() {
    }

    /**
     * Get the properties property: [Required] Additional attributes of the entity.
     * 
     * @return the properties value.
     */
    public BatchEndpointProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: [Required] Additional attributes of the entity.
     * 
     * @param properties the properties value to set.
     * @return the BatchEndpointInner object itself.
     */
    public BatchEndpointInner withProperties(BatchEndpointProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type.
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Metadata used by portal/tooling/etc to render different UX experiences for resources of
     * the same type.
     * 
     * @param kind the kind value to set.
     * @return the BatchEndpointInner object itself.
     */
    public BatchEndpointInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @return the identity value.
     */
    public ManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (system assigned and/or user assigned identities).
     * 
     * @param identity the identity value to set.
     * @return the BatchEndpointInner object itself.
     */
    public BatchEndpointInner withIdentity(ManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the sku property: Sku details required for ARM contract for Autoscaling.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: Sku details required for ARM contract for Autoscaling.
     * 
     * @param sku the sku value to set.
     * @return the BatchEndpointInner object itself.
     */
    public BatchEndpointInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
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
     * {@inheritDoc}
     */
    @Override
    public BatchEndpointInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BatchEndpointInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property properties in model BatchEndpointInner"));
        } else {
            properties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
        if (sku() != null) {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BatchEndpointInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("location", location());
        jsonWriter.writeMapField("tags", tags(), (writer, element) -> writer.writeString(element));
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeStringField("kind", this.kind);
        jsonWriter.writeJsonField("identity", this.identity);
        jsonWriter.writeJsonField("sku", this.sku);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BatchEndpointInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BatchEndpointInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BatchEndpointInner.
     */
    public static BatchEndpointInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BatchEndpointInner deserializedBatchEndpointInner = new BatchEndpointInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedBatchEndpointInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedBatchEndpointInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedBatchEndpointInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedBatchEndpointInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedBatchEndpointInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedBatchEndpointInner.properties = BatchEndpointProperties.fromJson(reader);
                } else if ("kind".equals(fieldName)) {
                    deserializedBatchEndpointInner.kind = reader.getString();
                } else if ("identity".equals(fieldName)) {
                    deserializedBatchEndpointInner.identity = ManagedServiceIdentity.fromJson(reader);
                } else if ("sku".equals(fieldName)) {
                    deserializedBatchEndpointInner.sku = Sku.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedBatchEndpointInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBatchEndpointInner;
        });
    }
}

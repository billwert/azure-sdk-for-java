// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managedapplications.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.managedapplications.models.ApplicationClientDetails;
import com.azure.resourcemanager.managedapplications.models.JitAuthorizationPolicies;
import com.azure.resourcemanager.managedapplications.models.JitRequestState;
import com.azure.resourcemanager.managedapplications.models.JitSchedulingPolicy;
import com.azure.resourcemanager.managedapplications.models.ProvisioningState;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Information about JIT request definition.
 */
@Fluent
public final class JitRequestDefinitionInner extends Resource {
    /*
     * The JIT request properties.
     */
    private JitRequestProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    private SystemData systemData;

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
     * Creates an instance of JitRequestDefinitionInner class.
     */
    public JitRequestDefinitionInner() {
    }

    /**
     * Get the innerProperties property: The JIT request properties.
     * 
     * @return the innerProperties value.
     */
    private JitRequestProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
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
    public JitRequestDefinitionInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JitRequestDefinitionInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the applicationResourceId property: The parent application id.
     * 
     * @return the applicationResourceId value.
     */
    public String applicationResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationResourceId();
    }

    /**
     * Set the applicationResourceId property: The parent application id.
     * 
     * @param applicationResourceId the applicationResourceId value to set.
     * @return the JitRequestDefinitionInner object itself.
     */
    public JitRequestDefinitionInner withApplicationResourceId(String applicationResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JitRequestProperties();
        }
        this.innerProperties().withApplicationResourceId(applicationResourceId);
        return this;
    }

    /**
     * Get the publisherTenantId property: The publisher tenant id.
     * 
     * @return the publisherTenantId value.
     */
    public String publisherTenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().publisherTenantId();
    }

    /**
     * Get the jitAuthorizationPolicies property: The JIT authorization policies.
     * 
     * @return the jitAuthorizationPolicies value.
     */
    public List<JitAuthorizationPolicies> jitAuthorizationPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().jitAuthorizationPolicies();
    }

    /**
     * Set the jitAuthorizationPolicies property: The JIT authorization policies.
     * 
     * @param jitAuthorizationPolicies the jitAuthorizationPolicies value to set.
     * @return the JitRequestDefinitionInner object itself.
     */
    public JitRequestDefinitionInner
        withJitAuthorizationPolicies(List<JitAuthorizationPolicies> jitAuthorizationPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JitRequestProperties();
        }
        this.innerProperties().withJitAuthorizationPolicies(jitAuthorizationPolicies);
        return this;
    }

    /**
     * Get the jitSchedulingPolicy property: The JIT request properties.
     * 
     * @return the jitSchedulingPolicy value.
     */
    public JitSchedulingPolicy jitSchedulingPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().jitSchedulingPolicy();
    }

    /**
     * Set the jitSchedulingPolicy property: The JIT request properties.
     * 
     * @param jitSchedulingPolicy the jitSchedulingPolicy value to set.
     * @return the JitRequestDefinitionInner object itself.
     */
    public JitRequestDefinitionInner withJitSchedulingPolicy(JitSchedulingPolicy jitSchedulingPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new JitRequestProperties();
        }
        this.innerProperties().withJitSchedulingPolicy(jitSchedulingPolicy);
        return this;
    }

    /**
     * Get the provisioningState property: The JIT request provisioning state.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the jitRequestState property: The JIT request state.
     * 
     * @return the jitRequestState value.
     */
    public JitRequestState jitRequestState() {
        return this.innerProperties() == null ? null : this.innerProperties().jitRequestState();
    }

    /**
     * Get the createdBy property: The client entity that created the JIT request.
     * 
     * @return the createdBy value.
     */
    public ApplicationClientDetails createdBy() {
        return this.innerProperties() == null ? null : this.innerProperties().createdBy();
    }

    /**
     * Get the updatedBy property: The client entity that last updated the JIT request.
     * 
     * @return the updatedBy value.
     */
    public ApplicationClientDetails updatedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedBy();
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
     * Reads an instance of JitRequestDefinitionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of JitRequestDefinitionInner if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the JitRequestDefinitionInner.
     */
    public static JitRequestDefinitionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            JitRequestDefinitionInner deserializedJitRequestDefinitionInner = new JitRequestDefinitionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedJitRequestDefinitionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedJitRequestDefinitionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedJitRequestDefinitionInner.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedJitRequestDefinitionInner.withLocation(reader.getString());
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedJitRequestDefinitionInner.withTags(tags);
                } else if ("properties".equals(fieldName)) {
                    deserializedJitRequestDefinitionInner.innerProperties = JitRequestProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedJitRequestDefinitionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedJitRequestDefinitionInner;
        });
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.servicefabric.fluent.models.ClusterVersionDetails;
import java.io.IOException;

/**
 * The result of the Service Fabric runtime versions.
 */
@Fluent
public final class ClusterCodeVersionsResult implements JsonSerializable<ClusterCodeVersionsResult> {
    /*
     * The identification of the result
     */
    private String id;

    /*
     * The name of the result
     */
    private String name;

    /*
     * The result resource type
     */
    private String type;

    /*
     * The detail of the Service Fabric runtime version result
     */
    private ClusterVersionDetails innerProperties;

    /**
     * Creates an instance of ClusterCodeVersionsResult class.
     */
    public ClusterCodeVersionsResult() {
    }

    /**
     * Get the id property: The identification of the result.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The identification of the result.
     * 
     * @param id the id value to set.
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name property: The name of the result.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the result.
     * 
     * @param name the name value to set.
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The result resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The result resource type.
     * 
     * @param type the type value to set.
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the innerProperties property: The detail of the Service Fabric runtime version result.
     * 
     * @return the innerProperties value.
     */
    private ClusterVersionDetails innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the codeVersion property: The Service Fabric runtime version of the cluster.
     * 
     * @return the codeVersion value.
     */
    public String codeVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().codeVersion();
    }

    /**
     * Set the codeVersion property: The Service Fabric runtime version of the cluster.
     * 
     * @param codeVersion the codeVersion value to set.
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withCodeVersion(String codeVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterVersionDetails();
        }
        this.innerProperties().withCodeVersion(codeVersion);
        return this;
    }

    /**
     * Get the supportExpiryUtc property: The date of expiry of support of the version.
     * 
     * @return the supportExpiryUtc value.
     */
    public String supportExpiryUtc() {
        return this.innerProperties() == null ? null : this.innerProperties().supportExpiryUtc();
    }

    /**
     * Set the supportExpiryUtc property: The date of expiry of support of the version.
     * 
     * @param supportExpiryUtc the supportExpiryUtc value to set.
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withSupportExpiryUtc(String supportExpiryUtc) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterVersionDetails();
        }
        this.innerProperties().withSupportExpiryUtc(supportExpiryUtc);
        return this;
    }

    /**
     * Get the environment property: Indicates if this version is for Windows or Linux operating system.
     * 
     * @return the environment value.
     */
    public ClusterEnvironment environment() {
        return this.innerProperties() == null ? null : this.innerProperties().environment();
    }

    /**
     * Set the environment property: Indicates if this version is for Windows or Linux operating system.
     * 
     * @param environment the environment value to set.
     * @return the ClusterCodeVersionsResult object itself.
     */
    public ClusterCodeVersionsResult withEnvironment(ClusterEnvironment environment) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ClusterVersionDetails();
        }
        this.innerProperties().withEnvironment(environment);
        return this;
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterCodeVersionsResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterCodeVersionsResult if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterCodeVersionsResult.
     */
    public static ClusterCodeVersionsResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterCodeVersionsResult deserializedClusterCodeVersionsResult = new ClusterCodeVersionsResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedClusterCodeVersionsResult.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedClusterCodeVersionsResult.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedClusterCodeVersionsResult.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedClusterCodeVersionsResult.innerProperties = ClusterVersionDetails.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterCodeVersionsResult;
        });
    }
}

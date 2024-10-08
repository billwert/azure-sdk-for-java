// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Container App Private Registry.
 */
@Fluent
public final class RegistryCredentials implements JsonSerializable<RegistryCredentials> {
    /*
     * Container Registry Server
     */
    private String server;

    /*
     * Container Registry Username
     */
    private String username;

    /*
     * The name of the Secret that contains the registry login password
     */
    private String passwordSecretRef;

    /**
     * Creates an instance of RegistryCredentials class.
     */
    public RegistryCredentials() {
    }

    /**
     * Get the server property: Container Registry Server.
     * 
     * @return the server value.
     */
    public String server() {
        return this.server;
    }

    /**
     * Set the server property: Container Registry Server.
     * 
     * @param server the server value to set.
     * @return the RegistryCredentials object itself.
     */
    public RegistryCredentials withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username property: Container Registry Username.
     * 
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Container Registry Username.
     * 
     * @param username the username value to set.
     * @return the RegistryCredentials object itself.
     */
    public RegistryCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the passwordSecretRef property: The name of the Secret that contains the registry login password.
     * 
     * @return the passwordSecretRef value.
     */
    public String passwordSecretRef() {
        return this.passwordSecretRef;
    }

    /**
     * Set the passwordSecretRef property: The name of the Secret that contains the registry login password.
     * 
     * @param passwordSecretRef the passwordSecretRef value to set.
     * @return the RegistryCredentials object itself.
     */
    public RegistryCredentials withPasswordSecretRef(String passwordSecretRef) {
        this.passwordSecretRef = passwordSecretRef;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("server", this.server);
        jsonWriter.writeStringField("username", this.username);
        jsonWriter.writeStringField("passwordSecretRef", this.passwordSecretRef);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RegistryCredentials from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RegistryCredentials if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RegistryCredentials.
     */
    public static RegistryCredentials fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RegistryCredentials deserializedRegistryCredentials = new RegistryCredentials();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("server".equals(fieldName)) {
                    deserializedRegistryCredentials.server = reader.getString();
                } else if ("username".equals(fieldName)) {
                    deserializedRegistryCredentials.username = reader.getString();
                } else if ("passwordSecretRef".equals(fieldName)) {
                    deserializedRegistryCredentials.passwordSecretRef = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRegistryCredentials;
        });
    }
}

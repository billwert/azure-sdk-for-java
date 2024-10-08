// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes a script action on a running cluster.
 */
@Fluent
public class RuntimeScriptAction implements JsonSerializable<RuntimeScriptAction> {
    /*
     * The name of the script action.
     */
    private String name;

    /*
     * The URI to the script.
     */
    private String uri;

    /*
     * The parameters for the script
     */
    private String parameters;

    /*
     * The list of roles where script will be executed.
     */
    private List<String> roles;

    /*
     * The application name of the script action, if any.
     */
    private String applicationName;

    /**
     * Creates an instance of RuntimeScriptAction class.
     */
    public RuntimeScriptAction() {
    }

    /**
     * Get the name property: The name of the script action.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the script action.
     * 
     * @param name the name value to set.
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the uri property: The URI to the script.
     * 
     * @return the uri value.
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Set the uri property: The URI to the script.
     * 
     * @param uri the uri value to set.
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * Get the parameters property: The parameters for the script.
     * 
     * @return the parameters value.
     */
    public String parameters() {
        return this.parameters;
    }

    /**
     * Set the parameters property: The parameters for the script.
     * 
     * @param parameters the parameters value to set.
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the roles property: The list of roles where script will be executed.
     * 
     * @return the roles value.
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: The list of roles where script will be executed.
     * 
     * @param roles the roles value to set.
     * @return the RuntimeScriptAction object itself.
     */
    public RuntimeScriptAction withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Get the applicationName property: The application name of the script action, if any.
     * 
     * @return the applicationName value.
     */
    public String applicationName() {
        return this.applicationName;
    }

    /**
     * Set the applicationName property: The application name of the script action, if any.
     * 
     * @param applicationName the applicationName value to set.
     * @return the RuntimeScriptAction object itself.
     */
    RuntimeScriptAction withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model RuntimeScriptAction"));
        }
        if (uri() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property uri in model RuntimeScriptAction"));
        }
        if (roles() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property roles in model RuntimeScriptAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RuntimeScriptAction.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("uri", this.uri);
        jsonWriter.writeArrayField("roles", this.roles, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("parameters", this.parameters);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuntimeScriptAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuntimeScriptAction if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the RuntimeScriptAction.
     */
    public static RuntimeScriptAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuntimeScriptAction deserializedRuntimeScriptAction = new RuntimeScriptAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedRuntimeScriptAction.name = reader.getString();
                } else if ("uri".equals(fieldName)) {
                    deserializedRuntimeScriptAction.uri = reader.getString();
                } else if ("roles".equals(fieldName)) {
                    List<String> roles = reader.readArray(reader1 -> reader1.getString());
                    deserializedRuntimeScriptAction.roles = roles;
                } else if ("parameters".equals(fieldName)) {
                    deserializedRuntimeScriptAction.parameters = reader.getString();
                } else if ("applicationName".equals(fieldName)) {
                    deserializedRuntimeScriptAction.applicationName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuntimeScriptAction;
        });
    }
}

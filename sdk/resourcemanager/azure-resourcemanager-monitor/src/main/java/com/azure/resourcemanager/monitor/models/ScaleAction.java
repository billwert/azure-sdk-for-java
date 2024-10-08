// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * The parameters for the scaling action.
 */
@Fluent
public final class ScaleAction implements JsonSerializable<ScaleAction> {
    /*
     * the scale direction. Whether the scaling action increases or decreases the number of instances.
     */
    private ScaleDirection direction;

    /*
     * the type of action that should occur when the scale rule fires.
     */
    private ScaleType type;

    /*
     * the number of instances that are involved in the scaling action. This value must be 1 or greater. The default
     * value is 1.
     */
    private String value;

    /*
     * the amount of time to wait since the last scaling action before this action occurs. It must be between 1 week and
     * 1 minute in ISO 8601 format.
     */
    private Duration cooldown;

    /**
     * Creates an instance of ScaleAction class.
     */
    public ScaleAction() {
    }

    /**
     * Get the direction property: the scale direction. Whether the scaling action increases or decreases the number of
     * instances.
     * 
     * @return the direction value.
     */
    public ScaleDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction property: the scale direction. Whether the scaling action increases or decreases the number of
     * instances.
     * 
     * @param direction the direction value to set.
     * @return the ScaleAction object itself.
     */
    public ScaleAction withDirection(ScaleDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the type property: the type of action that should occur when the scale rule fires.
     * 
     * @return the type value.
     */
    public ScaleType type() {
        return this.type;
    }

    /**
     * Set the type property: the type of action that should occur when the scale rule fires.
     * 
     * @param type the type value to set.
     * @return the ScaleAction object itself.
     */
    public ScaleAction withType(ScaleType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value property: the number of instances that are involved in the scaling action. This value must be 1 or
     * greater. The default value is 1.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: the number of instances that are involved in the scaling action. This value must be 1 or
     * greater. The default value is 1.
     * 
     * @param value the value value to set.
     * @return the ScaleAction object itself.
     */
    public ScaleAction withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the cooldown property: the amount of time to wait since the last scaling action before this action occurs. It
     * must be between 1 week and 1 minute in ISO 8601 format.
     * 
     * @return the cooldown value.
     */
    public Duration cooldown() {
        return this.cooldown;
    }

    /**
     * Set the cooldown property: the amount of time to wait since the last scaling action before this action occurs. It
     * must be between 1 week and 1 minute in ISO 8601 format.
     * 
     * @param cooldown the cooldown value to set.
     * @return the ScaleAction object itself.
     */
    public ScaleAction withCooldown(Duration cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (direction() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property direction in model ScaleAction"));
        }
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model ScaleAction"));
        }
        if (cooldown() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property cooldown in model ScaleAction"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScaleAction.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("direction", this.direction == null ? null : this.direction.toString());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("cooldown", CoreUtils.durationToStringWithDays(this.cooldown));
        jsonWriter.writeStringField("value", this.value);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScaleAction from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScaleAction if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScaleAction.
     */
    public static ScaleAction fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScaleAction deserializedScaleAction = new ScaleAction();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("direction".equals(fieldName)) {
                    deserializedScaleAction.direction = ScaleDirection.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedScaleAction.type = ScaleType.fromString(reader.getString());
                } else if ("cooldown".equals(fieldName)) {
                    deserializedScaleAction.cooldown
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("value".equals(fieldName)) {
                    deserializedScaleAction.value = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScaleAction;
        });
    }
}

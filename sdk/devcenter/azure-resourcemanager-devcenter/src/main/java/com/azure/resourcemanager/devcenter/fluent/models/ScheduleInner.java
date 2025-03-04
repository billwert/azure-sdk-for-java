// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.devcenter.models.ProvisioningState;
import com.azure.resourcemanager.devcenter.models.ScheduleEnableStatus;
import com.azure.resourcemanager.devcenter.models.ScheduledFrequency;
import com.azure.resourcemanager.devcenter.models.ScheduledType;
import java.io.IOException;
import java.util.Map;

/**
 * Represents a Schedule to execute a task.
 */
@Fluent
public final class ScheduleInner extends ProxyResource {
    /*
     * Properties of a Schedule resource
     */
    private ScheduleProperties innerProperties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
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
     * Creates an instance of ScheduleInner class.
     */
    public ScheduleInner() {
    }

    /**
     * Get the innerProperties property: Properties of a Schedule resource.
     * 
     * @return the innerProperties value.
     */
    private ScheduleProperties innerProperties() {
        return this.innerProperties;
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
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the type property: Supported type this scheduled task represents.
     * 
     * @return the type value.
     */
    public ScheduledType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: Supported type this scheduled task represents.
     * 
     * @param type the type value to set.
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTypePropertiesType(ScheduledType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleProperties();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the frequency property: The frequency of this scheduled task.
     * 
     * @return the frequency value.
     */
    public ScheduledFrequency frequency() {
        return this.innerProperties() == null ? null : this.innerProperties().frequency();
    }

    /**
     * Set the frequency property: The frequency of this scheduled task.
     * 
     * @param frequency the frequency value to set.
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withFrequency(ScheduledFrequency frequency) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleProperties();
        }
        this.innerProperties().withFrequency(frequency);
        return this;
    }

    /**
     * Get the time property: The target time to trigger the action. The format is HH:MM.
     * 
     * @return the time value.
     */
    public String time() {
        return this.innerProperties() == null ? null : this.innerProperties().time();
    }

    /**
     * Set the time property: The target time to trigger the action. The format is HH:MM.
     * 
     * @param time the time value to set.
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTime(String time) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleProperties();
        }
        this.innerProperties().withTime(time);
        return this;
    }

    /**
     * Get the timeZone property: The IANA timezone id at which the schedule should execute.
     * 
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.innerProperties() == null ? null : this.innerProperties().timeZone();
    }

    /**
     * Set the timeZone property: The IANA timezone id at which the schedule should execute.
     * 
     * @param timeZone the timeZone value to set.
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTimeZone(String timeZone) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleProperties();
        }
        this.innerProperties().withTimeZone(timeZone);
        return this;
    }

    /**
     * Get the state property: Indicates whether or not this scheduled task is enabled.
     * 
     * @return the state value.
     */
    public ScheduleEnableStatus state() {
        return this.innerProperties() == null ? null : this.innerProperties().state();
    }

    /**
     * Set the state property: Indicates whether or not this scheduled task is enabled.
     * 
     * @param state the state value to set.
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withState(ScheduleEnableStatus state) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleProperties();
        }
        this.innerProperties().withState(state);
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.innerProperties() == null ? null : this.innerProperties().tags();
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withTags(Map<String, String> tags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleProperties();
        }
        this.innerProperties().withTags(tags);
        return this;
    }

    /**
     * Get the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    public String location() {
        return this.innerProperties() == null ? null : this.innerProperties().location();
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     * 
     * @param location the location value to set.
     * @return the ScheduleInner object itself.
     */
    public ScheduleInner withLocation(String location) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScheduleProperties();
        }
        this.innerProperties().withLocation(location);
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
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScheduleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScheduleInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScheduleInner.
     */
    public static ScheduleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScheduleInner deserializedScheduleInner = new ScheduleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedScheduleInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedScheduleInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedScheduleInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedScheduleInner.innerProperties = ScheduleProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedScheduleInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScheduleInner;
        });
    }
}

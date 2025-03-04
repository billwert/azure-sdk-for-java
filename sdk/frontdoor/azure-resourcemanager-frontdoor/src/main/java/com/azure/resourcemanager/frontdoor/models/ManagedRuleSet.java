// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines a managed rule set.
 */
@Fluent
public final class ManagedRuleSet implements JsonSerializable<ManagedRuleSet> {
    /*
     * Defines the rule set type to use.
     */
    private String ruleSetType;

    /*
     * Defines the version of the rule set to use.
     */
    private String ruleSetVersion;

    /*
     * Defines the rule set action.
     */
    private ManagedRuleSetActionType ruleSetAction;

    /*
     * Describes the exclusions that are applied to all rules in the set.
     */
    private List<ManagedRuleExclusion> exclusions;

    /*
     * Defines the rule group overrides to apply to the rule set.
     */
    private List<ManagedRuleGroupOverride> ruleGroupOverrides;

    /**
     * Creates an instance of ManagedRuleSet class.
     */
    public ManagedRuleSet() {
    }

    /**
     * Get the ruleSetType property: Defines the rule set type to use.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the ruleSetType property: Defines the rule set type to use.
     * 
     * @param ruleSetType the ruleSetType value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the ruleSetVersion property: Defines the version of the rule set to use.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the ruleSetVersion property: Defines the version of the rule set to use.
     * 
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get the ruleSetAction property: Defines the rule set action.
     * 
     * @return the ruleSetAction value.
     */
    public ManagedRuleSetActionType ruleSetAction() {
        return this.ruleSetAction;
    }

    /**
     * Set the ruleSetAction property: Defines the rule set action.
     * 
     * @param ruleSetAction the ruleSetAction value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleSetAction(ManagedRuleSetActionType ruleSetAction) {
        this.ruleSetAction = ruleSetAction;
        return this;
    }

    /**
     * Get the exclusions property: Describes the exclusions that are applied to all rules in the set.
     * 
     * @return the exclusions value.
     */
    public List<ManagedRuleExclusion> exclusions() {
        return this.exclusions;
    }

    /**
     * Set the exclusions property: Describes the exclusions that are applied to all rules in the set.
     * 
     * @param exclusions the exclusions value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withExclusions(List<ManagedRuleExclusion> exclusions) {
        this.exclusions = exclusions;
        return this;
    }

    /**
     * Get the ruleGroupOverrides property: Defines the rule group overrides to apply to the rule set.
     * 
     * @return the ruleGroupOverrides value.
     */
    public List<ManagedRuleGroupOverride> ruleGroupOverrides() {
        return this.ruleGroupOverrides;
    }

    /**
     * Set the ruleGroupOverrides property: Defines the rule group overrides to apply to the rule set.
     * 
     * @param ruleGroupOverrides the ruleGroupOverrides value to set.
     * @return the ManagedRuleSet object itself.
     */
    public ManagedRuleSet withRuleGroupOverrides(List<ManagedRuleGroupOverride> ruleGroupOverrides) {
        this.ruleGroupOverrides = ruleGroupOverrides;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleSetType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property ruleSetType in model ManagedRuleSet"));
        }
        if (ruleSetVersion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property ruleSetVersion in model ManagedRuleSet"));
        }
        if (exclusions() != null) {
            exclusions().forEach(e -> e.validate());
        }
        if (ruleGroupOverrides() != null) {
            ruleGroupOverrides().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ManagedRuleSet.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ruleSetType", this.ruleSetType);
        jsonWriter.writeStringField("ruleSetVersion", this.ruleSetVersion);
        jsonWriter.writeStringField("ruleSetAction", this.ruleSetAction == null ? null : this.ruleSetAction.toString());
        jsonWriter.writeArrayField("exclusions", this.exclusions, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("ruleGroupOverrides", this.ruleGroupOverrides,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagedRuleSet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagedRuleSet if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ManagedRuleSet.
     */
    public static ManagedRuleSet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagedRuleSet deserializedManagedRuleSet = new ManagedRuleSet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ruleSetType".equals(fieldName)) {
                    deserializedManagedRuleSet.ruleSetType = reader.getString();
                } else if ("ruleSetVersion".equals(fieldName)) {
                    deserializedManagedRuleSet.ruleSetVersion = reader.getString();
                } else if ("ruleSetAction".equals(fieldName)) {
                    deserializedManagedRuleSet.ruleSetAction = ManagedRuleSetActionType.fromString(reader.getString());
                } else if ("exclusions".equals(fieldName)) {
                    List<ManagedRuleExclusion> exclusions
                        = reader.readArray(reader1 -> ManagedRuleExclusion.fromJson(reader1));
                    deserializedManagedRuleSet.exclusions = exclusions;
                } else if ("ruleGroupOverrides".equals(fieldName)) {
                    List<ManagedRuleGroupOverride> ruleGroupOverrides
                        = reader.readArray(reader1 -> ManagedRuleGroupOverride.fromJson(reader1));
                    deserializedManagedRuleSet.ruleGroupOverrides = ruleGroupOverrides;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagedRuleSet;
        });
    }
}

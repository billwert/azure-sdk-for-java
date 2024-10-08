// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.models.MetricTrigger;
import com.azure.resourcemanager.monitor.models.ScaleAction;
import java.io.IOException;

/**
 * A rule that provide the triggers and parameters for the scaling action.
 */
@Fluent
public final class ScaleRuleInner implements JsonSerializable<ScaleRuleInner> {
    /*
     * the trigger that results in a scaling action.
     */
    private MetricTrigger metricTrigger;

    /*
     * the parameters for the scaling action.
     */
    private ScaleAction scaleAction;

    /**
     * Creates an instance of ScaleRuleInner class.
     */
    public ScaleRuleInner() {
    }

    /**
     * Get the metricTrigger property: the trigger that results in a scaling action.
     * 
     * @return the metricTrigger value.
     */
    public MetricTrigger metricTrigger() {
        return this.metricTrigger;
    }

    /**
     * Set the metricTrigger property: the trigger that results in a scaling action.
     * 
     * @param metricTrigger the metricTrigger value to set.
     * @return the ScaleRuleInner object itself.
     */
    public ScaleRuleInner withMetricTrigger(MetricTrigger metricTrigger) {
        this.metricTrigger = metricTrigger;
        return this;
    }

    /**
     * Get the scaleAction property: the parameters for the scaling action.
     * 
     * @return the scaleAction value.
     */
    public ScaleAction scaleAction() {
        return this.scaleAction;
    }

    /**
     * Set the scaleAction property: the parameters for the scaling action.
     * 
     * @param scaleAction the scaleAction value to set.
     * @return the ScaleRuleInner object itself.
     */
    public ScaleRuleInner withScaleAction(ScaleAction scaleAction) {
        this.scaleAction = scaleAction;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metricTrigger() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property metricTrigger in model ScaleRuleInner"));
        } else {
            metricTrigger().validate();
        }
        if (scaleAction() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property scaleAction in model ScaleRuleInner"));
        } else {
            scaleAction().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ScaleRuleInner.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("metricTrigger", this.metricTrigger);
        jsonWriter.writeJsonField("scaleAction", this.scaleAction);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ScaleRuleInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ScaleRuleInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ScaleRuleInner.
     */
    public static ScaleRuleInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ScaleRuleInner deserializedScaleRuleInner = new ScaleRuleInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("metricTrigger".equals(fieldName)) {
                    deserializedScaleRuleInner.metricTrigger = MetricTrigger.fromJson(reader);
                } else if ("scaleAction".equals(fieldName)) {
                    deserializedScaleRuleInner.scaleAction = ScaleAction.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedScaleRuleInner;
        });
    }
}

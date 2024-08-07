// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * List of availability zones shared by the subscriptions.
 */
@Fluent
public final class AvailabilityZonePeers implements JsonSerializable<AvailabilityZonePeers> {
    /*
     * The availabilityZone.
     */
    private String availabilityZone;

    /*
     * Details of shared availability zone.
     */
    private List<Peers> peers;

    /**
     * Creates an instance of AvailabilityZonePeers class.
     */
    public AvailabilityZonePeers() {
    }

    /**
     * Get the availabilityZone property: The availabilityZone.
     * 
     * @return the availabilityZone value.
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }

    /**
     * Get the peers property: Details of shared availability zone.
     * 
     * @return the peers value.
     */
    public List<Peers> peers() {
        return this.peers;
    }

    /**
     * Set the peers property: Details of shared availability zone.
     * 
     * @param peers the peers value to set.
     * @return the AvailabilityZonePeers object itself.
     */
    public AvailabilityZonePeers withPeers(List<Peers> peers) {
        this.peers = peers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (peers() != null) {
            peers().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("peers", this.peers, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailabilityZonePeers from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailabilityZonePeers if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailabilityZonePeers.
     */
    public static AvailabilityZonePeers fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailabilityZonePeers deserializedAvailabilityZonePeers = new AvailabilityZonePeers();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("availabilityZone".equals(fieldName)) {
                    deserializedAvailabilityZonePeers.availabilityZone = reader.getString();
                } else if ("peers".equals(fieldName)) {
                    List<Peers> peers = reader.readArray(reader1 -> Peers.fromJson(reader1));
                    deserializedAvailabilityZonePeers.peers = peers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailabilityZonePeers;
        });
    }
}

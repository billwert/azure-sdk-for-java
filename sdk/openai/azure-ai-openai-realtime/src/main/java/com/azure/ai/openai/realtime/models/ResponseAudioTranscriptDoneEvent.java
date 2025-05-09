// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.realtime.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Returned when the model-generated transcription of audio output is done streaming. Also emitted when a Response is
 * interrupted, incomplete, or cancelled.
 */
@Immutable
public final class ResponseAudioTranscriptDoneEvent extends RealtimeServerEvent {

    /*
     * The type property.
     */
    @Generated
    private RealtimeServerEventType type = RealtimeServerEventType.RESPONSE_AUDIO_TRANSCRIPT_DONE;

    /*
     * The ID of the response.
     */
    @Generated
    private final String responseId;

    /*
     * The ID of the item.
     */
    @Generated
    private final String itemId;

    /*
     * The index of the output item in the response.
     */
    @Generated
    private final int outputIndex;

    /*
     * The index of the content part in the item's content array.
     */
    @Generated
    private final int contentIndex;

    /*
     * The final transcript of the audio.
     */
    @Generated
    private final String transcript;

    /**
     * Creates an instance of ResponseAudioTranscriptDoneEvent class.
     *
     * @param eventId the eventId value to set.
     * @param responseId the responseId value to set.
     * @param itemId the itemId value to set.
     * @param outputIndex the outputIndex value to set.
     * @param contentIndex the contentIndex value to set.
     * @param transcript the transcript value to set.
     */
    @Generated
    private ResponseAudioTranscriptDoneEvent(String eventId, String responseId, String itemId, int outputIndex,
        int contentIndex, String transcript) {
        super(eventId);
        this.responseId = responseId;
        this.itemId = itemId;
        this.outputIndex = outputIndex;
        this.contentIndex = contentIndex;
        this.transcript = transcript;
    }

    /**
     * Get the type property: The type property.
     *
     * @return the type value.
     */
    @Generated
    @Override
    public RealtimeServerEventType getType() {
        return this.type;
    }

    /**
     * Get the responseId property: The ID of the response.
     *
     * @return the responseId value.
     */
    @Generated
    public String getResponseId() {
        return this.responseId;
    }

    /**
     * Get the itemId property: The ID of the item.
     *
     * @return the itemId value.
     */
    @Generated
    public String getItemId() {
        return this.itemId;
    }

    /**
     * Get the outputIndex property: The index of the output item in the response.
     *
     * @return the outputIndex value.
     */
    @Generated
    public int getOutputIndex() {
        return this.outputIndex;
    }

    /**
     * Get the contentIndex property: The index of the content part in the item's content array.
     *
     * @return the contentIndex value.
     */
    @Generated
    public int getContentIndex() {
        return this.contentIndex;
    }

    /**
     * Get the transcript property: The final transcript of the audio.
     *
     * @return the transcript value.
     */
    @Generated
    public String getTranscript() {
        return this.transcript;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("event_id", getEventId());
        jsonWriter.writeStringField("response_id", this.responseId);
        jsonWriter.writeStringField("item_id", this.itemId);
        jsonWriter.writeIntField("output_index", this.outputIndex);
        jsonWriter.writeIntField("content_index", this.contentIndex);
        jsonWriter.writeStringField("transcript", this.transcript);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResponseAudioTranscriptDoneEvent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResponseAudioTranscriptDoneEvent if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResponseAudioTranscriptDoneEvent.
     */
    @Generated
    public static ResponseAudioTranscriptDoneEvent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String eventId = null;
            String responseId = null;
            String itemId = null;
            int outputIndex = 0;
            int contentIndex = 0;
            String transcript = null;
            RealtimeServerEventType type = RealtimeServerEventType.RESPONSE_AUDIO_TRANSCRIPT_DONE;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("event_id".equals(fieldName)) {
                    eventId = reader.getString();
                } else if ("response_id".equals(fieldName)) {
                    responseId = reader.getString();
                } else if ("item_id".equals(fieldName)) {
                    itemId = reader.getString();
                } else if ("output_index".equals(fieldName)) {
                    outputIndex = reader.getInt();
                } else if ("content_index".equals(fieldName)) {
                    contentIndex = reader.getInt();
                } else if ("transcript".equals(fieldName)) {
                    transcript = reader.getString();
                } else if ("type".equals(fieldName)) {
                    type = RealtimeServerEventType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            ResponseAudioTranscriptDoneEvent deserializedResponseAudioTranscriptDoneEvent
                = new ResponseAudioTranscriptDoneEvent(eventId, responseId, itemId, outputIndex, contentIndex,
                    transcript);
            deserializedResponseAudioTranscriptDoneEvent.type = type;
            return deserializedResponseAudioTranscriptDoneEvent;
        });
    }
}

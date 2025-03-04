// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.UUID;

/**
 * Information about the partner.
 */
@Fluent
public final class Partner implements JsonSerializable<Partner> {
    /*
     * The immutableId of the corresponding partner registration.
     */
    private UUID partnerRegistrationImmutableId;

    /*
     * The partner name.
     */
    private String partnerName;

    /*
     * Expiration time of the partner authorization. If this timer expires, any request from this partner to create,
     * update or delete resources in subscriber's
     * context will fail. If specified, the allowed values are between 1 to the value of
     * defaultMaximumExpirationTimeInDays specified in PartnerConfiguration.
     * If not specified, the default value will be the value of defaultMaximumExpirationTimeInDays specified in
     * PartnerConfiguration or 7 if this value is not specified.
     */
    private OffsetDateTime authorizationExpirationTimeInUtc;

    /**
     * Creates an instance of Partner class.
     */
    public Partner() {
    }

    /**
     * Get the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     * 
     * @return the partnerRegistrationImmutableId value.
     */
    public UUID partnerRegistrationImmutableId() {
        return this.partnerRegistrationImmutableId;
    }

    /**
     * Set the partnerRegistrationImmutableId property: The immutableId of the corresponding partner registration.
     * 
     * @param partnerRegistrationImmutableId the partnerRegistrationImmutableId value to set.
     * @return the Partner object itself.
     */
    public Partner withPartnerRegistrationImmutableId(UUID partnerRegistrationImmutableId) {
        this.partnerRegistrationImmutableId = partnerRegistrationImmutableId;
        return this;
    }

    /**
     * Get the partnerName property: The partner name.
     * 
     * @return the partnerName value.
     */
    public String partnerName() {
        return this.partnerName;
    }

    /**
     * Set the partnerName property: The partner name.
     * 
     * @param partnerName the partnerName value to set.
     * @return the Partner object itself.
     */
    public Partner withPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }

    /**
     * Get the authorizationExpirationTimeInUtc property: Expiration time of the partner authorization. If this timer
     * expires, any request from this partner to create, update or delete resources in subscriber's
     * context will fail. If specified, the allowed values are between 1 to the value of
     * defaultMaximumExpirationTimeInDays specified in PartnerConfiguration.
     * If not specified, the default value will be the value of defaultMaximumExpirationTimeInDays specified in
     * PartnerConfiguration or 7 if this value is not specified.
     * 
     * @return the authorizationExpirationTimeInUtc value.
     */
    public OffsetDateTime authorizationExpirationTimeInUtc() {
        return this.authorizationExpirationTimeInUtc;
    }

    /**
     * Set the authorizationExpirationTimeInUtc property: Expiration time of the partner authorization. If this timer
     * expires, any request from this partner to create, update or delete resources in subscriber's
     * context will fail. If specified, the allowed values are between 1 to the value of
     * defaultMaximumExpirationTimeInDays specified in PartnerConfiguration.
     * If not specified, the default value will be the value of defaultMaximumExpirationTimeInDays specified in
     * PartnerConfiguration or 7 if this value is not specified.
     * 
     * @param authorizationExpirationTimeInUtc the authorizationExpirationTimeInUtc value to set.
     * @return the Partner object itself.
     */
    public Partner withAuthorizationExpirationTimeInUtc(OffsetDateTime authorizationExpirationTimeInUtc) {
        this.authorizationExpirationTimeInUtc = authorizationExpirationTimeInUtc;
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
        jsonWriter.writeStringField("partnerRegistrationImmutableId",
            Objects.toString(this.partnerRegistrationImmutableId, null));
        jsonWriter.writeStringField("partnerName", this.partnerName);
        jsonWriter.writeStringField("authorizationExpirationTimeInUtc",
            this.authorizationExpirationTimeInUtc == null
                ? null
                : DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(this.authorizationExpirationTimeInUtc));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Partner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Partner if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Partner.
     */
    public static Partner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Partner deserializedPartner = new Partner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("partnerRegistrationImmutableId".equals(fieldName)) {
                    deserializedPartner.partnerRegistrationImmutableId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("partnerName".equals(fieldName)) {
                    deserializedPartner.partnerName = reader.getString();
                } else if ("authorizationExpirationTimeInUtc".equals(fieldName)) {
                    deserializedPartner.authorizationExpirationTimeInUtc = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPartner;
        });
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * A FTP server Linked Service.
 */
@Fluent
public class FtpServerLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    private String type = "FtpServer";

    /*
     * Host name of the FTP server. Type: string (or Expression with resultType string).
     */
    private Object host;

    /*
     * The TCP port number that the FTP server uses to listen for client connections. Default value is 21. Type: integer
     * (or Expression with resultType integer), minimum: 0.
     */
    private Object port;

    /*
     * The authentication type to be used to connect to the FTP server.
     */
    private FtpAuthenticationType authenticationType;

    /*
     * Username to logon the FTP server. Type: string (or Expression with resultType string).
     */
    private Object userName;

    /*
     * Password to logon the FTP server.
     */
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    private Object encryptedCredential;

    /*
     * If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type: boolean (or Expression with
     * resultType boolean).
     */
    private Object enableSsl;

    /*
     * If true, validate the FTP server SSL certificate when connect over SSL/TLS channel. Default value is true. Type:
     * boolean (or Expression with resultType boolean).
     */
    private Object enableServerCertificateValidation;

    /**
     * Creates an instance of FtpServerLinkedService class.
     */
    public FtpServerLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String getType() {
        return this.type;
    }

    /**
     * Get the host property: Host name of the FTP server. Type: string (or Expression with resultType string).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: Host name of the FTP server. Type: string (or Expression with resultType string).
     * 
     * @param host the host value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the FTP server uses to listen for client connections. Default
     * value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the FTP server uses to listen for client connections. Default
     * value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param port the port value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the FTP server.
     * 
     * @return the authenticationType value.
     */
    public FtpAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the FTP server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setAuthenticationType(FtpAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the userName property: Username to logon the FTP server. Type: string (or Expression with resultType string).
     * 
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: Username to logon the FTP server. Type: string (or Expression with resultType string).
     * 
     * @param userName the userName value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password to logon the FTP server.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to logon the FTP server.
     * 
     * @param password the password value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the enableSsl property: If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the enableSsl value.
     */
    public Object getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the enableServerCertificateValidation property: If true, validate the FTP server SSL certificate when connect
     * over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableServerCertificateValidation value.
     */
    public Object getEnableServerCertificateValidation() {
        return this.enableServerCertificateValidation;
    }

    /**
     * Set the enableServerCertificateValidation property: If true, validate the FTP server SSL certificate when connect
     * over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setVersion(String version) {
        super.setVersion(version);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("version", getVersion());
        jsonWriter.writeJsonField("connectVia", getConnectVia());
        jsonWriter.writeStringField("description", getDescription());
        jsonWriter.writeMapField("parameters", getParameters(), (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("annotations", getAnnotations(), (writer, element) -> writer.writeUntyped(element));
        jsonWriter.writeStringField("type", this.type);
        if (host != null
            || port != null
            || authenticationType != null
            || userName != null
            || password != null
            || encryptedCredential != null
            || enableSsl != null
            || enableServerCertificateValidation != null) {
            jsonWriter.writeStartObject("typeProperties");
            jsonWriter.writeUntypedField("host", this.host);
            jsonWriter.writeUntypedField("port", this.port);
            jsonWriter.writeStringField("authenticationType",
                this.authenticationType == null ? null : this.authenticationType.toString());
            jsonWriter.writeUntypedField("userName", this.userName);
            jsonWriter.writeJsonField("password", this.password);
            jsonWriter.writeUntypedField("encryptedCredential", this.encryptedCredential);
            jsonWriter.writeUntypedField("enableSsl", this.enableSsl);
            jsonWriter.writeUntypedField("enableServerCertificateValidation", this.enableServerCertificateValidation);
            jsonWriter.writeEndObject();
        }
        if (getAdditionalProperties() != null) {
            for (Map.Entry<String, Object> additionalProperty : getAdditionalProperties().entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FtpServerLinkedService from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FtpServerLinkedService if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FtpServerLinkedService.
     */
    public static FtpServerLinkedService fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FtpServerLinkedService deserializedFtpServerLinkedService = new FtpServerLinkedService();
            Map<String, Object> additionalProperties = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("version".equals(fieldName)) {
                    deserializedFtpServerLinkedService.setVersion(reader.getString());
                } else if ("connectVia".equals(fieldName)) {
                    deserializedFtpServerLinkedService.setConnectVia(IntegrationRuntimeReference.fromJson(reader));
                } else if ("description".equals(fieldName)) {
                    deserializedFtpServerLinkedService.setDescription(reader.getString());
                } else if ("parameters".equals(fieldName)) {
                    Map<String, ParameterSpecification> parameters
                        = reader.readMap(reader1 -> ParameterSpecification.fromJson(reader1));
                    deserializedFtpServerLinkedService.setParameters(parameters);
                } else if ("annotations".equals(fieldName)) {
                    List<Object> annotations = reader.readArray(reader1 -> reader1.readUntyped());
                    deserializedFtpServerLinkedService.setAnnotations(annotations);
                } else if ("type".equals(fieldName)) {
                    deserializedFtpServerLinkedService.type = reader.getString();
                } else if ("typeProperties".equals(fieldName) && reader.currentToken() == JsonToken.START_OBJECT) {
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("host".equals(fieldName)) {
                            deserializedFtpServerLinkedService.host = reader.readUntyped();
                        } else if ("port".equals(fieldName)) {
                            deserializedFtpServerLinkedService.port = reader.readUntyped();
                        } else if ("authenticationType".equals(fieldName)) {
                            deserializedFtpServerLinkedService.authenticationType
                                = FtpAuthenticationType.fromString(reader.getString());
                        } else if ("userName".equals(fieldName)) {
                            deserializedFtpServerLinkedService.userName = reader.readUntyped();
                        } else if ("password".equals(fieldName)) {
                            deserializedFtpServerLinkedService.password = SecretBase.fromJson(reader);
                        } else if ("encryptedCredential".equals(fieldName)) {
                            deserializedFtpServerLinkedService.encryptedCredential = reader.readUntyped();
                        } else if ("enableSsl".equals(fieldName)) {
                            deserializedFtpServerLinkedService.enableSsl = reader.readUntyped();
                        } else if ("enableServerCertificateValidation".equals(fieldName)) {
                            deserializedFtpServerLinkedService.enableServerCertificateValidation = reader.readUntyped();
                        } else {
                            reader.skipChildren();
                        }
                    }
                } else {
                    if (additionalProperties == null) {
                        additionalProperties = new LinkedHashMap<>();
                    }

                    additionalProperties.put(fieldName, reader.readUntyped());
                }
            }
            deserializedFtpServerLinkedService.setAdditionalProperties(additionalProperties);

            return deserializedFtpServerLinkedService;
        });
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * Optional parameters for Get Task File Properties operation.
 */
@Fluent
public final class GetBatchTaskFilePropertiesOptions {

    /*
     * The maximum time that the server can spend processing the request, in seconds. The default is 30 seconds. If the
     * value is larger than 30, the default will be used instead.".
     */
    @Generated
    private Integer timeOutInSeconds;

    /*
     * A timestamp indicating the last modified time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * been modified since the specified time.
     */
    @Generated
    private DateTimeRfc1123 ifModifiedSince;

    /*
     * A timestamp indicating the last modified time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * not been modified since the specified time.
     */
    @Generated
    private DateTimeRfc1123 ifUnmodifiedSince;

    /**
     * Creates an instance of GetBatchTaskFilePropertiesOptions class.
     */
    @Generated
    public GetBatchTaskFilePropertiesOptions() {
    }

    /**
     * Get the timeOutInSeconds property: The maximum time that the server can spend processing the request, in seconds.
     * The default is 30 seconds. If the value is larger than 30, the default will be used instead.".
     *
     * @return the timeOutInSeconds value.
     */
    @Generated
    public Integer getTimeOutInSeconds() {
        return this.timeOutInSeconds;
    }

    /**
     * Set the timeOutInSeconds property: The maximum time that the server can spend processing the request, in seconds.
     * The default is 30 seconds. If the value is larger than 30, the default will be used instead.".
     *
     * @param timeOutInSeconds the timeOutInSeconds value to set.
     * @return the GetBatchTaskFilePropertiesOptions object itself.
     */
    @Generated
    public GetBatchTaskFilePropertiesOptions setTimeOutInSeconds(Integer timeOutInSeconds) {
        this.timeOutInSeconds = timeOutInSeconds;
        return this;
    }

    /**
     * Get the ifModifiedSince property: A timestamp indicating the last modified time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * been modified since the specified time.
     *
     * @return the ifModifiedSince value.
     */
    @Generated
    public OffsetDateTime getIfModifiedSince() {
        if (this.ifModifiedSince == null) {
            return null;
        }
        return this.ifModifiedSince.getDateTime();
    }

    /**
     * Set the ifModifiedSince property: A timestamp indicating the last modified time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * been modified since the specified time.
     *
     * @param ifModifiedSince the ifModifiedSince value to set.
     * @return the GetBatchTaskFilePropertiesOptions object itself.
     */
    @Generated
    public GetBatchTaskFilePropertiesOptions setIfModifiedSince(OffsetDateTime ifModifiedSince) {
        if (ifModifiedSince == null) {
            this.ifModifiedSince = null;
        } else {
            this.ifModifiedSince = new DateTimeRfc1123(ifModifiedSince);
        }
        return this;
    }

    /**
     * Get the ifUnmodifiedSince property: A timestamp indicating the last modified time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * not been modified since the specified time.
     *
     * @return the ifUnmodifiedSince value.
     */
    @Generated
    public OffsetDateTime getIfUnmodifiedSince() {
        if (this.ifUnmodifiedSince == null) {
            return null;
        }
        return this.ifUnmodifiedSince.getDateTime();
    }

    /**
     * Set the ifUnmodifiedSince property: A timestamp indicating the last modified time of the resource known to the
     * client. The operation will be performed only if the resource on the service has
     * not been modified since the specified time.
     *
     * @param ifUnmodifiedSince the ifUnmodifiedSince value to set.
     * @return the GetBatchTaskFilePropertiesOptions object itself.
     */
    @Generated
    public GetBatchTaskFilePropertiesOptions setIfUnmodifiedSince(OffsetDateTime ifUnmodifiedSince) {
        if (ifUnmodifiedSince == null) {
            this.ifUnmodifiedSince = null;
        } else {
            this.ifUnmodifiedSince = new DateTimeRfc1123(ifUnmodifiedSince);
        }
        return this;
    }
}

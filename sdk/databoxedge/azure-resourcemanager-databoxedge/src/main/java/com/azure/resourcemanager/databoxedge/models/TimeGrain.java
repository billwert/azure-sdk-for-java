// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for TimeGrain.
 */
public final class TimeGrain extends ExpandableStringEnum<TimeGrain> {
    /**
     * Static value PT1M for TimeGrain.
     */
    public static final TimeGrain PT1M = fromString("PT1M");

    /**
     * Static value PT5M for TimeGrain.
     */
    public static final TimeGrain PT5M = fromString("PT5M");

    /**
     * Static value PT15M for TimeGrain.
     */
    public static final TimeGrain PT15M = fromString("PT15M");

    /**
     * Static value PT30M for TimeGrain.
     */
    public static final TimeGrain PT30M = fromString("PT30M");

    /**
     * Static value PT1H for TimeGrain.
     */
    public static final TimeGrain PT1H = fromString("PT1H");

    /**
     * Static value PT6H for TimeGrain.
     */
    public static final TimeGrain PT6H = fromString("PT6H");

    /**
     * Static value PT12H for TimeGrain.
     */
    public static final TimeGrain PT12H = fromString("PT12H");

    /**
     * Static value PT1D for TimeGrain.
     */
    public static final TimeGrain PT1D = fromString("PT1D");

    /**
     * Creates a new instance of TimeGrain value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TimeGrain() {
    }

    /**
     * Creates or finds a TimeGrain from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding TimeGrain.
     */
    public static TimeGrain fromString(String name) {
        return fromString(name, TimeGrain.class);
    }

    /**
     * Gets known TimeGrain values.
     * 
     * @return known TimeGrain values.
     */
    public static Collection<TimeGrain> values() {
        return values(TimeGrain.class);
    }
}

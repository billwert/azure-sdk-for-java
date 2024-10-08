// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * The mode of operation for computing feature importance.
 */
public final class FeatureImportanceMode extends ExpandableStringEnum<FeatureImportanceMode> {
    /**
     * Static value Disabled for FeatureImportanceMode.
     */
    public static final FeatureImportanceMode DISABLED = fromString("Disabled");

    /**
     * Static value Enabled for FeatureImportanceMode.
     */
    public static final FeatureImportanceMode ENABLED = fromString("Enabled");

    /**
     * Creates a new instance of FeatureImportanceMode value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public FeatureImportanceMode() {
    }

    /**
     * Creates or finds a FeatureImportanceMode from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding FeatureImportanceMode.
     */
    public static FeatureImportanceMode fromString(String name) {
        return fromString(name, FeatureImportanceMode.class);
    }

    /**
     * Gets known FeatureImportanceMode values.
     * 
     * @return known FeatureImportanceMode values.
     */
    public static Collection<FeatureImportanceMode> values() {
        return values(FeatureImportanceMode.class);
    }
}

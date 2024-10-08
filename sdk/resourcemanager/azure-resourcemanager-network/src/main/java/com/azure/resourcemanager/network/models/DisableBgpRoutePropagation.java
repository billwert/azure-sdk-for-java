// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Determines whether BGP route propagation is enabled. Defaults to true.
 */
public final class DisableBgpRoutePropagation extends ExpandableStringEnum<DisableBgpRoutePropagation> {
    /**
     * Static value False for DisableBgpRoutePropagation.
     */
    public static final DisableBgpRoutePropagation FALSE = fromString("False");

    /**
     * Static value True for DisableBgpRoutePropagation.
     */
    public static final DisableBgpRoutePropagation TRUE = fromString("True");

    /**
     * Creates a new instance of DisableBgpRoutePropagation value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public DisableBgpRoutePropagation() {
    }

    /**
     * Creates or finds a DisableBgpRoutePropagation from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding DisableBgpRoutePropagation.
     */
    public static DisableBgpRoutePropagation fromString(String name) {
        return fromString(name, DisableBgpRoutePropagation.class);
    }

    /**
     * Gets known DisableBgpRoutePropagation values.
     * 
     * @return known DisableBgpRoutePropagation values.
     */
    public static Collection<DisableBgpRoutePropagation> values() {
        return values(DisableBgpRoutePropagation.class);
    }
}

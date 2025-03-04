// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callautomation.implementation.accesshelpers;

import com.azure.communication.callautomation.implementation.models.UnmuteParticipantsResponseInternal;
import com.azure.communication.callautomation.models.UnmuteParticipantResult;

/**
 * Helper class to access private values of {@link UnmuteParticipantResult} across package boundaries.
 */
public final class UnmuteParticipantsResponseConstructorProxy {
    private static UnmuteParticipantsResponseConstructorAccessor accessor;

    private UnmuteParticipantsResponseConstructorProxy() {
    }

    /**
     * Type defining the methods to set the non-public properties of a {@link UnmuteParticipantsResponseConstructorAccessor}
     * instance.
     */
    public interface UnmuteParticipantsResponseConstructorAccessor {
        /**
         * Creates a new instance of {@link UnmuteParticipantResult} backed by an internal instance of
         * {@link UnmuteParticipantsResponseInternal}.
         *
         * @param internalResponse The internal response.
         * @return A new instance of {@link UnmuteParticipantResult}.
         */
        UnmuteParticipantResult create(UnmuteParticipantsResponseInternal internalResponse);
    }

    /**
     * The method called from {@link UnmuteParticipantResult} to set it's accessor.
     *
     * @param accessor The accessor.
     */
    public static void setAccessor(final UnmuteParticipantsResponseConstructorAccessor accessor) {
        UnmuteParticipantsResponseConstructorProxy.accessor = accessor;
    }

    /**
     * Creates a new instance of {@link UnmuteParticipantResult} backed by an internal instance of
     * {@link UnmuteParticipantsResponseInternal}.
     *
     * @param internalResponse The internal response.
     * @return A new instance of {@link UnmuteParticipantResult}.
     */
    public static UnmuteParticipantResult create(UnmuteParticipantsResponseInternal internalResponse) {
        // This looks odd but is necessary, it is possible to engage the access helper before anywhere else in the
        // application accesses BlobDownloadHeaders which triggers the accessor to be configured. So, if the accessor
        // is null this effectively pokes the class to set up the accessor.
        if (accessor == null) {
            new UnmuteParticipantResult();
        }

        assert accessor != null;
        return accessor.create(internalResponse);
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentPropertiesPeerAuthentication;
import com.azure.resourcemanager.appcontainers.models.Mtls;
import org.junit.jupiter.api.Assertions;

public final class ManagedEnvironmentPropertiesPeerAuthenticationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ManagedEnvironmentPropertiesPeerAuthentication model = BinaryData.fromString("{\"mtls\":{\"enabled\":false}}")
            .toObject(ManagedEnvironmentPropertiesPeerAuthentication.class);
        Assertions.assertEquals(false, model.mtls().enabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ManagedEnvironmentPropertiesPeerAuthentication model
            = new ManagedEnvironmentPropertiesPeerAuthentication().withMtls(new Mtls().withEnabled(false));
        model = BinaryData.fromObject(model).toObject(ManagedEnvironmentPropertiesPeerAuthentication.class);
        Assertions.assertEquals(false, model.mtls().enabled());
    }
}

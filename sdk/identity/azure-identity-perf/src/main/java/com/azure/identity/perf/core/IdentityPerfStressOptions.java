package com.azure.identity.perf.core;

import com.azure.perf.test.core.PerfStressOptions;
import com.beust.jcommander.Parameter;

public class IdentityPerfStressOptions extends PerfStressOptions {

    @Parameter(names = { "--client-id" }, description = "The Client ID of a user-assigned managed identity.")
    private String clientId;
    @Parameter(names = { "--tenant-id" }, description = "The Tenant ID.")
    private String tenantId;
    @Parameter(names = "--system-assigned", description = "Use the system assigned managed identity.")
    private boolean systemAssigned;

    public String getClientId() {
        return clientId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public boolean isSystemAssigned() {
        return systemAssigned;
    }
}

// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.SessionRetryOptions;
import com.azure.cosmos.implementation.Configs;
import com.azure.cosmos.implementation.ConnectionPolicy;
import com.azure.cosmos.implementation.DiagnosticsClientContext;
import com.azure.cosmos.implementation.GlobalEndpointManager;
import com.azure.cosmos.implementation.IAuthorizationTokenProvider;
import com.azure.cosmos.implementation.ISessionContainer;
import com.azure.cosmos.implementation.UserAgentContainer;
import com.azure.cosmos.implementation.clienttelemetry.ClientTelemetry;

// We suppress the "try" warning here because the close() method's signature
// allows it to throw InterruptedException which is strongly advised against
// by AutoCloseable (see: http://docs.oracle.com/javase/7/docs/api/java/lang/AutoCloseable.html#close()).
// close() will never throw an InterruptedException but the exception remains in the
// signature for backwards compatibility purposes.
@SuppressWarnings("try")
public class StoreClientFactory implements AutoCloseable {

    private final Configs configs;
    private final TransportClient transportClient;
    private volatile boolean isClosed;

    public StoreClientFactory(
        IAddressResolver addressResolver,
        DiagnosticsClientContext.DiagnosticsClientConfig diagnosticsClientConfig,
        Configs configs,
        ConnectionPolicy connectionPolicy,
        UserAgentContainer userAgent,
        boolean enableTransportClientSharing,
        ClientTelemetry clientTelemetry,
        GlobalEndpointManager globalEndpointManager) {

        this.configs = configs;
        Protocol protocol = configs.getProtocol();
        if (enableTransportClientSharing) {
            this.transportClient = SharedTransportClient.getOrCreateInstance(
                protocol,
                configs,
                connectionPolicy,
                userAgent,
                diagnosticsClientConfig,
                addressResolver,
                clientTelemetry,
                globalEndpointManager);
        } else {
            if (protocol == Protocol.HTTPS) {
                this.transportClient = new HttpTransportClient(configs, connectionPolicy, userAgent, globalEndpointManager);
            } else if (protocol == Protocol.TCP) {

                RntbdTransportClient.Options rntbdOptions =
                    new RntbdTransportClient.Options.Builder(connectionPolicy).userAgent(userAgent).build();
                this.transportClient =
                    new RntbdTransportClient(
                        rntbdOptions,
                        configs.getSslContext(connectionPolicy.isServerCertValidationDisabled(), false),
                        addressResolver,
                        clientTelemetry,
                        globalEndpointManager);
                diagnosticsClientConfig.withRntbdOptions(rntbdOptions.toDiagnosticsString());

            } else {
                throw new IllegalArgumentException(String.format("protocol: %s", protocol));
            }
        }
    }

    public void close() throws Exception {
        this.transportClient.close();
        this.isClosed = true;
    }

    // TODO wew don't have support for the following yet
    // TODO enableReadRequestsFallback ask Ji
    // TODO useFallbackClient ask Ji
    public StoreClient createStoreClient(
        DiagnosticsClientContext diagnosticsClientContext,
        IAddressResolver addressResolver,
        ISessionContainer sessionContainer,
        GatewayServiceConfigurationReader serviceConfigurationReader,
        IAuthorizationTokenProvider authorizationTokenProvider,
        boolean useMultipleWriteLocations,
        SessionRetryOptions sessionRetryOptions) {
        this.throwIfClosed();

        return new StoreClient(diagnosticsClientContext,
            configs,
            addressResolver,
            sessionContainer,
            serviceConfigurationReader,
            authorizationTokenProvider,
            this.transportClient,
            useMultipleWriteLocations,
            sessionRetryOptions);
    }

    private void throwIfClosed() {
        if (isClosed) {
            throw new IllegalStateException("storeClient already closed!");
        }
    }
}

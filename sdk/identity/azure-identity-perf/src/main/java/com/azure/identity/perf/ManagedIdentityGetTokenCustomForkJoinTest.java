package com.azure.identity.perf;

import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.ManagedIdentityCredential;
import com.azure.identity.ManagedIdentityCredentialBuilder;
import com.azure.identity.perf.core.IdentityPerfStressOptions;
import com.azure.identity.perf.core.ServiceTest;
import reactor.core.publisher.Mono;

import java.util.concurrent.ForkJoinPool;

public class ManagedIdentityGetTokenCustomForkJoinTest extends ServiceTest<IdentityPerfStressOptions> {

    static ManagedIdentityCredential credential;
    static TokenRequestContext trc = new TokenRequestContext().addScopes("https://management.azure.com/.default");

    public ManagedIdentityGetTokenCustomForkJoinTest(IdentityPerfStressOptions options) {
        super(options);
    }

    @Override
    public Mono<Void> globalSetupAsync() {
        return super.globalSetupAsync().then(Mono.fromRunnable(() -> {
            ManagedIdentityCredentialBuilder builder
                = new ManagedIdentityCredentialBuilder().executorService(new ForkJoinPool())
                    .httpClient(this.httpClient);

            if (!options.isSystemAssigned()) {
                builder.clientId(options.getClientId());
            }
            credential = builder.build();
        }));
    }

    @Override
    public void run() {
        credential.getTokenSync(trc);
    }

    @Override
    public Mono<Void> runAsync() {
        return credential.getToken(trc).then();
    }
}

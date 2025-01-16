package com.azure.identity.perf;

import com.azure.core.credential.TokenRequestContext;
import com.azure.identity.ManagedIdentityCredential;
import com.azure.identity.ManagedIdentityCredentialBuilder;
import com.azure.identity.perf.core.IdentityPerfStressOptions;
import com.azure.identity.perf.core.ServiceTest;
import reactor.core.publisher.Mono;

public class ManagedIdentityConstructAndGetToken extends ServiceTest<IdentityPerfStressOptions> {

    ManagedIdentityCredential credential;
    TokenRequestContext trc = new TokenRequestContext().addScopes("https://management.azure.com/.default");

    public ManagedIdentityConstructAndGetToken(IdentityPerfStressOptions options) {
        super(options);
    }

    @Override
    public Mono<Void> globalSetupAsync() {
        return super.globalSetupAsync();
    }

    @Override
    public void run() {
        ManagedIdentityCredentialBuilder builder = new ManagedIdentityCredentialBuilder().httpClient(this.httpClient);

        if (!options.isSystemAssigned()) {
            builder.clientId(options.getClientId());
        }
        credential = builder.build();
        credential.getTokenSync(trc);
    }

    @Override
    public Mono<Void> runAsync() {
        ManagedIdentityCredentialBuilder builder = new ManagedIdentityCredentialBuilder().httpClient(this.httpClient);

        if (!options.isSystemAssigned()) {
            builder.clientId(options.getClientId());
        }
        credential = builder.build();
        return credential.getToken(trc).then();
    }
}

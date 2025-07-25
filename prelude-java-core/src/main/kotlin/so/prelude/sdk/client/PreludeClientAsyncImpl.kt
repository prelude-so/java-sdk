// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.client

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.getPackageVersion
import so.prelude.sdk.services.async.LookupServiceAsync
import so.prelude.sdk.services.async.LookupServiceAsyncImpl
import so.prelude.sdk.services.async.TransactionalServiceAsync
import so.prelude.sdk.services.async.TransactionalServiceAsyncImpl
import so.prelude.sdk.services.async.VerificationServiceAsync
import so.prelude.sdk.services.async.VerificationServiceAsyncImpl
import so.prelude.sdk.services.async.WatchServiceAsync
import so.prelude.sdk.services.async.WatchServiceAsyncImpl

class PreludeClientAsyncImpl(private val clientOptions: ClientOptions) : PreludeClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: PreludeClient by lazy { PreludeClientImpl(clientOptions) }

    private val withRawResponse: PreludeClientAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lookup: LookupServiceAsync by lazy {
        LookupServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactional: TransactionalServiceAsync by lazy {
        TransactionalServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val verification: VerificationServiceAsync by lazy {
        VerificationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val watch: WatchServiceAsync by lazy {
        WatchServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): PreludeClient = sync

    override fun withRawResponse(): PreludeClientAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreludeClientAsync =
        PreludeClientAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun lookup(): LookupServiceAsync = lookup

    override fun transactional(): TransactionalServiceAsync = transactional

    override fun verification(): VerificationServiceAsync = verification

    override fun watch(): WatchServiceAsync = watch

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreludeClientAsync.WithRawResponse {

        private val lookup: LookupServiceAsync.WithRawResponse by lazy {
            LookupServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactional: TransactionalServiceAsync.WithRawResponse by lazy {
            TransactionalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val verification: VerificationServiceAsync.WithRawResponse by lazy {
            VerificationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val watch: WatchServiceAsync.WithRawResponse by lazy {
            WatchServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreludeClientAsync.WithRawResponse =
            PreludeClientAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun lookup(): LookupServiceAsync.WithRawResponse = lookup

        override fun transactional(): TransactionalServiceAsync.WithRawResponse = transactional

        override fun verification(): VerificationServiceAsync.WithRawResponse = verification

        override fun watch(): WatchServiceAsync.WithRawResponse = watch
    }
}

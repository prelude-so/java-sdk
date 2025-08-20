// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.client

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.getPackageVersion
import so.prelude.sdk.services.blocking.LookupService
import so.prelude.sdk.services.blocking.LookupServiceImpl
import so.prelude.sdk.services.blocking.TransactionalService
import so.prelude.sdk.services.blocking.TransactionalServiceImpl
import so.prelude.sdk.services.blocking.VerificationService
import so.prelude.sdk.services.blocking.VerificationServiceImpl
import so.prelude.sdk.services.blocking.WatchService
import so.prelude.sdk.services.blocking.WatchServiceImpl

class PreludeClientImpl(private val clientOptions: ClientOptions) : PreludeClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: PreludeClientAsync by lazy { PreludeClientAsyncImpl(clientOptions) }

    private val withRawResponse: PreludeClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lookup: LookupService by lazy { LookupServiceImpl(clientOptionsWithUserAgent) }

    private val transactional: TransactionalService by lazy {
        TransactionalServiceImpl(clientOptionsWithUserAgent)
    }

    private val verification: VerificationService by lazy {
        VerificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val watch: WatchService by lazy { WatchServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): PreludeClientAsync = async

    override fun withRawResponse(): PreludeClient.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreludeClient =
        PreludeClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun lookup(): LookupService = lookup

    override fun transactional(): TransactionalService = transactional

    override fun verification(): VerificationService = verification

    override fun watch(): WatchService = watch

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PreludeClient.WithRawResponse {

        private val lookup: LookupService.WithRawResponse by lazy {
            LookupServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactional: TransactionalService.WithRawResponse by lazy {
            TransactionalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val verification: VerificationService.WithRawResponse by lazy {
            VerificationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val watch: WatchService.WithRawResponse by lazy {
            WatchServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreludeClient.WithRawResponse =
            PreludeClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun lookup(): LookupService.WithRawResponse = lookup

        override fun transactional(): TransactionalService.WithRawResponse = transactional

        override fun verification(): VerificationService.WithRawResponse = verification

        override fun watch(): WatchService.WithRawResponse = watch
    }
}

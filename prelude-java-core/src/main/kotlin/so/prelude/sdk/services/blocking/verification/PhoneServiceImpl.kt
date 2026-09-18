// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking.verification

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.services.blocking.verification.phone.HistoryService
import so.prelude.sdk.services.blocking.verification.phone.HistoryServiceImpl

class PhoneServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneService {

    private val withRawResponse: PhoneService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryService by lazy { HistoryServiceImpl(clientOptions) }

    override fun withRawResponse(): PhoneService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneService =
        PhoneServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Verify phone numbers. */
    override fun history(): HistoryService = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneService.WithRawResponse {

        private val history: HistoryService.WithRawResponse by lazy {
            HistoryServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneService.WithRawResponse =
            PhoneServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Verify phone numbers. */
        override fun history(): HistoryService.WithRawResponse = history
    }
}

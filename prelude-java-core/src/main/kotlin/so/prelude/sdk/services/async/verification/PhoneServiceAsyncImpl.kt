// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.verification

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.services.async.verification.phone.HistoryServiceAsync
import so.prelude.sdk.services.async.verification.phone.HistoryServiceAsyncImpl

class PhoneServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhoneServiceAsync {

    private val withRawResponse: PhoneServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val history: HistoryServiceAsync by lazy { HistoryServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): PhoneServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneServiceAsync =
        PhoneServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /** Verify phone numbers. */
    override fun history(): HistoryServiceAsync = history

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhoneServiceAsync.WithRawResponse {

        private val history: HistoryServiceAsync.WithRawResponse by lazy {
            HistoryServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneServiceAsync.WithRawResponse =
            PhoneServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /** Verify phone numbers. */
        override fun history(): HistoryServiceAsync.WithRawResponse = history
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.services.async.intel.KycServiceAsync
import so.prelude.sdk.services.async.intel.KycServiceAsyncImpl

class IntelServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    IntelServiceAsync {

    private val withRawResponse: IntelServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val kyc: KycServiceAsync by lazy { KycServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): IntelServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntelServiceAsync =
        IntelServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Retrieve detailed information about a phone number including carrier data, line type, and
     * portability status.
     */
    override fun kyc(): KycServiceAsync = kyc

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntelServiceAsync.WithRawResponse {

        private val kyc: KycServiceAsync.WithRawResponse by lazy {
            KycServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntelServiceAsync.WithRawResponse =
            IntelServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Retrieve detailed information about a phone number including carrier data, line type, and
         * portability status.
         */
        override fun kyc(): KycServiceAsync.WithRawResponse = kyc
    }
}

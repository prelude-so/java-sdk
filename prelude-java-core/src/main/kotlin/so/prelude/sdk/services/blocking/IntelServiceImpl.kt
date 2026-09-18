// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.services.blocking.intel.KycService
import so.prelude.sdk.services.blocking.intel.KycServiceImpl

class IntelServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IntelService {

    private val withRawResponse: IntelService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val kyc: KycService by lazy { KycServiceImpl(clientOptions) }

    override fun withRawResponse(): IntelService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntelService =
        IntelServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    /**
     * Retrieve detailed information about a phone number including carrier data, line type, and
     * portability status.
     */
    override fun kyc(): KycService = kyc

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntelService.WithRawResponse {

        private val kyc: KycService.WithRawResponse by lazy {
            KycServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntelService.WithRawResponse =
            IntelServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        /**
         * Retrieve detailed information about a phone number including carrier data, line type, and
         * portability status.
         */
        override fun kyc(): KycService.WithRawResponse = kyc
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.services.async.intel.KycServiceAsync

interface IntelServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): IntelServiceAsync

    /**
     * Retrieve detailed information about a phone number including carrier data, line type, and
     * portability status.
     */
    fun kyc(): KycServiceAsync

    /** A view of [IntelServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): IntelServiceAsync.WithRawResponse

        /**
         * Retrieve detailed information about a phone number including carrier data, line type, and
         * portability status.
         */
        fun kyc(): KycServiceAsync.WithRawResponse
    }
}

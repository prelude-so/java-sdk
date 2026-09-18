// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.verification

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.services.async.verification.phone.HistoryServiceAsync

interface PhoneServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PhoneServiceAsync

    /** Verify phone numbers. */
    fun history(): HistoryServiceAsync

    /** A view of [PhoneServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PhoneServiceAsync.WithRawResponse

        /** Verify phone numbers. */
        fun history(): HistoryServiceAsync.WithRawResponse
    }
}

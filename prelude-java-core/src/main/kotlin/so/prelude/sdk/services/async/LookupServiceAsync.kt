// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.LookupLookupParams
import so.prelude.sdk.models.LookupLookupResponse

interface LookupServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve detailed information about a phone number including carrier data, line type, and
     * portability status.
     */
    fun lookup(phoneNumber: String): CompletableFuture<LookupLookupResponse> =
        lookup(phoneNumber, LookupLookupParams.none())

    /** @see [lookup] */
    fun lookup(
        phoneNumber: String,
        params: LookupLookupParams = LookupLookupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupLookupResponse> =
        lookup(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see [lookup] */
    fun lookup(
        phoneNumber: String,
        params: LookupLookupParams = LookupLookupParams.none(),
    ): CompletableFuture<LookupLookupResponse> = lookup(phoneNumber, params, RequestOptions.none())

    /** @see [lookup] */
    fun lookup(
        params: LookupLookupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LookupLookupResponse>

    /** @see [lookup] */
    fun lookup(params: LookupLookupParams): CompletableFuture<LookupLookupResponse> =
        lookup(params, RequestOptions.none())

    /** @see [lookup] */
    fun lookup(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LookupLookupResponse> =
        lookup(phoneNumber, LookupLookupParams.none(), requestOptions)

    /**
     * A view of [LookupServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v2/lookup/{phone_number}`, but is otherwise the
         * same as [LookupServiceAsync.lookup].
         */
        @MustBeClosed
        fun lookup(phoneNumber: String): CompletableFuture<HttpResponseFor<LookupLookupResponse>> =
            lookup(phoneNumber, LookupLookupParams.none())

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            phoneNumber: String,
            params: LookupLookupParams = LookupLookupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupLookupResponse>> =
            lookup(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            phoneNumber: String,
            params: LookupLookupParams = LookupLookupParams.none(),
        ): CompletableFuture<HttpResponseFor<LookupLookupResponse>> =
            lookup(phoneNumber, params, RequestOptions.none())

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            params: LookupLookupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LookupLookupResponse>>

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            params: LookupLookupParams
        ): CompletableFuture<HttpResponseFor<LookupLookupResponse>> =
            lookup(params, RequestOptions.none())

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LookupLookupResponse>> =
            lookup(phoneNumber, LookupLookupParams.none(), requestOptions)
    }
}

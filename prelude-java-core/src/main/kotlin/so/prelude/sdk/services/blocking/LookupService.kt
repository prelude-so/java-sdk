// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.LookupLookupParams
import so.prelude.sdk.models.LookupLookupResponse

interface LookupService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve detailed information about a phone number including carrier data, line type, and
     * portability status.
     */
    fun lookup(phoneNumber: String): LookupLookupResponse =
        lookup(phoneNumber, LookupLookupParams.none())

    /** @see [lookup] */
    fun lookup(
        phoneNumber: String,
        params: LookupLookupParams = LookupLookupParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupLookupResponse =
        lookup(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see [lookup] */
    fun lookup(
        phoneNumber: String,
        params: LookupLookupParams = LookupLookupParams.none(),
    ): LookupLookupResponse = lookup(phoneNumber, params, RequestOptions.none())

    /** @see [lookup] */
    fun lookup(
        params: LookupLookupParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LookupLookupResponse

    /** @see [lookup] */
    fun lookup(params: LookupLookupParams): LookupLookupResponse =
        lookup(params, RequestOptions.none())

    /** @see [lookup] */
    fun lookup(phoneNumber: String, requestOptions: RequestOptions): LookupLookupResponse =
        lookup(phoneNumber, LookupLookupParams.none(), requestOptions)

    /** A view of [LookupService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v2/lookup/{phone_number}`, but is otherwise the
         * same as [LookupService.lookup].
         */
        @MustBeClosed
        fun lookup(phoneNumber: String): HttpResponseFor<LookupLookupResponse> =
            lookup(phoneNumber, LookupLookupParams.none())

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            phoneNumber: String,
            params: LookupLookupParams = LookupLookupParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupLookupResponse> =
            lookup(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            phoneNumber: String,
            params: LookupLookupParams = LookupLookupParams.none(),
        ): HttpResponseFor<LookupLookupResponse> =
            lookup(phoneNumber, params, RequestOptions.none())

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            params: LookupLookupParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LookupLookupResponse>

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(params: LookupLookupParams): HttpResponseFor<LookupLookupResponse> =
            lookup(params, RequestOptions.none())

        /** @see [lookup] */
        @MustBeClosed
        fun lookup(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupLookupResponse> =
            lookup(phoneNumber, LookupLookupParams.none(), requestOptions)
    }
}

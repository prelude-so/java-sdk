// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.VerificationCheckParams
import so.prelude.sdk.models.VerificationCheckResponse
import so.prelude.sdk.models.VerificationCreateParams
import so.prelude.sdk.models.VerificationCreateResponse

interface VerificationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new verification for a specific phone number. If another non-expired verification
     * exists (the request is performed within the verification window), this endpoint will perform
     * a retry instead.
     */
    fun create(params: VerificationCreateParams): VerificationCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: VerificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationCreateResponse

    /** Check the validity of a verification code. */
    fun check(params: VerificationCheckParams): VerificationCheckResponse =
        check(params, RequestOptions.none())

    /** @see [check] */
    fun check(
        params: VerificationCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationCheckResponse

    /**
     * A view of [VerificationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v2/verification`, but is otherwise the same as
         * [VerificationService.create].
         */
        @MustBeClosed
        fun create(params: VerificationCreateParams): HttpResponseFor<VerificationCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: VerificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationCreateResponse>

        /**
         * Returns a raw HTTP response for `post /v2/verification/check`, but is otherwise the same
         * as [VerificationService.check].
         */
        @MustBeClosed
        fun check(params: VerificationCheckParams): HttpResponseFor<VerificationCheckResponse> =
            check(params, RequestOptions.none())

        /** @see [check] */
        @MustBeClosed
        fun check(
            params: VerificationCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationCheckResponse>
    }
}

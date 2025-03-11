// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.VerificationCheckParams
import so.prelude.sdk.models.VerificationCheckResponse
import so.prelude.sdk.models.VerificationCreateParams
import so.prelude.sdk.models.VerificationCreateResponse

interface VerificationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Create a new verification for a specific phone number. If another non-expired verification
     * exists (the request is performed within the verification window), this endpoint will perform
     * a retry instead.
     */
    fun create(params: VerificationCreateParams): CompletableFuture<VerificationCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: VerificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationCreateResponse>

    /** Check the validity of a verification code. */
    fun check(params: VerificationCheckParams): CompletableFuture<VerificationCheckResponse> =
        check(params, RequestOptions.none())

    /** @see [check] */
    fun check(
        params: VerificationCheckParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationCheckResponse>

    /**
     * A view of [VerificationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v2/verification`, but is otherwise the same as
         * [VerificationServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: VerificationCreateParams
        ): CompletableFuture<HttpResponseFor<VerificationCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: VerificationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationCreateResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/verification/check`, but is otherwise the same
         * as [VerificationServiceAsync.check].
         */
        @MustBeClosed
        fun check(
            params: VerificationCheckParams
        ): CompletableFuture<HttpResponseFor<VerificationCheckResponse>> =
            check(params, RequestOptions.none())

        /** @see [check] */
        @MustBeClosed
        fun check(
            params: VerificationCheckParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationCheckResponse>>
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.intel

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.IntelKycMatchParams
import so.prelude.sdk.models.IntelKycMatchResponse

/**
 * Retrieve detailed information about a phone number including carrier data, line type, and
 * portability status.
 */
interface KycServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KycServiceAsync

    /**
     * Verify identity attributes against the subscriber record held by the end-user's mobile
     * operator. Send a phone number along with the attributes to check; Prelude resolves the
     * operator internally and returns a per-attribute match. Currently available for France only
     * (Orange, SFR, Bouygues) and must be enabled for your account.
     */
    fun match(phone: String): CompletableFuture<IntelKycMatchResponse> =
        match(phone, IntelKycMatchParams.none())

    /** @see match */
    fun match(
        phone: String,
        params: IntelKycMatchParams = IntelKycMatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntelKycMatchResponse> =
        match(params.toBuilder().phone(phone).build(), requestOptions)

    /** @see match */
    fun match(
        phone: String,
        params: IntelKycMatchParams = IntelKycMatchParams.none(),
    ): CompletableFuture<IntelKycMatchResponse> = match(phone, params, RequestOptions.none())

    /** @see match */
    fun match(
        params: IntelKycMatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<IntelKycMatchResponse>

    /** @see match */
    fun match(params: IntelKycMatchParams): CompletableFuture<IntelKycMatchResponse> =
        match(params, RequestOptions.none())

    /** @see match */
    fun match(
        phone: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntelKycMatchResponse> =
        match(phone, IntelKycMatchParams.none(), requestOptions)

    /** A view of [KycServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KycServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/intel/kyc/match/{phone}`, but is otherwise the
         * same as [KycServiceAsync.match].
         */
        fun match(phone: String): CompletableFuture<HttpResponseFor<IntelKycMatchResponse>> =
            match(phone, IntelKycMatchParams.none())

        /** @see match */
        fun match(
            phone: String,
            params: IntelKycMatchParams = IntelKycMatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntelKycMatchResponse>> =
            match(params.toBuilder().phone(phone).build(), requestOptions)

        /** @see match */
        fun match(
            phone: String,
            params: IntelKycMatchParams = IntelKycMatchParams.none(),
        ): CompletableFuture<HttpResponseFor<IntelKycMatchResponse>> =
            match(phone, params, RequestOptions.none())

        /** @see match */
        fun match(
            params: IntelKycMatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<IntelKycMatchResponse>>

        /** @see match */
        fun match(
            params: IntelKycMatchParams
        ): CompletableFuture<HttpResponseFor<IntelKycMatchResponse>> =
            match(params, RequestOptions.none())

        /** @see match */
        fun match(
            phone: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntelKycMatchResponse>> =
            match(phone, IntelKycMatchParams.none(), requestOptions)
    }
}

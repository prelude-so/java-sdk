// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking.intel

import com.google.errorprone.annotations.MustBeClosed
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
interface KycService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): KycService

    /**
     * Verify identity attributes against the subscriber record held by the end-user's mobile
     * operator. Send a phone number along with the attributes to check; Prelude resolves the
     * operator internally and returns a per-attribute match. Currently available for France only
     * (Orange, SFR, Bouygues) and must be enabled for your account.
     */
    fun match(phone: String): IntelKycMatchResponse = match(phone, IntelKycMatchParams.none())

    /** @see match */
    fun match(
        phone: String,
        params: IntelKycMatchParams = IntelKycMatchParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntelKycMatchResponse = match(params.toBuilder().phone(phone).build(), requestOptions)

    /** @see match */
    fun match(
        phone: String,
        params: IntelKycMatchParams = IntelKycMatchParams.none(),
    ): IntelKycMatchResponse = match(phone, params, RequestOptions.none())

    /** @see match */
    fun match(
        params: IntelKycMatchParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntelKycMatchResponse

    /** @see match */
    fun match(params: IntelKycMatchParams): IntelKycMatchResponse =
        match(params, RequestOptions.none())

    /** @see match */
    fun match(phone: String, requestOptions: RequestOptions): IntelKycMatchResponse =
        match(phone, IntelKycMatchParams.none(), requestOptions)

    /** A view of [KycService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): KycService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/intel/kyc/match/{phone}`, but is otherwise the
         * same as [KycService.match].
         */
        @MustBeClosed
        fun match(phone: String): HttpResponseFor<IntelKycMatchResponse> =
            match(phone, IntelKycMatchParams.none())

        /** @see match */
        @MustBeClosed
        fun match(
            phone: String,
            params: IntelKycMatchParams = IntelKycMatchParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntelKycMatchResponse> =
            match(params.toBuilder().phone(phone).build(), requestOptions)

        /** @see match */
        @MustBeClosed
        fun match(
            phone: String,
            params: IntelKycMatchParams = IntelKycMatchParams.none(),
        ): HttpResponseFor<IntelKycMatchResponse> = match(phone, params, RequestOptions.none())

        /** @see match */
        @MustBeClosed
        fun match(
            params: IntelKycMatchParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntelKycMatchResponse>

        /** @see match */
        @MustBeClosed
        fun match(params: IntelKycMatchParams): HttpResponseFor<IntelKycMatchResponse> =
            match(params, RequestOptions.none())

        /** @see match */
        @MustBeClosed
        fun match(
            phone: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntelKycMatchResponse> =
            match(phone, IntelKycMatchParams.none(), requestOptions)
    }
}

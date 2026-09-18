// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking.verification.phone

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.VerificationPhoneHistoryListParams
import so.prelude.sdk.models.VerificationPhoneHistoryListResponse
import so.prelude.sdk.models.VerificationPhoneHistoryRetrieveParams
import so.prelude.sdk.models.VerificationPhoneHistoryRetrieveResponse

/** Verify phone numbers. */
interface HistoryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService

    /**
     * Retrieve everything Prelude recorded for one phone verification: its outcome and the device,
     * network and anti-fraud context it was created in, the chronological timeline of every message
     * attempt and code check, and the anti-fraud signals you forwarded.
     *
     * The identifier is the `id` returned by
     * [Create or retry a verification](/verify/v2/api-reference/create-or-retry-a-verification) or
     * the `verification_id` of the verification webhooks. Both `lifecycle` and `signals` are
     * optional: a verification can resolve with its top-level fields alone.
     */
    fun retrieve(id: String): VerificationPhoneHistoryRetrieveResponse =
        retrieve(id, VerificationPhoneHistoryRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VerificationPhoneHistoryRetrieveParams =
            VerificationPhoneHistoryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationPhoneHistoryRetrieveResponse =
        retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        id: String,
        params: VerificationPhoneHistoryRetrieveParams =
            VerificationPhoneHistoryRetrieveParams.none(),
    ): VerificationPhoneHistoryRetrieveResponse = retrieve(id, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: VerificationPhoneHistoryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationPhoneHistoryRetrieveResponse

    /** @see retrieve */
    fun retrieve(
        params: VerificationPhoneHistoryRetrieveParams
    ): VerificationPhoneHistoryRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        id: String,
        requestOptions: RequestOptions,
    ): VerificationPhoneHistoryRetrieveResponse =
        retrieve(id, VerificationPhoneHistoryRetrieveParams.none(), requestOptions)

    /**
     * List your phone verifications, most recent first, one entry per verification with its
     * outcome, channels, attempts and cost. Every filter is optional and they combine with AND.
     *
     * Use it to find every verification a phone number went through from your support tooling, then
     * [Get a phone verification](/verify/v2/api-reference/history/get-a-phone-verification) for the
     * full timeline of one of them. A cursor is bound to the filters that produced it: pass
     * `next_cursor` back with the exact same query parameters.
     */
    fun list(): VerificationPhoneHistoryListResponse =
        list(VerificationPhoneHistoryListParams.none())

    /** @see list */
    fun list(
        params: VerificationPhoneHistoryListParams = VerificationPhoneHistoryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationPhoneHistoryListResponse

    /** @see list */
    fun list(
        params: VerificationPhoneHistoryListParams = VerificationPhoneHistoryListParams.none()
    ): VerificationPhoneHistoryListResponse = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): VerificationPhoneHistoryListResponse =
        list(VerificationPhoneHistoryListParams.none(), requestOptions)

    /** A view of [HistoryService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/verification/phone/history/{id}`, but is
         * otherwise the same as [HistoryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(id: String): HttpResponseFor<VerificationPhoneHistoryRetrieveResponse> =
            retrieve(id, VerificationPhoneHistoryRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VerificationPhoneHistoryRetrieveParams =
                VerificationPhoneHistoryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationPhoneHistoryRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: VerificationPhoneHistoryRetrieveParams =
                VerificationPhoneHistoryRetrieveParams.none(),
        ): HttpResponseFor<VerificationPhoneHistoryRetrieveResponse> =
            retrieve(id, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VerificationPhoneHistoryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationPhoneHistoryRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: VerificationPhoneHistoryRetrieveParams
        ): HttpResponseFor<VerificationPhoneHistoryRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationPhoneHistoryRetrieveResponse> =
            retrieve(id, VerificationPhoneHistoryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/verification/phone/history`, but is otherwise
         * the same as [HistoryService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<VerificationPhoneHistoryListResponse> =
            list(VerificationPhoneHistoryListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerificationPhoneHistoryListParams = VerificationPhoneHistoryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationPhoneHistoryListResponse>

        /** @see list */
        @MustBeClosed
        fun list(
            params: VerificationPhoneHistoryListParams = VerificationPhoneHistoryListParams.none()
        ): HttpResponseFor<VerificationPhoneHistoryListResponse> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<VerificationPhoneHistoryListResponse> =
            list(VerificationPhoneHistoryListParams.none(), requestOptions)
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.VerificationManagementListSenderIdsParams
import so.prelude.sdk.models.VerificationManagementListSenderIdsResponse
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdParams
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdResponse

interface VerificationManagementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationManagementServiceAsync

    /**
     * Retrieve sender IDs list.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun listSenderIds(): CompletableFuture<VerificationManagementListSenderIdsResponse> =
        listSenderIds(VerificationManagementListSenderIdsParams.none())

    /** @see listSenderIds */
    fun listSenderIds(
        params: VerificationManagementListSenderIdsParams =
            VerificationManagementListSenderIdsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementListSenderIdsResponse>

    /** @see listSenderIds */
    fun listSenderIds(
        params: VerificationManagementListSenderIdsParams =
            VerificationManagementListSenderIdsParams.none()
    ): CompletableFuture<VerificationManagementListSenderIdsResponse> =
        listSenderIds(params, RequestOptions.none())

    /** @see listSenderIds */
    fun listSenderIds(
        requestOptions: RequestOptions
    ): CompletableFuture<VerificationManagementListSenderIdsResponse> =
        listSenderIds(VerificationManagementListSenderIdsParams.none(), requestOptions)

    /**
     * This endpoint allows you to submit a new sender ID for verification purposes.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun submitSenderId(
        params: VerificationManagementSubmitSenderIdParams
    ): CompletableFuture<VerificationManagementSubmitSenderIdResponse> =
        submitSenderId(params, RequestOptions.none())

    /** @see submitSenderId */
    fun submitSenderId(
        params: VerificationManagementSubmitSenderIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementSubmitSenderIdResponse>

    /**
     * A view of [VerificationManagementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationManagementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/verification/management/sender-id`, but is
         * otherwise the same as [VerificationManagementServiceAsync.listSenderIds].
         */
        fun listSenderIds():
            CompletableFuture<HttpResponseFor<VerificationManagementListSenderIdsResponse>> =
            listSenderIds(VerificationManagementListSenderIdsParams.none())

        /** @see listSenderIds */
        fun listSenderIds(
            params: VerificationManagementListSenderIdsParams =
                VerificationManagementListSenderIdsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementListSenderIdsResponse>>

        /** @see listSenderIds */
        fun listSenderIds(
            params: VerificationManagementListSenderIdsParams =
                VerificationManagementListSenderIdsParams.none()
        ): CompletableFuture<HttpResponseFor<VerificationManagementListSenderIdsResponse>> =
            listSenderIds(params, RequestOptions.none())

        /** @see listSenderIds */
        fun listSenderIds(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<VerificationManagementListSenderIdsResponse>> =
            listSenderIds(VerificationManagementListSenderIdsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/verification/management/sender-id`, but is
         * otherwise the same as [VerificationManagementServiceAsync.submitSenderId].
         */
        fun submitSenderId(
            params: VerificationManagementSubmitSenderIdParams
        ): CompletableFuture<HttpResponseFor<VerificationManagementSubmitSenderIdResponse>> =
            submitSenderId(params, RequestOptions.none())

        /** @see submitSenderId */
        fun submitSenderId(
            params: VerificationManagementSubmitSenderIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementSubmitSenderIdResponse>>
    }
}

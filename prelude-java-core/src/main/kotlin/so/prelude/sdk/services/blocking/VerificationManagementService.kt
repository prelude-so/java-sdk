// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.VerificationManagementListSenderIdsParams
import so.prelude.sdk.models.VerificationManagementListSenderIdsResponse
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdParams
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdResponse

interface VerificationManagementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): VerificationManagementService

    /**
     * Retrieve sender IDs list.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun listSenderIds(): List<VerificationManagementListSenderIdsResponse> =
        listSenderIds(VerificationManagementListSenderIdsParams.none())

    /** @see listSenderIds */
    fun listSenderIds(
        params: VerificationManagementListSenderIdsParams =
            VerificationManagementListSenderIdsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<VerificationManagementListSenderIdsResponse>

    /** @see listSenderIds */
    fun listSenderIds(
        params: VerificationManagementListSenderIdsParams =
            VerificationManagementListSenderIdsParams.none()
    ): List<VerificationManagementListSenderIdsResponse> =
        listSenderIds(params, RequestOptions.none())

    /** @see listSenderIds */
    fun listSenderIds(
        requestOptions: RequestOptions
    ): List<VerificationManagementListSenderIdsResponse> =
        listSenderIds(VerificationManagementListSenderIdsParams.none(), requestOptions)

    /**
     * This endpoint allows you to add a new sender ID for verification purposes.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun submitSenderId(
        params: VerificationManagementSubmitSenderIdParams
    ): VerificationManagementSubmitSenderIdResponse = submitSenderId(params, RequestOptions.none())

    /** @see submitSenderId */
    fun submitSenderId(
        params: VerificationManagementSubmitSenderIdParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementSubmitSenderIdResponse

    /**
     * A view of [VerificationManagementService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationManagementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/verification/management/sender-id`, but is
         * otherwise the same as [VerificationManagementService.listSenderIds].
         */
        @MustBeClosed
        fun listSenderIds(): HttpResponseFor<List<VerificationManagementListSenderIdsResponse>> =
            listSenderIds(VerificationManagementListSenderIdsParams.none())

        /** @see listSenderIds */
        @MustBeClosed
        fun listSenderIds(
            params: VerificationManagementListSenderIdsParams =
                VerificationManagementListSenderIdsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<VerificationManagementListSenderIdsResponse>>

        /** @see listSenderIds */
        @MustBeClosed
        fun listSenderIds(
            params: VerificationManagementListSenderIdsParams =
                VerificationManagementListSenderIdsParams.none()
        ): HttpResponseFor<List<VerificationManagementListSenderIdsResponse>> =
            listSenderIds(params, RequestOptions.none())

        /** @see listSenderIds */
        @MustBeClosed
        fun listSenderIds(
            requestOptions: RequestOptions
        ): HttpResponseFor<List<VerificationManagementListSenderIdsResponse>> =
            listSenderIds(VerificationManagementListSenderIdsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/verification/management/sender-id`, but is
         * otherwise the same as [VerificationManagementService.submitSenderId].
         */
        @MustBeClosed
        fun submitSenderId(
            params: VerificationManagementSubmitSenderIdParams
        ): HttpResponseFor<VerificationManagementSubmitSenderIdResponse> =
            submitSenderId(params, RequestOptions.none())

        /** @see submitSenderId */
        @MustBeClosed
        fun submitSenderId(
            params: VerificationManagementSubmitSenderIdParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementSubmitSenderIdResponse>
    }
}

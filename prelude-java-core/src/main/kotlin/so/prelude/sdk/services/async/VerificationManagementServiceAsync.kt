// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.VerificationManagementDeletePhoneNumberParams
import so.prelude.sdk.models.VerificationManagementDeletePhoneNumberResponse
import so.prelude.sdk.models.VerificationManagementListPhoneNumbersParams
import so.prelude.sdk.models.VerificationManagementListPhoneNumbersResponse
import so.prelude.sdk.models.VerificationManagementListSenderIdsParams
import so.prelude.sdk.models.VerificationManagementListSenderIdsResponse
import so.prelude.sdk.models.VerificationManagementSetPhoneNumberParams
import so.prelude.sdk.models.VerificationManagementSetPhoneNumberResponse
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdParams
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdResponse

/** Verify phone numbers. */
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
     * Remove a phone number from the allow or block list.
     *
     * This operation is idempotent - re-deleting the same phone number will not result in errors.
     * If the phone number does not exist in the specified list, the operation will succeed without
     * making any changes.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun deletePhoneNumber(
        action: VerificationManagementDeletePhoneNumberParams.Action,
        params: VerificationManagementDeletePhoneNumberParams,
    ): CompletableFuture<VerificationManagementDeletePhoneNumberResponse> =
        deletePhoneNumber(action, params, RequestOptions.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        action: VerificationManagementDeletePhoneNumberParams.Action,
        params: VerificationManagementDeletePhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementDeletePhoneNumberResponse> =
        deletePhoneNumber(params.toBuilder().action(action).build(), requestOptions)

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        params: VerificationManagementDeletePhoneNumberParams
    ): CompletableFuture<VerificationManagementDeletePhoneNumberResponse> =
        deletePhoneNumber(params, RequestOptions.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        params: VerificationManagementDeletePhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementDeletePhoneNumberResponse>

    /**
     * Retrieve the list of phone numbers in the allow or block list.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun listPhoneNumbers(
        action: VerificationManagementListPhoneNumbersParams.Action
    ): CompletableFuture<VerificationManagementListPhoneNumbersResponse> =
        listPhoneNumbers(action, VerificationManagementListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        action: VerificationManagementListPhoneNumbersParams.Action,
        params: VerificationManagementListPhoneNumbersParams =
            VerificationManagementListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementListPhoneNumbersResponse> =
        listPhoneNumbers(params.toBuilder().action(action).build(), requestOptions)

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        action: VerificationManagementListPhoneNumbersParams.Action,
        params: VerificationManagementListPhoneNumbersParams =
            VerificationManagementListPhoneNumbersParams.none(),
    ): CompletableFuture<VerificationManagementListPhoneNumbersResponse> =
        listPhoneNumbers(action, params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: VerificationManagementListPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementListPhoneNumbersResponse>

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: VerificationManagementListPhoneNumbersParams
    ): CompletableFuture<VerificationManagementListPhoneNumbersResponse> =
        listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        action: VerificationManagementListPhoneNumbersParams.Action,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationManagementListPhoneNumbersResponse> =
        listPhoneNumbers(
            action,
            VerificationManagementListPhoneNumbersParams.none(),
            requestOptions,
        )

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
     * Add a phone number to the allow or block list.
     *
     * This operation is idempotent - re-adding the same phone number will not result in duplicate
     * entries or errors. If the phone number already exists in the specified list, the operation
     * will succeed without making any changes.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun setPhoneNumber(
        action: VerificationManagementSetPhoneNumberParams.Action,
        params: VerificationManagementSetPhoneNumberParams,
    ): CompletableFuture<VerificationManagementSetPhoneNumberResponse> =
        setPhoneNumber(action, params, RequestOptions.none())

    /** @see setPhoneNumber */
    fun setPhoneNumber(
        action: VerificationManagementSetPhoneNumberParams.Action,
        params: VerificationManagementSetPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementSetPhoneNumberResponse> =
        setPhoneNumber(params.toBuilder().action(action).build(), requestOptions)

    /** @see setPhoneNumber */
    fun setPhoneNumber(
        params: VerificationManagementSetPhoneNumberParams
    ): CompletableFuture<VerificationManagementSetPhoneNumberResponse> =
        setPhoneNumber(params, RequestOptions.none())

    /** @see setPhoneNumber */
    fun setPhoneNumber(
        params: VerificationManagementSetPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementSetPhoneNumberResponse>

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
         * Returns a raw HTTP response for `delete
         * /v2/verification/management/phone-numbers/{action}`, but is otherwise the same as
         * [VerificationManagementServiceAsync.deletePhoneNumber].
         */
        fun deletePhoneNumber(
            action: VerificationManagementDeletePhoneNumberParams.Action,
            params: VerificationManagementDeletePhoneNumberParams,
        ): CompletableFuture<HttpResponseFor<VerificationManagementDeletePhoneNumberResponse>> =
            deletePhoneNumber(action, params, RequestOptions.none())

        /** @see deletePhoneNumber */
        fun deletePhoneNumber(
            action: VerificationManagementDeletePhoneNumberParams.Action,
            params: VerificationManagementDeletePhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementDeletePhoneNumberResponse>> =
            deletePhoneNumber(params.toBuilder().action(action).build(), requestOptions)

        /** @see deletePhoneNumber */
        fun deletePhoneNumber(
            params: VerificationManagementDeletePhoneNumberParams
        ): CompletableFuture<HttpResponseFor<VerificationManagementDeletePhoneNumberResponse>> =
            deletePhoneNumber(params, RequestOptions.none())

        /** @see deletePhoneNumber */
        fun deletePhoneNumber(
            params: VerificationManagementDeletePhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementDeletePhoneNumberResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/verification/management/phone-numbers/{action}`,
         * but is otherwise the same as [VerificationManagementServiceAsync.listPhoneNumbers].
         */
        fun listPhoneNumbers(
            action: VerificationManagementListPhoneNumbersParams.Action
        ): CompletableFuture<HttpResponseFor<VerificationManagementListPhoneNumbersResponse>> =
            listPhoneNumbers(action, VerificationManagementListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            action: VerificationManagementListPhoneNumbersParams.Action,
            params: VerificationManagementListPhoneNumbersParams =
                VerificationManagementListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementListPhoneNumbersResponse>> =
            listPhoneNumbers(params.toBuilder().action(action).build(), requestOptions)

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            action: VerificationManagementListPhoneNumbersParams.Action,
            params: VerificationManagementListPhoneNumbersParams =
                VerificationManagementListPhoneNumbersParams.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementListPhoneNumbersResponse>> =
            listPhoneNumbers(action, params, RequestOptions.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: VerificationManagementListPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementListPhoneNumbersResponse>>

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: VerificationManagementListPhoneNumbersParams
        ): CompletableFuture<HttpResponseFor<VerificationManagementListPhoneNumbersResponse>> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            action: VerificationManagementListPhoneNumbersParams.Action,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationManagementListPhoneNumbersResponse>> =
            listPhoneNumbers(
                action,
                VerificationManagementListPhoneNumbersParams.none(),
                requestOptions,
            )

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
         * Returns a raw HTTP response for `post
         * /v2/verification/management/phone-numbers/{action}`, but is otherwise the same as
         * [VerificationManagementServiceAsync.setPhoneNumber].
         */
        fun setPhoneNumber(
            action: VerificationManagementSetPhoneNumberParams.Action,
            params: VerificationManagementSetPhoneNumberParams,
        ): CompletableFuture<HttpResponseFor<VerificationManagementSetPhoneNumberResponse>> =
            setPhoneNumber(action, params, RequestOptions.none())

        /** @see setPhoneNumber */
        fun setPhoneNumber(
            action: VerificationManagementSetPhoneNumberParams.Action,
            params: VerificationManagementSetPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementSetPhoneNumberResponse>> =
            setPhoneNumber(params.toBuilder().action(action).build(), requestOptions)

        /** @see setPhoneNumber */
        fun setPhoneNumber(
            params: VerificationManagementSetPhoneNumberParams
        ): CompletableFuture<HttpResponseFor<VerificationManagementSetPhoneNumberResponse>> =
            setPhoneNumber(params, RequestOptions.none())

        /** @see setPhoneNumber */
        fun setPhoneNumber(
            params: VerificationManagementSetPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementSetPhoneNumberResponse>>

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

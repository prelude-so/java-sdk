// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
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
    ): VerificationManagementDeletePhoneNumberResponse =
        deletePhoneNumber(action, params, RequestOptions.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        action: VerificationManagementDeletePhoneNumberParams.Action,
        params: VerificationManagementDeletePhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementDeletePhoneNumberResponse =
        deletePhoneNumber(params.toBuilder().action(action).build(), requestOptions)

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        params: VerificationManagementDeletePhoneNumberParams
    ): VerificationManagementDeletePhoneNumberResponse =
        deletePhoneNumber(params, RequestOptions.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        params: VerificationManagementDeletePhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementDeletePhoneNumberResponse

    /**
     * Retrieve the list of phone numbers in the allow or block list.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun listPhoneNumbers(
        action: VerificationManagementListPhoneNumbersParams.Action
    ): VerificationManagementListPhoneNumbersResponse =
        listPhoneNumbers(action, VerificationManagementListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        action: VerificationManagementListPhoneNumbersParams.Action,
        params: VerificationManagementListPhoneNumbersParams =
            VerificationManagementListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementListPhoneNumbersResponse =
        listPhoneNumbers(params.toBuilder().action(action).build(), requestOptions)

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        action: VerificationManagementListPhoneNumbersParams.Action,
        params: VerificationManagementListPhoneNumbersParams =
            VerificationManagementListPhoneNumbersParams.none(),
    ): VerificationManagementListPhoneNumbersResponse =
        listPhoneNumbers(action, params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: VerificationManagementListPhoneNumbersParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementListPhoneNumbersResponse

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: VerificationManagementListPhoneNumbersParams
    ): VerificationManagementListPhoneNumbersResponse =
        listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        action: VerificationManagementListPhoneNumbersParams.Action,
        requestOptions: RequestOptions,
    ): VerificationManagementListPhoneNumbersResponse =
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
    fun listSenderIds(): VerificationManagementListSenderIdsResponse =
        listSenderIds(VerificationManagementListSenderIdsParams.none())

    /** @see listSenderIds */
    fun listSenderIds(
        params: VerificationManagementListSenderIdsParams =
            VerificationManagementListSenderIdsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementListSenderIdsResponse

    /** @see listSenderIds */
    fun listSenderIds(
        params: VerificationManagementListSenderIdsParams =
            VerificationManagementListSenderIdsParams.none()
    ): VerificationManagementListSenderIdsResponse = listSenderIds(params, RequestOptions.none())

    /** @see listSenderIds */
    fun listSenderIds(requestOptions: RequestOptions): VerificationManagementListSenderIdsResponse =
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
    ): VerificationManagementSetPhoneNumberResponse =
        setPhoneNumber(action, params, RequestOptions.none())

    /** @see setPhoneNumber */
    fun setPhoneNumber(
        action: VerificationManagementSetPhoneNumberParams.Action,
        params: VerificationManagementSetPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementSetPhoneNumberResponse =
        setPhoneNumber(params.toBuilder().action(action).build(), requestOptions)

    /** @see setPhoneNumber */
    fun setPhoneNumber(
        params: VerificationManagementSetPhoneNumberParams
    ): VerificationManagementSetPhoneNumberResponse = setPhoneNumber(params, RequestOptions.none())

    /** @see setPhoneNumber */
    fun setPhoneNumber(
        params: VerificationManagementSetPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementSetPhoneNumberResponse

    /**
     * This endpoint allows you to submit a new sender ID for verification purposes.
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
         * Returns a raw HTTP response for `delete
         * /v2/verification/management/phone-numbers/{action}`, but is otherwise the same as
         * [VerificationManagementService.deletePhoneNumber].
         */
        @MustBeClosed
        fun deletePhoneNumber(
            action: VerificationManagementDeletePhoneNumberParams.Action,
            params: VerificationManagementDeletePhoneNumberParams,
        ): HttpResponseFor<VerificationManagementDeletePhoneNumberResponse> =
            deletePhoneNumber(action, params, RequestOptions.none())

        /** @see deletePhoneNumber */
        @MustBeClosed
        fun deletePhoneNumber(
            action: VerificationManagementDeletePhoneNumberParams.Action,
            params: VerificationManagementDeletePhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementDeletePhoneNumberResponse> =
            deletePhoneNumber(params.toBuilder().action(action).build(), requestOptions)

        /** @see deletePhoneNumber */
        @MustBeClosed
        fun deletePhoneNumber(
            params: VerificationManagementDeletePhoneNumberParams
        ): HttpResponseFor<VerificationManagementDeletePhoneNumberResponse> =
            deletePhoneNumber(params, RequestOptions.none())

        /** @see deletePhoneNumber */
        @MustBeClosed
        fun deletePhoneNumber(
            params: VerificationManagementDeletePhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementDeletePhoneNumberResponse>

        /**
         * Returns a raw HTTP response for `get /v2/verification/management/phone-numbers/{action}`,
         * but is otherwise the same as [VerificationManagementService.listPhoneNumbers].
         */
        @MustBeClosed
        fun listPhoneNumbers(
            action: VerificationManagementListPhoneNumbersParams.Action
        ): HttpResponseFor<VerificationManagementListPhoneNumbersResponse> =
            listPhoneNumbers(action, VerificationManagementListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            action: VerificationManagementListPhoneNumbersParams.Action,
            params: VerificationManagementListPhoneNumbersParams =
                VerificationManagementListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementListPhoneNumbersResponse> =
            listPhoneNumbers(params.toBuilder().action(action).build(), requestOptions)

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            action: VerificationManagementListPhoneNumbersParams.Action,
            params: VerificationManagementListPhoneNumbersParams =
                VerificationManagementListPhoneNumbersParams.none(),
        ): HttpResponseFor<VerificationManagementListPhoneNumbersResponse> =
            listPhoneNumbers(action, params, RequestOptions.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: VerificationManagementListPhoneNumbersParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementListPhoneNumbersResponse>

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: VerificationManagementListPhoneNumbersParams
        ): HttpResponseFor<VerificationManagementListPhoneNumbersResponse> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            action: VerificationManagementListPhoneNumbersParams.Action,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationManagementListPhoneNumbersResponse> =
            listPhoneNumbers(
                action,
                VerificationManagementListPhoneNumbersParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v2/verification/management/sender-id`, but is
         * otherwise the same as [VerificationManagementService.listSenderIds].
         */
        @MustBeClosed
        fun listSenderIds(): HttpResponseFor<VerificationManagementListSenderIdsResponse> =
            listSenderIds(VerificationManagementListSenderIdsParams.none())

        /** @see listSenderIds */
        @MustBeClosed
        fun listSenderIds(
            params: VerificationManagementListSenderIdsParams =
                VerificationManagementListSenderIdsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementListSenderIdsResponse>

        /** @see listSenderIds */
        @MustBeClosed
        fun listSenderIds(
            params: VerificationManagementListSenderIdsParams =
                VerificationManagementListSenderIdsParams.none()
        ): HttpResponseFor<VerificationManagementListSenderIdsResponse> =
            listSenderIds(params, RequestOptions.none())

        /** @see listSenderIds */
        @MustBeClosed
        fun listSenderIds(
            requestOptions: RequestOptions
        ): HttpResponseFor<VerificationManagementListSenderIdsResponse> =
            listSenderIds(VerificationManagementListSenderIdsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v2/verification/management/phone-numbers/{action}`, but is otherwise the same as
         * [VerificationManagementService.setPhoneNumber].
         */
        @MustBeClosed
        fun setPhoneNumber(
            action: VerificationManagementSetPhoneNumberParams.Action,
            params: VerificationManagementSetPhoneNumberParams,
        ): HttpResponseFor<VerificationManagementSetPhoneNumberResponse> =
            setPhoneNumber(action, params, RequestOptions.none())

        /** @see setPhoneNumber */
        @MustBeClosed
        fun setPhoneNumber(
            action: VerificationManagementSetPhoneNumberParams.Action,
            params: VerificationManagementSetPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementSetPhoneNumberResponse> =
            setPhoneNumber(params.toBuilder().action(action).build(), requestOptions)

        /** @see setPhoneNumber */
        @MustBeClosed
        fun setPhoneNumber(
            params: VerificationManagementSetPhoneNumberParams
        ): HttpResponseFor<VerificationManagementSetPhoneNumberResponse> =
            setPhoneNumber(params, RequestOptions.none())

        /** @see setPhoneNumber */
        @MustBeClosed
        fun setPhoneNumber(
            params: VerificationManagementSetPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementSetPhoneNumberResponse>

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

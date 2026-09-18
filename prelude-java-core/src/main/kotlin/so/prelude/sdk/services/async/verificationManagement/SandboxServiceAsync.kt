// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.verificationManagement

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.VerificationManagementSandboxAddPhoneNumberParams
import so.prelude.sdk.models.VerificationManagementSandboxAddPhoneNumberResponse
import so.prelude.sdk.models.VerificationManagementSandboxDeletePhoneNumberParams
import so.prelude.sdk.models.VerificationManagementSandboxDeletePhoneNumberResponse
import so.prelude.sdk.models.VerificationManagementSandboxListPhoneNumbersParams
import so.prelude.sdk.models.VerificationManagementSandboxListPhoneNumbersResponse

/** Verify phone numbers. */
interface SandboxServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxServiceAsync

    /**
     * Register a phone number as a sandbox number and associate it with a fixed attempt code.
     * Subsequent verification attempts against this number will not trigger a real SMS/call and
     * will validate against the configured attempt code.
     *
     * This operation is idempotent - re-adding the same phone number will overwrite the existing
     * attempt code.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun addPhoneNumber(
        params: VerificationManagementSandboxAddPhoneNumberParams
    ): CompletableFuture<VerificationManagementSandboxAddPhoneNumberResponse> =
        addPhoneNumber(params, RequestOptions.none())

    /** @see addPhoneNumber */
    fun addPhoneNumber(
        params: VerificationManagementSandboxAddPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementSandboxAddPhoneNumberResponse>

    /**
     * Remove a phone number from the sandbox list.
     *
     * This operation is idempotent - deleting a phone number that is not in the sandbox list will
     * succeed without making any changes.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun deletePhoneNumber(
        phoneNumber: String
    ): CompletableFuture<VerificationManagementSandboxDeletePhoneNumberResponse> =
        deletePhoneNumber(phoneNumber, VerificationManagementSandboxDeletePhoneNumberParams.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        phoneNumber: String,
        params: VerificationManagementSandboxDeletePhoneNumberParams =
            VerificationManagementSandboxDeletePhoneNumberParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementSandboxDeletePhoneNumberResponse> =
        deletePhoneNumber(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        phoneNumber: String,
        params: VerificationManagementSandboxDeletePhoneNumberParams =
            VerificationManagementSandboxDeletePhoneNumberParams.none(),
    ): CompletableFuture<VerificationManagementSandboxDeletePhoneNumberResponse> =
        deletePhoneNumber(phoneNumber, params, RequestOptions.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        params: VerificationManagementSandboxDeletePhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementSandboxDeletePhoneNumberResponse>

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        params: VerificationManagementSandboxDeletePhoneNumberParams
    ): CompletableFuture<VerificationManagementSandboxDeletePhoneNumberResponse> =
        deletePhoneNumber(params, RequestOptions.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationManagementSandboxDeletePhoneNumberResponse> =
        deletePhoneNumber(
            phoneNumber,
            VerificationManagementSandboxDeletePhoneNumberParams.none(),
            requestOptions,
        )

    /**
     * Retrieve the list of sandbox phone numbers for the account. Sandbox numbers are test numbers
     * that bypass the real verification flow and return a fixed attempt code.
     *
     * In order to get access to this endpoint, contact our support team.
     */
    fun listPhoneNumbers():
        CompletableFuture<VerificationManagementSandboxListPhoneNumbersResponse> =
        listPhoneNumbers(VerificationManagementSandboxListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: VerificationManagementSandboxListPhoneNumbersParams =
            VerificationManagementSandboxListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<VerificationManagementSandboxListPhoneNumbersResponse>

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: VerificationManagementSandboxListPhoneNumbersParams =
            VerificationManagementSandboxListPhoneNumbersParams.none()
    ): CompletableFuture<VerificationManagementSandboxListPhoneNumbersResponse> =
        listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        requestOptions: RequestOptions
    ): CompletableFuture<VerificationManagementSandboxListPhoneNumbersResponse> =
        listPhoneNumbers(VerificationManagementSandboxListPhoneNumbersParams.none(), requestOptions)

    /**
     * A view of [SandboxServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /v2/verification/management/phone-numbers/sandbox`,
         * but is otherwise the same as [SandboxServiceAsync.addPhoneNumber].
         */
        fun addPhoneNumber(
            params: VerificationManagementSandboxAddPhoneNumberParams
        ): CompletableFuture<HttpResponseFor<VerificationManagementSandboxAddPhoneNumberResponse>> =
            addPhoneNumber(params, RequestOptions.none())

        /** @see addPhoneNumber */
        fun addPhoneNumber(
            params: VerificationManagementSandboxAddPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementSandboxAddPhoneNumberResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v2/verification/management/phone-numbers/sandbox/{phone_number}`, but is otherwise the
         * same as [SandboxServiceAsync.deletePhoneNumber].
         */
        fun deletePhoneNumber(
            phoneNumber: String
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse>
        > =
            deletePhoneNumber(
                phoneNumber,
                VerificationManagementSandboxDeletePhoneNumberParams.none(),
            )

        /** @see deletePhoneNumber */
        fun deletePhoneNumber(
            phoneNumber: String,
            params: VerificationManagementSandboxDeletePhoneNumberParams =
                VerificationManagementSandboxDeletePhoneNumberParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse>
        > = deletePhoneNumber(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see deletePhoneNumber */
        fun deletePhoneNumber(
            phoneNumber: String,
            params: VerificationManagementSandboxDeletePhoneNumberParams =
                VerificationManagementSandboxDeletePhoneNumberParams.none(),
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse>
        > = deletePhoneNumber(phoneNumber, params, RequestOptions.none())

        /** @see deletePhoneNumber */
        fun deletePhoneNumber(
            params: VerificationManagementSandboxDeletePhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse>
        >

        /** @see deletePhoneNumber */
        fun deletePhoneNumber(
            params: VerificationManagementSandboxDeletePhoneNumberParams
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse>
        > = deletePhoneNumber(params, RequestOptions.none())

        /** @see deletePhoneNumber */
        fun deletePhoneNumber(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse>
        > =
            deletePhoneNumber(
                phoneNumber,
                VerificationManagementSandboxDeletePhoneNumberParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v2/verification/management/phone-numbers/sandbox`,
         * but is otherwise the same as [SandboxServiceAsync.listPhoneNumbers].
         */
        fun listPhoneNumbers():
            CompletableFuture<
                HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse>
            > = listPhoneNumbers(VerificationManagementSandboxListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: VerificationManagementSandboxListPhoneNumbersParams =
                VerificationManagementSandboxListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse>>

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            params: VerificationManagementSandboxListPhoneNumbersParams =
                VerificationManagementSandboxListPhoneNumbersParams.none()
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse>
        > = listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        fun listPhoneNumbers(
            requestOptions: RequestOptions
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse>
        > =
            listPhoneNumbers(
                VerificationManagementSandboxListPhoneNumbersParams.none(),
                requestOptions,
            )
    }
}

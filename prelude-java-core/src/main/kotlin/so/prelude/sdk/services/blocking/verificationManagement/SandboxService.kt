// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking.verificationManagement

import com.google.errorprone.annotations.MustBeClosed
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
interface SandboxService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService

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
    ): VerificationManagementSandboxAddPhoneNumberResponse =
        addPhoneNumber(params, RequestOptions.none())

    /** @see addPhoneNumber */
    fun addPhoneNumber(
        params: VerificationManagementSandboxAddPhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementSandboxAddPhoneNumberResponse

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
    ): VerificationManagementSandboxDeletePhoneNumberResponse =
        deletePhoneNumber(phoneNumber, VerificationManagementSandboxDeletePhoneNumberParams.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        phoneNumber: String,
        params: VerificationManagementSandboxDeletePhoneNumberParams =
            VerificationManagementSandboxDeletePhoneNumberParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementSandboxDeletePhoneNumberResponse =
        deletePhoneNumber(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        phoneNumber: String,
        params: VerificationManagementSandboxDeletePhoneNumberParams =
            VerificationManagementSandboxDeletePhoneNumberParams.none(),
    ): VerificationManagementSandboxDeletePhoneNumberResponse =
        deletePhoneNumber(phoneNumber, params, RequestOptions.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        params: VerificationManagementSandboxDeletePhoneNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementSandboxDeletePhoneNumberResponse

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        params: VerificationManagementSandboxDeletePhoneNumberParams
    ): VerificationManagementSandboxDeletePhoneNumberResponse =
        deletePhoneNumber(params, RequestOptions.none())

    /** @see deletePhoneNumber */
    fun deletePhoneNumber(
        phoneNumber: String,
        requestOptions: RequestOptions,
    ): VerificationManagementSandboxDeletePhoneNumberResponse =
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
    fun listPhoneNumbers(): VerificationManagementSandboxListPhoneNumbersResponse =
        listPhoneNumbers(VerificationManagementSandboxListPhoneNumbersParams.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: VerificationManagementSandboxListPhoneNumbersParams =
            VerificationManagementSandboxListPhoneNumbersParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): VerificationManagementSandboxListPhoneNumbersResponse

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        params: VerificationManagementSandboxListPhoneNumbersParams =
            VerificationManagementSandboxListPhoneNumbersParams.none()
    ): VerificationManagementSandboxListPhoneNumbersResponse =
        listPhoneNumbers(params, RequestOptions.none())

    /** @see listPhoneNumbers */
    fun listPhoneNumbers(
        requestOptions: RequestOptions
    ): VerificationManagementSandboxListPhoneNumbersResponse =
        listPhoneNumbers(VerificationManagementSandboxListPhoneNumbersParams.none(), requestOptions)

    /** A view of [SandboxService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxService.WithRawResponse

        /**
         * Returns a raw HTTP response for `put /v2/verification/management/phone-numbers/sandbox`,
         * but is otherwise the same as [SandboxService.addPhoneNumber].
         */
        @MustBeClosed
        fun addPhoneNumber(
            params: VerificationManagementSandboxAddPhoneNumberParams
        ): HttpResponseFor<VerificationManagementSandboxAddPhoneNumberResponse> =
            addPhoneNumber(params, RequestOptions.none())

        /** @see addPhoneNumber */
        @MustBeClosed
        fun addPhoneNumber(
            params: VerificationManagementSandboxAddPhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementSandboxAddPhoneNumberResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v2/verification/management/phone-numbers/sandbox/{phone_number}`, but is otherwise the
         * same as [SandboxService.deletePhoneNumber].
         */
        @MustBeClosed
        fun deletePhoneNumber(
            phoneNumber: String
        ): HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse> =
            deletePhoneNumber(
                phoneNumber,
                VerificationManagementSandboxDeletePhoneNumberParams.none(),
            )

        /** @see deletePhoneNumber */
        @MustBeClosed
        fun deletePhoneNumber(
            phoneNumber: String,
            params: VerificationManagementSandboxDeletePhoneNumberParams =
                VerificationManagementSandboxDeletePhoneNumberParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse> =
            deletePhoneNumber(params.toBuilder().phoneNumber(phoneNumber).build(), requestOptions)

        /** @see deletePhoneNumber */
        @MustBeClosed
        fun deletePhoneNumber(
            phoneNumber: String,
            params: VerificationManagementSandboxDeletePhoneNumberParams =
                VerificationManagementSandboxDeletePhoneNumberParams.none(),
        ): HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse> =
            deletePhoneNumber(phoneNumber, params, RequestOptions.none())

        /** @see deletePhoneNumber */
        @MustBeClosed
        fun deletePhoneNumber(
            params: VerificationManagementSandboxDeletePhoneNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse>

        /** @see deletePhoneNumber */
        @MustBeClosed
        fun deletePhoneNumber(
            params: VerificationManagementSandboxDeletePhoneNumberParams
        ): HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse> =
            deletePhoneNumber(params, RequestOptions.none())

        /** @see deletePhoneNumber */
        @MustBeClosed
        fun deletePhoneNumber(
            phoneNumber: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse> =
            deletePhoneNumber(
                phoneNumber,
                VerificationManagementSandboxDeletePhoneNumberParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v2/verification/management/phone-numbers/sandbox`,
         * but is otherwise the same as [SandboxService.listPhoneNumbers].
         */
        @MustBeClosed
        fun listPhoneNumbers():
            HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse> =
            listPhoneNumbers(VerificationManagementSandboxListPhoneNumbersParams.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: VerificationManagementSandboxListPhoneNumbersParams =
                VerificationManagementSandboxListPhoneNumbersParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse>

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            params: VerificationManagementSandboxListPhoneNumbersParams =
                VerificationManagementSandboxListPhoneNumbersParams.none()
        ): HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse> =
            listPhoneNumbers(params, RequestOptions.none())

        /** @see listPhoneNumbers */
        @MustBeClosed
        fun listPhoneNumbers(
            requestOptions: RequestOptions
        ): HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse> =
            listPhoneNumbers(
                VerificationManagementSandboxListPhoneNumbersParams.none(),
                requestOptions,
            )
    }
}

// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package so.prelude.sdk.services.blocking

import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.models.VerificationCheckParams
import so.prelude.sdk.models.VerificationCheckResponse
import so.prelude.sdk.models.VerificationCreateParams
import so.prelude.sdk.models.VerificationCreateResponse

interface VerificationService {

    /**
     * Create a new verification for a specific phone number. If another non-expired verification
     * exists (the request is performed within the verification window), this endpoint will perform
     * a retry instead.
     */
    @JvmOverloads
    fun create(
        params: VerificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VerificationCreateResponse

    /** Check the validity of a verification code. */
    @JvmOverloads
    fun check(
        params: VerificationCheckParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): VerificationCheckResponse
}

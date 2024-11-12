// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.prelude_so.api.services.async

import com.prelude_so.api.core.RequestOptions
import com.prelude_so.api.models.VerificationCheckParams
import com.prelude_so.api.models.VerificationCheckResponse
import com.prelude_so.api.models.VerificationCreateParams
import com.prelude_so.api.models.VerificationCreateResponse
import java.util.concurrent.CompletableFuture

interface VerificationServiceAsync {

    /**
     * Create a new verification for a specific phone number. If another non-expired verification
     * exists (the request is performed within the verification window), this endpoint will perform
     * a retry instead.
     */
    @JvmOverloads
    fun create(
        params: VerificationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<VerificationCreateResponse>

    /** Check the validity of a verification code. */
    @JvmOverloads
    fun check(
        params: VerificationCheckParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<VerificationCheckResponse>
}

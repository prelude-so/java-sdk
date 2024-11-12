// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.services.async

import com.prelude_so.api.core.ClientOptions
import com.prelude_so.api.core.RequestOptions
import com.prelude_so.api.core.handlers.errorHandler
import com.prelude_so.api.core.handlers.jsonHandler
import com.prelude_so.api.core.handlers.withErrorHandler
import com.prelude_so.api.core.http.HttpMethod
import com.prelude_so.api.core.http.HttpRequest
import com.prelude_so.api.core.http.HttpResponse.Handler
import com.prelude_so.api.core.json
import com.prelude_so.api.errors.PreludeError
import com.prelude_so.api.models.VerificationCheckParams
import com.prelude_so.api.models.VerificationCheckResponse
import com.prelude_so.api.models.VerificationCreateParams
import com.prelude_so.api.models.VerificationCreateResponse
import java.util.concurrent.CompletableFuture

class VerificationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : VerificationServiceAsync {

    private val errorHandler: Handler<PreludeError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<VerificationCreateResponse> =
        jsonHandler<VerificationCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Create a new verification for a specific phone number. If another non-expired verification
     * exists (the request is performed within the verification window), this endpoint will perform
     * a retry instead.
     */
    override fun create(
        params: VerificationCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<VerificationCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "verification")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val checkHandler: Handler<VerificationCheckResponse> =
        jsonHandler<VerificationCheckResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Check the validity of a verification code. */
    override fun check(
        params: VerificationCheckParams,
        requestOptions: RequestOptions
    ): CompletableFuture<VerificationCheckResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "verification", "check")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { checkHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

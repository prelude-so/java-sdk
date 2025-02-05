// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.handlers.errorHandler
import so.prelude.sdk.core.handlers.jsonHandler
import so.prelude.sdk.core.handlers.withErrorHandler
import so.prelude.sdk.core.http.HttpMethod
import so.prelude.sdk.core.http.HttpRequest
import so.prelude.sdk.core.http.HttpResponse.Handler
import so.prelude.sdk.core.json
import so.prelude.sdk.core.prepare
import so.prelude.sdk.errors.PreludeError
import so.prelude.sdk.models.VerificationCheckParams
import so.prelude.sdk.models.VerificationCheckResponse
import so.prelude.sdk.models.VerificationCreateParams
import so.prelude.sdk.models.VerificationCreateResponse

class VerificationServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : VerificationService {

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
    ): VerificationCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "verification")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
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
    ): VerificationCheckResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "verification", "check")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { checkHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}

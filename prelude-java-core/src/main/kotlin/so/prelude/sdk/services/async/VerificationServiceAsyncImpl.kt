// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.handlers.errorHandler
import so.prelude.sdk.core.handlers.jsonHandler
import so.prelude.sdk.core.handlers.withErrorHandler
import so.prelude.sdk.core.http.HttpMethod
import so.prelude.sdk.core.http.HttpRequest
import so.prelude.sdk.core.http.HttpResponse.Handler
import so.prelude.sdk.core.json
import so.prelude.sdk.core.prepareAsync
import so.prelude.sdk.errors.PreludeError
import so.prelude.sdk.models.VerificationCheckParams
import so.prelude.sdk.models.VerificationCheckResponse
import so.prelude.sdk.models.VerificationCreateParams
import so.prelude.sdk.models.VerificationCreateResponse

class VerificationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationServiceAsync {

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
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "verification")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationCheckResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "verification", "check")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { checkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
    }
}

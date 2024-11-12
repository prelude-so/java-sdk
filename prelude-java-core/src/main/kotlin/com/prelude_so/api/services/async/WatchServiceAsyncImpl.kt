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
import com.prelude_so.api.models.WatchFeedBackParams
import com.prelude_so.api.models.WatchFeedBackResponse
import com.prelude_so.api.models.WatchPredictParams
import com.prelude_so.api.models.WatchPredictResponse
import java.util.concurrent.CompletableFuture

class WatchServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : WatchServiceAsync {

    private val errorHandler: Handler<PreludeError> = errorHandler(clientOptions.jsonMapper)

    private val feedBackHandler: Handler<WatchFeedBackResponse> =
        jsonHandler<WatchFeedBackResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Once the user with a trustworthy phone number demonstrates authentic behavior, call this
     * endpoint to report their authenticity to our systems.
     */
    override fun feedBack(
        params: WatchFeedBackParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WatchFeedBackResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "watch", "feedback")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { feedBackHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val predictHandler: Handler<WatchPredictResponse> =
        jsonHandler<WatchPredictResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Identify trustworthy phone numbers to mitigate fake traffic or traffic involved in fraud and
     * international revenue share fraud (IRSF) patterns. This endpoint must be implemented in
     * conjunction with the `watch/feedback` endpoint.
     */
    override fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions
    ): CompletableFuture<WatchPredictResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "watch", "predict")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { predictHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

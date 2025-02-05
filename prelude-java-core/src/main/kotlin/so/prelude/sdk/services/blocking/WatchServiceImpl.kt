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
import so.prelude.sdk.models.WatchFeedBackParams
import so.prelude.sdk.models.WatchFeedBackResponse
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse

class WatchServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : WatchService {

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
    ): WatchFeedBackResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "watch", "feedback")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
    ): WatchPredictResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "watch", "predict")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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

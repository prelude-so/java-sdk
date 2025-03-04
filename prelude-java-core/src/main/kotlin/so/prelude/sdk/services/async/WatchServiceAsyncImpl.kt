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
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.core.http.parseable
import so.prelude.sdk.core.json
import so.prelude.sdk.core.prepareAsync
import so.prelude.sdk.errors.PreludeError
import so.prelude.sdk.models.WatchFeedBackParams
import so.prelude.sdk.models.WatchFeedBackResponse
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse

class WatchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WatchServiceAsync {

    private val withRawResponse: WatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WatchServiceAsync.WithRawResponse = withRawResponse

    override fun feedBack(
        params: WatchFeedBackParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchFeedBackResponse> =
        // post /v2/watch/feedback
        withRawResponse().feedBack(params, requestOptions).thenApply { it.parse() }

    override fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchPredictResponse> =
        // post /v2/watch/predict
        withRawResponse().predict(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WatchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<PreludeError> = errorHandler(clientOptions.jsonMapper)

        private val feedBackHandler: Handler<WatchFeedBackResponse> =
            jsonHandler<WatchFeedBackResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun feedBack(
            params: WatchFeedBackParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchFeedBackResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "watch", "feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { feedBackHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val predictHandler: Handler<WatchPredictResponse> =
            jsonHandler<WatchPredictResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun predict(
            params: WatchPredictParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchPredictResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "watch", "predict")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { predictHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}

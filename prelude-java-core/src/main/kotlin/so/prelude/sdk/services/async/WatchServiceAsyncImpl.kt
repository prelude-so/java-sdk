// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.handlers.errorBodyHandler
import so.prelude.sdk.core.handlers.errorHandler
import so.prelude.sdk.core.handlers.jsonHandler
import so.prelude.sdk.core.http.HttpMethod
import so.prelude.sdk.core.http.HttpRequest
import so.prelude.sdk.core.http.HttpResponse
import so.prelude.sdk.core.http.HttpResponse.Handler
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.core.http.json
import so.prelude.sdk.core.http.parseable
import so.prelude.sdk.core.prepareAsync
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse
import so.prelude.sdk.models.WatchSendEventsParams
import so.prelude.sdk.models.WatchSendEventsResponse
import so.prelude.sdk.models.WatchSendFeedbacksParams
import so.prelude.sdk.models.WatchSendFeedbacksResponse

class WatchServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WatchServiceAsync {

    private val withRawResponse: WatchServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WatchServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchServiceAsync =
        WatchServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchPredictResponse> =
        // post /v2/watch/predict
        withRawResponse().predict(params, requestOptions).thenApply { it.parse() }

    override fun sendEvents(
        params: WatchSendEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchSendEventsResponse> =
        // post /v2/watch/event
        withRawResponse().sendEvents(params, requestOptions).thenApply { it.parse() }

    override fun sendFeedbacks(
        params: WatchSendFeedbacksParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<WatchSendFeedbacksResponse> =
        // post /v2/watch/feedback
        withRawResponse().sendFeedbacks(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WatchServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WatchServiceAsync.WithRawResponse =
            WatchServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val predictHandler: Handler<WatchPredictResponse> =
            jsonHandler<WatchPredictResponse>(clientOptions.jsonMapper)

        override fun predict(
            params: WatchPredictParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchPredictResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "watch", "predict")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val sendEventsHandler: Handler<WatchSendEventsResponse> =
            jsonHandler<WatchSendEventsResponse>(clientOptions.jsonMapper)

        override fun sendEvents(
            params: WatchSendEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchSendEventsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "watch", "event")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendFeedbacksHandler: Handler<WatchSendFeedbacksResponse> =
            jsonHandler<WatchSendFeedbacksResponse>(clientOptions.jsonMapper)

        override fun sendFeedbacks(
            params: WatchSendFeedbacksParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<WatchSendFeedbacksResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "watch", "feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendFeedbacksHandler.handle(it) }
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

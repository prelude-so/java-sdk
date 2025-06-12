// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.handlers.errorHandler
import so.prelude.sdk.core.handlers.jsonHandler
import so.prelude.sdk.core.handlers.withErrorHandler
import so.prelude.sdk.core.http.HttpMethod
import so.prelude.sdk.core.http.HttpRequest
import so.prelude.sdk.core.http.HttpResponse.Handler
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.core.http.json
import so.prelude.sdk.core.http.parseable
import so.prelude.sdk.core.prepare
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse
import so.prelude.sdk.models.WatchSendEventsParams
import so.prelude.sdk.models.WatchSendEventsResponse
import so.prelude.sdk.models.WatchSendFeedbacksParams
import so.prelude.sdk.models.WatchSendFeedbacksResponse

class WatchServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    WatchService {

    private val withRawResponse: WatchService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WatchService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchService =
        WatchServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions,
    ): WatchPredictResponse =
        // post /v2/watch/predict
        withRawResponse().predict(params, requestOptions).parse()

    override fun sendEvents(
        params: WatchSendEventsParams,
        requestOptions: RequestOptions,
    ): WatchSendEventsResponse =
        // post /v2/watch/event
        withRawResponse().sendEvents(params, requestOptions).parse()

    override fun sendFeedbacks(
        params: WatchSendFeedbacksParams,
        requestOptions: RequestOptions,
    ): WatchSendFeedbacksResponse =
        // post /v2/watch/feedback
        withRawResponse().sendFeedbacks(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WatchService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WatchService.WithRawResponse =
            WatchServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val predictHandler: Handler<WatchPredictResponse> =
            jsonHandler<WatchPredictResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun predict(
            params: WatchPredictParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchPredictResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "watch", "predict")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { predictHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendEventsHandler: Handler<WatchSendEventsResponse> =
            jsonHandler<WatchSendEventsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun sendEvents(
            params: WatchSendEventsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchSendEventsResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "watch", "event")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { sendEventsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val sendFeedbacksHandler: Handler<WatchSendFeedbacksResponse> =
            jsonHandler<WatchSendFeedbacksResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun sendFeedbacks(
            params: WatchSendFeedbacksParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WatchSendFeedbacksResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "watch", "feedback")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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

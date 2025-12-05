// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.checkRequired
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
import so.prelude.sdk.models.NotifyGetSubscriptionConfigParams
import so.prelude.sdk.models.NotifyGetSubscriptionConfigResponse
import so.prelude.sdk.models.NotifyGetSubscriptionPhoneNumberParams
import so.prelude.sdk.models.NotifyGetSubscriptionPhoneNumberResponse
import so.prelude.sdk.models.NotifyListSubscriptionConfigsParams
import so.prelude.sdk.models.NotifyListSubscriptionConfigsResponse
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumberEventsParams
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumberEventsResponse
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumbersParams
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumbersResponse
import so.prelude.sdk.models.NotifySendBatchParams
import so.prelude.sdk.models.NotifySendBatchResponse
import so.prelude.sdk.models.NotifySendParams
import so.prelude.sdk.models.NotifySendResponse

class NotifyServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NotifyServiceAsync {

    private val withRawResponse: NotifyServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NotifyServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NotifyServiceAsync =
        NotifyServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun getSubscriptionConfig(
        params: NotifyGetSubscriptionConfigParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifyGetSubscriptionConfigResponse> =
        // get /v2/notify/management/subscriptions/{config_id}
        withRawResponse().getSubscriptionConfig(params, requestOptions).thenApply { it.parse() }

    override fun getSubscriptionPhoneNumber(
        params: NotifyGetSubscriptionPhoneNumberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifyGetSubscriptionPhoneNumberResponse> =
        // get /v2/notify/management/subscriptions/{config_id}/phone_numbers/{phone_number}
        withRawResponse().getSubscriptionPhoneNumber(params, requestOptions).thenApply {
            it.parse()
        }

    override fun listSubscriptionConfigs(
        params: NotifyListSubscriptionConfigsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifyListSubscriptionConfigsResponse> =
        // get /v2/notify/management/subscriptions
        withRawResponse().listSubscriptionConfigs(params, requestOptions).thenApply { it.parse() }

    override fun listSubscriptionPhoneNumberEvents(
        params: NotifyListSubscriptionPhoneNumberEventsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifyListSubscriptionPhoneNumberEventsResponse> =
        // get /v2/notify/management/subscriptions/{config_id}/phone_numbers/{phone_number}/events
        withRawResponse().listSubscriptionPhoneNumberEvents(params, requestOptions).thenApply {
            it.parse()
        }

    override fun listSubscriptionPhoneNumbers(
        params: NotifyListSubscriptionPhoneNumbersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifyListSubscriptionPhoneNumbersResponse> =
        // get /v2/notify/management/subscriptions/{config_id}/phone_numbers
        withRawResponse().listSubscriptionPhoneNumbers(params, requestOptions).thenApply {
            it.parse()
        }

    override fun send(
        params: NotifySendParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifySendResponse> =
        // post /v2/notify
        withRawResponse().send(params, requestOptions).thenApply { it.parse() }

    override fun sendBatch(
        params: NotifySendBatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NotifySendBatchResponse> =
        // post /v2/notify/batch
        withRawResponse().sendBatch(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NotifyServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NotifyServiceAsync.WithRawResponse =
            NotifyServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val getSubscriptionConfigHandler: Handler<NotifyGetSubscriptionConfigResponse> =
            jsonHandler<NotifyGetSubscriptionConfigResponse>(clientOptions.jsonMapper)

        override fun getSubscriptionConfig(
            params: NotifyGetSubscriptionConfigParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionConfigResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "notify",
                        "management",
                        "subscriptions",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSubscriptionConfigHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val getSubscriptionPhoneNumberHandler:
            Handler<NotifyGetSubscriptionPhoneNumberResponse> =
            jsonHandler<NotifyGetSubscriptionPhoneNumberResponse>(clientOptions.jsonMapper)

        override fun getSubscriptionPhoneNumber(
            params: NotifyGetSubscriptionPhoneNumberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifyGetSubscriptionPhoneNumberResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "notify",
                        "management",
                        "subscriptions",
                        params._pathParam(0),
                        "phone_numbers",
                        params._pathParam(1),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { getSubscriptionPhoneNumberHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listSubscriptionConfigsHandler: Handler<NotifyListSubscriptionConfigsResponse> =
            jsonHandler<NotifyListSubscriptionConfigsResponse>(clientOptions.jsonMapper)

        override fun listSubscriptionConfigs(
            params: NotifyListSubscriptionConfigsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionConfigsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "notify", "management", "subscriptions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSubscriptionConfigsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listSubscriptionPhoneNumberEventsHandler:
            Handler<NotifyListSubscriptionPhoneNumberEventsResponse> =
            jsonHandler<NotifyListSubscriptionPhoneNumberEventsResponse>(clientOptions.jsonMapper)

        override fun listSubscriptionPhoneNumberEvents(
            params: NotifyListSubscriptionPhoneNumberEventsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumberEventsResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "notify",
                        "management",
                        "subscriptions",
                        params._pathParam(0),
                        "phone_numbers",
                        params._pathParam(1),
                        "events",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSubscriptionPhoneNumberEventsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listSubscriptionPhoneNumbersHandler:
            Handler<NotifyListSubscriptionPhoneNumbersResponse> =
            jsonHandler<NotifyListSubscriptionPhoneNumbersResponse>(clientOptions.jsonMapper)

        override fun listSubscriptionPhoneNumbers(
            params: NotifyListSubscriptionPhoneNumbersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifyListSubscriptionPhoneNumbersResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("configId", params.configId().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "notify",
                        "management",
                        "subscriptions",
                        params._pathParam(0),
                        "phone_numbers",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSubscriptionPhoneNumbersHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendHandler: Handler<NotifySendResponse> =
            jsonHandler<NotifySendResponse>(clientOptions.jsonMapper)

        override fun send(
            params: NotifySendParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifySendResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "notify")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val sendBatchHandler: Handler<NotifySendBatchResponse> =
            jsonHandler<NotifySendBatchResponse>(clientOptions.jsonMapper)

        override fun sendBatch(
            params: NotifySendBatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NotifySendBatchResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "notify", "batch")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { sendBatchHandler.handle(it) }
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

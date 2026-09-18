// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.verification.phone

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
import so.prelude.sdk.core.http.parseable
import so.prelude.sdk.core.prepareAsync
import so.prelude.sdk.models.VerificationPhoneHistoryListParams
import so.prelude.sdk.models.VerificationPhoneHistoryListResponse
import so.prelude.sdk.models.VerificationPhoneHistoryRetrieveParams
import so.prelude.sdk.models.VerificationPhoneHistoryRetrieveResponse

/** Verify phone numbers. */
class HistoryServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryServiceAsync {

    private val withRawResponse: HistoryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryServiceAsync =
        HistoryServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: VerificationPhoneHistoryRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationPhoneHistoryRetrieveResponse> =
        // get /v2/verification/phone/history/{id}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: VerificationPhoneHistoryListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationPhoneHistoryListResponse> =
        // get /v2/verification/phone/history
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryServiceAsync.WithRawResponse =
            HistoryServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<VerificationPhoneHistoryRetrieveResponse> =
            jsonHandler<VerificationPhoneHistoryRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VerificationPhoneHistoryRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationPhoneHistoryRetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "phone", "history", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<VerificationPhoneHistoryListResponse> =
            jsonHandler<VerificationPhoneHistoryListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerificationPhoneHistoryListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationPhoneHistoryListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "phone", "history")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
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

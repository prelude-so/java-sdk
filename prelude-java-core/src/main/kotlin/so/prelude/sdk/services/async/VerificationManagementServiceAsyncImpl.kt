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
import so.prelude.sdk.models.VerificationManagementListSenderIdsParams
import so.prelude.sdk.models.VerificationManagementListSenderIdsResponse
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdParams
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdResponse

class VerificationManagementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    VerificationManagementServiceAsync {

    private val withRawResponse: VerificationManagementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerificationManagementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VerificationManagementServiceAsync =
        VerificationManagementServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier::accept).build()
        )

    override fun listSenderIds(
        params: VerificationManagementListSenderIdsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationManagementListSenderIdsResponse> =
        // get /v2/verification/management/sender-id
        withRawResponse().listSenderIds(params, requestOptions).thenApply { it.parse() }

    override fun submitSenderId(
        params: VerificationManagementSubmitSenderIdParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationManagementSubmitSenderIdResponse> =
        // post /v2/verification/management/sender-id
        withRawResponse().submitSenderId(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationManagementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationManagementServiceAsync.WithRawResponse =
            VerificationManagementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listSenderIdsHandler: Handler<VerificationManagementListSenderIdsResponse> =
            jsonHandler<VerificationManagementListSenderIdsResponse>(clientOptions.jsonMapper)

        override fun listSenderIds(
            params: VerificationManagementListSenderIdsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationManagementListSenderIdsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "management", "sender-id")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listSenderIdsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val submitSenderIdHandler: Handler<VerificationManagementSubmitSenderIdResponse> =
            jsonHandler<VerificationManagementSubmitSenderIdResponse>(clientOptions.jsonMapper)

        override fun submitSenderId(
            params: VerificationManagementSubmitSenderIdParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationManagementSubmitSenderIdResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "management", "sender-id")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { submitSenderIdHandler.handle(it) }
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

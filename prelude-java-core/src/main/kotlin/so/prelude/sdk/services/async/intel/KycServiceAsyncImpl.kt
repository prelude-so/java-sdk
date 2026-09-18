// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.intel

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
import so.prelude.sdk.models.IntelKycMatchParams
import so.prelude.sdk.models.IntelKycMatchResponse

/**
 * Retrieve detailed information about a phone number including carrier data, line type, and
 * portability status.
 */
class KycServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    KycServiceAsync {

    private val withRawResponse: KycServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): KycServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KycServiceAsync =
        KycServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun match(
        params: IntelKycMatchParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<IntelKycMatchResponse> =
        // post /v2/intel/kyc/match/{phone}
        withRawResponse().match(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KycServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KycServiceAsync.WithRawResponse =
            KycServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val matchHandler: Handler<IntelKycMatchResponse> =
            jsonHandler<IntelKycMatchResponse>(clientOptions.jsonMapper)

        override fun match(
            params: IntelKycMatchParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<IntelKycMatchResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phone", params.phone().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "intel", "kyc", "match", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { matchHandler.handle(it) }
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

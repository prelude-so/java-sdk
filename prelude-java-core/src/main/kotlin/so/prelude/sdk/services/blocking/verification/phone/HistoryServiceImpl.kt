// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking.verification.phone

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
import so.prelude.sdk.core.prepare
import so.prelude.sdk.models.VerificationPhoneHistoryListParams
import so.prelude.sdk.models.VerificationPhoneHistoryListResponse
import so.prelude.sdk.models.VerificationPhoneHistoryRetrieveParams
import so.prelude.sdk.models.VerificationPhoneHistoryRetrieveResponse

/** Verify phone numbers. */
class HistoryServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    HistoryService {

    private val withRawResponse: HistoryService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HistoryService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HistoryService =
        HistoryServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: VerificationPhoneHistoryRetrieveParams,
        requestOptions: RequestOptions,
    ): VerificationPhoneHistoryRetrieveResponse =
        // get /v2/verification/phone/history/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: VerificationPhoneHistoryListParams,
        requestOptions: RequestOptions,
    ): VerificationPhoneHistoryListResponse =
        // get /v2/verification/phone/history
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HistoryService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HistoryService.WithRawResponse =
            HistoryServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<VerificationPhoneHistoryRetrieveResponse> =
            jsonHandler<VerificationPhoneHistoryRetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: VerificationPhoneHistoryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationPhoneHistoryRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "phone", "history", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<VerificationPhoneHistoryListResponse> =
            jsonHandler<VerificationPhoneHistoryListResponse>(clientOptions.jsonMapper)

        override fun list(
            params: VerificationPhoneHistoryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationPhoneHistoryListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "phone", "history")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

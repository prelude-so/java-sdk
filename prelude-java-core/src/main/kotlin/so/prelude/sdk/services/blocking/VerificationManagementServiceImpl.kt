// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

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
import so.prelude.sdk.core.prepare
import so.prelude.sdk.models.VerificationManagementListSenderIdsParams
import so.prelude.sdk.models.VerificationManagementListSenderIdsResponse
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdParams
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdResponse

class VerificationManagementServiceImpl
internal constructor(private val clientOptions: ClientOptions) : VerificationManagementService {

    private val withRawResponse: VerificationManagementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerificationManagementService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): VerificationManagementService =
        VerificationManagementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun listSenderIds(
        params: VerificationManagementListSenderIdsParams,
        requestOptions: RequestOptions,
    ): List<VerificationManagementListSenderIdsResponse> =
        // get /v2/verification/management/sender-id
        withRawResponse().listSenderIds(params, requestOptions).parse()

    override fun submitSenderId(
        params: VerificationManagementSubmitSenderIdParams,
        requestOptions: RequestOptions,
    ): VerificationManagementSubmitSenderIdResponse =
        // post /v2/verification/management/sender-id
        withRawResponse().submitSenderId(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationManagementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): VerificationManagementService.WithRawResponse =
            VerificationManagementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listSenderIdsHandler:
            Handler<List<VerificationManagementListSenderIdsResponse>> =
            jsonHandler<List<VerificationManagementListSenderIdsResponse>>(clientOptions.jsonMapper)

        override fun listSenderIds(
            params: VerificationManagementListSenderIdsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<VerificationManagementListSenderIdsResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "management", "sender-id")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listSenderIdsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val submitSenderIdHandler: Handler<VerificationManagementSubmitSenderIdResponse> =
            jsonHandler<VerificationManagementSubmitSenderIdResponse>(clientOptions.jsonMapper)

        override fun submitSenderId(
            params: VerificationManagementSubmitSenderIdParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationManagementSubmitSenderIdResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "management", "sender-id")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

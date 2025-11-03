// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

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
import so.prelude.sdk.core.prepare
import so.prelude.sdk.models.VerificationManagementDeletePhoneNumberParams
import so.prelude.sdk.models.VerificationManagementDeletePhoneNumberResponse
import so.prelude.sdk.models.VerificationManagementListPhoneNumbersParams
import so.prelude.sdk.models.VerificationManagementListPhoneNumbersResponse
import so.prelude.sdk.models.VerificationManagementListSenderIdsParams
import so.prelude.sdk.models.VerificationManagementListSenderIdsResponse
import so.prelude.sdk.models.VerificationManagementSetPhoneNumberParams
import so.prelude.sdk.models.VerificationManagementSetPhoneNumberResponse
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

    override fun deletePhoneNumber(
        params: VerificationManagementDeletePhoneNumberParams,
        requestOptions: RequestOptions,
    ): VerificationManagementDeletePhoneNumberResponse =
        // delete /v2/verification/management/phone-numbers/{action}
        withRawResponse().deletePhoneNumber(params, requestOptions).parse()

    override fun listPhoneNumbers(
        params: VerificationManagementListPhoneNumbersParams,
        requestOptions: RequestOptions,
    ): VerificationManagementListPhoneNumbersResponse =
        // get /v2/verification/management/phone-numbers/{action}
        withRawResponse().listPhoneNumbers(params, requestOptions).parse()

    override fun listSenderIds(
        params: VerificationManagementListSenderIdsParams,
        requestOptions: RequestOptions,
    ): VerificationManagementListSenderIdsResponse =
        // get /v2/verification/management/sender-id
        withRawResponse().listSenderIds(params, requestOptions).parse()

    override fun setPhoneNumber(
        params: VerificationManagementSetPhoneNumberParams,
        requestOptions: RequestOptions,
    ): VerificationManagementSetPhoneNumberResponse =
        // post /v2/verification/management/phone-numbers/{action}
        withRawResponse().setPhoneNumber(params, requestOptions).parse()

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

        private val deletePhoneNumberHandler:
            Handler<VerificationManagementDeletePhoneNumberResponse> =
            jsonHandler<VerificationManagementDeletePhoneNumberResponse>(clientOptions.jsonMapper)

        override fun deletePhoneNumber(
            params: VerificationManagementDeletePhoneNumberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationManagementDeletePhoneNumberResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("action", params.action().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "verification",
                        "management",
                        "phone-numbers",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { deletePhoneNumberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listPhoneNumbersHandler:
            Handler<VerificationManagementListPhoneNumbersResponse> =
            jsonHandler<VerificationManagementListPhoneNumbersResponse>(clientOptions.jsonMapper)

        override fun listPhoneNumbers(
            params: VerificationManagementListPhoneNumbersParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationManagementListPhoneNumbersResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("action", params.action().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "verification",
                        "management",
                        "phone-numbers",
                        params._pathParam(0),
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listPhoneNumbersHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listSenderIdsHandler: Handler<VerificationManagementListSenderIdsResponse> =
            jsonHandler<VerificationManagementListSenderIdsResponse>(clientOptions.jsonMapper)

        override fun listSenderIds(
            params: VerificationManagementListSenderIdsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationManagementListSenderIdsResponse> {
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
                            it.validate()
                        }
                    }
            }
        }

        private val setPhoneNumberHandler: Handler<VerificationManagementSetPhoneNumberResponse> =
            jsonHandler<VerificationManagementSetPhoneNumberResponse>(clientOptions.jsonMapper)

        override fun setPhoneNumber(
            params: VerificationManagementSetPhoneNumberParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationManagementSetPhoneNumberResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("action", params.action().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "verification",
                        "management",
                        "phone-numbers",
                        params._pathParam(0),
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { setPhoneNumberHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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

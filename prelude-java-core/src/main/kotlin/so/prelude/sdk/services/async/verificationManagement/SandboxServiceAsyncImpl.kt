// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.verificationManagement

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
import so.prelude.sdk.models.VerificationManagementSandboxAddPhoneNumberParams
import so.prelude.sdk.models.VerificationManagementSandboxAddPhoneNumberResponse
import so.prelude.sdk.models.VerificationManagementSandboxDeletePhoneNumberParams
import so.prelude.sdk.models.VerificationManagementSandboxDeletePhoneNumberResponse
import so.prelude.sdk.models.VerificationManagementSandboxListPhoneNumbersParams
import so.prelude.sdk.models.VerificationManagementSandboxListPhoneNumbersResponse

/** Verify phone numbers. */
class SandboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SandboxServiceAsync {

    private val withRawResponse: SandboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SandboxServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): SandboxServiceAsync =
        SandboxServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun addPhoneNumber(
        params: VerificationManagementSandboxAddPhoneNumberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationManagementSandboxAddPhoneNumberResponse> =
        // put /v2/verification/management/phone-numbers/sandbox
        withRawResponse().addPhoneNumber(params, requestOptions).thenApply { it.parse() }

    override fun deletePhoneNumber(
        params: VerificationManagementSandboxDeletePhoneNumberParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationManagementSandboxDeletePhoneNumberResponse> =
        // delete /v2/verification/management/phone-numbers/sandbox/{phone_number}
        withRawResponse().deletePhoneNumber(params, requestOptions).thenApply { it.parse() }

    override fun listPhoneNumbers(
        params: VerificationManagementSandboxListPhoneNumbersParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<VerificationManagementSandboxListPhoneNumbersResponse> =
        // get /v2/verification/management/phone-numbers/sandbox
        withRawResponse().listPhoneNumbers(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SandboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SandboxServiceAsync.WithRawResponse =
            SandboxServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val addPhoneNumberHandler:
            Handler<VerificationManagementSandboxAddPhoneNumberResponse> =
            jsonHandler<VerificationManagementSandboxAddPhoneNumberResponse>(
                clientOptions.jsonMapper
            )

        override fun addPhoneNumber(
            params: VerificationManagementSandboxAddPhoneNumberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<VerificationManagementSandboxAddPhoneNumberResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PUT)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "management", "phone-numbers", "sandbox")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { addPhoneNumberHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val deletePhoneNumberHandler:
            Handler<VerificationManagementSandboxDeletePhoneNumberResponse> =
            jsonHandler<VerificationManagementSandboxDeletePhoneNumberResponse>(
                clientOptions.jsonMapper
            )

        override fun deletePhoneNumber(
            params: VerificationManagementSandboxDeletePhoneNumberParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxDeletePhoneNumberResponse>
        > {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v2",
                        "verification",
                        "management",
                        "phone-numbers",
                        "sandbox",
                        params._pathParam(0),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { deletePhoneNumberHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listPhoneNumbersHandler:
            Handler<VerificationManagementSandboxListPhoneNumbersResponse> =
            jsonHandler<VerificationManagementSandboxListPhoneNumbersResponse>(
                clientOptions.jsonMapper
            )

        override fun listPhoneNumbers(
            params: VerificationManagementSandboxListPhoneNumbersParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<VerificationManagementSandboxListPhoneNumbersResponse>
        > {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "verification", "management", "phone-numbers", "sandbox")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listPhoneNumbersHandler.handle(it) }
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

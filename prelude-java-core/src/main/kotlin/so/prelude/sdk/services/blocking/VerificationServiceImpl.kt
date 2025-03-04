// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.handlers.errorHandler
import so.prelude.sdk.core.handlers.jsonHandler
import so.prelude.sdk.core.handlers.withErrorHandler
import so.prelude.sdk.core.http.HttpMethod
import so.prelude.sdk.core.http.HttpRequest
import so.prelude.sdk.core.http.HttpResponse.Handler
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.core.http.parseable
import so.prelude.sdk.core.json
import so.prelude.sdk.core.prepare
import so.prelude.sdk.errors.PreludeError
import so.prelude.sdk.models.VerificationCheckParams
import so.prelude.sdk.models.VerificationCheckResponse
import so.prelude.sdk.models.VerificationCreateParams
import so.prelude.sdk.models.VerificationCreateResponse

class VerificationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    VerificationService {

    private val withRawResponse: VerificationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): VerificationService.WithRawResponse = withRawResponse

    override fun create(
        params: VerificationCreateParams,
        requestOptions: RequestOptions,
    ): VerificationCreateResponse =
        // post /v2/verification
        withRawResponse().create(params, requestOptions).parse()

    override fun check(
        params: VerificationCheckParams,
        requestOptions: RequestOptions,
    ): VerificationCheckResponse =
        // post /v2/verification/check
        withRawResponse().check(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        VerificationService.WithRawResponse {

        private val errorHandler: Handler<PreludeError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<VerificationCreateResponse> =
            jsonHandler<VerificationCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: VerificationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "verification")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val checkHandler: Handler<VerificationCheckResponse> =
            jsonHandler<VerificationCheckResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun check(
            params: VerificationCheckParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<VerificationCheckResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "verification", "check")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { checkHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

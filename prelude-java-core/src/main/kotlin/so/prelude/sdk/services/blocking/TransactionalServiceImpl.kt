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
import so.prelude.sdk.models.TransactionalSendParams
import so.prelude.sdk.models.TransactionalSendResponse

class TransactionalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionalService {

    private val withRawResponse: TransactionalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionalService.WithRawResponse = withRawResponse

    override fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions,
    ): TransactionalSendResponse =
        // post /v2/transactional
        withRawResponse().send(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionalService.WithRawResponse {

        private val errorHandler: Handler<PreludeError> = errorHandler(clientOptions.jsonMapper)

        private val sendHandler: Handler<TransactionalSendResponse> =
            jsonHandler<TransactionalSendResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun send(
            params: TransactionalSendParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionalSendResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "transactional")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
}

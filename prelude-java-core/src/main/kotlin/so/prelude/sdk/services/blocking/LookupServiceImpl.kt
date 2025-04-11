// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.handlers.errorHandler
import so.prelude.sdk.core.handlers.jsonHandler
import so.prelude.sdk.core.handlers.withErrorHandler
import so.prelude.sdk.core.http.HttpMethod
import so.prelude.sdk.core.http.HttpRequest
import so.prelude.sdk.core.http.HttpResponse.Handler
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.core.http.parseable
import so.prelude.sdk.core.prepare
import so.prelude.sdk.models.LookupLookupParams
import so.prelude.sdk.models.LookupLookupResponse

class LookupServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LookupService {

    private val withRawResponse: LookupService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LookupService.WithRawResponse = withRawResponse

    override fun lookup(
        params: LookupLookupParams,
        requestOptions: RequestOptions,
    ): LookupLookupResponse =
        // get /v2/lookup/{phone_number}
        withRawResponse().lookup(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val lookupHandler: Handler<LookupLookupResponse> =
            jsonHandler<LookupLookupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun lookup(
            params: LookupLookupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupLookupResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v2", "lookup", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { lookupHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}

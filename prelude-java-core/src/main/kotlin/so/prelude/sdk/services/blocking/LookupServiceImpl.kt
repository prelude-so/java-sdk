// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.checkRequired
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

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): LookupService =
        LookupServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun lookup(
        params: LookupLookupParams,
        requestOptions: RequestOptions,
    ): LookupLookupResponse =
        // get /v2/lookup/{phone_number}
        withRawResponse().lookup(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LookupService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LookupService.WithRawResponse =
            LookupServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val lookupHandler: Handler<LookupLookupResponse> =
            jsonHandler<LookupLookupResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun lookup(
            params: LookupLookupParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LookupLookupResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("phoneNumber", params.phoneNumber().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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

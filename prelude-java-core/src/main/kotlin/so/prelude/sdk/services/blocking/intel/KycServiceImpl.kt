// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking.intel

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
import so.prelude.sdk.models.IntelKycMatchParams
import so.prelude.sdk.models.IntelKycMatchResponse

/**
 * Retrieve detailed information about a phone number including carrier data, line type, and
 * portability status.
 */
class KycServiceImpl internal constructor(private val clientOptions: ClientOptions) : KycService {

    private val withRawResponse: KycService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): KycService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): KycService =
        KycServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun match(
        params: IntelKycMatchParams,
        requestOptions: RequestOptions,
    ): IntelKycMatchResponse =
        // post /v2/intel/kyc/match/{phone}
        withRawResponse().match(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        KycService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): KycService.WithRawResponse =
            KycServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val matchHandler: Handler<IntelKycMatchResponse> =
            jsonHandler<IntelKycMatchResponse>(clientOptions.jsonMapper)

        override fun match(
            params: IntelKycMatchParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntelKycMatchResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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

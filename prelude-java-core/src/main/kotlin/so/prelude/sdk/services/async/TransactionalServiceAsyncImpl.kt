// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.handlers.errorHandler
import so.prelude.sdk.core.handlers.jsonHandler
import so.prelude.sdk.core.handlers.withErrorHandler
import so.prelude.sdk.core.http.HttpMethod
import so.prelude.sdk.core.http.HttpRequest
import so.prelude.sdk.core.http.HttpResponse.Handler
import so.prelude.sdk.core.json
import so.prelude.sdk.errors.PreludeError
import so.prelude.sdk.models.TransactionalSendParams
import so.prelude.sdk.models.TransactionalSendResponse

class TransactionalServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : TransactionalServiceAsync {

    private val errorHandler: Handler<PreludeError> = errorHandler(clientOptions.jsonMapper)

    private val sendHandler: Handler<TransactionalSendResponse> =
        jsonHandler<TransactionalSendResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Send a transactional message to your user. */
    override fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions
    ): CompletableFuture<TransactionalSendResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "transactional")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { sendHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}

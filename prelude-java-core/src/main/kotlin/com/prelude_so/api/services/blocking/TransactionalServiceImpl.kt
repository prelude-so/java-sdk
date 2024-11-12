// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.services.blocking

import com.prelude_so.api.core.ClientOptions
import com.prelude_so.api.core.RequestOptions
import com.prelude_so.api.core.handlers.errorHandler
import com.prelude_so.api.core.handlers.jsonHandler
import com.prelude_so.api.core.handlers.withErrorHandler
import com.prelude_so.api.core.http.HttpMethod
import com.prelude_so.api.core.http.HttpRequest
import com.prelude_so.api.core.http.HttpResponse.Handler
import com.prelude_so.api.core.json
import com.prelude_so.api.errors.PreludeError
import com.prelude_so.api.models.TransactionalSendParams
import com.prelude_so.api.models.TransactionalSendResponse

class TransactionalServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TransactionalService {

    private val errorHandler: Handler<PreludeError> = errorHandler(clientOptions.jsonMapper)

    private val sendHandler: Handler<TransactionalSendResponse> =
        jsonHandler<TransactionalSendResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Send a transactional message to your user. */
    override fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions
    ): TransactionalSendResponse {
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
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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

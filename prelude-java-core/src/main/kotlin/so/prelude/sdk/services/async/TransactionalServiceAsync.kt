// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.models.TransactionalSendParams
import so.prelude.sdk.models.TransactionalSendResponse

interface TransactionalServiceAsync {

    /** Send a transactional message to your user. */
    @JvmOverloads
    fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionalSendResponse>
}

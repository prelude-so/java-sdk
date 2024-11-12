// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.prelude_so.api.services.async

import com.prelude_so.api.core.RequestOptions
import com.prelude_so.api.models.TransactionalSendParams
import com.prelude_so.api.models.TransactionalSendResponse
import java.util.concurrent.CompletableFuture

interface TransactionalServiceAsync {

    /** Send a transactional message to your user. */
    @JvmOverloads
    fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<TransactionalSendResponse>
}

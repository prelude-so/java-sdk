// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.prelude_so.api.services.blocking

import com.prelude_so.api.core.RequestOptions
import com.prelude_so.api.models.TransactionalSendParams
import com.prelude_so.api.models.TransactionalSendResponse

interface TransactionalService {

    /** Send a transactional message to your user. */
    @JvmOverloads
    fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionalSendResponse
}

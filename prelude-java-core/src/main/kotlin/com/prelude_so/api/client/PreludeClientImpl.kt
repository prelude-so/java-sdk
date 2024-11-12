// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.client

import com.prelude_so.api.core.ClientOptions
import com.prelude_so.api.core.getPackageVersion
import com.prelude_so.api.models.*
import com.prelude_so.api.services.blocking.*

class PreludeClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : PreludeClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: PreludeClientAsync by lazy { PreludeClientAsyncImpl(clientOptions) }

    private val transactional: TransactionalService by lazy {
        TransactionalServiceImpl(clientOptionsWithUserAgent)
    }

    private val verification: VerificationService by lazy {
        VerificationServiceImpl(clientOptionsWithUserAgent)
    }

    private val watch: WatchService by lazy { WatchServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): PreludeClientAsync = async

    override fun transactional(): TransactionalService = transactional

    override fun verification(): VerificationService = verification

    override fun watch(): WatchService = watch
}

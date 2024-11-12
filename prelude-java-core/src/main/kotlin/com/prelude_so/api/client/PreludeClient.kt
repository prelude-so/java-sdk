// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.client

import com.prelude_so.api.models.*
import com.prelude_so.api.services.blocking.*

interface PreludeClient {

    fun async(): PreludeClientAsync

    fun transactional(): TransactionalService

    fun verification(): VerificationService

    fun watch(): WatchService
}

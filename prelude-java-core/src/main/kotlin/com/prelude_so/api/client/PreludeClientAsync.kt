// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.client

import com.prelude_so.api.models.*
import com.prelude_so.api.services.async.*

interface PreludeClientAsync {

    fun sync(): PreludeClient

    fun transactional(): TransactionalServiceAsync

    fun verification(): VerificationServiceAsync

    fun watch(): WatchServiceAsync
}

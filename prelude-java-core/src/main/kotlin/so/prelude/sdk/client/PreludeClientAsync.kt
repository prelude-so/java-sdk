// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.client

import so.prelude.sdk.models.*
import so.prelude.sdk.services.async.*

interface PreludeClientAsync {

    fun sync(): PreludeClient

    fun transactional(): TransactionalServiceAsync

    fun verification(): VerificationServiceAsync

    fun watch(): WatchServiceAsync
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.client

import so.prelude.sdk.services.async.TransactionalServiceAsync
import so.prelude.sdk.services.async.VerificationServiceAsync
import so.prelude.sdk.services.async.WatchServiceAsync

interface PreludeClientAsync {

    fun sync(): PreludeClient

    fun transactional(): TransactionalServiceAsync

    fun verification(): VerificationServiceAsync

    fun watch(): WatchServiceAsync
}

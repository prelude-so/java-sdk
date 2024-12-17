// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.client

import so.prelude.sdk.services.blocking.TransactionalService
import so.prelude.sdk.services.blocking.VerificationService
import so.prelude.sdk.services.blocking.WatchService

interface PreludeClient {

    fun async(): PreludeClientAsync

    fun transactional(): TransactionalService

    fun verification(): VerificationService

    fun watch(): WatchService
}

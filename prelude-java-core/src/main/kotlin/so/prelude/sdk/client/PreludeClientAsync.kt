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

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}

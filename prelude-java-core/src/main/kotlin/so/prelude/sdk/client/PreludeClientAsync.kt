// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.client

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.services.async.LookupServiceAsync
import so.prelude.sdk.services.async.TransactionalServiceAsync
import so.prelude.sdk.services.async.VerificationServiceAsync
import so.prelude.sdk.services.async.WatchServiceAsync

/**
 * A client for interacting with the Prelude REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface PreludeClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun sync(): PreludeClient

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreludeClientAsync

    fun lookup(): LookupServiceAsync

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

    /**
     * A view of [PreludeClientAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PreludeClientAsync.WithRawResponse

        fun lookup(): LookupServiceAsync.WithRawResponse

        fun transactional(): TransactionalServiceAsync.WithRawResponse

        fun verification(): VerificationServiceAsync.WithRawResponse

        fun watch(): WatchServiceAsync.WithRawResponse
    }
}

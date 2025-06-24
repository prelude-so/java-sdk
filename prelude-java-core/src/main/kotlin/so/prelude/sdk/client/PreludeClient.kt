// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.client

import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.services.blocking.LookupService
import so.prelude.sdk.services.blocking.TransactionalService
import so.prelude.sdk.services.blocking.VerificationService
import so.prelude.sdk.services.blocking.WatchService

/**
 * A client for interacting with the Prelude REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface PreludeClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): PreludeClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreludeClient

    fun lookup(): LookupService

    fun transactional(): TransactionalService

    fun verification(): VerificationService

    fun watch(): WatchService

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

    /** A view of [PreludeClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PreludeClient.WithRawResponse

        fun lookup(): LookupService.WithRawResponse

        fun transactional(): TransactionalService.WithRawResponse

        fun verification(): VerificationService.WithRawResponse

        fun watch(): WatchService.WithRawResponse
    }
}

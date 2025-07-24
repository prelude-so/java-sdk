// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.TransactionalSendParams
import so.prelude.sdk.models.TransactionalSendResponse

interface TransactionalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionalServiceAsync

    /** Send a transactional message to your user. */
    fun send(params: TransactionalSendParams): CompletableFuture<TransactionalSendResponse> =
        send(params, RequestOptions.none())

    /** @see send */
    fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionalSendResponse>

    /**
     * A view of [TransactionalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/transactional`, but is otherwise the same as
         * [TransactionalServiceAsync.send].
         */
        fun send(
            params: TransactionalSendParams
        ): CompletableFuture<HttpResponseFor<TransactionalSendResponse>> =
            send(params, RequestOptions.none())

        /** @see send */
        fun send(
            params: TransactionalSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionalSendResponse>>
    }
}

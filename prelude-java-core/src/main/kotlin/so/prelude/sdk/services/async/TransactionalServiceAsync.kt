// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.TransactionalSendParams
import so.prelude.sdk.models.TransactionalSendResponse

interface TransactionalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Send a transactional message to your user. */
    fun send(params: TransactionalSendParams): CompletableFuture<TransactionalSendResponse> =
        send(
          params, RequestOptions.none()
        )

    /** @see [send] */
    fun send(params: TransactionalSendParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TransactionalSendResponse>

    /**
     * A view of [TransactionalServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v2/transactional`, but is otherwise the
         * same as [TransactionalServiceAsync.send].
         */
        @MustBeClosed
        fun send(params: TransactionalSendParams): CompletableFuture<HttpResponseFor<TransactionalSendResponse>> =
            send(
              params, RequestOptions.none()
            )

        /** @see [send] */
        @MustBeClosed
        fun send(params: TransactionalSendParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<HttpResponseFor<TransactionalSendResponse>>
    }
}

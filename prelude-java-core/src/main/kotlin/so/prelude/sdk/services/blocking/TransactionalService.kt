// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package so.prelude.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.TransactionalSendParams
import so.prelude.sdk.models.TransactionalSendResponse

interface TransactionalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Send a transactional message to your user. */
    @JvmOverloads
    fun send(
        params: TransactionalSendParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionalSendResponse

    /**
     * A view of [TransactionalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v2/transactional`, but is otherwise the same as
         * [TransactionalService.send].
         */
        @JvmOverloads
        @MustBeClosed
        fun send(
            params: TransactionalSendParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionalSendResponse>
    }
}

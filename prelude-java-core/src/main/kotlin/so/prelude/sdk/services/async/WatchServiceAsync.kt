// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.WatchFeedBackParams
import so.prelude.sdk.models.WatchFeedBackResponse
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse

interface WatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Once the user with a trustworthy phone number demonstrates authentic behavior, call this
     * endpoint to report their authenticity to our systems.
     */
    fun feedBack(params: WatchFeedBackParams): CompletableFuture<WatchFeedBackResponse> =
        feedBack(params, RequestOptions.none())

    /** @see [feedBack] */
    fun feedBack(
        params: WatchFeedBackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchFeedBackResponse>

    /**
     * Identify trustworthy phone numbers to mitigate fake traffic or traffic involved in fraud and
     * international revenue share fraud (IRSF) patterns. This endpoint must be implemented in
     * conjunction with the `watch/feedback` endpoint.
     */
    fun predict(params: WatchPredictParams): CompletableFuture<WatchPredictResponse> =
        predict(params, RequestOptions.none())

    /** @see [predict] */
    fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchPredictResponse>

    /** A view of [WatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v2/watch/feedback`, but is otherwise the same as
         * [WatchServiceAsync.feedBack].
         */
        @MustBeClosed
        fun feedBack(
            params: WatchFeedBackParams
        ): CompletableFuture<HttpResponseFor<WatchFeedBackResponse>> =
            feedBack(params, RequestOptions.none())

        /** @see [feedBack] */
        @MustBeClosed
        fun feedBack(
            params: WatchFeedBackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchFeedBackResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/watch/predict`, but is otherwise the same as
         * [WatchServiceAsync.predict].
         */
        @MustBeClosed
        fun predict(
            params: WatchPredictParams
        ): CompletableFuture<HttpResponseFor<WatchPredictResponse>> =
            predict(params, RequestOptions.none())

        /** @see [predict] */
        @MustBeClosed
        fun predict(
            params: WatchPredictParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchPredictResponse>>
    }
}

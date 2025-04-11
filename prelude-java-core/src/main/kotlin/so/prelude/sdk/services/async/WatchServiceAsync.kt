// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import com.google.errorprone.annotations.MustBeClosed
import java.util.concurrent.CompletableFuture
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse
import so.prelude.sdk.models.WatchSendEventsParams
import so.prelude.sdk.models.WatchSendEventsResponse
import so.prelude.sdk.models.WatchSendFeedbacksParams
import so.prelude.sdk.models.WatchSendFeedbacksResponse

interface WatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Predict the outcome of a verification based on Prelude’s anti-fraud system. */
    fun predict(params: WatchPredictParams): CompletableFuture<WatchPredictResponse> =
        predict(params, RequestOptions.none())

    /** @see [predict] */
    fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchPredictResponse>

    /**
     * Send real-time event data from end-user interactions within your application. Events will be
     * analyzed for proactive fraud prevention and risk scoring.
     */
    fun sendEvents(params: WatchSendEventsParams): CompletableFuture<WatchSendEventsResponse> =
        sendEvents(params, RequestOptions.none())

    /** @see [sendEvents] */
    fun sendEvents(
        params: WatchSendEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchSendEventsResponse>

    /**
     * Send feedback regarding your end-users verification funnel. Events will be analyzed for
     * proactive fraud prevention and risk scoring.
     */
    fun sendFeedbacks(
        params: WatchSendFeedbacksParams
    ): CompletableFuture<WatchSendFeedbacksResponse> = sendFeedbacks(params, RequestOptions.none())

    /** @see [sendFeedbacks] */
    fun sendFeedbacks(
        params: WatchSendFeedbacksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchSendFeedbacksResponse>

    /** A view of [WatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

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

        /**
         * Returns a raw HTTP response for `post /v2/watch/event`, but is otherwise the same as
         * [WatchServiceAsync.sendEvents].
         */
        @MustBeClosed
        fun sendEvents(
            params: WatchSendEventsParams
        ): CompletableFuture<HttpResponseFor<WatchSendEventsResponse>> =
            sendEvents(params, RequestOptions.none())

        /** @see [sendEvents] */
        @MustBeClosed
        fun sendEvents(
            params: WatchSendEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchSendEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/watch/feedback`, but is otherwise the same as
         * [WatchServiceAsync.sendFeedbacks].
         */
        @MustBeClosed
        fun sendFeedbacks(
            params: WatchSendFeedbacksParams
        ): CompletableFuture<HttpResponseFor<WatchSendFeedbacksResponse>> =
            sendFeedbacks(params, RequestOptions.none())

        /** @see [sendFeedbacks] */
        @MustBeClosed
        fun sendFeedbacks(
            params: WatchSendFeedbacksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchSendFeedbacksResponse>>
    }
}

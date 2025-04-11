// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse
import so.prelude.sdk.models.WatchSendEventsParams
import so.prelude.sdk.models.WatchSendEventsResponse
import so.prelude.sdk.models.WatchSendFeedbacksParams
import so.prelude.sdk.models.WatchSendFeedbacksResponse

interface WatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Predict the outcome of a verification based on Prelude’s anti-fraud system. */
    fun predict(params: WatchPredictParams): WatchPredictResponse =
        predict(params, RequestOptions.none())

    /** @see [predict] */
    fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchPredictResponse

    /**
     * Send real-time event data from end-user interactions within your application. Events will be
     * analyzed for proactive fraud prevention and risk scoring.
     */
    fun sendEvents(params: WatchSendEventsParams): WatchSendEventsResponse =
        sendEvents(params, RequestOptions.none())

    /** @see [sendEvents] */
    fun sendEvents(
        params: WatchSendEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchSendEventsResponse

    /**
     * Send feedback regarding your end-users verification funnel. Events will be analyzed for
     * proactive fraud prevention and risk scoring.
     */
    fun sendFeedbacks(params: WatchSendFeedbacksParams): WatchSendFeedbacksResponse =
        sendFeedbacks(params, RequestOptions.none())

    /** @see [sendFeedbacks] */
    fun sendFeedbacks(
        params: WatchSendFeedbacksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchSendFeedbacksResponse

    /** A view of [WatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v2/watch/predict`, but is otherwise the same as
         * [WatchService.predict].
         */
        @MustBeClosed
        fun predict(params: WatchPredictParams): HttpResponseFor<WatchPredictResponse> =
            predict(params, RequestOptions.none())

        /** @see [predict] */
        @MustBeClosed
        fun predict(
            params: WatchPredictParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchPredictResponse>

        /**
         * Returns a raw HTTP response for `post /v2/watch/event`, but is otherwise the same as
         * [WatchService.sendEvents].
         */
        @MustBeClosed
        fun sendEvents(params: WatchSendEventsParams): HttpResponseFor<WatchSendEventsResponse> =
            sendEvents(params, RequestOptions.none())

        /** @see [sendEvents] */
        @MustBeClosed
        fun sendEvents(
            params: WatchSendEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchSendEventsResponse>

        /**
         * Returns a raw HTTP response for `post /v2/watch/feedback`, but is otherwise the same as
         * [WatchService.sendFeedbacks].
         */
        @MustBeClosed
        fun sendFeedbacks(
            params: WatchSendFeedbacksParams
        ): HttpResponseFor<WatchSendFeedbacksResponse> =
            sendFeedbacks(params, RequestOptions.none())

        /** @see [sendFeedbacks] */
        @MustBeClosed
        fun sendFeedbacks(
            params: WatchSendFeedbacksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchSendFeedbacksResponse>
    }
}

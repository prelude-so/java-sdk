// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import so.prelude.sdk.core.ClientOptions
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse
import so.prelude.sdk.models.WatchSendEventsParams
import so.prelude.sdk.models.WatchSendEventsResponse
import so.prelude.sdk.models.WatchSendFeedbacksParams
import so.prelude.sdk.models.WatchSendFeedbacksResponse

/** Evaluate email addresses and phone numbers for trustworthiness. */
interface WatchServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): WatchServiceAsync

    /**
     * At signup, score the user's phone number or email address (target) as legitimate or
     * suspicious. Scoring-only — does not update counters by itself. When using Feedback, call
     * predict before verification.started on the same target (and correlation_id when used) so
     * feedback can warm Watch auth-start counters. Use Events for product fraud labels; use
     * Feedback only if you run your own phone verification funnel outside Prelude Verify.
     */
    fun predict(params: WatchPredictParams): CompletableFuture<WatchPredictResponse> =
        predict(params, RequestOptions.none())

    /** @see predict */
    fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchPredictResponse>

    /**
     * Send custom fraud signals from your application (labels and confidence levels). Events
     * capture product-specific risk patterns and are weighted when scoring traffic. Use without
     * Predict or Feedback if you only need to report product-side abuse (for example
     * account.banned). Feedback is a separate, optional endpoint for self-hosted phone verification
     * funnels.
     */
    fun sendEvents(params: WatchSendEventsParams): CompletableFuture<WatchSendEventsResponse> =
        sendEvents(params, RequestOptions.none())

    /** @see sendEvents */
    fun sendEvents(
        params: WatchSendEventsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchSendEventsResponse>

    /**
     * Optional. Report verification-funnel steps (verification.started, verification.completed)
     * when you run phone verification outside Prelude Verify. Feeds Watch abuse-rate counters for
     * your own flow. Call Predict on the same target before verification.started and reuse
     * metadata.correlation_id so auth-start counters receive predict signals; without a linked
     * predict, only attempt-rate counters update on started. Not required if you only use Events
     * and/or Predict, or if Verify already handles verification for that traffic.
     */
    fun sendFeedbacks(
        params: WatchSendFeedbacksParams
    ): CompletableFuture<WatchSendFeedbacksResponse> = sendFeedbacks(params, RequestOptions.none())

    /** @see sendFeedbacks */
    fun sendFeedbacks(
        params: WatchSendFeedbacksParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<WatchSendFeedbacksResponse>

    /** A view of [WatchServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): WatchServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/watch/predict`, but is otherwise the same as
         * [WatchServiceAsync.predict].
         */
        fun predict(
            params: WatchPredictParams
        ): CompletableFuture<HttpResponseFor<WatchPredictResponse>> =
            predict(params, RequestOptions.none())

        /** @see predict */
        fun predict(
            params: WatchPredictParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchPredictResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/watch/event`, but is otherwise the same as
         * [WatchServiceAsync.sendEvents].
         */
        fun sendEvents(
            params: WatchSendEventsParams
        ): CompletableFuture<HttpResponseFor<WatchSendEventsResponse>> =
            sendEvents(params, RequestOptions.none())

        /** @see sendEvents */
        fun sendEvents(
            params: WatchSendEventsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchSendEventsResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/watch/feedback`, but is otherwise the same as
         * [WatchServiceAsync.sendFeedbacks].
         */
        fun sendFeedbacks(
            params: WatchSendFeedbacksParams
        ): CompletableFuture<HttpResponseFor<WatchSendFeedbacksResponse>> =
            sendFeedbacks(params, RequestOptions.none())

        /** @see sendFeedbacks */
        fun sendFeedbacks(
            params: WatchSendFeedbacksParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<WatchSendFeedbacksResponse>>
    }
}

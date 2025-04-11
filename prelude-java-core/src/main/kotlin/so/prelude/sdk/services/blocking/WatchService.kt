// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import so.prelude.sdk.core.RequestOptions
import so.prelude.sdk.core.http.HttpResponseFor
import so.prelude.sdk.models.WatchFeedBackParams
import so.prelude.sdk.models.WatchFeedBackResponse
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchPredictResponse

interface WatchService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Send feedback regarding your end-users verification funnel. Events will be analyzed for
     * proactive fraud prevention and risk scoring.
     */
    fun feedBack(params: WatchFeedBackParams): WatchFeedBackResponse =
        feedBack(params, RequestOptions.none())

    /** @see [feedBack] */
    fun feedBack(
        params: WatchFeedBackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchFeedBackResponse

    /** Predict the outcome of a verification based on Prelude’s anti-fraud system. */
    fun predict(params: WatchPredictParams): WatchPredictResponse =
        predict(params, RequestOptions.none())

    /** @see [predict] */
    fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchPredictResponse

    /** A view of [WatchService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v2/watch/feedback`, but is otherwise the same as
         * [WatchService.feedBack].
         */
        @MustBeClosed
        fun feedBack(params: WatchFeedBackParams): HttpResponseFor<WatchFeedBackResponse> =
            feedBack(params, RequestOptions.none())

        /** @see [feedBack] */
        @MustBeClosed
        fun feedBack(
            params: WatchFeedBackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchFeedBackResponse>

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
    }
}

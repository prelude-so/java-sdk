// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
     * Once the user with a trustworthy phone number demonstrates authentic behavior, call this
     * endpoint to report their authenticity to our systems.
     */
    @JvmOverloads
    fun feedBack(
        params: WatchFeedBackParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WatchFeedBackResponse

    /**
     * Identify trustworthy phone numbers to mitigate fake traffic or traffic involved in fraud and
     * international revenue share fraud (IRSF) patterns. This endpoint must be implemented in
     * conjunction with the `watch/feedback` endpoint.
     */
    @JvmOverloads
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
        @JvmOverloads
        @MustBeClosed
        fun feedBack(
            params: WatchFeedBackParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchFeedBackResponse>

        /**
         * Returns a raw HTTP response for `post /v2/watch/predict`, but is otherwise the same as
         * [WatchService.predict].
         */
        @JvmOverloads
        @MustBeClosed
        fun predict(
            params: WatchPredictParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WatchPredictResponse>
    }
}

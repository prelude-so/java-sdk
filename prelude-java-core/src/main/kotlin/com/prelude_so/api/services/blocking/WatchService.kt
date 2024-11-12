// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.prelude_so.api.services.blocking

import com.prelude_so.api.core.RequestOptions
import com.prelude_so.api.models.WatchFeedBackParams
import com.prelude_so.api.models.WatchFeedBackResponse
import com.prelude_so.api.models.WatchPredictParams
import com.prelude_so.api.models.WatchPredictResponse

interface WatchService {

    /**
     * Once the user with a trustworthy phone number demonstrates authentic behavior, call this
     * endpoint to report their authenticity to our systems.
     */
    @JvmOverloads
    fun feedBack(
        params: WatchFeedBackParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WatchFeedBackResponse

    /**
     * Identify trustworthy phone numbers to mitigate fake traffic or traffic involved in fraud and
     * international revenue share fraud (IRSF) patterns. This endpoint must be implemented in
     * conjunction with the `watch/feedback` endpoint.
     */
    @JvmOverloads
    fun predict(
        params: WatchPredictParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WatchPredictResponse
}

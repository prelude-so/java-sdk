// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WatchPredictResponseTest {

    @Test
    fun createWatchPredictResponse() {
        val watchPredictResponse =
            WatchPredictResponse.builder()
                .id("id")
                .prediction(WatchPredictResponse.Prediction.ALLOW)
                .reasoning(
                    WatchPredictResponse.Reasoning.builder()
                        .cause(WatchPredictResponse.Reasoning.Cause.NONE)
                        .score(42.23)
                        .build()
                )
                .build()
        assertThat(watchPredictResponse).isNotNull
        assertThat(watchPredictResponse.id()).contains("id")
        assertThat(watchPredictResponse.prediction())
            .contains(WatchPredictResponse.Prediction.ALLOW)
        assertThat(watchPredictResponse.reasoning())
            .contains(
                WatchPredictResponse.Reasoning.builder()
                    .cause(WatchPredictResponse.Reasoning.Cause.NONE)
                    .score(42.23)
                    .build()
            )
    }
}

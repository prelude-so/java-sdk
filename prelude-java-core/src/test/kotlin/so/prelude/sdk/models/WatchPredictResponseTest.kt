// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class WatchPredictResponseTest {

    @Test
    fun create() {
        val watchPredictResponse =
            WatchPredictResponse.builder()
                .id("id")
                .prediction(WatchPredictResponse.Prediction.ALLOW)
                .reasoning(
                    WatchPredictResponse.Reasoning.builder()
                        .cause(WatchPredictResponse.Reasoning.Cause.NONE)
                        .score(0.0)
                        .build()
                )
                .build()

        assertThat(watchPredictResponse.id()).isEqualTo("id")
        assertThat(watchPredictResponse.prediction())
            .isEqualTo(WatchPredictResponse.Prediction.ALLOW)
        assertThat(watchPredictResponse.reasoning())
            .isEqualTo(
                WatchPredictResponse.Reasoning.builder()
                    .cause(WatchPredictResponse.Reasoning.Cause.NONE)
                    .score(0.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchPredictResponse =
            WatchPredictResponse.builder()
                .id("id")
                .prediction(WatchPredictResponse.Prediction.ALLOW)
                .reasoning(
                    WatchPredictResponse.Reasoning.builder()
                        .cause(WatchPredictResponse.Reasoning.Cause.NONE)
                        .score(0.0)
                        .build()
                )
                .build()

        val roundtrippedWatchPredictResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchPredictResponse),
                jacksonTypeRef<WatchPredictResponse>(),
            )

        assertThat(roundtrippedWatchPredictResponse).isEqualTo(watchPredictResponse)
    }
}

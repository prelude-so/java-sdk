// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WatchPredictResponseTest {

    @Test
    fun createWatchPredictResponse() {
      val watchPredictResponse = WatchPredictResponse.builder()
          .id("id")
          .prediction(WatchPredictResponse.Prediction.ALLOW)
          .reasoning(WatchPredictResponse.Reasoning.builder()
              .cause(WatchPredictResponse.Reasoning.Cause.NONE)
              .score(0.0)
              .build())
          .build()
      assertThat(watchPredictResponse).isNotNull
      assertThat(watchPredictResponse.id()).isEqualTo("id")
      assertThat(watchPredictResponse.prediction()).isEqualTo(WatchPredictResponse.Prediction.ALLOW)
      assertThat(watchPredictResponse.reasoning()).isEqualTo(WatchPredictResponse.Reasoning.builder()
          .cause(WatchPredictResponse.Reasoning.Cause.NONE)
          .score(0.0)
          .build())
    }
}

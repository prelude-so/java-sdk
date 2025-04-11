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
                .id("prd_01jc0t6fwwfgfsq1md24mhyztj")
                .prediction(WatchPredictResponse.Prediction.LEGITIMATE)
                .requestId("3d19215e-2991-4a05-a41a-527314e6ff6a")
                .build()

        assertThat(watchPredictResponse.id()).isEqualTo("prd_01jc0t6fwwfgfsq1md24mhyztj")
        assertThat(watchPredictResponse.prediction())
            .isEqualTo(WatchPredictResponse.Prediction.LEGITIMATE)
        assertThat(watchPredictResponse.requestId())
            .isEqualTo("3d19215e-2991-4a05-a41a-527314e6ff6a")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchPredictResponse =
            WatchPredictResponse.builder()
                .id("prd_01jc0t6fwwfgfsq1md24mhyztj")
                .prediction(WatchPredictResponse.Prediction.LEGITIMATE)
                .requestId("3d19215e-2991-4a05-a41a-527314e6ff6a")
                .build()

        val roundtrippedWatchPredictResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchPredictResponse),
                jacksonTypeRef<WatchPredictResponse>(),
            )

        assertThat(roundtrippedWatchPredictResponse).isEqualTo(watchPredictResponse)
    }
}

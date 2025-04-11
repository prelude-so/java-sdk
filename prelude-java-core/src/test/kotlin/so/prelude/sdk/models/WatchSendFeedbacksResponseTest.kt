// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class WatchSendFeedbacksResponseTest {

    @Test
    fun create() {
        val watchSendFeedbacksResponse =
            WatchSendFeedbacksResponse.builder()
                .requestId("3d19215e-2991-4a05-a41a-527314e6ff6a")
                .status(WatchSendFeedbacksResponse.Status.SUCCESS)
                .build()

        assertThat(watchSendFeedbacksResponse.requestId())
            .isEqualTo("3d19215e-2991-4a05-a41a-527314e6ff6a")
        assertThat(watchSendFeedbacksResponse.status())
            .isEqualTo(WatchSendFeedbacksResponse.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchSendFeedbacksResponse =
            WatchSendFeedbacksResponse.builder()
                .requestId("3d19215e-2991-4a05-a41a-527314e6ff6a")
                .status(WatchSendFeedbacksResponse.Status.SUCCESS)
                .build()

        val roundtrippedWatchSendFeedbacksResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchSendFeedbacksResponse),
                jacksonTypeRef<WatchSendFeedbacksResponse>(),
            )

        assertThat(roundtrippedWatchSendFeedbacksResponse).isEqualTo(watchSendFeedbacksResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class WatchFeedBackResponseTest {

    @Test
    fun create() {
        val watchFeedBackResponse =
            WatchFeedBackResponse.builder()
                .requestId("3d19215e-2991-4a05-a41a-527314e6ff6a")
                .status(WatchFeedBackResponse.Status.SUCCESS)
                .build()

        assertThat(watchFeedBackResponse.requestId())
            .isEqualTo("3d19215e-2991-4a05-a41a-527314e6ff6a")
        assertThat(watchFeedBackResponse.status()).isEqualTo(WatchFeedBackResponse.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchFeedBackResponse =
            WatchFeedBackResponse.builder()
                .requestId("3d19215e-2991-4a05-a41a-527314e6ff6a")
                .status(WatchFeedBackResponse.Status.SUCCESS)
                .build()

        val roundtrippedWatchFeedBackResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchFeedBackResponse),
                jacksonTypeRef<WatchFeedBackResponse>(),
            )

        assertThat(roundtrippedWatchFeedBackResponse).isEqualTo(watchFeedBackResponse)
    }
}

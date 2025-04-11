// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class WatchSendEventsResponseTest {

    @Test
    fun create() {
        val watchSendEventsResponse =
            WatchSendEventsResponse.builder()
                .requestId("3d19215e-2991-4a05-a41a-527314e6ff6a")
                .status(WatchSendEventsResponse.Status.SUCCESS)
                .build()

        assertThat(watchSendEventsResponse.requestId())
            .isEqualTo("3d19215e-2991-4a05-a41a-527314e6ff6a")
        assertThat(watchSendEventsResponse.status())
            .isEqualTo(WatchSendEventsResponse.Status.SUCCESS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchSendEventsResponse =
            WatchSendEventsResponse.builder()
                .requestId("3d19215e-2991-4a05-a41a-527314e6ff6a")
                .status(WatchSendEventsResponse.Status.SUCCESS)
                .build()

        val roundtrippedWatchSendEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchSendEventsResponse),
                jacksonTypeRef<WatchSendEventsResponse>(),
            )

        assertThat(roundtrippedWatchSendEventsResponse).isEqualTo(watchSendEventsResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class WatchFeedBackResponseTest {

    @Test
    fun create() {
        val watchFeedBackResponse = WatchFeedBackResponse.builder().id("id").build()

        assertThat(watchFeedBackResponse.id()).isEqualTo("id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchFeedBackResponse = WatchFeedBackResponse.builder().id("id").build()

        val roundtrippedWatchFeedBackResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchFeedBackResponse),
                jacksonTypeRef<WatchFeedBackResponse>(),
            )

        assertThat(roundtrippedWatchFeedBackResponse).isEqualTo(watchFeedBackResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WatchFeedBackResponseTest {

    @Test
    fun createWatchFeedBackResponse() {
        val watchFeedBackResponse = WatchFeedBackResponse.builder().id("id").build()
        assertThat(watchFeedBackResponse).isNotNull
        assertThat(watchFeedBackResponse.id()).isEqualTo("id")
    }
}

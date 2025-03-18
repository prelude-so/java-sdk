// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchFeedBackResponseTest {

    @Test
    fun create() {
        val watchFeedBackResponse = WatchFeedBackResponse.builder().id("id").build()

        assertThat(watchFeedBackResponse.id()).isEqualTo("id")
    }
}

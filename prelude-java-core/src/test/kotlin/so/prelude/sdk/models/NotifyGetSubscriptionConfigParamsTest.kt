// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotifyGetSubscriptionConfigParamsTest {

    @Test
    fun create() {
        NotifyGetSubscriptionConfigParams.builder().configId("config_id").build()
    }

    @Test
    fun pathParams() {
        val params = NotifyGetSubscriptionConfigParams.builder().configId("config_id").build()

        assertThat(params._pathParam(0)).isEqualTo("config_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

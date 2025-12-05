// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotifyGetSubscriptionPhoneNumberParamsTest {

    @Test
    fun create() {
        NotifyGetSubscriptionPhoneNumberParams.builder()
            .configId("config_id")
            .phoneNumber("phone_number")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NotifyGetSubscriptionPhoneNumberParams.builder()
                .configId("config_id")
                .phoneNumber("phone_number")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("config_id")
        assertThat(params._pathParam(1)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.http.QueryParams

internal class NotifyListSubscriptionPhoneNumberEventsParamsTest {

    @Test
    fun create() {
        NotifyListSubscriptionPhoneNumberEventsParams.builder()
            .configId("config_id")
            .phoneNumber("phone_number")
            .cursor("cursor")
            .limit(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NotifyListSubscriptionPhoneNumberEventsParams.builder()
                .configId("config_id")
                .phoneNumber("phone_number")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("config_id")
        assertThat(params._pathParam(1)).isEqualTo("phone_number")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NotifyListSubscriptionPhoneNumberEventsParams.builder()
                .configId("config_id")
                .phoneNumber("phone_number")
                .cursor("cursor")
                .limit(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            NotifyListSubscriptionPhoneNumberEventsParams.builder()
                .configId("config_id")
                .phoneNumber("phone_number")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

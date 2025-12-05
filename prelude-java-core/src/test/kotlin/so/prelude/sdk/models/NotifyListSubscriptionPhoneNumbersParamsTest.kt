// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.http.QueryParams

internal class NotifyListSubscriptionPhoneNumbersParamsTest {

    @Test
    fun create() {
        NotifyListSubscriptionPhoneNumbersParams.builder()
            .configId("config_id")
            .cursor("cursor")
            .limit(1L)
            .state(NotifyListSubscriptionPhoneNumbersParams.State.SUB)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            NotifyListSubscriptionPhoneNumbersParams.builder().configId("config_id").build()

        assertThat(params._pathParam(0)).isEqualTo("config_id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            NotifyListSubscriptionPhoneNumbersParams.builder()
                .configId("config_id")
                .cursor("cursor")
                .limit(1L)
                .state(NotifyListSubscriptionPhoneNumbersParams.State.SUB)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("cursor", "cursor")
                    .put("limit", "1")
                    .put("state", "SUB")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            NotifyListSubscriptionPhoneNumbersParams.builder().configId("config_id").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

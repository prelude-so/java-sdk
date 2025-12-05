// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.http.QueryParams

internal class NotifyListSubscriptionConfigsParamsTest {

    @Test
    fun create() {
        NotifyListSubscriptionConfigsParams.builder().cursor("cursor").limit(1L).build()
    }

    @Test
    fun queryParams() {
        val params =
            NotifyListSubscriptionConfigsParams.builder().cursor("cursor").limit(1L).build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("cursor", "cursor").put("limit", "1").build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = NotifyListSubscriptionConfigsParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

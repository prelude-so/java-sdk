// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.http.QueryParams

internal class LookupLookupParamsTest {

    @Test
    fun create() {
        LookupLookupParams.builder()
            .phoneNumber("+12065550100")
            .addType(LookupLookupParams.Type.CNAM)
            .build()
    }

    @Test
    fun pathParams() {
        val params = LookupLookupParams.builder().phoneNumber("+12065550100").build()

        assertThat(params._pathParam(0)).isEqualTo("+12065550100")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            LookupLookupParams.builder()
                .phoneNumber("+12065550100")
                .addType(LookupLookupParams.Type.CNAM)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("type", listOf("cnam").joinToString(",")).build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = LookupLookupParams.builder().phoneNumber("+12065550100").build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

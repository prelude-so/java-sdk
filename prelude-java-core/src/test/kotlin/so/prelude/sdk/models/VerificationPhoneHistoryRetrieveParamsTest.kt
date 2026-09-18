// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationPhoneHistoryRetrieveParamsTest {

    @Test
    fun create() {
        VerificationPhoneHistoryRetrieveParams.builder()
            .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerificationPhoneHistoryRetrieveParams.builder()
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("vrf_01jc0t6fwwfgfsq1md24mhyztj")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

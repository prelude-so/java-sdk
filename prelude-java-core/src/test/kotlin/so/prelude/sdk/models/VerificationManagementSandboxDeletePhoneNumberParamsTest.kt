// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationManagementSandboxDeletePhoneNumberParamsTest {

    @Test
    fun create() {
        VerificationManagementSandboxDeletePhoneNumberParams.builder()
            .phoneNumber("+12065550100")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerificationManagementSandboxDeletePhoneNumberParams.builder()
                .phoneNumber("+12065550100")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("+12065550100")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

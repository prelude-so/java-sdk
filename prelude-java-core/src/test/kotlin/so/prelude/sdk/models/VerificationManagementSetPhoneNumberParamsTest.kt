// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationManagementSetPhoneNumberParamsTest {

    @Test
    fun create() {
        VerificationManagementSetPhoneNumberParams.builder()
            .action(VerificationManagementSetPhoneNumberParams.Action.ALLOW)
            .phoneNumber("+30123456789")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerificationManagementSetPhoneNumberParams.builder()
                .action(VerificationManagementSetPhoneNumberParams.Action.ALLOW)
                .phoneNumber("+30123456789")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("allow")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            VerificationManagementSetPhoneNumberParams.builder()
                .action(VerificationManagementSetPhoneNumberParams.Action.ALLOW)
                .phoneNumber("+30123456789")
                .build()

        val body = params._body()

        assertThat(body.phoneNumber()).isEqualTo("+30123456789")
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationManagementSandboxAddPhoneNumberParamsTest {

    @Test
    fun create() {
        VerificationManagementSandboxAddPhoneNumberParams.builder()
            .attemptCode("123456")
            .phoneNumber("+30123456789")
            .build()
    }

    @Test
    fun body() {
        val params =
            VerificationManagementSandboxAddPhoneNumberParams.builder()
                .attemptCode("123456")
                .phoneNumber("+30123456789")
                .build()

        val body = params._body()

        assertThat(body.attemptCode()).isEqualTo("123456")
        assertThat(body.phoneNumber()).isEqualTo("+30123456789")
    }
}

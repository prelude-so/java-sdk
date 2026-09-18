// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementSandboxAddPhoneNumberResponseTest {

    @Test
    fun create() {
        val verificationManagementSandboxAddPhoneNumberResponse =
            VerificationManagementSandboxAddPhoneNumberResponse.builder()
                .attemptCode("123456")
                .phoneNumber("+30123456789")
                .build()

        assertThat(verificationManagementSandboxAddPhoneNumberResponse.attemptCode())
            .isEqualTo("123456")
        assertThat(verificationManagementSandboxAddPhoneNumberResponse.phoneNumber())
            .isEqualTo("+30123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementSandboxAddPhoneNumberResponse =
            VerificationManagementSandboxAddPhoneNumberResponse.builder()
                .attemptCode("123456")
                .phoneNumber("+30123456789")
                .build()

        val roundtrippedVerificationManagementSandboxAddPhoneNumberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationManagementSandboxAddPhoneNumberResponse),
                jacksonTypeRef<VerificationManagementSandboxAddPhoneNumberResponse>(),
            )

        assertThat(roundtrippedVerificationManagementSandboxAddPhoneNumberResponse)
            .isEqualTo(verificationManagementSandboxAddPhoneNumberResponse)
    }
}

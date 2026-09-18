// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementSandboxDeletePhoneNumberResponseTest {

    @Test
    fun create() {
        val verificationManagementSandboxDeletePhoneNumberResponse =
            VerificationManagementSandboxDeletePhoneNumberResponse.builder()
                .phoneNumber("+30123456789")
                .build()

        assertThat(verificationManagementSandboxDeletePhoneNumberResponse.phoneNumber())
            .isEqualTo("+30123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementSandboxDeletePhoneNumberResponse =
            VerificationManagementSandboxDeletePhoneNumberResponse.builder()
                .phoneNumber("+30123456789")
                .build()

        val roundtrippedVerificationManagementSandboxDeletePhoneNumberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    verificationManagementSandboxDeletePhoneNumberResponse
                ),
                jacksonTypeRef<VerificationManagementSandboxDeletePhoneNumberResponse>(),
            )

        assertThat(roundtrippedVerificationManagementSandboxDeletePhoneNumberResponse)
            .isEqualTo(verificationManagementSandboxDeletePhoneNumberResponse)
    }
}

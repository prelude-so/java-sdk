// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementSetPhoneNumberResponseTest {

    @Test
    fun create() {
        val verificationManagementSetPhoneNumberResponse =
            VerificationManagementSetPhoneNumberResponse.builder()
                .phoneNumber("+30123456789")
                .build()

        assertThat(verificationManagementSetPhoneNumberResponse.phoneNumber())
            .isEqualTo("+30123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementSetPhoneNumberResponse =
            VerificationManagementSetPhoneNumberResponse.builder()
                .phoneNumber("+30123456789")
                .build()

        val roundtrippedVerificationManagementSetPhoneNumberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationManagementSetPhoneNumberResponse),
                jacksonTypeRef<VerificationManagementSetPhoneNumberResponse>(),
            )

        assertThat(roundtrippedVerificationManagementSetPhoneNumberResponse)
            .isEqualTo(verificationManagementSetPhoneNumberResponse)
    }
}

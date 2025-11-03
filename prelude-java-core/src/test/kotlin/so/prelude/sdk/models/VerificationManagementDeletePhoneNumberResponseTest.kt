// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementDeletePhoneNumberResponseTest {

    @Test
    fun create() {
        val verificationManagementDeletePhoneNumberResponse =
            VerificationManagementDeletePhoneNumberResponse.builder()
                .phoneNumber("+30123456789")
                .build()

        assertThat(verificationManagementDeletePhoneNumberResponse.phoneNumber())
            .isEqualTo("+30123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementDeletePhoneNumberResponse =
            VerificationManagementDeletePhoneNumberResponse.builder()
                .phoneNumber("+30123456789")
                .build()

        val roundtrippedVerificationManagementDeletePhoneNumberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationManagementDeletePhoneNumberResponse),
                jacksonTypeRef<VerificationManagementDeletePhoneNumberResponse>(),
            )

        assertThat(roundtrippedVerificationManagementDeletePhoneNumberResponse)
            .isEqualTo(verificationManagementDeletePhoneNumberResponse)
    }
}

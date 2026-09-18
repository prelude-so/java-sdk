// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementSandboxListPhoneNumbersResponseTest {

    @Test
    fun create() {
        val verificationManagementSandboxListPhoneNumbersResponse =
            VerificationManagementSandboxListPhoneNumbersResponse.builder()
                .addPhoneNumber(
                    VerificationManagementSandboxListPhoneNumbersResponse.PhoneNumber.builder()
                        .attemptCode("123456")
                        .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .phoneNumber("+30123456789")
                        .build()
                )
                .build()

        assertThat(verificationManagementSandboxListPhoneNumbersResponse.phoneNumbers())
            .containsExactly(
                VerificationManagementSandboxListPhoneNumbersResponse.PhoneNumber.builder()
                    .attemptCode("123456")
                    .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                    .phoneNumber("+30123456789")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementSandboxListPhoneNumbersResponse =
            VerificationManagementSandboxListPhoneNumbersResponse.builder()
                .addPhoneNumber(
                    VerificationManagementSandboxListPhoneNumbersResponse.PhoneNumber.builder()
                        .attemptCode("123456")
                        .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .phoneNumber("+30123456789")
                        .build()
                )
                .build()

        val roundtrippedVerificationManagementSandboxListPhoneNumbersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(
                    verificationManagementSandboxListPhoneNumbersResponse
                ),
                jacksonTypeRef<VerificationManagementSandboxListPhoneNumbersResponse>(),
            )

        assertThat(roundtrippedVerificationManagementSandboxListPhoneNumbersResponse)
            .isEqualTo(verificationManagementSandboxListPhoneNumbersResponse)
    }
}

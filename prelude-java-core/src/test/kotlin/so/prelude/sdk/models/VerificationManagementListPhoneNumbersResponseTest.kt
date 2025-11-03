// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementListPhoneNumbersResponseTest {

    @Test
    fun create() {
        val verificationManagementListPhoneNumbersResponse =
            VerificationManagementListPhoneNumbersResponse.builder()
                .addPhoneNumber(
                    VerificationManagementListPhoneNumbersResponse.PhoneNumber.builder()
                        .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .phoneNumber("+30123456789")
                        .build()
                )
                .build()

        assertThat(verificationManagementListPhoneNumbersResponse.phoneNumbers())
            .containsExactly(
                VerificationManagementListPhoneNumbersResponse.PhoneNumber.builder()
                    .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                    .phoneNumber("+30123456789")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementListPhoneNumbersResponse =
            VerificationManagementListPhoneNumbersResponse.builder()
                .addPhoneNumber(
                    VerificationManagementListPhoneNumbersResponse.PhoneNumber.builder()
                        .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .phoneNumber("+30123456789")
                        .build()
                )
                .build()

        val roundtrippedVerificationManagementListPhoneNumbersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationManagementListPhoneNumbersResponse),
                jacksonTypeRef<VerificationManagementListPhoneNumbersResponse>(),
            )

        assertThat(roundtrippedVerificationManagementListPhoneNumbersResponse)
            .isEqualTo(verificationManagementListPhoneNumbersResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementSubmitSenderIdResponseTest {

    @Test
    fun create() {
        val verificationManagementSubmitSenderIdResponse =
            VerificationManagementSubmitSenderIdResponse.builder()
                .senderId("sender_id")
                .status(VerificationManagementSubmitSenderIdResponse.Status.APPROVED)
                .reason("reason")
                .build()

        assertThat(verificationManagementSubmitSenderIdResponse.senderId()).isEqualTo("sender_id")
        assertThat(verificationManagementSubmitSenderIdResponse.status())
            .isEqualTo(VerificationManagementSubmitSenderIdResponse.Status.APPROVED)
        assertThat(verificationManagementSubmitSenderIdResponse.reason()).contains("reason")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementSubmitSenderIdResponse =
            VerificationManagementSubmitSenderIdResponse.builder()
                .senderId("sender_id")
                .status(VerificationManagementSubmitSenderIdResponse.Status.APPROVED)
                .reason("reason")
                .build()

        val roundtrippedVerificationManagementSubmitSenderIdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationManagementSubmitSenderIdResponse),
                jacksonTypeRef<VerificationManagementSubmitSenderIdResponse>(),
            )

        assertThat(roundtrippedVerificationManagementSubmitSenderIdResponse)
            .isEqualTo(verificationManagementSubmitSenderIdResponse)
    }
}

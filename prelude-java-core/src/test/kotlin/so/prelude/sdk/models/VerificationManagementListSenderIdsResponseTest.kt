// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementListSenderIdsResponseTest {

    @Test
    fun create() {
        val verificationManagementListSenderIdsResponse =
            VerificationManagementListSenderIdsResponse.builder()
                .addSenderId(
                    VerificationManagementListSenderIdsResponse.SenderId.builder()
                        .senderId("sender_id")
                        .status(
                            VerificationManagementListSenderIdsResponse.SenderId.Status.APPROVED
                        )
                        .build()
                )
                .build()

        assertThat(verificationManagementListSenderIdsResponse.senderIds().getOrNull())
            .containsExactly(
                VerificationManagementListSenderIdsResponse.SenderId.builder()
                    .senderId("sender_id")
                    .status(VerificationManagementListSenderIdsResponse.SenderId.Status.APPROVED)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementListSenderIdsResponse =
            VerificationManagementListSenderIdsResponse.builder()
                .addSenderId(
                    VerificationManagementListSenderIdsResponse.SenderId.builder()
                        .senderId("sender_id")
                        .status(
                            VerificationManagementListSenderIdsResponse.SenderId.Status.APPROVED
                        )
                        .build()
                )
                .build()

        val roundtrippedVerificationManagementListSenderIdsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationManagementListSenderIdsResponse),
                jacksonTypeRef<VerificationManagementListSenderIdsResponse>(),
            )

        assertThat(roundtrippedVerificationManagementListSenderIdsResponse)
            .isEqualTo(verificationManagementListSenderIdsResponse)
    }
}

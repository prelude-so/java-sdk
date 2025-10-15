// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationManagementListSenderIdsResponseTest {

    @Test
    fun create() {
        val verificationManagementListSenderIdsResponse =
            VerificationManagementListSenderIdsResponse.builder()
                .status(VerificationManagementListSenderIdsResponse.Status.APPROVED)
                .value("value")
                .build()

        assertThat(verificationManagementListSenderIdsResponse.status())
            .contains(VerificationManagementListSenderIdsResponse.Status.APPROVED)
        assertThat(verificationManagementListSenderIdsResponse.value()).contains("value")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationManagementListSenderIdsResponse =
            VerificationManagementListSenderIdsResponse.builder()
                .status(VerificationManagementListSenderIdsResponse.Status.APPROVED)
                .value("value")
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

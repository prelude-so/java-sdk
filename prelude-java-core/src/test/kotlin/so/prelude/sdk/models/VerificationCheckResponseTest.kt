// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationCheckResponseTest {

    @Test
    fun create() {
        val verificationCheckResponse =
            VerificationCheckResponse.builder()
                .status(VerificationCheckResponse.Status.SUCCESS)
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .metadata(
                    VerificationCheckResponse.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .requestId("request_id")
                .build()

        assertThat(verificationCheckResponse.status())
            .isEqualTo(VerificationCheckResponse.Status.SUCCESS)
        assertThat(verificationCheckResponse.id()).contains("vrf_01jc0t6fwwfgfsq1md24mhyztj")
        assertThat(verificationCheckResponse.metadata())
            .contains(
                VerificationCheckResponse.Metadata.builder().correlationId("correlation_id").build()
            )
        assertThat(verificationCheckResponse.requestId()).contains("request_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationCheckResponse =
            VerificationCheckResponse.builder()
                .status(VerificationCheckResponse.Status.SUCCESS)
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .metadata(
                    VerificationCheckResponse.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .requestId("request_id")
                .build()

        val roundtrippedVerificationCheckResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationCheckResponse),
                jacksonTypeRef<VerificationCheckResponse>(),
            )

        assertThat(roundtrippedVerificationCheckResponse).isEqualTo(verificationCheckResponse)
    }
}

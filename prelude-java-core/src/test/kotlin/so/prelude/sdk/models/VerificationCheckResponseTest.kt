// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VerificationCheckResponseTest {

    @Test
    fun createVerificationCheckResponse() {
        val verificationCheckResponse =
            VerificationCheckResponse.builder()
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .metadata(
                    VerificationCheckResponse.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .requestId("request_id")
                .status(VerificationCheckResponse.Status.SUCCESS)
                .build()
        assertThat(verificationCheckResponse).isNotNull
        assertThat(verificationCheckResponse.id()).contains("vrf_01jc0t6fwwfgfsq1md24mhyztj")
        assertThat(verificationCheckResponse.metadata())
            .contains(
                VerificationCheckResponse.Metadata.builder().correlationId("correlation_id").build()
            )
        assertThat(verificationCheckResponse.requestId()).contains("request_id")
        assertThat(verificationCheckResponse.status())
            .contains(VerificationCheckResponse.Status.SUCCESS)
    }
}

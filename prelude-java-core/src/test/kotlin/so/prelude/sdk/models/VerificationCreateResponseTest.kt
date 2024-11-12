// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VerificationCreateResponseTest {

    @Test
    fun createVerificationCreateResponse() {
        val verificationCreateResponse =
            VerificationCreateResponse.builder()
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .metadata(
                    VerificationCreateResponse.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .method(VerificationCreateResponse.Method.MESSAGE)
                .requestId("request_id")
                .status(VerificationCreateResponse.Status.SUCCESS)
                .build()
        assertThat(verificationCreateResponse).isNotNull
        assertThat(verificationCreateResponse.id()).contains("vrf_01jc0t6fwwfgfsq1md24mhyztj")
        assertThat(verificationCreateResponse.metadata())
            .contains(
                VerificationCreateResponse.Metadata.builder()
                    .correlationId("correlation_id")
                    .build()
            )
        assertThat(verificationCreateResponse.method())
            .contains(VerificationCreateResponse.Method.MESSAGE)
        assertThat(verificationCreateResponse.requestId()).contains("request_id")
        assertThat(verificationCreateResponse.status())
            .contains(VerificationCreateResponse.Status.SUCCESS)
    }
}

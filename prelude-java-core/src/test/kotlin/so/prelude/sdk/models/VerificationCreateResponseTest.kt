// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VerificationCreateResponseTest {

    @Test
    fun createVerificationCreateResponse() {
      val verificationCreateResponse = VerificationCreateResponse.builder()
          .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
          .method(VerificationCreateResponse.Method.MESSAGE)
          .status(VerificationCreateResponse.Status.SUCCESS)
          .metadata(VerificationCreateResponse.Metadata.builder()
              .correlationId("correlation_id")
              .build())
          .requestId("request_id")
          .build()
      assertThat(verificationCreateResponse).isNotNull
      assertThat(verificationCreateResponse.id()).isEqualTo("vrf_01jc0t6fwwfgfsq1md24mhyztj")
      assertThat(verificationCreateResponse.method()).isEqualTo(VerificationCreateResponse.Method.MESSAGE)
      assertThat(verificationCreateResponse.status()).isEqualTo(VerificationCreateResponse.Status.SUCCESS)
      assertThat(verificationCreateResponse.metadata()).contains(VerificationCreateResponse.Metadata.builder()
          .correlationId("correlation_id")
          .build())
      assertThat(verificationCreateResponse.requestId()).contains("request_id")
    }
}

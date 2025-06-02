// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationCreateResponseTest {

    @Test
    fun create() {
        val verificationCreateResponse =
            VerificationCreateResponse.builder()
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .method(VerificationCreateResponse.Method.MESSAGE)
                .status(VerificationCreateResponse.Status.SUCCESS)
                .addChannel("string")
                .metadata(
                    VerificationCreateResponse.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .reason(VerificationCreateResponse.Reason.INVALID_PHONE_NUMBER)
                .requestId("request_id")
                .silent(
                    VerificationCreateResponse.Silent.builder().requestUrl("request_url").build()
                )
                .build()

        assertThat(verificationCreateResponse.id()).isEqualTo("vrf_01jc0t6fwwfgfsq1md24mhyztj")
        assertThat(verificationCreateResponse.method())
            .isEqualTo(VerificationCreateResponse.Method.MESSAGE)
        assertThat(verificationCreateResponse.status())
            .isEqualTo(VerificationCreateResponse.Status.SUCCESS)
        assertThat(verificationCreateResponse.channels().getOrNull()).containsExactly("string")
        assertThat(verificationCreateResponse.metadata())
            .contains(
                VerificationCreateResponse.Metadata.builder()
                    .correlationId("correlation_id")
                    .build()
            )
        assertThat(verificationCreateResponse.reason())
            .contains(VerificationCreateResponse.Reason.INVALID_PHONE_NUMBER)
        assertThat(verificationCreateResponse.requestId()).contains("request_id")
        assertThat(verificationCreateResponse.silent())
            .contains(VerificationCreateResponse.Silent.builder().requestUrl("request_url").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationCreateResponse =
            VerificationCreateResponse.builder()
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .method(VerificationCreateResponse.Method.MESSAGE)
                .status(VerificationCreateResponse.Status.SUCCESS)
                .addChannel("string")
                .metadata(
                    VerificationCreateResponse.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .reason(VerificationCreateResponse.Reason.INVALID_PHONE_NUMBER)
                .requestId("request_id")
                .silent(
                    VerificationCreateResponse.Silent.builder().requestUrl("request_url").build()
                )
                .build()

        val roundtrippedVerificationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationCreateResponse),
                jacksonTypeRef<VerificationCreateResponse>(),
            )

        assertThat(roundtrippedVerificationCreateResponse).isEqualTo(verificationCreateResponse)
    }
}

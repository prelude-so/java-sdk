// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VerificationCheckParamsTest {

    @Test
    fun create() {
        VerificationCheckParams.builder()
            .code("12345")
            .target(
                VerificationCheckParams.Target.builder()
                    .type(VerificationCheckParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            VerificationCheckParams.builder()
                .code("12345")
                .target(
                    VerificationCheckParams.Target.builder()
                        .type(VerificationCheckParams.Target.Type.PHONE_NUMBER)
                        .value("+30123456789")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("12345")
        assertThat(body.target())
            .isEqualTo(
                VerificationCheckParams.Target.builder()
                    .type(VerificationCheckParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VerificationCheckParams.builder()
                .code("12345")
                .target(
                    VerificationCheckParams.Target.builder()
                        .type(VerificationCheckParams.Target.Type.PHONE_NUMBER)
                        .value("+30123456789")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.code()).isEqualTo("12345")
        assertThat(body.target())
            .isEqualTo(
                VerificationCheckParams.Target.builder()
                    .type(VerificationCheckParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }
}

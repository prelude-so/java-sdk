// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.models

import com.prelude_so.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VerificationCheckParamsTest {

    @Test
    fun createVerificationCheckParams() {
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
    fun getBody() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
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
    fun getBodyWithoutOptionalFields() {
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
        val body = params.getBody()
        assertThat(body).isNotNull
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

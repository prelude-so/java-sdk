// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.models.*

class VerificationCreateParamsTest {

    @Test
    fun createVerificationCreateParams() {
        VerificationCreateParams.builder()
            .target(
                VerificationCreateParams.Target.builder()
                    .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
            .metadata(
                VerificationCreateParams.Metadata.builder().correlationId("correlation_id").build()
            )
            .options(
                VerificationCreateParams.Options.builder()
                    .appRealm("app_realm")
                    .customCode("custom_code")
                    .locale("el-GR")
                    .senderId("sender_id")
                    .templateId("template_id")
                    .build()
            )
            .signals(
                VerificationCreateParams.Signals.builder()
                    .appVersion("1.2.34")
                    .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                    .deviceModel("iPhone17,2")
                    .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.ANDROID)
                    .ip("192.0.2.1")
                    .isTrustedUser(false)
                    .osVersion("18.0.1")
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            VerificationCreateParams.builder()
                .target(
                    VerificationCreateParams.Target.builder()
                        .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                        .value("+30123456789")
                        .build()
                )
                .metadata(
                    VerificationCreateParams.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .options(
                    VerificationCreateParams.Options.builder()
                        .appRealm("app_realm")
                        .customCode("custom_code")
                        .locale("el-GR")
                        .senderId("sender_id")
                        .templateId("template_id")
                        .build()
                )
                .signals(
                    VerificationCreateParams.Signals.builder()
                        .appVersion("1.2.34")
                        .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                        .deviceModel("iPhone17,2")
                        .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.ANDROID)
                        .ip("192.0.2.1")
                        .isTrustedUser(false)
                        .osVersion("18.0.1")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.target())
            .isEqualTo(
                VerificationCreateParams.Target.builder()
                    .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
        assertThat(body.metadata())
            .isEqualTo(
                VerificationCreateParams.Metadata.builder().correlationId("correlation_id").build()
            )
        assertThat(body.options())
            .isEqualTo(
                VerificationCreateParams.Options.builder()
                    .appRealm("app_realm")
                    .customCode("custom_code")
                    .locale("el-GR")
                    .senderId("sender_id")
                    .templateId("template_id")
                    .build()
            )
        assertThat(body.signals())
            .isEqualTo(
                VerificationCreateParams.Signals.builder()
                    .appVersion("1.2.34")
                    .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                    .deviceModel("iPhone17,2")
                    .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.ANDROID)
                    .ip("192.0.2.1")
                    .isTrustedUser(false)
                    .osVersion("18.0.1")
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            VerificationCreateParams.builder()
                .target(
                    VerificationCreateParams.Target.builder()
                        .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                        .value("+30123456789")
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.target())
            .isEqualTo(
                VerificationCreateParams.Target.builder()
                    .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }
}

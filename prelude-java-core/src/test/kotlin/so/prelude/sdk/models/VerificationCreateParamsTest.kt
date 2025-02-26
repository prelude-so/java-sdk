// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class VerificationCreateParamsTest {

    @Test
    fun create() {
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
                    .locale("el-GR")
                    .senderId("sender_id")
                    .templateId("template_id")
                    .build()
            )
            .signals(
                VerificationCreateParams.Signals.builder()
                    .appVersion("app_version")
                    .deviceId("device_id")
                    .deviceModel("device_model")
                    .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.ANDROID)
                    .ip("8.8.8.8")
                    .isTrustedUser("is_trusted_user")
                    .osVersion("os_version")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
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
                        .locale("el-GR")
                        .senderId("sender_id")
                        .templateId("template_id")
                        .build()
                )
                .signals(
                    VerificationCreateParams.Signals.builder()
                        .appVersion("app_version")
                        .deviceId("device_id")
                        .deviceModel("device_model")
                        .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.ANDROID)
                        .ip("8.8.8.8")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.target())
            .isEqualTo(
                VerificationCreateParams.Target.builder()
                    .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
        assertThat(body.metadata())
            .contains(
                VerificationCreateParams.Metadata.builder().correlationId("correlation_id").build()
            )
        assertThat(body.options())
            .contains(
                VerificationCreateParams.Options.builder()
                    .appRealm("app_realm")
                    .locale("el-GR")
                    .senderId("sender_id")
                    .templateId("template_id")
                    .build()
            )
        assertThat(body.signals())
            .contains(
                VerificationCreateParams.Signals.builder()
                    .appVersion("app_version")
                    .deviceId("device_id")
                    .deviceModel("device_model")
                    .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.ANDROID)
                    .ip("8.8.8.8")
                    .isTrustedUser("is_trusted_user")
                    .osVersion("os_version")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            VerificationCreateParams.builder()
                .target(
                    VerificationCreateParams.Target.builder()
                        .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                        .value("+30123456789")
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.target())
            .isEqualTo(
                VerificationCreateParams.Target.builder()
                    .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }
}

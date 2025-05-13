// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue

internal class VerificationCreateParamsTest {

    @Test
    fun create() {
        VerificationCreateParams.builder()
            .target(
                VerificationCreateParams.Target.builder()
                    .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
            .dispatchId("dispatch_id")
            .metadata(
                VerificationCreateParams.Metadata.builder().correlationId("correlation_id").build()
            )
            .options(
                VerificationCreateParams.Options.builder()
                    .appRealm(
                        VerificationCreateParams.Options.AppRealm.builder()
                            .platform(VerificationCreateParams.Options.AppRealm.Platform.ANDROID)
                            .value("value")
                            .build()
                    )
                    .callbackUrl("callback_url")
                    .codeSize(5L)
                    .customCode("123456")
                    .locale("el-GR")
                    .method(VerificationCreateParams.Options.Method.AUTO)
                    .preferredChannel(VerificationCreateParams.Options.PreferredChannel.SMS)
                    .senderId("sender_id")
                    .templateId("prelude:psd2")
                    .variables(
                        VerificationCreateParams.Options.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
            .signals(
                VerificationCreateParams.Signals.builder()
                    .appVersion("1.2.34")
                    .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                    .deviceModel("iPhone17,2")
                    .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.IOS)
                    .ip("192.0.2.1")
                    .isTrustedUser(false)
                    .osVersion("18.0.1")
                    .userAgent(
                        "Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Mobile/15E148 Safari/604.1"
                    )
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
                .dispatchId("dispatch_id")
                .metadata(
                    VerificationCreateParams.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .options(
                    VerificationCreateParams.Options.builder()
                        .appRealm(
                            VerificationCreateParams.Options.AppRealm.builder()
                                .platform(
                                    VerificationCreateParams.Options.AppRealm.Platform.ANDROID
                                )
                                .value("value")
                                .build()
                        )
                        .callbackUrl("callback_url")
                        .codeSize(5L)
                        .customCode("123456")
                        .locale("el-GR")
                        .method(VerificationCreateParams.Options.Method.AUTO)
                        .preferredChannel(VerificationCreateParams.Options.PreferredChannel.SMS)
                        .senderId("sender_id")
                        .templateId("prelude:psd2")
                        .variables(
                            VerificationCreateParams.Options.Variables.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .signals(
                    VerificationCreateParams.Signals.builder()
                        .appVersion("1.2.34")
                        .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                        .deviceModel("iPhone17,2")
                        .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.IOS)
                        .ip("192.0.2.1")
                        .isTrustedUser(false)
                        .osVersion("18.0.1")
                        .userAgent(
                            "Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Mobile/15E148 Safari/604.1"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.target())
            .isEqualTo(
                VerificationCreateParams.Target.builder()
                    .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
        assertThat(body.dispatchId()).contains("dispatch_id")
        assertThat(body.metadata())
            .contains(
                VerificationCreateParams.Metadata.builder().correlationId("correlation_id").build()
            )
        assertThat(body.options())
            .contains(
                VerificationCreateParams.Options.builder()
                    .appRealm(
                        VerificationCreateParams.Options.AppRealm.builder()
                            .platform(VerificationCreateParams.Options.AppRealm.Platform.ANDROID)
                            .value("value")
                            .build()
                    )
                    .callbackUrl("callback_url")
                    .codeSize(5L)
                    .customCode("123456")
                    .locale("el-GR")
                    .method(VerificationCreateParams.Options.Method.AUTO)
                    .preferredChannel(VerificationCreateParams.Options.PreferredChannel.SMS)
                    .senderId("sender_id")
                    .templateId("prelude:psd2")
                    .variables(
                        VerificationCreateParams.Options.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.signals())
            .contains(
                VerificationCreateParams.Signals.builder()
                    .appVersion("1.2.34")
                    .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                    .deviceModel("iPhone17,2")
                    .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.IOS)
                    .ip("192.0.2.1")
                    .isTrustedUser(false)
                    .osVersion("18.0.1")
                    .userAgent(
                        "Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Mobile/15E148 Safari/604.1"
                    )
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

        assertThat(body.target())
            .isEqualTo(
                VerificationCreateParams.Target.builder()
                    .type(VerificationCreateParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }
}

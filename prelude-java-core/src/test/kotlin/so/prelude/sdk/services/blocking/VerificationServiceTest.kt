// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.models.VerificationCheckParams
import so.prelude.sdk.models.VerificationCreateParams

@ExtendWith(TestServerExtension::class)
internal class VerificationServiceTest {

    @Test
    fun create() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationService = client.verification()

        val verification =
            verificationService.create(
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
                            .customCode("custom_code")
                            .locale("el-GR")
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
            )

        verification.validate()
    }

    @Test
    fun check() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationService = client.verification()

        val response =
            verificationService.check(
                VerificationCheckParams.builder()
                    .code("12345")
                    .target(
                        VerificationCheckParams.Target.builder()
                            .type(VerificationCheckParams.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }
}

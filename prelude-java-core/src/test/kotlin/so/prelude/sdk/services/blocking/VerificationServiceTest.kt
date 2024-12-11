// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.models.*

@ExtendWith(TestServerExtension::class)
class VerificationServiceTest {

    @Test
    fun callCreate() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationService = client.verification()
        val verificationCreateResponse =
            verificationService.create(
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
            )
        println(verificationCreateResponse)
        verificationCreateResponse.validate()
    }

    @Test
    fun callCheck() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationService = client.verification()
        val verificationCheckResponse =
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
        println(verificationCheckResponse)
        verificationCheckResponse.validate()
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.models.VerificationCheckParams
import so.prelude.sdk.models.VerificationCreateParams

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

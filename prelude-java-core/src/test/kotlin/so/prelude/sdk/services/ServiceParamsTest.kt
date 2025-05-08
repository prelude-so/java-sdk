// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.parallel.ResourceLock
import so.prelude.sdk.client.PreludeClient
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.models.VerificationCreateParams

@WireMockTest
@ResourceLock("https://github.com/wiremock/wiremock/issues/169")
internal class ServiceParamsTest {

    private lateinit var client: PreludeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            PreludeOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.httpBaseUrl)
                .apiToken("My API Token")
                .build()
    }

    @Test
    fun create() {
        val verificationService = client.verification()
        stubFor(post(anyUrl()).willReturn(ok("{}")))

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
                .method(VerificationCreateParams.Method.AUTO)
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
                .putAdditionalHeader("Secret-Header", "42")
                .putAdditionalQueryParam("secret_query_param", "42")
                .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
                .build()
        )

        verify(
            postRequestedFor(anyUrl())
                .withHeader("Secret-Header", equalTo("42"))
                .withQueryParam("secret_query_param", equalTo("42"))
                .withRequestBody(matchingJsonPath("$.secretProperty", equalTo("42")))
        )
    }
}

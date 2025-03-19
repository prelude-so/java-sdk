// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services

import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.entry
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import so.prelude.sdk.client.PreludeClient
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.jsonMapper
import so.prelude.sdk.errors.BadRequestException
import so.prelude.sdk.errors.InternalServerException
import so.prelude.sdk.errors.NotFoundException
import so.prelude.sdk.errors.PermissionDeniedException
import so.prelude.sdk.errors.PreludeException
import so.prelude.sdk.errors.RateLimitException
import so.prelude.sdk.errors.UnauthorizedException
import so.prelude.sdk.errors.UnexpectedStatusCodeException
import so.prelude.sdk.errors.UnprocessableEntityException
import so.prelude.sdk.models.VerificationCreateParams

@WireMockTest
internal class ErrorHandlingTest {

    companion object {

        private val ERROR_JSON: JsonValue = JsonValue.from(mapOf("errorProperty" to "42"))

        private val ERROR_JSON_BYTES: ByteArray = jsonMapper().writeValueAsBytes(ERROR_JSON)

        private const val HEADER_NAME: String = "Error-Header"

        private const val HEADER_VALUE: String = "42"

        private const val NOT_JSON: String = "Not JSON"
    }

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
    fun verificationCreate400() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(400).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<BadRequestException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e.statusCode()).isEqualTo(400)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun verificationCreate401() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(401).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnauthorizedException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e.statusCode()).isEqualTo(401)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun verificationCreate403() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(403).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<PermissionDeniedException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e.statusCode()).isEqualTo(403)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun verificationCreate404() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(404).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<NotFoundException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e.statusCode()).isEqualTo(404)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun verificationCreate422() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(422).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnprocessableEntityException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e.statusCode()).isEqualTo(422)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun verificationCreate429() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(429).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<RateLimitException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e.statusCode()).isEqualTo(429)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun verificationCreate500() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(500).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<InternalServerException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e.statusCode()).isEqualTo(500)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun verificationCreate999() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(
                    status(999).withHeader(HEADER_NAME, HEADER_VALUE).withBody(ERROR_JSON_BYTES)
                )
        )

        val e =
            assertThrows<UnexpectedStatusCodeException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e.statusCode()).isEqualTo(999)
        assertThat(e.headers().toMap()).contains(entry(HEADER_NAME, listOf(HEADER_VALUE)))
        assertThat(e.body()).isEqualTo(ERROR_JSON)
    }

    @Test
    fun verificationCreateInvalidJsonBody() {
        val verificationService = client.verification()
        stubFor(
            post(anyUrl())
                .willReturn(status(200).withHeader(HEADER_NAME, HEADER_VALUE).withBody(NOT_JSON))
        )

        val e =
            assertThrows<PreludeException> {
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
                                            VerificationCreateParams.Options.AppRealm.Platform
                                                .ANDROID
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
                                .devicePlatform(
                                    VerificationCreateParams.Signals.DevicePlatform.ANDROID
                                )
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
            }

        assertThat(e).hasMessage("Error reading response")
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}

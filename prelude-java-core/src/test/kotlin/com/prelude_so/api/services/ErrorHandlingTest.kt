// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.status
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import com.prelude_so.api.client.PreludeClient
import com.prelude_so.api.client.okhttp.PreludeOkHttpClient
import com.prelude_so.api.core.JsonString
import com.prelude_so.api.core.http.Headers
import com.prelude_so.api.core.jsonMapper
import com.prelude_so.api.errors.BadRequestException
import com.prelude_so.api.errors.InternalServerException
import com.prelude_so.api.errors.NotFoundException
import com.prelude_so.api.errors.PermissionDeniedException
import com.prelude_so.api.errors.PreludeError
import com.prelude_so.api.errors.PreludeException
import com.prelude_so.api.errors.RateLimitException
import com.prelude_so.api.errors.UnauthorizedException
import com.prelude_so.api.errors.UnexpectedStatusCodeException
import com.prelude_so.api.errors.UnprocessableEntityException
import com.prelude_so.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Assertions.assertThatThrownBy
import org.assertj.core.api.InstanceOfAssertFactories
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

@WireMockTest
class ErrorHandlingTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private val PRELUDE_ERROR: PreludeError =
        PreludeError.builder().putAdditionalProperty("key", JsonString.of("value")).build()

    private lateinit var client: PreludeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            PreludeOkHttpClient.builder()
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .apiToken("My API Token")
                .build()
    }

    @Test
    fun verificationsCreate200() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        val expected =
            VerificationCreateResponse.builder()
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .metadata(
                    VerificationCreateResponse.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .method(VerificationCreateResponse.Method.MESSAGE)
                .requestId("request_id")
                .status(VerificationCreateResponse.Status.SUCCESS)
                .build()

        stubFor(post(anyUrl()).willReturn(ok().withBody(toJson(expected))))

        assertThat(client.verification().create(params)).isEqualTo(expected)
    }

    @Test
    fun verificationsCreate400() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(400).withHeader("Foo", "Bar").withBody(toJson(PRELUDE_ERROR)))
        )

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().put("Foo", "Bar").build(), PRELUDE_ERROR)
            })
    }

    @Test
    fun verificationsCreate401() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(401).withHeader("Foo", "Bar").withBody(toJson(PRELUDE_ERROR)))
        )

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertUnauthorized(e, Headers.builder().put("Foo", "Bar").build(), PRELUDE_ERROR)
            })
    }

    @Test
    fun verificationsCreate403() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(403).withHeader("Foo", "Bar").withBody(toJson(PRELUDE_ERROR)))
        )

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertPermissionDenied(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    PRELUDE_ERROR
                )
            })
    }

    @Test
    fun verificationsCreate404() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(404).withHeader("Foo", "Bar").withBody(toJson(PRELUDE_ERROR)))
        )

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertNotFound(e, Headers.builder().put("Foo", "Bar").build(), PRELUDE_ERROR)
            })
    }

    @Test
    fun verificationsCreate422() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(422).withHeader("Foo", "Bar").withBody(toJson(PRELUDE_ERROR)))
        )

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertUnprocessableEntity(
                    e,
                    Headers.builder().put("Foo", "Bar").build(),
                    PRELUDE_ERROR
                )
            })
    }

    @Test
    fun verificationsCreate429() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(429).withHeader("Foo", "Bar").withBody(toJson(PRELUDE_ERROR)))
        )

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertRateLimit(e, Headers.builder().put("Foo", "Bar").build(), PRELUDE_ERROR)
            })
    }

    @Test
    fun verificationsCreate500() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(500).withHeader("Foo", "Bar").withBody(toJson(PRELUDE_ERROR)))
        )

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertInternalServer(e, Headers.builder().put("Foo", "Bar").build(), PRELUDE_ERROR)
            })
    }

    @Test
    fun unexpectedStatusCode() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(
            post(anyUrl())
                .willReturn(status(999).withHeader("Foo", "Bar").withBody(toJson(PRELUDE_ERROR)))
        )

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertUnexpectedStatusCodeException(
                    e,
                    999,
                    Headers.builder().put("Foo", "Bar").build(),
                    toJson(PRELUDE_ERROR)
                )
            })
    }

    @Test
    fun invalidBody() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(post(anyUrl()).willReturn(status(200).withBody("Not JSON")))

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertThat(e)
                    .isInstanceOf(PreludeException::class.java)
                    .hasMessage("Error reading response")
            })
    }

    @Test
    fun invalidErrorBody() {
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
                        .ip("ip")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("os_version")
                        .build()
                )
                .build()

        stubFor(post(anyUrl()).willReturn(status(400).withBody("Not JSON")))

        assertThatThrownBy({ client.verification().create(params) })
            .satisfies({ e ->
                assertBadRequest(e, Headers.builder().build(), PreludeError.builder().build())
            })
    }

    private fun <T> toJson(body: T): ByteArray {
        return JSON_MAPPER.writeValueAsBytes(body)
    }

    private fun assertUnexpectedStatusCodeException(
        throwable: Throwable,
        statusCode: Int,
        headers: Headers,
        responseBody: ByteArray
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnexpectedStatusCodeException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(statusCode)
                assertThat(e.body()).isEqualTo(String(responseBody))
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertBadRequest(throwable: Throwable, headers: Headers, error: PreludeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(BadRequestException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(400)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnauthorized(throwable: Throwable, headers: Headers, error: PreludeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(UnauthorizedException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(401)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertPermissionDenied(
        throwable: Throwable,
        headers: Headers,
        error: PreludeError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(PermissionDeniedException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(403)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertNotFound(throwable: Throwable, headers: Headers, error: PreludeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(NotFoundException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(404)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertUnprocessableEntity(
        throwable: Throwable,
        headers: Headers,
        error: PreludeError
    ) {
        assertThat(throwable)
            .asInstanceOf(
                InstanceOfAssertFactories.throwable(UnprocessableEntityException::class.java)
            )
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(422)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertRateLimit(throwable: Throwable, headers: Headers, error: PreludeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(RateLimitException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(429)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun assertInternalServer(throwable: Throwable, headers: Headers, error: PreludeError) {
        assertThat(throwable)
            .asInstanceOf(InstanceOfAssertFactories.throwable(InternalServerException::class.java))
            .satisfies({ e ->
                assertThat(e.statusCode()).isEqualTo(500)
                assertThat(e.error()).isEqualTo(error)
                assertThat(e.headers().toMap()).containsAllEntriesOf(headers.toMap())
            })
    }

    private fun Headers.toMap(): Map<String, List<String>> =
        mutableMapOf<String, List<String>>().also { map ->
            names().forEach { map[it] = values(it) }
        }
}

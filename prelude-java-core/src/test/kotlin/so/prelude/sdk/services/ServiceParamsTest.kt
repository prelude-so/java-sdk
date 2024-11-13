// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services

import com.fasterxml.jackson.databind.json.JsonMapper
import com.github.tomakehurst.wiremock.client.WireMock.anyUrl
import com.github.tomakehurst.wiremock.client.WireMock.equalTo
import com.github.tomakehurst.wiremock.client.WireMock.get
import com.github.tomakehurst.wiremock.client.WireMock.matchingJsonPath
import com.github.tomakehurst.wiremock.client.WireMock.ok
import com.github.tomakehurst.wiremock.client.WireMock.post
import com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor
import com.github.tomakehurst.wiremock.client.WireMock.put
import com.github.tomakehurst.wiremock.client.WireMock.stubFor
import com.github.tomakehurst.wiremock.client.WireMock.verify
import com.github.tomakehurst.wiremock.junit5.WireMockRuntimeInfo
import com.github.tomakehurst.wiremock.junit5.WireMockTest
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import so.prelude.sdk.client.PreludeClient
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.core.JsonString
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.jsonMapper
import so.prelude.sdk.models.*

@WireMockTest
class ServiceParamsTest {

    private val JSON_MAPPER: JsonMapper = jsonMapper()

    private lateinit var client: PreludeClient

    @BeforeEach
    fun beforeEach(wmRuntimeInfo: WireMockRuntimeInfo) {
        client =
            PreludeOkHttpClient.builder()
                .apiToken("My API Token")
                .baseUrl(wmRuntimeInfo.getHttpBaseUrl())
                .build()
    }

    @Test
    fun verificationsCreateWithAdditionalParams() {
        val additionalHeaders = mutableMapOf<String, List<String>>()

        additionalHeaders.put("x-test-header", listOf("abc1234"))

        val additionalQueryParams = mutableMapOf<String, List<String>>()

        additionalQueryParams.put("test_query_param", listOf("def567"))

        val additionalBodyProperties = mutableMapOf<String, JsonValue>()

        additionalBodyProperties.put("testBodyProperty", JsonString.of("ghi890"))

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
                        .appVersion("1.2.34")
                        .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                        .deviceModel("iPhone17,2")
                        .devicePlatform(VerificationCreateParams.Signals.DevicePlatform.ANDROID)
                        .ip("192.0.2.1")
                        .isTrustedUser("is_trusted_user")
                        .osVersion("18.0.1")
                        .build()
                )
                .additionalHeaders(additionalHeaders)
                .additionalBodyProperties(additionalBodyProperties)
                .additionalQueryParams(additionalQueryParams)
                .build()

        val apiResponse =
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

        stubFor(
            post(anyUrl())
                .withHeader("x-test-header", equalTo("abc1234"))
                .withQueryParam("test_query_param", equalTo("def567"))
                .withRequestBody(matchingJsonPath("$.testBodyProperty", equalTo("ghi890")))
                .willReturn(ok(JSON_MAPPER.writeValueAsString(apiResponse)))
        )

        client.verification().create(params)

        verify(postRequestedFor(anyUrl()))
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.proguard

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.core.jsonMapper
import so.prelude.sdk.models.VerificationCreateResponse

internal class ProGuardCompatibilityTest {

    companion object {

        @BeforeAll
        @JvmStatic
        fun setUp() {
            // To debug that we're using the right JAR.
            val jarPath = this::class.java.getProtectionDomain().codeSource.location
            println("JAR being used: $jarPath")
        }
    }

    @Test
    fun proguardRules() {
        val rulesFile =
            javaClass.classLoader.getResourceAsStream("META-INF/proguard/prelude-java-core.pro")

        assertThat(rulesFile).isNotNull()
    }

    @Test
    fun client() {
        val client = PreludeOkHttpClient.builder().apiToken("My API Token").build()

        assertThat(client).isNotNull()
        assertThat(client.lookup()).isNotNull()
        assertThat(client.transactional()).isNotNull()
        assertThat(client.verification()).isNotNull()
        assertThat(client.watch()).isNotNull()
    }

    @Test
    fun verificationCreateResponseRoundtrip() {
        val jsonMapper = jsonMapper()
        val verificationCreateResponse =
            VerificationCreateResponse.builder()
                .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                .method(VerificationCreateResponse.Method.MESSAGE)
                .status(VerificationCreateResponse.Status.SUCCESS)
                .addChannel(VerificationCreateResponse.Channel.SMS)
                .metadata(
                    VerificationCreateResponse.Metadata.builder()
                        .correlationId("correlation_id")
                        .build()
                )
                .reason(VerificationCreateResponse.Reason.INVALID_PHONE_NUMBER)
                .requestId("request_id")
                .silent(
                    VerificationCreateResponse.Silent.builder().requestUrl("request_url").build()
                )
                .build()

        val roundtrippedVerificationCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationCreateResponse),
                jacksonTypeRef<VerificationCreateResponse>(),
            )

        assertThat(roundtrippedVerificationCreateResponse).isEqualTo(verificationCreateResponse)
    }
}

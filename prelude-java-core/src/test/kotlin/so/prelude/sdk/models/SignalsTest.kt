// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class SignalsTest {

    @Test
    fun create() {
        val signals =
            Signals.builder()
                .appVersion("1.2.34")
                .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                .deviceModel("iPhone17,2")
                .devicePlatform(Signals.DevicePlatform.IOS)
                .existingUser(false)
                .ip("203.0.113.123")
                .isTrustedUser(false)
                .ja4Fingerprint("t13d1516h2_8daaf6152771_e5627efa2ab1")
                .osVersion("18.0.1")
                .userAgent(
                    "Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Mobile/15E148 Safari/604.1"
                )
                .build()

        assertThat(signals.appVersion()).contains("1.2.34")
        assertThat(signals.deviceId()).contains("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
        assertThat(signals.deviceModel()).contains("iPhone17,2")
        assertThat(signals.devicePlatform()).contains(Signals.DevicePlatform.IOS)
        assertThat(signals.existingUser()).contains(false)
        assertThat(signals.ip()).contains("203.0.113.123")
        assertThat(signals.isTrustedUser()).contains(false)
        assertThat(signals.ja4Fingerprint()).contains("t13d1516h2_8daaf6152771_e5627efa2ab1")
        assertThat(signals.osVersion()).contains("18.0.1")
        assertThat(signals.userAgent())
            .contains(
                "Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Mobile/15E148 Safari/604.1"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val signals =
            Signals.builder()
                .appVersion("1.2.34")
                .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                .deviceModel("iPhone17,2")
                .devicePlatform(Signals.DevicePlatform.IOS)
                .existingUser(false)
                .ip("203.0.113.123")
                .isTrustedUser(false)
                .ja4Fingerprint("t13d1516h2_8daaf6152771_e5627efa2ab1")
                .osVersion("18.0.1")
                .userAgent(
                    "Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Mobile/15E148 Safari/604.1"
                )
                .build()

        val roundtrippedSignals =
            jsonMapper.readValue(jsonMapper.writeValueAsString(signals), jacksonTypeRef<Signals>())

        assertThat(roundtrippedSignals).isEqualTo(signals)
    }
}

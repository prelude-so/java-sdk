// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue

internal class WatchEvaluateParamsTest {

    @Test
    fun create() {
        WatchEvaluateParams.builder()
            .flowId("flo_01jc0t6fwwfgfsq1md24mhyztj")
            .target(Target.builder().type(Target.Type.PHONE_NUMBER).value("+30123456789").build())
            .attributes(
                WatchEvaluateParams.Attributes.builder()
                    .putAdditionalProperty("plan_tier", JsonValue.from("free"))
                    .putAdditionalProperty("account_age_days", JsonValue.from("3"))
                    .build()
            )
            .dispatchId("123e4567-e89b-12d3-a456-426614174000")
            .signals(
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
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WatchEvaluateParams.builder()
                .flowId("flo_01jc0t6fwwfgfsq1md24mhyztj")
                .target(
                    Target.builder().type(Target.Type.PHONE_NUMBER).value("+30123456789").build()
                )
                .attributes(
                    WatchEvaluateParams.Attributes.builder()
                        .putAdditionalProperty("plan_tier", JsonValue.from("free"))
                        .putAdditionalProperty("account_age_days", JsonValue.from("3"))
                        .build()
                )
                .dispatchId("123e4567-e89b-12d3-a456-426614174000")
                .signals(
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
                )
                .build()

        val body = params._body()

        assertThat(body.flowId()).isEqualTo("flo_01jc0t6fwwfgfsq1md24mhyztj")
        assertThat(body.target())
            .isEqualTo(
                Target.builder().type(Target.Type.PHONE_NUMBER).value("+30123456789").build()
            )
        assertThat(body.attributes())
            .contains(
                WatchEvaluateParams.Attributes.builder()
                    .putAdditionalProperty("plan_tier", JsonValue.from("free"))
                    .putAdditionalProperty("account_age_days", JsonValue.from("3"))
                    .build()
            )
        assertThat(body.dispatchId()).contains("123e4567-e89b-12d3-a456-426614174000")
        assertThat(body.signals())
            .contains(
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
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WatchEvaluateParams.builder()
                .flowId("flo_01jc0t6fwwfgfsq1md24mhyztj")
                .target(
                    Target.builder().type(Target.Type.PHONE_NUMBER).value("+30123456789").build()
                )
                .build()

        val body = params._body()

        assertThat(body.flowId()).isEqualTo("flo_01jc0t6fwwfgfsq1md24mhyztj")
        assertThat(body.target())
            .isEqualTo(
                Target.builder().type(Target.Type.PHONE_NUMBER).value("+30123456789").build()
            )
    }
}

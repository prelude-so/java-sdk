// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchPredictParamsTest {

    @Test
    fun create() {
        WatchPredictParams.builder()
            .target(
                WatchPredictParams.Target.builder()
                    .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
            .dispatchId("dispatch_id")
            .metadata(WatchPredictParams.Metadata.builder().correlationId("correlation_id").build())
            .signals(
                WatchPredictParams.Signals.builder()
                    .appVersion("1.2.34")
                    .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                    .deviceModel("iPhone17,2")
                    .devicePlatform(WatchPredictParams.Signals.DevicePlatform.IOS)
                    .ip("192.0.2.1")
                    .isTrustedUser(false)
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
            WatchPredictParams.builder()
                .target(
                    WatchPredictParams.Target.builder()
                        .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                        .value("+30123456789")
                        .build()
                )
                .dispatchId("dispatch_id")
                .metadata(
                    WatchPredictParams.Metadata.builder().correlationId("correlation_id").build()
                )
                .signals(
                    WatchPredictParams.Signals.builder()
                        .appVersion("1.2.34")
                        .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                        .deviceModel("iPhone17,2")
                        .devicePlatform(WatchPredictParams.Signals.DevicePlatform.IOS)
                        .ip("192.0.2.1")
                        .isTrustedUser(false)
                        .osVersion("18.0.1")
                        .userAgent(
                            "Mozilla/5.0 (iPhone; CPU iPhone OS 14_4 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/14.0.3 Mobile/15E148 Safari/604.1"
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.target())
            .isEqualTo(
                WatchPredictParams.Target.builder()
                    .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
        assertThat(body.dispatchId()).contains("dispatch_id")
        assertThat(body.metadata())
            .contains(WatchPredictParams.Metadata.builder().correlationId("correlation_id").build())
        assertThat(body.signals())
            .contains(
                WatchPredictParams.Signals.builder()
                    .appVersion("1.2.34")
                    .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                    .deviceModel("iPhone17,2")
                    .devicePlatform(WatchPredictParams.Signals.DevicePlatform.IOS)
                    .ip("192.0.2.1")
                    .isTrustedUser(false)
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
            WatchPredictParams.builder()
                .target(
                    WatchPredictParams.Target.builder()
                        .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                        .value("+30123456789")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.target())
            .isEqualTo(
                WatchPredictParams.Target.builder()
                    .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }
}

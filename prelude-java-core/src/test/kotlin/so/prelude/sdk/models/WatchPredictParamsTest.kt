// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WatchPredictParamsTest {

    @Test
    fun create() {
        WatchPredictParams.builder()
            .target(
                WatchPredictParams.Target.builder()
                    .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
            .signals(
                WatchPredictParams.Signals.builder()
                    .deviceId("device_id")
                    .deviceModel("device_model")
                    .deviceType("device_type")
                    .ip("ip")
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
                .signals(
                    WatchPredictParams.Signals.builder()
                        .deviceId("device_id")
                        .deviceModel("device_model")
                        .deviceType("device_type")
                        .ip("ip")
                        .build()
                )
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.target())
            .isEqualTo(
                WatchPredictParams.Target.builder()
                    .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
        assertThat(body.signals())
            .contains(
                WatchPredictParams.Signals.builder()
                    .deviceId("device_id")
                    .deviceModel("device_model")
                    .deviceType("device_type")
                    .ip("ip")
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
        assertThat(body).isNotNull
        assertThat(body.target())
            .isEqualTo(
                WatchPredictParams.Target.builder()
                    .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }
}

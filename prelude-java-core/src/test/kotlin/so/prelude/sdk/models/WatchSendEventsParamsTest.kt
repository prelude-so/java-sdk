// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchSendEventsParamsTest {

    @Test
    fun create() {
        WatchSendEventsParams.builder()
            .addEvent(
                WatchSendEventsParams.Event.builder()
                    .confidence(WatchSendEventsParams.Event.Confidence.MAXIMUM)
                    .label("onboarding.start")
                    .target(
                        WatchSendEventsParams.Event.Target.builder()
                            .type(WatchSendEventsParams.Event.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WatchSendEventsParams.builder()
                .addEvent(
                    WatchSendEventsParams.Event.builder()
                        .confidence(WatchSendEventsParams.Event.Confidence.MAXIMUM)
                        .label("onboarding.start")
                        .target(
                            WatchSendEventsParams.Event.Target.builder()
                                .type(WatchSendEventsParams.Event.Target.Type.PHONE_NUMBER)
                                .value("+30123456789")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.events())
            .containsExactly(
                WatchSendEventsParams.Event.builder()
                    .confidence(WatchSendEventsParams.Event.Confidence.MAXIMUM)
                    .label("onboarding.start")
                    .target(
                        WatchSendEventsParams.Event.Target.builder()
                            .type(WatchSendEventsParams.Event.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .build()
            )
    }
}

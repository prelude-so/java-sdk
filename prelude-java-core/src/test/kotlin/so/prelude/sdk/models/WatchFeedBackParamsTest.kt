// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchFeedBackParamsTest {

    @Test
    fun create() {
        WatchFeedBackParams.builder()
            .addFeedback(
                WatchFeedBackParams.Feedback.builder()
                    .target(
                        WatchFeedBackParams.Feedback.Target.builder()
                            .type(WatchFeedBackParams.Feedback.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .type(WatchFeedBackParams.Feedback.Type.VERIFICATION_STARTED)
                    .dispatchId("dispatch_id")
                    .metadata(
                        WatchFeedBackParams.Feedback.Metadata.builder()
                            .correlationId("correlation_id")
                            .build()
                    )
                    .signals(
                        WatchFeedBackParams.Feedback.Signals.builder()
                            .appVersion("1.2.34")
                            .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                            .deviceModel("iPhone17,2")
                            .devicePlatform(WatchFeedBackParams.Feedback.Signals.DevicePlatform.IOS)
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
            .build()
    }

    @Test
    fun body() {
        val params =
            WatchFeedBackParams.builder()
                .addFeedback(
                    WatchFeedBackParams.Feedback.builder()
                        .target(
                            WatchFeedBackParams.Feedback.Target.builder()
                                .type(WatchFeedBackParams.Feedback.Target.Type.PHONE_NUMBER)
                                .value("+30123456789")
                                .build()
                        )
                        .type(WatchFeedBackParams.Feedback.Type.VERIFICATION_STARTED)
                        .dispatchId("dispatch_id")
                        .metadata(
                            WatchFeedBackParams.Feedback.Metadata.builder()
                                .correlationId("correlation_id")
                                .build()
                        )
                        .signals(
                            WatchFeedBackParams.Feedback.Signals.builder()
                                .appVersion("1.2.34")
                                .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                                .deviceModel("iPhone17,2")
                                .devicePlatform(
                                    WatchFeedBackParams.Feedback.Signals.DevicePlatform.IOS
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
                .build()

        val body = params._body()

        assertThat(body.feedbacks())
            .containsExactly(
                WatchFeedBackParams.Feedback.builder()
                    .target(
                        WatchFeedBackParams.Feedback.Target.builder()
                            .type(WatchFeedBackParams.Feedback.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .type(WatchFeedBackParams.Feedback.Type.VERIFICATION_STARTED)
                    .dispatchId("dispatch_id")
                    .metadata(
                        WatchFeedBackParams.Feedback.Metadata.builder()
                            .correlationId("correlation_id")
                            .build()
                    )
                    .signals(
                        WatchFeedBackParams.Feedback.Signals.builder()
                            .appVersion("1.2.34")
                            .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                            .deviceModel("iPhone17,2")
                            .devicePlatform(WatchFeedBackParams.Feedback.Signals.DevicePlatform.IOS)
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

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WatchFeedBackParams.builder()
                .addFeedback(
                    WatchFeedBackParams.Feedback.builder()
                        .target(
                            WatchFeedBackParams.Feedback.Target.builder()
                                .type(WatchFeedBackParams.Feedback.Target.Type.PHONE_NUMBER)
                                .value("+30123456789")
                                .build()
                        )
                        .type(WatchFeedBackParams.Feedback.Type.VERIFICATION_STARTED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.feedbacks())
            .containsExactly(
                WatchFeedBackParams.Feedback.builder()
                    .target(
                        WatchFeedBackParams.Feedback.Target.builder()
                            .type(WatchFeedBackParams.Feedback.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .type(WatchFeedBackParams.Feedback.Type.VERIFICATION_STARTED)
                    .build()
            )
    }
}

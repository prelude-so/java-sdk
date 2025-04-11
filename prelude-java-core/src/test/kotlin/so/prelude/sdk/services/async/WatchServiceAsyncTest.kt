// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.models.WatchPredictParams
import so.prelude.sdk.models.WatchSendEventsParams
import so.prelude.sdk.models.WatchSendFeedbacksParams

@ExtendWith(TestServerExtension::class)
internal class WatchServiceAsyncTest {

    @Test
    fun predict() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val watchServiceAsync = client.watch()

        val responseFuture =
            watchServiceAsync.predict(
                WatchPredictParams.builder()
                    .target(
                        WatchPredictParams.Target.builder()
                            .type(WatchPredictParams.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .dispatchId("dispatch_id")
                    .metadata(
                        WatchPredictParams.Metadata.builder()
                            .correlationId("correlation_id")
                            .build()
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun sendEvents() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val watchServiceAsync = client.watch()

        val responseFuture =
            watchServiceAsync.sendEvents(
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
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun sendFeedbacks() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val watchServiceAsync = client.watch()

        val responseFuture =
            watchServiceAsync.sendFeedbacks(
                WatchSendFeedbacksParams.builder()
                    .addFeedback(
                        WatchSendFeedbacksParams.Feedback.builder()
                            .target(
                                WatchSendFeedbacksParams.Feedback.Target.builder()
                                    .type(
                                        WatchSendFeedbacksParams.Feedback.Target.Type.PHONE_NUMBER
                                    )
                                    .value("+30123456789")
                                    .build()
                            )
                            .type(WatchSendFeedbacksParams.Feedback.Type.VERIFICATION_STARTED)
                            .dispatchId("dispatch_id")
                            .metadata(
                                WatchSendFeedbacksParams.Feedback.Metadata.builder()
                                    .correlationId("correlation_id")
                                    .build()
                            )
                            .signals(
                                WatchSendFeedbacksParams.Feedback.Signals.builder()
                                    .appVersion("1.2.34")
                                    .deviceId("8F0B8FDD-C2CB-4387-B20A-56E9B2E5A0D2")
                                    .deviceModel("iPhone17,2")
                                    .devicePlatform(
                                        WatchSendFeedbacksParams.Feedback.Signals.DevicePlatform.IOS
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
            )

        val response = responseFuture.get()
        response.validate()
    }
}

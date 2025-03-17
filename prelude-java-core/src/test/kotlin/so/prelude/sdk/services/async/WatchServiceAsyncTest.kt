// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.models.WatchFeedBackParams
import so.prelude.sdk.models.WatchPredictParams

@ExtendWith(TestServerExtension::class)
internal class WatchServiceAsyncTest {

    @Test
    fun feedBack() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val watchServiceAsync = client.watch()

        val responseFuture =
            watchServiceAsync.feedBack(
                WatchFeedBackParams.builder()
                    .feedback(
                        WatchFeedBackParams.Feedback.builder()
                            .type(WatchFeedBackParams.Feedback.Type.CONFIRM_TARGET)
                            .build()
                    )
                    .target(
                        WatchFeedBackParams.Target.builder()
                            .type(WatchFeedBackParams.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

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
                    .signals(
                        WatchPredictParams.Signals.builder()
                            .deviceId("device_id")
                            .deviceModel("device_model")
                            .deviceType("device_type")
                            .ip("ip")
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

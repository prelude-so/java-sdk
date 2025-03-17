// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.models.WatchFeedBackParams
import so.prelude.sdk.models.WatchPredictParams

@ExtendWith(TestServerExtension::class)
internal class WatchServiceTest {

    @Test
    fun feedBack() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val watchService = client.watch()

        val response =
            watchService.feedBack(
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

        response.validate()
    }

    @Test
    fun predict() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val watchService = client.watch()

        val response =
            watchService.predict(
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

        response.validate()
    }
}

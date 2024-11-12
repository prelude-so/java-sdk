// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.services.blocking

import com.prelude_so.api.TestServerExtension
import com.prelude_so.api.client.okhttp.PreludeOkHttpClient
import com.prelude_so.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class WatchServiceTest {

    @Test
    fun callFeedBack() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val watchService = client.watch()
        val watchFeedBackResponse =
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
        println(watchFeedBackResponse)
        watchFeedBackResponse.validate()
    }

    @Test
    fun callPredict() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val watchService = client.watch()
        val watchPredictResponse =
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
        println(watchPredictResponse)
        watchPredictResponse.validate()
    }
}

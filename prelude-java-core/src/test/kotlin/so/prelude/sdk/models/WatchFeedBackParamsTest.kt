// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WatchFeedBackParamsTest {

    @Test
    fun createWatchFeedBackParams() {
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
    }

    @Test
    fun body() {
        val params =
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
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.feedback())
            .isEqualTo(
                WatchFeedBackParams.Feedback.builder()
                    .type(WatchFeedBackParams.Feedback.Type.CONFIRM_TARGET)
                    .build()
            )
        assertThat(body.target())
            .isEqualTo(
                WatchFeedBackParams.Target.builder()
                    .type(WatchFeedBackParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
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
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.feedback())
            .isEqualTo(
                WatchFeedBackParams.Feedback.builder()
                    .type(WatchFeedBackParams.Feedback.Type.CONFIRM_TARGET)
                    .build()
            )
        assertThat(body.target())
            .isEqualTo(
                WatchFeedBackParams.Target.builder()
                    .type(WatchFeedBackParams.Target.Type.PHONE_NUMBER)
                    .value("+30123456789")
                    .build()
            )
    }
}

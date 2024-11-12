// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.models

import com.prelude_so.api.models.*
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
    fun getBody() {
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
        val body = params.getBody()
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
    fun getBodyWithoutOptionalFields() {
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
        val body = params.getBody()
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

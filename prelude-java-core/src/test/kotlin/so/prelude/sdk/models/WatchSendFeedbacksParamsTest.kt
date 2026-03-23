// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WatchSendFeedbacksParamsTest {

    @Test
    fun create() {
        WatchSendFeedbacksParams.builder()
            .addFeedback(
                WatchSendFeedbacksParams.Feedback.builder()
                    .target(
                        WatchSendFeedbacksParams.Feedback.Target.builder()
                            .type(WatchSendFeedbacksParams.Feedback.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .type(WatchSendFeedbacksParams.Feedback.Type.VERIFICATION_STARTED)
                    .metadata(
                        WatchSendFeedbacksParams.Feedback.Metadata.builder()
                            .correlationId("correlation_id")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            WatchSendFeedbacksParams.builder()
                .addFeedback(
                    WatchSendFeedbacksParams.Feedback.builder()
                        .target(
                            WatchSendFeedbacksParams.Feedback.Target.builder()
                                .type(WatchSendFeedbacksParams.Feedback.Target.Type.PHONE_NUMBER)
                                .value("+30123456789")
                                .build()
                        )
                        .type(WatchSendFeedbacksParams.Feedback.Type.VERIFICATION_STARTED)
                        .metadata(
                            WatchSendFeedbacksParams.Feedback.Metadata.builder()
                                .correlationId("correlation_id")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.feedbacks())
            .containsExactly(
                WatchSendFeedbacksParams.Feedback.builder()
                    .target(
                        WatchSendFeedbacksParams.Feedback.Target.builder()
                            .type(WatchSendFeedbacksParams.Feedback.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .type(WatchSendFeedbacksParams.Feedback.Type.VERIFICATION_STARTED)
                    .metadata(
                        WatchSendFeedbacksParams.Feedback.Metadata.builder()
                            .correlationId("correlation_id")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            WatchSendFeedbacksParams.builder()
                .addFeedback(
                    WatchSendFeedbacksParams.Feedback.builder()
                        .target(
                            WatchSendFeedbacksParams.Feedback.Target.builder()
                                .type(WatchSendFeedbacksParams.Feedback.Target.Type.PHONE_NUMBER)
                                .value("+30123456789")
                                .build()
                        )
                        .type(WatchSendFeedbacksParams.Feedback.Type.VERIFICATION_STARTED)
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.feedbacks())
            .containsExactly(
                WatchSendFeedbacksParams.Feedback.builder()
                    .target(
                        WatchSendFeedbacksParams.Feedback.Target.builder()
                            .type(WatchSendFeedbacksParams.Feedback.Target.Type.PHONE_NUMBER)
                            .value("+30123456789")
                            .build()
                    )
                    .type(WatchSendFeedbacksParams.Feedback.Type.VERIFICATION_STARTED)
                    .build()
            )
    }
}

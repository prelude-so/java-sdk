// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NotifyReplyParamsTest {

    @Test
    fun create() {
        NotifyReplyParams.builder()
            .replyTo("im_01k8aq2zggeyssvt53zgvpx63a")
            .text("Thanks for reaching out! We'll look into your request.")
            .to("+33612345678")
            .callbackUrl("https://your-app.com/webhooks/notify")
            .correlationId("support-ticket-42")
            .build()
    }

    @Test
    fun body() {
        val params =
            NotifyReplyParams.builder()
                .replyTo("im_01k8aq2zggeyssvt53zgvpx63a")
                .text("Thanks for reaching out! We'll look into your request.")
                .to("+33612345678")
                .callbackUrl("https://your-app.com/webhooks/notify")
                .correlationId("support-ticket-42")
                .build()

        val body = params._body()

        assertThat(body.replyTo()).isEqualTo("im_01k8aq2zggeyssvt53zgvpx63a")
        assertThat(body.text()).isEqualTo("Thanks for reaching out! We'll look into your request.")
        assertThat(body.to()).isEqualTo("+33612345678")
        assertThat(body.callbackUrl()).contains("https://your-app.com/webhooks/notify")
        assertThat(body.correlationId()).contains("support-ticket-42")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotifyReplyParams.builder()
                .replyTo("im_01k8aq2zggeyssvt53zgvpx63a")
                .text("Thanks for reaching out! We'll look into your request.")
                .to("+33612345678")
                .build()

        val body = params._body()

        assertThat(body.replyTo()).isEqualTo("im_01k8aq2zggeyssvt53zgvpx63a")
        assertThat(body.text()).isEqualTo("Thanks for reaching out! We'll look into your request.")
        assertThat(body.to()).isEqualTo("+33612345678")
    }
}

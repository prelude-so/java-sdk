// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class NotifyReplyResponseTest {

    @Test
    fun create() {
        val notifyReplyResponse =
            NotifyReplyResponse.builder()
                .id("tx_01k8ap1btqf5r9fq2c8ax5fhc9")
                .createdAt(OffsetDateTime.parse("2025-10-24T12:00:00Z"))
                .replyTo("im_01k8aq2zggeyssvt53zgvpx63a")
                .text("Thanks for reaching out! We'll look into your request.")
                .to("+33612345678")
                .callbackUrl("https://your-app.com/webhooks/notify")
                .correlationId("support-ticket-42")
                .build()

        assertThat(notifyReplyResponse.id()).isEqualTo("tx_01k8ap1btqf5r9fq2c8ax5fhc9")
        assertThat(notifyReplyResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2025-10-24T12:00:00Z"))
        assertThat(notifyReplyResponse.replyTo()).isEqualTo("im_01k8aq2zggeyssvt53zgvpx63a")
        assertThat(notifyReplyResponse.text())
            .isEqualTo("Thanks for reaching out! We'll look into your request.")
        assertThat(notifyReplyResponse.to()).isEqualTo("+33612345678")
        assertThat(notifyReplyResponse.callbackUrl())
            .contains("https://your-app.com/webhooks/notify")
        assertThat(notifyReplyResponse.correlationId()).contains("support-ticket-42")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notifyReplyResponse =
            NotifyReplyResponse.builder()
                .id("tx_01k8ap1btqf5r9fq2c8ax5fhc9")
                .createdAt(OffsetDateTime.parse("2025-10-24T12:00:00Z"))
                .replyTo("im_01k8aq2zggeyssvt53zgvpx63a")
                .text("Thanks for reaching out! We'll look into your request.")
                .to("+33612345678")
                .callbackUrl("https://your-app.com/webhooks/notify")
                .correlationId("support-ticket-42")
                .build()

        val roundtrippedNotifyReplyResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notifyReplyResponse),
                jacksonTypeRef<NotifyReplyResponse>(),
            )

        assertThat(roundtrippedNotifyReplyResponse).isEqualTo(notifyReplyResponse)
    }
}

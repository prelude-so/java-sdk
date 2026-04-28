// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue

internal class NotifySendParamsTest {

    @Test
    fun create() {
        NotifySendParams.builder()
            .templateId("template_01k8ap1btqf5r9fq2c8ax5fhc9")
            .to("+33612345678")
            .callbackUrl("https://your-app.com/webhooks/notify")
            .context(
                NotifySendParams.Context.builder().replyTo("im_01k8aq2zggeyssvt53zgvpx63a").build()
            )
            .correlationId("order-12345")
            .document(
                NotifySendParams.Document.builder()
                    .url("https://example.com/invoice.pdf")
                    .filename("invoice.pdf")
                    .build()
            )
            .expiresAt(OffsetDateTime.parse("2025-12-25T18:00:00Z"))
            .from("from")
            .locale("el-GR")
            .preferredChannel(NotifySendParams.PreferredChannel.WHATSAPP)
            .scheduleAt(OffsetDateTime.parse("2025-12-25T10:00:00Z"))
            .text("Thanks for reaching out! We'll look into your request.")
            .variables(
                NotifySendParams.Variables.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("12345"))
                    .putAdditionalProperty("amount", JsonValue.from("\$49.99"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            NotifySendParams.builder()
                .templateId("template_01k8ap1btqf5r9fq2c8ax5fhc9")
                .to("+33612345678")
                .callbackUrl("https://your-app.com/webhooks/notify")
                .context(
                    NotifySendParams.Context.builder()
                        .replyTo("im_01k8aq2zggeyssvt53zgvpx63a")
                        .build()
                )
                .correlationId("order-12345")
                .document(
                    NotifySendParams.Document.builder()
                        .url("https://example.com/invoice.pdf")
                        .filename("invoice.pdf")
                        .build()
                )
                .expiresAt(OffsetDateTime.parse("2025-12-25T18:00:00Z"))
                .from("from")
                .locale("el-GR")
                .preferredChannel(NotifySendParams.PreferredChannel.WHATSAPP)
                .scheduleAt(OffsetDateTime.parse("2025-12-25T10:00:00Z"))
                .text("Thanks for reaching out! We'll look into your request.")
                .variables(
                    NotifySendParams.Variables.builder()
                        .putAdditionalProperty("order_id", JsonValue.from("12345"))
                        .putAdditionalProperty("amount", JsonValue.from("\$49.99"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.templateId()).isEqualTo("template_01k8ap1btqf5r9fq2c8ax5fhc9")
        assertThat(body.to()).isEqualTo("+33612345678")
        assertThat(body.callbackUrl()).contains("https://your-app.com/webhooks/notify")
        assertThat(body.context())
            .contains(
                NotifySendParams.Context.builder().replyTo("im_01k8aq2zggeyssvt53zgvpx63a").build()
            )
        assertThat(body.correlationId()).contains("order-12345")
        assertThat(body.document())
            .contains(
                NotifySendParams.Document.builder()
                    .url("https://example.com/invoice.pdf")
                    .filename("invoice.pdf")
                    .build()
            )
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2025-12-25T18:00:00Z"))
        assertThat(body.from()).contains("from")
        assertThat(body.locale()).contains("el-GR")
        assertThat(body.preferredChannel()).contains(NotifySendParams.PreferredChannel.WHATSAPP)
        assertThat(body.scheduleAt()).contains(OffsetDateTime.parse("2025-12-25T10:00:00Z"))
        assertThat(body.text()).contains("Thanks for reaching out! We'll look into your request.")
        assertThat(body.variables())
            .contains(
                NotifySendParams.Variables.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("12345"))
                    .putAdditionalProperty("amount", JsonValue.from("\$49.99"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotifySendParams.builder()
                .templateId("template_01k8ap1btqf5r9fq2c8ax5fhc9")
                .to("+33612345678")
                .build()

        val body = params._body()

        assertThat(body.templateId()).isEqualTo("template_01k8ap1btqf5r9fq2c8ax5fhc9")
        assertThat(body.to()).isEqualTo("+33612345678")
    }
}

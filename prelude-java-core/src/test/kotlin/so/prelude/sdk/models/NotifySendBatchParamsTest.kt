// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue

internal class NotifySendBatchParamsTest {

    @Test
    fun create() {
        NotifySendBatchParams.builder()
            .templateId("template_01k8ap1btqf5r9fq2c8ax5fhc9")
            .addTo("+33612345678")
            .addTo("+15551234567")
            .callbackUrl("https://your-app.com/webhooks/notify")
            .correlationId("campaign-12345")
            .expiresAt(OffsetDateTime.parse("2025-12-25T18:00:00Z"))
            .from("from")
            .locale("el-GR")
            .preferredChannel(NotifySendBatchParams.PreferredChannel.WHATSAPP)
            .scheduleAt(OffsetDateTime.parse("2025-12-25T10:00:00Z"))
            .variables(
                NotifySendBatchParams.Variables.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("12345"))
                    .putAdditionalProperty("amount", JsonValue.from("\$49.99"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            NotifySendBatchParams.builder()
                .templateId("template_01k8ap1btqf5r9fq2c8ax5fhc9")
                .addTo("+33612345678")
                .addTo("+15551234567")
                .callbackUrl("https://your-app.com/webhooks/notify")
                .correlationId("campaign-12345")
                .expiresAt(OffsetDateTime.parse("2025-12-25T18:00:00Z"))
                .from("from")
                .locale("el-GR")
                .preferredChannel(NotifySendBatchParams.PreferredChannel.WHATSAPP)
                .scheduleAt(OffsetDateTime.parse("2025-12-25T10:00:00Z"))
                .variables(
                    NotifySendBatchParams.Variables.builder()
                        .putAdditionalProperty("order_id", JsonValue.from("12345"))
                        .putAdditionalProperty("amount", JsonValue.from("\$49.99"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.templateId()).isEqualTo("template_01k8ap1btqf5r9fq2c8ax5fhc9")
        assertThat(body.to()).containsExactly("+33612345678", "+15551234567")
        assertThat(body.callbackUrl()).contains("https://your-app.com/webhooks/notify")
        assertThat(body.correlationId()).contains("campaign-12345")
        assertThat(body.expiresAt()).contains(OffsetDateTime.parse("2025-12-25T18:00:00Z"))
        assertThat(body.from()).contains("from")
        assertThat(body.locale()).contains("el-GR")
        assertThat(body.preferredChannel())
            .contains(NotifySendBatchParams.PreferredChannel.WHATSAPP)
        assertThat(body.scheduleAt()).contains(OffsetDateTime.parse("2025-12-25T10:00:00Z"))
        assertThat(body.variables())
            .contains(
                NotifySendBatchParams.Variables.builder()
                    .putAdditionalProperty("order_id", JsonValue.from("12345"))
                    .putAdditionalProperty("amount", JsonValue.from("\$49.99"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            NotifySendBatchParams.builder()
                .templateId("template_01k8ap1btqf5r9fq2c8ax5fhc9")
                .addTo("+33612345678")
                .addTo("+15551234567")
                .build()

        val body = params._body()

        assertThat(body.templateId()).isEqualTo("template_01k8ap1btqf5r9fq2c8ax5fhc9")
        assertThat(body.to()).containsExactly("+33612345678", "+15551234567")
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue

internal class TransactionalSendParamsTest {

    @Test
    fun create() {
        TransactionalSendParams.builder()
            .templateId("template_01hynf45qvevj844m9az2x2f3c")
            .to("+30123456789")
            .callbackUrl("callback_url")
            .correlationId("correlation_id")
            .document(
                TransactionalSendParams.Document.builder()
                    .url("https://example.com/invoice.pdf")
                    .filename("invoice.pdf")
                    .build()
            )
            .expiresAt("expires_at")
            .from("from")
            .locale("el-GR")
            .preferredChannel(TransactionalSendParams.PreferredChannel.WHATSAPP)
            .variables(
                TransactionalSendParams.Variables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionalSendParams.builder()
                .templateId("template_01hynf45qvevj844m9az2x2f3c")
                .to("+30123456789")
                .callbackUrl("callback_url")
                .correlationId("correlation_id")
                .document(
                    TransactionalSendParams.Document.builder()
                        .url("https://example.com/invoice.pdf")
                        .filename("invoice.pdf")
                        .build()
                )
                .expiresAt("expires_at")
                .from("from")
                .locale("el-GR")
                .preferredChannel(TransactionalSendParams.PreferredChannel.WHATSAPP)
                .variables(
                    TransactionalSendParams.Variables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.templateId()).isEqualTo("template_01hynf45qvevj844m9az2x2f3c")
        assertThat(body.to()).isEqualTo("+30123456789")
        assertThat(body.callbackUrl()).contains("callback_url")
        assertThat(body.correlationId()).contains("correlation_id")
        assertThat(body.document())
            .contains(
                TransactionalSendParams.Document.builder()
                    .url("https://example.com/invoice.pdf")
                    .filename("invoice.pdf")
                    .build()
            )
        assertThat(body.expiresAt()).contains("expires_at")
        assertThat(body.from()).contains("from")
        assertThat(body.locale()).contains("el-GR")
        assertThat(body.preferredChannel())
            .contains(TransactionalSendParams.PreferredChannel.WHATSAPP)
        assertThat(body.variables())
            .contains(
                TransactionalSendParams.Variables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TransactionalSendParams.builder()
                .templateId("template_01hynf45qvevj844m9az2x2f3c")
                .to("+30123456789")
                .build()

        val body = params._body()

        assertThat(body.templateId()).isEqualTo("template_01hynf45qvevj844m9az2x2f3c")
        assertThat(body.to()).isEqualTo("+30123456789")
    }
}

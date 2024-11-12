// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.models.*

class TransactionalSendParamsTest {

    @Test
    fun createTransactionalSendParams() {
        TransactionalSendParams.builder()
            .templateId("template_id")
            .to("to")
            .callbackUrl("callback_url")
            .correlationId("correlation_id")
            .expiresAt("expires_at")
            .from("from")
            .variables(TransactionalSendParams.Variables.builder().build())
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionalSendParams.builder()
                .templateId("template_id")
                .to("to")
                .callbackUrl("callback_url")
                .correlationId("correlation_id")
                .expiresAt("expires_at")
                .from("from")
                .variables(TransactionalSendParams.Variables.builder().build())
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.templateId()).isEqualTo("template_id")
        assertThat(body.to()).isEqualTo("to")
        assertThat(body.callbackUrl()).isEqualTo("callback_url")
        assertThat(body.correlationId()).isEqualTo("correlation_id")
        assertThat(body.expiresAt()).isEqualTo("expires_at")
        assertThat(body.from()).isEqualTo("from")
        assertThat(body.variables()).isEqualTo(TransactionalSendParams.Variables.builder().build())
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = TransactionalSendParams.builder().templateId("template_id").to("to").build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.templateId()).isEqualTo("template_id")
        assertThat(body.to()).isEqualTo("to")
    }
}

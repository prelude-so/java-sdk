// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue

class TransactionalSendParamsTest {

    @Test
    fun createTransactionalSendParams() {
        TransactionalSendParams.builder()
            .templateId("template_01jd1xq0cffycayqtdkdbv4d61")
            .to("+30123456789")
            .callbackUrl("callback_url")
            .correlationId("correlation_id")
            .expiresAt("expires_at")
            .from("from")
            .variables(
                TransactionalSendParams.Variables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            TransactionalSendParams.builder()
                .templateId("template_01jd1xq0cffycayqtdkdbv4d61")
                .to("+30123456789")
                .callbackUrl("callback_url")
                .correlationId("correlation_id")
                .expiresAt("expires_at")
                .from("from")
                .variables(
                    TransactionalSendParams.Variables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.templateId()).isEqualTo("template_01jd1xq0cffycayqtdkdbv4d61")
        assertThat(body.to()).isEqualTo("+30123456789")
        assertThat(body.callbackUrl()).isEqualTo("callback_url")
        assertThat(body.correlationId()).isEqualTo("correlation_id")
        assertThat(body.expiresAt()).isEqualTo("expires_at")
        assertThat(body.from()).isEqualTo("from")
        assertThat(body.variables())
            .isEqualTo(
                TransactionalSendParams.Variables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            TransactionalSendParams.builder()
                .templateId("template_01jd1xq0cffycayqtdkdbv4d61")
                .to("+30123456789")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.templateId()).isEqualTo("template_01jd1xq0cffycayqtdkdbv4d61")
        assertThat(body.to()).isEqualTo("+30123456789")
    }
}

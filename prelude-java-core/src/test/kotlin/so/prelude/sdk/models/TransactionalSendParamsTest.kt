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
            .locale("el-GR")
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
                .templateId("template_01jd1xq0cffycayqtdkdbv4d61")
                .to("+30123456789")
                .callbackUrl("callback_url")
                .correlationId("correlation_id")
                .expiresAt("expires_at")
                .from("from")
                .locale("el-GR")
                .variables(
                    TransactionalSendParams.Variables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.templateId()).isEqualTo("template_01jd1xq0cffycayqtdkdbv4d61")
        assertThat(body.to()).isEqualTo("+30123456789")
        assertThat(body.callbackUrl()).contains("callback_url")
        assertThat(body.correlationId()).contains("correlation_id")
        assertThat(body.expiresAt()).contains("expires_at")
        assertThat(body.from()).contains("from")
        assertThat(body.locale()).contains("el-GR")
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
                .templateId("template_01jd1xq0cffycayqtdkdbv4d61")
                .to("+30123456789")
                .build()
        val body = params._body()
        assertThat(body).isNotNull
        assertThat(body.templateId()).isEqualTo("template_01jd1xq0cffycayqtdkdbv4d61")
        assertThat(body.to()).isEqualTo("+30123456789")
    }
}

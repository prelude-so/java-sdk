// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue

class TransactionalSendParamsTest {

    @Test
    fun create() {
        TransactionalSendParams.builder()
            .templateId("template_id")
            .to("to")
            .callbackUrl("callback_url")
            .correlationId("correlation_id")
            .expiresAt("expires_at")
            .from("from")
            .variables(
                TransactionalSendParams.Variables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            TransactionalSendParams.builder()
                .templateId("template_id")
                .to("to")
                .callbackUrl("callback_url")
                .correlationId("correlation_id")
                .expiresAt("expires_at")
                .from("from")
                .variables(
                    TransactionalSendParams.Variables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.templateId()).isEqualTo("template_id")
        assertThat(body.to()).isEqualTo("to")
        assertThat(body.callbackUrl()).contains("callback_url")
        assertThat(body.correlationId()).contains("correlation_id")
        assertThat(body.expiresAt()).contains("expires_at")
        assertThat(body.from()).contains("from")
        assertThat(body.variables())
            .contains(
                TransactionalSendParams.Variables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = TransactionalSendParams.builder().templateId("template_id").to("to").build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.templateId()).isEqualTo("template_id")
        assertThat(body.to()).isEqualTo("to")
    }
}

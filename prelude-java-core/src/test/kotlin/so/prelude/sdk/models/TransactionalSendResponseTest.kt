// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.jsonMapper

internal class TransactionalSendResponseTest {

    @Test
    fun create() {
        val transactionalSendResponse =
            TransactionalSendResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .templateId("template_id")
                .to("to")
                .variables(
                    TransactionalSendResponse.Variables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .callbackUrl("callback_url")
                .correlationId("correlation_id")
                .from("from")
                .build()

        assertThat(transactionalSendResponse.id()).isEqualTo("id")
        assertThat(transactionalSendResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionalSendResponse.expiresAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transactionalSendResponse.templateId()).isEqualTo("template_id")
        assertThat(transactionalSendResponse.to()).isEqualTo("to")
        assertThat(transactionalSendResponse.variables())
            .isEqualTo(
                TransactionalSendResponse.Variables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
        assertThat(transactionalSendResponse.callbackUrl()).contains("callback_url")
        assertThat(transactionalSendResponse.correlationId()).contains("correlation_id")
        assertThat(transactionalSendResponse.from()).contains("from")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transactionalSendResponse =
            TransactionalSendResponse.builder()
                .id("id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .templateId("template_id")
                .to("to")
                .variables(
                    TransactionalSendResponse.Variables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .callbackUrl("callback_url")
                .correlationId("correlation_id")
                .from("from")
                .build()

        val roundtrippedTransactionalSendResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transactionalSendResponse),
                jacksonTypeRef<TransactionalSendResponse>(),
            )

        assertThat(roundtrippedTransactionalSendResponse).isEqualTo(transactionalSendResponse)
    }
}

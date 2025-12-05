// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.jsonMapper

internal class NotifySendBatchResponseTest {

    @Test
    fun create() {
        val notifySendBatchResponse =
            NotifySendBatchResponse.builder()
                .errorCount(0L)
                .addResult(
                    NotifySendBatchResponse.Result.builder()
                        .phoneNumber("+33612345678")
                        .success(true)
                        .error(
                            NotifySendBatchResponse.Result.Error.builder()
                                .code("invalid_phone_number")
                                .message(
                                    "The provided phone number is invalid. Provide a valid E.164 phone number."
                                )
                                .build()
                        )
                        .message(
                            NotifySendBatchResponse.Result.Message.builder()
                                .id("tx_01k8ap1btqf5r9fq2c8ax5fhc9")
                                .correlationId("correlation_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .from("YourBrand")
                                .locale("locale")
                                .scheduleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .to("+33612345678")
                                .build()
                        )
                        .build()
                )
                .successCount(0L)
                .totalCount(0L)
                .callbackUrl("callback_url")
                .requestId("request_id")
                .templateId("template_id")
                .variables(
                    NotifySendBatchResponse.Variables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        assertThat(notifySendBatchResponse.errorCount()).isEqualTo(0L)
        assertThat(notifySendBatchResponse.results())
            .containsExactly(
                NotifySendBatchResponse.Result.builder()
                    .phoneNumber("+33612345678")
                    .success(true)
                    .error(
                        NotifySendBatchResponse.Result.Error.builder()
                            .code("invalid_phone_number")
                            .message(
                                "The provided phone number is invalid. Provide a valid E.164 phone number."
                            )
                            .build()
                    )
                    .message(
                        NotifySendBatchResponse.Result.Message.builder()
                            .id("tx_01k8ap1btqf5r9fq2c8ax5fhc9")
                            .correlationId("correlation_id")
                            .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .from("YourBrand")
                            .locale("locale")
                            .scheduleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .to("+33612345678")
                            .build()
                    )
                    .build()
            )
        assertThat(notifySendBatchResponse.successCount()).isEqualTo(0L)
        assertThat(notifySendBatchResponse.totalCount()).isEqualTo(0L)
        assertThat(notifySendBatchResponse.callbackUrl()).contains("callback_url")
        assertThat(notifySendBatchResponse.requestId()).contains("request_id")
        assertThat(notifySendBatchResponse.templateId()).contains("template_id")
        assertThat(notifySendBatchResponse.variables())
            .contains(
                NotifySendBatchResponse.Variables.builder()
                    .putAdditionalProperty("foo", JsonValue.from("string"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notifySendBatchResponse =
            NotifySendBatchResponse.builder()
                .errorCount(0L)
                .addResult(
                    NotifySendBatchResponse.Result.builder()
                        .phoneNumber("+33612345678")
                        .success(true)
                        .error(
                            NotifySendBatchResponse.Result.Error.builder()
                                .code("invalid_phone_number")
                                .message(
                                    "The provided phone number is invalid. Provide a valid E.164 phone number."
                                )
                                .build()
                        )
                        .message(
                            NotifySendBatchResponse.Result.Message.builder()
                                .id("tx_01k8ap1btqf5r9fq2c8ax5fhc9")
                                .correlationId("correlation_id")
                                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .expiresAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .from("YourBrand")
                                .locale("locale")
                                .scheduleAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .to("+33612345678")
                                .build()
                        )
                        .build()
                )
                .successCount(0L)
                .totalCount(0L)
                .callbackUrl("callback_url")
                .requestId("request_id")
                .templateId("template_id")
                .variables(
                    NotifySendBatchResponse.Variables.builder()
                        .putAdditionalProperty("foo", JsonValue.from("string"))
                        .build()
                )
                .build()

        val roundtrippedNotifySendBatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notifySendBatchResponse),
                jacksonTypeRef<NotifySendBatchResponse>(),
            )

        assertThat(roundtrippedNotifySendBatchResponse).isEqualTo(notifySendBatchResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class NotifyListSubscriptionPhoneNumbersResponseTest {

    @Test
    fun create() {
        val notifyListSubscriptionPhoneNumbersResponse =
            NotifyListSubscriptionPhoneNumbersResponse.builder()
                .addPhoneNumber(
                    NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.builder()
                        .configId("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                        .phoneNumber("+33612345678")
                        .source(
                            NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.Source.MO_KEYWORD
                        )
                        .state(NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.State.SUB)
                        .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .reason("STOP")
                        .build()
                )
                .nextCursor("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
                .build()

        assertThat(notifyListSubscriptionPhoneNumbersResponse.phoneNumbers())
            .containsExactly(
                NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.builder()
                    .configId("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                    .phoneNumber("+33612345678")
                    .source(
                        NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.Source.MO_KEYWORD
                    )
                    .state(NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.State.SUB)
                    .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                    .reason("STOP")
                    .build()
            )
        assertThat(notifyListSubscriptionPhoneNumbersResponse.nextCursor())
            .contains("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notifyListSubscriptionPhoneNumbersResponse =
            NotifyListSubscriptionPhoneNumbersResponse.builder()
                .addPhoneNumber(
                    NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.builder()
                        .configId("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                        .phoneNumber("+33612345678")
                        .source(
                            NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.Source.MO_KEYWORD
                        )
                        .state(NotifyListSubscriptionPhoneNumbersResponse.PhoneNumber.State.SUB)
                        .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .reason("STOP")
                        .build()
                )
                .nextCursor("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
                .build()

        val roundtrippedNotifyListSubscriptionPhoneNumbersResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notifyListSubscriptionPhoneNumbersResponse),
                jacksonTypeRef<NotifyListSubscriptionPhoneNumbersResponse>(),
            )

        assertThat(roundtrippedNotifyListSubscriptionPhoneNumbersResponse)
            .isEqualTo(notifyListSubscriptionPhoneNumbersResponse)
    }
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class NotifyListSubscriptionPhoneNumberEventsResponseTest {

    @Test
    fun create() {
        val notifyListSubscriptionPhoneNumberEventsResponse =
            NotifyListSubscriptionPhoneNumberEventsResponse.builder()
                .addEvent(
                    NotifyListSubscriptionPhoneNumberEventsResponse.Event.builder()
                        .configId("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                        .phoneNumber("+33612345678")
                        .source(
                            NotifyListSubscriptionPhoneNumberEventsResponse.Event.Source.MO_KEYWORD
                        )
                        .state(NotifyListSubscriptionPhoneNumberEventsResponse.Event.State.SUB)
                        .timestamp(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .reason("STOP")
                        .build()
                )
                .nextCursor("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
                .build()

        assertThat(notifyListSubscriptionPhoneNumberEventsResponse.events())
            .containsExactly(
                NotifyListSubscriptionPhoneNumberEventsResponse.Event.builder()
                    .configId("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                    .phoneNumber("+33612345678")
                    .source(NotifyListSubscriptionPhoneNumberEventsResponse.Event.Source.MO_KEYWORD)
                    .state(NotifyListSubscriptionPhoneNumberEventsResponse.Event.State.SUB)
                    .timestamp(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                    .reason("STOP")
                    .build()
            )
        assertThat(notifyListSubscriptionPhoneNumberEventsResponse.nextCursor())
            .contains("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notifyListSubscriptionPhoneNumberEventsResponse =
            NotifyListSubscriptionPhoneNumberEventsResponse.builder()
                .addEvent(
                    NotifyListSubscriptionPhoneNumberEventsResponse.Event.builder()
                        .configId("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                        .phoneNumber("+33612345678")
                        .source(
                            NotifyListSubscriptionPhoneNumberEventsResponse.Event.Source.MO_KEYWORD
                        )
                        .state(NotifyListSubscriptionPhoneNumberEventsResponse.Event.State.SUB)
                        .timestamp(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .reason("STOP")
                        .build()
                )
                .nextCursor("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
                .build()

        val roundtrippedNotifyListSubscriptionPhoneNumberEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notifyListSubscriptionPhoneNumberEventsResponse),
                jacksonTypeRef<NotifyListSubscriptionPhoneNumberEventsResponse>(),
            )

        assertThat(roundtrippedNotifyListSubscriptionPhoneNumberEventsResponse)
            .isEqualTo(notifyListSubscriptionPhoneNumberEventsResponse)
    }
}

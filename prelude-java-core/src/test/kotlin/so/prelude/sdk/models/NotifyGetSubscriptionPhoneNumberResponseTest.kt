// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class NotifyGetSubscriptionPhoneNumberResponseTest {

    @Test
    fun create() {
        val notifyGetSubscriptionPhoneNumberResponse =
            NotifyGetSubscriptionPhoneNumberResponse.builder()
                .configId("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                .phoneNumber("+33612345678")
                .source(NotifyGetSubscriptionPhoneNumberResponse.Source.MO_KEYWORD)
                .state(NotifyGetSubscriptionPhoneNumberResponse.State.SUB)
                .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                .reason("STOP")
                .build()

        assertThat(notifyGetSubscriptionPhoneNumberResponse.configId())
            .isEqualTo("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
        assertThat(notifyGetSubscriptionPhoneNumberResponse.phoneNumber()).isEqualTo("+33612345678")
        assertThat(notifyGetSubscriptionPhoneNumberResponse.source())
            .isEqualTo(NotifyGetSubscriptionPhoneNumberResponse.Source.MO_KEYWORD)
        assertThat(notifyGetSubscriptionPhoneNumberResponse.state())
            .isEqualTo(NotifyGetSubscriptionPhoneNumberResponse.State.SUB)
        assertThat(notifyGetSubscriptionPhoneNumberResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
        assertThat(notifyGetSubscriptionPhoneNumberResponse.reason()).contains("STOP")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notifyGetSubscriptionPhoneNumberResponse =
            NotifyGetSubscriptionPhoneNumberResponse.builder()
                .configId("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                .phoneNumber("+33612345678")
                .source(NotifyGetSubscriptionPhoneNumberResponse.Source.MO_KEYWORD)
                .state(NotifyGetSubscriptionPhoneNumberResponse.State.SUB)
                .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                .reason("STOP")
                .build()

        val roundtrippedNotifyGetSubscriptionPhoneNumberResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notifyGetSubscriptionPhoneNumberResponse),
                jacksonTypeRef<NotifyGetSubscriptionPhoneNumberResponse>(),
            )

        assertThat(roundtrippedNotifyGetSubscriptionPhoneNumberResponse)
            .isEqualTo(notifyGetSubscriptionPhoneNumberResponse)
    }
}

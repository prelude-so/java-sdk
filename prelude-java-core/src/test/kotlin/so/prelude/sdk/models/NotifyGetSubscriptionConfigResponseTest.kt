// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class NotifyGetSubscriptionConfigResponseTest {

    @Test
    fun create() {
        val notifyGetSubscriptionConfigResponse =
            NotifyGetSubscriptionConfigResponse.builder()
                .id("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                .callbackUrl("https://your-app.com/webhooks/subscription")
                .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                .messages(
                    NotifyGetSubscriptionConfigResponse.Messages.builder()
                        .helpMessage("Reply STOP to unsubscribe or START to resubscribe.")
                        .startMessage(
                            "You have been resubscribed and will receive messages again. Reply STOP to unsubscribe."
                        )
                        .stopMessage(
                            "You have been unsubscribed and will not receive further messages. Reply START to resubscribe."
                        )
                        .build()
                )
                .name("Marketing Campaign")
                .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                .addMoPhoneNumber(
                    NotifyGetSubscriptionConfigResponse.MoPhoneNumber.builder()
                        .countryCode("US")
                        .phoneNumber("+15551234567")
                        .build()
                )
                .addMoPhoneNumber(
                    NotifyGetSubscriptionConfigResponse.MoPhoneNumber.builder()
                        .countryCode("FR")
                        .phoneNumber("36184")
                        .build()
                )
                .build()

        assertThat(notifyGetSubscriptionConfigResponse.id())
            .isEqualTo("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
        assertThat(notifyGetSubscriptionConfigResponse.callbackUrl())
            .isEqualTo("https://your-app.com/webhooks/subscription")
        assertThat(notifyGetSubscriptionConfigResponse.createdAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
        assertThat(notifyGetSubscriptionConfigResponse.messages())
            .isEqualTo(
                NotifyGetSubscriptionConfigResponse.Messages.builder()
                    .helpMessage("Reply STOP to unsubscribe or START to resubscribe.")
                    .startMessage(
                        "You have been resubscribed and will receive messages again. Reply STOP to unsubscribe."
                    )
                    .stopMessage(
                        "You have been unsubscribed and will not receive further messages. Reply START to resubscribe."
                    )
                    .build()
            )
        assertThat(notifyGetSubscriptionConfigResponse.name()).isEqualTo("Marketing Campaign")
        assertThat(notifyGetSubscriptionConfigResponse.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
        assertThat(notifyGetSubscriptionConfigResponse.moPhoneNumbers().getOrNull())
            .containsExactly(
                NotifyGetSubscriptionConfigResponse.MoPhoneNumber.builder()
                    .countryCode("US")
                    .phoneNumber("+15551234567")
                    .build(),
                NotifyGetSubscriptionConfigResponse.MoPhoneNumber.builder()
                    .countryCode("FR")
                    .phoneNumber("36184")
                    .build(),
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notifyGetSubscriptionConfigResponse =
            NotifyGetSubscriptionConfigResponse.builder()
                .id("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                .callbackUrl("https://your-app.com/webhooks/subscription")
                .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                .messages(
                    NotifyGetSubscriptionConfigResponse.Messages.builder()
                        .helpMessage("Reply STOP to unsubscribe or START to resubscribe.")
                        .startMessage(
                            "You have been resubscribed and will receive messages again. Reply STOP to unsubscribe."
                        )
                        .stopMessage(
                            "You have been unsubscribed and will not receive further messages. Reply START to resubscribe."
                        )
                        .build()
                )
                .name("Marketing Campaign")
                .updatedAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                .addMoPhoneNumber(
                    NotifyGetSubscriptionConfigResponse.MoPhoneNumber.builder()
                        .countryCode("US")
                        .phoneNumber("+15551234567")
                        .build()
                )
                .addMoPhoneNumber(
                    NotifyGetSubscriptionConfigResponse.MoPhoneNumber.builder()
                        .countryCode("FR")
                        .phoneNumber("36184")
                        .build()
                )
                .build()

        val roundtrippedNotifyGetSubscriptionConfigResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notifyGetSubscriptionConfigResponse),
                jacksonTypeRef<NotifyGetSubscriptionConfigResponse>(),
            )

        assertThat(roundtrippedNotifyGetSubscriptionConfigResponse)
            .isEqualTo(notifyGetSubscriptionConfigResponse)
    }
}

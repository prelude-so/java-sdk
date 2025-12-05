// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class NotifyListSubscriptionConfigsResponseTest {

    @Test
    fun create() {
        val notifyListSubscriptionConfigsResponse =
            NotifyListSubscriptionConfigsResponse.builder()
                .addConfig(
                    NotifyListSubscriptionConfigsResponse.Config.builder()
                        .id("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                        .callbackUrl("https://your-app.com/webhooks/subscription")
                        .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .messages(
                            NotifyListSubscriptionConfigsResponse.Config.Messages.builder()
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
                            NotifyListSubscriptionConfigsResponse.Config.MoPhoneNumber.builder()
                                .countryCode("US")
                                .phoneNumber("+15551234567")
                                .build()
                        )
                        .addMoPhoneNumber(
                            NotifyListSubscriptionConfigsResponse.Config.MoPhoneNumber.builder()
                                .countryCode("FR")
                                .phoneNumber("36184")
                                .build()
                        )
                        .build()
                )
                .nextCursor("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
                .build()

        assertThat(notifyListSubscriptionConfigsResponse.configs())
            .containsExactly(
                NotifyListSubscriptionConfigsResponse.Config.builder()
                    .id("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                    .callbackUrl("https://your-app.com/webhooks/subscription")
                    .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                    .messages(
                        NotifyListSubscriptionConfigsResponse.Config.Messages.builder()
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
                        NotifyListSubscriptionConfigsResponse.Config.MoPhoneNumber.builder()
                            .countryCode("US")
                            .phoneNumber("+15551234567")
                            .build()
                    )
                    .addMoPhoneNumber(
                        NotifyListSubscriptionConfigsResponse.Config.MoPhoneNumber.builder()
                            .countryCode("FR")
                            .phoneNumber("36184")
                            .build()
                    )
                    .build()
            )
        assertThat(notifyListSubscriptionConfigsResponse.nextCursor())
            .contains("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val notifyListSubscriptionConfigsResponse =
            NotifyListSubscriptionConfigsResponse.builder()
                .addConfig(
                    NotifyListSubscriptionConfigsResponse.Config.builder()
                        .id("subcfg_01k8ap1btqf5r9fq2c8ax5fhc9")
                        .callbackUrl("https://your-app.com/webhooks/subscription")
                        .createdAt(OffsetDateTime.parse("2024-01-01T12:00:00Z"))
                        .messages(
                            NotifyListSubscriptionConfigsResponse.Config.Messages.builder()
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
                            NotifyListSubscriptionConfigsResponse.Config.MoPhoneNumber.builder()
                                .countryCode("US")
                                .phoneNumber("+15551234567")
                                .build()
                        )
                        .addMoPhoneNumber(
                            NotifyListSubscriptionConfigsResponse.Config.MoPhoneNumber.builder()
                                .countryCode("FR")
                                .phoneNumber("36184")
                                .build()
                        )
                        .build()
                )
                .nextCursor("eyJwayI6IjEyMzQ1Njc4LTkwYWItMTJjZC00NTY3LTg5MGFiMTJjZGU0NTYifQ==")
                .build()

        val roundtrippedNotifyListSubscriptionConfigsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(notifyListSubscriptionConfigsResponse),
                jacksonTypeRef<NotifyListSubscriptionConfigsResponse>(),
            )

        assertThat(roundtrippedNotifyListSubscriptionConfigsResponse)
            .isEqualTo(notifyListSubscriptionConfigsResponse)
    }
}

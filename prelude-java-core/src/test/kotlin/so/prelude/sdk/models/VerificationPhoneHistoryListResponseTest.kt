// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class VerificationPhoneHistoryListResponseTest {

    @Test
    fun create() {
        val verificationPhoneHistoryListResponse =
            VerificationPhoneHistoryListResponse.builder()
                .addVerification(
                    VerificationPhoneHistoryListResponse.Verification.builder()
                        .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                        .addChannel(
                            VerificationPhoneHistoryListResponse.Verification.Channel.builder()
                                .channel(
                                    VerificationPhoneHistoryListResponse.Verification.Channel
                                        .InnerChannel
                                        .SMS
                                )
                                .converted(true)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .delivered(true)
                        .phoneNumber("+33612345678")
                        .status(VerificationPhoneHistoryListResponse.Verification.Status.CONVERTED)
                        .attempts(0L)
                        .convertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(
                            PhoneVerificationMoney.builder().amount("0.042").currency("EUR").build()
                        )
                        .devicePlatform(
                            VerificationPhoneHistoryListResponse.Verification.DevicePlatform.ANDROID
                        )
                        .phoneNumberCondition(
                            VerificationPhoneHistoryListResponse.Verification.PhoneNumberCondition
                                .ALLOW_LISTED
                        )
                        .signalsHashStatus(
                            VerificationPhoneHistoryListResponse.Verification.SignalsHashStatus
                                .VALID
                        )
                        .build()
                )
                .nextCursor(
                    "MIZw2XwtkcEcC5SKsMEfSx6a3XAgW-Ct6waU8NCqUkAvFxz41DJbjQIkqHWJS1JY6-it7ZsZHFYN3luFH8yTdCAB"
                )
                .build()

        assertThat(verificationPhoneHistoryListResponse.verifications())
            .containsExactly(
                VerificationPhoneHistoryListResponse.Verification.builder()
                    .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                    .addChannel(
                        VerificationPhoneHistoryListResponse.Verification.Channel.builder()
                            .channel(
                                VerificationPhoneHistoryListResponse.Verification.Channel
                                    .InnerChannel
                                    .SMS
                            )
                            .converted(true)
                            .build()
                    )
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .delivered(true)
                    .phoneNumber("+33612345678")
                    .status(VerificationPhoneHistoryListResponse.Verification.Status.CONVERTED)
                    .attempts(0L)
                    .convertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cost(PhoneVerificationMoney.builder().amount("0.042").currency("EUR").build())
                    .devicePlatform(
                        VerificationPhoneHistoryListResponse.Verification.DevicePlatform.ANDROID
                    )
                    .phoneNumberCondition(
                        VerificationPhoneHistoryListResponse.Verification.PhoneNumberCondition
                            .ALLOW_LISTED
                    )
                    .signalsHashStatus(
                        VerificationPhoneHistoryListResponse.Verification.SignalsHashStatus.VALID
                    )
                    .build()
            )
        assertThat(verificationPhoneHistoryListResponse.nextCursor())
            .contains(
                "MIZw2XwtkcEcC5SKsMEfSx6a3XAgW-Ct6waU8NCqUkAvFxz41DJbjQIkqHWJS1JY6-it7ZsZHFYN3luFH8yTdCAB"
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationPhoneHistoryListResponse =
            VerificationPhoneHistoryListResponse.builder()
                .addVerification(
                    VerificationPhoneHistoryListResponse.Verification.builder()
                        .id("vrf_01jc0t6fwwfgfsq1md24mhyztj")
                        .addChannel(
                            VerificationPhoneHistoryListResponse.Verification.Channel.builder()
                                .channel(
                                    VerificationPhoneHistoryListResponse.Verification.Channel
                                        .InnerChannel
                                        .SMS
                                )
                                .converted(true)
                                .build()
                        )
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .delivered(true)
                        .phoneNumber("+33612345678")
                        .status(VerificationPhoneHistoryListResponse.Verification.Status.CONVERTED)
                        .attempts(0L)
                        .convertedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cost(
                            PhoneVerificationMoney.builder().amount("0.042").currency("EUR").build()
                        )
                        .devicePlatform(
                            VerificationPhoneHistoryListResponse.Verification.DevicePlatform.ANDROID
                        )
                        .phoneNumberCondition(
                            VerificationPhoneHistoryListResponse.Verification.PhoneNumberCondition
                                .ALLOW_LISTED
                        )
                        .signalsHashStatus(
                            VerificationPhoneHistoryListResponse.Verification.SignalsHashStatus
                                .VALID
                        )
                        .build()
                )
                .nextCursor(
                    "MIZw2XwtkcEcC5SKsMEfSx6a3XAgW-Ct6waU8NCqUkAvFxz41DJbjQIkqHWJS1JY6-it7ZsZHFYN3luFH8yTdCAB"
                )
                .build()

        val roundtrippedVerificationPhoneHistoryListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationPhoneHistoryListResponse),
                jacksonTypeRef<VerificationPhoneHistoryListResponse>(),
            )

        assertThat(roundtrippedVerificationPhoneHistoryListResponse)
            .isEqualTo(verificationPhoneHistoryListResponse)
    }
}

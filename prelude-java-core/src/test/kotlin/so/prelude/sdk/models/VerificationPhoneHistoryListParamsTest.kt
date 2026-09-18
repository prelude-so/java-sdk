// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.http.QueryParams

internal class VerificationPhoneHistoryListParamsTest {

    @Test
    fun create() {
        VerificationPhoneHistoryListParams.builder()
            .addChannel(VerificationPhoneHistoryListParams.Channel.SMS)
            .cursor("cursor")
            .devicePlatform(VerificationPhoneHistoryListParams.DevicePlatform.ANDROID)
            .from(OffsetDateTime.parse("2026-09-01T00:00:00Z"))
            .limit(1L)
            .maxAttempts(0L)
            .minAttempts(0L)
            .phoneNumber("+33612345678")
            .region("FR")
            .status(VerificationPhoneHistoryListParams.Status.CONVERTED)
            .templateId("template_01jc0t6fwwfgfsq1md24mhyztj")
            .to(OffsetDateTime.parse("2026-09-08T00:00:00Z"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            VerificationPhoneHistoryListParams.builder()
                .addChannel(VerificationPhoneHistoryListParams.Channel.SMS)
                .cursor("cursor")
                .devicePlatform(VerificationPhoneHistoryListParams.DevicePlatform.ANDROID)
                .from(OffsetDateTime.parse("2026-09-01T00:00:00Z"))
                .limit(1L)
                .maxAttempts(0L)
                .minAttempts(0L)
                .phoneNumber("+33612345678")
                .region("FR")
                .status(VerificationPhoneHistoryListParams.Status.CONVERTED)
                .templateId("template_01jc0t6fwwfgfsq1md24mhyztj")
                .to(OffsetDateTime.parse("2026-09-08T00:00:00Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("channels", listOf("sms").joinToString(","))
                    .put("cursor", "cursor")
                    .put("device_platform", "android")
                    .put("from", "2026-09-01T00:00:00Z")
                    .put("limit", "1")
                    .put("max_attempts", "0")
                    .put("min_attempts", "0")
                    .put("phone_number", "+33612345678")
                    .put("region", "FR")
                    .put("status", "converted")
                    .put("template_id", "template_01jc0t6fwwfgfsq1md24mhyztj")
                    .put("to", "2026-09-08T00:00:00Z")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = VerificationPhoneHistoryListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}

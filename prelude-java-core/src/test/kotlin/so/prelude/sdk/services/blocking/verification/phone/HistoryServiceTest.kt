// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking.verification.phone

import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.models.VerificationPhoneHistoryListParams

@ExtendWith(TestServerExtension::class)
internal class HistoryServiceTest {

    @Test
    fun retrieve() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val historyService = client.verification().phone().history()

        val history = historyService.retrieve("vrf_01jc0t6fwwfgfsq1md24mhyztj")

        history.validate()
    }

    @Test
    fun list() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val historyService = client.verification().phone().history()

        val histories =
            historyService.list(
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
            )

        histories.validate()
    }
}

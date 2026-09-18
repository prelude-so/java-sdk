// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.verification.phone

import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.models.VerificationPhoneHistoryListParams

@ExtendWith(TestServerExtension::class)
internal class HistoryServiceAsyncTest {

    @Test
    fun retrieve() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val historyServiceAsync = client.verification().phone().history()

        val historyFuture = historyServiceAsync.retrieve("vrf_01jc0t6fwwfgfsq1md24mhyztj")

        val history = historyFuture.get()
        history.validate()
    }

    @Test
    fun list() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val historyServiceAsync = client.verification().phone().history()

        val historiesFuture =
            historyServiceAsync.list(
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

        val histories = historiesFuture.get()
        histories.validate()
    }
}

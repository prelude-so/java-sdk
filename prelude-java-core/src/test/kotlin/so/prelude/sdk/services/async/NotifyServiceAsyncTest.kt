// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.models.NotifyGetSubscriptionPhoneNumberParams
import so.prelude.sdk.models.NotifyListSubscriptionConfigsParams
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumberEventsParams
import so.prelude.sdk.models.NotifyListSubscriptionPhoneNumbersParams
import so.prelude.sdk.models.NotifySendBatchParams
import so.prelude.sdk.models.NotifySendParams

@ExtendWith(TestServerExtension::class)
internal class NotifyServiceAsyncTest {

    @Test
    fun getSubscriptionConfig() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val notifyServiceAsync = client.notify()

        val responseFuture = notifyServiceAsync.getSubscriptionConfig("config_id")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun getSubscriptionPhoneNumber() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val notifyServiceAsync = client.notify()

        val responseFuture =
            notifyServiceAsync.getSubscriptionPhoneNumber(
                NotifyGetSubscriptionPhoneNumberParams.builder()
                    .configId("config_id")
                    .phoneNumber("phone_number")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listSubscriptionConfigs() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val notifyServiceAsync = client.notify()

        val responseFuture =
            notifyServiceAsync.listSubscriptionConfigs(
                NotifyListSubscriptionConfigsParams.builder().cursor("cursor").limit(1L).build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listSubscriptionPhoneNumberEvents() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val notifyServiceAsync = client.notify()

        val responseFuture =
            notifyServiceAsync.listSubscriptionPhoneNumberEvents(
                NotifyListSubscriptionPhoneNumberEventsParams.builder()
                    .configId("config_id")
                    .phoneNumber("phone_number")
                    .cursor("cursor")
                    .limit(1L)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listSubscriptionPhoneNumbers() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val notifyServiceAsync = client.notify()

        val responseFuture =
            notifyServiceAsync.listSubscriptionPhoneNumbers(
                NotifyListSubscriptionPhoneNumbersParams.builder()
                    .configId("config_id")
                    .cursor("cursor")
                    .limit(1L)
                    .state(NotifyListSubscriptionPhoneNumbersParams.State.SUB)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun send() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val notifyServiceAsync = client.notify()

        val responseFuture =
            notifyServiceAsync.send(
                NotifySendParams.builder()
                    .templateId("template_01k8ap1btqf5r9fq2c8ax5fhc9")
                    .to("+33612345678")
                    .callbackUrl("https://your-app.com/webhooks/notify")
                    .correlationId("order-12345")
                    .document(
                        NotifySendParams.Document.builder()
                            .url("https://example.com/invoice.pdf")
                            .filename("invoice.pdf")
                            .build()
                    )
                    .expiresAt(OffsetDateTime.parse("2025-12-25T18:00:00Z"))
                    .from("from")
                    .locale("el-GR")
                    .preferredChannel(NotifySendParams.PreferredChannel.WHATSAPP)
                    .scheduleAt(OffsetDateTime.parse("2025-12-25T10:00:00Z"))
                    .variables(
                        NotifySendParams.Variables.builder()
                            .putAdditionalProperty("order_id", JsonValue.from("12345"))
                            .putAdditionalProperty("amount", JsonValue.from("\$49.99"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun sendBatch() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val notifyServiceAsync = client.notify()

        val responseFuture =
            notifyServiceAsync.sendBatch(
                NotifySendBatchParams.builder()
                    .templateId("template_01k8ap1btqf5r9fq2c8ax5fhc9")
                    .addTo("+33612345678")
                    .addTo("+15551234567")
                    .callbackUrl("https://your-app.com/webhooks/notify")
                    .correlationId("campaign-12345")
                    .document(
                        NotifySendBatchParams.Document.builder()
                            .url("https://example.com/invoice.pdf")
                            .filename("invoice.pdf")
                            .build()
                    )
                    .expiresAt(OffsetDateTime.parse("2025-12-25T18:00:00Z"))
                    .from("from")
                    .locale("el-GR")
                    .preferredChannel(NotifySendBatchParams.PreferredChannel.WHATSAPP)
                    .scheduleAt(OffsetDateTime.parse("2025-12-25T10:00:00Z"))
                    .variables(
                        NotifySendBatchParams.Variables.builder()
                            .putAdditionalProperty("order_id", JsonValue.from("12345"))
                            .putAdditionalProperty("amount", JsonValue.from("\$49.99"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

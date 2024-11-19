// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.models.*

@ExtendWith(TestServerExtension::class)
class TransactionalServiceTest {

    @Disabled(
        "skipped: currently no good way to test endpoints defining callbacks, Prism mock server will fail trying to reach the provided callback url"
    )
    @Test
    fun callSend() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val transactionalService = client.transactional()
        val transactionalSendResponse =
            transactionalService.send(
                TransactionalSendParams.builder()
                    .templateId("template_01jd1xq0cffycayqtdkdbv4d61")
                    .to("+30123456789")
                    .callbackUrl("callback_url")
                    .correlationId("correlation_id")
                    .expiresAt("expires_at")
                    .from("from")
                    .variables(TransactionalSendParams.Variables.builder().build())
                    .build()
            )
        println(transactionalSendResponse)
        transactionalSendResponse.validate()
    }
}

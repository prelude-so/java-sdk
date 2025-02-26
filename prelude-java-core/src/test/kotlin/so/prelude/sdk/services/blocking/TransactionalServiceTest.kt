// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.models.TransactionalSendParams

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
                    .templateId("template_id")
                    .to("to")
                    .callbackUrl("callback_url")
                    .correlationId("correlation_id")
                    .expiresAt("expires_at")
                    .from("from")
                    .variables(
                        TransactionalSendParams.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("string"))
                            .build()
                    )
                    .build()
            )
        println(transactionalSendResponse)
        transactionalSendResponse.validate()
    }
}

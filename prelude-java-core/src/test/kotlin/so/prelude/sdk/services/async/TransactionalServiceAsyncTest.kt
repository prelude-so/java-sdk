// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.models.TransactionalSendParams

@ExtendWith(TestServerExtension::class)
internal class TransactionalServiceAsyncTest {

    @Disabled("Prism doesn't support callbacks yet")
    @Test
    fun send() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val transactionalServiceAsync = client.transactional()

        val responseFuture =
            transactionalServiceAsync.send(
                TransactionalSendParams.builder()
                    .templateId("template_01jd1xq0cffycayqtdkdbv4d61")
                    .to("+30123456789")
                    .callbackUrl("callback_url")
                    .correlationId("correlation_id")
                    .expiresAt("expires_at")
                    .from("from")
                    .locale("el-GR")
                    .variables(
                        TransactionalSendParams.Variables.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.services.blocking

import com.prelude_so.api.TestServerExtension
import com.prelude_so.api.client.okhttp.PreludeOkHttpClient
import com.prelude_so.api.models.*
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

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
                    .variables(TransactionalSendParams.Variables.builder().build())
                    .build()
            )
        println(transactionalSendResponse)
        transactionalSendResponse.validate()
    }
}

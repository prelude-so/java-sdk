// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdParams

@ExtendWith(TestServerExtension::class)
internal class VerificationManagementServiceAsyncTest {

    @Test
    fun listSenderIds() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationManagementServiceAsync = client.verificationManagement()

        val responseFuture = verificationManagementServiceAsync.listSenderIds()

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }

    @Test
    fun submitSenderId() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationManagementServiceAsync = client.verificationManagement()

        val responseFuture =
            verificationManagementServiceAsync.submitSenderId(
                VerificationManagementSubmitSenderIdParams.builder().senderId("Prelude").build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

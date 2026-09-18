// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.verificationManagement

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.models.VerificationManagementSandboxAddPhoneNumberParams

@ExtendWith(TestServerExtension::class)
internal class SandboxServiceAsyncTest {

    @Test
    fun addPhoneNumber() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val sandboxServiceAsync = client.verificationManagement().sandbox()

        val responseFuture =
            sandboxServiceAsync.addPhoneNumber(
                VerificationManagementSandboxAddPhoneNumberParams.builder()
                    .attemptCode("123456")
                    .phoneNumber("+30123456789")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun deletePhoneNumber() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val sandboxServiceAsync = client.verificationManagement().sandbox()

        val responseFuture = sandboxServiceAsync.deletePhoneNumber("+12065550100")

        val response = responseFuture.get()
        response.validate()
    }

    @Test
    fun listPhoneNumbers() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val sandboxServiceAsync = client.verificationManagement().sandbox()

        val responseFuture = sandboxServiceAsync.listPhoneNumbers()

        val response = responseFuture.get()
        response.validate()
    }
}

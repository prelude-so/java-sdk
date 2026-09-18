// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking.verificationManagement

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.models.VerificationManagementSandboxAddPhoneNumberParams

@ExtendWith(TestServerExtension::class)
internal class SandboxServiceTest {

    @Test
    fun addPhoneNumber() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val sandboxService = client.verificationManagement().sandbox()

        val response =
            sandboxService.addPhoneNumber(
                VerificationManagementSandboxAddPhoneNumberParams.builder()
                    .attemptCode("123456")
                    .phoneNumber("+30123456789")
                    .build()
            )

        response.validate()
    }

    @Test
    fun deletePhoneNumber() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val sandboxService = client.verificationManagement().sandbox()

        val response = sandboxService.deletePhoneNumber("+12065550100")

        response.validate()
    }

    @Test
    fun listPhoneNumbers() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val sandboxService = client.verificationManagement().sandbox()

        val response = sandboxService.listPhoneNumbers()

        response.validate()
    }
}

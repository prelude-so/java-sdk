// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.models.VerificationManagementDeletePhoneNumberParams
import so.prelude.sdk.models.VerificationManagementListPhoneNumbersParams
import so.prelude.sdk.models.VerificationManagementSetPhoneNumberParams
import so.prelude.sdk.models.VerificationManagementSubmitSenderIdParams

@ExtendWith(TestServerExtension::class)
internal class VerificationManagementServiceTest {

    @Test
    fun deletePhoneNumber() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationManagementService = client.verificationManagement()

        val response =
            verificationManagementService.deletePhoneNumber(
                VerificationManagementDeletePhoneNumberParams.builder()
                    .action(VerificationManagementDeletePhoneNumberParams.Action.ALLOW)
                    .phoneNumber("+30123456789")
                    .build()
            )

        response.validate()
    }

    @Test
    fun listPhoneNumbers() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationManagementService = client.verificationManagement()

        val response =
            verificationManagementService.listPhoneNumbers(
                VerificationManagementListPhoneNumbersParams.Action.ALLOW
            )

        response.validate()
    }

    @Test
    fun listSenderIds() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationManagementService = client.verificationManagement()

        val response = verificationManagementService.listSenderIds()

        response.validate()
    }

    @Test
    fun setPhoneNumber() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationManagementService = client.verificationManagement()

        val response =
            verificationManagementService.setPhoneNumber(
                VerificationManagementSetPhoneNumberParams.builder()
                    .action(VerificationManagementSetPhoneNumberParams.Action.ALLOW)
                    .phoneNumber("+30123456789")
                    .build()
            )

        response.validate()
    }

    @Test
    fun submitSenderId() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val verificationManagementService = client.verificationManagement()

        val response =
            verificationManagementService.submitSenderId(
                VerificationManagementSubmitSenderIdParams.builder().senderId("Prelude").build()
            )

        response.validate()
    }
}

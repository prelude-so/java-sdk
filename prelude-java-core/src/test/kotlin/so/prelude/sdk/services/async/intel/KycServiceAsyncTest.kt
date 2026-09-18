// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async.intel

import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.models.IntelKycMatchParams

@ExtendWith(TestServerExtension::class)
internal class KycServiceAsyncTest {

    @Test
    fun match() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val kycServiceAsync = client.intel().kyc()

        val responseFuture =
            kycServiceAsync.match(
                IntelKycMatchParams.builder()
                    .phone("+12065550100")
                    .address("12 rue de la Paix")
                    .birthdate(LocalDate.parse("1990-01-15"))
                    .country("FR")
                    .email("jean.dupont@example.com")
                    .familyName("Dupont")
                    .givenName("Jean")
                    .locality("Paris")
                    .postalCode("75002")
                    .region("Île-de-France")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

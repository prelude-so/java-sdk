// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class IntelKycMatchParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = IntelKycMatchParams.builder().phone("+12065550100").build()

        assertThat(params._pathParam(0)).isEqualTo("+12065550100")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.address()).contains("12 rue de la Paix")
        assertThat(body.birthdate()).contains(LocalDate.parse("1990-01-15"))
        assertThat(body.country()).contains("FR")
        assertThat(body.email()).contains("jean.dupont@example.com")
        assertThat(body.familyName()).contains("Dupont")
        assertThat(body.givenName()).contains("Jean")
        assertThat(body.locality()).contains("Paris")
        assertThat(body.postalCode()).contains("75002")
        assertThat(body.region()).contains("Île-de-France")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = IntelKycMatchParams.builder().phone("+12065550100").build()

        val body = params._body()
    }
}

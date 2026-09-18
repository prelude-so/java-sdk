// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class IntelKycMatchResponseTest {

    @Test
    fun create() {
        val intelKycMatchResponse =
            IntelKycMatchResponse.builder()
                .addressMatch(IntelKycMatchResponse.AddressMatch.FALSE)
                .addressMatchScore(64L)
                .birthdateMatch(IntelKycMatchResponse.BirthdateMatch.TRUE)
                .countryCode("FR")
                .countryMatch(IntelKycMatchResponse.CountryMatch.TRUE)
                .emailMatch(IntelKycMatchResponse.EmailMatch.NOT_AVAILABLE)
                .emailMatchScore(0L)
                .familyNameMatch(IntelKycMatchResponse.FamilyNameMatch.FALSE)
                .familyNameMatchScore(82L)
                .givenNameMatch(IntelKycMatchResponse.GivenNameMatch.TRUE)
                .givenNameMatchScore(0L)
                .localityMatch(IntelKycMatchResponse.LocalityMatch.TRUE)
                .localityMatchScore(0L)
                .operator("orange_fr")
                .phoneNumber("+33612345678")
                .postalCodeMatch(IntelKycMatchResponse.PostalCodeMatch.TRUE)
                .regionMatch(IntelKycMatchResponse.RegionMatch.NOT_AVAILABLE)
                .regionMatchScore(0L)
                .requestId("01HVE0000000000000000000000")
                .build()

        assertThat(intelKycMatchResponse.addressMatch())
            .contains(IntelKycMatchResponse.AddressMatch.FALSE)
        assertThat(intelKycMatchResponse.addressMatchScore()).contains(64L)
        assertThat(intelKycMatchResponse.birthdateMatch())
            .contains(IntelKycMatchResponse.BirthdateMatch.TRUE)
        assertThat(intelKycMatchResponse.countryCode()).contains("FR")
        assertThat(intelKycMatchResponse.countryMatch())
            .contains(IntelKycMatchResponse.CountryMatch.TRUE)
        assertThat(intelKycMatchResponse.emailMatch())
            .contains(IntelKycMatchResponse.EmailMatch.NOT_AVAILABLE)
        assertThat(intelKycMatchResponse.emailMatchScore()).contains(0L)
        assertThat(intelKycMatchResponse.familyNameMatch())
            .contains(IntelKycMatchResponse.FamilyNameMatch.FALSE)
        assertThat(intelKycMatchResponse.familyNameMatchScore()).contains(82L)
        assertThat(intelKycMatchResponse.givenNameMatch())
            .contains(IntelKycMatchResponse.GivenNameMatch.TRUE)
        assertThat(intelKycMatchResponse.givenNameMatchScore()).contains(0L)
        assertThat(intelKycMatchResponse.localityMatch())
            .contains(IntelKycMatchResponse.LocalityMatch.TRUE)
        assertThat(intelKycMatchResponse.localityMatchScore()).contains(0L)
        assertThat(intelKycMatchResponse.operator()).contains("orange_fr")
        assertThat(intelKycMatchResponse.phoneNumber()).contains("+33612345678")
        assertThat(intelKycMatchResponse.postalCodeMatch())
            .contains(IntelKycMatchResponse.PostalCodeMatch.TRUE)
        assertThat(intelKycMatchResponse.regionMatch())
            .contains(IntelKycMatchResponse.RegionMatch.NOT_AVAILABLE)
        assertThat(intelKycMatchResponse.regionMatchScore()).contains(0L)
        assertThat(intelKycMatchResponse.requestId()).contains("01HVE0000000000000000000000")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val intelKycMatchResponse =
            IntelKycMatchResponse.builder()
                .addressMatch(IntelKycMatchResponse.AddressMatch.FALSE)
                .addressMatchScore(64L)
                .birthdateMatch(IntelKycMatchResponse.BirthdateMatch.TRUE)
                .countryCode("FR")
                .countryMatch(IntelKycMatchResponse.CountryMatch.TRUE)
                .emailMatch(IntelKycMatchResponse.EmailMatch.NOT_AVAILABLE)
                .emailMatchScore(0L)
                .familyNameMatch(IntelKycMatchResponse.FamilyNameMatch.FALSE)
                .familyNameMatchScore(82L)
                .givenNameMatch(IntelKycMatchResponse.GivenNameMatch.TRUE)
                .givenNameMatchScore(0L)
                .localityMatch(IntelKycMatchResponse.LocalityMatch.TRUE)
                .localityMatchScore(0L)
                .operator("orange_fr")
                .phoneNumber("+33612345678")
                .postalCodeMatch(IntelKycMatchResponse.PostalCodeMatch.TRUE)
                .regionMatch(IntelKycMatchResponse.RegionMatch.NOT_AVAILABLE)
                .regionMatchScore(0L)
                .requestId("01HVE0000000000000000000000")
                .build()

        val roundtrippedIntelKycMatchResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(intelKycMatchResponse),
                jacksonTypeRef<IntelKycMatchResponse>(),
            )

        assertThat(roundtrippedIntelKycMatchResponse).isEqualTo(intelKycMatchResponse)
    }
}

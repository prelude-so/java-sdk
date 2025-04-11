// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class LookupLookupResponseTest {

    @Test
    fun create() {
        val lookupLookupResponse =
            LookupLookupResponse.builder()
                .callerName("FINN")
                .countryCode("FR")
                .addFlag(LookupLookupResponse.Flag.PORTED)
                .lineType(LookupLookupResponse.LineType.MOBILE)
                .networkInfo(
                    LookupLookupResponse.NetworkInfo.builder()
                        .carrierName("SFR")
                        .mcc("208")
                        .mnc("13")
                        .build()
                )
                .originalNetworkInfo(
                    LookupLookupResponse.OriginalNetworkInfo.builder()
                        .carrierName("Orange")
                        .mcc("208")
                        .mnc("13")
                        .build()
                )
                .phoneNumber("+33**********")
                .build()

        assertThat(lookupLookupResponse.callerName()).contains("FINN")
        assertThat(lookupLookupResponse.countryCode()).contains("FR")
        assertThat(lookupLookupResponse.flags().getOrNull())
            .containsExactly(LookupLookupResponse.Flag.PORTED)
        assertThat(lookupLookupResponse.lineType()).contains(LookupLookupResponse.LineType.MOBILE)
        assertThat(lookupLookupResponse.networkInfo())
            .contains(
                LookupLookupResponse.NetworkInfo.builder()
                    .carrierName("SFR")
                    .mcc("208")
                    .mnc("13")
                    .build()
            )
        assertThat(lookupLookupResponse.originalNetworkInfo())
            .contains(
                LookupLookupResponse.OriginalNetworkInfo.builder()
                    .carrierName("Orange")
                    .mcc("208")
                    .mnc("13")
                    .build()
            )
        assertThat(lookupLookupResponse.phoneNumber()).contains("+33**********")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val lookupLookupResponse =
            LookupLookupResponse.builder()
                .callerName("FINN")
                .countryCode("FR")
                .addFlag(LookupLookupResponse.Flag.PORTED)
                .lineType(LookupLookupResponse.LineType.MOBILE)
                .networkInfo(
                    LookupLookupResponse.NetworkInfo.builder()
                        .carrierName("SFR")
                        .mcc("208")
                        .mnc("13")
                        .build()
                )
                .originalNetworkInfo(
                    LookupLookupResponse.OriginalNetworkInfo.builder()
                        .carrierName("Orange")
                        .mcc("208")
                        .mnc("13")
                        .build()
                )
                .phoneNumber("+33**********")
                .build()

        val roundtrippedLookupLookupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(lookupLookupResponse),
                jacksonTypeRef<LookupLookupResponse>(),
            )

        assertThat(roundtrippedLookupLookupResponse).isEqualTo(lookupLookupResponse)
    }
}

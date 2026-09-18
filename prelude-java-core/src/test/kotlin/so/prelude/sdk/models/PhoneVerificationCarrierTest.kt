// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class PhoneVerificationCarrierTest {

    @Test
    fun create() {
        val phoneVerificationCarrier =
            PhoneVerificationCarrier.builder().mccmnc("208-01").name("Orange").build()

        assertThat(phoneVerificationCarrier.mccmnc()).isEqualTo("208-01")
        assertThat(phoneVerificationCarrier.name()).contains("Orange")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneVerificationCarrier =
            PhoneVerificationCarrier.builder().mccmnc("208-01").name("Orange").build()

        val roundtrippedPhoneVerificationCarrier =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneVerificationCarrier),
                jacksonTypeRef<PhoneVerificationCarrier>(),
            )

        assertThat(roundtrippedPhoneVerificationCarrier).isEqualTo(phoneVerificationCarrier)
    }
}

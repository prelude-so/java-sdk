// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class PhoneVerificationMoneyTest {

    @Test
    fun create() {
        val phoneVerificationMoney =
            PhoneVerificationMoney.builder().amount("0.042").currency("EUR").build()

        assertThat(phoneVerificationMoney.amount()).isEqualTo("0.042")
        assertThat(phoneVerificationMoney.currency()).isEqualTo("EUR")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneVerificationMoney =
            PhoneVerificationMoney.builder().amount("0.042").currency("EUR").build()

        val roundtrippedPhoneVerificationMoney =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneVerificationMoney),
                jacksonTypeRef<PhoneVerificationMoney>(),
            )

        assertThat(roundtrippedPhoneVerificationMoney).isEqualTo(phoneVerificationMoney)
    }
}

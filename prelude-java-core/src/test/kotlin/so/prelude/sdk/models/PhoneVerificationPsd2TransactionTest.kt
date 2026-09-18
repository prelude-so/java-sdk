// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class PhoneVerificationPsd2TransactionTest {

    @Test
    fun create() {
        val phoneVerificationPsd2Transaction =
            PhoneVerificationPsd2Transaction.builder()
                .amount(PhoneVerificationMoney.builder().amount("0.042").currency("EUR").build())
                .recipient("recipient")
                .build()

        assertThat(phoneVerificationPsd2Transaction.amount())
            .contains(PhoneVerificationMoney.builder().amount("0.042").currency("EUR").build())
        assertThat(phoneVerificationPsd2Transaction.recipient()).contains("recipient")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val phoneVerificationPsd2Transaction =
            PhoneVerificationPsd2Transaction.builder()
                .amount(PhoneVerificationMoney.builder().amount("0.042").currency("EUR").build())
                .recipient("recipient")
                .build()

        val roundtrippedPhoneVerificationPsd2Transaction =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(phoneVerificationPsd2Transaction),
                jacksonTypeRef<PhoneVerificationPsd2Transaction>(),
            )

        assertThat(roundtrippedPhoneVerificationPsd2Transaction)
            .isEqualTo(phoneVerificationPsd2Transaction)
    }
}

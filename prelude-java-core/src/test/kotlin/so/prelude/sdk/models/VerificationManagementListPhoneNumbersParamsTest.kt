// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationManagementListPhoneNumbersParamsTest {

    @Test
    fun create() {
        VerificationManagementListPhoneNumbersParams.builder()
            .action(VerificationManagementListPhoneNumbersParams.Action.ALLOW)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            VerificationManagementListPhoneNumbersParams.builder()
                .action(VerificationManagementListPhoneNumbersParams.Action.ALLOW)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("allow")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}

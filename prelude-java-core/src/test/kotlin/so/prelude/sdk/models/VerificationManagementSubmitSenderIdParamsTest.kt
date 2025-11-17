// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationManagementSubmitSenderIdParamsTest {

    @Test
    fun create() {
        VerificationManagementSubmitSenderIdParams.builder().senderId("Prelude").build()
    }

    @Test
    fun body() {
        val params =
            VerificationManagementSubmitSenderIdParams.builder().senderId("Prelude").build()

        val body = params._body()

        assertThat(body.senderId()).isEqualTo("Prelude")
    }
}

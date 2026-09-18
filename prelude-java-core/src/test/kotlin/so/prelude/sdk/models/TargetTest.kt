// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class TargetTest {

    @Test
    fun create() {
        val target = Target.builder().type(Target.Type.PHONE_NUMBER).value("+30123456789").build()

        assertThat(target.type()).isEqualTo(Target.Type.PHONE_NUMBER)
        assertThat(target.value()).isEqualTo("+30123456789")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val target = Target.builder().type(Target.Type.PHONE_NUMBER).value("+30123456789").build()

        val roundtrippedTarget =
            jsonMapper.readValue(jsonMapper.writeValueAsString(target), jacksonTypeRef<Target>())

        assertThat(roundtrippedTarget).isEqualTo(target)
    }
}

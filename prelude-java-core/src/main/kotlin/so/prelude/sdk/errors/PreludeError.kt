// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.errors

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import java.util.Objects
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.immutableEmptyMap
import so.prelude.sdk.core.toImmutable

@NoAutoDetect
class PreludeError
@JsonCreator
private constructor(
    @JsonAnyGetter
    @ExcludeMissing
    @JsonAnySetter
    @get:JvmName("additionalProperties")
    val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PreludeError]. */
    class Builder internal constructor() {

        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(preludeError: PreludeError) = apply {
            additionalProperties = preludeError.additionalProperties.toMutableMap()
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        fun build(): PreludeError = PreludeError(additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PreludeError && additionalProperties == other.additionalProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */

    override fun toString() = "PreludeError{additionalProperties=$additionalProperties}"
}

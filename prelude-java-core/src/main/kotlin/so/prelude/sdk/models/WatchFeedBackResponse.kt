// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.toImmutable

@JsonDeserialize(builder = WatchFeedBackResponse.Builder::class)
@NoAutoDetect
class WatchFeedBackResponse
private constructor(
    private val id: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A unique identifier for your feedback request. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** A unique identifier for your feedback request. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): WatchFeedBackResponse = apply {
        if (!validated) {
            id()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(watchFeedBackResponse: WatchFeedBackResponse) = apply {
            this.id = watchFeedBackResponse.id
            additionalProperties(watchFeedBackResponse.additionalProperties)
        }

        /** A unique identifier for your feedback request. */
        fun id(id: String) = id(JsonField.of(id))

        /** A unique identifier for your feedback request. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): WatchFeedBackResponse =
            WatchFeedBackResponse(id, additionalProperties.toImmutable())
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WatchFeedBackResponse && this.id == other.id && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "WatchFeedBackResponse{id=$id, additionalProperties=$additionalProperties}"
}

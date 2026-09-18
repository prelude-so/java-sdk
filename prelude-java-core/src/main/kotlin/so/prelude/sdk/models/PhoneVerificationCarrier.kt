// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.errors.PreludeInvalidDataException

/** The end user's mobile network. */
class PhoneVerificationCarrier
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val mccmnc: JsonField<String>,
    private val name: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("mccmnc") @ExcludeMissing mccmnc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
    ) : this(mccmnc, name, mutableMapOf())

    /**
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun mccmnc(): String = mccmnc.getRequired("mccmnc")

    /**
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * Returns the raw JSON value of [mccmnc].
     *
     * Unlike [mccmnc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mccmnc") @ExcludeMissing fun _mccmnc(): JsonField<String> = mccmnc

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhoneVerificationCarrier].
         *
         * The following fields are required:
         * ```java
         * .mccmnc()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneVerificationCarrier]. */
    class Builder internal constructor() {

        private var mccmnc: JsonField<String>? = null
        private var name: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneVerificationCarrier: PhoneVerificationCarrier) = apply {
            mccmnc = phoneVerificationCarrier.mccmnc
            name = phoneVerificationCarrier.name
            additionalProperties = phoneVerificationCarrier.additionalProperties.toMutableMap()
        }

        fun mccmnc(mccmnc: String) = mccmnc(JsonField.of(mccmnc))

        /**
         * Sets [Builder.mccmnc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mccmnc] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mccmnc(mccmnc: JsonField<String>) = apply { this.mccmnc = mccmnc }

        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

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

        /**
         * Returns an immutable instance of [PhoneVerificationCarrier].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .mccmnc()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): PhoneVerificationCarrier =
            PhoneVerificationCarrier(
                checkRequired("mccmnc", mccmnc),
                name,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws PreludeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): PhoneVerificationCarrier = apply {
        if (validated) {
            return@apply
        }

        mccmnc()
        name()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: PreludeInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (mccmnc.asKnown().isPresent) 1 else 0) + (if (name.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneVerificationCarrier &&
            mccmnc == other.mccmnc &&
            name == other.name &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(mccmnc, name, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneVerificationCarrier{mccmnc=$mccmnc, name=$name, additionalProperties=$additionalProperties}"
}

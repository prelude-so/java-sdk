// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.errors.PreludeInvalidDataException

class PhoneVerificationPsd2Transaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val amount: JsonField<PhoneVerificationMoney>,
    private val recipient: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        amount: JsonField<PhoneVerificationMoney> = JsonMissing.of(),
        @JsonProperty("recipient") @ExcludeMissing recipient: JsonField<String> = JsonMissing.of(),
    ) : this(amount, recipient, mutableMapOf())

    /**
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun amount(): Optional<PhoneVerificationMoney> = amount.getOptional("amount")

    /**
     * Payee name displayed to the payer.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun recipient(): Optional<String> = recipient.getOptional("recipient")

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<PhoneVerificationMoney> = amount

    /**
     * Returns the raw JSON value of [recipient].
     *
     * Unlike [recipient], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipient") @ExcludeMissing fun _recipient(): JsonField<String> = recipient

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
         * Returns a mutable builder for constructing an instance of
         * [PhoneVerificationPsd2Transaction].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [PhoneVerificationPsd2Transaction]. */
    class Builder internal constructor() {

        private var amount: JsonField<PhoneVerificationMoney> = JsonMissing.of()
        private var recipient: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(phoneVerificationPsd2Transaction: PhoneVerificationPsd2Transaction) =
            apply {
                amount = phoneVerificationPsd2Transaction.amount
                recipient = phoneVerificationPsd2Transaction.recipient
                additionalProperties =
                    phoneVerificationPsd2Transaction.additionalProperties.toMutableMap()
            }

        fun amount(amount: PhoneVerificationMoney) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [PhoneVerificationMoney] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amount(amount: JsonField<PhoneVerificationMoney>) = apply { this.amount = amount }

        /** Payee name displayed to the payer. */
        fun recipient(recipient: String) = recipient(JsonField.of(recipient))

        /**
         * Sets [Builder.recipient] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipient] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipient(recipient: JsonField<String>) = apply { this.recipient = recipient }

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
         * Returns an immutable instance of [PhoneVerificationPsd2Transaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): PhoneVerificationPsd2Transaction =
            PhoneVerificationPsd2Transaction(amount, recipient, additionalProperties.toMutableMap())
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
    fun validate(): PhoneVerificationPsd2Transaction = apply {
        if (validated) {
            return@apply
        }

        amount().ifPresent { it.validate() }
        recipient()
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
        (amount.asKnown().getOrNull()?.validity() ?: 0) +
            (if (recipient.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhoneVerificationPsd2Transaction &&
            amount == other.amount &&
            recipient == other.recipient &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(amount, recipient, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PhoneVerificationPsd2Transaction{amount=$amount, recipient=$recipient, additionalProperties=$additionalProperties}"
}

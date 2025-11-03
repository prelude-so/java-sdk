// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.errors.PreludeInvalidDataException

class VerificationManagementSetPhoneNumberResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val phoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of()
    ) : this(phoneNumber, mutableMapOf())

    /**
     * The E.164 formatted phone number that was added to the list.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

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
         * [VerificationManagementSetPhoneNumberResponse].
         *
         * The following fields are required:
         * ```java
         * .phoneNumber()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationManagementSetPhoneNumberResponse]. */
    class Builder internal constructor() {

        private var phoneNumber: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            verificationManagementSetPhoneNumberResponse:
                VerificationManagementSetPhoneNumberResponse
        ) = apply {
            phoneNumber = verificationManagementSetPhoneNumberResponse.phoneNumber
            additionalProperties =
                verificationManagementSetPhoneNumberResponse.additionalProperties.toMutableMap()
        }

        /** The E.164 formatted phone number that was added to the list. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * Returns an immutable instance of [VerificationManagementSetPhoneNumberResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .phoneNumber()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationManagementSetPhoneNumberResponse =
            VerificationManagementSetPhoneNumberResponse(
                checkRequired("phoneNumber", phoneNumber),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VerificationManagementSetPhoneNumberResponse = apply {
        if (validated) {
            return@apply
        }

        phoneNumber()
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
    @JvmSynthetic internal fun validity(): Int = (if (phoneNumber.asKnown().isPresent) 1 else 0)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationManagementSetPhoneNumberResponse &&
            phoneNumber == other.phoneNumber &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(phoneNumber, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerificationManagementSetPhoneNumberResponse{phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}

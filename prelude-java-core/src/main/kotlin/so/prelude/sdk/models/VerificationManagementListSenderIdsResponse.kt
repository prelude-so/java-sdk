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
import so.prelude.sdk.core.Enum
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.checkKnown
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

/** A list of Sender ID. */
class VerificationManagementListSenderIdsResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val senderIds: JsonField<List<SenderId>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("sender_ids")
        @ExcludeMissing
        senderIds: JsonField<List<SenderId>> = JsonMissing.of()
    ) : this(senderIds, mutableMapOf())

    /**
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun senderIds(): Optional<List<SenderId>> = senderIds.getOptional("sender_ids")

    /**
     * Returns the raw JSON value of [senderIds].
     *
     * Unlike [senderIds], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("sender_ids")
    @ExcludeMissing
    fun _senderIds(): JsonField<List<SenderId>> = senderIds

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
         * [VerificationManagementListSenderIdsResponse].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationManagementListSenderIdsResponse]. */
    class Builder internal constructor() {

        private var senderIds: JsonField<MutableList<SenderId>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            verificationManagementListSenderIdsResponse: VerificationManagementListSenderIdsResponse
        ) = apply {
            senderIds =
                verificationManagementListSenderIdsResponse.senderIds.map { it.toMutableList() }
            additionalProperties =
                verificationManagementListSenderIdsResponse.additionalProperties.toMutableMap()
        }

        fun senderIds(senderIds: List<SenderId>) = senderIds(JsonField.of(senderIds))

        /**
         * Sets [Builder.senderIds] to an arbitrary JSON value.
         *
         * You should usually call [Builder.senderIds] with a well-typed `List<SenderId>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun senderIds(senderIds: JsonField<List<SenderId>>) = apply {
            this.senderIds = senderIds.map { it.toMutableList() }
        }

        /**
         * Adds a single [SenderId] to [senderIds].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addSenderId(senderId: SenderId) = apply {
            senderIds =
                (senderIds ?: JsonField.of(mutableListOf())).also {
                    checkKnown("senderIds", it).add(senderId)
                }
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

        /**
         * Returns an immutable instance of [VerificationManagementListSenderIdsResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VerificationManagementListSenderIdsResponse =
            VerificationManagementListSenderIdsResponse(
                (senderIds ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): VerificationManagementListSenderIdsResponse = apply {
        if (validated) {
            return@apply
        }

        senderIds().ifPresent { it.forEach { it.validate() } }
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
        (senderIds.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class SenderId
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val senderId: JsonField<String>,
        private val status: JsonField<Status>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("sender_id")
            @ExcludeMissing
            senderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        ) : this(senderId, status, mutableMapOf())

        /**
         * Value that will be presented as Sender ID
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun senderId(): Optional<String> = senderId.getOptional("sender_id")

        /**
         * It indicates the status of the Sender ID. Possible values are:
         * * `approved` - The Sender ID is approved.
         * * `pending` - The Sender ID is pending.
         * * `rejected` - The Sender ID is rejected.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun status(): Optional<Status> = status.getOptional("status")

        /**
         * Returns the raw JSON value of [senderId].
         *
         * Unlike [senderId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sender_id") @ExcludeMissing fun _senderId(): JsonField<String> = senderId

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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

            /** Returns a mutable builder for constructing an instance of [SenderId]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SenderId]. */
        class Builder internal constructor() {

            private var senderId: JsonField<String> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(senderId: SenderId) = apply {
                this.senderId = senderId.senderId
                status = senderId.status
                additionalProperties = senderId.additionalProperties.toMutableMap()
            }

            /** Value that will be presented as Sender ID */
            fun senderId(senderId: String) = senderId(JsonField.of(senderId))

            /**
             * Sets [Builder.senderId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.senderId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun senderId(senderId: JsonField<String>) = apply { this.senderId = senderId }

            /**
             * It indicates the status of the Sender ID. Possible values are:
             * * `approved` - The Sender ID is approved.
             * * `pending` - The Sender ID is pending.
             * * `rejected` - The Sender ID is rejected.
             */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

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
             * Returns an immutable instance of [SenderId].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): SenderId = SenderId(senderId, status, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): SenderId = apply {
            if (validated) {
                return@apply
            }

            senderId()
            status().ifPresent { it.validate() }
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (senderId.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * It indicates the status of the Sender ID. Possible values are:
         * * `approved` - The Sender ID is approved.
         * * `pending` - The Sender ID is pending.
         * * `rejected` - The Sender ID is rejected.
         */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APPROVED = of("approved")

                @JvmField val PENDING = of("pending")

                @JvmField val REJECTED = of("rejected")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                APPROVED,
                PENDING,
                REJECTED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPROVED,
                PENDING,
                REJECTED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    PENDING -> Value.PENDING
                    REJECTED -> Value.REJECTED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws PreludeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    PENDING -> Known.PENDING
                    REJECTED -> Known.REJECTED
                    else -> throw PreludeInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws PreludeInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    PreludeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Status = apply {
                if (validated) {
                    return@apply
                }

                known()
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
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Status && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SenderId &&
                senderId == other.senderId &&
                status == other.status &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(senderId, status, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SenderId{senderId=$senderId, status=$status, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationManagementListSenderIdsResponse &&
            senderIds == other.senderIds &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy { Objects.hash(senderIds, additionalProperties) }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerificationManagementListSenderIdsResponse{senderIds=$senderIds, additionalProperties=$additionalProperties}"
}

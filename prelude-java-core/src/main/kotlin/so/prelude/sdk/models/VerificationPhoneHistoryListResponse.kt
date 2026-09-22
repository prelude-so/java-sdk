// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
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
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

class VerificationPhoneHistoryListResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val verifications: JsonField<List<Verification>>,
    private val nextCursor: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("verifications")
        @ExcludeMissing
        verifications: JsonField<List<Verification>> = JsonMissing.of(),
        @JsonProperty("next_cursor")
        @ExcludeMissing
        nextCursor: JsonField<String> = JsonMissing.of(),
    ) : this(verifications, nextCursor, mutableMapOf())

    /**
     * The page of verifications, most recent first.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verifications(): List<Verification> = verifications.getRequired("verifications")

    /**
     * Pagination cursor for the next page of results. Omitted if there are no more pages.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun nextCursor(): Optional<String> = nextCursor.getOptional("next_cursor")

    /**
     * Returns the raw JSON value of [verifications].
     *
     * Unlike [verifications], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verifications")
    @ExcludeMissing
    fun _verifications(): JsonField<List<Verification>> = verifications

    /**
     * Returns the raw JSON value of [nextCursor].
     *
     * Unlike [nextCursor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("next_cursor") @ExcludeMissing fun _nextCursor(): JsonField<String> = nextCursor

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
         * [VerificationPhoneHistoryListResponse].
         *
         * The following fields are required:
         * ```java
         * .verifications()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationPhoneHistoryListResponse]. */
    class Builder internal constructor() {

        private var verifications: JsonField<MutableList<Verification>>? = null
        private var nextCursor: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            verificationPhoneHistoryListResponse: VerificationPhoneHistoryListResponse
        ) = apply {
            verifications =
                verificationPhoneHistoryListResponse.verifications.map { it.toMutableList() }
            nextCursor = verificationPhoneHistoryListResponse.nextCursor
            additionalProperties =
                verificationPhoneHistoryListResponse.additionalProperties.toMutableMap()
        }

        /** The page of verifications, most recent first. */
        fun verifications(verifications: List<Verification>) =
            verifications(JsonField.of(verifications))

        /**
         * Sets [Builder.verifications] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verifications] with a well-typed `List<Verification>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun verifications(verifications: JsonField<List<Verification>>) = apply {
            this.verifications = verifications.map { it.toMutableList() }
        }

        /**
         * Adds a single [Verification] to [verifications].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addVerification(verification: Verification) = apply {
            verifications =
                (verifications ?: JsonField.of(mutableListOf())).also {
                    checkKnown("verifications", it).add(verification)
                }
        }

        /** Pagination cursor for the next page of results. Omitted if there are no more pages. */
        fun nextCursor(nextCursor: String) = nextCursor(JsonField.of(nextCursor))

        /**
         * Sets [Builder.nextCursor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.nextCursor] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun nextCursor(nextCursor: JsonField<String>) = apply { this.nextCursor = nextCursor }

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
         * Returns an immutable instance of [VerificationPhoneHistoryListResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .verifications()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationPhoneHistoryListResponse =
            VerificationPhoneHistoryListResponse(
                checkRequired("verifications", verifications).map { it.toImmutable() },
                nextCursor,
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
    fun validate(): VerificationPhoneHistoryListResponse = apply {
        if (validated) {
            return@apply
        }

        verifications().forEach { it.validate() }
        nextCursor()
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
        (verifications.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (if (nextCursor.asKnown().isPresent) 1 else 0)

    /**
     * One entry of the verification history.
     * [Get a phone verification](/verify/v2/api-reference/history/get-a-phone-verification) returns
     * the full record.
     */
    class Verification
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val id: JsonField<String>,
        private val channels: JsonField<List<Channel>>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val delivered: JsonField<Boolean>,
        private val phoneNumber: JsonField<String>,
        private val status: JsonField<Status>,
        private val attempts: JsonField<Long>,
        private val convertedAt: JsonField<OffsetDateTime>,
        private val cost: JsonField<PhoneVerificationMoney>,
        private val devicePlatform: JsonField<DevicePlatform>,
        private val phoneNumberCondition: JsonField<PhoneNumberCondition>,
        private val signalsHashStatus: JsonField<SignalsHashStatus>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("channels")
            @ExcludeMissing
            channels: JsonField<List<Channel>> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("delivered")
            @ExcludeMissing
            delivered: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("attempts") @ExcludeMissing attempts: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("converted_at")
            @ExcludeMissing
            convertedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("cost")
            @ExcludeMissing
            cost: JsonField<PhoneVerificationMoney> = JsonMissing.of(),
            @JsonProperty("device_platform")
            @ExcludeMissing
            devicePlatform: JsonField<DevicePlatform> = JsonMissing.of(),
            @JsonProperty("phone_number_condition")
            @ExcludeMissing
            phoneNumberCondition: JsonField<PhoneNumberCondition> = JsonMissing.of(),
            @JsonProperty("signals_hash_status")
            @ExcludeMissing
            signalsHashStatus: JsonField<SignalsHashStatus> = JsonMissing.of(),
        ) : this(
            id,
            channels,
            createdAt,
            delivered,
            phoneNumber,
            status,
            attempts,
            convertedAt,
            cost,
            devicePlatform,
            phoneNumberCondition,
            signalsHashStatus,
            mutableMapOf(),
        )

        /**
         * The verification identifier.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun id(): String = id.getRequired("id")

        /**
         * The channels the verification could use, and which one the end user converted through.
         * Empty when the verification used only channels this API does not list.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun channels(): List<Channel> = channels.getRequired("channels")

        /**
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * Whether at least one message was reported delivered.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun delivered(): Boolean = delivered.getRequired("delivered")

        /**
         * The E.164 phone number the verification targeted.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * The outcome of the verification.
         * * `converted` - The end user submitted a valid code.
         * * `not_converted` - The verification expired without a valid code.
         * * `pending_check` - A code was delivered and Prelude is still waiting for a check.
         * * `sent` - A code was sent and the verification window is still open.
         * * `challenged` - The verification was restricted to non-SMS and non-voice channels.
         * * `suspected_fraud` - The anti-fraud system blocked the verification.
         * * `in_blocklist` - The phone number is on the configured block list.
         * * `invalid_line` - The phone number is not a valid line type.
         * * `invalid_number` - The phone number is not a valid number.
         * * `rate_limited` - The verification was refused by a rate limit.
         * * `expired_signals` - The SDK signals were collected too long before the request to still
         *   attest to it.
         * * `shadowed` - The anti-fraud system flagged the verification without blocking it.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * Number of messages sent for the verification, `0` when none was. Absent for sandboxed
         * phone numbers.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun attempts(): Optional<Long> = attempts.getOptional("attempts")

        /**
         * When the end user submitted a valid code. Absent unless the verification converted.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun convertedAt(): Optional<OffsetDateTime> = convertedAt.getOptional("converted_at")

        /**
         * Total cost of the verification. Absent when nothing was billed.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cost(): Optional<PhoneVerificationMoney> = cost.getOptional("cost")

        /**
         * Platform of the end-user device, when known.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun devicePlatform(): Optional<DevicePlatform> =
            devicePlatform.getOptional("device_platform")

        /**
         * Whether the phone number was allow-listed, block-listed, or sandboxed at verification
         * time.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun phoneNumberCondition(): Optional<PhoneNumberCondition> =
            phoneNumberCondition.getOptional("phone_number_condition")

        /**
         * Whether the SDK signals integrity check passed.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signalsHashStatus(): Optional<SignalsHashStatus> =
            signalsHashStatus.getOptional("signals_hash_status")

        /**
         * Returns the raw JSON value of [id].
         *
         * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

        /**
         * Returns the raw JSON value of [channels].
         *
         * Unlike [channels], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("channels")
        @ExcludeMissing
        fun _channels(): JsonField<List<Channel>> = channels

        /**
         * Returns the raw JSON value of [createdAt].
         *
         * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /**
         * Returns the raw JSON value of [delivered].
         *
         * Unlike [delivered], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("delivered") @ExcludeMissing fun _delivered(): JsonField<Boolean> = delivered

        /**
         * Returns the raw JSON value of [phoneNumber].
         *
         * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("phone_number")
        @ExcludeMissing
        fun _phoneNumber(): JsonField<String> = phoneNumber

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [attempts].
         *
         * Unlike [attempts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("attempts") @ExcludeMissing fun _attempts(): JsonField<Long> = attempts

        /**
         * Returns the raw JSON value of [convertedAt].
         *
         * Unlike [convertedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("converted_at")
        @ExcludeMissing
        fun _convertedAt(): JsonField<OffsetDateTime> = convertedAt

        /**
         * Returns the raw JSON value of [cost].
         *
         * Unlike [cost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cost") @ExcludeMissing fun _cost(): JsonField<PhoneVerificationMoney> = cost

        /**
         * Returns the raw JSON value of [devicePlatform].
         *
         * Unlike [devicePlatform], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("device_platform")
        @ExcludeMissing
        fun _devicePlatform(): JsonField<DevicePlatform> = devicePlatform

        /**
         * Returns the raw JSON value of [phoneNumberCondition].
         *
         * Unlike [phoneNumberCondition], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("phone_number_condition")
        @ExcludeMissing
        fun _phoneNumberCondition(): JsonField<PhoneNumberCondition> = phoneNumberCondition

        /**
         * Returns the raw JSON value of [signalsHashStatus].
         *
         * Unlike [signalsHashStatus], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signals_hash_status")
        @ExcludeMissing
        fun _signalsHashStatus(): JsonField<SignalsHashStatus> = signalsHashStatus

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
             * Returns a mutable builder for constructing an instance of [Verification].
             *
             * The following fields are required:
             * ```java
             * .id()
             * .channels()
             * .createdAt()
             * .delivered()
             * .phoneNumber()
             * .status()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Verification]. */
        class Builder internal constructor() {

            private var id: JsonField<String>? = null
            private var channels: JsonField<MutableList<Channel>>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var delivered: JsonField<Boolean>? = null
            private var phoneNumber: JsonField<String>? = null
            private var status: JsonField<Status>? = null
            private var attempts: JsonField<Long> = JsonMissing.of()
            private var convertedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var cost: JsonField<PhoneVerificationMoney> = JsonMissing.of()
            private var devicePlatform: JsonField<DevicePlatform> = JsonMissing.of()
            private var phoneNumberCondition: JsonField<PhoneNumberCondition> = JsonMissing.of()
            private var signalsHashStatus: JsonField<SignalsHashStatus> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verification: Verification) = apply {
                id = verification.id
                channels = verification.channels.map { it.toMutableList() }
                createdAt = verification.createdAt
                delivered = verification.delivered
                phoneNumber = verification.phoneNumber
                status = verification.status
                attempts = verification.attempts
                convertedAt = verification.convertedAt
                cost = verification.cost
                devicePlatform = verification.devicePlatform
                phoneNumberCondition = verification.phoneNumberCondition
                signalsHashStatus = verification.signalsHashStatus
                additionalProperties = verification.additionalProperties.toMutableMap()
            }

            /** The verification identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /**
             * Sets [Builder.id] to an arbitrary JSON value.
             *
             * You should usually call [Builder.id] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun id(id: JsonField<String>) = apply { this.id = id }

            /**
             * The channels the verification could use, and which one the end user converted
             * through. Empty when the verification used only channels this API does not list.
             */
            fun channels(channels: List<Channel>) = channels(JsonField.of(channels))

            /**
             * Sets [Builder.channels] to an arbitrary JSON value.
             *
             * You should usually call [Builder.channels] with a well-typed `List<Channel>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun channels(channels: JsonField<List<Channel>>) = apply {
                this.channels = channels.map { it.toMutableList() }
            }

            /**
             * Adds a single [Channel] to [channels].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addChannel(channel: Channel) = apply {
                channels =
                    (channels ?: JsonField.of(mutableListOf())).also {
                        checkKnown("channels", it).add(channel)
                    }
            }

            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * Sets [Builder.createdAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** Whether at least one message was reported delivered. */
            fun delivered(delivered: Boolean) = delivered(JsonField.of(delivered))

            /**
             * Sets [Builder.delivered] to an arbitrary JSON value.
             *
             * You should usually call [Builder.delivered] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun delivered(delivered: JsonField<Boolean>) = apply { this.delivered = delivered }

            /** The E.164 phone number the verification targeted. */
            fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

            /**
             * Sets [Builder.phoneNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun phoneNumber(phoneNumber: JsonField<String>) = apply {
                this.phoneNumber = phoneNumber
            }

            /**
             * The outcome of the verification.
             * * `converted` - The end user submitted a valid code.
             * * `not_converted` - The verification expired without a valid code.
             * * `pending_check` - A code was delivered and Prelude is still waiting for a check.
             * * `sent` - A code was sent and the verification window is still open.
             * * `challenged` - The verification was restricted to non-SMS and non-voice channels.
             * * `suspected_fraud` - The anti-fraud system blocked the verification.
             * * `in_blocklist` - The phone number is on the configured block list.
             * * `invalid_line` - The phone number is not a valid line type.
             * * `invalid_number` - The phone number is not a valid number.
             * * `rate_limited` - The verification was refused by a rate limit.
             * * `expired_signals` - The SDK signals were collected too long before the request to
             *   still attest to it.
             * * `shadowed` - The anti-fraud system flagged the verification without blocking it.
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

            /**
             * Number of messages sent for the verification, `0` when none was. Absent for sandboxed
             * phone numbers.
             */
            fun attempts(attempts: Long) = attempts(JsonField.of(attempts))

            /**
             * Sets [Builder.attempts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attempts] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attempts(attempts: JsonField<Long>) = apply { this.attempts = attempts }

            /**
             * When the end user submitted a valid code. Absent unless the verification converted.
             */
            fun convertedAt(convertedAt: OffsetDateTime) = convertedAt(JsonField.of(convertedAt))

            /**
             * Sets [Builder.convertedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.convertedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun convertedAt(convertedAt: JsonField<OffsetDateTime>) = apply {
                this.convertedAt = convertedAt
            }

            /** Total cost of the verification. Absent when nothing was billed. */
            fun cost(cost: PhoneVerificationMoney) = cost(JsonField.of(cost))

            /**
             * Sets [Builder.cost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cost] with a well-typed [PhoneVerificationMoney]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun cost(cost: JsonField<PhoneVerificationMoney>) = apply { this.cost = cost }

            /** Platform of the end-user device, when known. */
            fun devicePlatform(devicePlatform: DevicePlatform) =
                devicePlatform(JsonField.of(devicePlatform))

            /**
             * Sets [Builder.devicePlatform] to an arbitrary JSON value.
             *
             * You should usually call [Builder.devicePlatform] with a well-typed [DevicePlatform]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun devicePlatform(devicePlatform: JsonField<DevicePlatform>) = apply {
                this.devicePlatform = devicePlatform
            }

            /**
             * Whether the phone number was allow-listed, block-listed, or sandboxed at verification
             * time.
             */
            fun phoneNumberCondition(phoneNumberCondition: PhoneNumberCondition) =
                phoneNumberCondition(JsonField.of(phoneNumberCondition))

            /**
             * Sets [Builder.phoneNumberCondition] to an arbitrary JSON value.
             *
             * You should usually call [Builder.phoneNumberCondition] with a well-typed
             * [PhoneNumberCondition] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun phoneNumberCondition(phoneNumberCondition: JsonField<PhoneNumberCondition>) =
                apply {
                    this.phoneNumberCondition = phoneNumberCondition
                }

            /** Whether the SDK signals integrity check passed. */
            fun signalsHashStatus(signalsHashStatus: SignalsHashStatus) =
                signalsHashStatus(JsonField.of(signalsHashStatus))

            /**
             * Sets [Builder.signalsHashStatus] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signalsHashStatus] with a well-typed
             * [SignalsHashStatus] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun signalsHashStatus(signalsHashStatus: JsonField<SignalsHashStatus>) = apply {
                this.signalsHashStatus = signalsHashStatus
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
             * Returns an immutable instance of [Verification].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .id()
             * .channels()
             * .createdAt()
             * .delivered()
             * .phoneNumber()
             * .status()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Verification =
                Verification(
                    checkRequired("id", id),
                    checkRequired("channels", channels).map { it.toImmutable() },
                    checkRequired("createdAt", createdAt),
                    checkRequired("delivered", delivered),
                    checkRequired("phoneNumber", phoneNumber),
                    checkRequired("status", status),
                    attempts,
                    convertedAt,
                    cost,
                    devicePlatform,
                    phoneNumberCondition,
                    signalsHashStatus,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PreludeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): Verification = apply {
            if (validated) {
                return@apply
            }

            id()
            channels().forEach { it.validate() }
            createdAt()
            delivered()
            phoneNumber()
            status().validate()
            attempts()
            convertedAt()
            cost().ifPresent { it.validate() }
            devicePlatform().ifPresent { it.validate() }
            phoneNumberCondition().ifPresent { it.validate() }
            signalsHashStatus().ifPresent { it.validate() }
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
            (if (id.asKnown().isPresent) 1 else 0) +
                (channels.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (createdAt.asKnown().isPresent) 1 else 0) +
                (if (delivered.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0) +
                (status.asKnown().getOrNull()?.validity() ?: 0) +
                (if (attempts.asKnown().isPresent) 1 else 0) +
                (if (convertedAt.asKnown().isPresent) 1 else 0) +
                (cost.asKnown().getOrNull()?.validity() ?: 0) +
                (devicePlatform.asKnown().getOrNull()?.validity() ?: 0) +
                (phoneNumberCondition.asKnown().getOrNull()?.validity() ?: 0) +
                (signalsHashStatus.asKnown().getOrNull()?.validity() ?: 0)

        class Channel
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val channel: JsonField<InnerChannel>,
            private val converted: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("channel")
                @ExcludeMissing
                channel: JsonField<InnerChannel> = JsonMissing.of(),
                @JsonProperty("converted")
                @ExcludeMissing
                converted: JsonField<Boolean> = JsonMissing.of(),
            ) : this(channel, converted, mutableMapOf())

            /**
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun channel(): InnerChannel = channel.getRequired("channel")

            /**
             * Whether the end user submitted a valid code received through this channel.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun converted(): Boolean = converted.getRequired("converted")

            /**
             * Returns the raw JSON value of [channel].
             *
             * Unlike [channel], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("channel")
            @ExcludeMissing
            fun _channel(): JsonField<InnerChannel> = channel

            /**
             * Returns the raw JSON value of [converted].
             *
             * Unlike [converted], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("converted")
            @ExcludeMissing
            fun _converted(): JsonField<Boolean> = converted

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
                 * Returns a mutable builder for constructing an instance of [Channel].
                 *
                 * The following fields are required:
                 * ```java
                 * .channel()
                 * .converted()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Channel]. */
            class Builder internal constructor() {

                private var channel: JsonField<InnerChannel>? = null
                private var converted: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(channel: Channel) = apply {
                    this.channel = channel.channel
                    converted = channel.converted
                    additionalProperties = channel.additionalProperties.toMutableMap()
                }

                fun channel(channel: InnerChannel) = channel(JsonField.of(channel))

                /**
                 * Sets [Builder.channel] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.channel] with a well-typed [InnerChannel] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun channel(channel: JsonField<InnerChannel>) = apply { this.channel = channel }

                /** Whether the end user submitted a valid code received through this channel. */
                fun converted(converted: Boolean) = converted(JsonField.of(converted))

                /**
                 * Sets [Builder.converted] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.converted] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun converted(converted: JsonField<Boolean>) = apply { this.converted = converted }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Channel].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .channel()
                 * .converted()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Channel =
                    Channel(
                        checkRequired("channel", channel),
                        checkRequired("converted", converted),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PreludeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Channel = apply {
                if (validated) {
                    return@apply
                }

                channel().validate()
                converted()
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
                (channel.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (converted.asKnown().isPresent) 1 else 0)

            class InnerChannel
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val SMS = of("sms")

                    @JvmField val RCS = of("rcs")

                    @JvmField val WHATSAPP = of("whatsapp")

                    @JvmField val VIBER = of("viber")

                    @JvmField val ZALO = of("zalo")

                    @JvmField val TELEGRAM = of("telegram")

                    @JvmField val VOICE = of("voice")

                    @JvmField val SILENT = of("silent")

                    @JvmStatic fun of(value: String) = InnerChannel(JsonField.of(value))
                }

                /** An enum containing [InnerChannel]'s known values. */
                enum class Known {
                    SMS,
                    RCS,
                    WHATSAPP,
                    VIBER,
                    ZALO,
                    TELEGRAM,
                    VOICE,
                    SILENT,
                }

                /**
                 * An enum containing [InnerChannel]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [InnerChannel] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    SMS,
                    RCS,
                    WHATSAPP,
                    VIBER,
                    ZALO,
                    TELEGRAM,
                    VOICE,
                    SILENT,
                    /**
                     * An enum member indicating that [InnerChannel] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        SMS -> Value.SMS
                        RCS -> Value.RCS
                        WHATSAPP -> Value.WHATSAPP
                        VIBER -> Value.VIBER
                        ZALO -> Value.ZALO
                        TELEGRAM -> Value.TELEGRAM
                        VOICE -> Value.VOICE
                        SILENT -> Value.SILENT
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws PreludeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        SMS -> Known.SMS
                        RCS -> Known.RCS
                        WHATSAPP -> Known.WHATSAPP
                        VIBER -> Known.VIBER
                        ZALO -> Known.ZALO
                        TELEGRAM -> Known.TELEGRAM
                        VOICE -> Known.VOICE
                        SILENT -> Known.SILENT
                        else -> throw PreludeInvalidDataException("Unknown InnerChannel: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws PreludeInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        PreludeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PreludeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): InnerChannel = apply {
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

                    return other is InnerChannel && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Channel &&
                    channel == other.channel &&
                    converted == other.converted &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(channel, converted, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Channel{channel=$channel, converted=$converted, additionalProperties=$additionalProperties}"
        }

        /**
         * The outcome of the verification.
         * * `converted` - The end user submitted a valid code.
         * * `not_converted` - The verification expired without a valid code.
         * * `pending_check` - A code was delivered and Prelude is still waiting for a check.
         * * `sent` - A code was sent and the verification window is still open.
         * * `challenged` - The verification was restricted to non-SMS and non-voice channels.
         * * `suspected_fraud` - The anti-fraud system blocked the verification.
         * * `in_blocklist` - The phone number is on the configured block list.
         * * `invalid_line` - The phone number is not a valid line type.
         * * `invalid_number` - The phone number is not a valid number.
         * * `rate_limited` - The verification was refused by a rate limit.
         * * `expired_signals` - The SDK signals were collected too long before the request to still
         *   attest to it.
         * * `shadowed` - The anti-fraud system flagged the verification without blocking it.
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

                @JvmField val CONVERTED = of("converted")

                @JvmField val NOT_CONVERTED = of("not_converted")

                @JvmField val PENDING_CHECK = of("pending_check")

                @JvmField val SENT = of("sent")

                @JvmField val CHALLENGED = of("challenged")

                @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

                @JvmField val IN_BLOCKLIST = of("in_blocklist")

                @JvmField val INVALID_LINE = of("invalid_line")

                @JvmField val INVALID_NUMBER = of("invalid_number")

                @JvmField val RATE_LIMITED = of("rate_limited")

                @JvmField val EXPIRED_SIGNALS = of("expired_signals")

                @JvmField val SHADOWED = of("shadowed")

                @JvmStatic fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                CONVERTED,
                NOT_CONVERTED,
                PENDING_CHECK,
                SENT,
                CHALLENGED,
                SUSPECTED_FRAUD,
                IN_BLOCKLIST,
                INVALID_LINE,
                INVALID_NUMBER,
                RATE_LIMITED,
                EXPIRED_SIGNALS,
                SHADOWED,
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
                CONVERTED,
                NOT_CONVERTED,
                PENDING_CHECK,
                SENT,
                CHALLENGED,
                SUSPECTED_FRAUD,
                IN_BLOCKLIST,
                INVALID_LINE,
                INVALID_NUMBER,
                RATE_LIMITED,
                EXPIRED_SIGNALS,
                SHADOWED,
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
                    CONVERTED -> Value.CONVERTED
                    NOT_CONVERTED -> Value.NOT_CONVERTED
                    PENDING_CHECK -> Value.PENDING_CHECK
                    SENT -> Value.SENT
                    CHALLENGED -> Value.CHALLENGED
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    IN_BLOCKLIST -> Value.IN_BLOCKLIST
                    INVALID_LINE -> Value.INVALID_LINE
                    INVALID_NUMBER -> Value.INVALID_NUMBER
                    RATE_LIMITED -> Value.RATE_LIMITED
                    EXPIRED_SIGNALS -> Value.EXPIRED_SIGNALS
                    SHADOWED -> Value.SHADOWED
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
                    CONVERTED -> Known.CONVERTED
                    NOT_CONVERTED -> Known.NOT_CONVERTED
                    PENDING_CHECK -> Known.PENDING_CHECK
                    SENT -> Known.SENT
                    CHALLENGED -> Known.CHALLENGED
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    IN_BLOCKLIST -> Known.IN_BLOCKLIST
                    INVALID_LINE -> Known.INVALID_LINE
                    INVALID_NUMBER -> Known.INVALID_NUMBER
                    RATE_LIMITED -> Known.RATE_LIMITED
                    EXPIRED_SIGNALS -> Known.EXPIRED_SIGNALS
                    SHADOWED -> Known.SHADOWED
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PreludeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
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

        /** Platform of the end-user device, when known. */
        class DevicePlatform
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ANDROID = of("android")

                @JvmField val IOS = of("ios")

                @JvmField val IPADOS = of("ipados")

                @JvmField val TVOS = of("tvos")

                @JvmField val WEB = of("web")

                @JvmStatic fun of(value: String) = DevicePlatform(JsonField.of(value))
            }

            /** An enum containing [DevicePlatform]'s known values. */
            enum class Known {
                ANDROID,
                IOS,
                IPADOS,
                TVOS,
                WEB,
            }

            /**
             * An enum containing [DevicePlatform]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DevicePlatform] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ANDROID,
                IOS,
                IPADOS,
                TVOS,
                WEB,
                /**
                 * An enum member indicating that [DevicePlatform] was instantiated with an unknown
                 * value.
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
                    ANDROID -> Value.ANDROID
                    IOS -> Value.IOS
                    IPADOS -> Value.IPADOS
                    TVOS -> Value.TVOS
                    WEB -> Value.WEB
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
                    ANDROID -> Known.ANDROID
                    IOS -> Known.IOS
                    IPADOS -> Known.IPADOS
                    TVOS -> Known.TVOS
                    WEB -> Known.WEB
                    else -> throw PreludeInvalidDataException("Unknown DevicePlatform: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PreludeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): DevicePlatform = apply {
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

                return other is DevicePlatform && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Whether the phone number was allow-listed, block-listed, or sandboxed at verification
         * time.
         */
        class PhoneNumberCondition
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val ALLOW_LISTED = of("allow_listed")

                @JvmField val BLOCK_LISTED = of("block_listed")

                @JvmField val SANDBOXED = of("sandboxed")

                @JvmStatic fun of(value: String) = PhoneNumberCondition(JsonField.of(value))
            }

            /** An enum containing [PhoneNumberCondition]'s known values. */
            enum class Known {
                ALLOW_LISTED,
                BLOCK_LISTED,
                SANDBOXED,
            }

            /**
             * An enum containing [PhoneNumberCondition]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PhoneNumberCondition] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ALLOW_LISTED,
                BLOCK_LISTED,
                SANDBOXED,
                /**
                 * An enum member indicating that [PhoneNumberCondition] was instantiated with an
                 * unknown value.
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
                    ALLOW_LISTED -> Value.ALLOW_LISTED
                    BLOCK_LISTED -> Value.BLOCK_LISTED
                    SANDBOXED -> Value.SANDBOXED
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
                    ALLOW_LISTED -> Known.ALLOW_LISTED
                    BLOCK_LISTED -> Known.BLOCK_LISTED
                    SANDBOXED -> Known.SANDBOXED
                    else ->
                        throw PreludeInvalidDataException("Unknown PhoneNumberCondition: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PreludeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): PhoneNumberCondition = apply {
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

                return other is PhoneNumberCondition && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Whether the SDK signals integrity check passed. */
        class SignalsHashStatus
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val VALID = of("valid")

                @JvmField val INVALID = of("invalid")

                @JvmStatic fun of(value: String) = SignalsHashStatus(JsonField.of(value))
            }

            /** An enum containing [SignalsHashStatus]'s known values. */
            enum class Known {
                VALID,
                INVALID,
            }

            /**
             * An enum containing [SignalsHashStatus]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SignalsHashStatus] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                VALID,
                INVALID,
                /**
                 * An enum member indicating that [SignalsHashStatus] was instantiated with an
                 * unknown value.
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
                    VALID -> Value.VALID
                    INVALID -> Value.INVALID
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
                    VALID -> Known.VALID
                    INVALID -> Known.INVALID
                    else -> throw PreludeInvalidDataException("Unknown SignalsHashStatus: $value")
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

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PreludeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): SignalsHashStatus = apply {
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

                return other is SignalsHashStatus && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Verification &&
                id == other.id &&
                channels == other.channels &&
                createdAt == other.createdAt &&
                delivered == other.delivered &&
                phoneNumber == other.phoneNumber &&
                status == other.status &&
                attempts == other.attempts &&
                convertedAt == other.convertedAt &&
                cost == other.cost &&
                devicePlatform == other.devicePlatform &&
                phoneNumberCondition == other.phoneNumberCondition &&
                signalsHashStatus == other.signalsHashStatus &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                id,
                channels,
                createdAt,
                delivered,
                phoneNumber,
                status,
                attempts,
                convertedAt,
                cost,
                devicePlatform,
                phoneNumberCondition,
                signalsHashStatus,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Verification{id=$id, channels=$channels, createdAt=$createdAt, delivered=$delivered, phoneNumber=$phoneNumber, status=$status, attempts=$attempts, convertedAt=$convertedAt, cost=$cost, devicePlatform=$devicePlatform, phoneNumberCondition=$phoneNumberCondition, signalsHashStatus=$signalsHashStatus, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationPhoneHistoryListResponse &&
            verifications == other.verifications &&
            nextCursor == other.nextCursor &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(verifications, nextCursor, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerificationPhoneHistoryListResponse{verifications=$verifications, nextCursor=$nextCursor, additionalProperties=$additionalProperties}"
}

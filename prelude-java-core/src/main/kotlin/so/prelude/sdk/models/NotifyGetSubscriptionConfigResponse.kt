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
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.checkKnown
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

class NotifyGetSubscriptionConfigResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val callbackUrl: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val messages: JsonField<Messages>,
    private val name: JsonField<String>,
    private val updatedAt: JsonField<OffsetDateTime>,
    private val moPhoneNumbers: JsonField<List<MoPhoneNumber>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("callback_url")
        @ExcludeMissing
        callbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("messages") @ExcludeMissing messages: JsonField<Messages> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("updated_at")
        @ExcludeMissing
        updatedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("mo_phone_numbers")
        @ExcludeMissing
        moPhoneNumbers: JsonField<List<MoPhoneNumber>> = JsonMissing.of(),
    ) : this(id, callbackUrl, createdAt, messages, name, updatedAt, moPhoneNumbers, mutableMapOf())

    /**
     * The subscription configuration ID.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The URL to call when subscription status changes.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun callbackUrl(): String = callbackUrl.getRequired("callback_url")

    /**
     * The date and time when the configuration was created.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The subscription messages configuration.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun messages(): Messages = messages.getRequired("messages")

    /**
     * The human-readable name for the subscription configuration.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun name(): String = name.getRequired("name")

    /**
     * The date and time when the configuration was last updated.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updatedAt(): OffsetDateTime = updatedAt.getRequired("updated_at")

    /**
     * A list of phone numbers for receiving inbound messages.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun moPhoneNumbers(): Optional<List<MoPhoneNumber>> =
        moPhoneNumbers.getOptional("mo_phone_numbers")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [callbackUrl].
     *
     * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callback_url")
    @ExcludeMissing
    fun _callbackUrl(): JsonField<String> = callbackUrl

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [messages].
     *
     * Unlike [messages], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("messages") @ExcludeMissing fun _messages(): JsonField<Messages> = messages

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [updatedAt].
     *
     * Unlike [updatedAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated_at")
    @ExcludeMissing
    fun _updatedAt(): JsonField<OffsetDateTime> = updatedAt

    /**
     * Returns the raw JSON value of [moPhoneNumbers].
     *
     * Unlike [moPhoneNumbers], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mo_phone_numbers")
    @ExcludeMissing
    fun _moPhoneNumbers(): JsonField<List<MoPhoneNumber>> = moPhoneNumbers

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
         * [NotifyGetSubscriptionConfigResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .callbackUrl()
         * .createdAt()
         * .messages()
         * .name()
         * .updatedAt()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotifyGetSubscriptionConfigResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var callbackUrl: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var messages: JsonField<Messages>? = null
        private var name: JsonField<String>? = null
        private var updatedAt: JsonField<OffsetDateTime>? = null
        private var moPhoneNumbers: JsonField<MutableList<MoPhoneNumber>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            notifyGetSubscriptionConfigResponse: NotifyGetSubscriptionConfigResponse
        ) = apply {
            id = notifyGetSubscriptionConfigResponse.id
            callbackUrl = notifyGetSubscriptionConfigResponse.callbackUrl
            createdAt = notifyGetSubscriptionConfigResponse.createdAt
            messages = notifyGetSubscriptionConfigResponse.messages
            name = notifyGetSubscriptionConfigResponse.name
            updatedAt = notifyGetSubscriptionConfigResponse.updatedAt
            moPhoneNumbers =
                notifyGetSubscriptionConfigResponse.moPhoneNumbers.map { it.toMutableList() }
            additionalProperties =
                notifyGetSubscriptionConfigResponse.additionalProperties.toMutableMap()
        }

        /** The subscription configuration ID. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The URL to call when subscription status changes. */
        fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { this.callbackUrl = callbackUrl }

        /** The date and time when the configuration was created. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The subscription messages configuration. */
        fun messages(messages: Messages) = messages(JsonField.of(messages))

        /**
         * Sets [Builder.messages] to an arbitrary JSON value.
         *
         * You should usually call [Builder.messages] with a well-typed [Messages] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun messages(messages: JsonField<Messages>) = apply { this.messages = messages }

        /** The human-readable name for the subscription configuration. */
        fun name(name: String) = name(JsonField.of(name))

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The date and time when the configuration was last updated. */
        fun updatedAt(updatedAt: OffsetDateTime) = updatedAt(JsonField.of(updatedAt))

        /**
         * Sets [Builder.updatedAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updatedAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updatedAt(updatedAt: JsonField<OffsetDateTime>) = apply { this.updatedAt = updatedAt }

        /** A list of phone numbers for receiving inbound messages. */
        fun moPhoneNumbers(moPhoneNumbers: List<MoPhoneNumber>) =
            moPhoneNumbers(JsonField.of(moPhoneNumbers))

        /**
         * Sets [Builder.moPhoneNumbers] to an arbitrary JSON value.
         *
         * You should usually call [Builder.moPhoneNumbers] with a well-typed `List<MoPhoneNumber>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun moPhoneNumbers(moPhoneNumbers: JsonField<List<MoPhoneNumber>>) = apply {
            this.moPhoneNumbers = moPhoneNumbers.map { it.toMutableList() }
        }

        /**
         * Adds a single [MoPhoneNumber] to [moPhoneNumbers].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addMoPhoneNumber(moPhoneNumber: MoPhoneNumber) = apply {
            moPhoneNumbers =
                (moPhoneNumbers ?: JsonField.of(mutableListOf())).also {
                    checkKnown("moPhoneNumbers", it).add(moPhoneNumber)
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
         * Returns an immutable instance of [NotifyGetSubscriptionConfigResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .callbackUrl()
         * .createdAt()
         * .messages()
         * .name()
         * .updatedAt()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotifyGetSubscriptionConfigResponse =
            NotifyGetSubscriptionConfigResponse(
                checkRequired("id", id),
                checkRequired("callbackUrl", callbackUrl),
                checkRequired("createdAt", createdAt),
                checkRequired("messages", messages),
                checkRequired("name", name),
                checkRequired("updatedAt", updatedAt),
                (moPhoneNumbers ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): NotifyGetSubscriptionConfigResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        callbackUrl()
        createdAt()
        messages().validate()
        name()
        updatedAt()
        moPhoneNumbers().ifPresent { it.forEach { it.validate() } }
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (if (callbackUrl.asKnown().isPresent) 1 else 0) +
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (messages.asKnown().getOrNull()?.validity() ?: 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (if (updatedAt.asKnown().isPresent) 1 else 0) +
            (moPhoneNumbers.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    /** The subscription messages configuration. */
    class Messages
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val helpMessage: JsonField<String>,
        private val startMessage: JsonField<String>,
        private val stopMessage: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("help_message")
            @ExcludeMissing
            helpMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("start_message")
            @ExcludeMissing
            startMessage: JsonField<String> = JsonMissing.of(),
            @JsonProperty("stop_message")
            @ExcludeMissing
            stopMessage: JsonField<String> = JsonMissing.of(),
        ) : this(helpMessage, startMessage, stopMessage, mutableMapOf())

        /**
         * Message sent when user requests help.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun helpMessage(): Optional<String> = helpMessage.getOptional("help_message")

        /**
         * Message sent when user subscribes.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun startMessage(): Optional<String> = startMessage.getOptional("start_message")

        /**
         * Message sent when user unsubscribes.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun stopMessage(): Optional<String> = stopMessage.getOptional("stop_message")

        /**
         * Returns the raw JSON value of [helpMessage].
         *
         * Unlike [helpMessage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("help_message")
        @ExcludeMissing
        fun _helpMessage(): JsonField<String> = helpMessage

        /**
         * Returns the raw JSON value of [startMessage].
         *
         * Unlike [startMessage], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("start_message")
        @ExcludeMissing
        fun _startMessage(): JsonField<String> = startMessage

        /**
         * Returns the raw JSON value of [stopMessage].
         *
         * Unlike [stopMessage], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("stop_message")
        @ExcludeMissing
        fun _stopMessage(): JsonField<String> = stopMessage

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

            /** Returns a mutable builder for constructing an instance of [Messages]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Messages]. */
        class Builder internal constructor() {

            private var helpMessage: JsonField<String> = JsonMissing.of()
            private var startMessage: JsonField<String> = JsonMissing.of()
            private var stopMessage: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(messages: Messages) = apply {
                helpMessage = messages.helpMessage
                startMessage = messages.startMessage
                stopMessage = messages.stopMessage
                additionalProperties = messages.additionalProperties.toMutableMap()
            }

            /** Message sent when user requests help. */
            fun helpMessage(helpMessage: String) = helpMessage(JsonField.of(helpMessage))

            /**
             * Sets [Builder.helpMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.helpMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun helpMessage(helpMessage: JsonField<String>) = apply {
                this.helpMessage = helpMessage
            }

            /** Message sent when user subscribes. */
            fun startMessage(startMessage: String) = startMessage(JsonField.of(startMessage))

            /**
             * Sets [Builder.startMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.startMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun startMessage(startMessage: JsonField<String>) = apply {
                this.startMessage = startMessage
            }

            /** Message sent when user unsubscribes. */
            fun stopMessage(stopMessage: String) = stopMessage(JsonField.of(stopMessage))

            /**
             * Sets [Builder.stopMessage] to an arbitrary JSON value.
             *
             * You should usually call [Builder.stopMessage] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun stopMessage(stopMessage: JsonField<String>) = apply {
                this.stopMessage = stopMessage
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
             * Returns an immutable instance of [Messages].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Messages =
                Messages(
                    helpMessage,
                    startMessage,
                    stopMessage,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Messages = apply {
            if (validated) {
                return@apply
            }

            helpMessage()
            startMessage()
            stopMessage()
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
            (if (helpMessage.asKnown().isPresent) 1 else 0) +
                (if (startMessage.asKnown().isPresent) 1 else 0) +
                (if (stopMessage.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Messages &&
                helpMessage == other.helpMessage &&
                startMessage == other.startMessage &&
                stopMessage == other.stopMessage &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(helpMessage, startMessage, stopMessage, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Messages{helpMessage=$helpMessage, startMessage=$startMessage, stopMessage=$stopMessage, additionalProperties=$additionalProperties}"
    }

    class MoPhoneNumber
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val countryCode: JsonField<String>,
        private val phoneNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("country_code")
            @ExcludeMissing
            countryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("phone_number")
            @ExcludeMissing
            phoneNumber: JsonField<String> = JsonMissing.of(),
        ) : this(countryCode, phoneNumber, mutableMapOf())

        /**
         * The ISO 3166-1 alpha-2 country code.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun countryCode(): String = countryCode.getRequired("country_code")

        /**
         * The phone number in E.164 format for long codes, or short code format for short codes.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

        /**
         * Returns the raw JSON value of [countryCode].
         *
         * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("country_code")
        @ExcludeMissing
        fun _countryCode(): JsonField<String> = countryCode

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
             * Returns a mutable builder for constructing an instance of [MoPhoneNumber].
             *
             * The following fields are required:
             * ```java
             * .countryCode()
             * .phoneNumber()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [MoPhoneNumber]. */
        class Builder internal constructor() {

            private var countryCode: JsonField<String>? = null
            private var phoneNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(moPhoneNumber: MoPhoneNumber) = apply {
                countryCode = moPhoneNumber.countryCode
                phoneNumber = moPhoneNumber.phoneNumber
                additionalProperties = moPhoneNumber.additionalProperties.toMutableMap()
            }

            /** The ISO 3166-1 alpha-2 country code. */
            fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

            /**
             * Sets [Builder.countryCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.countryCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun countryCode(countryCode: JsonField<String>) = apply {
                this.countryCode = countryCode
            }

            /**
             * The phone number in E.164 format for long codes, or short code format for short
             * codes.
             */
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
             * Returns an immutable instance of [MoPhoneNumber].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .countryCode()
             * .phoneNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): MoPhoneNumber =
                MoPhoneNumber(
                    checkRequired("countryCode", countryCode),
                    checkRequired("phoneNumber", phoneNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): MoPhoneNumber = apply {
            if (validated) {
                return@apply
            }

            countryCode()
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
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (countryCode.asKnown().isPresent) 1 else 0) +
                (if (phoneNumber.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is MoPhoneNumber &&
                countryCode == other.countryCode &&
                phoneNumber == other.phoneNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(countryCode, phoneNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "MoPhoneNumber{countryCode=$countryCode, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotifyGetSubscriptionConfigResponse &&
            id == other.id &&
            callbackUrl == other.callbackUrl &&
            createdAt == other.createdAt &&
            messages == other.messages &&
            name == other.name &&
            updatedAt == other.updatedAt &&
            moPhoneNumbers == other.moPhoneNumbers &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            callbackUrl,
            createdAt,
            messages,
            name,
            updatedAt,
            moPhoneNumbers,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotifyGetSubscriptionConfigResponse{id=$id, callbackUrl=$callbackUrl, createdAt=$createdAt, messages=$messages, name=$name, updatedAt=$updatedAt, moPhoneNumbers=$moPhoneNumbers, additionalProperties=$additionalProperties}"
}

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
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

class NotifySendResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val templateId: JsonField<String>,
    private val to: JsonField<String>,
    private val variables: JsonField<Variables>,
    private val callbackUrl: JsonField<String>,
    private val correlationId: JsonField<String>,
    private val encoding: JsonField<Encoding>,
    private val estimatedSegmentCount: JsonField<Long>,
    private val from: JsonField<String>,
    private val scheduleAt: JsonField<OffsetDateTime>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("template_id")
        @ExcludeMissing
        templateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variables")
        @ExcludeMissing
        variables: JsonField<Variables> = JsonMissing.of(),
        @JsonProperty("callback_url")
        @ExcludeMissing
        callbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("correlation_id")
        @ExcludeMissing
        correlationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("encoding") @ExcludeMissing encoding: JsonField<Encoding> = JsonMissing.of(),
        @JsonProperty("estimated_segment_count")
        @ExcludeMissing
        estimatedSegmentCount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("schedule_at")
        @ExcludeMissing
        scheduleAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        expiresAt,
        templateId,
        to,
        variables,
        callbackUrl,
        correlationId,
        encoding,
        estimatedSegmentCount,
        from,
        scheduleAt,
        mutableMapOf(),
    )

    /**
     * The message identifier.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The message creation date in RFC3339 format.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The message expiration date in RFC3339 format.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * The template identifier.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateId(): String = templateId.getRequired("template_id")

    /**
     * The recipient's phone number in E.164 format.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = to.getRequired("to")

    /**
     * The variables to be replaced in the template.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun variables(): Variables = variables.getRequired("variables")

    /**
     * The callback URL where webhooks will be sent.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callback_url")

    /**
     * A user-defined identifier to correlate this message with your internal systems.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correlationId(): Optional<String> = correlationId.getOptional("correlation_id")

    /**
     * The SMS encoding type based on message content. GSM-7 supports standard characters (up to 160
     * chars per segment), while UCS-2 supports Unicode including emoji (up to 70 chars per
     * segment). Only present for SMS messages.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun encoding(): Optional<Encoding> = encoding.getOptional("encoding")

    /**
     * The estimated number of SMS segments for this message. This value is not contractual; the
     * actual segment count will be determined after the SMS is sent by the provider. Only present
     * for SMS messages.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun estimatedSegmentCount(): Optional<Long> =
        estimatedSegmentCount.getOptional("estimated_segment_count")

    /**
     * The Sender ID used for this message.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = from.getOptional("from")

    /**
     * When the message will actually be sent in RFC3339 format with timezone offset. For marketing
     * messages, this may differ from the requested schedule_at due to automatic compliance
     * adjustments.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun scheduleAt(): Optional<OffsetDateTime> = scheduleAt.getOptional("schedule_at")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template_id") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("variables") @ExcludeMissing fun _variables(): JsonField<Variables> = variables

    /**
     * Returns the raw JSON value of [callbackUrl].
     *
     * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("callback_url")
    @ExcludeMissing
    fun _callbackUrl(): JsonField<String> = callbackUrl

    /**
     * Returns the raw JSON value of [correlationId].
     *
     * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("correlation_id")
    @ExcludeMissing
    fun _correlationId(): JsonField<String> = correlationId

    /**
     * Returns the raw JSON value of [encoding].
     *
     * Unlike [encoding], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("encoding") @ExcludeMissing fun _encoding(): JsonField<Encoding> = encoding

    /**
     * Returns the raw JSON value of [estimatedSegmentCount].
     *
     * Unlike [estimatedSegmentCount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("estimated_segment_count")
    @ExcludeMissing
    fun _estimatedSegmentCount(): JsonField<Long> = estimatedSegmentCount

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    /**
     * Returns the raw JSON value of [scheduleAt].
     *
     * Unlike [scheduleAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("schedule_at")
    @ExcludeMissing
    fun _scheduleAt(): JsonField<OffsetDateTime> = scheduleAt

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
         * Returns a mutable builder for constructing an instance of [NotifySendResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .expiresAt()
         * .templateId()
         * .to()
         * .variables()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [NotifySendResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var templateId: JsonField<String>? = null
        private var to: JsonField<String>? = null
        private var variables: JsonField<Variables>? = null
        private var callbackUrl: JsonField<String> = JsonMissing.of()
        private var correlationId: JsonField<String> = JsonMissing.of()
        private var encoding: JsonField<Encoding> = JsonMissing.of()
        private var estimatedSegmentCount: JsonField<Long> = JsonMissing.of()
        private var from: JsonField<String> = JsonMissing.of()
        private var scheduleAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(notifySendResponse: NotifySendResponse) = apply {
            id = notifySendResponse.id
            createdAt = notifySendResponse.createdAt
            expiresAt = notifySendResponse.expiresAt
            templateId = notifySendResponse.templateId
            to = notifySendResponse.to
            variables = notifySendResponse.variables
            callbackUrl = notifySendResponse.callbackUrl
            correlationId = notifySendResponse.correlationId
            encoding = notifySendResponse.encoding
            estimatedSegmentCount = notifySendResponse.estimatedSegmentCount
            from = notifySendResponse.from
            scheduleAt = notifySendResponse.scheduleAt
            additionalProperties = notifySendResponse.additionalProperties.toMutableMap()
        }

        /** The message identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The message creation date in RFC3339 format. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The message expiration date in RFC3339 format. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** The template identifier. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /** The recipient's phone number in E.164 format. */
        fun to(to: String) = to(JsonField.of(to))

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** The variables to be replaced in the template. */
        fun variables(variables: Variables) = variables(JsonField.of(variables))

        /**
         * Sets [Builder.variables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variables] with a well-typed [Variables] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun variables(variables: JsonField<Variables>) = apply { this.variables = variables }

        /** The callback URL where webhooks will be sent. */
        fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { this.callbackUrl = callbackUrl }

        /** A user-defined identifier to correlate this message with your internal systems. */
        fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

        /**
         * Sets [Builder.correlationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correlationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correlationId(correlationId: JsonField<String>) = apply {
            this.correlationId = correlationId
        }

        /**
         * The SMS encoding type based on message content. GSM-7 supports standard characters (up to
         * 160 chars per segment), while UCS-2 supports Unicode including emoji (up to 70 chars per
         * segment). Only present for SMS messages.
         */
        fun encoding(encoding: Encoding) = encoding(JsonField.of(encoding))

        /**
         * Sets [Builder.encoding] to an arbitrary JSON value.
         *
         * You should usually call [Builder.encoding] with a well-typed [Encoding] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun encoding(encoding: JsonField<Encoding>) = apply { this.encoding = encoding }

        /**
         * The estimated number of SMS segments for this message. This value is not contractual; the
         * actual segment count will be determined after the SMS is sent by the provider. Only
         * present for SMS messages.
         */
        fun estimatedSegmentCount(estimatedSegmentCount: Long) =
            estimatedSegmentCount(JsonField.of(estimatedSegmentCount))

        /**
         * Sets [Builder.estimatedSegmentCount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.estimatedSegmentCount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun estimatedSegmentCount(estimatedSegmentCount: JsonField<Long>) = apply {
            this.estimatedSegmentCount = estimatedSegmentCount
        }

        /** The Sender ID used for this message. */
        fun from(from: String) = from(JsonField.of(from))

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /**
         * When the message will actually be sent in RFC3339 format with timezone offset. For
         * marketing messages, this may differ from the requested schedule_at due to automatic
         * compliance adjustments.
         */
        fun scheduleAt(scheduleAt: OffsetDateTime) = scheduleAt(JsonField.of(scheduleAt))

        /**
         * Sets [Builder.scheduleAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.scheduleAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun scheduleAt(scheduleAt: JsonField<OffsetDateTime>) = apply {
            this.scheduleAt = scheduleAt
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
         * Returns an immutable instance of [NotifySendResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .expiresAt()
         * .templateId()
         * .to()
         * .variables()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): NotifySendResponse =
            NotifySendResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("templateId", templateId),
                checkRequired("to", to),
                checkRequired("variables", variables),
                callbackUrl,
                correlationId,
                encoding,
                estimatedSegmentCount,
                from,
                scheduleAt,
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
    fun validate(): NotifySendResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        expiresAt()
        templateId()
        to()
        variables().validate()
        callbackUrl()
        correlationId()
        encoding().ifPresent { it.validate() }
        estimatedSegmentCount()
        from()
        scheduleAt()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (templateId.asKnown().isPresent) 1 else 0) +
            (if (to.asKnown().isPresent) 1 else 0) +
            (variables.asKnown().getOrNull()?.validity() ?: 0) +
            (if (callbackUrl.asKnown().isPresent) 1 else 0) +
            (if (correlationId.asKnown().isPresent) 1 else 0) +
            (encoding.asKnown().getOrNull()?.validity() ?: 0) +
            (if (estimatedSegmentCount.asKnown().isPresent) 1 else 0) +
            (if (from.asKnown().isPresent) 1 else 0) +
            (if (scheduleAt.asKnown().isPresent) 1 else 0)

    /** The variables to be replaced in the template. */
    class Variables
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Variables]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Variables]. */
        class Builder internal constructor() {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(variables: Variables) = apply {
                additionalProperties = variables.additionalProperties.toMutableMap()
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
             * Returns an immutable instance of [Variables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Variables = Variables(additionalProperties.toImmutable())
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
        fun validate(): Variables = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Variables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Variables{additionalProperties=$additionalProperties}"
    }

    /**
     * The SMS encoding type based on message content. GSM-7 supports standard characters (up to 160
     * chars per segment), while UCS-2 supports Unicode including emoji (up to 70 chars per
     * segment). Only present for SMS messages.
     */
    class Encoding @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val GSM_7 = of("GSM-7")

            @JvmField val UCS_2 = of("UCS-2")

            @JvmStatic fun of(value: String) = Encoding(JsonField.of(value))
        }

        /** An enum containing [Encoding]'s known values. */
        enum class Known {
            GSM_7,
            UCS_2,
        }

        /**
         * An enum containing [Encoding]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Encoding] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            GSM_7,
            UCS_2,
            /** An enum member indicating that [Encoding] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                GSM_7 -> Value.GSM_7
                UCS_2 -> Value.UCS_2
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws PreludeInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                GSM_7 -> Known.GSM_7
                UCS_2 -> Known.UCS_2
                else -> throw PreludeInvalidDataException("Unknown Encoding: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws PreludeInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { PreludeInvalidDataException("Value is not a String") }

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
        fun validate(): Encoding = apply {
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

            return other is Encoding && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is NotifySendResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            expiresAt == other.expiresAt &&
            templateId == other.templateId &&
            to == other.to &&
            variables == other.variables &&
            callbackUrl == other.callbackUrl &&
            correlationId == other.correlationId &&
            encoding == other.encoding &&
            estimatedSegmentCount == other.estimatedSegmentCount &&
            from == other.from &&
            scheduleAt == other.scheduleAt &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            expiresAt,
            templateId,
            to,
            variables,
            callbackUrl,
            correlationId,
            encoding,
            estimatedSegmentCount,
            from,
            scheduleAt,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "NotifySendResponse{id=$id, createdAt=$createdAt, expiresAt=$expiresAt, templateId=$templateId, to=$to, variables=$variables, callbackUrl=$callbackUrl, correlationId=$correlationId, encoding=$encoding, estimatedSegmentCount=$estimatedSegmentCount, from=$from, scheduleAt=$scheduleAt, additionalProperties=$additionalProperties}"
}

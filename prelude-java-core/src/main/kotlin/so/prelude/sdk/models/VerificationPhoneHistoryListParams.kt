// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonCreator
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull
import so.prelude.sdk.core.Enum
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.Params
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.QueryParams
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

/**
 * List your phone verifications, most recent first, one entry per verification with its outcome,
 * channels, attempts and cost. Every filter is optional and they combine with AND.
 *
 * Use it to find every verification a phone number went through from your support tooling, then
 * [Get a phone verification](/verify/v2/api-reference/history/get-a-phone-verification) for the
 * full timeline of one of them. A cursor is bound to the filters that produced it: pass
 * `next_cursor` back with the exact same query parameters.
 */
class VerificationPhoneHistoryListParams
private constructor(
    private val channels: List<Channel>?,
    private val cursor: String?,
    private val devicePlatform: DevicePlatform?,
    private val from: OffsetDateTime?,
    private val limit: Long?,
    private val maxAttempts: Long?,
    private val minAttempts: Long?,
    private val phoneNumber: String?,
    private val region: String?,
    private val status: Status?,
    private val templateId: String?,
    private val to: OffsetDateTime?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * Only verifications that could use one of these channels. Repeat the parameter for several
     * values.
     */
    fun channels(): Optional<List<Channel>> = Optional.ofNullable(channels)

    /** Pagination cursor from the previous response. */
    fun cursor(): Optional<String> = Optional.ofNullable(cursor)

    /** Only verifications created from this device platform. */
    fun devicePlatform(): Optional<DevicePlatform> = Optional.ofNullable(devicePlatform)

    /**
     * Only verifications created at or after this RFC 3339 timestamp. Goes with `to`, at most 6
     * months apart. Without them the whole history is searched.
     */
    fun from(): Optional<OffsetDateTime> = Optional.ofNullable(from)

    /** Maximum number of verifications to return per page. */
    fun limit(): Optional<Long> = Optional.ofNullable(limit)

    /**
     * Only verifications that sent at most this many messages. `0` keeps the verifications that
     * never sent one.
     */
    fun maxAttempts(): Optional<Long> = Optional.ofNullable(maxAttempts)

    /** Only verifications that sent at least this many messages. */
    fun minAttempts(): Optional<Long> = Optional.ofNullable(minAttempts)

    /** Only verifications targeting this E.164 phone number. The leading `+` may be omitted. */
    fun phoneNumber(): Optional<String> = Optional.ofNullable(phoneNumber)

    /** Only verifications of phone numbers from this region, as an ISO 3166-1 alpha-2 code. */
    fun region(): Optional<String> = Optional.ofNullable(region)

    /** Only verifications in this status. `pending_check` cannot be filtered on. */
    fun status(): Optional<Status> = Optional.ofNullable(status)

    /**
     * Only verifications sent with this template, as returned in `template_id` by
     * [Get a phone verification](/verify/v2/api-reference/history/get-a-phone-verification).
     * Built-in templates (`prelude:*`) cannot be filtered on.
     */
    fun templateId(): Optional<String> = Optional.ofNullable(templateId)

    /** Only verifications created at or before this RFC 3339 timestamp. Goes with `from`. */
    fun to(): Optional<OffsetDateTime> = Optional.ofNullable(to)

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun none(): VerificationPhoneHistoryListParams = builder().build()

        /**
         * Returns a mutable builder for constructing an instance of
         * [VerificationPhoneHistoryListParams].
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationPhoneHistoryListParams]. */
    class Builder internal constructor() {

        private var channels: MutableList<Channel>? = null
        private var cursor: String? = null
        private var devicePlatform: DevicePlatform? = null
        private var from: OffsetDateTime? = null
        private var limit: Long? = null
        private var maxAttempts: Long? = null
        private var minAttempts: Long? = null
        private var phoneNumber: String? = null
        private var region: String? = null
        private var status: Status? = null
        private var templateId: String? = null
        private var to: OffsetDateTime? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(verificationPhoneHistoryListParams: VerificationPhoneHistoryListParams) =
            apply {
                channels = verificationPhoneHistoryListParams.channels?.toMutableList()
                cursor = verificationPhoneHistoryListParams.cursor
                devicePlatform = verificationPhoneHistoryListParams.devicePlatform
                from = verificationPhoneHistoryListParams.from
                limit = verificationPhoneHistoryListParams.limit
                maxAttempts = verificationPhoneHistoryListParams.maxAttempts
                minAttempts = verificationPhoneHistoryListParams.minAttempts
                phoneNumber = verificationPhoneHistoryListParams.phoneNumber
                region = verificationPhoneHistoryListParams.region
                status = verificationPhoneHistoryListParams.status
                templateId = verificationPhoneHistoryListParams.templateId
                to = verificationPhoneHistoryListParams.to
                additionalHeaders = verificationPhoneHistoryListParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    verificationPhoneHistoryListParams.additionalQueryParams.toBuilder()
            }

        /**
         * Only verifications that could use one of these channels. Repeat the parameter for several
         * values.
         */
        fun channels(channels: List<Channel>?) = apply { this.channels = channels?.toMutableList() }

        /** Alias for calling [Builder.channels] with `channels.orElse(null)`. */
        fun channels(channels: Optional<List<Channel>>) = channels(channels.getOrNull())

        /**
         * Adds a single [Channel] to [channels].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addChannel(channel: Channel) = apply {
            channels = (channels ?: mutableListOf()).apply { add(channel) }
        }

        /** Pagination cursor from the previous response. */
        fun cursor(cursor: String?) = apply { this.cursor = cursor }

        /** Alias for calling [Builder.cursor] with `cursor.orElse(null)`. */
        fun cursor(cursor: Optional<String>) = cursor(cursor.getOrNull())

        /** Only verifications created from this device platform. */
        fun devicePlatform(devicePlatform: DevicePlatform?) = apply {
            this.devicePlatform = devicePlatform
        }

        /** Alias for calling [Builder.devicePlatform] with `devicePlatform.orElse(null)`. */
        fun devicePlatform(devicePlatform: Optional<DevicePlatform>) =
            devicePlatform(devicePlatform.getOrNull())

        /**
         * Only verifications created at or after this RFC 3339 timestamp. Goes with `to`, at most 6
         * months apart. Without them the whole history is searched.
         */
        fun from(from: OffsetDateTime?) = apply { this.from = from }

        /** Alias for calling [Builder.from] with `from.orElse(null)`. */
        fun from(from: Optional<OffsetDateTime>) = from(from.getOrNull())

        /** Maximum number of verifications to return per page. */
        fun limit(limit: Long?) = apply { this.limit = limit }

        /**
         * Alias for [Builder.limit].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun limit(limit: Long) = limit(limit as Long?)

        /** Alias for calling [Builder.limit] with `limit.orElse(null)`. */
        fun limit(limit: Optional<Long>) = limit(limit.getOrNull())

        /**
         * Only verifications that sent at most this many messages. `0` keeps the verifications that
         * never sent one.
         */
        fun maxAttempts(maxAttempts: Long?) = apply { this.maxAttempts = maxAttempts }

        /**
         * Alias for [Builder.maxAttempts].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun maxAttempts(maxAttempts: Long) = maxAttempts(maxAttempts as Long?)

        /** Alias for calling [Builder.maxAttempts] with `maxAttempts.orElse(null)`. */
        fun maxAttempts(maxAttempts: Optional<Long>) = maxAttempts(maxAttempts.getOrNull())

        /** Only verifications that sent at least this many messages. */
        fun minAttempts(minAttempts: Long?) = apply { this.minAttempts = minAttempts }

        /**
         * Alias for [Builder.minAttempts].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun minAttempts(minAttempts: Long) = minAttempts(minAttempts as Long?)

        /** Alias for calling [Builder.minAttempts] with `minAttempts.orElse(null)`. */
        fun minAttempts(minAttempts: Optional<Long>) = minAttempts(minAttempts.getOrNull())

        /** Only verifications targeting this E.164 phone number. The leading `+` may be omitted. */
        fun phoneNumber(phoneNumber: String?) = apply { this.phoneNumber = phoneNumber }

        /** Alias for calling [Builder.phoneNumber] with `phoneNumber.orElse(null)`. */
        fun phoneNumber(phoneNumber: Optional<String>) = phoneNumber(phoneNumber.getOrNull())

        /** Only verifications of phone numbers from this region, as an ISO 3166-1 alpha-2 code. */
        fun region(region: String?) = apply { this.region = region }

        /** Alias for calling [Builder.region] with `region.orElse(null)`. */
        fun region(region: Optional<String>) = region(region.getOrNull())

        /** Only verifications in this status. `pending_check` cannot be filtered on. */
        fun status(status: Status?) = apply { this.status = status }

        /** Alias for calling [Builder.status] with `status.orElse(null)`. */
        fun status(status: Optional<Status>) = status(status.getOrNull())

        /**
         * Only verifications sent with this template, as returned in `template_id` by
         * [Get a phone verification](/verify/v2/api-reference/history/get-a-phone-verification).
         * Built-in templates (`prelude:*`) cannot be filtered on.
         */
        fun templateId(templateId: String?) = apply { this.templateId = templateId }

        /** Alias for calling [Builder.templateId] with `templateId.orElse(null)`. */
        fun templateId(templateId: Optional<String>) = templateId(templateId.getOrNull())

        /** Only verifications created at or before this RFC 3339 timestamp. Goes with `from`. */
        fun to(to: OffsetDateTime?) = apply { this.to = to }

        /** Alias for calling [Builder.to] with `to.orElse(null)`. */
        fun to(to: Optional<OffsetDateTime>) = to(to.getOrNull())

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        /**
         * Returns an immutable instance of [VerificationPhoneHistoryListParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): VerificationPhoneHistoryListParams =
            VerificationPhoneHistoryListParams(
                channels?.toImmutable(),
                cursor,
                devicePlatform,
                from,
                limit,
                maxAttempts,
                minAttempts,
                phoneNumber,
                region,
                status,
                templateId,
                to,
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams =
        QueryParams.builder()
            .apply {
                channels?.let { put("channels", it.joinToString(",") { it.toString() }) }
                cursor?.let { put("cursor", it) }
                devicePlatform?.let { put("device_platform", it.toString()) }
                from?.let { put("from", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                limit?.let { put("limit", it.toString()) }
                maxAttempts?.let { put("max_attempts", it.toString()) }
                minAttempts?.let { put("min_attempts", it.toString()) }
                phoneNumber?.let { put("phone_number", it) }
                region?.let { put("region", it) }
                status?.let { put("status", it.toString()) }
                templateId?.let { put("template_id", it) }
                to?.let { put("to", DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(it)) }
                putAll(additionalQueryParams)
            }
            .build()

    class Channel @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val SMS = of("sms")

            @JvmField val RCS = of("rcs")

            @JvmField val WHATSAPP = of("whatsapp")

            @JvmField val VIBER = of("viber")

            @JvmField val ZALO = of("zalo")

            @JvmField val TELEGRAM = of("telegram")

            @JvmField val VOICE = of("voice")

            @JvmField val SILENT = of("silent")

            @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
        }

        /** An enum containing [Channel]'s known values. */
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
         * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Channel] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            /** An enum member indicating that [Channel] was instantiated with an unknown value. */
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws PreludeInvalidDataException if this class instance's value is a not a known
         *   member.
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
                else -> throw PreludeInvalidDataException("Unknown Channel: $value")
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
        fun validate(): Channel = apply {
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

            return other is Channel && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Only verifications created from this device platform. */
    class DevicePlatform @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

    /** Only verifications in this status. `pending_check` cannot be filtered on. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

        return other is VerificationPhoneHistoryListParams &&
            channels == other.channels &&
            cursor == other.cursor &&
            devicePlatform == other.devicePlatform &&
            from == other.from &&
            limit == other.limit &&
            maxAttempts == other.maxAttempts &&
            minAttempts == other.minAttempts &&
            phoneNumber == other.phoneNumber &&
            region == other.region &&
            status == other.status &&
            templateId == other.templateId &&
            to == other.to &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(
            channels,
            cursor,
            devicePlatform,
            from,
            limit,
            maxAttempts,
            minAttempts,
            phoneNumber,
            region,
            status,
            templateId,
            to,
            additionalHeaders,
            additionalQueryParams,
        )

    override fun toString() =
        "VerificationPhoneHistoryListParams{channels=$channels, cursor=$cursor, devicePlatform=$devicePlatform, from=$from, limit=$limit, maxAttempts=$maxAttempts, minAttempts=$minAttempts, phoneNumber=$phoneNumber, region=$region, status=$status, templateId=$templateId, to=$to, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

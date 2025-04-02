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
import so.prelude.sdk.core.Params
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.QueryParams
import so.prelude.sdk.errors.PreludeInvalidDataException

/**
 * Identify trustworthy phone numbers to mitigate fake traffic or traffic involved in fraud and
 * international revenue share fraud (IRSF) patterns. This endpoint must be implemented in
 * conjunction with the `watch/feedback` endpoint.
 */
class WatchPredictParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The verification target. Either a phone number or an email address. To use the email
     * verification feature contact us to discuss your use case.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun target(): Target = body.target()

    /**
     * It is highly recommended that you provide the signals to increase prediction performance.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signals(): Optional<Signals> = body.signals()

    /**
     * Returns the raw JSON value of [target].
     *
     * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _target(): JsonField<Target> = body._target()

    /**
     * Returns the raw JSON value of [signals].
     *
     * Unlike [signals], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signals(): JsonField<Signals> = body._signals()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WatchPredictParams].
         *
         * The following fields are required:
         * ```java
         * .target()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WatchPredictParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(watchPredictParams: WatchPredictParams) = apply {
            body = watchPredictParams.body.toBuilder()
            additionalHeaders = watchPredictParams.additionalHeaders.toBuilder()
            additionalQueryParams = watchPredictParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [target]
         * - [signals]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The verification target. Either a phone number or an email address. To use the email
         * verification feature contact us to discuss your use case.
         */
        fun target(target: Target) = apply { body.target(target) }

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [Target] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<Target>) = apply { body.target(target) }

        /**
         * It is highly recommended that you provide the signals to increase prediction performance.
         */
        fun signals(signals: Signals) = apply { body.signals(signals) }

        /**
         * Sets [Builder.signals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signals] with a well-typed [Signals] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signals(signals: JsonField<Signals>) = apply { body.signals(signals) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

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
         * Returns an immutable instance of [WatchPredictParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .target()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WatchPredictParams =
            WatchPredictParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val target: JsonField<Target>,
        private val signals: JsonField<Signals>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
            @JsonProperty("signals") @ExcludeMissing signals: JsonField<Signals> = JsonMissing.of(),
        ) : this(target, signals, mutableMapOf())

        /**
         * The verification target. Either a phone number or an email address. To use the email
         * verification feature contact us to discuss your use case.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun target(): Target = target.getRequired("target")

        /**
         * It is highly recommended that you provide the signals to increase prediction performance.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signals(): Optional<Signals> = Optional.ofNullable(signals.getNullable("signals"))

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        /**
         * Returns the raw JSON value of [signals].
         *
         * Unlike [signals], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("signals") @ExcludeMissing fun _signals(): JsonField<Signals> = signals

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
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .target()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var target: JsonField<Target>? = null
            private var signals: JsonField<Signals> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                target = body.target
                signals = body.signals
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The verification target. Either a phone number or an email address. To use the email
             * verification feature contact us to discuss your use case.
             */
            fun target(target: Target) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed [Target] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<Target>) = apply { this.target = target }

            /**
             * It is highly recommended that you provide the signals to increase prediction
             * performance.
             */
            fun signals(signals: Signals) = signals(JsonField.of(signals))

            /**
             * Sets [Builder.signals] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signals] with a well-typed [Signals] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signals(signals: JsonField<Signals>) = apply { this.signals = signals }

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
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .target()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(checkRequired("target", target), signals, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            target().validate()
            signals().ifPresent { it.validate() }
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
            (target.asKnown().getOrNull()?.validity() ?: 0) +
                (signals.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && target == other.target && signals == other.signals && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(target, signals, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{target=$target, signals=$signals, additionalProperties=$additionalProperties}"
    }

    /**
     * The verification target. Either a phone number or an email address. To use the email
     * verification feature contact us to discuss your use case.
     */
    class Target
    private constructor(
        private val type: JsonField<Type>,
        private val value: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
        ) : this(type, value, mutableMapOf())

        /**
         * The type of the target. Either "phone_number" or "email_address".
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * An E.164 formatted phone number or an email address.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun value(): String = value.getRequired("value")

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [value].
         *
         * Unlike [value], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

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
             * Returns a mutable builder for constructing an instance of [Target].
             *
             * The following fields are required:
             * ```java
             * .type()
             * .value()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Target]. */
        class Builder internal constructor() {

            private var type: JsonField<Type>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(target: Target) = apply {
                type = target.type
                value = target.value
                additionalProperties = target.additionalProperties.toMutableMap()
            }

            /** The type of the target. Either "phone_number" or "email_address". */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** An E.164 formatted phone number or an email address. */
            fun value(value: String) = value(JsonField.of(value))

            /**
             * Sets [Builder.value] to an arbitrary JSON value.
             *
             * You should usually call [Builder.value] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun value(value: JsonField<String>) = apply { this.value = value }

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
             * Returns an immutable instance of [Target].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .type()
             * .value()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Target =
                Target(
                    checkRequired("type", type),
                    checkRequired("value", value),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Target = apply {
            if (validated) {
                return@apply
            }

            type().validate()
            value()
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
            (type.asKnown().getOrNull()?.validity() ?: 0) +
                (if (value.asKnown().isPresent) 1 else 0)

        /** The type of the target. Either "phone_number" or "email_address". */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val PHONE_NUMBER = of("phone_number")

                @JvmField val EMAIL_ADDRESS = of("email_address")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PHONE_NUMBER,
                EMAIL_ADDRESS,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PHONE_NUMBER,
                EMAIL_ADDRESS,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    PHONE_NUMBER -> Value.PHONE_NUMBER
                    EMAIL_ADDRESS -> Value.EMAIL_ADDRESS
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
                    PHONE_NUMBER -> Known.PHONE_NUMBER
                    EMAIL_ADDRESS -> Known.EMAIL_ADDRESS
                    else -> throw PreludeInvalidDataException("Unknown Type: $value")
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

            fun validate(): Type = apply {
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

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Target && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Target{type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /** It is highly recommended that you provide the signals to increase prediction performance. */
    class Signals
    private constructor(
        private val deviceId: JsonField<String>,
        private val deviceModel: JsonField<String>,
        private val deviceType: JsonField<String>,
        private val ip: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("device_id")
            @ExcludeMissing
            deviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("device_model")
            @ExcludeMissing
            deviceModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("device_type")
            @ExcludeMissing
            deviceType: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
        ) : this(deviceId, deviceModel, deviceType, ip, mutableMapOf())

        /**
         * The unique identifier for the user's device. For Android, this corresponds to the
         * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceId(): Optional<String> = Optional.ofNullable(deviceId.getNullable("device_id"))

        /**
         * The model of the user's device.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceModel(): Optional<String> =
            Optional.ofNullable(deviceModel.getNullable("device_model"))

        /**
         * The type of the user's device.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceType(): Optional<String> =
            Optional.ofNullable(deviceType.getNullable("device_type"))

        /**
         * The IPv4 address of the user's device
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ip(): Optional<String> = Optional.ofNullable(ip.getNullable("ip"))

        /**
         * Returns the raw JSON value of [deviceId].
         *
         * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

        /**
         * Returns the raw JSON value of [deviceModel].
         *
         * Unlike [deviceModel], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_model")
        @ExcludeMissing
        fun _deviceModel(): JsonField<String> = deviceModel

        /**
         * Returns the raw JSON value of [deviceType].
         *
         * Unlike [deviceType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_type")
        @ExcludeMissing
        fun _deviceType(): JsonField<String> = deviceType

        /**
         * Returns the raw JSON value of [ip].
         *
         * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

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

            /** Returns a mutable builder for constructing an instance of [Signals]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Signals]. */
        class Builder internal constructor() {

            private var deviceId: JsonField<String> = JsonMissing.of()
            private var deviceModel: JsonField<String> = JsonMissing.of()
            private var deviceType: JsonField<String> = JsonMissing.of()
            private var ip: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signals: Signals) = apply {
                deviceId = signals.deviceId
                deviceModel = signals.deviceModel
                deviceType = signals.deviceType
                ip = signals.ip
                additionalProperties = signals.additionalProperties.toMutableMap()
            }

            /**
             * The unique identifier for the user's device. For Android, this corresponds to the
             * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
             */
            fun deviceId(deviceId: String) = deviceId(JsonField.of(deviceId))

            /**
             * Sets [Builder.deviceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

            /** The model of the user's device. */
            fun deviceModel(deviceModel: String) = deviceModel(JsonField.of(deviceModel))

            /**
             * Sets [Builder.deviceModel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceModel] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceModel(deviceModel: JsonField<String>) = apply {
                this.deviceModel = deviceModel
            }

            /** The type of the user's device. */
            fun deviceType(deviceType: String) = deviceType(JsonField.of(deviceType))

            /**
             * Sets [Builder.deviceType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceType] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceType(deviceType: JsonField<String>) = apply { this.deviceType = deviceType }

            /** The IPv4 address of the user's device */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /**
             * Sets [Builder.ip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

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
             * Returns an immutable instance of [Signals].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Signals =
                Signals(deviceId, deviceModel, deviceType, ip, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Signals = apply {
            if (validated) {
                return@apply
            }

            deviceId()
            deviceModel()
            deviceType()
            ip()
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
            (if (deviceId.asKnown().isPresent) 1 else 0) +
                (if (deviceModel.asKnown().isPresent) 1 else 0) +
                (if (deviceType.asKnown().isPresent) 1 else 0) +
                (if (ip.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Signals && deviceId == other.deviceId && deviceModel == other.deviceModel && deviceType == other.deviceType && ip == other.ip && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(deviceId, deviceModel, deviceType, ip, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Signals{deviceId=$deviceId, deviceModel=$deviceModel, deviceType=$deviceType, ip=$ip, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WatchPredictParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "WatchPredictParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

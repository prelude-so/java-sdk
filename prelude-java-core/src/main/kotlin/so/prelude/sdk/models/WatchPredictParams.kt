// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import so.prelude.sdk.core.Enum
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.QueryParams
import so.prelude.sdk.core.immutableEmptyMap
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

/**
 * Identify trustworthy phone numbers to mitigate fake traffic or traffic involved in fraud and
 * international revenue share fraud (IRSF) patterns. This endpoint must be implemented in
 * conjunction with the `watch/feedback` endpoint.
 */
class WatchPredictParams
constructor(
    private val body: WatchPredictBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The target. Currently this can only be an E.164 formatted phone number. */
    fun target(): Target = body.target()

    /** It is highly recommended that you provide the signals to increase prediction performance. */
    fun signals(): Optional<Signals> = body.signals()

    /** The target. Currently this can only be an E.164 formatted phone number. */
    fun _target(): JsonField<Target> = body._target()

    /** It is highly recommended that you provide the signals to increase prediction performance. */
    fun _signals(): JsonField<Signals> = body._signals()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): WatchPredictBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class WatchPredictBody
    @JsonCreator
    internal constructor(
        @JsonProperty("target")
        @ExcludeMissing
        private val target: JsonField<Target> = JsonMissing.of(),
        @JsonProperty("signals")
        @ExcludeMissing
        private val signals: JsonField<Signals> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The target. Currently this can only be an E.164 formatted phone number. */
        fun target(): Target = target.getRequired("target")

        /**
         * It is highly recommended that you provide the signals to increase prediction performance.
         */
        fun signals(): Optional<Signals> = Optional.ofNullable(signals.getNullable("signals"))

        /** The target. Currently this can only be an E.164 formatted phone number. */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        /**
         * It is highly recommended that you provide the signals to increase prediction performance.
         */
        @JsonProperty("signals") @ExcludeMissing fun _signals(): JsonField<Signals> = signals

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): WatchPredictBody = apply {
            if (validated) {
                return@apply
            }

            target().validate()
            signals().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var target: JsonField<Target>? = null
            private var signals: JsonField<Signals> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(watchPredictBody: WatchPredictBody) = apply {
                target = watchPredictBody.target
                signals = watchPredictBody.signals
                additionalProperties = watchPredictBody.additionalProperties.toMutableMap()
            }

            /** The target. Currently this can only be an E.164 formatted phone number. */
            fun target(target: Target) = target(JsonField.of(target))

            /** The target. Currently this can only be an E.164 formatted phone number. */
            fun target(target: JsonField<Target>) = apply { this.target = target }

            /**
             * It is highly recommended that you provide the signals to increase prediction
             * performance.
             */
            fun signals(signals: Signals) = signals(JsonField.of(signals))

            /**
             * It is highly recommended that you provide the signals to increase prediction
             * performance.
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

            fun build(): WatchPredictBody =
                WatchPredictBody(
                    checkRequired("target", target),
                    signals,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WatchPredictBody && target == other.target && signals == other.signals && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(target, signals, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "WatchPredictBody{target=$target, signals=$signals, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: WatchPredictBody.Builder = WatchPredictBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(watchPredictParams: WatchPredictParams) = apply {
            body = watchPredictParams.body.toBuilder()
            additionalHeaders = watchPredictParams.additionalHeaders.toBuilder()
            additionalQueryParams = watchPredictParams.additionalQueryParams.toBuilder()
        }

        /** The target. Currently this can only be an E.164 formatted phone number. */
        fun target(target: Target) = apply { body.target(target) }

        /** The target. Currently this can only be an E.164 formatted phone number. */
        fun target(target: JsonField<Target>) = apply { body.target(target) }

        /**
         * It is highly recommended that you provide the signals to increase prediction performance.
         */
        fun signals(signals: Signals) = apply { body.signals(signals) }

        /**
         * It is highly recommended that you provide the signals to increase prediction performance.
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

        fun build(): WatchPredictParams =
            WatchPredictParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The target. Currently this can only be an E.164 formatted phone number. */
    @NoAutoDetect
    class Target
    @JsonCreator
    private constructor(
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("value")
        @ExcludeMissing
        private val value: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of the target. Currently this can only be "phone_number". */
        fun type(): Type = type.getRequired("type")

        /** An E.164 formatted phone number to verify. */
        fun value(): String = value.getRequired("value")

        /** The type of the target. Currently this can only be "phone_number". */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /** An E.164 formatted phone number to verify. */
        @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Target = apply {
            if (validated) {
                return@apply
            }

            type()
            value()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: JsonField<Type>? = null
            private var value: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(target: Target) = apply {
                type = target.type
                value = target.value
                additionalProperties = target.additionalProperties.toMutableMap()
            }

            /** The type of the target. Currently this can only be "phone_number". */
            fun type(type: Type) = type(JsonField.of(type))

            /** The type of the target. Currently this can only be "phone_number". */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            /** An E.164 formatted phone number to verify. */
            fun value(value: String) = value(JsonField.of(value))

            /** An E.164 formatted phone number to verify. */
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

            fun build(): Target =
                Target(
                    checkRequired("type", type),
                    checkRequired("value", value),
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PHONE_NUMBER = of("phone_number")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                PHONE_NUMBER,
            }

            enum class Value {
                PHONE_NUMBER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PHONE_NUMBER -> Value.PHONE_NUMBER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PHONE_NUMBER -> Known.PHONE_NUMBER
                    else -> throw PreludeInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
    @NoAutoDetect
    class Signals
    @JsonCreator
    private constructor(
        @JsonProperty("device_id")
        @ExcludeMissing
        private val deviceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_model")
        @ExcludeMissing
        private val deviceModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_type")
        @ExcludeMissing
        private val deviceType: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ip") @ExcludeMissing private val ip: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The unique identifier for the user's device. For Android, this corresponds to the
         * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
         */
        fun deviceId(): Optional<String> = Optional.ofNullable(deviceId.getNullable("device_id"))

        /** The model of the user's device. */
        fun deviceModel(): Optional<String> =
            Optional.ofNullable(deviceModel.getNullable("device_model"))

        /** The type of the user's device. */
        fun deviceType(): Optional<String> =
            Optional.ofNullable(deviceType.getNullable("device_type"))

        /** The IPv4 address of the user's device */
        fun ip(): Optional<String> = Optional.ofNullable(ip.getNullable("ip"))

        /**
         * The unique identifier for the user's device. For Android, this corresponds to the
         * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
         */
        @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

        /** The model of the user's device. */
        @JsonProperty("device_model")
        @ExcludeMissing
        fun _deviceModel(): JsonField<String> = deviceModel

        /** The type of the user's device. */
        @JsonProperty("device_type")
        @ExcludeMissing
        fun _deviceType(): JsonField<String> = deviceType

        /** The IPv4 address of the user's device */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

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
             * The unique identifier for the user's device. For Android, this corresponds to the
             * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
             */
            fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

            /** The model of the user's device. */
            fun deviceModel(deviceModel: String) = deviceModel(JsonField.of(deviceModel))

            /** The model of the user's device. */
            fun deviceModel(deviceModel: JsonField<String>) = apply {
                this.deviceModel = deviceModel
            }

            /** The type of the user's device. */
            fun deviceType(deviceType: String) = deviceType(JsonField.of(deviceType))

            /** The type of the user's device. */
            fun deviceType(deviceType: JsonField<String>) = apply { this.deviceType = deviceType }

            /** The IPv4 address of the user's device */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /** The IPv4 address of the user's device */
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

            fun build(): Signals =
                Signals(
                    deviceId,
                    deviceModel,
                    deviceType,
                    ip,
                    additionalProperties.toImmutable(),
                )
        }

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

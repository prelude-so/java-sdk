// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import so.prelude.sdk.core.Enum
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.QueryParams
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException
import so.prelude.sdk.models.*

class WatchPredictParams
constructor(
    private val target: Target,
    private val signals: Signals?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun target(): Target = target

    fun signals(): Optional<Signals> = Optional.ofNullable(signals)

    @JvmSynthetic
    internal fun getBody(): WatchPredictBody {
        return WatchPredictBody(
            target,
            signals,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = WatchPredictBody.Builder::class)
    @NoAutoDetect
    class WatchPredictBody
    internal constructor(
        private val target: Target?,
        private val signals: Signals?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The target. Currently this can only be an E.164 formatted phone number. */
        @JsonProperty("target") fun target(): Target? = target

        /**
         * It is highly recommended that you provide the signals to increase prediction performance.
         */
        @JsonProperty("signals") fun signals(): Signals? = signals

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var target: Target? = null
            private var signals: Signals? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(watchPredictBody: WatchPredictBody) = apply {
                this.target = watchPredictBody.target
                this.signals = watchPredictBody.signals
                additionalProperties(watchPredictBody.additionalProperties)
            }

            /** The target. Currently this can only be an E.164 formatted phone number. */
            @JsonProperty("target") fun target(target: Target) = apply { this.target = target }

            /**
             * It is highly recommended that you provide the signals to increase prediction
             * performance.
             */
            @JsonProperty("signals")
            fun signals(signals: Signals) = apply { this.signals = signals }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): WatchPredictBody =
                WatchPredictBody(
                    checkNotNull(target) { "`target` is required but was not set" },
                    signals,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is WatchPredictBody && this.target == other.target && this.signals == other.signals && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(target, signals, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "WatchPredictBody{target=$target, signals=$signals, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WatchPredictParams && this.target == other.target && this.signals == other.signals && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(target, signals, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "WatchPredictParams{target=$target, signals=$signals, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var target: Target? = null
        private var signals: Signals? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(watchPredictParams: WatchPredictParams) = apply {
            this.target = watchPredictParams.target
            this.signals = watchPredictParams.signals
            additionalHeaders(watchPredictParams.additionalHeaders)
            additionalQueryParams(watchPredictParams.additionalQueryParams)
            additionalBodyProperties(watchPredictParams.additionalBodyProperties)
        }

        /** The target. Currently this can only be an E.164 formatted phone number. */
        fun target(target: Target) = apply { this.target = target }

        /**
         * It is highly recommended that you provide the signals to increase prediction performance.
         */
        fun signals(signals: Signals) = apply { this.signals = signals }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): WatchPredictParams =
            WatchPredictParams(
                checkNotNull(target) { "`target` is required but was not set" },
                signals,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** The target. Currently this can only be an E.164 formatted phone number. */
    @JsonDeserialize(builder = Target.Builder::class)
    @NoAutoDetect
    class Target
    private constructor(
        private val type: Type?,
        private val value: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The type of the target. Currently this can only be "phone_number". */
        @JsonProperty("type") fun type(): Type? = type

        /** An E.164 formatted phone number to verify. */
        @JsonProperty("value") fun value(): String? = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(target: Target) = apply {
                this.type = target.type
                this.value = target.value
                additionalProperties(target.additionalProperties)
            }

            /** The type of the target. Currently this can only be "phone_number". */
            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /** An E.164 formatted phone number to verify. */
            @JsonProperty("value") fun value(value: String) = apply { this.value = value }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Target =
                Target(
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PHONE_NUMBER = Type(JsonField.of("phone_number"))

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
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Target && this.type == other.type && this.value == other.value && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(type, value, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Target{type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /** It is highly recommended that you provide the signals to increase prediction performance. */
    @JsonDeserialize(builder = Signals.Builder::class)
    @NoAutoDetect
    class Signals
    private constructor(
        private val ip: String?,
        private val deviceId: String?,
        private val deviceType: String?,
        private val deviceModel: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The IPv4 address of the user's device */
        @JsonProperty("ip") fun ip(): String? = ip

        /**
         * The unique identifier for the user's device. For Android, this corresponds to the
         * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
         */
        @JsonProperty("device_id") fun deviceId(): String? = deviceId

        /** The type of the user's device. */
        @JsonProperty("device_type") fun deviceType(): String? = deviceType

        /** The model of the user's device. */
        @JsonProperty("device_model") fun deviceModel(): String? = deviceModel

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var ip: String? = null
            private var deviceId: String? = null
            private var deviceType: String? = null
            private var deviceModel: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signals: Signals) = apply {
                this.ip = signals.ip
                this.deviceId = signals.deviceId
                this.deviceType = signals.deviceType
                this.deviceModel = signals.deviceModel
                additionalProperties(signals.additionalProperties)
            }

            /** The IPv4 address of the user's device */
            @JsonProperty("ip") fun ip(ip: String) = apply { this.ip = ip }

            /**
             * The unique identifier for the user's device. For Android, this corresponds to the
             * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
             */
            @JsonProperty("device_id")
            fun deviceId(deviceId: String) = apply { this.deviceId = deviceId }

            /** The type of the user's device. */
            @JsonProperty("device_type")
            fun deviceType(deviceType: String) = apply { this.deviceType = deviceType }

            /** The model of the user's device. */
            @JsonProperty("device_model")
            fun deviceModel(deviceModel: String) = apply { this.deviceModel = deviceModel }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Signals =
                Signals(
                    ip,
                    deviceId,
                    deviceType,
                    deviceModel,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Signals && this.ip == other.ip && this.deviceId == other.deviceId && this.deviceType == other.deviceType && this.deviceModel == other.deviceModel && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(ip, deviceId, deviceType, deviceModel, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Signals{ip=$ip, deviceId=$deviceId, deviceType=$deviceType, deviceModel=$deviceModel, additionalProperties=$additionalProperties}"
    }
}

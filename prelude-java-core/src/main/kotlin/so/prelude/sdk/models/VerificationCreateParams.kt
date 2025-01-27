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
 * Create a new verification for a specific phone number. If another non-expired verification exists
 * (the request is performed within the verification window), this endpoint will perform a retry
 * instead.
 */
class VerificationCreateParams
private constructor(
    private val body: VerificationCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The target. Currently this can only be an E.164 formatted phone number. */
    fun target(): Target = body.target()

    /** The identifier of the dispatch that came from the front-end SDK. */
    fun dispatchId(): Optional<String> = body.dispatchId()

    /**
     * The metadata for this verification. This object will be returned with every response or
     * webhook sent that refers to this verification.
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /** Verification options */
    fun options(): Optional<Options> = body.options()

    /** The signals used for anti-fraud. */
    fun signals(): Optional<Signals> = body.signals()

    /** The target. Currently this can only be an E.164 formatted phone number. */
    fun _target(): JsonField<Target> = body._target()

    /** The identifier of the dispatch that came from the front-end SDK. */
    fun _dispatchId(): JsonField<String> = body._dispatchId()

    /**
     * The metadata for this verification. This object will be returned with every response or
     * webhook sent that refers to this verification.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /** Verification options */
    fun _options(): JsonField<Options> = body._options()

    /** The signals used for anti-fraud. */
    fun _signals(): JsonField<Signals> = body._signals()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun getBody(): VerificationCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class VerificationCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("target")
        @ExcludeMissing
        private val target: JsonField<Target> = JsonMissing.of(),
        @JsonProperty("dispatch_id")
        @ExcludeMissing
        private val dispatchId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("metadata")
        @ExcludeMissing
        private val metadata: JsonField<Metadata> = JsonMissing.of(),
        @JsonProperty("options")
        @ExcludeMissing
        private val options: JsonField<Options> = JsonMissing.of(),
        @JsonProperty("signals")
        @ExcludeMissing
        private val signals: JsonField<Signals> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The target. Currently this can only be an E.164 formatted phone number. */
        fun target(): Target = target.getRequired("target")

        /** The identifier of the dispatch that came from the front-end SDK. */
        fun dispatchId(): Optional<String> =
            Optional.ofNullable(dispatchId.getNullable("dispatch_id"))

        /**
         * The metadata for this verification. This object will be returned with every response or
         * webhook sent that refers to this verification.
         */
        fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

        /** Verification options */
        fun options(): Optional<Options> = Optional.ofNullable(options.getNullable("options"))

        /** The signals used for anti-fraud. */
        fun signals(): Optional<Signals> = Optional.ofNullable(signals.getNullable("signals"))

        /** The target. Currently this can only be an E.164 formatted phone number. */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        /** The identifier of the dispatch that came from the front-end SDK. */
        @JsonProperty("dispatch_id")
        @ExcludeMissing
        fun _dispatchId(): JsonField<String> = dispatchId

        /**
         * The metadata for this verification. This object will be returned with every response or
         * webhook sent that refers to this verification.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

        /** Verification options */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

        /** The signals used for anti-fraud. */
        @JsonProperty("signals") @ExcludeMissing fun _signals(): JsonField<Signals> = signals

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): VerificationCreateBody = apply {
            if (validated) {
                return@apply
            }

            target().validate()
            dispatchId()
            metadata().ifPresent { it.validate() }
            options().ifPresent { it.validate() }
            signals().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [VerificationCreateBody]. */
        class Builder internal constructor() {

            private var target: JsonField<Target>? = null
            private var dispatchId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var options: JsonField<Options> = JsonMissing.of()
            private var signals: JsonField<Signals> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verificationCreateBody: VerificationCreateBody) = apply {
                target = verificationCreateBody.target
                dispatchId = verificationCreateBody.dispatchId
                metadata = verificationCreateBody.metadata
                options = verificationCreateBody.options
                signals = verificationCreateBody.signals
                additionalProperties = verificationCreateBody.additionalProperties.toMutableMap()
            }

            /** The target. Currently this can only be an E.164 formatted phone number. */
            fun target(target: Target) = target(JsonField.of(target))

            /** The target. Currently this can only be an E.164 formatted phone number. */
            fun target(target: JsonField<Target>) = apply { this.target = target }

            /** The identifier of the dispatch that came from the front-end SDK. */
            fun dispatchId(dispatchId: String) = dispatchId(JsonField.of(dispatchId))

            /** The identifier of the dispatch that came from the front-end SDK. */
            fun dispatchId(dispatchId: JsonField<String>) = apply { this.dispatchId = dispatchId }

            /**
             * The metadata for this verification. This object will be returned with every response
             * or webhook sent that refers to this verification.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * The metadata for this verification. This object will be returned with every response
             * or webhook sent that refers to this verification.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Verification options */
            fun options(options: Options) = options(JsonField.of(options))

            /** Verification options */
            fun options(options: JsonField<Options>) = apply { this.options = options }

            /** The signals used for anti-fraud. */
            fun signals(signals: Signals) = signals(JsonField.of(signals))

            /** The signals used for anti-fraud. */
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

            fun build(): VerificationCreateBody =
                VerificationCreateBody(
                    checkRequired("target", target),
                    dispatchId,
                    metadata,
                    options,
                    signals,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationCreateBody && target == other.target && dispatchId == other.dispatchId && metadata == other.metadata && options == other.options && signals == other.signals && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(target, dispatchId, metadata, options, signals, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerificationCreateBody{target=$target, dispatchId=$dispatchId, metadata=$metadata, options=$options, signals=$signals, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: VerificationCreateBody.Builder = VerificationCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(verificationCreateParams: VerificationCreateParams) = apply {
            body = verificationCreateParams.body.toBuilder()
            additionalHeaders = verificationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = verificationCreateParams.additionalQueryParams.toBuilder()
        }

        /** The target. Currently this can only be an E.164 formatted phone number. */
        fun target(target: Target) = apply { body.target(target) }

        /** The target. Currently this can only be an E.164 formatted phone number. */
        fun target(target: JsonField<Target>) = apply { body.target(target) }

        /** The identifier of the dispatch that came from the front-end SDK. */
        fun dispatchId(dispatchId: String) = apply { body.dispatchId(dispatchId) }

        /** The identifier of the dispatch that came from the front-end SDK. */
        fun dispatchId(dispatchId: JsonField<String>) = apply { body.dispatchId(dispatchId) }

        /**
         * The metadata for this verification. This object will be returned with every response or
         * webhook sent that refers to this verification.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * The metadata for this verification. This object will be returned with every response or
         * webhook sent that refers to this verification.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Verification options */
        fun options(options: Options) = apply { body.options(options) }

        /** Verification options */
        fun options(options: JsonField<Options>) = apply { body.options(options) }

        /** The signals used for anti-fraud. */
        fun signals(signals: Signals) = apply { body.signals(signals) }

        /** The signals used for anti-fraud. */
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

        fun build(): VerificationCreateParams =
            VerificationCreateParams(
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

        /** The type of the target. Currently this can only be "phone_number". */
        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                PHONE_NUMBER,
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

    /**
     * The metadata for this verification. This object will be returned with every response or
     * webhook sent that refers to this verification.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonProperty("correlation_id")
        @ExcludeMissing
        private val correlationId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A user-defined identifier to correlate this verification with. */
        fun correlationId(): Optional<String> =
            Optional.ofNullable(correlationId.getNullable("correlation_id"))

        /** A user-defined identifier to correlate this verification with. */
        @JsonProperty("correlation_id")
        @ExcludeMissing
        fun _correlationId(): JsonField<String> = correlationId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            correlationId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Metadata]. */
        class Builder internal constructor() {

            private var correlationId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                correlationId = metadata.correlationId
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /** A user-defined identifier to correlate this verification with. */
            fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

            /** A user-defined identifier to correlate this verification with. */
            fun correlationId(correlationId: JsonField<String>) = apply {
                this.correlationId = correlationId
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

            fun build(): Metadata = Metadata(correlationId, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && correlationId == other.correlationId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(correlationId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{correlationId=$correlationId, additionalProperties=$additionalProperties}"
    }

    /** Verification options */
    @NoAutoDetect
    class Options
    @JsonCreator
    private constructor(
        @JsonProperty("app_realm")
        @ExcludeMissing
        private val appRealm: JsonField<AppRealm> = JsonMissing.of(),
        @JsonProperty("code_size")
        @ExcludeMissing
        private val codeSize: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("custom_code")
        @ExcludeMissing
        private val customCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("locale")
        @ExcludeMissing
        private val locale: JsonField<String> = JsonMissing.of(),
        @JsonProperty("sender_id")
        @ExcludeMissing
        private val senderId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("template_id")
        @ExcludeMissing
        private val templateId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * This allows you to automatically retrieve and fill the OTP code on mobile apps. Currently
         * only Android devices are supported.
         */
        fun appRealm(): Optional<AppRealm> = Optional.ofNullable(appRealm.getNullable("app_realm"))

        /**
         * The size of the code generated. It should be between 4 and 8. Defaults to the code size
         * specified from the Dashboard.
         */
        fun codeSize(): Optional<Long> = Optional.ofNullable(codeSize.getNullable("code_size"))

        /**
         * The custom code to use for OTP verification. This feature is only available for
         * compatibility purposes and subject to Prelude’s approval. Contact us to discuss your use
         * case.
         */
        fun customCode(): Optional<String> =
            Optional.ofNullable(customCode.getNullable("custom_code"))

        /**
         * A BCP-47 formatted locale string with the language the text message will be sent to. If
         * there's no locale set, the language will be determined by the country code of the phone
         * number. If the language specified doesn't exist, it defaults to US English.
         */
        fun locale(): Optional<String> = Optional.ofNullable(locale.getNullable("locale"))

        /** The Sender ID to use for this message. The Sender ID needs to be enabled by Prelude. */
        fun senderId(): Optional<String> = Optional.ofNullable(senderId.getNullable("sender_id"))

        /**
         * The identifier of a verification settings template. It is used to be able to switch
         * behavior for specific use cases. Contact us if you need to use this functionality.
         */
        fun templateId(): Optional<String> =
            Optional.ofNullable(templateId.getNullable("template_id"))

        /**
         * This allows you to automatically retrieve and fill the OTP code on mobile apps. Currently
         * only Android devices are supported.
         */
        @JsonProperty("app_realm") @ExcludeMissing fun _appRealm(): JsonField<AppRealm> = appRealm

        /**
         * The size of the code generated. It should be between 4 and 8. Defaults to the code size
         * specified from the Dashboard.
         */
        @JsonProperty("code_size") @ExcludeMissing fun _codeSize(): JsonField<Long> = codeSize

        /**
         * The custom code to use for OTP verification. This feature is only available for
         * compatibility purposes and subject to Prelude’s approval. Contact us to discuss your use
         * case.
         */
        @JsonProperty("custom_code")
        @ExcludeMissing
        fun _customCode(): JsonField<String> = customCode

        /**
         * A BCP-47 formatted locale string with the language the text message will be sent to. If
         * there's no locale set, the language will be determined by the country code of the phone
         * number. If the language specified doesn't exist, it defaults to US English.
         */
        @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

        /** The Sender ID to use for this message. The Sender ID needs to be enabled by Prelude. */
        @JsonProperty("sender_id") @ExcludeMissing fun _senderId(): JsonField<String> = senderId

        /**
         * The identifier of a verification settings template. It is used to be able to switch
         * behavior for specific use cases. Contact us if you need to use this functionality.
         */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun _templateId(): JsonField<String> = templateId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Options = apply {
            if (validated) {
                return@apply
            }

            appRealm().ifPresent { it.validate() }
            codeSize()
            customCode()
            locale()
            senderId()
            templateId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Options]. */
        class Builder internal constructor() {

            private var appRealm: JsonField<AppRealm> = JsonMissing.of()
            private var codeSize: JsonField<Long> = JsonMissing.of()
            private var customCode: JsonField<String> = JsonMissing.of()
            private var locale: JsonField<String> = JsonMissing.of()
            private var senderId: JsonField<String> = JsonMissing.of()
            private var templateId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                appRealm = options.appRealm
                codeSize = options.codeSize
                customCode = options.customCode
                locale = options.locale
                senderId = options.senderId
                templateId = options.templateId
                additionalProperties = options.additionalProperties.toMutableMap()
            }

            /**
             * This allows you to automatically retrieve and fill the OTP code on mobile apps.
             * Currently only Android devices are supported.
             */
            fun appRealm(appRealm: AppRealm) = appRealm(JsonField.of(appRealm))

            /**
             * This allows you to automatically retrieve and fill the OTP code on mobile apps.
             * Currently only Android devices are supported.
             */
            fun appRealm(appRealm: JsonField<AppRealm>) = apply { this.appRealm = appRealm }

            /**
             * The size of the code generated. It should be between 4 and 8. Defaults to the code
             * size specified from the Dashboard.
             */
            fun codeSize(codeSize: Long) = codeSize(JsonField.of(codeSize))

            /**
             * The size of the code generated. It should be between 4 and 8. Defaults to the code
             * size specified from the Dashboard.
             */
            fun codeSize(codeSize: JsonField<Long>) = apply { this.codeSize = codeSize }

            /**
             * The custom code to use for OTP verification. This feature is only available for
             * compatibility purposes and subject to Prelude’s approval. Contact us to discuss your
             * use case.
             */
            fun customCode(customCode: String) = customCode(JsonField.of(customCode))

            /**
             * The custom code to use for OTP verification. This feature is only available for
             * compatibility purposes and subject to Prelude’s approval. Contact us to discuss your
             * use case.
             */
            fun customCode(customCode: JsonField<String>) = apply { this.customCode = customCode }

            /**
             * A BCP-47 formatted locale string with the language the text message will be sent to.
             * If there's no locale set, the language will be determined by the country code of the
             * phone number. If the language specified doesn't exist, it defaults to US English.
             */
            fun locale(locale: String) = locale(JsonField.of(locale))

            /**
             * A BCP-47 formatted locale string with the language the text message will be sent to.
             * If there's no locale set, the language will be determined by the country code of the
             * phone number. If the language specified doesn't exist, it defaults to US English.
             */
            fun locale(locale: JsonField<String>) = apply { this.locale = locale }

            /**
             * The Sender ID to use for this message. The Sender ID needs to be enabled by Prelude.
             */
            fun senderId(senderId: String) = senderId(JsonField.of(senderId))

            /**
             * The Sender ID to use for this message. The Sender ID needs to be enabled by Prelude.
             */
            fun senderId(senderId: JsonField<String>) = apply { this.senderId = senderId }

            /**
             * The identifier of a verification settings template. It is used to be able to switch
             * behavior for specific use cases. Contact us if you need to use this functionality.
             */
            fun templateId(templateId: String) = templateId(JsonField.of(templateId))

            /**
             * The identifier of a verification settings template. It is used to be able to switch
             * behavior for specific use cases. Contact us if you need to use this functionality.
             */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

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

            fun build(): Options =
                Options(
                    appRealm,
                    codeSize,
                    customCode,
                    locale,
                    senderId,
                    templateId,
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * This allows you to automatically retrieve and fill the OTP code on mobile apps. Currently
         * only Android devices are supported.
         */
        @NoAutoDetect
        class AppRealm
        @JsonCreator
        private constructor(
            @JsonProperty("platform")
            @ExcludeMissing
            private val platform: JsonField<Platform> = JsonMissing.of(),
            @JsonProperty("value")
            @ExcludeMissing
            private val value: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The platform the SMS will be sent to. We are currently only supporting "android". */
            fun platform(): Platform = platform.getRequired("platform")

            /** The Android SMS Retriever API hash code that identifies your app. */
            fun value(): String = value.getRequired("value")

            /** The platform the SMS will be sent to. We are currently only supporting "android". */
            @JsonProperty("platform")
            @ExcludeMissing
            fun _platform(): JsonField<Platform> = platform

            /** The Android SMS Retriever API hash code that identifies your app. */
            @JsonProperty("value") @ExcludeMissing fun _value(): JsonField<String> = value

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AppRealm = apply {
                if (validated) {
                    return@apply
                }

                platform()
                value()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [AppRealm]. */
            class Builder internal constructor() {

                private var platform: JsonField<Platform>? = null
                private var value: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(appRealm: AppRealm) = apply {
                    platform = appRealm.platform
                    value = appRealm.value
                    additionalProperties = appRealm.additionalProperties.toMutableMap()
                }

                /**
                 * The platform the SMS will be sent to. We are currently only supporting "android".
                 */
                fun platform(platform: Platform) = platform(JsonField.of(platform))

                /**
                 * The platform the SMS will be sent to. We are currently only supporting "android".
                 */
                fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

                /** The Android SMS Retriever API hash code that identifies your app. */
                fun value(value: String) = value(JsonField.of(value))

                /** The Android SMS Retriever API hash code that identifies your app. */
                fun value(value: JsonField<String>) = apply { this.value = value }

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

                fun build(): AppRealm =
                    AppRealm(
                        checkRequired("platform", platform),
                        checkRequired("value", value),
                        additionalProperties.toImmutable(),
                    )
            }

            /** The platform the SMS will be sent to. We are currently only supporting "android". */
            class Platform
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                    @JvmField val ANDROID = of("android")

                    @JvmStatic fun of(value: String) = Platform(JsonField.of(value))
                }

                /** An enum containing [Platform]'s known values. */
                enum class Known {
                    ANDROID,
                }

                /**
                 * An enum containing [Platform]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Platform] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ANDROID,
                    /**
                     * An enum member indicating that [Platform] was instantiated with an unknown
                     * value.
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
                        ANDROID -> Value.ANDROID
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
                        ANDROID -> Known.ANDROID
                        else -> throw PreludeInvalidDataException("Unknown Platform: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Platform && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AppRealm && platform == other.platform && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(platform, value, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AppRealm{platform=$platform, value=$value, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Options && appRealm == other.appRealm && codeSize == other.codeSize && customCode == other.customCode && locale == other.locale && senderId == other.senderId && templateId == other.templateId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appRealm, codeSize, customCode, locale, senderId, templateId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Options{appRealm=$appRealm, codeSize=$codeSize, customCode=$customCode, locale=$locale, senderId=$senderId, templateId=$templateId, additionalProperties=$additionalProperties}"
    }

    /** The signals used for anti-fraud. */
    @NoAutoDetect
    class Signals
    @JsonCreator
    private constructor(
        @JsonProperty("app_version")
        @ExcludeMissing
        private val appVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_id")
        @ExcludeMissing
        private val deviceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_model")
        @ExcludeMissing
        private val deviceModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_platform")
        @ExcludeMissing
        private val devicePlatform: JsonField<DevicePlatform> = JsonMissing.of(),
        @JsonProperty("ip") @ExcludeMissing private val ip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_trusted_user")
        @ExcludeMissing
        private val isTrustedUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("os_version")
        @ExcludeMissing
        private val osVersion: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The version of your application. */
        fun appVersion(): Optional<String> =
            Optional.ofNullable(appVersion.getNullable("app_version"))

        /**
         * The unique identifier for the user's device. For Android, this corresponds to the
         * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
         */
        fun deviceId(): Optional<String> = Optional.ofNullable(deviceId.getNullable("device_id"))

        /** The model of the user's device. */
        fun deviceModel(): Optional<String> =
            Optional.ofNullable(deviceModel.getNullable("device_model"))

        /** The type of the user's device. */
        fun devicePlatform(): Optional<DevicePlatform> =
            Optional.ofNullable(devicePlatform.getNullable("device_platform"))

        /** The IP address of the user's device. */
        fun ip(): Optional<String> = Optional.ofNullable(ip.getNullable("ip"))

        /**
         * This signal should provide a higher level of trust, indicating that the user is genuine.
         * For more details, refer to [Signals](/guides/prevent-fraud#signals).
         */
        fun isTrustedUser(): Optional<Boolean> =
            Optional.ofNullable(isTrustedUser.getNullable("is_trusted_user"))

        /** The version of the user's device operating system. */
        fun osVersion(): Optional<String> = Optional.ofNullable(osVersion.getNullable("os_version"))

        /** The version of your application. */
        @JsonProperty("app_version")
        @ExcludeMissing
        fun _appVersion(): JsonField<String> = appVersion

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
        @JsonProperty("device_platform")
        @ExcludeMissing
        fun _devicePlatform(): JsonField<DevicePlatform> = devicePlatform

        /** The IP address of the user's device. */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        /**
         * This signal should provide a higher level of trust, indicating that the user is genuine.
         * For more details, refer to [Signals](/guides/prevent-fraud#signals).
         */
        @JsonProperty("is_trusted_user")
        @ExcludeMissing
        fun _isTrustedUser(): JsonField<Boolean> = isTrustedUser

        /** The version of the user's device operating system. */
        @JsonProperty("os_version") @ExcludeMissing fun _osVersion(): JsonField<String> = osVersion

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Signals = apply {
            if (validated) {
                return@apply
            }

            appVersion()
            deviceId()
            deviceModel()
            devicePlatform()
            ip()
            isTrustedUser()
            osVersion()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Signals]. */
        class Builder internal constructor() {

            private var appVersion: JsonField<String> = JsonMissing.of()
            private var deviceId: JsonField<String> = JsonMissing.of()
            private var deviceModel: JsonField<String> = JsonMissing.of()
            private var devicePlatform: JsonField<DevicePlatform> = JsonMissing.of()
            private var ip: JsonField<String> = JsonMissing.of()
            private var isTrustedUser: JsonField<Boolean> = JsonMissing.of()
            private var osVersion: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signals: Signals) = apply {
                appVersion = signals.appVersion
                deviceId = signals.deviceId
                deviceModel = signals.deviceModel
                devicePlatform = signals.devicePlatform
                ip = signals.ip
                isTrustedUser = signals.isTrustedUser
                osVersion = signals.osVersion
                additionalProperties = signals.additionalProperties.toMutableMap()
            }

            /** The version of your application. */
            fun appVersion(appVersion: String) = appVersion(JsonField.of(appVersion))

            /** The version of your application. */
            fun appVersion(appVersion: JsonField<String>) = apply { this.appVersion = appVersion }

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
            fun devicePlatform(devicePlatform: DevicePlatform) =
                devicePlatform(JsonField.of(devicePlatform))

            /** The type of the user's device. */
            fun devicePlatform(devicePlatform: JsonField<DevicePlatform>) = apply {
                this.devicePlatform = devicePlatform
            }

            /** The IP address of the user's device. */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /** The IP address of the user's device. */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            /**
             * This signal should provide a higher level of trust, indicating that the user is
             * genuine. For more details, refer to [Signals](/guides/prevent-fraud#signals).
             */
            fun isTrustedUser(isTrustedUser: Boolean) = isTrustedUser(JsonField.of(isTrustedUser))

            /**
             * This signal should provide a higher level of trust, indicating that the user is
             * genuine. For more details, refer to [Signals](/guides/prevent-fraud#signals).
             */
            fun isTrustedUser(isTrustedUser: JsonField<Boolean>) = apply {
                this.isTrustedUser = isTrustedUser
            }

            /** The version of the user's device operating system. */
            fun osVersion(osVersion: String) = osVersion(JsonField.of(osVersion))

            /** The version of the user's device operating system. */
            fun osVersion(osVersion: JsonField<String>) = apply { this.osVersion = osVersion }

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
                    appVersion,
                    deviceId,
                    deviceModel,
                    devicePlatform,
                    ip,
                    isTrustedUser,
                    osVersion,
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of the user's device. */
        class DevicePlatform
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DevicePlatform && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Signals && appVersion == other.appVersion && deviceId == other.deviceId && deviceModel == other.deviceModel && devicePlatform == other.devicePlatform && ip == other.ip && isTrustedUser == other.isTrustedUser && osVersion == other.osVersion && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(appVersion, deviceId, deviceModel, devicePlatform, ip, isTrustedUser, osVersion, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Signals{appVersion=$appVersion, deviceId=$deviceId, deviceModel=$deviceModel, devicePlatform=$devicePlatform, ip=$ip, isTrustedUser=$isTrustedUser, osVersion=$osVersion, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VerificationCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "VerificationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

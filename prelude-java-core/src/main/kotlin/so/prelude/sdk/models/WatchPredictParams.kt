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

/** Predict the outcome of a verification based on Prelude’s anti-fraud system. */
class WatchPredictParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The prediction target. Only supports phone numbers for now.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun target(): Target = body.target()

    /**
     * The identifier of the dispatch that came from the front-end SDK.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dispatchId(): Optional<String> = body.dispatchId()

    /**
     * The metadata for this prediction.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * The signals used for anti-fraud. For more details, refer to
     * [Signals](/verify/v2/documentation/prevent-fraud#signals).
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
     * Returns the raw JSON value of [dispatchId].
     *
     * Unlike [dispatchId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _dispatchId(): JsonField<String> = body._dispatchId()

    /**
     * Returns the raw JSON value of [metadata].
     *
     * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _metadata(): JsonField<Metadata> = body._metadata()

    /**
     * Returns the raw JSON value of [signals].
     *
     * Unlike [signals], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _signals(): JsonField<Signals> = body._signals()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
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
         * - [dispatchId]
         * - [metadata]
         * - [signals]
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The prediction target. Only supports phone numbers for now. */
        fun target(target: Target) = apply { body.target(target) }

        /**
         * Sets [Builder.target] to an arbitrary JSON value.
         *
         * You should usually call [Builder.target] with a well-typed [Target] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun target(target: JsonField<Target>) = apply { body.target(target) }

        /** The identifier of the dispatch that came from the front-end SDK. */
        fun dispatchId(dispatchId: String) = apply { body.dispatchId(dispatchId) }

        /**
         * Sets [Builder.dispatchId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.dispatchId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun dispatchId(dispatchId: JsonField<String>) = apply { body.dispatchId(dispatchId) }

        /** The metadata for this prediction. */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /**
         * The signals used for anti-fraud. For more details, refer to
         * [Signals](/verify/v2/documentation/prevent-fraud#signals).
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

        fun putAlladditional_body_properties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAlladditional_body_properties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAlladditional_body_properties(keys: Set<String>) = apply {
            body.removeAlladditional_body_properties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAlladditional_headers(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceadditional_headers(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceadditional_headers(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAlladditional_headers(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAlladditional_headers(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeadditional_headers(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAlladditional_headers(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAlladditional_query_params(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAlladditional_query_params(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceadditional_query_params(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceadditional_query_params(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAlladditional_query_params(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAlladditional_query_params(
            additionalQueryParams: Map<String, Iterable<String>>
        ) = apply { this.additionalQueryParams.replaceAll(additionalQueryParams) }

        fun removeadditional_query_params(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAlladditional_query_params(keys: Set<String>) = apply {
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
        private val dispatchId: JsonField<String>,
        private val metadata: JsonField<Metadata>,
        private val signals: JsonField<Signals>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("target") @ExcludeMissing target: JsonField<Target> = JsonMissing.of(),
            @JsonProperty("dispatch_id")
            @ExcludeMissing
            dispatchId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("metadata")
            @ExcludeMissing
            metadata: JsonField<Metadata> = JsonMissing.of(),
            @JsonProperty("signals") @ExcludeMissing signals: JsonField<Signals> = JsonMissing.of(),
        ) : this(target, dispatchId, metadata, signals, mutableMapOf())

        /**
         * The prediction target. Only supports phone numbers for now.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun target(): Target = target.getRequired("target")

        /**
         * The identifier of the dispatch that came from the front-end SDK.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun dispatchId(): Optional<String> = dispatchId.getOptional("dispatch_id")

        /**
         * The metadata for this prediction.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * The signals used for anti-fraud. For more details, refer to
         * [Signals](/verify/v2/documentation/prevent-fraud#signals).
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun signals(): Optional<Signals> = signals.getOptional("signals")

        /**
         * Returns the raw JSON value of [target].
         *
         * Unlike [target], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("target") @ExcludeMissing fun _target(): JsonField<Target> = target

        /**
         * Returns the raw JSON value of [dispatchId].
         *
         * Unlike [dispatchId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("dispatch_id")
        @ExcludeMissing
        fun _dispatchId(): JsonField<String> = dispatchId

        /**
         * Returns the raw JSON value of [metadata].
         *
         * Unlike [metadata], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("metadata") @ExcludeMissing fun _metadata(): JsonField<Metadata> = metadata

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
            private var dispatchId: JsonField<String> = JsonMissing.of()
            private var metadata: JsonField<Metadata> = JsonMissing.of()
            private var signals: JsonField<Signals> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                target = body.target
                dispatchId = body.dispatchId
                metadata = body.metadata
                signals = body.signals
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The prediction target. Only supports phone numbers for now. */
            fun target(target: Target) = target(JsonField.of(target))

            /**
             * Sets [Builder.target] to an arbitrary JSON value.
             *
             * You should usually call [Builder.target] with a well-typed [Target] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun target(target: JsonField<Target>) = apply { this.target = target }

            /** The identifier of the dispatch that came from the front-end SDK. */
            fun dispatchId(dispatchId: String) = dispatchId(JsonField.of(dispatchId))

            /**
             * Sets [Builder.dispatchId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.dispatchId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun dispatchId(dispatchId: JsonField<String>) = apply { this.dispatchId = dispatchId }

            /** The metadata for this prediction. */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /**
             * The signals used for anti-fraud. For more details, refer to
             * [Signals](/verify/v2/documentation/prevent-fraud#signals).
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
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
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
                Body(
                    checkRequired("target", target),
                    dispatchId,
                    metadata,
                    signals,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            target().validate()
            dispatchId()
            metadata().ifPresent { it.validate() }
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
                (if (dispatchId.asKnown().isPresent) 1 else 0) +
                (metadata.asKnown().getOrNull()?.validity() ?: 0) +
                (signals.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                target == other.target &&
                dispatchId == other.dispatchId &&
                metadata == other.metadata &&
                signals == other.signals &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(target, dispatchId, metadata, signals, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{target=$target, dispatchId=$dispatchId, metadata=$metadata, signals=$signals, additionalProperties=$additionalProperties}"
    }

    /** The prediction target. Only supports phone numbers for now. */
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
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
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

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Target &&
                type == other.type &&
                value == other.value &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Target{type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /** The metadata for this prediction. */
    class Metadata
    private constructor(
        private val correlationId: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("correlation_id")
            @ExcludeMissing
            correlationId: JsonField<String> = JsonMissing.of()
        ) : this(correlationId, mutableMapOf())

        /**
         * A user-defined identifier to correlate this prediction with. It is returned in the
         * response and any webhook events that refer to this prediction.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun correlationId(): Optional<String> = correlationId.getOptional("correlation_id")

        /**
         * Returns the raw JSON value of [correlationId].
         *
         * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("correlation_id")
        @ExcludeMissing
        fun _correlationId(): JsonField<String> = correlationId

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

            /** Returns a mutable builder for constructing an instance of [Metadata]. */
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

            /**
             * A user-defined identifier to correlate this prediction with. It is returned in the
             * response and any webhook events that refer to this prediction.
             */
            fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

            /**
             * Sets [Builder.correlationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correlationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun correlationId(correlationId: JsonField<String>) = apply {
                this.correlationId = correlationId
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(correlationId, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): Metadata = apply {
            if (validated) {
                return@apply
            }

            correlationId()
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
        internal fun validity(): Int = (if (correlationId.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Metadata &&
                correlationId == other.correlationId &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(correlationId, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{correlationId=$correlationId, additionalProperties=$additionalProperties}"
    }

    /**
     * The signals used for anti-fraud. For more details, refer to
     * [Signals](/verify/v2/documentation/prevent-fraud#signals).
     */
    class Signals
    private constructor(
        private val appVersion: JsonField<String>,
        private val deviceId: JsonField<String>,
        private val deviceModel: JsonField<String>,
        private val devicePlatform: JsonField<DevicePlatform>,
        private val ip: JsonField<String>,
        private val isTrustedUser: JsonField<Boolean>,
        private val osVersion: JsonField<String>,
        private val userAgent: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app_version")
            @ExcludeMissing
            appVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("device_id")
            @ExcludeMissing
            deviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("device_model")
            @ExcludeMissing
            deviceModel: JsonField<String> = JsonMissing.of(),
            @JsonProperty("device_platform")
            @ExcludeMissing
            devicePlatform: JsonField<DevicePlatform> = JsonMissing.of(),
            @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
            @JsonProperty("is_trusted_user")
            @ExcludeMissing
            isTrustedUser: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("os_version")
            @ExcludeMissing
            osVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_agent")
            @ExcludeMissing
            userAgent: JsonField<String> = JsonMissing.of(),
        ) : this(
            appVersion,
            deviceId,
            deviceModel,
            devicePlatform,
            ip,
            isTrustedUser,
            osVersion,
            userAgent,
            mutableMapOf(),
        )

        /**
         * The version of your application.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appVersion(): Optional<String> = appVersion.getOptional("app_version")

        /**
         * The unique identifier for the user's device. For Android, this corresponds to the
         * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceId(): Optional<String> = deviceId.getOptional("device_id")

        /**
         * The model of the user's device.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceModel(): Optional<String> = deviceModel.getOptional("device_model")

        /**
         * The type of the user's device.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun devicePlatform(): Optional<DevicePlatform> =
            devicePlatform.getOptional("device_platform")

        /**
         * The IP address of the user's device.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ip(): Optional<String> = ip.getOptional("ip")

        /**
         * This signal should provide a higher level of trust, indicating that the user is genuine.
         * Contact us to discuss your use case. For more details, refer to
         * [Signals](/verify/v2/documentation/prevent-fraud#signals).
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun isTrustedUser(): Optional<Boolean> = isTrustedUser.getOptional("is_trusted_user")

        /**
         * The version of the user's device operating system.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun osVersion(): Optional<String> = osVersion.getOptional("os_version")

        /**
         * The user agent of the user's device. If the individual fields (os_version,
         * device_platform, device_model) are provided, we will prioritize those values instead of
         * parsing them from the user agent string.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userAgent(): Optional<String> = userAgent.getOptional("user_agent")

        /**
         * Returns the raw JSON value of [appVersion].
         *
         * Unlike [appVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app_version")
        @ExcludeMissing
        fun _appVersion(): JsonField<String> = appVersion

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
         * Returns the raw JSON value of [devicePlatform].
         *
         * Unlike [devicePlatform], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("device_platform")
        @ExcludeMissing
        fun _devicePlatform(): JsonField<DevicePlatform> = devicePlatform

        /**
         * Returns the raw JSON value of [ip].
         *
         * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

        /**
         * Returns the raw JSON value of [isTrustedUser].
         *
         * Unlike [isTrustedUser], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("is_trusted_user")
        @ExcludeMissing
        fun _isTrustedUser(): JsonField<Boolean> = isTrustedUser

        /**
         * Returns the raw JSON value of [osVersion].
         *
         * Unlike [osVersion], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("os_version") @ExcludeMissing fun _osVersion(): JsonField<String> = osVersion

        /**
         * Returns the raw JSON value of [userAgent].
         *
         * Unlike [userAgent], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user_agent") @ExcludeMissing fun _userAgent(): JsonField<String> = userAgent

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

            private var appVersion: JsonField<String> = JsonMissing.of()
            private var deviceId: JsonField<String> = JsonMissing.of()
            private var deviceModel: JsonField<String> = JsonMissing.of()
            private var devicePlatform: JsonField<DevicePlatform> = JsonMissing.of()
            private var ip: JsonField<String> = JsonMissing.of()
            private var isTrustedUser: JsonField<Boolean> = JsonMissing.of()
            private var osVersion: JsonField<String> = JsonMissing.of()
            private var userAgent: JsonField<String> = JsonMissing.of()
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
                userAgent = signals.userAgent
                additionalProperties = signals.additionalProperties.toMutableMap()
            }

            /** The version of your application. */
            fun appVersion(appVersion: String) = appVersion(JsonField.of(appVersion))

            /**
             * Sets [Builder.appVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appVersion] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appVersion(appVersion: JsonField<String>) = apply { this.appVersion = appVersion }

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

            /** The IP address of the user's device. */
            fun ip(ip: String) = ip(JsonField.of(ip))

            /**
             * Sets [Builder.ip] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ip] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun ip(ip: JsonField<String>) = apply { this.ip = ip }

            /**
             * This signal should provide a higher level of trust, indicating that the user is
             * genuine. Contact us to discuss your use case. For more details, refer to
             * [Signals](/verify/v2/documentation/prevent-fraud#signals).
             */
            fun isTrustedUser(isTrustedUser: Boolean) = isTrustedUser(JsonField.of(isTrustedUser))

            /**
             * Sets [Builder.isTrustedUser] to an arbitrary JSON value.
             *
             * You should usually call [Builder.isTrustedUser] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun isTrustedUser(isTrustedUser: JsonField<Boolean>) = apply {
                this.isTrustedUser = isTrustedUser
            }

            /** The version of the user's device operating system. */
            fun osVersion(osVersion: String) = osVersion(JsonField.of(osVersion))

            /**
             * Sets [Builder.osVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.osVersion] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun osVersion(osVersion: JsonField<String>) = apply { this.osVersion = osVersion }

            /**
             * The user agent of the user's device. If the individual fields (os_version,
             * device_platform, device_model) are provided, we will prioritize those values instead
             * of parsing them from the user agent string.
             */
            fun userAgent(userAgent: String) = userAgent(JsonField.of(userAgent))

            /**
             * Sets [Builder.userAgent] to an arbitrary JSON value.
             *
             * You should usually call [Builder.userAgent] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun userAgent(userAgent: JsonField<String>) = apply { this.userAgent = userAgent }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAlladditional_properties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAlladditional_properties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Signals].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Signals =
                Signals(
                    appVersion,
                    deviceId,
                    deviceModel,
                    devicePlatform,
                    ip,
                    isTrustedUser,
                    osVersion,
                    userAgent,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Signals = apply {
            if (validated) {
                return@apply
            }

            appVersion()
            deviceId()
            deviceModel()
            devicePlatform().ifPresent { it.validate() }
            ip()
            isTrustedUser()
            osVersion()
            userAgent()
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
            (if (appVersion.asKnown().isPresent) 1 else 0) +
                (if (deviceId.asKnown().isPresent) 1 else 0) +
                (if (deviceModel.asKnown().isPresent) 1 else 0) +
                (devicePlatform.asKnown().getOrNull()?.validity() ?: 0) +
                (if (ip.asKnown().isPresent) 1 else 0) +
                (if (isTrustedUser.asKnown().isPresent) 1 else 0) +
                (if (osVersion.asKnown().isPresent) 1 else 0) +
                (if (userAgent.asKnown().isPresent) 1 else 0)

        /** The type of the user's device. */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Signals &&
                appVersion == other.appVersion &&
                deviceId == other.deviceId &&
                deviceModel == other.deviceModel &&
                devicePlatform == other.devicePlatform &&
                ip == other.ip &&
                isTrustedUser == other.isTrustedUser &&
                osVersion == other.osVersion &&
                userAgent == other.userAgent &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                appVersion,
                deviceId,
                deviceModel,
                devicePlatform,
                ip,
                isTrustedUser,
                osVersion,
                userAgent,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Signals{appVersion=$appVersion, deviceId=$deviceId, deviceModel=$deviceModel, devicePlatform=$devicePlatform, ip=$ip, isTrustedUser=$isTrustedUser, osVersion=$osVersion, userAgent=$userAgent, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WatchPredictParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "WatchPredictParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

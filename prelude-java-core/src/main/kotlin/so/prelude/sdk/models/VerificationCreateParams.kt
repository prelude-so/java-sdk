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
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

/**
 * Create a new verification for a specific phone number. If another non-expired verification exists
 * (the request is performed within the verification window), this endpoint will perform a retry
 * instead.
 */
class VerificationCreateParams
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
     * The identifier of the dispatch that came from the front-end SDK.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun dispatchId(): Optional<String> = body.dispatchId()

    /**
     * The metadata for this verification. This object will be returned with every response or
     * webhook sent that refers to this verification.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun metadata(): Optional<Metadata> = body.metadata()

    /**
     * Verification options
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun options(): Optional<Options> = body.options()

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
     * Returns the raw JSON value of [options].
     *
     * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _options(): JsonField<Options> = body._options()

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
         * Returns a mutable builder for constructing an instance of [VerificationCreateParams].
         *
         * The following fields are required:
         * ```java
         * .target()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(verificationCreateParams: VerificationCreateParams) = apply {
            body = verificationCreateParams.body.toBuilder()
            additionalHeaders = verificationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = verificationCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [target]
         * - [dispatchId]
         * - [metadata]
         * - [options]
         * - [signals]
         * - etc.
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

        /**
         * The metadata for this verification. This object will be returned with every response or
         * webhook sent that refers to this verification.
         */
        fun metadata(metadata: Metadata) = apply { body.metadata(metadata) }

        /**
         * Sets [Builder.metadata] to an arbitrary JSON value.
         *
         * You should usually call [Builder.metadata] with a well-typed [Metadata] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun metadata(metadata: JsonField<Metadata>) = apply { body.metadata(metadata) }

        /** Verification options */
        fun options(options: Options) = apply { body.options(options) }

        /**
         * Sets [Builder.options] to an arbitrary JSON value.
         *
         * You should usually call [Builder.options] with a well-typed [Options] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun options(options: JsonField<Options>) = apply { body.options(options) }

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
         * Returns an immutable instance of [VerificationCreateParams].
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
        fun build(): VerificationCreateParams =
            VerificationCreateParams(
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
        private val options: JsonField<Options>,
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
            @JsonProperty("options") @ExcludeMissing options: JsonField<Options> = JsonMissing.of(),
            @JsonProperty("signals") @ExcludeMissing signals: JsonField<Signals> = JsonMissing.of(),
        ) : this(target, dispatchId, metadata, options, signals, mutableMapOf())

        /**
         * The verification target. Either a phone number or an email address. To use the email
         * verification feature contact us to discuss your use case.
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
         * The metadata for this verification. This object will be returned with every response or
         * webhook sent that refers to this verification.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun metadata(): Optional<Metadata> = metadata.getOptional("metadata")

        /**
         * Verification options
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun options(): Optional<Options> = options.getOptional("options")

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
         * Returns the raw JSON value of [options].
         *
         * Unlike [options], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("options") @ExcludeMissing fun _options(): JsonField<Options> = options

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
            private var options: JsonField<Options> = JsonMissing.of()
            private var signals: JsonField<Signals> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                target = body.target
                dispatchId = body.dispatchId
                metadata = body.metadata
                options = body.options
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

            /**
             * The metadata for this verification. This object will be returned with every response
             * or webhook sent that refers to this verification.
             */
            fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

            /**
             * Sets [Builder.metadata] to an arbitrary JSON value.
             *
             * You should usually call [Builder.metadata] with a well-typed [Metadata] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

            /** Verification options */
            fun options(options: Options) = options(JsonField.of(options))

            /**
             * Sets [Builder.options] to an arbitrary JSON value.
             *
             * You should usually call [Builder.options] with a well-typed [Options] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun options(options: JsonField<Options>) = apply { this.options = options }

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
                    options,
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
            options().ifPresent { it.validate() }
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
                (options.asKnown().getOrNull()?.validity() ?: 0) +
                (signals.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                target == other.target &&
                dispatchId == other.dispatchId &&
                metadata == other.metadata &&
                options == other.options &&
                signals == other.signals &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(target, dispatchId, metadata, options, signals, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{target=$target, dispatchId=$dispatchId, metadata=$metadata, options=$options, signals=$signals, additionalProperties=$additionalProperties}"
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

    /**
     * The metadata for this verification. This object will be returned with every response or
     * webhook sent that refers to this verification.
     */
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
         * A user-defined identifier to correlate this verification with. It is returned in the
         * response and any webhook events that refer to this verification.
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
             * A user-defined identifier to correlate this verification with. It is returned in the
             * response and any webhook events that refer to this verification.
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

    /** Verification options */
    class Options
    private constructor(
        private val appRealm: JsonField<AppRealm>,
        private val callbackUrl: JsonField<String>,
        private val codeSize: JsonField<Long>,
        private val customCode: JsonField<String>,
        private val locale: JsonField<String>,
        private val method: JsonField<Method>,
        private val preferredChannel: JsonField<PreferredChannel>,
        private val senderId: JsonField<String>,
        private val templateId: JsonField<String>,
        private val variables: JsonField<Variables>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("app_realm")
            @ExcludeMissing
            appRealm: JsonField<AppRealm> = JsonMissing.of(),
            @JsonProperty("callback_url")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code_size") @ExcludeMissing codeSize: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("custom_code")
            @ExcludeMissing
            customCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locale") @ExcludeMissing locale: JsonField<String> = JsonMissing.of(),
            @JsonProperty("method") @ExcludeMissing method: JsonField<Method> = JsonMissing.of(),
            @JsonProperty("preferred_channel")
            @ExcludeMissing
            preferredChannel: JsonField<PreferredChannel> = JsonMissing.of(),
            @JsonProperty("sender_id")
            @ExcludeMissing
            senderId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("template_id")
            @ExcludeMissing
            templateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("variables")
            @ExcludeMissing
            variables: JsonField<Variables> = JsonMissing.of(),
        ) : this(
            appRealm,
            callbackUrl,
            codeSize,
            customCode,
            locale,
            method,
            preferredChannel,
            senderId,
            templateId,
            variables,
            mutableMapOf(),
        )

        /**
         * This allows you to automatically retrieve and fill the OTP code on mobile apps. Currently
         * only Android devices are supported.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun appRealm(): Optional<AppRealm> = appRealm.getOptional("app_realm")

        /**
         * The URL where webhooks will be sent when verification events occur, including
         * verification creation, attempt creation, and delivery status changes. For more details,
         * refer to [Webhook](/verify/v2/documentation/webhook).
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callback_url")

        /**
         * The size of the code generated. It should be between 4 and 8. Defaults to the code size
         * specified from the Dashboard.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun codeSize(): Optional<Long> = codeSize.getOptional("code_size")

        /**
         * The custom code to use for OTP verification. To use the custom code feature, contact us
         * to enable it for your account. For more details, refer to
         * [Custom Code](/verify/v2/documentation/custom-codes).
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun customCode(): Optional<String> = customCode.getOptional("custom_code")

        /**
         * A BCP-47 formatted locale string with the language the text message will be sent to. If
         * there's no locale set, the language will be determined by the country code of the phone
         * number. If the language specified doesn't exist, it defaults to US English.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locale(): Optional<String> = locale.getOptional("locale")

        /**
         * The method used for verifying this phone number. The 'voice' option provides an
         * accessible alternative for visually impaired users by delivering the verification code
         * through a phone call rather than a text message. It also allows verification of landline
         * numbers that cannot receive SMS messages.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun method(): Optional<Method> = method.getOptional("method")

        /**
         * The preferred channel to be used in priority for verification.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun preferredChannel(): Optional<PreferredChannel> =
            preferredChannel.getOptional("preferred_channel")

        /**
         * The Sender ID to use for this message. The Sender ID needs to be enabled by Prelude.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun senderId(): Optional<String> = senderId.getOptional("sender_id")

        /**
         * The identifier of a verification template. It applies use case-specific settings, such as
         * the message content or certain verification parameters.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun templateId(): Optional<String> = templateId.getOptional("template_id")

        /**
         * The variables to be replaced in the template.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun variables(): Optional<Variables> = variables.getOptional("variables")

        /**
         * Returns the raw JSON value of [appRealm].
         *
         * Unlike [appRealm], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("app_realm") @ExcludeMissing fun _appRealm(): JsonField<AppRealm> = appRealm

        /**
         * Returns the raw JSON value of [callbackUrl].
         *
         * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callback_url")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

        /**
         * Returns the raw JSON value of [codeSize].
         *
         * Unlike [codeSize], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code_size") @ExcludeMissing fun _codeSize(): JsonField<Long> = codeSize

        /**
         * Returns the raw JSON value of [customCode].
         *
         * Unlike [customCode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("custom_code")
        @ExcludeMissing
        fun _customCode(): JsonField<String> = customCode

        /**
         * Returns the raw JSON value of [locale].
         *
         * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

        /**
         * Returns the raw JSON value of [method].
         *
         * Unlike [method], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

        /**
         * Returns the raw JSON value of [preferredChannel].
         *
         * Unlike [preferredChannel], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("preferred_channel")
        @ExcludeMissing
        fun _preferredChannel(): JsonField<PreferredChannel> = preferredChannel

        /**
         * Returns the raw JSON value of [senderId].
         *
         * Unlike [senderId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("sender_id") @ExcludeMissing fun _senderId(): JsonField<String> = senderId

        /**
         * Returns the raw JSON value of [templateId].
         *
         * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun _templateId(): JsonField<String> = templateId

        /**
         * Returns the raw JSON value of [variables].
         *
         * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("variables")
        @ExcludeMissing
        fun _variables(): JsonField<Variables> = variables

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

            /** Returns a mutable builder for constructing an instance of [Options]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Options]. */
        class Builder internal constructor() {

            private var appRealm: JsonField<AppRealm> = JsonMissing.of()
            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var codeSize: JsonField<Long> = JsonMissing.of()
            private var customCode: JsonField<String> = JsonMissing.of()
            private var locale: JsonField<String> = JsonMissing.of()
            private var method: JsonField<Method> = JsonMissing.of()
            private var preferredChannel: JsonField<PreferredChannel> = JsonMissing.of()
            private var senderId: JsonField<String> = JsonMissing.of()
            private var templateId: JsonField<String> = JsonMissing.of()
            private var variables: JsonField<Variables> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                appRealm = options.appRealm
                callbackUrl = options.callbackUrl
                codeSize = options.codeSize
                customCode = options.customCode
                locale = options.locale
                method = options.method
                preferredChannel = options.preferredChannel
                senderId = options.senderId
                templateId = options.templateId
                variables = options.variables
                additionalProperties = options.additionalProperties.toMutableMap()
            }

            /**
             * This allows you to automatically retrieve and fill the OTP code on mobile apps.
             * Currently only Android devices are supported.
             */
            fun appRealm(appRealm: AppRealm) = appRealm(JsonField.of(appRealm))

            /**
             * Sets [Builder.appRealm] to an arbitrary JSON value.
             *
             * You should usually call [Builder.appRealm] with a well-typed [AppRealm] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun appRealm(appRealm: JsonField<AppRealm>) = apply { this.appRealm = appRealm }

            /**
             * The URL where webhooks will be sent when verification events occur, including
             * verification creation, attempt creation, and delivery status changes. For more
             * details, refer to [Webhook](/verify/v2/documentation/webhook).
             */
            fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

            /**
             * Sets [Builder.callbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackUrl(callbackUrl: JsonField<String>) = apply {
                this.callbackUrl = callbackUrl
            }

            /**
             * The size of the code generated. It should be between 4 and 8. Defaults to the code
             * size specified from the Dashboard.
             */
            fun codeSize(codeSize: Long) = codeSize(JsonField.of(codeSize))

            /**
             * Sets [Builder.codeSize] to an arbitrary JSON value.
             *
             * You should usually call [Builder.codeSize] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun codeSize(codeSize: JsonField<Long>) = apply { this.codeSize = codeSize }

            /**
             * The custom code to use for OTP verification. To use the custom code feature, contact
             * us to enable it for your account. For more details, refer to
             * [Custom Code](/verify/v2/documentation/custom-codes).
             */
            fun customCode(customCode: String) = customCode(JsonField.of(customCode))

            /**
             * Sets [Builder.customCode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.customCode] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun customCode(customCode: JsonField<String>) = apply { this.customCode = customCode }

            /**
             * A BCP-47 formatted locale string with the language the text message will be sent to.
             * If there's no locale set, the language will be determined by the country code of the
             * phone number. If the language specified doesn't exist, it defaults to US English.
             */
            fun locale(locale: String) = locale(JsonField.of(locale))

            /**
             * Sets [Builder.locale] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locale] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locale(locale: JsonField<String>) = apply { this.locale = locale }

            /**
             * The method used for verifying this phone number. The 'voice' option provides an
             * accessible alternative for visually impaired users by delivering the verification
             * code through a phone call rather than a text message. It also allows verification of
             * landline numbers that cannot receive SMS messages.
             */
            fun method(method: Method) = method(JsonField.of(method))

            /**
             * Sets [Builder.method] to an arbitrary JSON value.
             *
             * You should usually call [Builder.method] with a well-typed [Method] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun method(method: JsonField<Method>) = apply { this.method = method }

            /** The preferred channel to be used in priority for verification. */
            fun preferredChannel(preferredChannel: PreferredChannel) =
                preferredChannel(JsonField.of(preferredChannel))

            /**
             * Sets [Builder.preferredChannel] to an arbitrary JSON value.
             *
             * You should usually call [Builder.preferredChannel] with a well-typed
             * [PreferredChannel] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun preferredChannel(preferredChannel: JsonField<PreferredChannel>) = apply {
                this.preferredChannel = preferredChannel
            }

            /**
             * The Sender ID to use for this message. The Sender ID needs to be enabled by Prelude.
             */
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
             * The identifier of a verification template. It applies use case-specific settings,
             * such as the message content or certain verification parameters.
             */
            fun templateId(templateId: String) = templateId(JsonField.of(templateId))

            /**
             * Sets [Builder.templateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

            /** The variables to be replaced in the template. */
            fun variables(variables: Variables) = variables(JsonField.of(variables))

            /**
             * Sets [Builder.variables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.variables] with a well-typed [Variables] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun variables(variables: JsonField<Variables>) = apply { this.variables = variables }

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
             * Returns an immutable instance of [Options].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Options =
                Options(
                    appRealm,
                    callbackUrl,
                    codeSize,
                    customCode,
                    locale,
                    method,
                    preferredChannel,
                    senderId,
                    templateId,
                    variables,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Options = apply {
            if (validated) {
                return@apply
            }

            appRealm().ifPresent { it.validate() }
            callbackUrl()
            codeSize()
            customCode()
            locale()
            method().ifPresent { it.validate() }
            preferredChannel().ifPresent { it.validate() }
            senderId()
            templateId()
            variables().ifPresent { it.validate() }
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
            (appRealm.asKnown().getOrNull()?.validity() ?: 0) +
                (if (callbackUrl.asKnown().isPresent) 1 else 0) +
                (if (codeSize.asKnown().isPresent) 1 else 0) +
                (if (customCode.asKnown().isPresent) 1 else 0) +
                (if (locale.asKnown().isPresent) 1 else 0) +
                (method.asKnown().getOrNull()?.validity() ?: 0) +
                (preferredChannel.asKnown().getOrNull()?.validity() ?: 0) +
                (if (senderId.asKnown().isPresent) 1 else 0) +
                (if (templateId.asKnown().isPresent) 1 else 0) +
                (variables.asKnown().getOrNull()?.validity() ?: 0)

        /**
         * This allows you to automatically retrieve and fill the OTP code on mobile apps. Currently
         * only Android devices are supported.
         */
        class AppRealm
        private constructor(
            private val platform: JsonField<Platform>,
            private val value: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("platform")
                @ExcludeMissing
                platform: JsonField<Platform> = JsonMissing.of(),
                @JsonProperty("value") @ExcludeMissing value: JsonField<String> = JsonMissing.of(),
            ) : this(platform, value, mutableMapOf())

            /**
             * The platform the SMS will be sent to. We are currently only supporting "android".
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun platform(): Platform = platform.getRequired("platform")

            /**
             * The Android SMS Retriever API hash code that identifies your app.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun value(): String = value.getRequired("value")

            /**
             * Returns the raw JSON value of [platform].
             *
             * Unlike [platform], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("platform")
            @ExcludeMissing
            fun _platform(): JsonField<Platform> = platform

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
                 * Returns a mutable builder for constructing an instance of [AppRealm].
                 *
                 * The following fields are required:
                 * ```java
                 * .platform()
                 * .value()
                 * ```
                 */
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
                 * Sets [Builder.platform] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.platform] with a well-typed [Platform] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun platform(platform: JsonField<Platform>) = apply { this.platform = platform }

                /** The Android SMS Retriever API hash code that identifies your app. */
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

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [AppRealm].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .platform()
                 * .value()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): AppRealm =
                    AppRealm(
                        checkRequired("platform", platform),
                        checkRequired("value", value),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): AppRealm = apply {
                if (validated) {
                    return@apply
                }

                platform().validate()
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
                (platform.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (value.asKnown().isPresent) 1 else 0)

            /** The platform the SMS will be sent to. We are currently only supporting "android". */
            class Platform @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

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
                    ANDROID
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

                fun validate(): Platform = apply {
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

                    return other is Platform && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AppRealm &&
                    platform == other.platform &&
                    value == other.value &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(platform, value, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AppRealm{platform=$platform, value=$value, additionalProperties=$additionalProperties}"
        }

        /**
         * The method used for verifying this phone number. The 'voice' option provides an
         * accessible alternative for visually impaired users by delivering the verification code
         * through a phone call rather than a text message. It also allows verification of landline
         * numbers that cannot receive SMS messages.
         */
        class Method @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val AUTO = of("auto")

                @JvmField val VOICE = of("voice")

                @JvmStatic fun of(value: String) = Method(JsonField.of(value))
            }

            /** An enum containing [Method]'s known values. */
            enum class Known {
                AUTO,
                VOICE,
            }

            /**
             * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Method] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTO,
                VOICE,
                /**
                 * An enum member indicating that [Method] was instantiated with an unknown value.
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
                    AUTO -> Value.AUTO
                    VOICE -> Value.VOICE
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
                    AUTO -> Known.AUTO
                    VOICE -> Known.VOICE
                    else -> throw PreludeInvalidDataException("Unknown Method: $value")
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

            fun validate(): Method = apply {
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

                return other is Method && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The preferred channel to be used in priority for verification. */
        class PreferredChannel
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

                @JvmField val SMS = of("sms")

                @JvmField val RCS = of("rcs")

                @JvmField val WHATSAPP = of("whatsapp")

                @JvmField val VIBER = of("viber")

                @JvmField val ZALO = of("zalo")

                @JvmField val TELEGRAM = of("telegram")

                @JvmStatic fun of(value: String) = PreferredChannel(JsonField.of(value))
            }

            /** An enum containing [PreferredChannel]'s known values. */
            enum class Known {
                SMS,
                RCS,
                WHATSAPP,
                VIBER,
                ZALO,
                TELEGRAM,
            }

            /**
             * An enum containing [PreferredChannel]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [PreferredChannel] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                SMS,
                RCS,
                WHATSAPP,
                VIBER,
                ZALO,
                TELEGRAM,
                /**
                 * An enum member indicating that [PreferredChannel] was instantiated with an
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
                    SMS -> Value.SMS
                    RCS -> Value.RCS
                    WHATSAPP -> Value.WHATSAPP
                    VIBER -> Value.VIBER
                    ZALO -> Value.ZALO
                    TELEGRAM -> Value.TELEGRAM
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
                    SMS -> Known.SMS
                    RCS -> Known.RCS
                    WHATSAPP -> Known.WHATSAPP
                    VIBER -> Known.VIBER
                    ZALO -> Known.ZALO
                    TELEGRAM -> Known.TELEGRAM
                    else -> throw PreludeInvalidDataException("Unknown PreferredChannel: $value")
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

            fun validate(): PreferredChannel = apply {
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

                return other is PreferredChannel && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

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
                    putAlladditional_properties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAlladditional_properties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAlladditional_properties(keys: Set<String>) = apply {
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Options &&
                appRealm == other.appRealm &&
                callbackUrl == other.callbackUrl &&
                codeSize == other.codeSize &&
                customCode == other.customCode &&
                locale == other.locale &&
                method == other.method &&
                preferredChannel == other.preferredChannel &&
                senderId == other.senderId &&
                templateId == other.templateId &&
                variables == other.variables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                appRealm,
                callbackUrl,
                codeSize,
                customCode,
                locale,
                method,
                preferredChannel,
                senderId,
                templateId,
                variables,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Options{appRealm=$appRealm, callbackUrl=$callbackUrl, codeSize=$codeSize, customCode=$customCode, locale=$locale, method=$method, preferredChannel=$preferredChannel, senderId=$senderId, templateId=$templateId, variables=$variables, additionalProperties=$additionalProperties}"
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

        return other is VerificationCreateParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "VerificationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

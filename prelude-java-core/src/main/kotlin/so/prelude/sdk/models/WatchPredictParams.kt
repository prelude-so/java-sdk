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
 * At signup, score the user's phone number or email address (target) as legitimate or suspicious.
 * Scoring-only — does not update counters by itself. When using Feedback, call predict before
 * verification.started on the same target (and correlation_id when used) so feedback can warm Watch
 * auth-start counters. Use Events for product fraud labels; use Feedback only if you run your own
 * phone verification funnel outside Prelude Verify.
 */
class WatchPredictParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The signup identifier to score — a phone number or email address.
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

        /** The signup identifier to score — a phone number or email address. */
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
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
         * The signup identifier to score — a phone number or email address.
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

            /** The signup identifier to score — a phone number or email address. */
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
                Body(
                    checkRequired("target", target),
                    dispatchId,
                    metadata,
                    signals,
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

    /** The metadata for this prediction. */
    class Metadata
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
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
             * Returns an immutable instance of [Metadata].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Metadata = Metadata(correlationId, additionalProperties.toMutableMap())
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

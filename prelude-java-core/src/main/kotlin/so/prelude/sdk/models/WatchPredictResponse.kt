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
import so.prelude.sdk.core.immutableEmptyMap
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

@NoAutoDetect
class WatchPredictResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("prediction")
    @ExcludeMissing
    private val prediction: JsonField<Prediction> = JsonMissing.of(),
    @JsonProperty("reasoning")
    @ExcludeMissing
    private val reasoning: JsonField<Reasoning> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /**
     * A unique identifier for your prediction request.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * A label indicating the trustworthiness of the phone number.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prediction(): Prediction = prediction.getRequired("prediction")

    /**
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun reasoning(): Reasoning = reasoning.getRequired("reasoning")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [prediction].
     *
     * Unlike [prediction], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("prediction")
    @ExcludeMissing
    fun _prediction(): JsonField<Prediction> = prediction

    /**
     * Returns the raw JSON value of [reasoning].
     *
     * Unlike [reasoning], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("reasoning") @ExcludeMissing fun _reasoning(): JsonField<Reasoning> = reasoning

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): WatchPredictResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        prediction()
        reasoning().validate()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WatchPredictResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .prediction()
         * .reasoning()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WatchPredictResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var prediction: JsonField<Prediction>? = null
        private var reasoning: JsonField<Reasoning>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(watchPredictResponse: WatchPredictResponse) = apply {
            id = watchPredictResponse.id
            prediction = watchPredictResponse.prediction
            reasoning = watchPredictResponse.reasoning
            additionalProperties = watchPredictResponse.additionalProperties.toMutableMap()
        }

        /** A unique identifier for your prediction request. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** A label indicating the trustworthiness of the phone number. */
        fun prediction(prediction: Prediction) = prediction(JsonField.of(prediction))

        /**
         * Sets [Builder.prediction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prediction] with a well-typed [Prediction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prediction(prediction: JsonField<Prediction>) = apply { this.prediction = prediction }

        fun reasoning(reasoning: Reasoning) = reasoning(JsonField.of(reasoning))

        /**
         * Sets [Builder.reasoning] to an arbitrary JSON value.
         *
         * You should usually call [Builder.reasoning] with a well-typed [Reasoning] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun reasoning(reasoning: JsonField<Reasoning>) = apply { this.reasoning = reasoning }

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
         * Returns an immutable instance of [WatchPredictResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .prediction()
         * .reasoning()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WatchPredictResponse =
            WatchPredictResponse(
                checkRequired("id", id),
                checkRequired("prediction", prediction),
                checkRequired("reasoning", reasoning),
                additionalProperties.toImmutable(),
            )
    }

    /** A label indicating the trustworthiness of the phone number. */
    class Prediction @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALLOW = of("allow")

            @JvmField val BLOCK = of("block")

            @JvmStatic fun of(value: String) = Prediction(JsonField.of(value))
        }

        /** An enum containing [Prediction]'s known values. */
        enum class Known {
            ALLOW,
            BLOCK,
        }

        /**
         * An enum containing [Prediction]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Prediction] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW,
            BLOCK,
            /**
             * An enum member indicating that [Prediction] was instantiated with an unknown value.
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
                ALLOW -> Value.ALLOW
                BLOCK -> Value.BLOCK
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
                ALLOW -> Known.ALLOW
                BLOCK -> Known.BLOCK
                else -> throw PreludeInvalidDataException("Unknown Prediction: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Prediction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Reasoning
    @JsonCreator
    private constructor(
        @JsonProperty("cause")
        @ExcludeMissing
        private val cause: JsonField<Cause> = JsonMissing.of(),
        @JsonProperty("score")
        @ExcludeMissing
        private val score: JsonField<Double> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A label explaining why the phone number was classified as not trustworthy
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun cause(): Optional<Cause> = Optional.ofNullable(cause.getNullable("cause"))

        /**
         * Indicates the risk of the phone number being genuine or involved in fraudulent patterns.
         * The higher the riskier.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun score(): Optional<Double> = Optional.ofNullable(score.getNullable("score"))

        /**
         * Returns the raw JSON value of [cause].
         *
         * Unlike [cause], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cause") @ExcludeMissing fun _cause(): JsonField<Cause> = cause

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Double> = score

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Reasoning = apply {
            if (validated) {
                return@apply
            }

            cause()
            score()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Reasoning]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Reasoning]. */
        class Builder internal constructor() {

            private var cause: JsonField<Cause> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reasoning: Reasoning) = apply {
                cause = reasoning.cause
                score = reasoning.score
                additionalProperties = reasoning.additionalProperties.toMutableMap()
            }

            /** A label explaining why the phone number was classified as not trustworthy */
            fun cause(cause: Cause) = cause(JsonField.of(cause))

            /**
             * Sets [Builder.cause] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cause] with a well-typed [Cause] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun cause(cause: JsonField<Cause>) = apply { this.cause = cause }

            /**
             * Indicates the risk of the phone number being genuine or involved in fraudulent
             * patterns. The higher the riskier.
             */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Double] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun score(score: JsonField<Double>) = apply { this.score = score }

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
             * Returns an immutable instance of [Reasoning].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Reasoning = Reasoning(cause, score, additionalProperties.toImmutable())
        }

        /** A label explaining why the phone number was classified as not trustworthy */
        class Cause @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                @JvmField val NONE = of("none")

                @JvmField val SMART_ANTIFRAUD = of("smart_antifraud")

                @JvmField val REPEAT_NUMBER = of("repeat_number")

                @JvmField val INVALID_LINE = of("invalid_line")

                @JvmStatic fun of(value: String) = Cause(JsonField.of(value))
            }

            /** An enum containing [Cause]'s known values. */
            enum class Known {
                NONE,
                SMART_ANTIFRAUD,
                REPEAT_NUMBER,
                INVALID_LINE,
            }

            /**
             * An enum containing [Cause]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Cause] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                SMART_ANTIFRAUD,
                REPEAT_NUMBER,
                INVALID_LINE,
                /**
                 * An enum member indicating that [Cause] was instantiated with an unknown value.
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
                    NONE -> Value.NONE
                    SMART_ANTIFRAUD -> Value.SMART_ANTIFRAUD
                    REPEAT_NUMBER -> Value.REPEAT_NUMBER
                    INVALID_LINE -> Value.INVALID_LINE
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
                    NONE -> Known.NONE
                    SMART_ANTIFRAUD -> Known.SMART_ANTIFRAUD
                    REPEAT_NUMBER -> Known.REPEAT_NUMBER
                    INVALID_LINE -> Known.INVALID_LINE
                    else -> throw PreludeInvalidDataException("Unknown Cause: $value")
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cause && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reasoning && cause == other.cause && score == other.score && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cause, score, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Reasoning{cause=$cause, score=$score, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WatchPredictResponse && id == other.id && prediction == other.prediction && reasoning == other.reasoning && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, prediction, reasoning, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WatchPredictResponse{id=$id, prediction=$prediction, reasoning=$reasoning, additionalProperties=$additionalProperties}"
}

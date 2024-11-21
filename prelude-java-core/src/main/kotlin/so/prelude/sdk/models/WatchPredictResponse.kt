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
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

@JsonDeserialize(builder = WatchPredictResponse.Builder::class)
@NoAutoDetect
class WatchPredictResponse
private constructor(
    private val id: JsonField<String>,
    private val prediction: JsonField<Prediction>,
    private val reasoning: JsonField<Reasoning>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** A unique identifier for your prediction request. */
    fun id(): Optional<String> = Optional.ofNullable(id.getNullable("id"))

    /** A label indicating the trustworthiness of the phone number. */
    fun prediction(): Optional<Prediction> =
        Optional.ofNullable(prediction.getNullable("prediction"))

    fun reasoning(): Optional<Reasoning> = Optional.ofNullable(reasoning.getNullable("reasoning"))

    /** A unique identifier for your prediction request. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** A label indicating the trustworthiness of the phone number. */
    @JsonProperty("prediction") @ExcludeMissing fun _prediction() = prediction

    @JsonProperty("reasoning") @ExcludeMissing fun _reasoning() = reasoning

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): WatchPredictResponse = apply {
        if (!validated) {
            id()
            prediction()
            reasoning().map { it.validate() }
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var prediction: JsonField<Prediction> = JsonMissing.of()
        private var reasoning: JsonField<Reasoning> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(watchPredictResponse: WatchPredictResponse) = apply {
            this.id = watchPredictResponse.id
            this.prediction = watchPredictResponse.prediction
            this.reasoning = watchPredictResponse.reasoning
            additionalProperties(watchPredictResponse.additionalProperties)
        }

        /** A unique identifier for your prediction request. */
        fun id(id: String) = id(JsonField.of(id))

        /** A unique identifier for your prediction request. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** A label indicating the trustworthiness of the phone number. */
        fun prediction(prediction: Prediction) = prediction(JsonField.of(prediction))

        /** A label indicating the trustworthiness of the phone number. */
        @JsonProperty("prediction")
        @ExcludeMissing
        fun prediction(prediction: JsonField<Prediction>) = apply { this.prediction = prediction }

        fun reasoning(reasoning: Reasoning) = reasoning(JsonField.of(reasoning))

        @JsonProperty("reasoning")
        @ExcludeMissing
        fun reasoning(reasoning: JsonField<Reasoning>) = apply { this.reasoning = reasoning }

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

        fun build(): WatchPredictResponse =
            WatchPredictResponse(
                id,
                prediction,
                reasoning,
                additionalProperties.toImmutable(),
            )
    }

    class Prediction
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Prediction && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ALLOW = Prediction(JsonField.of("allow"))

            @JvmField val BLOCK = Prediction(JsonField.of("block"))

            @JvmStatic fun of(value: String) = Prediction(JsonField.of(value))
        }

        enum class Known {
            ALLOW,
            BLOCK,
        }

        enum class Value {
            ALLOW,
            BLOCK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ALLOW -> Value.ALLOW
                BLOCK -> Value.BLOCK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ALLOW -> Known.ALLOW
                BLOCK -> Known.BLOCK
                else -> throw PreludeInvalidDataException("Unknown Prediction: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Reasoning.Builder::class)
    @NoAutoDetect
    class Reasoning
    private constructor(
        private val cause: JsonField<Cause>,
        private val score: JsonField<Double>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** A label explaining why the phone number was classified as not trustworthy */
        fun cause(): Optional<Cause> = Optional.ofNullable(cause.getNullable("cause"))

        /**
         * Indicates the risk of the phone number being genuine or involved in fraudulent patterns.
         * The higher the riskier.
         */
        fun score(): Optional<Double> = Optional.ofNullable(score.getNullable("score"))

        /** A label explaining why the phone number was classified as not trustworthy */
        @JsonProperty("cause") @ExcludeMissing fun _cause() = cause

        /**
         * Indicates the risk of the phone number being genuine or involved in fraudulent patterns.
         * The higher the riskier.
         */
        @JsonProperty("score") @ExcludeMissing fun _score() = score

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Reasoning = apply {
            if (!validated) {
                cause()
                score()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cause: JsonField<Cause> = JsonMissing.of()
            private var score: JsonField<Double> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(reasoning: Reasoning) = apply {
                this.cause = reasoning.cause
                this.score = reasoning.score
                additionalProperties(reasoning.additionalProperties)
            }

            /** A label explaining why the phone number was classified as not trustworthy */
            fun cause(cause: Cause) = cause(JsonField.of(cause))

            /** A label explaining why the phone number was classified as not trustworthy */
            @JsonProperty("cause")
            @ExcludeMissing
            fun cause(cause: JsonField<Cause>) = apply { this.cause = cause }

            /**
             * Indicates the risk of the phone number being genuine or involved in fraudulent
             * patterns. The higher the riskier.
             */
            fun score(score: Double) = score(JsonField.of(score))

            /**
             * Indicates the risk of the phone number being genuine or involved in fraudulent
             * patterns. The higher the riskier.
             */
            @JsonProperty("score")
            @ExcludeMissing
            fun score(score: JsonField<Double>) = apply { this.score = score }

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

            fun build(): Reasoning =
                Reasoning(
                    cause,
                    score,
                    additionalProperties.toImmutable(),
                )
        }

        class Cause
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cause && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val NONE = Cause(JsonField.of("none"))

                @JvmField val SMART_ANTIFRAUD = Cause(JsonField.of("smart_antifraud"))

                @JvmField val REPEAT_NUMBER = Cause(JsonField.of("repeat_number"))

                @JvmField val INVALID_LINE = Cause(JsonField.of("invalid_line"))

                @JvmStatic fun of(value: String) = Cause(JsonField.of(value))
            }

            enum class Known {
                NONE,
                SMART_ANTIFRAUD,
                REPEAT_NUMBER,
                INVALID_LINE,
            }

            enum class Value {
                NONE,
                SMART_ANTIFRAUD,
                REPEAT_NUMBER,
                INVALID_LINE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NONE -> Value.NONE
                    SMART_ANTIFRAUD -> Value.SMART_ANTIFRAUD
                    REPEAT_NUMBER -> Value.REPEAT_NUMBER
                    INVALID_LINE -> Value.INVALID_LINE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NONE -> Known.NONE
                    SMART_ANTIFRAUD -> Known.SMART_ANTIFRAUD
                    REPEAT_NUMBER -> Known.REPEAT_NUMBER
                    INVALID_LINE -> Known.INVALID_LINE
                    else -> throw PreludeInvalidDataException("Unknown Cause: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

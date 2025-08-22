// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Collections
import java.util.Objects
import kotlin.jvm.optionals.getOrNull
import so.prelude.sdk.core.Enum
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.errors.PreludeInvalidDataException

class WatchPredictResponse
private constructor(
    private val id: JsonField<String>,
    private val prediction: JsonField<Prediction>,
    private val requestId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prediction")
        @ExcludeMissing
        prediction: JsonField<Prediction> = JsonMissing.of(),
        @JsonProperty("request_id") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
    ) : this(id, prediction, requestId, mutableMapOf())

    /**
     * The prediction identifier.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The prediction outcome.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun prediction(): Prediction = prediction.getRequired("prediction")

    /**
     * A string that identifies this specific request. Report it back to us to help us diagnose your
     * issues.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun requestId(): String = requestId.getRequired("request_id")

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
     * Returns the raw JSON value of [requestId].
     *
     * Unlike [requestId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("request_id") @ExcludeMissing fun _requestId(): JsonField<String> = requestId

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
         * Returns a mutable builder for constructing an instance of [WatchPredictResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .prediction()
         * .requestId()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WatchPredictResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var prediction: JsonField<Prediction>? = null
        private var requestId: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(watchPredictResponse: WatchPredictResponse) = apply {
            id = watchPredictResponse.id
            prediction = watchPredictResponse.prediction
            requestId = watchPredictResponse.requestId
            additionalProperties = watchPredictResponse.additionalProperties.toMutableMap()
        }

        /** The prediction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The prediction outcome. */
        fun prediction(prediction: Prediction) = prediction(JsonField.of(prediction))

        /**
         * Sets [Builder.prediction] to an arbitrary JSON value.
         *
         * You should usually call [Builder.prediction] with a well-typed [Prediction] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun prediction(prediction: JsonField<Prediction>) = apply { this.prediction = prediction }

        /**
         * A string that identifies this specific request. Report it back to us to help us diagnose
         * your issues.
         */
        fun requestId(requestId: String) = requestId(JsonField.of(requestId))

        /**
         * Sets [Builder.requestId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.requestId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

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
         * Returns an immutable instance of [WatchPredictResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .prediction()
         * .requestId()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WatchPredictResponse =
            WatchPredictResponse(
                checkRequired("id", id),
                checkRequired("prediction", prediction),
                checkRequired("requestId", requestId),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): WatchPredictResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        prediction().validate()
        requestId()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (id.asKnown().isPresent) 1 else 0) +
            (prediction.asKnown().getOrNull()?.validity() ?: 0) +
            (if (requestId.asKnown().isPresent) 1 else 0)

    /** The prediction outcome. */
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

            @JvmField val LEGITIMATE = of("legitimate")

            @JvmField val SUSPICIOUS = of("suspicious")

            @JvmStatic fun of(value: String) = Prediction(JsonField.of(value))
        }

        /** An enum containing [Prediction]'s known values. */
        enum class Known {
            LEGITIMATE,
            SUSPICIOUS,
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
            LEGITIMATE,
            SUSPICIOUS,
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
                LEGITIMATE -> Value.LEGITIMATE
                SUSPICIOUS -> Value.SUSPICIOUS
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
                LEGITIMATE -> Known.LEGITIMATE
                SUSPICIOUS -> Known.SUSPICIOUS
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

        private var validated: Boolean = false

        fun validate(): Prediction = apply {
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

            return other is Prediction && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WatchPredictResponse &&
            id == other.id &&
            prediction == other.prediction &&
            requestId == other.requestId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, prediction, requestId, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WatchPredictResponse{id=$id, prediction=$prediction, requestId=$requestId, additionalProperties=$additionalProperties}"
}

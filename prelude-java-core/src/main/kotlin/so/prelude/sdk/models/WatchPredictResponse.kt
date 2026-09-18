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
import so.prelude.sdk.core.checkKnown
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

class WatchPredictResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val prediction: JsonField<Prediction>,
    private val requestId: JsonField<String>,
    private val riskFactors: JsonField<List<RiskFactor>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("prediction")
        @ExcludeMissing
        prediction: JsonField<Prediction> = JsonMissing.of(),
        @JsonProperty("request_id") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("risk_factors")
        @ExcludeMissing
        riskFactors: JsonField<List<RiskFactor>> = JsonMissing.of(),
    ) : this(id, prediction, requestId, riskFactors, mutableMapOf())

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
     * The risk factors that contributed to the suspicious prediction. Only present when prediction
     * is "suspicious" and the anti-fraud system detected specific risk signals.
     * * `account_risk_profile` - The request matches a risk profile derived from the outcomes
     *   reported on your own account.
     * * `automation_signature` - The request appears to come from an automated client rather than a
     *   person.
     * * `carrier_not_permitted` - The destination carrier is one this account does not accept
     *   traffic for.
     * * `client_fingerprint_mismatch` - The client does not appear to be the platform it identifies
     *   itself as.
     * * `custom_policy` - A rule configured for your account matched this request.
     * * `device_emulator` - The request appears to come from an emulator rather than a physical
     *   device.
     * * `device_not_permitted` - The device platform is one your account blocks.
     * * `device_reuse` - One device is driving verifications for an unusual number of phone
     *   numbers.
     * * `expired_signals` - The SDK signals were collected too long before the request to still
     *   attest to it.
     * * `fraud_database` - The phone number is flagged in one or more of the fraud databases
     *   Prelude consults.
     * * `invalid_signature` - The SDK signature did not verify, so the request cannot be attributed
     *   to the device it claims to come from.
     * * `ip_concentration` - The request shares its origin with an unusual volume of other
     *   verifications.
     * * `ip_reputation` - The originating IP address is not trusted.
     * * `location_mismatch` - The network location and the phone number's country are inconsistent.
     * * `missing_signals` - The verification expected Prelude SDK signals and none arrived.
     * * `number_range_abuse` - The phone number belongs to a range currently associated with abuse.
     * * `poor_conversion_history` - Traffic resembling this request rarely completes a
     *   verification.
     * * `proxy_network` - The request did not arrive over the subscriber's own access network.
     * * `repeated_attempts` - The phone number exceeded the allowed number of verification attempts
     *   in a short period.
     * * `temporary_phone_number` - The phone number belongs to a disposable or short-lived
     *   numbering service.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun riskFactors(): Optional<List<RiskFactor>> = riskFactors.getOptional("risk_factors")

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

    /**
     * Returns the raw JSON value of [riskFactors].
     *
     * Unlike [riskFactors], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("risk_factors")
    @ExcludeMissing
    fun _riskFactors(): JsonField<List<RiskFactor>> = riskFactors

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
        private var riskFactors: JsonField<MutableList<RiskFactor>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(watchPredictResponse: WatchPredictResponse) = apply {
            id = watchPredictResponse.id
            prediction = watchPredictResponse.prediction
            requestId = watchPredictResponse.requestId
            riskFactors = watchPredictResponse.riskFactors.map { it.toMutableList() }
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

        /**
         * The risk factors that contributed to the suspicious prediction. Only present when
         * prediction is "suspicious" and the anti-fraud system detected specific risk signals.
         * * `account_risk_profile` - The request matches a risk profile derived from the outcomes
         *   reported on your own account.
         * * `automation_signature` - The request appears to come from an automated client rather
         *   than a person.
         * * `carrier_not_permitted` - The destination carrier is one this account does not accept
         *   traffic for.
         * * `client_fingerprint_mismatch` - The client does not appear to be the platform it
         *   identifies itself as.
         * * `custom_policy` - A rule configured for your account matched this request.
         * * `device_emulator` - The request appears to come from an emulator rather than a physical
         *   device.
         * * `device_not_permitted` - The device platform is one your account blocks.
         * * `device_reuse` - One device is driving verifications for an unusual number of phone
         *   numbers.
         * * `expired_signals` - The SDK signals were collected too long before the request to still
         *   attest to it.
         * * `fraud_database` - The phone number is flagged in one or more of the fraud databases
         *   Prelude consults.
         * * `invalid_signature` - The SDK signature did not verify, so the request cannot be
         *   attributed to the device it claims to come from.
         * * `ip_concentration` - The request shares its origin with an unusual volume of other
         *   verifications.
         * * `ip_reputation` - The originating IP address is not trusted.
         * * `location_mismatch` - The network location and the phone number's country are
         *   inconsistent.
         * * `missing_signals` - The verification expected Prelude SDK signals and none arrived.
         * * `number_range_abuse` - The phone number belongs to a range currently associated with
         *   abuse.
         * * `poor_conversion_history` - Traffic resembling this request rarely completes a
         *   verification.
         * * `proxy_network` - The request did not arrive over the subscriber's own access network.
         * * `repeated_attempts` - The phone number exceeded the allowed number of verification
         *   attempts in a short period.
         * * `temporary_phone_number` - The phone number belongs to a disposable or short-lived
         *   numbering service.
         */
        fun riskFactors(riskFactors: List<RiskFactor>) = riskFactors(JsonField.of(riskFactors))

        /**
         * Sets [Builder.riskFactors] to an arbitrary JSON value.
         *
         * You should usually call [Builder.riskFactors] with a well-typed `List<RiskFactor>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun riskFactors(riskFactors: JsonField<List<RiskFactor>>) = apply {
            this.riskFactors = riskFactors.map { it.toMutableList() }
        }

        /**
         * Adds a single [RiskFactor] to [riskFactors].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRiskFactor(riskFactor: RiskFactor) = apply {
            riskFactors =
                (riskFactors ?: JsonField.of(mutableListOf())).also {
                    checkKnown("riskFactors", it).add(riskFactor)
                }
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
                (riskFactors ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws PreludeInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): WatchPredictResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        prediction().validate()
        requestId()
        riskFactors().ifPresent { it.forEach { it.validate() } }
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
            (if (requestId.asKnown().isPresent) 1 else 0) +
            (riskFactors.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PreludeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
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

    class RiskFactor @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACCOUNT_RISK_PROFILE = of("account_risk_profile")

            @JvmField val AUTOMATION_SIGNATURE = of("automation_signature")

            @JvmField val CARRIER_NOT_PERMITTED = of("carrier_not_permitted")

            @JvmField val CLIENT_FINGERPRINT_MISMATCH = of("client_fingerprint_mismatch")

            @JvmField val CUSTOM_POLICY = of("custom_policy")

            @JvmField val DEVICE_EMULATOR = of("device_emulator")

            @JvmField val DEVICE_NOT_PERMITTED = of("device_not_permitted")

            @JvmField val DEVICE_REUSE = of("device_reuse")

            @JvmField val EXPIRED_SIGNALS = of("expired_signals")

            @JvmField val FRAUD_DATABASE = of("fraud_database")

            @JvmField val INVALID_SIGNATURE = of("invalid_signature")

            @JvmField val IP_CONCENTRATION = of("ip_concentration")

            @JvmField val IP_REPUTATION = of("ip_reputation")

            @JvmField val LOCATION_MISMATCH = of("location_mismatch")

            @JvmField val MISSING_SIGNALS = of("missing_signals")

            @JvmField val NUMBER_RANGE_ABUSE = of("number_range_abuse")

            @JvmField val POOR_CONVERSION_HISTORY = of("poor_conversion_history")

            @JvmField val PROXY_NETWORK = of("proxy_network")

            @JvmField val REPEATED_ATTEMPTS = of("repeated_attempts")

            @JvmField val TEMPORARY_PHONE_NUMBER = of("temporary_phone_number")

            @JvmStatic fun of(value: String) = RiskFactor(JsonField.of(value))
        }

        /** An enum containing [RiskFactor]'s known values. */
        enum class Known {
            ACCOUNT_RISK_PROFILE,
            AUTOMATION_SIGNATURE,
            CARRIER_NOT_PERMITTED,
            CLIENT_FINGERPRINT_MISMATCH,
            CUSTOM_POLICY,
            DEVICE_EMULATOR,
            DEVICE_NOT_PERMITTED,
            DEVICE_REUSE,
            EXPIRED_SIGNALS,
            FRAUD_DATABASE,
            INVALID_SIGNATURE,
            IP_CONCENTRATION,
            IP_REPUTATION,
            LOCATION_MISMATCH,
            MISSING_SIGNALS,
            NUMBER_RANGE_ABUSE,
            POOR_CONVERSION_HISTORY,
            PROXY_NETWORK,
            REPEATED_ATTEMPTS,
            TEMPORARY_PHONE_NUMBER,
        }

        /**
         * An enum containing [RiskFactor]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RiskFactor] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_RISK_PROFILE,
            AUTOMATION_SIGNATURE,
            CARRIER_NOT_PERMITTED,
            CLIENT_FINGERPRINT_MISMATCH,
            CUSTOM_POLICY,
            DEVICE_EMULATOR,
            DEVICE_NOT_PERMITTED,
            DEVICE_REUSE,
            EXPIRED_SIGNALS,
            FRAUD_DATABASE,
            INVALID_SIGNATURE,
            IP_CONCENTRATION,
            IP_REPUTATION,
            LOCATION_MISMATCH,
            MISSING_SIGNALS,
            NUMBER_RANGE_ABUSE,
            POOR_CONVERSION_HISTORY,
            PROXY_NETWORK,
            REPEATED_ATTEMPTS,
            TEMPORARY_PHONE_NUMBER,
            /**
             * An enum member indicating that [RiskFactor] was instantiated with an unknown value.
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
                ACCOUNT_RISK_PROFILE -> Value.ACCOUNT_RISK_PROFILE
                AUTOMATION_SIGNATURE -> Value.AUTOMATION_SIGNATURE
                CARRIER_NOT_PERMITTED -> Value.CARRIER_NOT_PERMITTED
                CLIENT_FINGERPRINT_MISMATCH -> Value.CLIENT_FINGERPRINT_MISMATCH
                CUSTOM_POLICY -> Value.CUSTOM_POLICY
                DEVICE_EMULATOR -> Value.DEVICE_EMULATOR
                DEVICE_NOT_PERMITTED -> Value.DEVICE_NOT_PERMITTED
                DEVICE_REUSE -> Value.DEVICE_REUSE
                EXPIRED_SIGNALS -> Value.EXPIRED_SIGNALS
                FRAUD_DATABASE -> Value.FRAUD_DATABASE
                INVALID_SIGNATURE -> Value.INVALID_SIGNATURE
                IP_CONCENTRATION -> Value.IP_CONCENTRATION
                IP_REPUTATION -> Value.IP_REPUTATION
                LOCATION_MISMATCH -> Value.LOCATION_MISMATCH
                MISSING_SIGNALS -> Value.MISSING_SIGNALS
                NUMBER_RANGE_ABUSE -> Value.NUMBER_RANGE_ABUSE
                POOR_CONVERSION_HISTORY -> Value.POOR_CONVERSION_HISTORY
                PROXY_NETWORK -> Value.PROXY_NETWORK
                REPEATED_ATTEMPTS -> Value.REPEATED_ATTEMPTS
                TEMPORARY_PHONE_NUMBER -> Value.TEMPORARY_PHONE_NUMBER
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
                ACCOUNT_RISK_PROFILE -> Known.ACCOUNT_RISK_PROFILE
                AUTOMATION_SIGNATURE -> Known.AUTOMATION_SIGNATURE
                CARRIER_NOT_PERMITTED -> Known.CARRIER_NOT_PERMITTED
                CLIENT_FINGERPRINT_MISMATCH -> Known.CLIENT_FINGERPRINT_MISMATCH
                CUSTOM_POLICY -> Known.CUSTOM_POLICY
                DEVICE_EMULATOR -> Known.DEVICE_EMULATOR
                DEVICE_NOT_PERMITTED -> Known.DEVICE_NOT_PERMITTED
                DEVICE_REUSE -> Known.DEVICE_REUSE
                EXPIRED_SIGNALS -> Known.EXPIRED_SIGNALS
                FRAUD_DATABASE -> Known.FRAUD_DATABASE
                INVALID_SIGNATURE -> Known.INVALID_SIGNATURE
                IP_CONCENTRATION -> Known.IP_CONCENTRATION
                IP_REPUTATION -> Known.IP_REPUTATION
                LOCATION_MISMATCH -> Known.LOCATION_MISMATCH
                MISSING_SIGNALS -> Known.MISSING_SIGNALS
                NUMBER_RANGE_ABUSE -> Known.NUMBER_RANGE_ABUSE
                POOR_CONVERSION_HISTORY -> Known.POOR_CONVERSION_HISTORY
                PROXY_NETWORK -> Known.PROXY_NETWORK
                REPEATED_ATTEMPTS -> Known.REPEATED_ATTEMPTS
                TEMPORARY_PHONE_NUMBER -> Known.TEMPORARY_PHONE_NUMBER
                else -> throw PreludeInvalidDataException("Unknown RiskFactor: $value")
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

        /**
         * Validates that the types of all values in this object match their expected types
         * recursively.
         *
         * This method is _not_ forwards compatible with new types from the API for existing fields.
         *
         * @throws PreludeInvalidDataException if any value type in this object doesn't match its
         *   expected type.
         */
        fun validate(): RiskFactor = apply {
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

            return other is RiskFactor && value == other.value
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
            riskFactors == other.riskFactors &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, prediction, requestId, riskFactors, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WatchPredictResponse{id=$id, prediction=$prediction, requestId=$requestId, riskFactors=$riskFactors, additionalProperties=$additionalProperties}"
}

// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
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

/** A verification and everything Prelude recorded about it. */
class VerificationPhoneHistoryRetrieveResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val phoneNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val appVersion: JsonField<String>,
    private val blockReasons: JsonField<List<BlockReason>>,
    private val carrier: JsonField<PhoneVerificationCarrier>,
    private val correlationId: JsonField<String>,
    private val deviceModel: JsonField<String>,
    private val devicePlatform: JsonField<DevicePlatform>,
    private val ipAddress: JsonField<String>,
    private val ipAddressRegion: JsonField<String>,
    private val ipDistanceMeters: JsonField<Long>,
    private val lifecycle: JsonField<Lifecycle>,
    private val phoneNumberCondition: JsonField<PhoneNumberCondition>,
    private val phoneNumberCurrentCondition: JsonField<PhoneNumberCurrentCondition>,
    private val phoneNumberRegion: JsonField<String>,
    private val signals: JsonField<Signals>,
    private val signalsHashStatus: JsonField<SignalsHashStatus>,
    private val templateId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("app_version")
        @ExcludeMissing
        appVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("block_reasons")
        @ExcludeMissing
        blockReasons: JsonField<List<BlockReason>> = JsonMissing.of(),
        @JsonProperty("carrier")
        @ExcludeMissing
        carrier: JsonField<PhoneVerificationCarrier> = JsonMissing.of(),
        @JsonProperty("correlation_id")
        @ExcludeMissing
        correlationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_model")
        @ExcludeMissing
        deviceModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_platform")
        @ExcludeMissing
        devicePlatform: JsonField<DevicePlatform> = JsonMissing.of(),
        @JsonProperty("ip_address") @ExcludeMissing ipAddress: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ip_address_region")
        @ExcludeMissing
        ipAddressRegion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("ip_distance_meters")
        @ExcludeMissing
        ipDistanceMeters: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("lifecycle")
        @ExcludeMissing
        lifecycle: JsonField<Lifecycle> = JsonMissing.of(),
        @JsonProperty("phone_number_condition")
        @ExcludeMissing
        phoneNumberCondition: JsonField<PhoneNumberCondition> = JsonMissing.of(),
        @JsonProperty("phone_number_current_condition")
        @ExcludeMissing
        phoneNumberCurrentCondition: JsonField<PhoneNumberCurrentCondition> = JsonMissing.of(),
        @JsonProperty("phone_number_region")
        @ExcludeMissing
        phoneNumberRegion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("signals") @ExcludeMissing signals: JsonField<Signals> = JsonMissing.of(),
        @JsonProperty("signals_hash_status")
        @ExcludeMissing
        signalsHashStatus: JsonField<SignalsHashStatus> = JsonMissing.of(),
        @JsonProperty("template_id")
        @ExcludeMissing
        templateId: JsonField<String> = JsonMissing.of(),
    ) : this(
        id,
        createdAt,
        expiresAt,
        phoneNumber,
        status,
        appVersion,
        blockReasons,
        carrier,
        correlationId,
        deviceModel,
        devicePlatform,
        ipAddress,
        ipAddressRegion,
        ipDistanceMeters,
        lifecycle,
        phoneNumberCondition,
        phoneNumberCurrentCondition,
        phoneNumberRegion,
        signals,
        signalsHashStatus,
        templateId,
        mutableMapOf(),
    )

    /**
     * The verification identifier.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /**
     * The E.164 phone number the verification targeted.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun phoneNumber(): String = phoneNumber.getRequired("phone_number")

    /**
     * The outcome of the verification.
     * * `converted` - The end user submitted a valid code.
     * * `not_converted` - The verification expired without a valid code.
     * * `pending_check` - A code was delivered and Prelude is still waiting for a check.
     * * `sent` - A code was sent and the verification window is still open.
     * * `challenged` - The verification was restricted to non-SMS and non-voice channels.
     * * `suspected_fraud` - The anti-fraud system blocked the verification.
     * * `in_blocklist` - The phone number is on the configured block list.
     * * `invalid_line` - The phone number is not a valid line type.
     * * `invalid_number` - The phone number is not a valid number.
     * * `rate_limited` - The verification was refused by a rate limit.
     * * `expired_signals` - The SDK signals were collected too long before the request.
     * * `shadowed` - The anti-fraud system flagged the verification without blocking it.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * Version of your application, when known.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun appVersion(): Optional<String> = appVersion.getOptional("app_version")

    /**
     * Why the anti-fraud system blocked the verification. Empty unless it did.
     * * `behavioral_pattern` - The phone number past behavior during verification flows exhibits
     *   suspicious patterns.
     * * `device_attribute` - The end-user device reported attributes associated with fraud or
     *   emulation.
     * * `fraud_database` - The phone number appears in a fraud database.
     * * `location_discrepancy` - The phone number region and the observed location disagree.
     * * `missing_signals` - The verification expected Prelude SDK signals and none arrived.
     * * `network_fingerprint` - The network fingerprint matches known fraudulent traffic.
     * * `poor_conversion_history` - The phone number rarely completes the verifications it starts.
     * * `prefix_concentration` - The phone number is part of a range known to be associated with
     *   suspicious activity patterns.
     * * `repeated_number` - The phone number was used far more often than normal traffic would
     *   explain.
     * * `suspected_request_tampering` - The SDK signals were altered or expired between collection
     *   and use.
     * * `suspicious_ip_address` - The originating IP address is associated with suspicious
     *   activity.
     * * `temporary_phone_number` - The phone number is known to be a temporary or disposable
     *   number.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blockReasons(): Optional<List<BlockReason>> = blockReasons.getOptional("block_reasons")

    /**
     * The end user's mobile network.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun carrier(): Optional<PhoneVerificationCarrier> = carrier.getOptional("carrier")

    /**
     * The correlation identifier you supplied when creating the verification.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correlationId(): Optional<String> = correlationId.getOptional("correlation_id")

    /**
     * Model of the end-user device, when known.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun deviceModel(): Optional<String> = deviceModel.getOptional("device_model")

    /**
     * Platform of the end-user device, when known.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun devicePlatform(): Optional<DevicePlatform> = devicePlatform.getOptional("device_platform")

    /**
     * IP address the verification was created from.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddress(): Optional<String> = ipAddress.getOptional("ip_address")

    /**
     * ISO 3166-1 alpha-2 region of the caller's IP address.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipAddressRegion(): Optional<String> = ipAddressRegion.getOptional("ip_address_region")

    /**
     * Distance between the phone number region and the IP location.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ipDistanceMeters(): Optional<Long> = ipDistanceMeters.getOptional("ip_distance_meters")

    /**
     * Chronological timeline of the verification: creation, message attempts with delivery events,
     * code checks and signals reception. Omitted when Prelude holds no timeline for the
     * verification.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lifecycle(): Optional<Lifecycle> = lifecycle.getOptional("lifecycle")

    /**
     * Whether the phone number was allow-listed, block-listed, or sandboxed at verification time.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberCondition(): Optional<PhoneNumberCondition> =
        phoneNumberCondition.getOptional("phone_number_condition")

    /**
     * Whether the phone number is currently allow-listed, block-listed, or sandboxed.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberCurrentCondition(): Optional<PhoneNumberCurrentCondition> =
        phoneNumberCurrentCondition.getOptional("phone_number_current_condition")

    /**
     * ISO 3166-1 alpha-2 region of the phone number.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumberRegion(): Optional<String> = phoneNumberRegion.getOptional("phone_number_region")

    /**
     * The anti-fraud signals you forwarded when creating the verification.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signals(): Optional<Signals> = signals.getOptional("signals")

    /**
     * Whether the SDK signals integrity check passed.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun signalsHashStatus(): Optional<SignalsHashStatus> =
        signalsHashStatus.getOptional("signals_hash_status")

    /**
     * The template used for this verification.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun templateId(): Optional<String> = templateId.getOptional("template_id")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [appVersion].
     *
     * Unlike [appVersion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("app_version") @ExcludeMissing fun _appVersion(): JsonField<String> = appVersion

    /**
     * Returns the raw JSON value of [blockReasons].
     *
     * Unlike [blockReasons], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("block_reasons")
    @ExcludeMissing
    fun _blockReasons(): JsonField<List<BlockReason>> = blockReasons

    /**
     * Returns the raw JSON value of [carrier].
     *
     * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("carrier")
    @ExcludeMissing
    fun _carrier(): JsonField<PhoneVerificationCarrier> = carrier

    /**
     * Returns the raw JSON value of [correlationId].
     *
     * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("correlation_id")
    @ExcludeMissing
    fun _correlationId(): JsonField<String> = correlationId

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
     * Unlike [devicePlatform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_platform")
    @ExcludeMissing
    fun _devicePlatform(): JsonField<DevicePlatform> = devicePlatform

    /**
     * Returns the raw JSON value of [ipAddress].
     *
     * Unlike [ipAddress], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ip_address") @ExcludeMissing fun _ipAddress(): JsonField<String> = ipAddress

    /**
     * Returns the raw JSON value of [ipAddressRegion].
     *
     * Unlike [ipAddressRegion], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ip_address_region")
    @ExcludeMissing
    fun _ipAddressRegion(): JsonField<String> = ipAddressRegion

    /**
     * Returns the raw JSON value of [ipDistanceMeters].
     *
     * Unlike [ipDistanceMeters], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("ip_distance_meters")
    @ExcludeMissing
    fun _ipDistanceMeters(): JsonField<Long> = ipDistanceMeters

    /**
     * Returns the raw JSON value of [lifecycle].
     *
     * Unlike [lifecycle], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("lifecycle") @ExcludeMissing fun _lifecycle(): JsonField<Lifecycle> = lifecycle

    /**
     * Returns the raw JSON value of [phoneNumberCondition].
     *
     * Unlike [phoneNumberCondition], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("phone_number_condition")
    @ExcludeMissing
    fun _phoneNumberCondition(): JsonField<PhoneNumberCondition> = phoneNumberCondition

    /**
     * Returns the raw JSON value of [phoneNumberCurrentCondition].
     *
     * Unlike [phoneNumberCurrentCondition], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("phone_number_current_condition")
    @ExcludeMissing
    fun _phoneNumberCurrentCondition(): JsonField<PhoneNumberCurrentCondition> =
        phoneNumberCurrentCondition

    /**
     * Returns the raw JSON value of [phoneNumberRegion].
     *
     * Unlike [phoneNumberRegion], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("phone_number_region")
    @ExcludeMissing
    fun _phoneNumberRegion(): JsonField<String> = phoneNumberRegion

    /**
     * Returns the raw JSON value of [signals].
     *
     * Unlike [signals], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("signals") @ExcludeMissing fun _signals(): JsonField<Signals> = signals

    /**
     * Returns the raw JSON value of [signalsHashStatus].
     *
     * Unlike [signalsHashStatus], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("signals_hash_status")
    @ExcludeMissing
    fun _signalsHashStatus(): JsonField<SignalsHashStatus> = signalsHashStatus

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("template_id") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

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
         * Returns a mutable builder for constructing an instance of
         * [VerificationPhoneHistoryRetrieveResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .expiresAt()
         * .phoneNumber()
         * .status()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [VerificationPhoneHistoryRetrieveResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var phoneNumber: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var appVersion: JsonField<String> = JsonMissing.of()
        private var blockReasons: JsonField<MutableList<BlockReason>>? = null
        private var carrier: JsonField<PhoneVerificationCarrier> = JsonMissing.of()
        private var correlationId: JsonField<String> = JsonMissing.of()
        private var deviceModel: JsonField<String> = JsonMissing.of()
        private var devicePlatform: JsonField<DevicePlatform> = JsonMissing.of()
        private var ipAddress: JsonField<String> = JsonMissing.of()
        private var ipAddressRegion: JsonField<String> = JsonMissing.of()
        private var ipDistanceMeters: JsonField<Long> = JsonMissing.of()
        private var lifecycle: JsonField<Lifecycle> = JsonMissing.of()
        private var phoneNumberCondition: JsonField<PhoneNumberCondition> = JsonMissing.of()
        private var phoneNumberCurrentCondition: JsonField<PhoneNumberCurrentCondition> =
            JsonMissing.of()
        private var phoneNumberRegion: JsonField<String> = JsonMissing.of()
        private var signals: JsonField<Signals> = JsonMissing.of()
        private var signalsHashStatus: JsonField<SignalsHashStatus> = JsonMissing.of()
        private var templateId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            verificationPhoneHistoryRetrieveResponse: VerificationPhoneHistoryRetrieveResponse
        ) = apply {
            id = verificationPhoneHistoryRetrieveResponse.id
            createdAt = verificationPhoneHistoryRetrieveResponse.createdAt
            expiresAt = verificationPhoneHistoryRetrieveResponse.expiresAt
            phoneNumber = verificationPhoneHistoryRetrieveResponse.phoneNumber
            status = verificationPhoneHistoryRetrieveResponse.status
            appVersion = verificationPhoneHistoryRetrieveResponse.appVersion
            blockReasons =
                verificationPhoneHistoryRetrieveResponse.blockReasons.map { it.toMutableList() }
            carrier = verificationPhoneHistoryRetrieveResponse.carrier
            correlationId = verificationPhoneHistoryRetrieveResponse.correlationId
            deviceModel = verificationPhoneHistoryRetrieveResponse.deviceModel
            devicePlatform = verificationPhoneHistoryRetrieveResponse.devicePlatform
            ipAddress = verificationPhoneHistoryRetrieveResponse.ipAddress
            ipAddressRegion = verificationPhoneHistoryRetrieveResponse.ipAddressRegion
            ipDistanceMeters = verificationPhoneHistoryRetrieveResponse.ipDistanceMeters
            lifecycle = verificationPhoneHistoryRetrieveResponse.lifecycle
            phoneNumberCondition = verificationPhoneHistoryRetrieveResponse.phoneNumberCondition
            phoneNumberCurrentCondition =
                verificationPhoneHistoryRetrieveResponse.phoneNumberCurrentCondition
            phoneNumberRegion = verificationPhoneHistoryRetrieveResponse.phoneNumberRegion
            signals = verificationPhoneHistoryRetrieveResponse.signals
            signalsHashStatus = verificationPhoneHistoryRetrieveResponse.signalsHashStatus
            templateId = verificationPhoneHistoryRetrieveResponse.templateId
            additionalProperties =
                verificationPhoneHistoryRetrieveResponse.additionalProperties.toMutableMap()
        }

        /** The verification identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** The E.164 phone number the verification targeted. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

        /**
         * The outcome of the verification.
         * * `converted` - The end user submitted a valid code.
         * * `not_converted` - The verification expired without a valid code.
         * * `pending_check` - A code was delivered and Prelude is still waiting for a check.
         * * `sent` - A code was sent and the verification window is still open.
         * * `challenged` - The verification was restricted to non-SMS and non-voice channels.
         * * `suspected_fraud` - The anti-fraud system blocked the verification.
         * * `in_blocklist` - The phone number is on the configured block list.
         * * `invalid_line` - The phone number is not a valid line type.
         * * `invalid_number` - The phone number is not a valid number.
         * * `rate_limited` - The verification was refused by a rate limit.
         * * `expired_signals` - The SDK signals were collected too long before the request.
         * * `shadowed` - The anti-fraud system flagged the verification without blocking it.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Version of your application, when known. */
        fun appVersion(appVersion: String) = appVersion(JsonField.of(appVersion))

        /**
         * Sets [Builder.appVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.appVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun appVersion(appVersion: JsonField<String>) = apply { this.appVersion = appVersion }

        /**
         * Why the anti-fraud system blocked the verification. Empty unless it did.
         * * `behavioral_pattern` - The phone number past behavior during verification flows
         *   exhibits suspicious patterns.
         * * `device_attribute` - The end-user device reported attributes associated with fraud or
         *   emulation.
         * * `fraud_database` - The phone number appears in a fraud database.
         * * `location_discrepancy` - The phone number region and the observed location disagree.
         * * `missing_signals` - The verification expected Prelude SDK signals and none arrived.
         * * `network_fingerprint` - The network fingerprint matches known fraudulent traffic.
         * * `poor_conversion_history` - The phone number rarely completes the verifications it
         *   starts.
         * * `prefix_concentration` - The phone number is part of a range known to be associated
         *   with suspicious activity patterns.
         * * `repeated_number` - The phone number was used far more often than normal traffic would
         *   explain.
         * * `suspected_request_tampering` - The SDK signals were altered or expired between
         *   collection and use.
         * * `suspicious_ip_address` - The originating IP address is associated with suspicious
         *   activity.
         * * `temporary_phone_number` - The phone number is known to be a temporary or disposable
         *   number.
         */
        fun blockReasons(blockReasons: List<BlockReason>) = blockReasons(JsonField.of(blockReasons))

        /**
         * Sets [Builder.blockReasons] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockReasons] with a well-typed `List<BlockReason>`
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun blockReasons(blockReasons: JsonField<List<BlockReason>>) = apply {
            this.blockReasons = blockReasons.map { it.toMutableList() }
        }

        /**
         * Adds a single [BlockReason] to [blockReasons].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockReason(blockReason: BlockReason) = apply {
            blockReasons =
                (blockReasons ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockReasons", it).add(blockReason)
                }
        }

        /** The end user's mobile network. */
        fun carrier(carrier: PhoneVerificationCarrier) = carrier(JsonField.of(carrier))

        /**
         * Sets [Builder.carrier] to an arbitrary JSON value.
         *
         * You should usually call [Builder.carrier] with a well-typed [PhoneVerificationCarrier]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun carrier(carrier: JsonField<PhoneVerificationCarrier>) = apply { this.carrier = carrier }

        /** The correlation identifier you supplied when creating the verification. */
        fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

        /**
         * Sets [Builder.correlationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correlationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correlationId(correlationId: JsonField<String>) = apply {
            this.correlationId = correlationId
        }

        /** Model of the end-user device, when known. */
        fun deviceModel(deviceModel: String) = deviceModel(JsonField.of(deviceModel))

        /**
         * Sets [Builder.deviceModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deviceModel(deviceModel: JsonField<String>) = apply { this.deviceModel = deviceModel }

        /** Platform of the end-user device, when known. */
        fun devicePlatform(devicePlatform: DevicePlatform) =
            devicePlatform(JsonField.of(devicePlatform))

        /**
         * Sets [Builder.devicePlatform] to an arbitrary JSON value.
         *
         * You should usually call [Builder.devicePlatform] with a well-typed [DevicePlatform] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun devicePlatform(devicePlatform: JsonField<DevicePlatform>) = apply {
            this.devicePlatform = devicePlatform
        }

        /** IP address the verification was created from. */
        fun ipAddress(ipAddress: String) = ipAddress(JsonField.of(ipAddress))

        /**
         * Sets [Builder.ipAddress] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddress] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun ipAddress(ipAddress: JsonField<String>) = apply { this.ipAddress = ipAddress }

        /** ISO 3166-1 alpha-2 region of the caller's IP address. */
        fun ipAddressRegion(ipAddressRegion: String) =
            ipAddressRegion(JsonField.of(ipAddressRegion))

        /**
         * Sets [Builder.ipAddressRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipAddressRegion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ipAddressRegion(ipAddressRegion: JsonField<String>) = apply {
            this.ipAddressRegion = ipAddressRegion
        }

        /** Distance between the phone number region and the IP location. */
        fun ipDistanceMeters(ipDistanceMeters: Long) =
            ipDistanceMeters(JsonField.of(ipDistanceMeters))

        /**
         * Sets [Builder.ipDistanceMeters] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ipDistanceMeters] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun ipDistanceMeters(ipDistanceMeters: JsonField<Long>) = apply {
            this.ipDistanceMeters = ipDistanceMeters
        }

        /**
         * Chronological timeline of the verification: creation, message attempts with delivery
         * events, code checks and signals reception. Omitted when Prelude holds no timeline for the
         * verification.
         */
        fun lifecycle(lifecycle: Lifecycle) = lifecycle(JsonField.of(lifecycle))

        /**
         * Sets [Builder.lifecycle] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lifecycle] with a well-typed [Lifecycle] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lifecycle(lifecycle: JsonField<Lifecycle>) = apply { this.lifecycle = lifecycle }

        /**
         * Whether the phone number was allow-listed, block-listed, or sandboxed at verification
         * time.
         */
        fun phoneNumberCondition(phoneNumberCondition: PhoneNumberCondition) =
            phoneNumberCondition(JsonField.of(phoneNumberCondition))

        /**
         * Sets [Builder.phoneNumberCondition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberCondition] with a well-typed
         * [PhoneNumberCondition] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun phoneNumberCondition(phoneNumberCondition: JsonField<PhoneNumberCondition>) = apply {
            this.phoneNumberCondition = phoneNumberCondition
        }

        /** Whether the phone number is currently allow-listed, block-listed, or sandboxed. */
        fun phoneNumberCurrentCondition(phoneNumberCurrentCondition: PhoneNumberCurrentCondition) =
            phoneNumberCurrentCondition(JsonField.of(phoneNumberCurrentCondition))

        /**
         * Sets [Builder.phoneNumberCurrentCondition] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberCurrentCondition] with a well-typed
         * [PhoneNumberCurrentCondition] value instead. This method is primarily for setting the
         * field to an undocumented or not yet supported value.
         */
        fun phoneNumberCurrentCondition(
            phoneNumberCurrentCondition: JsonField<PhoneNumberCurrentCondition>
        ) = apply { this.phoneNumberCurrentCondition = phoneNumberCurrentCondition }

        /** ISO 3166-1 alpha-2 region of the phone number. */
        fun phoneNumberRegion(phoneNumberRegion: String) =
            phoneNumberRegion(JsonField.of(phoneNumberRegion))

        /**
         * Sets [Builder.phoneNumberRegion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumberRegion] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun phoneNumberRegion(phoneNumberRegion: JsonField<String>) = apply {
            this.phoneNumberRegion = phoneNumberRegion
        }

        /** The anti-fraud signals you forwarded when creating the verification. */
        fun signals(signals: Signals) = signals(JsonField.of(signals))

        /**
         * Sets [Builder.signals] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signals] with a well-typed [Signals] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun signals(signals: JsonField<Signals>) = apply { this.signals = signals }

        /** Whether the SDK signals integrity check passed. */
        fun signalsHashStatus(signalsHashStatus: SignalsHashStatus) =
            signalsHashStatus(JsonField.of(signalsHashStatus))

        /**
         * Sets [Builder.signalsHashStatus] to an arbitrary JSON value.
         *
         * You should usually call [Builder.signalsHashStatus] with a well-typed [SignalsHashStatus]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun signalsHashStatus(signalsHashStatus: JsonField<SignalsHashStatus>) = apply {
            this.signalsHashStatus = signalsHashStatus
        }

        /** The template used for this verification. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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

        /**
         * Returns an immutable instance of [VerificationPhoneHistoryRetrieveResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .createdAt()
         * .expiresAt()
         * .phoneNumber()
         * .status()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): VerificationPhoneHistoryRetrieveResponse =
            VerificationPhoneHistoryRetrieveResponse(
                checkRequired("id", id),
                checkRequired("createdAt", createdAt),
                checkRequired("expiresAt", expiresAt),
                checkRequired("phoneNumber", phoneNumber),
                checkRequired("status", status),
                appVersion,
                (blockReasons ?: JsonMissing.of()).map { it.toImmutable() },
                carrier,
                correlationId,
                deviceModel,
                devicePlatform,
                ipAddress,
                ipAddressRegion,
                ipDistanceMeters,
                lifecycle,
                phoneNumberCondition,
                phoneNumberCurrentCondition,
                phoneNumberRegion,
                signals,
                signalsHashStatus,
                templateId,
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
    fun validate(): VerificationPhoneHistoryRetrieveResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        createdAt()
        expiresAt()
        phoneNumber()
        status().validate()
        appVersion()
        blockReasons().ifPresent { it.forEach { it.validate() } }
        carrier().ifPresent { it.validate() }
        correlationId()
        deviceModel()
        devicePlatform().ifPresent { it.validate() }
        ipAddress()
        ipAddressRegion()
        ipDistanceMeters()
        lifecycle().ifPresent { it.validate() }
        phoneNumberCondition().ifPresent { it.validate() }
        phoneNumberCurrentCondition().ifPresent { it.validate() }
        phoneNumberRegion()
        signals().ifPresent { it.validate() }
        signalsHashStatus().ifPresent { it.validate() }
        templateId()
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
            (if (createdAt.asKnown().isPresent) 1 else 0) +
            (if (expiresAt.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (if (appVersion.asKnown().isPresent) 1 else 0) +
            (blockReasons.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (carrier.asKnown().getOrNull()?.validity() ?: 0) +
            (if (correlationId.asKnown().isPresent) 1 else 0) +
            (if (deviceModel.asKnown().isPresent) 1 else 0) +
            (devicePlatform.asKnown().getOrNull()?.validity() ?: 0) +
            (if (ipAddress.asKnown().isPresent) 1 else 0) +
            (if (ipAddressRegion.asKnown().isPresent) 1 else 0) +
            (if (ipDistanceMeters.asKnown().isPresent) 1 else 0) +
            (lifecycle.asKnown().getOrNull()?.validity() ?: 0) +
            (phoneNumberCondition.asKnown().getOrNull()?.validity() ?: 0) +
            (phoneNumberCurrentCondition.asKnown().getOrNull()?.validity() ?: 0) +
            (if (phoneNumberRegion.asKnown().isPresent) 1 else 0) +
            (signals.asKnown().getOrNull()?.validity() ?: 0) +
            (signalsHashStatus.asKnown().getOrNull()?.validity() ?: 0) +
            (if (templateId.asKnown().isPresent) 1 else 0)

    /**
     * The outcome of the verification.
     * * `converted` - The end user submitted a valid code.
     * * `not_converted` - The verification expired without a valid code.
     * * `pending_check` - A code was delivered and Prelude is still waiting for a check.
     * * `sent` - A code was sent and the verification window is still open.
     * * `challenged` - The verification was restricted to non-SMS and non-voice channels.
     * * `suspected_fraud` - The anti-fraud system blocked the verification.
     * * `in_blocklist` - The phone number is on the configured block list.
     * * `invalid_line` - The phone number is not a valid line type.
     * * `invalid_number` - The phone number is not a valid number.
     * * `rate_limited` - The verification was refused by a rate limit.
     * * `expired_signals` - The SDK signals were collected too long before the request.
     * * `shadowed` - The anti-fraud system flagged the verification without blocking it.
     */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CONVERTED = of("converted")

            @JvmField val NOT_CONVERTED = of("not_converted")

            @JvmField val PENDING_CHECK = of("pending_check")

            @JvmField val SENT = of("sent")

            @JvmField val CHALLENGED = of("challenged")

            @JvmField val SUSPECTED_FRAUD = of("suspected_fraud")

            @JvmField val IN_BLOCKLIST = of("in_blocklist")

            @JvmField val INVALID_LINE = of("invalid_line")

            @JvmField val INVALID_NUMBER = of("invalid_number")

            @JvmField val RATE_LIMITED = of("rate_limited")

            @JvmField val EXPIRED_SIGNALS = of("expired_signals")

            @JvmField val SHADOWED = of("shadowed")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            CONVERTED,
            NOT_CONVERTED,
            PENDING_CHECK,
            SENT,
            CHALLENGED,
            SUSPECTED_FRAUD,
            IN_BLOCKLIST,
            INVALID_LINE,
            INVALID_NUMBER,
            RATE_LIMITED,
            EXPIRED_SIGNALS,
            SHADOWED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CONVERTED,
            NOT_CONVERTED,
            PENDING_CHECK,
            SENT,
            CHALLENGED,
            SUSPECTED_FRAUD,
            IN_BLOCKLIST,
            INVALID_LINE,
            INVALID_NUMBER,
            RATE_LIMITED,
            EXPIRED_SIGNALS,
            SHADOWED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                CONVERTED -> Value.CONVERTED
                NOT_CONVERTED -> Value.NOT_CONVERTED
                PENDING_CHECK -> Value.PENDING_CHECK
                SENT -> Value.SENT
                CHALLENGED -> Value.CHALLENGED
                SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                IN_BLOCKLIST -> Value.IN_BLOCKLIST
                INVALID_LINE -> Value.INVALID_LINE
                INVALID_NUMBER -> Value.INVALID_NUMBER
                RATE_LIMITED -> Value.RATE_LIMITED
                EXPIRED_SIGNALS -> Value.EXPIRED_SIGNALS
                SHADOWED -> Value.SHADOWED
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
                CONVERTED -> Known.CONVERTED
                NOT_CONVERTED -> Known.NOT_CONVERTED
                PENDING_CHECK -> Known.PENDING_CHECK
                SENT -> Known.SENT
                CHALLENGED -> Known.CHALLENGED
                SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                IN_BLOCKLIST -> Known.IN_BLOCKLIST
                INVALID_LINE -> Known.INVALID_LINE
                INVALID_NUMBER -> Known.INVALID_NUMBER
                RATE_LIMITED -> Known.RATE_LIMITED
                EXPIRED_SIGNALS -> Known.EXPIRED_SIGNALS
                SHADOWED -> Known.SHADOWED
                else -> throw PreludeInvalidDataException("Unknown Status: $value")
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
        fun validate(): Status = apply {
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

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class BlockReason @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val BEHAVIORAL_PATTERN = of("behavioral_pattern")

            @JvmField val DEVICE_ATTRIBUTE = of("device_attribute")

            @JvmField val FRAUD_DATABASE = of("fraud_database")

            @JvmField val LOCATION_DISCREPANCY = of("location_discrepancy")

            @JvmField val MISSING_SIGNALS = of("missing_signals")

            @JvmField val NETWORK_FINGERPRINT = of("network_fingerprint")

            @JvmField val POOR_CONVERSION_HISTORY = of("poor_conversion_history")

            @JvmField val PREFIX_CONCENTRATION = of("prefix_concentration")

            @JvmField val REPEATED_NUMBER = of("repeated_number")

            @JvmField val SUSPECTED_REQUEST_TAMPERING = of("suspected_request_tampering")

            @JvmField val SUSPICIOUS_IP_ADDRESS = of("suspicious_ip_address")

            @JvmField val TEMPORARY_PHONE_NUMBER = of("temporary_phone_number")

            @JvmStatic fun of(value: String) = BlockReason(JsonField.of(value))
        }

        /** An enum containing [BlockReason]'s known values. */
        enum class Known {
            BEHAVIORAL_PATTERN,
            DEVICE_ATTRIBUTE,
            FRAUD_DATABASE,
            LOCATION_DISCREPANCY,
            MISSING_SIGNALS,
            NETWORK_FINGERPRINT,
            POOR_CONVERSION_HISTORY,
            PREFIX_CONCENTRATION,
            REPEATED_NUMBER,
            SUSPECTED_REQUEST_TAMPERING,
            SUSPICIOUS_IP_ADDRESS,
            TEMPORARY_PHONE_NUMBER,
        }

        /**
         * An enum containing [BlockReason]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BlockReason] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BEHAVIORAL_PATTERN,
            DEVICE_ATTRIBUTE,
            FRAUD_DATABASE,
            LOCATION_DISCREPANCY,
            MISSING_SIGNALS,
            NETWORK_FINGERPRINT,
            POOR_CONVERSION_HISTORY,
            PREFIX_CONCENTRATION,
            REPEATED_NUMBER,
            SUSPECTED_REQUEST_TAMPERING,
            SUSPICIOUS_IP_ADDRESS,
            TEMPORARY_PHONE_NUMBER,
            /**
             * An enum member indicating that [BlockReason] was instantiated with an unknown value.
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
                BEHAVIORAL_PATTERN -> Value.BEHAVIORAL_PATTERN
                DEVICE_ATTRIBUTE -> Value.DEVICE_ATTRIBUTE
                FRAUD_DATABASE -> Value.FRAUD_DATABASE
                LOCATION_DISCREPANCY -> Value.LOCATION_DISCREPANCY
                MISSING_SIGNALS -> Value.MISSING_SIGNALS
                NETWORK_FINGERPRINT -> Value.NETWORK_FINGERPRINT
                POOR_CONVERSION_HISTORY -> Value.POOR_CONVERSION_HISTORY
                PREFIX_CONCENTRATION -> Value.PREFIX_CONCENTRATION
                REPEATED_NUMBER -> Value.REPEATED_NUMBER
                SUSPECTED_REQUEST_TAMPERING -> Value.SUSPECTED_REQUEST_TAMPERING
                SUSPICIOUS_IP_ADDRESS -> Value.SUSPICIOUS_IP_ADDRESS
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
                BEHAVIORAL_PATTERN -> Known.BEHAVIORAL_PATTERN
                DEVICE_ATTRIBUTE -> Known.DEVICE_ATTRIBUTE
                FRAUD_DATABASE -> Known.FRAUD_DATABASE
                LOCATION_DISCREPANCY -> Known.LOCATION_DISCREPANCY
                MISSING_SIGNALS -> Known.MISSING_SIGNALS
                NETWORK_FINGERPRINT -> Known.NETWORK_FINGERPRINT
                POOR_CONVERSION_HISTORY -> Known.POOR_CONVERSION_HISTORY
                PREFIX_CONCENTRATION -> Known.PREFIX_CONCENTRATION
                REPEATED_NUMBER -> Known.REPEATED_NUMBER
                SUSPECTED_REQUEST_TAMPERING -> Known.SUSPECTED_REQUEST_TAMPERING
                SUSPICIOUS_IP_ADDRESS -> Known.SUSPICIOUS_IP_ADDRESS
                TEMPORARY_PHONE_NUMBER -> Known.TEMPORARY_PHONE_NUMBER
                else -> throw PreludeInvalidDataException("Unknown BlockReason: $value")
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
        fun validate(): BlockReason = apply {
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

            return other is BlockReason && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Platform of the end-user device, when known. */
    class DevicePlatform @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
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
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
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
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
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

    /**
     * Chronological timeline of the verification: creation, message attempts with delivery events,
     * code checks and signals reception. Omitted when Prelude holds no timeline for the
     * verification.
     */
    class Lifecycle
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val events: JsonField<List<Event>>,
        private val totalCost: JsonField<PhoneVerificationMoney>,
        private val undeliverableRouteCount: JsonField<Long>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("events")
            @ExcludeMissing
            events: JsonField<List<Event>> = JsonMissing.of(),
            @JsonProperty("total_cost")
            @ExcludeMissing
            totalCost: JsonField<PhoneVerificationMoney> = JsonMissing.of(),
            @JsonProperty("undeliverable_route_count")
            @ExcludeMissing
            undeliverableRouteCount: JsonField<Long> = JsonMissing.of(),
        ) : this(events, totalCost, undeliverableRouteCount, mutableMapOf())

        /**
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun events(): List<Event> = events.getRequired("events")

        /**
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun totalCost(): Optional<PhoneVerificationMoney> = totalCost.getOptional("total_cost")

        /**
         * How many times the message was reported undeliverable by independent routes. Above zero
         * usually means the phone number is incorrect or the device unreachable.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun undeliverableRouteCount(): Optional<Long> =
            undeliverableRouteCount.getOptional("undeliverable_route_count")

        /**
         * Returns the raw JSON value of [events].
         *
         * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("events") @ExcludeMissing fun _events(): JsonField<List<Event>> = events

        /**
         * Returns the raw JSON value of [totalCost].
         *
         * Unlike [totalCost], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("total_cost")
        @ExcludeMissing
        fun _totalCost(): JsonField<PhoneVerificationMoney> = totalCost

        /**
         * Returns the raw JSON value of [undeliverableRouteCount].
         *
         * Unlike [undeliverableRouteCount], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("undeliverable_route_count")
        @ExcludeMissing
        fun _undeliverableRouteCount(): JsonField<Long> = undeliverableRouteCount

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
             * Returns a mutable builder for constructing an instance of [Lifecycle].
             *
             * The following fields are required:
             * ```java
             * .events()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Lifecycle]. */
        class Builder internal constructor() {

            private var events: JsonField<MutableList<Event>>? = null
            private var totalCost: JsonField<PhoneVerificationMoney> = JsonMissing.of()
            private var undeliverableRouteCount: JsonField<Long> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(lifecycle: Lifecycle) = apply {
                events = lifecycle.events.map { it.toMutableList() }
                totalCost = lifecycle.totalCost
                undeliverableRouteCount = lifecycle.undeliverableRouteCount
                additionalProperties = lifecycle.additionalProperties.toMutableMap()
            }

            fun events(events: List<Event>) = events(JsonField.of(events))

            /**
             * Sets [Builder.events] to an arbitrary JSON value.
             *
             * You should usually call [Builder.events] with a well-typed `List<Event>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun events(events: JsonField<List<Event>>) = apply {
                this.events = events.map { it.toMutableList() }
            }

            /**
             * Adds a single [Event] to [events].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addEvent(event: Event) = apply {
                events =
                    (events ?: JsonField.of(mutableListOf())).also {
                        checkKnown("events", it).add(event)
                    }
            }

            fun totalCost(totalCost: PhoneVerificationMoney) = totalCost(JsonField.of(totalCost))

            /**
             * Sets [Builder.totalCost] to an arbitrary JSON value.
             *
             * You should usually call [Builder.totalCost] with a well-typed
             * [PhoneVerificationMoney] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun totalCost(totalCost: JsonField<PhoneVerificationMoney>) = apply {
                this.totalCost = totalCost
            }

            /**
             * How many times the message was reported undeliverable by independent routes. Above
             * zero usually means the phone number is incorrect or the device unreachable.
             */
            fun undeliverableRouteCount(undeliverableRouteCount: Long) =
                undeliverableRouteCount(JsonField.of(undeliverableRouteCount))

            /**
             * Sets [Builder.undeliverableRouteCount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.undeliverableRouteCount] with a well-typed [Long]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun undeliverableRouteCount(undeliverableRouteCount: JsonField<Long>) = apply {
                this.undeliverableRouteCount = undeliverableRouteCount
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
             * Returns an immutable instance of [Lifecycle].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .events()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Lifecycle =
                Lifecycle(
                    checkRequired("events", events).map { it.toImmutable() },
                    totalCost,
                    undeliverableRouteCount,
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
        fun validate(): Lifecycle = apply {
            if (validated) {
                return@apply
            }

            events().forEach { it.validate() }
            totalCost().ifPresent { it.validate() }
            undeliverableRouteCount()
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
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (totalCost.asKnown().getOrNull()?.validity() ?: 0) +
                (if (undeliverableRouteCount.asKnown().isPresent) 1 else 0)

        /** One timeline entry. `type` names the single payload field that is set. */
        class Event
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val type: JsonField<Type>,
            private val attempt: JsonField<Attempt>,
            private val check: JsonField<Check>,
            private val create: JsonField<Create>,
            private val signals: JsonField<Signals>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("attempt")
                @ExcludeMissing
                attempt: JsonField<Attempt> = JsonMissing.of(),
                @JsonProperty("check") @ExcludeMissing check: JsonField<Check> = JsonMissing.of(),
                @JsonProperty("create")
                @ExcludeMissing
                create: JsonField<Create> = JsonMissing.of(),
                @JsonProperty("signals")
                @ExcludeMissing
                signals: JsonField<Signals> = JsonMissing.of(),
            ) : this(type, attempt, check, create, signals, mutableMapOf())

            /**
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * One message sent for this verification.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun attempt(): Optional<Attempt> = attempt.getOptional("attempt")

            /**
             * One code submission for this verification.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun check(): Optional<Check> = check.getOptional("check")

            /**
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun create(): Optional<Create> = create.getOptional("create")

            /**
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun signals(): Optional<Signals> = signals.getOptional("signals")

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [attempt].
             *
             * Unlike [attempt], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("attempt") @ExcludeMissing fun _attempt(): JsonField<Attempt> = attempt

            /**
             * Returns the raw JSON value of [check].
             *
             * Unlike [check], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("check") @ExcludeMissing fun _check(): JsonField<Check> = check

            /**
             * Returns the raw JSON value of [create].
             *
             * Unlike [create], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("create") @ExcludeMissing fun _create(): JsonField<Create> = create

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
                 * Returns a mutable builder for constructing an instance of [Event].
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Event]. */
            class Builder internal constructor() {

                private var type: JsonField<Type>? = null
                private var attempt: JsonField<Attempt> = JsonMissing.of()
                private var check: JsonField<Check> = JsonMissing.of()
                private var create: JsonField<Create> = JsonMissing.of()
                private var signals: JsonField<Signals> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(event: Event) = apply {
                    type = event.type
                    attempt = event.attempt
                    check = event.check
                    create = event.create
                    signals = event.signals
                    additionalProperties = event.additionalProperties.toMutableMap()
                }

                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** One message sent for this verification. */
                fun attempt(attempt: Attempt) = attempt(JsonField.of(attempt))

                /**
                 * Sets [Builder.attempt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attempt] with a well-typed [Attempt] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attempt(attempt: JsonField<Attempt>) = apply { this.attempt = attempt }

                /** One code submission for this verification. */
                fun check(check: Check) = check(JsonField.of(check))

                /**
                 * Sets [Builder.check] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.check] with a well-typed [Check] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun check(check: JsonField<Check>) = apply { this.check = check }

                fun create(create: Create) = create(JsonField.of(create))

                /**
                 * Sets [Builder.create] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.create] with a well-typed [Create] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun create(create: JsonField<Create>) = apply { this.create = create }

                fun signals(signals: Signals) = signals(JsonField.of(signals))

                /**
                 * Sets [Builder.signals] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.signals] with a well-typed [Signals] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun signals(signals: JsonField<Signals>) = apply { this.signals = signals }

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

                /**
                 * Returns an immutable instance of [Event].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Event =
                    Event(
                        checkRequired("type", type),
                        attempt,
                        check,
                        create,
                        signals,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PreludeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Event = apply {
                if (validated) {
                    return@apply
                }

                type().validate()
                attempt().ifPresent { it.validate() }
                check().ifPresent { it.validate() }
                create().ifPresent { it.validate() }
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
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (attempt.asKnown().getOrNull()?.validity() ?: 0) +
                    (check.asKnown().getOrNull()?.validity() ?: 0) +
                    (create.asKnown().getOrNull()?.validity() ?: 0) +
                    (signals.asKnown().getOrNull()?.validity() ?: 0)

            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
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

                    @JvmField val CREATE = of("create")

                    @JvmField val ATTEMPT = of("attempt")

                    @JvmField val CHECK = of("check")

                    @JvmField val SIGNALS = of("signals")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    CREATE,
                    ATTEMPT,
                    CHECK,
                    SIGNALS,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CREATE,
                    ATTEMPT,
                    CHECK,
                    SIGNALS,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
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
                        CREATE -> Value.CREATE
                        ATTEMPT -> Value.ATTEMPT
                        CHECK -> Value.CHECK
                        SIGNALS -> Value.SIGNALS
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
                        CREATE -> Known.CREATE
                        ATTEMPT -> Known.ATTEMPT
                        CHECK -> Known.CHECK
                        SIGNALS -> Known.SIGNALS
                        else -> throw PreludeInvalidDataException("Unknown Type: $value")
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

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PreludeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
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

            /** One message sent for this verification. */
            class Attempt
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val id: JsonField<String>,
                private val createdAt: JsonField<OffsetDateTime>,
                private val carrier: JsonField<PhoneVerificationCarrier>,
                private val channel: JsonField<Channel>,
                private val content: JsonField<String>,
                private val cost: JsonField<PhoneVerificationMoney>,
                private val deliveryEvents: JsonField<List<DeliveryEvent>>,
                private val deliveryStatus: JsonField<DeliveryStatus>,
                private val preferredChannel: JsonField<PreferredChannel>,
                private val status: JsonField<Status>,
                private val trigger: JsonField<Trigger>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("carrier")
                    @ExcludeMissing
                    carrier: JsonField<PhoneVerificationCarrier> = JsonMissing.of(),
                    @JsonProperty("channel")
                    @ExcludeMissing
                    channel: JsonField<Channel> = JsonMissing.of(),
                    @JsonProperty("content")
                    @ExcludeMissing
                    content: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("cost")
                    @ExcludeMissing
                    cost: JsonField<PhoneVerificationMoney> = JsonMissing.of(),
                    @JsonProperty("delivery_events")
                    @ExcludeMissing
                    deliveryEvents: JsonField<List<DeliveryEvent>> = JsonMissing.of(),
                    @JsonProperty("delivery_status")
                    @ExcludeMissing
                    deliveryStatus: JsonField<DeliveryStatus> = JsonMissing.of(),
                    @JsonProperty("preferred_channel")
                    @ExcludeMissing
                    preferredChannel: JsonField<PreferredChannel> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<Status> = JsonMissing.of(),
                    @JsonProperty("trigger")
                    @ExcludeMissing
                    trigger: JsonField<Trigger> = JsonMissing.of(),
                ) : this(
                    id,
                    createdAt,
                    carrier,
                    channel,
                    content,
                    cost,
                    deliveryEvents,
                    deliveryStatus,
                    preferredChannel,
                    status,
                    trigger,
                    mutableMapOf(),
                )

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun id(): String = id.getRequired("id")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /**
                 * The end user's mobile network.
                 *
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun carrier(): Optional<PhoneVerificationCarrier> = carrier.getOptional("carrier")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun channel(): Optional<Channel> = channel.getOptional("channel")

                /**
                 * Message body. While the verification can still be completed, the code inside it
                 * is masked rather than removed.
                 *
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun content(): Optional<String> = content.getOptional("content")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun cost(): Optional<PhoneVerificationMoney> = cost.getOptional("cost")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun deliveryEvents(): Optional<List<DeliveryEvent>> =
                    deliveryEvents.getOptional("delivery_events")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun deliveryStatus(): Optional<DeliveryStatus> =
                    deliveryStatus.getOptional("delivery_status")

                /**
                 * Channel you asked for, when it differs from the one used.
                 *
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun preferredChannel(): Optional<PreferredChannel> =
                    preferredChannel.getOptional("preferred_channel")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun status(): Optional<Status> = status.getOptional("status")

                /**
                 * What caused the attempt.
                 *
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun trigger(): Optional<Trigger> = trigger.getOptional("trigger")

                /**
                 * Returns the raw JSON value of [id].
                 *
                 * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
                 */
                @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

                /**
                 * Returns the raw JSON value of [createdAt].
                 *
                 * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun _createdAt(): JsonField<OffsetDateTime> = createdAt

                /**
                 * Returns the raw JSON value of [carrier].
                 *
                 * Unlike [carrier], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("carrier")
                @ExcludeMissing
                fun _carrier(): JsonField<PhoneVerificationCarrier> = carrier

                /**
                 * Returns the raw JSON value of [channel].
                 *
                 * Unlike [channel], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("channel")
                @ExcludeMissing
                fun _channel(): JsonField<Channel> = channel

                /**
                 * Returns the raw JSON value of [content].
                 *
                 * Unlike [content], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("content") @ExcludeMissing fun _content(): JsonField<String> = content

                /**
                 * Returns the raw JSON value of [cost].
                 *
                 * Unlike [cost], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cost")
                @ExcludeMissing
                fun _cost(): JsonField<PhoneVerificationMoney> = cost

                /**
                 * Returns the raw JSON value of [deliveryEvents].
                 *
                 * Unlike [deliveryEvents], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("delivery_events")
                @ExcludeMissing
                fun _deliveryEvents(): JsonField<List<DeliveryEvent>> = deliveryEvents

                /**
                 * Returns the raw JSON value of [deliveryStatus].
                 *
                 * Unlike [deliveryStatus], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("delivery_status")
                @ExcludeMissing
                fun _deliveryStatus(): JsonField<DeliveryStatus> = deliveryStatus

                /**
                 * Returns the raw JSON value of [preferredChannel].
                 *
                 * Unlike [preferredChannel], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("preferred_channel")
                @ExcludeMissing
                fun _preferredChannel(): JsonField<PreferredChannel> = preferredChannel

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

                /**
                 * Returns the raw JSON value of [trigger].
                 *
                 * Unlike [trigger], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("trigger")
                @ExcludeMissing
                fun _trigger(): JsonField<Trigger> = trigger

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
                     * Returns a mutable builder for constructing an instance of [Attempt].
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .createdAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Attempt]. */
                class Builder internal constructor() {

                    private var id: JsonField<String>? = null
                    private var createdAt: JsonField<OffsetDateTime>? = null
                    private var carrier: JsonField<PhoneVerificationCarrier> = JsonMissing.of()
                    private var channel: JsonField<Channel> = JsonMissing.of()
                    private var content: JsonField<String> = JsonMissing.of()
                    private var cost: JsonField<PhoneVerificationMoney> = JsonMissing.of()
                    private var deliveryEvents: JsonField<MutableList<DeliveryEvent>>? = null
                    private var deliveryStatus: JsonField<DeliveryStatus> = JsonMissing.of()
                    private var preferredChannel: JsonField<PreferredChannel> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var trigger: JsonField<Trigger> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(attempt: Attempt) = apply {
                        id = attempt.id
                        createdAt = attempt.createdAt
                        carrier = attempt.carrier
                        channel = attempt.channel
                        content = attempt.content
                        cost = attempt.cost
                        deliveryEvents = attempt.deliveryEvents.map { it.toMutableList() }
                        deliveryStatus = attempt.deliveryStatus
                        preferredChannel = attempt.preferredChannel
                        status = attempt.status
                        trigger = attempt.trigger
                        additionalProperties = attempt.additionalProperties.toMutableMap()
                    }

                    fun id(id: String) = id(JsonField.of(id))

                    /**
                     * Sets [Builder.id] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.id] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun id(id: JsonField<String>) = apply { this.id = id }

                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * Sets [Builder.createdAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.createdAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    /** The end user's mobile network. */
                    fun carrier(carrier: PhoneVerificationCarrier) = carrier(JsonField.of(carrier))

                    /**
                     * Sets [Builder.carrier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.carrier] with a well-typed
                     * [PhoneVerificationCarrier] value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun carrier(carrier: JsonField<PhoneVerificationCarrier>) = apply {
                        this.carrier = carrier
                    }

                    fun channel(channel: Channel) = channel(JsonField.of(channel))

                    /**
                     * Sets [Builder.channel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channel] with a well-typed [Channel] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

                    /**
                     * Message body. While the verification can still be completed, the code inside
                     * it is masked rather than removed.
                     */
                    fun content(content: String) = content(JsonField.of(content))

                    /**
                     * Sets [Builder.content] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.content] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun content(content: JsonField<String>) = apply { this.content = content }

                    fun cost(cost: PhoneVerificationMoney) = cost(JsonField.of(cost))

                    /**
                     * Sets [Builder.cost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cost] with a well-typed
                     * [PhoneVerificationMoney] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun cost(cost: JsonField<PhoneVerificationMoney>) = apply { this.cost = cost }

                    fun deliveryEvents(deliveryEvents: List<DeliveryEvent>) =
                        deliveryEvents(JsonField.of(deliveryEvents))

                    /**
                     * Sets [Builder.deliveryEvents] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deliveryEvents] with a well-typed
                     * `List<DeliveryEvent>` value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun deliveryEvents(deliveryEvents: JsonField<List<DeliveryEvent>>) = apply {
                        this.deliveryEvents = deliveryEvents.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [DeliveryEvent] to [deliveryEvents].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addDeliveryEvent(deliveryEvent: DeliveryEvent) = apply {
                        deliveryEvents =
                            (deliveryEvents ?: JsonField.of(mutableListOf())).also {
                                checkKnown("deliveryEvents", it).add(deliveryEvent)
                            }
                    }

                    fun deliveryStatus(deliveryStatus: DeliveryStatus) =
                        deliveryStatus(JsonField.of(deliveryStatus))

                    /**
                     * Sets [Builder.deliveryStatus] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.deliveryStatus] with a well-typed
                     * [DeliveryStatus] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun deliveryStatus(deliveryStatus: JsonField<DeliveryStatus>) = apply {
                        this.deliveryStatus = deliveryStatus
                    }

                    /** Channel you asked for, when it differs from the one used. */
                    fun preferredChannel(preferredChannel: PreferredChannel) =
                        preferredChannel(JsonField.of(preferredChannel))

                    /**
                     * Sets [Builder.preferredChannel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.preferredChannel] with a well-typed
                     * [PreferredChannel] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun preferredChannel(preferredChannel: JsonField<PreferredChannel>) = apply {
                        this.preferredChannel = preferredChannel
                    }

                    fun status(status: Status) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [Status] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<Status>) = apply { this.status = status }

                    /** What caused the attempt. */
                    fun trigger(trigger: Trigger) = trigger(JsonField.of(trigger))

                    /**
                     * Sets [Builder.trigger] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.trigger] with a well-typed [Trigger] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun trigger(trigger: JsonField<Trigger>) = apply { this.trigger = trigger }

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

                    /**
                     * Returns an immutable instance of [Attempt].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .id()
                     * .createdAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Attempt =
                        Attempt(
                            checkRequired("id", id),
                            checkRequired("createdAt", createdAt),
                            carrier,
                            channel,
                            content,
                            cost,
                            (deliveryEvents ?: JsonMissing.of()).map { it.toImmutable() },
                            deliveryStatus,
                            preferredChannel,
                            status,
                            trigger,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PreludeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Attempt = apply {
                    if (validated) {
                        return@apply
                    }

                    id()
                    createdAt()
                    carrier().ifPresent { it.validate() }
                    channel().ifPresent { it.validate() }
                    content()
                    cost().ifPresent { it.validate() }
                    deliveryEvents().ifPresent { it.forEach { it.validate() } }
                    deliveryStatus().ifPresent { it.validate() }
                    preferredChannel().ifPresent { it.validate() }
                    status().ifPresent { it.validate() }
                    trigger().ifPresent { it.validate() }
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
                    (if (id.asKnown().isPresent) 1 else 0) +
                        (if (createdAt.asKnown().isPresent) 1 else 0) +
                        (carrier.asKnown().getOrNull()?.validity() ?: 0) +
                        (channel.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (content.asKnown().isPresent) 1 else 0) +
                        (cost.asKnown().getOrNull()?.validity() ?: 0) +
                        (deliveryEvents.asKnown().getOrNull()?.sumOf { it.validity().toInt() }
                            ?: 0) +
                        (deliveryStatus.asKnown().getOrNull()?.validity() ?: 0) +
                        (preferredChannel.asKnown().getOrNull()?.validity() ?: 0) +
                        (status.asKnown().getOrNull()?.validity() ?: 0) +
                        (trigger.asKnown().getOrNull()?.validity() ?: 0)

                class Channel
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SMS = of("sms")

                        @JvmField val RCS = of("rcs")

                        @JvmField val WHATSAPP = of("whatsapp")

                        @JvmField val VIBER = of("viber")

                        @JvmField val ZALO = of("zalo")

                        @JvmField val TELEGRAM = of("telegram")

                        @JvmField val VOICE = of("voice")

                        @JvmField val SILENT = of("silent")

                        @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
                    }

                    /** An enum containing [Channel]'s known values. */
                    enum class Known {
                        SMS,
                        RCS,
                        WHATSAPP,
                        VIBER,
                        ZALO,
                        TELEGRAM,
                        VOICE,
                        SILENT,
                    }

                    /**
                     * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Channel] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SMS,
                        RCS,
                        WHATSAPP,
                        VIBER,
                        ZALO,
                        TELEGRAM,
                        VOICE,
                        SILENT,
                        /**
                         * An enum member indicating that [Channel] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SMS -> Value.SMS
                            RCS -> Value.RCS
                            WHATSAPP -> Value.WHATSAPP
                            VIBER -> Value.VIBER
                            ZALO -> Value.ZALO
                            TELEGRAM -> Value.TELEGRAM
                            VOICE -> Value.VOICE
                            SILENT -> Value.SILENT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SMS -> Known.SMS
                            RCS -> Known.RCS
                            WHATSAPP -> Known.WHATSAPP
                            VIBER -> Known.VIBER
                            ZALO -> Known.ZALO
                            TELEGRAM -> Known.TELEGRAM
                            VOICE -> Known.VOICE
                            SILENT -> Known.SILENT
                            else -> throw PreludeInvalidDataException("Unknown Channel: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            PreludeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Channel = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Channel && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class DeliveryEvent
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val receivedAt: JsonField<OffsetDateTime>,
                    private val status: JsonField<Status>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("received_at")
                        @ExcludeMissing
                        receivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                        @JsonProperty("status")
                        @ExcludeMissing
                        status: JsonField<Status> = JsonMissing.of(),
                    ) : this(receivedAt, status, mutableMapOf())

                    /**
                     * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun receivedAt(): OffsetDateTime = receivedAt.getRequired("received_at")

                    /**
                     * The state this event reported. It is finer-grained than the attempt's
                     * `delivery_status` and includes the states a silent verification goes through.
                     *
                     * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun status(): Status = status.getRequired("status")

                    /**
                     * Returns the raw JSON value of [receivedAt].
                     *
                     * Unlike [receivedAt], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("received_at")
                    @ExcludeMissing
                    fun _receivedAt(): JsonField<OffsetDateTime> = receivedAt

                    /**
                     * Returns the raw JSON value of [status].
                     *
                     * Unlike [status], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("status")
                    @ExcludeMissing
                    fun _status(): JsonField<Status> = status

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
                         * Returns a mutable builder for constructing an instance of
                         * [DeliveryEvent].
                         *
                         * The following fields are required:
                         * ```java
                         * .receivedAt()
                         * .status()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [DeliveryEvent]. */
                    class Builder internal constructor() {

                        private var receivedAt: JsonField<OffsetDateTime>? = null
                        private var status: JsonField<Status>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(deliveryEvent: DeliveryEvent) = apply {
                            receivedAt = deliveryEvent.receivedAt
                            status = deliveryEvent.status
                            additionalProperties = deliveryEvent.additionalProperties.toMutableMap()
                        }

                        fun receivedAt(receivedAt: OffsetDateTime) =
                            receivedAt(JsonField.of(receivedAt))

                        /**
                         * Sets [Builder.receivedAt] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.receivedAt] with a well-typed
                         * [OffsetDateTime] value instead. This method is primarily for setting the
                         * field to an undocumented or not yet supported value.
                         */
                        fun receivedAt(receivedAt: JsonField<OffsetDateTime>) = apply {
                            this.receivedAt = receivedAt
                        }

                        /**
                         * The state this event reported. It is finer-grained than the attempt's
                         * `delivery_status` and includes the states a silent verification goes
                         * through.
                         */
                        fun status(status: Status) = status(JsonField.of(status))

                        /**
                         * Sets [Builder.status] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.status] with a well-typed [Status] value
                         * instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun status(status: JsonField<Status>) = apply { this.status = status }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [DeliveryEvent].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .receivedAt()
                         * .status()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): DeliveryEvent =
                            DeliveryEvent(
                                checkRequired("receivedAt", receivedAt),
                                checkRequired("status", status),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): DeliveryEvent = apply {
                        if (validated) {
                            return@apply
                        }

                        receivedAt()
                        status().validate()
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
                        (if (receivedAt.asKnown().isPresent) 1 else 0) +
                            (status.asKnown().getOrNull()?.validity() ?: 0)

                    /**
                     * The state this event reported. It is finer-grained than the attempt's
                     * `delivery_status` and includes the states a silent verification goes through.
                     */
                    class Status
                    @JsonCreator
                    private constructor(private val value: JsonField<String>) : Enum {

                        /**
                         * Returns this class instance's raw value.
                         *
                         * This is usually only useful if this instance was deserialized from data
                         * that doesn't match any known member, and you want to know that value. For
                         * example, if the SDK is on an older version than the API, then the API may
                         * respond with new members that the SDK is unaware of.
                         */
                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            @JvmField val UNKNOWN = of("unknown")

                            @JvmField val SUBMITTED = of("submitted")

                            @JvmField val IN_TRANSIT = of("in_transit")

                            @JvmField val DELIVERED = of("delivered")

                            @JvmField val UNDELIVERABLE = of("undeliverable")

                            @JvmField val EXPIRED = of("expired")

                            @JvmField val READ = of("read")

                            @JvmField val SILENT_STARTED = of("silent_started")

                            @JvmField val SILENT_VERIFIED = of("silent_verified")

                            @JvmField val SILENT_MISMATCH = of("silent_mismatch")

                            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                        }

                        /** An enum containing [Status]'s known values. */
                        enum class Known {
                            UNKNOWN,
                            SUBMITTED,
                            IN_TRANSIT,
                            DELIVERED,
                            UNDELIVERABLE,
                            EXPIRED,
                            READ,
                            SILENT_STARTED,
                            SILENT_VERIFIED,
                            SILENT_MISMATCH,
                        }

                        /**
                         * An enum containing [Status]'s known values, as well as an [_UNKNOWN]
                         * member.
                         *
                         * An instance of [Status] can contain an unknown value in a couple of
                         * cases:
                         * - It was deserialized from data that doesn't match any known member. For
                         *   example, if the SDK is on an older version than the API, then the API
                         *   may respond with new members that the SDK is unaware of.
                         * - It was constructed with an arbitrary value using the [of] method.
                         */
                        enum class Value {
                            UNKNOWN,
                            SUBMITTED,
                            IN_TRANSIT,
                            DELIVERED,
                            UNDELIVERABLE,
                            EXPIRED,
                            READ,
                            SILENT_STARTED,
                            SILENT_VERIFIED,
                            SILENT_MISMATCH,
                            /**
                             * An enum member indicating that [Status] was instantiated with an
                             * unknown value.
                             */
                            _UNKNOWN,
                        }

                        /**
                         * Returns an enum member corresponding to this class instance's value, or
                         * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                         *
                         * Use the [known] method instead if you're certain the value is always
                         * known or if you want to throw for the unknown case.
                         */
                        fun value(): Value =
                            when (this) {
                                UNKNOWN -> Value.UNKNOWN
                                SUBMITTED -> Value.SUBMITTED
                                IN_TRANSIT -> Value.IN_TRANSIT
                                DELIVERED -> Value.DELIVERED
                                UNDELIVERABLE -> Value.UNDELIVERABLE
                                EXPIRED -> Value.EXPIRED
                                READ -> Value.READ
                                SILENT_STARTED -> Value.SILENT_STARTED
                                SILENT_VERIFIED -> Value.SILENT_VERIFIED
                                SILENT_MISMATCH -> Value.SILENT_MISMATCH
                                else -> Value._UNKNOWN
                            }

                        /**
                         * Returns an enum member corresponding to this class instance's value.
                         *
                         * Use the [value] method instead if you're uncertain the value is always
                         * known and don't want to throw for the unknown case.
                         *
                         * @throws PreludeInvalidDataException if this class instance's value is a
                         *   not a known member.
                         */
                        fun known(): Known =
                            when (this) {
                                UNKNOWN -> Known.UNKNOWN
                                SUBMITTED -> Known.SUBMITTED
                                IN_TRANSIT -> Known.IN_TRANSIT
                                DELIVERED -> Known.DELIVERED
                                UNDELIVERABLE -> Known.UNDELIVERABLE
                                EXPIRED -> Known.EXPIRED
                                READ -> Known.READ
                                SILENT_STARTED -> Known.SILENT_STARTED
                                SILENT_VERIFIED -> Known.SILENT_VERIFIED
                                SILENT_MISMATCH -> Known.SILENT_MISMATCH
                                else -> throw PreludeInvalidDataException("Unknown Status: $value")
                            }

                        /**
                         * Returns this class instance's primitive wire representation.
                         *
                         * This differs from the [toString] method because that method is primarily
                         * for debugging and generally doesn't throw.
                         *
                         * @throws PreludeInvalidDataException if this class instance's value does
                         *   not have the expected primitive type.
                         */
                        fun asString(): String =
                            _value().asString().orElseThrow {
                                PreludeInvalidDataException("Value is not a String")
                            }

                        private var validated: Boolean = false

                        /**
                         * Validates that the types of all values in this object match their
                         * expected types recursively.
                         *
                         * This method is _not_ forwards compatible with new types from the API for
                         * existing fields.
                         *
                         * @throws PreludeInvalidDataException if any value type in this object
                         *   doesn't match its expected type.
                         */
                        fun validate(): Status = apply {
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
                         * Returns a score indicating how many valid values are contained in this
                         * object recursively.
                         *
                         * Used for best match union deserialization.
                         */
                        @JvmSynthetic
                        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Status && value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DeliveryEvent &&
                            receivedAt == other.receivedAt &&
                            status == other.status &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(receivedAt, status, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "DeliveryEvent{receivedAt=$receivedAt, status=$status, additionalProperties=$additionalProperties}"
                }

                class DeliveryStatus
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val UNKNOWN = of("unknown")

                        @JvmField val IN_TRANSIT = of("in_transit")

                        @JvmField val DELIVERED = of("delivered")

                        @JvmField val UNDELIVERABLE = of("undeliverable")

                        @JvmField val READ = of("read")

                        @JvmStatic fun of(value: String) = DeliveryStatus(JsonField.of(value))
                    }

                    /** An enum containing [DeliveryStatus]'s known values. */
                    enum class Known {
                        UNKNOWN,
                        IN_TRANSIT,
                        DELIVERED,
                        UNDELIVERABLE,
                        READ,
                    }

                    /**
                     * An enum containing [DeliveryStatus]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [DeliveryStatus] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        UNKNOWN,
                        IN_TRANSIT,
                        DELIVERED,
                        UNDELIVERABLE,
                        READ,
                        /**
                         * An enum member indicating that [DeliveryStatus] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            UNKNOWN -> Value.UNKNOWN
                            IN_TRANSIT -> Value.IN_TRANSIT
                            DELIVERED -> Value.DELIVERED
                            UNDELIVERABLE -> Value.UNDELIVERABLE
                            READ -> Value.READ
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            UNKNOWN -> Known.UNKNOWN
                            IN_TRANSIT -> Known.IN_TRANSIT
                            DELIVERED -> Known.DELIVERED
                            UNDELIVERABLE -> Known.UNDELIVERABLE
                            READ -> Known.READ
                            else ->
                                throw PreludeInvalidDataException("Unknown DeliveryStatus: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            PreludeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): DeliveryStatus = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is DeliveryStatus && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Channel you asked for, when it differs from the one used. */
                class PreferredChannel
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SMS = of("sms")

                        @JvmField val RCS = of("rcs")

                        @JvmField val WHATSAPP = of("whatsapp")

                        @JvmField val VIBER = of("viber")

                        @JvmField val ZALO = of("zalo")

                        @JvmField val TELEGRAM = of("telegram")

                        @JvmField val VOICE = of("voice")

                        @JvmField val SILENT = of("silent")

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
                        VOICE,
                        SILENT,
                    }

                    /**
                     * An enum containing [PreferredChannel]'s known values, as well as an
                     * [_UNKNOWN] member.
                     *
                     * An instance of [PreferredChannel] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SMS,
                        RCS,
                        WHATSAPP,
                        VIBER,
                        ZALO,
                        TELEGRAM,
                        VOICE,
                        SILENT,
                        /**
                         * An enum member indicating that [PreferredChannel] was instantiated with
                         * an unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SMS -> Value.SMS
                            RCS -> Value.RCS
                            WHATSAPP -> Value.WHATSAPP
                            VIBER -> Value.VIBER
                            ZALO -> Value.ZALO
                            TELEGRAM -> Value.TELEGRAM
                            VOICE -> Value.VOICE
                            SILENT -> Value.SILENT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SMS -> Known.SMS
                            RCS -> Known.RCS
                            WHATSAPP -> Known.WHATSAPP
                            VIBER -> Known.VIBER
                            ZALO -> Known.ZALO
                            TELEGRAM -> Known.TELEGRAM
                            VOICE -> Known.VOICE
                            SILENT -> Known.SILENT
                            else ->
                                throw PreludeInvalidDataException(
                                    "Unknown PreferredChannel: $value"
                                )
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            PreludeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PreferredChannel && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                class Status
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SUCCEEDED = of("succeeded")

                        @JvmField val FAILED = of("failed")

                        @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                    }

                    /** An enum containing [Status]'s known values. */
                    enum class Known {
                        SUCCEEDED,
                        FAILED,
                    }

                    /**
                     * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Status] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SUCCEEDED,
                        FAILED,
                        /**
                         * An enum member indicating that [Status] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SUCCEEDED -> Value.SUCCEEDED
                            FAILED -> Value.FAILED
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SUCCEEDED -> Known.SUCCEEDED
                            FAILED -> Known.FAILED
                            else -> throw PreludeInvalidDataException("Unknown Status: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            PreludeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Status = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Status && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** What caused the attempt. */
                class Trigger
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val INITIAL = of("initial")

                        @JvmField val AUTO_RETRY = of("auto_retry")

                        @JvmField val USER_RETRY = of("user_retry")

                        @JvmStatic fun of(value: String) = Trigger(JsonField.of(value))
                    }

                    /** An enum containing [Trigger]'s known values. */
                    enum class Known {
                        INITIAL,
                        AUTO_RETRY,
                        USER_RETRY,
                    }

                    /**
                     * An enum containing [Trigger]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Trigger] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        INITIAL,
                        AUTO_RETRY,
                        USER_RETRY,
                        /**
                         * An enum member indicating that [Trigger] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            INITIAL -> Value.INITIAL
                            AUTO_RETRY -> Value.AUTO_RETRY
                            USER_RETRY -> Value.USER_RETRY
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            INITIAL -> Known.INITIAL
                            AUTO_RETRY -> Known.AUTO_RETRY
                            USER_RETRY -> Known.USER_RETRY
                            else -> throw PreludeInvalidDataException("Unknown Trigger: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            PreludeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Trigger = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Trigger && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Attempt &&
                        id == other.id &&
                        createdAt == other.createdAt &&
                        carrier == other.carrier &&
                        channel == other.channel &&
                        content == other.content &&
                        cost == other.cost &&
                        deliveryEvents == other.deliveryEvents &&
                        deliveryStatus == other.deliveryStatus &&
                        preferredChannel == other.preferredChannel &&
                        status == other.status &&
                        trigger == other.trigger &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        id,
                        createdAt,
                        carrier,
                        channel,
                        content,
                        cost,
                        deliveryEvents,
                        deliveryStatus,
                        preferredChannel,
                        status,
                        trigger,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Attempt{id=$id, createdAt=$createdAt, carrier=$carrier, channel=$channel, content=$content, cost=$cost, deliveryEvents=$deliveryEvents, deliveryStatus=$deliveryStatus, preferredChannel=$preferredChannel, status=$status, trigger=$trigger, additionalProperties=$additionalProperties}"
            }

            /** One code submission for this verification. */
            class Check
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val createdAt: JsonField<OffsetDateTime>,
                private val isValid_: JsonField<Boolean>,
                private val channel: JsonField<Channel>,
                private val psd2Info: JsonField<Psd2Info>,
                private val statusDetail: JsonField<StatusDetail>,
                private val value: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("is_valid")
                    @ExcludeMissing
                    isValid_: JsonField<Boolean> = JsonMissing.of(),
                    @JsonProperty("channel")
                    @ExcludeMissing
                    channel: JsonField<Channel> = JsonMissing.of(),
                    @JsonProperty("psd2_info")
                    @ExcludeMissing
                    psd2Info: JsonField<Psd2Info> = JsonMissing.of(),
                    @JsonProperty("status_detail")
                    @ExcludeMissing
                    statusDetail: JsonField<StatusDetail> = JsonMissing.of(),
                    @JsonProperty("value")
                    @ExcludeMissing
                    value: JsonField<String> = JsonMissing.of(),
                ) : this(
                    createdAt,
                    isValid_,
                    channel,
                    psd2Info,
                    statusDetail,
                    value,
                    mutableMapOf(),
                )

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun isValid_(): Boolean = isValid_.getRequired("is_valid")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun channel(): Optional<Channel> = channel.getOptional("channel")

                /**
                 * Present on checks against a `prelude:psd2` code.
                 *
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun psd2Info(): Optional<Psd2Info> = psd2Info.getOptional("psd2_info")

                /**
                 * Why an invalid check failed, when known.
                 *
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun statusDetail(): Optional<StatusDetail> =
                    statusDetail.getOptional("status_detail")

                /**
                 * The submitted code. Absent while the verification can still be completed, so that
                 * a check in flight cannot be read back through this endpoint, and absent on silent
                 * verification checks, which carry no code.
                 *
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun value(): Optional<String> = value.getOptional("value")

                /**
                 * Returns the raw JSON value of [createdAt].
                 *
                 * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun _createdAt(): JsonField<OffsetDateTime> = createdAt

                /**
                 * Returns the raw JSON value of [isValid_].
                 *
                 * Unlike [isValid_], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("is_valid")
                @ExcludeMissing
                fun _isValid_(): JsonField<Boolean> = isValid_

                /**
                 * Returns the raw JSON value of [channel].
                 *
                 * Unlike [channel], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("channel")
                @ExcludeMissing
                fun _channel(): JsonField<Channel> = channel

                /**
                 * Returns the raw JSON value of [psd2Info].
                 *
                 * Unlike [psd2Info], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("psd2_info")
                @ExcludeMissing
                fun _psd2Info(): JsonField<Psd2Info> = psd2Info

                /**
                 * Returns the raw JSON value of [statusDetail].
                 *
                 * Unlike [statusDetail], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("status_detail")
                @ExcludeMissing
                fun _statusDetail(): JsonField<StatusDetail> = statusDetail

                /**
                 * Returns the raw JSON value of [value].
                 *
                 * Unlike [value], this method doesn't throw if the JSON field has an unexpected
                 * type.
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
                     * Returns a mutable builder for constructing an instance of [Check].
                     *
                     * The following fields are required:
                     * ```java
                     * .createdAt()
                     * .isValid_()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Check]. */
                class Builder internal constructor() {

                    private var createdAt: JsonField<OffsetDateTime>? = null
                    private var isValid_: JsonField<Boolean>? = null
                    private var channel: JsonField<Channel> = JsonMissing.of()
                    private var psd2Info: JsonField<Psd2Info> = JsonMissing.of()
                    private var statusDetail: JsonField<StatusDetail> = JsonMissing.of()
                    private var value: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(check: Check) = apply {
                        createdAt = check.createdAt
                        isValid_ = check.isValid_
                        channel = check.channel
                        psd2Info = check.psd2Info
                        statusDetail = check.statusDetail
                        value = check.value
                        additionalProperties = check.additionalProperties.toMutableMap()
                    }

                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * Sets [Builder.createdAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.createdAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    fun isValid_(isValid_: Boolean) = isValid_(JsonField.of(isValid_))

                    /**
                     * Sets [Builder.isValid_] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.isValid_] with a well-typed [Boolean] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun isValid_(isValid_: JsonField<Boolean>) = apply { this.isValid_ = isValid_ }

                    fun channel(channel: Channel) = channel(JsonField.of(channel))

                    /**
                     * Sets [Builder.channel] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.channel] with a well-typed [Channel] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun channel(channel: JsonField<Channel>) = apply { this.channel = channel }

                    /** Present on checks against a `prelude:psd2` code. */
                    fun psd2Info(psd2Info: Psd2Info) = psd2Info(JsonField.of(psd2Info))

                    /**
                     * Sets [Builder.psd2Info] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.psd2Info] with a well-typed [Psd2Info] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun psd2Info(psd2Info: JsonField<Psd2Info>) = apply { this.psd2Info = psd2Info }

                    /** Why an invalid check failed, when known. */
                    fun statusDetail(statusDetail: StatusDetail) =
                        statusDetail(JsonField.of(statusDetail))

                    /**
                     * Sets [Builder.statusDetail] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.statusDetail] with a well-typed
                     * [StatusDetail] value instead. This method is primarily for setting the field
                     * to an undocumented or not yet supported value.
                     */
                    fun statusDetail(statusDetail: JsonField<StatusDetail>) = apply {
                        this.statusDetail = statusDetail
                    }

                    /**
                     * The submitted code. Absent while the verification can still be completed, so
                     * that a check in flight cannot be read back through this endpoint, and absent
                     * on silent verification checks, which carry no code.
                     */
                    fun value(value: String) = value(JsonField.of(value))

                    /**
                     * Sets [Builder.value] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.value] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
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

                    /**
                     * Returns an immutable instance of [Check].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .createdAt()
                     * .isValid_()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Check =
                        Check(
                            checkRequired("createdAt", createdAt),
                            checkRequired("isValid_", isValid_),
                            channel,
                            psd2Info,
                            statusDetail,
                            value,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PreludeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Check = apply {
                    if (validated) {
                        return@apply
                    }

                    createdAt()
                    isValid_()
                    channel().ifPresent { it.validate() }
                    psd2Info().ifPresent { it.validate() }
                    statusDetail().ifPresent { it.validate() }
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
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                        (if (isValid_.asKnown().isPresent) 1 else 0) +
                        (channel.asKnown().getOrNull()?.validity() ?: 0) +
                        (psd2Info.asKnown().getOrNull()?.validity() ?: 0) +
                        (statusDetail.asKnown().getOrNull()?.validity() ?: 0) +
                        (if (value.asKnown().isPresent) 1 else 0)

                class Channel
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val SMS = of("sms")

                        @JvmField val RCS = of("rcs")

                        @JvmField val WHATSAPP = of("whatsapp")

                        @JvmField val VIBER = of("viber")

                        @JvmField val ZALO = of("zalo")

                        @JvmField val TELEGRAM = of("telegram")

                        @JvmField val VOICE = of("voice")

                        @JvmField val SILENT = of("silent")

                        @JvmStatic fun of(value: String) = Channel(JsonField.of(value))
                    }

                    /** An enum containing [Channel]'s known values. */
                    enum class Known {
                        SMS,
                        RCS,
                        WHATSAPP,
                        VIBER,
                        ZALO,
                        TELEGRAM,
                        VOICE,
                        SILENT,
                    }

                    /**
                     * An enum containing [Channel]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Channel] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        SMS,
                        RCS,
                        WHATSAPP,
                        VIBER,
                        ZALO,
                        TELEGRAM,
                        VOICE,
                        SILENT,
                        /**
                         * An enum member indicating that [Channel] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            SMS -> Value.SMS
                            RCS -> Value.RCS
                            WHATSAPP -> Value.WHATSAPP
                            VIBER -> Value.VIBER
                            ZALO -> Value.ZALO
                            TELEGRAM -> Value.TELEGRAM
                            VOICE -> Value.VOICE
                            SILENT -> Value.SILENT
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            SMS -> Known.SMS
                            RCS -> Known.RCS
                            WHATSAPP -> Known.WHATSAPP
                            VIBER -> Known.VIBER
                            ZALO -> Known.ZALO
                            TELEGRAM -> Known.TELEGRAM
                            VOICE -> Known.VOICE
                            SILENT -> Known.SILENT
                            else -> throw PreludeInvalidDataException("Unknown Channel: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            PreludeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Channel = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Channel && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Present on checks against a `prelude:psd2` code. */
                class Psd2Info
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val expectedTransaction: JsonField<PhoneVerificationPsd2Transaction>,
                    private val receivedTransaction: JsonField<PhoneVerificationPsd2Transaction>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("expected_transaction")
                        @ExcludeMissing
                        expectedTransaction: JsonField<PhoneVerificationPsd2Transaction> =
                            JsonMissing.of(),
                        @JsonProperty("received_transaction")
                        @ExcludeMissing
                        receivedTransaction: JsonField<PhoneVerificationPsd2Transaction> =
                            JsonMissing.of(),
                    ) : this(expectedTransaction, receivedTransaction, mutableMapOf())

                    /**
                     * The transaction submitted when the code was issued.
                     *
                     * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun expectedTransaction(): Optional<PhoneVerificationPsd2Transaction> =
                        expectedTransaction.getOptional("expected_transaction")

                    /**
                     * The transaction submitted with this check. Differs from
                     * `expected_transaction` when `status_detail` is `transaction_mismatch`.
                     *
                     * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                     *   (e.g. if the server responded with an unexpected value).
                     */
                    fun receivedTransaction(): Optional<PhoneVerificationPsd2Transaction> =
                        receivedTransaction.getOptional("received_transaction")

                    /**
                     * Returns the raw JSON value of [expectedTransaction].
                     *
                     * Unlike [expectedTransaction], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("expected_transaction")
                    @ExcludeMissing
                    fun _expectedTransaction(): JsonField<PhoneVerificationPsd2Transaction> =
                        expectedTransaction

                    /**
                     * Returns the raw JSON value of [receivedTransaction].
                     *
                     * Unlike [receivedTransaction], this method doesn't throw if the JSON field has
                     * an unexpected type.
                     */
                    @JsonProperty("received_transaction")
                    @ExcludeMissing
                    fun _receivedTransaction(): JsonField<PhoneVerificationPsd2Transaction> =
                        receivedTransaction

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

                        /** Returns a mutable builder for constructing an instance of [Psd2Info]. */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [Psd2Info]. */
                    class Builder internal constructor() {

                        private var expectedTransaction:
                            JsonField<PhoneVerificationPsd2Transaction> =
                            JsonMissing.of()
                        private var receivedTransaction:
                            JsonField<PhoneVerificationPsd2Transaction> =
                            JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(psd2Info: Psd2Info) = apply {
                            expectedTransaction = psd2Info.expectedTransaction
                            receivedTransaction = psd2Info.receivedTransaction
                            additionalProperties = psd2Info.additionalProperties.toMutableMap()
                        }

                        /** The transaction submitted when the code was issued. */
                        fun expectedTransaction(
                            expectedTransaction: PhoneVerificationPsd2Transaction
                        ) = expectedTransaction(JsonField.of(expectedTransaction))

                        /**
                         * Sets [Builder.expectedTransaction] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.expectedTransaction] with a well-typed
                         * [PhoneVerificationPsd2Transaction] value instead. This method is
                         * primarily for setting the field to an undocumented or not yet supported
                         * value.
                         */
                        fun expectedTransaction(
                            expectedTransaction: JsonField<PhoneVerificationPsd2Transaction>
                        ) = apply { this.expectedTransaction = expectedTransaction }

                        /**
                         * The transaction submitted with this check. Differs from
                         * `expected_transaction` when `status_detail` is `transaction_mismatch`.
                         */
                        fun receivedTransaction(
                            receivedTransaction: PhoneVerificationPsd2Transaction
                        ) = receivedTransaction(JsonField.of(receivedTransaction))

                        /**
                         * Sets [Builder.receivedTransaction] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.receivedTransaction] with a well-typed
                         * [PhoneVerificationPsd2Transaction] value instead. This method is
                         * primarily for setting the field to an undocumented or not yet supported
                         * value.
                         */
                        fun receivedTransaction(
                            receivedTransaction: JsonField<PhoneVerificationPsd2Transaction>
                        ) = apply { this.receivedTransaction = receivedTransaction }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [Psd2Info].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         */
                        fun build(): Psd2Info =
                            Psd2Info(
                                expectedTransaction,
                                receivedTransaction,
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Psd2Info = apply {
                        if (validated) {
                            return@apply
                        }

                        expectedTransaction().ifPresent { it.validate() }
                        receivedTransaction().ifPresent { it.validate() }
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
                        (expectedTransaction.asKnown().getOrNull()?.validity() ?: 0) +
                            (receivedTransaction.asKnown().getOrNull()?.validity() ?: 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Psd2Info &&
                            expectedTransaction == other.expectedTransaction &&
                            receivedTransaction == other.receivedTransaction &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(expectedTransaction, receivedTransaction, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Psd2Info{expectedTransaction=$expectedTransaction, receivedTransaction=$receivedTransaction, additionalProperties=$additionalProperties}"
                }

                /** Why an invalid check failed, when known. */
                class StatusDetail
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val EXPIRED_ATTEMPT = of("expired_attempt")

                        @JvmField val EXPIRED_AUTH = of("expired_auth")

                        @JvmField val RATE_LIMITED = of("rate_limited")

                        @JvmField val TRANSACTION_MISSING = of("transaction_missing")

                        @JvmField val TRANSACTION_MISMATCH = of("transaction_mismatch")

                        @JvmStatic fun of(value: String) = StatusDetail(JsonField.of(value))
                    }

                    /** An enum containing [StatusDetail]'s known values. */
                    enum class Known {
                        EXPIRED_ATTEMPT,
                        EXPIRED_AUTH,
                        RATE_LIMITED,
                        TRANSACTION_MISSING,
                        TRANSACTION_MISMATCH,
                    }

                    /**
                     * An enum containing [StatusDetail]'s known values, as well as an [_UNKNOWN]
                     * member.
                     *
                     * An instance of [StatusDetail] can contain an unknown value in a couple of
                     * cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        EXPIRED_ATTEMPT,
                        EXPIRED_AUTH,
                        RATE_LIMITED,
                        TRANSACTION_MISSING,
                        TRANSACTION_MISMATCH,
                        /**
                         * An enum member indicating that [StatusDetail] was instantiated with an
                         * unknown value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            EXPIRED_ATTEMPT -> Value.EXPIRED_ATTEMPT
                            EXPIRED_AUTH -> Value.EXPIRED_AUTH
                            RATE_LIMITED -> Value.RATE_LIMITED
                            TRANSACTION_MISSING -> Value.TRANSACTION_MISSING
                            TRANSACTION_MISMATCH -> Value.TRANSACTION_MISMATCH
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            EXPIRED_ATTEMPT -> Known.EXPIRED_ATTEMPT
                            EXPIRED_AUTH -> Known.EXPIRED_AUTH
                            RATE_LIMITED -> Known.RATE_LIMITED
                            TRANSACTION_MISSING -> Known.TRANSACTION_MISSING
                            TRANSACTION_MISMATCH -> Known.TRANSACTION_MISMATCH
                            else ->
                                throw PreludeInvalidDataException("Unknown StatusDetail: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            PreludeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): StatusDetail = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is StatusDetail && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Check &&
                        createdAt == other.createdAt &&
                        isValid_ == other.isValid_ &&
                        channel == other.channel &&
                        psd2Info == other.psd2Info &&
                        statusDetail == other.statusDetail &&
                        value == other.value &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        createdAt,
                        isValid_,
                        channel,
                        psd2Info,
                        statusDetail,
                        value,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Check{createdAt=$createdAt, isValid_=$isValid_, channel=$channel, psd2Info=$psd2Info, statusDetail=$statusDetail, value=$value, additionalProperties=$additionalProperties}"
            }

            class Create
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val createdAt: JsonField<OffsetDateTime>,
                private val cost: JsonField<PhoneVerificationMoney>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("created_at")
                    @ExcludeMissing
                    createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("cost")
                    @ExcludeMissing
                    cost: JsonField<PhoneVerificationMoney> = JsonMissing.of(),
                ) : this(createdAt, cost, mutableMapOf())

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun cost(): Optional<PhoneVerificationMoney> = cost.getOptional("cost")

                /**
                 * Returns the raw JSON value of [createdAt].
                 *
                 * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun _createdAt(): JsonField<OffsetDateTime> = createdAt

                /**
                 * Returns the raw JSON value of [cost].
                 *
                 * Unlike [cost], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("cost")
                @ExcludeMissing
                fun _cost(): JsonField<PhoneVerificationMoney> = cost

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
                     * Returns a mutable builder for constructing an instance of [Create].
                     *
                     * The following fields are required:
                     * ```java
                     * .createdAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Create]. */
                class Builder internal constructor() {

                    private var createdAt: JsonField<OffsetDateTime>? = null
                    private var cost: JsonField<PhoneVerificationMoney> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(create: Create) = apply {
                        createdAt = create.createdAt
                        cost = create.cost
                        additionalProperties = create.additionalProperties.toMutableMap()
                    }

                    fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                    /**
                     * Sets [Builder.createdAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.createdAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                        this.createdAt = createdAt
                    }

                    fun cost(cost: PhoneVerificationMoney) = cost(JsonField.of(cost))

                    /**
                     * Sets [Builder.cost] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.cost] with a well-typed
                     * [PhoneVerificationMoney] value instead. This method is primarily for setting
                     * the field to an undocumented or not yet supported value.
                     */
                    fun cost(cost: JsonField<PhoneVerificationMoney>) = apply { this.cost = cost }

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

                    /**
                     * Returns an immutable instance of [Create].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .createdAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Create =
                        Create(
                            checkRequired("createdAt", createdAt),
                            cost,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PreludeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Create = apply {
                    if (validated) {
                        return@apply
                    }

                    createdAt()
                    cost().ifPresent { it.validate() }
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
                    (if (createdAt.asKnown().isPresent) 1 else 0) +
                        (cost.asKnown().getOrNull()?.validity() ?: 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Create &&
                        createdAt == other.createdAt &&
                        cost == other.cost &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(createdAt, cost, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Create{createdAt=$createdAt, cost=$cost, additionalProperties=$additionalProperties}"
            }

            class Signals
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val receivedAt: JsonField<OffsetDateTime>,
                private val expiredAt: JsonField<OffsetDateTime>,
                private val status: JsonField<Status>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("received_at")
                    @ExcludeMissing
                    receivedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("expired_at")
                    @ExcludeMissing
                    expiredAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                    @JsonProperty("status")
                    @ExcludeMissing
                    status: JsonField<Status> = JsonMissing.of(),
                ) : this(receivedAt, expiredAt, status, mutableMapOf())

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type or
                 *   is unexpectedly missing or null (e.g. if the server responded with an
                 *   unexpected value).
                 */
                fun receivedAt(): OffsetDateTime = receivedAt.getRequired("received_at")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun expiredAt(): Optional<OffsetDateTime> = expiredAt.getOptional("expired_at")

                /**
                 * @throws PreludeInvalidDataException if the JSON field has an unexpected type
                 *   (e.g. if the server responded with an unexpected value).
                 */
                fun status(): Optional<Status> = status.getOptional("status")

                /**
                 * Returns the raw JSON value of [receivedAt].
                 *
                 * Unlike [receivedAt], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("received_at")
                @ExcludeMissing
                fun _receivedAt(): JsonField<OffsetDateTime> = receivedAt

                /**
                 * Returns the raw JSON value of [expiredAt].
                 *
                 * Unlike [expiredAt], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("expired_at")
                @ExcludeMissing
                fun _expiredAt(): JsonField<OffsetDateTime> = expiredAt

                /**
                 * Returns the raw JSON value of [status].
                 *
                 * Unlike [status], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

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
                     * Returns a mutable builder for constructing an instance of [Signals].
                     *
                     * The following fields are required:
                     * ```java
                     * .receivedAt()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Signals]. */
                class Builder internal constructor() {

                    private var receivedAt: JsonField<OffsetDateTime>? = null
                    private var expiredAt: JsonField<OffsetDateTime> = JsonMissing.of()
                    private var status: JsonField<Status> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(signals: Signals) = apply {
                        receivedAt = signals.receivedAt
                        expiredAt = signals.expiredAt
                        status = signals.status
                        additionalProperties = signals.additionalProperties.toMutableMap()
                    }

                    fun receivedAt(receivedAt: OffsetDateTime) =
                        receivedAt(JsonField.of(receivedAt))

                    /**
                     * Sets [Builder.receivedAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.receivedAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun receivedAt(receivedAt: JsonField<OffsetDateTime>) = apply {
                        this.receivedAt = receivedAt
                    }

                    fun expiredAt(expiredAt: OffsetDateTime) = expiredAt(JsonField.of(expiredAt))

                    /**
                     * Sets [Builder.expiredAt] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.expiredAt] with a well-typed
                     * [OffsetDateTime] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun expiredAt(expiredAt: JsonField<OffsetDateTime>) = apply {
                        this.expiredAt = expiredAt
                    }

                    fun status(status: Status) = status(JsonField.of(status))

                    /**
                     * Sets [Builder.status] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.status] with a well-typed [Status] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun status(status: JsonField<Status>) = apply { this.status = status }

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

                    /**
                     * Returns an immutable instance of [Signals].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .receivedAt()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Signals =
                        Signals(
                            checkRequired("receivedAt", receivedAt),
                            expiredAt,
                            status,
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PreludeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Signals = apply {
                    if (validated) {
                        return@apply
                    }

                    receivedAt()
                    expiredAt()
                    status().ifPresent { it.validate() }
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
                    (if (receivedAt.asKnown().isPresent) 1 else 0) +
                        (if (expiredAt.asKnown().isPresent) 1 else 0) +
                        (status.asKnown().getOrNull()?.validity() ?: 0)

                class Status
                @JsonCreator
                private constructor(private val value: JsonField<String>) : Enum {

                    /**
                     * Returns this class instance's raw value.
                     *
                     * This is usually only useful if this instance was deserialized from data that
                     * doesn't match any known member, and you want to know that value. For example,
                     * if the SDK is on an older version than the API, then the API may respond with
                     * new members that the SDK is unaware of.
                     */
                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        @JvmField val VALID = of("valid")

                        @JvmField val INVALID = of("invalid")

                        @JvmStatic fun of(value: String) = Status(JsonField.of(value))
                    }

                    /** An enum containing [Status]'s known values. */
                    enum class Known {
                        VALID,
                        INVALID,
                    }

                    /**
                     * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
                     *
                     * An instance of [Status] can contain an unknown value in a couple of cases:
                     * - It was deserialized from data that doesn't match any known member. For
                     *   example, if the SDK is on an older version than the API, then the API may
                     *   respond with new members that the SDK is unaware of.
                     * - It was constructed with an arbitrary value using the [of] method.
                     */
                    enum class Value {
                        VALID,
                        INVALID,
                        /**
                         * An enum member indicating that [Status] was instantiated with an unknown
                         * value.
                         */
                        _UNKNOWN,
                    }

                    /**
                     * Returns an enum member corresponding to this class instance's value, or
                     * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                     *
                     * Use the [known] method instead if you're certain the value is always known or
                     * if you want to throw for the unknown case.
                     */
                    fun value(): Value =
                        when (this) {
                            VALID -> Value.VALID
                            INVALID -> Value.INVALID
                            else -> Value._UNKNOWN
                        }

                    /**
                     * Returns an enum member corresponding to this class instance's value.
                     *
                     * Use the [value] method instead if you're uncertain the value is always known
                     * and don't want to throw for the unknown case.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value is a not a
                     *   known member.
                     */
                    fun known(): Known =
                        when (this) {
                            VALID -> Known.VALID
                            INVALID -> Known.INVALID
                            else -> throw PreludeInvalidDataException("Unknown Status: $value")
                        }

                    /**
                     * Returns this class instance's primitive wire representation.
                     *
                     * This differs from the [toString] method because that method is primarily for
                     * debugging and generally doesn't throw.
                     *
                     * @throws PreludeInvalidDataException if this class instance's value does not
                     *   have the expected primitive type.
                     */
                    fun asString(): String =
                        _value().asString().orElseThrow {
                            PreludeInvalidDataException("Value is not a String")
                        }

                    private var validated: Boolean = false

                    /**
                     * Validates that the types of all values in this object match their expected
                     * types recursively.
                     *
                     * This method is _not_ forwards compatible with new types from the API for
                     * existing fields.
                     *
                     * @throws PreludeInvalidDataException if any value type in this object doesn't
                     *   match its expected type.
                     */
                    fun validate(): Status = apply {
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
                    @JvmSynthetic
                    internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Status && value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Signals &&
                        receivedAt == other.receivedAt &&
                        expiredAt == other.expiredAt &&
                        status == other.status &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(receivedAt, expiredAt, status, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Signals{receivedAt=$receivedAt, expiredAt=$expiredAt, status=$status, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Event &&
                    type == other.type &&
                    attempt == other.attempt &&
                    check == other.check &&
                    create == other.create &&
                    signals == other.signals &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(type, attempt, check, create, signals, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Event{type=$type, attempt=$attempt, check=$check, create=$create, signals=$signals, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Lifecycle &&
                events == other.events &&
                totalCost == other.totalCost &&
                undeliverableRouteCount == other.undeliverableRouteCount &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(events, totalCost, undeliverableRouteCount, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Lifecycle{events=$events, totalCost=$totalCost, undeliverableRouteCount=$undeliverableRouteCount, additionalProperties=$additionalProperties}"
    }

    /**
     * Whether the phone number was allow-listed, block-listed, or sandboxed at verification time.
     */
    class PhoneNumberCondition
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALLOW_LISTED = of("allow_listed")

            @JvmField val BLOCK_LISTED = of("block_listed")

            @JvmField val SANDBOXED = of("sandboxed")

            @JvmStatic fun of(value: String) = PhoneNumberCondition(JsonField.of(value))
        }

        /** An enum containing [PhoneNumberCondition]'s known values. */
        enum class Known {
            ALLOW_LISTED,
            BLOCK_LISTED,
            SANDBOXED,
        }

        /**
         * An enum containing [PhoneNumberCondition]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [PhoneNumberCondition] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW_LISTED,
            BLOCK_LISTED,
            SANDBOXED,
            /**
             * An enum member indicating that [PhoneNumberCondition] was instantiated with an
             * unknown value.
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
                ALLOW_LISTED -> Value.ALLOW_LISTED
                BLOCK_LISTED -> Value.BLOCK_LISTED
                SANDBOXED -> Value.SANDBOXED
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
                ALLOW_LISTED -> Known.ALLOW_LISTED
                BLOCK_LISTED -> Known.BLOCK_LISTED
                SANDBOXED -> Known.SANDBOXED
                else -> throw PreludeInvalidDataException("Unknown PhoneNumberCondition: $value")
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
        fun validate(): PhoneNumberCondition = apply {
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

            return other is PhoneNumberCondition && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the phone number is currently allow-listed, block-listed, or sandboxed. */
    class PhoneNumberCurrentCondition
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALLOW_LISTED = of("allow_listed")

            @JvmField val BLOCK_LISTED = of("block_listed")

            @JvmField val SANDBOXED = of("sandboxed")

            @JvmStatic fun of(value: String) = PhoneNumberCurrentCondition(JsonField.of(value))
        }

        /** An enum containing [PhoneNumberCurrentCondition]'s known values. */
        enum class Known {
            ALLOW_LISTED,
            BLOCK_LISTED,
            SANDBOXED,
        }

        /**
         * An enum containing [PhoneNumberCurrentCondition]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [PhoneNumberCurrentCondition] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW_LISTED,
            BLOCK_LISTED,
            SANDBOXED,
            /**
             * An enum member indicating that [PhoneNumberCurrentCondition] was instantiated with an
             * unknown value.
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
                ALLOW_LISTED -> Value.ALLOW_LISTED
                BLOCK_LISTED -> Value.BLOCK_LISTED
                SANDBOXED -> Value.SANDBOXED
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
                ALLOW_LISTED -> Known.ALLOW_LISTED
                BLOCK_LISTED -> Known.BLOCK_LISTED
                SANDBOXED -> Known.SANDBOXED
                else ->
                    throw PreludeInvalidDataException("Unknown PhoneNumberCurrentCondition: $value")
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
        fun validate(): PhoneNumberCurrentCondition = apply {
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

            return other is PhoneNumberCurrentCondition && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The anti-fraud signals you forwarded when creating the verification. */
    class Signals
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val isTrustedUser: JsonField<Boolean>,
        private val deviceId: JsonField<String>,
        private val ja4Fingerprint: JsonField<String>,
        private val osVersion: JsonField<String>,
        private val userAgent: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("is_trusted_user")
            @ExcludeMissing
            isTrustedUser: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("device_id")
            @ExcludeMissing
            deviceId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("ja4_fingerprint")
            @ExcludeMissing
            ja4Fingerprint: JsonField<String> = JsonMissing.of(),
            @JsonProperty("os_version")
            @ExcludeMissing
            osVersion: JsonField<String> = JsonMissing.of(),
            @JsonProperty("user_agent")
            @ExcludeMissing
            userAgent: JsonField<String> = JsonMissing.of(),
        ) : this(isTrustedUser, deviceId, ja4Fingerprint, osVersion, userAgent, mutableMapOf())

        /**
         * Whether you flagged this end user as trusted when creating the verification. Declared by
         * you, not computed by Prelude.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun isTrustedUser(): Boolean = isTrustedUser.getRequired("is_trusted_user")

        /**
         * End-user device identifier you forwarded.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun deviceId(): Optional<String> = deviceId.getOptional("device_id")

        /**
         * TLS fingerprint you forwarded.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun ja4Fingerprint(): Optional<String> = ja4Fingerprint.getOptional("ja4_fingerprint")

        /**
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun osVersion(): Optional<String> = osVersion.getOptional("os_version")

        /**
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun userAgent(): Optional<String> = userAgent.getOptional("user_agent")

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
         * Returns the raw JSON value of [deviceId].
         *
         * Unlike [deviceId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("device_id") @ExcludeMissing fun _deviceId(): JsonField<String> = deviceId

        /**
         * Returns the raw JSON value of [ja4Fingerprint].
         *
         * Unlike [ja4Fingerprint], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("ja4_fingerprint")
        @ExcludeMissing
        fun _ja4Fingerprint(): JsonField<String> = ja4Fingerprint

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

            /**
             * Returns a mutable builder for constructing an instance of [Signals].
             *
             * The following fields are required:
             * ```java
             * .isTrustedUser()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Signals]. */
        class Builder internal constructor() {

            private var isTrustedUser: JsonField<Boolean>? = null
            private var deviceId: JsonField<String> = JsonMissing.of()
            private var ja4Fingerprint: JsonField<String> = JsonMissing.of()
            private var osVersion: JsonField<String> = JsonMissing.of()
            private var userAgent: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signals: Signals) = apply {
                isTrustedUser = signals.isTrustedUser
                deviceId = signals.deviceId
                ja4Fingerprint = signals.ja4Fingerprint
                osVersion = signals.osVersion
                userAgent = signals.userAgent
                additionalProperties = signals.additionalProperties.toMutableMap()
            }

            /**
             * Whether you flagged this end user as trusted when creating the verification. Declared
             * by you, not computed by Prelude.
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

            /** End-user device identifier you forwarded. */
            fun deviceId(deviceId: String) = deviceId(JsonField.of(deviceId))

            /**
             * Sets [Builder.deviceId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.deviceId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

            /** TLS fingerprint you forwarded. */
            fun ja4Fingerprint(ja4Fingerprint: String) =
                ja4Fingerprint(JsonField.of(ja4Fingerprint))

            /**
             * Sets [Builder.ja4Fingerprint] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ja4Fingerprint] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun ja4Fingerprint(ja4Fingerprint: JsonField<String>) = apply {
                this.ja4Fingerprint = ja4Fingerprint
            }

            fun osVersion(osVersion: String) = osVersion(JsonField.of(osVersion))

            /**
             * Sets [Builder.osVersion] to an arbitrary JSON value.
             *
             * You should usually call [Builder.osVersion] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun osVersion(osVersion: JsonField<String>) = apply { this.osVersion = osVersion }

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
             * Returns an immutable instance of [Signals].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .isTrustedUser()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Signals =
                Signals(
                    checkRequired("isTrustedUser", isTrustedUser),
                    deviceId,
                    ja4Fingerprint,
                    osVersion,
                    userAgent,
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
        fun validate(): Signals = apply {
            if (validated) {
                return@apply
            }

            isTrustedUser()
            deviceId()
            ja4Fingerprint()
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
            (if (isTrustedUser.asKnown().isPresent) 1 else 0) +
                (if (deviceId.asKnown().isPresent) 1 else 0) +
                (if (ja4Fingerprint.asKnown().isPresent) 1 else 0) +
                (if (osVersion.asKnown().isPresent) 1 else 0) +
                (if (userAgent.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Signals &&
                isTrustedUser == other.isTrustedUser &&
                deviceId == other.deviceId &&
                ja4Fingerprint == other.ja4Fingerprint &&
                osVersion == other.osVersion &&
                userAgent == other.userAgent &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                isTrustedUser,
                deviceId,
                ja4Fingerprint,
                osVersion,
                userAgent,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Signals{isTrustedUser=$isTrustedUser, deviceId=$deviceId, ja4Fingerprint=$ja4Fingerprint, osVersion=$osVersion, userAgent=$userAgent, additionalProperties=$additionalProperties}"
    }

    /** Whether the SDK signals integrity check passed. */
    class SignalsHashStatus @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val VALID = of("valid")

            @JvmField val INVALID = of("invalid")

            @JvmStatic fun of(value: String) = SignalsHashStatus(JsonField.of(value))
        }

        /** An enum containing [SignalsHashStatus]'s known values. */
        enum class Known {
            VALID,
            INVALID,
        }

        /**
         * An enum containing [SignalsHashStatus]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [SignalsHashStatus] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            VALID,
            INVALID,
            /**
             * An enum member indicating that [SignalsHashStatus] was instantiated with an unknown
             * value.
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
                VALID -> Value.VALID
                INVALID -> Value.INVALID
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
                VALID -> Known.VALID
                INVALID -> Known.INVALID
                else -> throw PreludeInvalidDataException("Unknown SignalsHashStatus: $value")
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
        fun validate(): SignalsHashStatus = apply {
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

            return other is SignalsHashStatus && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is VerificationPhoneHistoryRetrieveResponse &&
            id == other.id &&
            createdAt == other.createdAt &&
            expiresAt == other.expiresAt &&
            phoneNumber == other.phoneNumber &&
            status == other.status &&
            appVersion == other.appVersion &&
            blockReasons == other.blockReasons &&
            carrier == other.carrier &&
            correlationId == other.correlationId &&
            deviceModel == other.deviceModel &&
            devicePlatform == other.devicePlatform &&
            ipAddress == other.ipAddress &&
            ipAddressRegion == other.ipAddressRegion &&
            ipDistanceMeters == other.ipDistanceMeters &&
            lifecycle == other.lifecycle &&
            phoneNumberCondition == other.phoneNumberCondition &&
            phoneNumberCurrentCondition == other.phoneNumberCurrentCondition &&
            phoneNumberRegion == other.phoneNumberRegion &&
            signals == other.signals &&
            signalsHashStatus == other.signalsHashStatus &&
            templateId == other.templateId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            createdAt,
            expiresAt,
            phoneNumber,
            status,
            appVersion,
            blockReasons,
            carrier,
            correlationId,
            deviceModel,
            devicePlatform,
            ipAddress,
            ipAddressRegion,
            ipDistanceMeters,
            lifecycle,
            phoneNumberCondition,
            phoneNumberCurrentCondition,
            phoneNumberRegion,
            signals,
            signalsHashStatus,
            templateId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerificationPhoneHistoryRetrieveResponse{id=$id, createdAt=$createdAt, expiresAt=$expiresAt, phoneNumber=$phoneNumber, status=$status, appVersion=$appVersion, blockReasons=$blockReasons, carrier=$carrier, correlationId=$correlationId, deviceModel=$deviceModel, devicePlatform=$devicePlatform, ipAddress=$ipAddress, ipAddressRegion=$ipAddressRegion, ipDistanceMeters=$ipDistanceMeters, lifecycle=$lifecycle, phoneNumberCondition=$phoneNumberCondition, phoneNumberCurrentCondition=$phoneNumberCurrentCondition, phoneNumberRegion=$phoneNumberRegion, signals=$signals, signalsHashStatus=$signalsHashStatus, templateId=$templateId, additionalProperties=$additionalProperties}"
}

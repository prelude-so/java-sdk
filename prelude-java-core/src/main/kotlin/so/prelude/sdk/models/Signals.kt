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
import so.prelude.sdk.errors.PreludeInvalidDataException

/**
 * The signals used for anti-fraud. For more details, refer to
 * [Signals](/verify/v2/documentation/prevent-fraud#signals).
 */
class Signals
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val appVersion: JsonField<String>,
    private val deviceId: JsonField<String>,
    private val deviceModel: JsonField<String>,
    private val devicePlatform: JsonField<DevicePlatform>,
    private val existingUser: JsonField<Boolean>,
    private val ip: JsonField<String>,
    private val isTrustedUser: JsonField<Boolean>,
    private val ja4Fingerprint: JsonField<String>,
    private val osVersion: JsonField<String>,
    private val userAgent: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("app_version")
        @ExcludeMissing
        appVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_id") @ExcludeMissing deviceId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_model")
        @ExcludeMissing
        deviceModel: JsonField<String> = JsonMissing.of(),
        @JsonProperty("device_platform")
        @ExcludeMissing
        devicePlatform: JsonField<DevicePlatform> = JsonMissing.of(),
        @JsonProperty("existing_user")
        @ExcludeMissing
        existingUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ip") @ExcludeMissing ip: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_trusted_user")
        @ExcludeMissing
        isTrustedUser: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("ja4_fingerprint")
        @ExcludeMissing
        ja4Fingerprint: JsonField<String> = JsonMissing.of(),
        @JsonProperty("os_version") @ExcludeMissing osVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_agent") @ExcludeMissing userAgent: JsonField<String> = JsonMissing.of(),
    ) : this(
        appVersion,
        deviceId,
        deviceModel,
        devicePlatform,
        existingUser,
        ip,
        isTrustedUser,
        ja4Fingerprint,
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
     * A unique ID for the user's device. You should ensure that each user device has a unique
     * `device_id` value. Ideally, for Android, this corresponds to the `ANDROID_ID` and for iOS,
     * this corresponds to the `identifierForVendor`.
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
    fun devicePlatform(): Optional<DevicePlatform> = devicePlatform.getOptional("device_platform")

    /**
     * Whether the end-user already exists in your system, for example an existing account signing
     * in again rather than a first-time signup. Unlike `is_trusted_user`, this signal does not
     * bypass fraud checks; it is taken into account as one additional anti-fraud signal. For more
     * details, refer to [Signals](/verify/v2/documentation/prevent-fraud#signals).
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun existingUser(): Optional<Boolean> = existingUser.getOptional("existing_user")

    /**
     * The public IP v4 or v6 address of the end-user's device. You should collect this from your
     * backend. If your backend is behind a proxy, use the `X-Forwarded-For`, `Forwarded`,
     * `True-Client-IP`, `CF-Connecting-IP` or an equivalent header to get the actual public IP of
     * the end-user's device.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ip(): Optional<String> = ip.getOptional("ip")

    /**
     * This signal should indicate a higher level of trust, explicitly stating that the user is
     * genuine. Contact us to discuss your use case. For more details, refer to
     * [Signals](/verify/v2/documentation/prevent-fraud#signals).
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun isTrustedUser(): Optional<Boolean> = isTrustedUser.getOptional("is_trusted_user")

    /**
     * The JA4 fingerprint observed for the end-user's connection. Prelude will infer it
     * automatically when you use our Frontend SDKs (which use Prelude's edge network), but you can
     * also forward the value if you terminate TLS yourself.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun ja4Fingerprint(): Optional<String> = ja4Fingerprint.getOptional("ja4_fingerprint")

    /**
     * The version of the user's device operating system.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun osVersion(): Optional<String> = osVersion.getOptional("os_version")

    /**
     * The user agent of the user's device. If the individual fields (os_version, device_platform,
     * device_model) are provided, we will prioritize those values instead of parsing them from the
     * user agent string.
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
    @JsonProperty("app_version") @ExcludeMissing fun _appVersion(): JsonField<String> = appVersion

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
     * Unlike [devicePlatform], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("device_platform")
    @ExcludeMissing
    fun _devicePlatform(): JsonField<DevicePlatform> = devicePlatform

    /**
     * Returns the raw JSON value of [existingUser].
     *
     * Unlike [existingUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("existing_user")
    @ExcludeMissing
    fun _existingUser(): JsonField<Boolean> = existingUser

    /**
     * Returns the raw JSON value of [ip].
     *
     * Unlike [ip], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("ip") @ExcludeMissing fun _ip(): JsonField<String> = ip

    /**
     * Returns the raw JSON value of [isTrustedUser].
     *
     * Unlike [isTrustedUser], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("is_trusted_user")
    @ExcludeMissing
    fun _isTrustedUser(): JsonField<Boolean> = isTrustedUser

    /**
     * Returns the raw JSON value of [ja4Fingerprint].
     *
     * Unlike [ja4Fingerprint], this method doesn't throw if the JSON field has an unexpected type.
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

        /** Returns a mutable builder for constructing an instance of [Signals]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Signals]. */
    class Builder internal constructor() {

        private var appVersion: JsonField<String> = JsonMissing.of()
        private var deviceId: JsonField<String> = JsonMissing.of()
        private var deviceModel: JsonField<String> = JsonMissing.of()
        private var devicePlatform: JsonField<DevicePlatform> = JsonMissing.of()
        private var existingUser: JsonField<Boolean> = JsonMissing.of()
        private var ip: JsonField<String> = JsonMissing.of()
        private var isTrustedUser: JsonField<Boolean> = JsonMissing.of()
        private var ja4Fingerprint: JsonField<String> = JsonMissing.of()
        private var osVersion: JsonField<String> = JsonMissing.of()
        private var userAgent: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(signals: Signals) = apply {
            appVersion = signals.appVersion
            deviceId = signals.deviceId
            deviceModel = signals.deviceModel
            devicePlatform = signals.devicePlatform
            existingUser = signals.existingUser
            ip = signals.ip
            isTrustedUser = signals.isTrustedUser
            ja4Fingerprint = signals.ja4Fingerprint
            osVersion = signals.osVersion
            userAgent = signals.userAgent
            additionalProperties = signals.additionalProperties.toMutableMap()
        }

        /** The version of your application. */
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
         * A unique ID for the user's device. You should ensure that each user device has a unique
         * `device_id` value. Ideally, for Android, this corresponds to the `ANDROID_ID` and for
         * iOS, this corresponds to the `identifierForVendor`.
         */
        fun deviceId(deviceId: String) = deviceId(JsonField.of(deviceId))

        /**
         * Sets [Builder.deviceId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun deviceId(deviceId: JsonField<String>) = apply { this.deviceId = deviceId }

        /** The model of the user's device. */
        fun deviceModel(deviceModel: String) = deviceModel(JsonField.of(deviceModel))

        /**
         * Sets [Builder.deviceModel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.deviceModel] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun deviceModel(deviceModel: JsonField<String>) = apply { this.deviceModel = deviceModel }

        /** The type of the user's device. */
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

        /**
         * Whether the end-user already exists in your system, for example an existing account
         * signing in again rather than a first-time signup. Unlike `is_trusted_user`, this signal
         * does not bypass fraud checks; it is taken into account as one additional anti-fraud
         * signal. For more details, refer to
         * [Signals](/verify/v2/documentation/prevent-fraud#signals).
         */
        fun existingUser(existingUser: Boolean) = existingUser(JsonField.of(existingUser))

        /**
         * Sets [Builder.existingUser] to an arbitrary JSON value.
         *
         * You should usually call [Builder.existingUser] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun existingUser(existingUser: JsonField<Boolean>) = apply {
            this.existingUser = existingUser
        }

        /**
         * The public IP v4 or v6 address of the end-user's device. You should collect this from
         * your backend. If your backend is behind a proxy, use the `X-Forwarded-For`, `Forwarded`,
         * `True-Client-IP`, `CF-Connecting-IP` or an equivalent header to get the actual public IP
         * of the end-user's device.
         */
        fun ip(ip: String) = ip(JsonField.of(ip))

        /**
         * Sets [Builder.ip] to an arbitrary JSON value.
         *
         * You should usually call [Builder.ip] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun ip(ip: JsonField<String>) = apply { this.ip = ip }

        /**
         * This signal should indicate a higher level of trust, explicitly stating that the user is
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

        /**
         * The JA4 fingerprint observed for the end-user's connection. Prelude will infer it
         * automatically when you use our Frontend SDKs (which use Prelude's edge network), but you
         * can also forward the value if you terminate TLS yourself.
         */
        fun ja4Fingerprint(ja4Fingerprint: String) = ja4Fingerprint(JsonField.of(ja4Fingerprint))

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

        /** The version of the user's device operating system. */
        fun osVersion(osVersion: String) = osVersion(JsonField.of(osVersion))

        /**
         * Sets [Builder.osVersion] to an arbitrary JSON value.
         *
         * You should usually call [Builder.osVersion] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun osVersion(osVersion: JsonField<String>) = apply { this.osVersion = osVersion }

        /**
         * The user agent of the user's device. If the individual fields (os_version,
         * device_platform, device_model) are provided, we will prioritize those values instead of
         * parsing them from the user agent string.
         */
        fun userAgent(userAgent: String) = userAgent(JsonField.of(userAgent))

        /**
         * Sets [Builder.userAgent] to an arbitrary JSON value.
         *
         * You should usually call [Builder.userAgent] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
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
         */
        fun build(): Signals =
            Signals(
                appVersion,
                deviceId,
                deviceModel,
                devicePlatform,
                existingUser,
                ip,
                isTrustedUser,
                ja4Fingerprint,
                osVersion,
                userAgent,
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
    fun validate(): Signals = apply {
        if (validated) {
            return@apply
        }

        appVersion()
        deviceId()
        deviceModel()
        devicePlatform().ifPresent { it.validate() }
        existingUser()
        ip()
        isTrustedUser()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (appVersion.asKnown().isPresent) 1 else 0) +
            (if (deviceId.asKnown().isPresent) 1 else 0) +
            (if (deviceModel.asKnown().isPresent) 1 else 0) +
            (devicePlatform.asKnown().getOrNull()?.validity() ?: 0) +
            (if (existingUser.asKnown().isPresent) 1 else 0) +
            (if (ip.asKnown().isPresent) 1 else 0) +
            (if (isTrustedUser.asKnown().isPresent) 1 else 0) +
            (if (ja4Fingerprint.asKnown().isPresent) 1 else 0) +
            (if (osVersion.asKnown().isPresent) 1 else 0) +
            (if (userAgent.asKnown().isPresent) 1 else 0)

    /** The type of the user's device. */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Signals &&
            appVersion == other.appVersion &&
            deviceId == other.deviceId &&
            deviceModel == other.deviceModel &&
            devicePlatform == other.devicePlatform &&
            existingUser == other.existingUser &&
            ip == other.ip &&
            isTrustedUser == other.isTrustedUser &&
            ja4Fingerprint == other.ja4Fingerprint &&
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
            existingUser,
            ip,
            isTrustedUser,
            ja4Fingerprint,
            osVersion,
            userAgent,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Signals{appVersion=$appVersion, deviceId=$deviceId, deviceModel=$deviceModel, devicePlatform=$devicePlatform, existingUser=$existingUser, ip=$ip, isTrustedUser=$isTrustedUser, ja4Fingerprint=$ja4Fingerprint, osVersion=$osVersion, userAgent=$userAgent, additionalProperties=$additionalProperties}"
}

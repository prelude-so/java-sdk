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
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

class LookupLookupResponse
private constructor(
    private val callerName: JsonField<String>,
    private val countryCode: JsonField<String>,
    private val flags: JsonField<List<Flag>>,
    private val lineType: JsonField<LineType>,
    private val networkInfo: JsonField<NetworkInfo>,
    private val originalNetworkInfo: JsonField<OriginalNetworkInfo>,
    private val phoneNumber: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("caller_name")
        @ExcludeMissing
        callerName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("flags") @ExcludeMissing flags: JsonField<List<Flag>> = JsonMissing.of(),
        @JsonProperty("line_type") @ExcludeMissing lineType: JsonField<LineType> = JsonMissing.of(),
        @JsonProperty("network_info")
        @ExcludeMissing
        networkInfo: JsonField<NetworkInfo> = JsonMissing.of(),
        @JsonProperty("original_network_info")
        @ExcludeMissing
        originalNetworkInfo: JsonField<OriginalNetworkInfo> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
    ) : this(
        callerName,
        countryCode,
        flags,
        lineType,
        networkInfo,
        originalNetworkInfo,
        phoneNumber,
        mutableMapOf(),
    )

    /**
     * The CNAM (Caller ID Name) associated with the phone number. Contact us if you need to use
     * this functionality. Once enabled, put `cnam` option to `type` query parameter.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callerName(): Optional<String> = callerName.getOptional("caller_name")

    /**
     * The country code of the phone number.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * A list of flags associated with the phone number.
     * - `ported` - Indicates the phone number has been transferred from one carrier to another.
     * - `temporary` - Indicates the phone number is likely a temporary or virtual number, often
     *   used for verification services or burner phones.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun flags(): Optional<List<Flag>> = flags.getOptional("flags")

    /**
     * The type of phone line.
     * - `calling_cards` - Numbers that are associated with providers of pre-paid domestic and
     *   international calling cards.
     * - `fixed_line` - Landline phone numbers.
     * - `isp` - Numbers reserved for Internet Service Providers.
     * - `local_rate` - Numbers that can be assigned non-geographically.
     * - `mobile` - Mobile phone numbers.
     * - `other` - Other types of services.
     * - `pager` - Number ranges specifically allocated to paging devices.
     * - `payphone` - Allocated numbers for payphone kiosks in some countries.
     * - `premium_rate` - Landline numbers where the calling party pays more than standard.
     * - `satellite` - Satellite phone numbers.
     * - `service` - Automated applications.
     * - `shared_cost` - Specific landline ranges where the cost of making the call is shared
     *   between the calling and called party.
     * - `short_codes_commercial` - Short codes are memorable, easy-to-use numbers, like the UK's
     *   NHS 111, often sold to businesses. Not available in all countries.
     * - `toll_free` - Number where the called party pays for the cost of the call not the calling
     *   party.
     * - `universal_access` - Number ranges reserved for Universal Access initiatives.
     * - `unknown` - Unknown phone number type.
     * - `vpn` - Numbers are used exclusively within a private telecommunications network,
     *   connecting the operator's terminals internally and not accessible via the public telephone
     *   network.
     * - `voice_mail` - A specific category of Interactive Voice Response (IVR) services.
     * - `voip` - Specific ranges for providers of VoIP services to allow incoming calls from the
     *   regular telephony network.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun lineType(): Optional<LineType> = lineType.getOptional("line_type")

    /**
     * The current carrier information.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkInfo(): Optional<NetworkInfo> = networkInfo.getOptional("network_info")

    /**
     * The original carrier information.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun originalNetworkInfo(): Optional<OriginalNetworkInfo> =
        originalNetworkInfo.getOptional("original_network_info")

    /**
     * The phone number.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Returns the raw JSON value of [callerName].
     *
     * Unlike [callerName], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("caller_name") @ExcludeMissing fun _callerName(): JsonField<String> = callerName

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [flags].
     *
     * Unlike [flags], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("flags") @ExcludeMissing fun _flags(): JsonField<List<Flag>> = flags

    /**
     * Returns the raw JSON value of [lineType].
     *
     * Unlike [lineType], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("line_type") @ExcludeMissing fun _lineType(): JsonField<LineType> = lineType

    /**
     * Returns the raw JSON value of [networkInfo].
     *
     * Unlike [networkInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network_info")
    @ExcludeMissing
    fun _networkInfo(): JsonField<NetworkInfo> = networkInfo

    /**
     * Returns the raw JSON value of [originalNetworkInfo].
     *
     * Unlike [originalNetworkInfo], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("original_network_info")
    @ExcludeMissing
    fun _originalNetworkInfo(): JsonField<OriginalNetworkInfo> = originalNetworkInfo

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

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

        /** Returns a mutable builder for constructing an instance of [LookupLookupResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [LookupLookupResponse]. */
    class Builder internal constructor() {

        private var callerName: JsonField<String> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var flags: JsonField<MutableList<Flag>>? = null
        private var lineType: JsonField<LineType> = JsonMissing.of()
        private var networkInfo: JsonField<NetworkInfo> = JsonMissing.of()
        private var originalNetworkInfo: JsonField<OriginalNetworkInfo> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lookupLookupResponse: LookupLookupResponse) = apply {
            callerName = lookupLookupResponse.callerName
            countryCode = lookupLookupResponse.countryCode
            flags = lookupLookupResponse.flags.map { it.toMutableList() }
            lineType = lookupLookupResponse.lineType
            networkInfo = lookupLookupResponse.networkInfo
            originalNetworkInfo = lookupLookupResponse.originalNetworkInfo
            phoneNumber = lookupLookupResponse.phoneNumber
            additionalProperties = lookupLookupResponse.additionalProperties.toMutableMap()
        }

        /**
         * The CNAM (Caller ID Name) associated with the phone number. Contact us if you need to use
         * this functionality. Once enabled, put `cnam` option to `type` query parameter.
         */
        fun callerName(callerName: String) = callerName(JsonField.of(callerName))

        /**
         * Sets [Builder.callerName] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callerName] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callerName(callerName: JsonField<String>) = apply { this.callerName = callerName }

        /** The country code of the phone number. */
        fun countryCode(countryCode: String) = countryCode(JsonField.of(countryCode))

        /**
         * Sets [Builder.countryCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryCode] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun countryCode(countryCode: JsonField<String>) = apply { this.countryCode = countryCode }

        /**
         * A list of flags associated with the phone number.
         * - `ported` - Indicates the phone number has been transferred from one carrier to another.
         * - `temporary` - Indicates the phone number is likely a temporary or virtual number, often
         *   used for verification services or burner phones.
         */
        fun flags(flags: List<Flag>) = flags(JsonField.of(flags))

        /**
         * Sets [Builder.flags] to an arbitrary JSON value.
         *
         * You should usually call [Builder.flags] with a well-typed `List<Flag>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun flags(flags: JsonField<List<Flag>>) = apply {
            this.flags = flags.map { it.toMutableList() }
        }

        /**
         * Adds a single [Flag] to [flags].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addFlag(flag: Flag) = apply {
            flags =
                (flags ?: JsonField.of(mutableListOf())).also { checkKnown("flags", it).add(flag) }
        }

        /**
         * The type of phone line.
         * - `calling_cards` - Numbers that are associated with providers of pre-paid domestic and
         *   international calling cards.
         * - `fixed_line` - Landline phone numbers.
         * - `isp` - Numbers reserved for Internet Service Providers.
         * - `local_rate` - Numbers that can be assigned non-geographically.
         * - `mobile` - Mobile phone numbers.
         * - `other` - Other types of services.
         * - `pager` - Number ranges specifically allocated to paging devices.
         * - `payphone` - Allocated numbers for payphone kiosks in some countries.
         * - `premium_rate` - Landline numbers where the calling party pays more than standard.
         * - `satellite` - Satellite phone numbers.
         * - `service` - Automated applications.
         * - `shared_cost` - Specific landline ranges where the cost of making the call is shared
         *   between the calling and called party.
         * - `short_codes_commercial` - Short codes are memorable, easy-to-use numbers, like the
         *   UK's NHS 111, often sold to businesses. Not available in all countries.
         * - `toll_free` - Number where the called party pays for the cost of the call not the
         *   calling party.
         * - `universal_access` - Number ranges reserved for Universal Access initiatives.
         * - `unknown` - Unknown phone number type.
         * - `vpn` - Numbers are used exclusively within a private telecommunications network,
         *   connecting the operator's terminals internally and not accessible via the public
         *   telephone network.
         * - `voice_mail` - A specific category of Interactive Voice Response (IVR) services.
         * - `voip` - Specific ranges for providers of VoIP services to allow incoming calls from
         *   the regular telephony network.
         */
        fun lineType(lineType: LineType) = lineType(JsonField.of(lineType))

        /**
         * Sets [Builder.lineType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.lineType] with a well-typed [LineType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun lineType(lineType: JsonField<LineType>) = apply { this.lineType = lineType }

        /** The current carrier information. */
        fun networkInfo(networkInfo: NetworkInfo) = networkInfo(JsonField.of(networkInfo))

        /**
         * Sets [Builder.networkInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkInfo] with a well-typed [NetworkInfo] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun networkInfo(networkInfo: JsonField<NetworkInfo>) = apply {
            this.networkInfo = networkInfo
        }

        /** The original carrier information. */
        fun originalNetworkInfo(originalNetworkInfo: OriginalNetworkInfo) =
            originalNetworkInfo(JsonField.of(originalNetworkInfo))

        /**
         * Sets [Builder.originalNetworkInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.originalNetworkInfo] with a well-typed
         * [OriginalNetworkInfo] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun originalNetworkInfo(originalNetworkInfo: JsonField<OriginalNetworkInfo>) = apply {
            this.originalNetworkInfo = originalNetworkInfo
        }

        /** The phone number. */
        fun phoneNumber(phoneNumber: String) = phoneNumber(JsonField.of(phoneNumber))

        /**
         * Sets [Builder.phoneNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.phoneNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun phoneNumber(phoneNumber: JsonField<String>) = apply { this.phoneNumber = phoneNumber }

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
         * Returns an immutable instance of [LookupLookupResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LookupLookupResponse =
            LookupLookupResponse(
                callerName,
                countryCode,
                (flags ?: JsonMissing.of()).map { it.toImmutable() },
                lineType,
                networkInfo,
                originalNetworkInfo,
                phoneNumber,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): LookupLookupResponse = apply {
        if (validated) {
            return@apply
        }

        callerName()
        countryCode()
        flags().ifPresent { it.forEach { it.validate() } }
        lineType().ifPresent { it.validate() }
        networkInfo().ifPresent { it.validate() }
        originalNetworkInfo().ifPresent { it.validate() }
        phoneNumber()
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
        (if (callerName.asKnown().isPresent) 1 else 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (flags.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (lineType.asKnown().getOrNull()?.validity() ?: 0) +
            (networkInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (originalNetworkInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0)

    class Flag @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PORTED = of("ported")

            @JvmField val TEMPORARY = of("temporary")

            @JvmStatic fun of(value: String) = Flag(JsonField.of(value))
        }

        /** An enum containing [Flag]'s known values. */
        enum class Known {
            PORTED,
            TEMPORARY,
        }

        /**
         * An enum containing [Flag]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Flag] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PORTED,
            TEMPORARY,
            /** An enum member indicating that [Flag] was instantiated with an unknown value. */
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
                PORTED -> Value.PORTED
                TEMPORARY -> Value.TEMPORARY
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
                PORTED -> Known.PORTED
                TEMPORARY -> Known.TEMPORARY
                else -> throw PreludeInvalidDataException("Unknown Flag: $value")
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

        fun validate(): Flag = apply {
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

            return /* spotless:off */ other is Flag && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * The type of phone line.
     * - `calling_cards` - Numbers that are associated with providers of pre-paid domestic and
     *   international calling cards.
     * - `fixed_line` - Landline phone numbers.
     * - `isp` - Numbers reserved for Internet Service Providers.
     * - `local_rate` - Numbers that can be assigned non-geographically.
     * - `mobile` - Mobile phone numbers.
     * - `other` - Other types of services.
     * - `pager` - Number ranges specifically allocated to paging devices.
     * - `payphone` - Allocated numbers for payphone kiosks in some countries.
     * - `premium_rate` - Landline numbers where the calling party pays more than standard.
     * - `satellite` - Satellite phone numbers.
     * - `service` - Automated applications.
     * - `shared_cost` - Specific landline ranges where the cost of making the call is shared
     *   between the calling and called party.
     * - `short_codes_commercial` - Short codes are memorable, easy-to-use numbers, like the UK's
     *   NHS 111, often sold to businesses. Not available in all countries.
     * - `toll_free` - Number where the called party pays for the cost of the call not the calling
     *   party.
     * - `universal_access` - Number ranges reserved for Universal Access initiatives.
     * - `unknown` - Unknown phone number type.
     * - `vpn` - Numbers are used exclusively within a private telecommunications network,
     *   connecting the operator's terminals internally and not accessible via the public telephone
     *   network.
     * - `voice_mail` - A specific category of Interactive Voice Response (IVR) services.
     * - `voip` - Specific ranges for providers of VoIP services to allow incoming calls from the
     *   regular telephony network.
     */
    class LineType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val CALLING_CARDS = of("calling_cards")

            @JvmField val FIXED_LINE = of("fixed_line")

            @JvmField val ISP = of("isp")

            @JvmField val LOCAL_RATE = of("local_rate")

            @JvmField val MOBILE = of("mobile")

            @JvmField val OTHER = of("other")

            @JvmField val PAGER = of("pager")

            @JvmField val PAYPHONE = of("payphone")

            @JvmField val PREMIUM_RATE = of("premium_rate")

            @JvmField val SATELLITE = of("satellite")

            @JvmField val SERVICE = of("service")

            @JvmField val SHARED_COST = of("shared_cost")

            @JvmField val SHORT_CODES_COMMERCIAL = of("short_codes_commercial")

            @JvmField val TOLL_FREE = of("toll_free")

            @JvmField val UNIVERSAL_ACCESS = of("universal_access")

            @JvmField val UNKNOWN = of("unknown")

            @JvmField val VPN = of("vpn")

            @JvmField val VOICE_MAIL = of("voice_mail")

            @JvmField val VOIP = of("voip")

            @JvmStatic fun of(value: String) = LineType(JsonField.of(value))
        }

        /** An enum containing [LineType]'s known values. */
        enum class Known {
            CALLING_CARDS,
            FIXED_LINE,
            ISP,
            LOCAL_RATE,
            MOBILE,
            OTHER,
            PAGER,
            PAYPHONE,
            PREMIUM_RATE,
            SATELLITE,
            SERVICE,
            SHARED_COST,
            SHORT_CODES_COMMERCIAL,
            TOLL_FREE,
            UNIVERSAL_ACCESS,
            UNKNOWN,
            VPN,
            VOICE_MAIL,
            VOIP,
        }

        /**
         * An enum containing [LineType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LineType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CALLING_CARDS,
            FIXED_LINE,
            ISP,
            LOCAL_RATE,
            MOBILE,
            OTHER,
            PAGER,
            PAYPHONE,
            PREMIUM_RATE,
            SATELLITE,
            SERVICE,
            SHARED_COST,
            SHORT_CODES_COMMERCIAL,
            TOLL_FREE,
            UNIVERSAL_ACCESS,
            UNKNOWN,
            VPN,
            VOICE_MAIL,
            VOIP,
            /** An enum member indicating that [LineType] was instantiated with an unknown value. */
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
                CALLING_CARDS -> Value.CALLING_CARDS
                FIXED_LINE -> Value.FIXED_LINE
                ISP -> Value.ISP
                LOCAL_RATE -> Value.LOCAL_RATE
                MOBILE -> Value.MOBILE
                OTHER -> Value.OTHER
                PAGER -> Value.PAGER
                PAYPHONE -> Value.PAYPHONE
                PREMIUM_RATE -> Value.PREMIUM_RATE
                SATELLITE -> Value.SATELLITE
                SERVICE -> Value.SERVICE
                SHARED_COST -> Value.SHARED_COST
                SHORT_CODES_COMMERCIAL -> Value.SHORT_CODES_COMMERCIAL
                TOLL_FREE -> Value.TOLL_FREE
                UNIVERSAL_ACCESS -> Value.UNIVERSAL_ACCESS
                UNKNOWN -> Value.UNKNOWN
                VPN -> Value.VPN
                VOICE_MAIL -> Value.VOICE_MAIL
                VOIP -> Value.VOIP
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
                CALLING_CARDS -> Known.CALLING_CARDS
                FIXED_LINE -> Known.FIXED_LINE
                ISP -> Known.ISP
                LOCAL_RATE -> Known.LOCAL_RATE
                MOBILE -> Known.MOBILE
                OTHER -> Known.OTHER
                PAGER -> Known.PAGER
                PAYPHONE -> Known.PAYPHONE
                PREMIUM_RATE -> Known.PREMIUM_RATE
                SATELLITE -> Known.SATELLITE
                SERVICE -> Known.SERVICE
                SHARED_COST -> Known.SHARED_COST
                SHORT_CODES_COMMERCIAL -> Known.SHORT_CODES_COMMERCIAL
                TOLL_FREE -> Known.TOLL_FREE
                UNIVERSAL_ACCESS -> Known.UNIVERSAL_ACCESS
                UNKNOWN -> Known.UNKNOWN
                VPN -> Known.VPN
                VOICE_MAIL -> Known.VOICE_MAIL
                VOIP -> Known.VOIP
                else -> throw PreludeInvalidDataException("Unknown LineType: $value")
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

        fun validate(): LineType = apply {
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

            return /* spotless:off */ other is LineType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The current carrier information. */
    class NetworkInfo
    private constructor(
        private val carrierName: JsonField<String>,
        private val mcc: JsonField<String>,
        private val mnc: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("carrier_name")
            @ExcludeMissing
            carrierName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mnc") @ExcludeMissing mnc: JsonField<String> = JsonMissing.of(),
        ) : this(carrierName, mcc, mnc, mutableMapOf())

        /**
         * The name of the carrier.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrierName(): Optional<String> = carrierName.getOptional("carrier_name")

        /**
         * Mobile Country Code.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcc(): Optional<String> = mcc.getOptional("mcc")

        /**
         * Mobile Network Code.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mnc(): Optional<String> = mnc.getOptional("mnc")

        /**
         * Returns the raw JSON value of [carrierName].
         *
         * Unlike [carrierName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier_name")
        @ExcludeMissing
        fun _carrierName(): JsonField<String> = carrierName

        /**
         * Returns the raw JSON value of [mcc].
         *
         * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /**
         * Returns the raw JSON value of [mnc].
         *
         * Unlike [mnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mnc") @ExcludeMissing fun _mnc(): JsonField<String> = mnc

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

            /** Returns a mutable builder for constructing an instance of [NetworkInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [NetworkInfo]. */
        class Builder internal constructor() {

            private var carrierName: JsonField<String> = JsonMissing.of()
            private var mcc: JsonField<String> = JsonMissing.of()
            private var mnc: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(networkInfo: NetworkInfo) = apply {
                carrierName = networkInfo.carrierName
                mcc = networkInfo.mcc
                mnc = networkInfo.mnc
                additionalProperties = networkInfo.additionalProperties.toMutableMap()
            }

            /** The name of the carrier. */
            fun carrierName(carrierName: String) = carrierName(JsonField.of(carrierName))

            /**
             * Sets [Builder.carrierName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrierName(carrierName: JsonField<String>) = apply {
                this.carrierName = carrierName
            }

            /** Mobile Country Code. */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Sets [Builder.mcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Mobile Network Code. */
            fun mnc(mnc: String) = mnc(JsonField.of(mnc))

            /**
             * Sets [Builder.mnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mnc(mnc: JsonField<String>) = apply { this.mnc = mnc }

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
             * Returns an immutable instance of [NetworkInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): NetworkInfo =
                NetworkInfo(carrierName, mcc, mnc, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): NetworkInfo = apply {
            if (validated) {
                return@apply
            }

            carrierName()
            mcc()
            mnc()
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
            (if (carrierName.asKnown().isPresent) 1 else 0) +
                (if (mcc.asKnown().isPresent) 1 else 0) +
                (if (mnc.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NetworkInfo && carrierName == other.carrierName && mcc == other.mcc && mnc == other.mnc && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(carrierName, mcc, mnc, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NetworkInfo{carrierName=$carrierName, mcc=$mcc, mnc=$mnc, additionalProperties=$additionalProperties}"
    }

    /** The original carrier information. */
    class OriginalNetworkInfo
    private constructor(
        private val carrierName: JsonField<String>,
        private val mcc: JsonField<String>,
        private val mnc: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("carrier_name")
            @ExcludeMissing
            carrierName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mcc") @ExcludeMissing mcc: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mnc") @ExcludeMissing mnc: JsonField<String> = JsonMissing.of(),
        ) : this(carrierName, mcc, mnc, mutableMapOf())

        /**
         * The name of the original carrier.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun carrierName(): Optional<String> = carrierName.getOptional("carrier_name")

        /**
         * Mobile Country Code.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mcc(): Optional<String> = mcc.getOptional("mcc")

        /**
         * Mobile Network Code.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun mnc(): Optional<String> = mnc.getOptional("mnc")

        /**
         * Returns the raw JSON value of [carrierName].
         *
         * Unlike [carrierName], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("carrier_name")
        @ExcludeMissing
        fun _carrierName(): JsonField<String> = carrierName

        /**
         * Returns the raw JSON value of [mcc].
         *
         * Unlike [mcc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /**
         * Returns the raw JSON value of [mnc].
         *
         * Unlike [mnc], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mnc") @ExcludeMissing fun _mnc(): JsonField<String> = mnc

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

            /** Returns a mutable builder for constructing an instance of [OriginalNetworkInfo]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [OriginalNetworkInfo]. */
        class Builder internal constructor() {

            private var carrierName: JsonField<String> = JsonMissing.of()
            private var mcc: JsonField<String> = JsonMissing.of()
            private var mnc: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(originalNetworkInfo: OriginalNetworkInfo) = apply {
                carrierName = originalNetworkInfo.carrierName
                mcc = originalNetworkInfo.mcc
                mnc = originalNetworkInfo.mnc
                additionalProperties = originalNetworkInfo.additionalProperties.toMutableMap()
            }

            /** The name of the original carrier. */
            fun carrierName(carrierName: String) = carrierName(JsonField.of(carrierName))

            /**
             * Sets [Builder.carrierName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.carrierName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun carrierName(carrierName: JsonField<String>) = apply {
                this.carrierName = carrierName
            }

            /** Mobile Country Code. */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Sets [Builder.mcc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mcc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Mobile Network Code. */
            fun mnc(mnc: String) = mnc(JsonField.of(mnc))

            /**
             * Sets [Builder.mnc] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mnc] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun mnc(mnc: JsonField<String>) = apply { this.mnc = mnc }

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
             * Returns an immutable instance of [OriginalNetworkInfo].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): OriginalNetworkInfo =
                OriginalNetworkInfo(carrierName, mcc, mnc, additionalProperties.toMutableMap())
        }

        private var validated: Boolean = false

        fun validate(): OriginalNetworkInfo = apply {
            if (validated) {
                return@apply
            }

            carrierName()
            mcc()
            mnc()
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
            (if (carrierName.asKnown().isPresent) 1 else 0) +
                (if (mcc.asKnown().isPresent) 1 else 0) +
                (if (mnc.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OriginalNetworkInfo && carrierName == other.carrierName && mcc == other.mcc && mnc == other.mnc && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(carrierName, mcc, mnc, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OriginalNetworkInfo{carrierName=$carrierName, mcc=$mcc, mnc=$mnc, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LookupLookupResponse && callerName == other.callerName && countryCode == other.countryCode && flags == other.flags && lineType == other.lineType && networkInfo == other.networkInfo && originalNetworkInfo == other.originalNetworkInfo && phoneNumber == other.phoneNumber && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(callerName, countryCode, flags, lineType, networkInfo, originalNetworkInfo, phoneNumber, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "LookupLookupResponse{callerName=$callerName, countryCode=$countryCode, flags=$flags, lineType=$lineType, networkInfo=$networkInfo, originalNetworkInfo=$originalNetworkInfo, phoneNumber=$phoneNumber, additionalProperties=$additionalProperties}"
}

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
 * The per-attribute match result. Each `<attribute>_match` field is one of `true`, `false`, or
 * `not_available` (the operator could not answer for that attribute). Fuzzy attributes additionally
 * return a `<attribute>_match_score` (0-99 similarity) when they do not match exactly; the score is
 * omitted on a match or when `not_available`.
 */
class IntelKycMatchResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val addressMatch: JsonField<AddressMatch>,
    private val addressMatchScore: JsonField<Long>,
    private val birthdateMatch: JsonField<BirthdateMatch>,
    private val countryCode: JsonField<String>,
    private val countryMatch: JsonField<CountryMatch>,
    private val emailMatch: JsonField<EmailMatch>,
    private val emailMatchScore: JsonField<Long>,
    private val familyNameMatch: JsonField<FamilyNameMatch>,
    private val familyNameMatchScore: JsonField<Long>,
    private val givenNameMatch: JsonField<GivenNameMatch>,
    private val givenNameMatchScore: JsonField<Long>,
    private val localityMatch: JsonField<LocalityMatch>,
    private val localityMatchScore: JsonField<Long>,
    private val operator: JsonField<String>,
    private val phoneNumber: JsonField<String>,
    private val postalCodeMatch: JsonField<PostalCodeMatch>,
    private val regionMatch: JsonField<RegionMatch>,
    private val regionMatchScore: JsonField<Long>,
    private val requestId: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("address_match")
        @ExcludeMissing
        addressMatch: JsonField<AddressMatch> = JsonMissing.of(),
        @JsonProperty("address_match_score")
        @ExcludeMissing
        addressMatchScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("birthdate_match")
        @ExcludeMissing
        birthdateMatch: JsonField<BirthdateMatch> = JsonMissing.of(),
        @JsonProperty("country_code")
        @ExcludeMissing
        countryCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country_match")
        @ExcludeMissing
        countryMatch: JsonField<CountryMatch> = JsonMissing.of(),
        @JsonProperty("email_match")
        @ExcludeMissing
        emailMatch: JsonField<EmailMatch> = JsonMissing.of(),
        @JsonProperty("email_match_score")
        @ExcludeMissing
        emailMatchScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("family_name_match")
        @ExcludeMissing
        familyNameMatch: JsonField<FamilyNameMatch> = JsonMissing.of(),
        @JsonProperty("family_name_match_score")
        @ExcludeMissing
        familyNameMatchScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("given_name_match")
        @ExcludeMissing
        givenNameMatch: JsonField<GivenNameMatch> = JsonMissing.of(),
        @JsonProperty("given_name_match_score")
        @ExcludeMissing
        givenNameMatchScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("locality_match")
        @ExcludeMissing
        localityMatch: JsonField<LocalityMatch> = JsonMissing.of(),
        @JsonProperty("locality_match_score")
        @ExcludeMissing
        localityMatchScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("operator") @ExcludeMissing operator: JsonField<String> = JsonMissing.of(),
        @JsonProperty("phone_number")
        @ExcludeMissing
        phoneNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("postal_code_match")
        @ExcludeMissing
        postalCodeMatch: JsonField<PostalCodeMatch> = JsonMissing.of(),
        @JsonProperty("region_match")
        @ExcludeMissing
        regionMatch: JsonField<RegionMatch> = JsonMissing.of(),
        @JsonProperty("region_match_score")
        @ExcludeMissing
        regionMatchScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("request_id") @ExcludeMissing requestId: JsonField<String> = JsonMissing.of(),
    ) : this(
        addressMatch,
        addressMatchScore,
        birthdateMatch,
        countryCode,
        countryMatch,
        emailMatch,
        emailMatchScore,
        familyNameMatch,
        familyNameMatchScore,
        givenNameMatch,
        givenNameMatchScore,
        localityMatch,
        localityMatchScore,
        operator,
        phoneNumber,
        postalCodeMatch,
        regionMatch,
        regionMatchScore,
        requestId,
        mutableMapOf(),
    )

    /**
     * Whether the street address matched the operator's record.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressMatch(): Optional<AddressMatch> = addressMatch.getOptional("address_match")

    /**
     * Similarity score (0-99) for the address. Returned only on a non-match.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun addressMatchScore(): Optional<Long> = addressMatchScore.getOptional("address_match_score")

    /**
     * Whether the date of birth matched the operator's record. Compared exactly; never scored.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun birthdateMatch(): Optional<BirthdateMatch> = birthdateMatch.getOptional("birthdate_match")

    /**
     * The country code of the phone number.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryCode(): Optional<String> = countryCode.getOptional("country_code")

    /**
     * Whether the country matched the operator's record. Compared exactly; never scored.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun countryMatch(): Optional<CountryMatch> = countryMatch.getOptional("country_match")

    /**
     * Whether the email address matched the operator's record.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailMatch(): Optional<EmailMatch> = emailMatch.getOptional("email_match")

    /**
     * Similarity score (0-99) for the email. Returned only on a non-match.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun emailMatchScore(): Optional<Long> = emailMatchScore.getOptional("email_match_score")

    /**
     * Whether the family name matched the operator's record.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun familyNameMatch(): Optional<FamilyNameMatch> =
        familyNameMatch.getOptional("family_name_match")

    /**
     * Similarity score (0-99) for the family name. Returned only on a non-match.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun familyNameMatchScore(): Optional<Long> =
        familyNameMatchScore.getOptional("family_name_match_score")

    /**
     * Whether the given name matched the operator's record.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun givenNameMatch(): Optional<GivenNameMatch> = givenNameMatch.getOptional("given_name_match")

    /**
     * Similarity score (0-99) for the given name. Returned only on a non-match.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun givenNameMatchScore(): Optional<Long> =
        givenNameMatchScore.getOptional("given_name_match_score")

    /**
     * Whether the locality matched the operator's record.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun localityMatch(): Optional<LocalityMatch> = localityMatch.getOptional("locality_match")

    /**
     * Similarity score (0-99) for the locality. Returned only on a non-match.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun localityMatchScore(): Optional<Long> =
        localityMatchScore.getOptional("locality_match_score")

    /**
     * The mobile operator that answered the match.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun operator(): Optional<String> = operator.getOptional("operator")

    /**
     * The phone number that was matched, in E.164 format.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun phoneNumber(): Optional<String> = phoneNumber.getOptional("phone_number")

    /**
     * Whether the postal code matched the operator's record. Compared exactly; never scored.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun postalCodeMatch(): Optional<PostalCodeMatch> =
        postalCodeMatch.getOptional("postal_code_match")

    /**
     * Whether the region matched the operator's record.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionMatch(): Optional<RegionMatch> = regionMatch.getOptional("region_match")

    /**
     * Similarity score (0-99) for the region. Returned only on a non-match.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun regionMatchScore(): Optional<Long> = regionMatchScore.getOptional("region_match_score")

    /**
     * A string that identifies this specific request. Report it back to us to help us diagnose your
     * issues.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun requestId(): Optional<String> = requestId.getOptional("request_id")

    /**
     * Returns the raw JSON value of [addressMatch].
     *
     * Unlike [addressMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("address_match")
    @ExcludeMissing
    fun _addressMatch(): JsonField<AddressMatch> = addressMatch

    /**
     * Returns the raw JSON value of [addressMatchScore].
     *
     * Unlike [addressMatchScore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("address_match_score")
    @ExcludeMissing
    fun _addressMatchScore(): JsonField<Long> = addressMatchScore

    /**
     * Returns the raw JSON value of [birthdateMatch].
     *
     * Unlike [birthdateMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("birthdate_match")
    @ExcludeMissing
    fun _birthdateMatch(): JsonField<BirthdateMatch> = birthdateMatch

    /**
     * Returns the raw JSON value of [countryCode].
     *
     * Unlike [countryCode], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_code")
    @ExcludeMissing
    fun _countryCode(): JsonField<String> = countryCode

    /**
     * Returns the raw JSON value of [countryMatch].
     *
     * Unlike [countryMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("country_match")
    @ExcludeMissing
    fun _countryMatch(): JsonField<CountryMatch> = countryMatch

    /**
     * Returns the raw JSON value of [emailMatch].
     *
     * Unlike [emailMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email_match")
    @ExcludeMissing
    fun _emailMatch(): JsonField<EmailMatch> = emailMatch

    /**
     * Returns the raw JSON value of [emailMatchScore].
     *
     * Unlike [emailMatchScore], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("email_match_score")
    @ExcludeMissing
    fun _emailMatchScore(): JsonField<Long> = emailMatchScore

    /**
     * Returns the raw JSON value of [familyNameMatch].
     *
     * Unlike [familyNameMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("family_name_match")
    @ExcludeMissing
    fun _familyNameMatch(): JsonField<FamilyNameMatch> = familyNameMatch

    /**
     * Returns the raw JSON value of [familyNameMatchScore].
     *
     * Unlike [familyNameMatchScore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("family_name_match_score")
    @ExcludeMissing
    fun _familyNameMatchScore(): JsonField<Long> = familyNameMatchScore

    /**
     * Returns the raw JSON value of [givenNameMatch].
     *
     * Unlike [givenNameMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("given_name_match")
    @ExcludeMissing
    fun _givenNameMatch(): JsonField<GivenNameMatch> = givenNameMatch

    /**
     * Returns the raw JSON value of [givenNameMatchScore].
     *
     * Unlike [givenNameMatchScore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("given_name_match_score")
    @ExcludeMissing
    fun _givenNameMatchScore(): JsonField<Long> = givenNameMatchScore

    /**
     * Returns the raw JSON value of [localityMatch].
     *
     * Unlike [localityMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("locality_match")
    @ExcludeMissing
    fun _localityMatch(): JsonField<LocalityMatch> = localityMatch

    /**
     * Returns the raw JSON value of [localityMatchScore].
     *
     * Unlike [localityMatchScore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("locality_match_score")
    @ExcludeMissing
    fun _localityMatchScore(): JsonField<Long> = localityMatchScore

    /**
     * Returns the raw JSON value of [operator].
     *
     * Unlike [operator], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("operator") @ExcludeMissing fun _operator(): JsonField<String> = operator

    /**
     * Returns the raw JSON value of [phoneNumber].
     *
     * Unlike [phoneNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("phone_number")
    @ExcludeMissing
    fun _phoneNumber(): JsonField<String> = phoneNumber

    /**
     * Returns the raw JSON value of [postalCodeMatch].
     *
     * Unlike [postalCodeMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("postal_code_match")
    @ExcludeMissing
    fun _postalCodeMatch(): JsonField<PostalCodeMatch> = postalCodeMatch

    /**
     * Returns the raw JSON value of [regionMatch].
     *
     * Unlike [regionMatch], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("region_match")
    @ExcludeMissing
    fun _regionMatch(): JsonField<RegionMatch> = regionMatch

    /**
     * Returns the raw JSON value of [regionMatchScore].
     *
     * Unlike [regionMatchScore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("region_match_score")
    @ExcludeMissing
    fun _regionMatchScore(): JsonField<Long> = regionMatchScore

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

        /** Returns a mutable builder for constructing an instance of [IntelKycMatchResponse]. */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [IntelKycMatchResponse]. */
    class Builder internal constructor() {

        private var addressMatch: JsonField<AddressMatch> = JsonMissing.of()
        private var addressMatchScore: JsonField<Long> = JsonMissing.of()
        private var birthdateMatch: JsonField<BirthdateMatch> = JsonMissing.of()
        private var countryCode: JsonField<String> = JsonMissing.of()
        private var countryMatch: JsonField<CountryMatch> = JsonMissing.of()
        private var emailMatch: JsonField<EmailMatch> = JsonMissing.of()
        private var emailMatchScore: JsonField<Long> = JsonMissing.of()
        private var familyNameMatch: JsonField<FamilyNameMatch> = JsonMissing.of()
        private var familyNameMatchScore: JsonField<Long> = JsonMissing.of()
        private var givenNameMatch: JsonField<GivenNameMatch> = JsonMissing.of()
        private var givenNameMatchScore: JsonField<Long> = JsonMissing.of()
        private var localityMatch: JsonField<LocalityMatch> = JsonMissing.of()
        private var localityMatchScore: JsonField<Long> = JsonMissing.of()
        private var operator: JsonField<String> = JsonMissing.of()
        private var phoneNumber: JsonField<String> = JsonMissing.of()
        private var postalCodeMatch: JsonField<PostalCodeMatch> = JsonMissing.of()
        private var regionMatch: JsonField<RegionMatch> = JsonMissing.of()
        private var regionMatchScore: JsonField<Long> = JsonMissing.of()
        private var requestId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(intelKycMatchResponse: IntelKycMatchResponse) = apply {
            addressMatch = intelKycMatchResponse.addressMatch
            addressMatchScore = intelKycMatchResponse.addressMatchScore
            birthdateMatch = intelKycMatchResponse.birthdateMatch
            countryCode = intelKycMatchResponse.countryCode
            countryMatch = intelKycMatchResponse.countryMatch
            emailMatch = intelKycMatchResponse.emailMatch
            emailMatchScore = intelKycMatchResponse.emailMatchScore
            familyNameMatch = intelKycMatchResponse.familyNameMatch
            familyNameMatchScore = intelKycMatchResponse.familyNameMatchScore
            givenNameMatch = intelKycMatchResponse.givenNameMatch
            givenNameMatchScore = intelKycMatchResponse.givenNameMatchScore
            localityMatch = intelKycMatchResponse.localityMatch
            localityMatchScore = intelKycMatchResponse.localityMatchScore
            operator = intelKycMatchResponse.operator
            phoneNumber = intelKycMatchResponse.phoneNumber
            postalCodeMatch = intelKycMatchResponse.postalCodeMatch
            regionMatch = intelKycMatchResponse.regionMatch
            regionMatchScore = intelKycMatchResponse.regionMatchScore
            requestId = intelKycMatchResponse.requestId
            additionalProperties = intelKycMatchResponse.additionalProperties.toMutableMap()
        }

        /** Whether the street address matched the operator's record. */
        fun addressMatch(addressMatch: AddressMatch) = addressMatch(JsonField.of(addressMatch))

        /**
         * Sets [Builder.addressMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressMatch] with a well-typed [AddressMatch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addressMatch(addressMatch: JsonField<AddressMatch>) = apply {
            this.addressMatch = addressMatch
        }

        /** Similarity score (0-99) for the address. Returned only on a non-match. */
        fun addressMatchScore(addressMatchScore: Long) =
            addressMatchScore(JsonField.of(addressMatchScore))

        /**
         * Sets [Builder.addressMatchScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.addressMatchScore] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun addressMatchScore(addressMatchScore: JsonField<Long>) = apply {
            this.addressMatchScore = addressMatchScore
        }

        /**
         * Whether the date of birth matched the operator's record. Compared exactly; never scored.
         */
        fun birthdateMatch(birthdateMatch: BirthdateMatch) =
            birthdateMatch(JsonField.of(birthdateMatch))

        /**
         * Sets [Builder.birthdateMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.birthdateMatch] with a well-typed [BirthdateMatch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun birthdateMatch(birthdateMatch: JsonField<BirthdateMatch>) = apply {
            this.birthdateMatch = birthdateMatch
        }

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

        /** Whether the country matched the operator's record. Compared exactly; never scored. */
        fun countryMatch(countryMatch: CountryMatch) = countryMatch(JsonField.of(countryMatch))

        /**
         * Sets [Builder.countryMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.countryMatch] with a well-typed [CountryMatch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun countryMatch(countryMatch: JsonField<CountryMatch>) = apply {
            this.countryMatch = countryMatch
        }

        /** Whether the email address matched the operator's record. */
        fun emailMatch(emailMatch: EmailMatch) = emailMatch(JsonField.of(emailMatch))

        /**
         * Sets [Builder.emailMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailMatch] with a well-typed [EmailMatch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun emailMatch(emailMatch: JsonField<EmailMatch>) = apply { this.emailMatch = emailMatch }

        /** Similarity score (0-99) for the email. Returned only on a non-match. */
        fun emailMatchScore(emailMatchScore: Long) = emailMatchScore(JsonField.of(emailMatchScore))

        /**
         * Sets [Builder.emailMatchScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.emailMatchScore] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun emailMatchScore(emailMatchScore: JsonField<Long>) = apply {
            this.emailMatchScore = emailMatchScore
        }

        /** Whether the family name matched the operator's record. */
        fun familyNameMatch(familyNameMatch: FamilyNameMatch) =
            familyNameMatch(JsonField.of(familyNameMatch))

        /**
         * Sets [Builder.familyNameMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.familyNameMatch] with a well-typed [FamilyNameMatch]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun familyNameMatch(familyNameMatch: JsonField<FamilyNameMatch>) = apply {
            this.familyNameMatch = familyNameMatch
        }

        /** Similarity score (0-99) for the family name. Returned only on a non-match. */
        fun familyNameMatchScore(familyNameMatchScore: Long) =
            familyNameMatchScore(JsonField.of(familyNameMatchScore))

        /**
         * Sets [Builder.familyNameMatchScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.familyNameMatchScore] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun familyNameMatchScore(familyNameMatchScore: JsonField<Long>) = apply {
            this.familyNameMatchScore = familyNameMatchScore
        }

        /** Whether the given name matched the operator's record. */
        fun givenNameMatch(givenNameMatch: GivenNameMatch) =
            givenNameMatch(JsonField.of(givenNameMatch))

        /**
         * Sets [Builder.givenNameMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.givenNameMatch] with a well-typed [GivenNameMatch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun givenNameMatch(givenNameMatch: JsonField<GivenNameMatch>) = apply {
            this.givenNameMatch = givenNameMatch
        }

        /** Similarity score (0-99) for the given name. Returned only on a non-match. */
        fun givenNameMatchScore(givenNameMatchScore: Long) =
            givenNameMatchScore(JsonField.of(givenNameMatchScore))

        /**
         * Sets [Builder.givenNameMatchScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.givenNameMatchScore] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun givenNameMatchScore(givenNameMatchScore: JsonField<Long>) = apply {
            this.givenNameMatchScore = givenNameMatchScore
        }

        /** Whether the locality matched the operator's record. */
        fun localityMatch(localityMatch: LocalityMatch) = localityMatch(JsonField.of(localityMatch))

        /**
         * Sets [Builder.localityMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.localityMatch] with a well-typed [LocalityMatch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun localityMatch(localityMatch: JsonField<LocalityMatch>) = apply {
            this.localityMatch = localityMatch
        }

        /** Similarity score (0-99) for the locality. Returned only on a non-match. */
        fun localityMatchScore(localityMatchScore: Long) =
            localityMatchScore(JsonField.of(localityMatchScore))

        /**
         * Sets [Builder.localityMatchScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.localityMatchScore] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun localityMatchScore(localityMatchScore: JsonField<Long>) = apply {
            this.localityMatchScore = localityMatchScore
        }

        /** The mobile operator that answered the match. */
        fun operator(operator: String) = operator(JsonField.of(operator))

        /**
         * Sets [Builder.operator] to an arbitrary JSON value.
         *
         * You should usually call [Builder.operator] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun operator(operator: JsonField<String>) = apply { this.operator = operator }

        /** The phone number that was matched, in E.164 format. */
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
         * Whether the postal code matched the operator's record. Compared exactly; never scored.
         */
        fun postalCodeMatch(postalCodeMatch: PostalCodeMatch) =
            postalCodeMatch(JsonField.of(postalCodeMatch))

        /**
         * Sets [Builder.postalCodeMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.postalCodeMatch] with a well-typed [PostalCodeMatch]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun postalCodeMatch(postalCodeMatch: JsonField<PostalCodeMatch>) = apply {
            this.postalCodeMatch = postalCodeMatch
        }

        /** Whether the region matched the operator's record. */
        fun regionMatch(regionMatch: RegionMatch) = regionMatch(JsonField.of(regionMatch))

        /**
         * Sets [Builder.regionMatch] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionMatch] with a well-typed [RegionMatch] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun regionMatch(regionMatch: JsonField<RegionMatch>) = apply {
            this.regionMatch = regionMatch
        }

        /** Similarity score (0-99) for the region. Returned only on a non-match. */
        fun regionMatchScore(regionMatchScore: Long) =
            regionMatchScore(JsonField.of(regionMatchScore))

        /**
         * Sets [Builder.regionMatchScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.regionMatchScore] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun regionMatchScore(regionMatchScore: JsonField<Long>) = apply {
            this.regionMatchScore = regionMatchScore
        }

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
         * Returns an immutable instance of [IntelKycMatchResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): IntelKycMatchResponse =
            IntelKycMatchResponse(
                addressMatch,
                addressMatchScore,
                birthdateMatch,
                countryCode,
                countryMatch,
                emailMatch,
                emailMatchScore,
                familyNameMatch,
                familyNameMatchScore,
                givenNameMatch,
                givenNameMatchScore,
                localityMatch,
                localityMatchScore,
                operator,
                phoneNumber,
                postalCodeMatch,
                regionMatch,
                regionMatchScore,
                requestId,
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
    fun validate(): IntelKycMatchResponse = apply {
        if (validated) {
            return@apply
        }

        addressMatch().ifPresent { it.validate() }
        addressMatchScore()
        birthdateMatch().ifPresent { it.validate() }
        countryCode()
        countryMatch().ifPresent { it.validate() }
        emailMatch().ifPresent { it.validate() }
        emailMatchScore()
        familyNameMatch().ifPresent { it.validate() }
        familyNameMatchScore()
        givenNameMatch().ifPresent { it.validate() }
        givenNameMatchScore()
        localityMatch().ifPresent { it.validate() }
        localityMatchScore()
        operator()
        phoneNumber()
        postalCodeMatch().ifPresent { it.validate() }
        regionMatch().ifPresent { it.validate() }
        regionMatchScore()
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
        (addressMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (addressMatchScore.asKnown().isPresent) 1 else 0) +
            (birthdateMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (countryCode.asKnown().isPresent) 1 else 0) +
            (countryMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (emailMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (emailMatchScore.asKnown().isPresent) 1 else 0) +
            (familyNameMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (familyNameMatchScore.asKnown().isPresent) 1 else 0) +
            (givenNameMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (givenNameMatchScore.asKnown().isPresent) 1 else 0) +
            (localityMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (localityMatchScore.asKnown().isPresent) 1 else 0) +
            (if (operator.asKnown().isPresent) 1 else 0) +
            (if (phoneNumber.asKnown().isPresent) 1 else 0) +
            (postalCodeMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (regionMatch.asKnown().getOrNull()?.validity() ?: 0) +
            (if (regionMatchScore.asKnown().isPresent) 1 else 0) +
            (if (requestId.asKnown().isPresent) 1 else 0)

    /** Whether the street address matched the operator's record. */
    class AddressMatch @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = AddressMatch(JsonField.of(value))
        }

        /** An enum containing [AddressMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [AddressMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [AddressMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [AddressMatch] was instantiated with an unknown value.
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown AddressMatch: $value")
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
        fun validate(): AddressMatch = apply {
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

            return other is AddressMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the date of birth matched the operator's record. Compared exactly; never scored. */
    class BirthdateMatch @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = BirthdateMatch(JsonField.of(value))
        }

        /** An enum containing [BirthdateMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [BirthdateMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BirthdateMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [BirthdateMatch] was instantiated with an unknown
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown BirthdateMatch: $value")
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
        fun validate(): BirthdateMatch = apply {
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

            return other is BirthdateMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the country matched the operator's record. Compared exactly; never scored. */
    class CountryMatch @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = CountryMatch(JsonField.of(value))
        }

        /** An enum containing [CountryMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [CountryMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [CountryMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [CountryMatch] was instantiated with an unknown value.
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown CountryMatch: $value")
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
        fun validate(): CountryMatch = apply {
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

            return other is CountryMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the email address matched the operator's record. */
    class EmailMatch @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = EmailMatch(JsonField.of(value))
        }

        /** An enum containing [EmailMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [EmailMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [EmailMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [EmailMatch] was instantiated with an unknown value.
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown EmailMatch: $value")
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
        fun validate(): EmailMatch = apply {
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

            return other is EmailMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the family name matched the operator's record. */
    class FamilyNameMatch @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = FamilyNameMatch(JsonField.of(value))
        }

        /** An enum containing [FamilyNameMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [FamilyNameMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FamilyNameMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [FamilyNameMatch] was instantiated with an unknown
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown FamilyNameMatch: $value")
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
        fun validate(): FamilyNameMatch = apply {
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

            return other is FamilyNameMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the given name matched the operator's record. */
    class GivenNameMatch @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = GivenNameMatch(JsonField.of(value))
        }

        /** An enum containing [GivenNameMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [GivenNameMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GivenNameMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [GivenNameMatch] was instantiated with an unknown
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown GivenNameMatch: $value")
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
        fun validate(): GivenNameMatch = apply {
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

            return other is GivenNameMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the locality matched the operator's record. */
    class LocalityMatch @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = LocalityMatch(JsonField.of(value))
        }

        /** An enum containing [LocalityMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [LocalityMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LocalityMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [LocalityMatch] was instantiated with an unknown
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown LocalityMatch: $value")
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
        fun validate(): LocalityMatch = apply {
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

            return other is LocalityMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the postal code matched the operator's record. Compared exactly; never scored. */
    class PostalCodeMatch @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = PostalCodeMatch(JsonField.of(value))
        }

        /** An enum containing [PostalCodeMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [PostalCodeMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [PostalCodeMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [PostalCodeMatch] was instantiated with an unknown
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown PostalCodeMatch: $value")
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
        fun validate(): PostalCodeMatch = apply {
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

            return other is PostalCodeMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether the region matched the operator's record. */
    class RegionMatch @JsonCreator private constructor(private val value: JsonField<String>) :
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

            @JvmField val TRUE = of("true")

            @JvmField val FALSE = of("false")

            @JvmField val NOT_AVAILABLE = of("not_available")

            @JvmStatic fun of(value: String) = RegionMatch(JsonField.of(value))
        }

        /** An enum containing [RegionMatch]'s known values. */
        enum class Known {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
        }

        /**
         * An enum containing [RegionMatch]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [RegionMatch] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            TRUE,
            FALSE,
            NOT_AVAILABLE,
            /**
             * An enum member indicating that [RegionMatch] was instantiated with an unknown value.
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
                TRUE -> Value.TRUE
                FALSE -> Value.FALSE
                NOT_AVAILABLE -> Value.NOT_AVAILABLE
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
                TRUE -> Known.TRUE
                FALSE -> Known.FALSE
                NOT_AVAILABLE -> Known.NOT_AVAILABLE
                else -> throw PreludeInvalidDataException("Unknown RegionMatch: $value")
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
        fun validate(): RegionMatch = apply {
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

            return other is RegionMatch && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is IntelKycMatchResponse &&
            addressMatch == other.addressMatch &&
            addressMatchScore == other.addressMatchScore &&
            birthdateMatch == other.birthdateMatch &&
            countryCode == other.countryCode &&
            countryMatch == other.countryMatch &&
            emailMatch == other.emailMatch &&
            emailMatchScore == other.emailMatchScore &&
            familyNameMatch == other.familyNameMatch &&
            familyNameMatchScore == other.familyNameMatchScore &&
            givenNameMatch == other.givenNameMatch &&
            givenNameMatchScore == other.givenNameMatchScore &&
            localityMatch == other.localityMatch &&
            localityMatchScore == other.localityMatchScore &&
            operator == other.operator &&
            phoneNumber == other.phoneNumber &&
            postalCodeMatch == other.postalCodeMatch &&
            regionMatch == other.regionMatch &&
            regionMatchScore == other.regionMatchScore &&
            requestId == other.requestId &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            addressMatch,
            addressMatchScore,
            birthdateMatch,
            countryCode,
            countryMatch,
            emailMatch,
            emailMatchScore,
            familyNameMatch,
            familyNameMatchScore,
            givenNameMatch,
            givenNameMatchScore,
            localityMatch,
            localityMatchScore,
            operator,
            phoneNumber,
            postalCodeMatch,
            regionMatch,
            regionMatchScore,
            requestId,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "IntelKycMatchResponse{addressMatch=$addressMatch, addressMatchScore=$addressMatchScore, birthdateMatch=$birthdateMatch, countryCode=$countryCode, countryMatch=$countryMatch, emailMatch=$emailMatch, emailMatchScore=$emailMatchScore, familyNameMatch=$familyNameMatch, familyNameMatchScore=$familyNameMatchScore, givenNameMatch=$givenNameMatch, givenNameMatchScore=$givenNameMatchScore, localityMatch=$localityMatch, localityMatchScore=$localityMatchScore, operator=$operator, phoneNumber=$phoneNumber, postalCodeMatch=$postalCodeMatch, regionMatch=$regionMatch, regionMatchScore=$regionMatchScore, requestId=$requestId, additionalProperties=$additionalProperties}"
}

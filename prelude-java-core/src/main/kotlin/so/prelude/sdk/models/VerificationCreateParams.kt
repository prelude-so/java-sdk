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
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.QueryParams
import so.prelude.sdk.core.immutableEmptyMap
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

class VerificationCreateParams
constructor(
    private val target: Target,
    private val metadata: Metadata?,
    private val options: Options?,
    private val signals: Signals?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun target(): Target = target

    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

    fun options(): Optional<Options> = Optional.ofNullable(options)

    fun signals(): Optional<Signals> = Optional.ofNullable(signals)

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    @JvmSynthetic
    internal fun getBody(): VerificationCreateBody {
        return VerificationCreateBody(
            target,
            metadata,
            options,
            signals,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class VerificationCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("target") private val target: Target,
        @JsonProperty("metadata") private val metadata: Metadata?,
        @JsonProperty("options") private val options: Options?,
        @JsonProperty("signals") private val signals: Signals?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The target. Currently this can only be an E.164 formatted phone number. */
        @JsonProperty("target") fun target(): Target = target

        /**
         * The metadata for this verification. This object will be returned with every response or
         * webhook sent that refers to this verification.
         */
        @JsonProperty("metadata") fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata)

        /** Verification options */
        @JsonProperty("options") fun options(): Optional<Options> = Optional.ofNullable(options)

        /** The signals used for anti-fraud. */
        @JsonProperty("signals") fun signals(): Optional<Signals> = Optional.ofNullable(signals)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var target: Target? = null
            private var metadata: Metadata? = null
            private var options: Options? = null
            private var signals: Signals? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(verificationCreateBody: VerificationCreateBody) = apply {
                target = verificationCreateBody.target
                metadata = verificationCreateBody.metadata
                options = verificationCreateBody.options
                signals = verificationCreateBody.signals
                additionalProperties = verificationCreateBody.additionalProperties.toMutableMap()
            }

            /** The target. Currently this can only be an E.164 formatted phone number. */
            fun target(target: Target) = apply { this.target = target }

            /**
             * The metadata for this verification. This object will be returned with every response
             * or webhook sent that refers to this verification.
             */
            fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

            /** Verification options */
            fun options(options: Options) = apply { this.options = options }

            /** The signals used for anti-fraud. */
            fun signals(signals: Signals) = apply { this.signals = signals }

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

            fun build(): VerificationCreateBody =
                VerificationCreateBody(
                    checkNotNull(target) { "`target` is required but was not set" },
                    metadata,
                    options,
                    signals,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is VerificationCreateBody && target == other.target && metadata == other.metadata && options == other.options && signals == other.signals && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(target, metadata, options, signals, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "VerificationCreateBody{target=$target, metadata=$metadata, options=$options, signals=$signals, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var target: Target? = null
        private var metadata: Metadata? = null
        private var options: Options? = null
        private var signals: Signals? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(verificationCreateParams: VerificationCreateParams) = apply {
            target = verificationCreateParams.target
            metadata = verificationCreateParams.metadata
            options = verificationCreateParams.options
            signals = verificationCreateParams.signals
            additionalHeaders = verificationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = verificationCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                verificationCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The target. Currently this can only be an E.164 formatted phone number. */
        fun target(target: Target) = apply { this.target = target }

        /**
         * The metadata for this verification. This object will be returned with every response or
         * webhook sent that refers to this verification.
         */
        fun metadata(metadata: Metadata) = apply { this.metadata = metadata }

        /** Verification options */
        fun options(options: Options) = apply { this.options = options }

        /** The signals used for anti-fraud. */
        fun signals(signals: Signals) = apply { this.signals = signals }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): VerificationCreateParams =
            VerificationCreateParams(
                checkNotNull(target) { "`target` is required but was not set" },
                metadata,
                options,
                signals,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    /** The target. Currently this can only be an E.164 formatted phone number. */
    @NoAutoDetect
    class Target
    @JsonCreator
    private constructor(
        @JsonProperty("type") private val type: Type,
        @JsonProperty("value") private val value: String,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The type of the target. Currently this can only be "phone_number". */
        @JsonProperty("type") fun type(): Type = type

        /** An E.164 formatted phone number to verify. */
        @JsonProperty("value") fun value(): String = value

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var type: Type? = null
            private var value: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(target: Target) = apply {
                type = target.type
                value = target.value
                additionalProperties = target.additionalProperties.toMutableMap()
            }

            /** The type of the target. Currently this can only be "phone_number". */
            fun type(type: Type) = apply { this.type = type }

            /** An E.164 formatted phone number to verify. */
            fun value(value: String) = apply { this.value = value }

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

            fun build(): Target =
                Target(
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(value) { "`value` is required but was not set" },
                    additionalProperties.toImmutable(),
                )
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PHONE_NUMBER = of("phone_number")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            enum class Known {
                PHONE_NUMBER,
            }

            enum class Value {
                PHONE_NUMBER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PHONE_NUMBER -> Value.PHONE_NUMBER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PHONE_NUMBER -> Known.PHONE_NUMBER
                    else -> throw PreludeInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Target && type == other.type && value == other.value && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(type, value, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Target{type=$type, value=$value, additionalProperties=$additionalProperties}"
    }

    /**
     * The metadata for this verification. This object will be returned with every response or
     * webhook sent that refers to this verification.
     */
    @NoAutoDetect
    class Metadata
    @JsonCreator
    private constructor(
        @JsonProperty("correlation_id") private val correlationId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** A user-defined identifier to correlate this verification with. */
        @JsonProperty("correlation_id")
        fun correlationId(): Optional<String> = Optional.ofNullable(correlationId)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var correlationId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                correlationId = metadata.correlationId
                additionalProperties = metadata.additionalProperties.toMutableMap()
            }

            /** A user-defined identifier to correlate this verification with. */
            fun correlationId(correlationId: String) = apply { this.correlationId = correlationId }

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

            fun build(): Metadata = Metadata(correlationId, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Metadata && correlationId == other.correlationId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(correlationId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Metadata{correlationId=$correlationId, additionalProperties=$additionalProperties}"
    }

    /** Verification options */
    @NoAutoDetect
    class Options
    @JsonCreator
    private constructor(
        @JsonProperty("template_id") private val templateId: String?,
        @JsonProperty("locale") private val locale: String?,
        @JsonProperty("sender_id") private val senderId: String?,
        @JsonProperty("app_realm") private val appRealm: String?,
        @JsonProperty("custom_code") private val customCode: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The identifier of a verification settings template. It is used to be able to switch
         * behavior for specific use cases. Contact us if you need to use this functionality.
         */
        @JsonProperty("template_id")
        fun templateId(): Optional<String> = Optional.ofNullable(templateId)

        /**
         * A BCP-47 formatted locale string with the language the text message will be sent to. If
         * there's no locale set, the language will be determined by the country code of the phone
         * number. If the language specified doesn't exist, it defaults to US English.
         */
        @JsonProperty("locale") fun locale(): Optional<String> = Optional.ofNullable(locale)

        /** The Sender ID to use for this message. The Sender ID needs to be enabled by Prelude. */
        @JsonProperty("sender_id") fun senderId(): Optional<String> = Optional.ofNullable(senderId)

        /**
         * The Android SMS Retriever API hash code that identifies your app. This allows you to
         * automatically retrieve and fill the OTP code on Android devices.
         */
        @JsonProperty("app_realm") fun appRealm(): Optional<String> = Optional.ofNullable(appRealm)

        /**
         * The custom code to use for OTP verification. This feature is only available for
         * compatibility purposes and subject to Prelude’s approval. Contact us to discuss your use
         * case.
         */
        @JsonProperty("custom_code")
        fun customCode(): Optional<String> = Optional.ofNullable(customCode)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var templateId: String? = null
            private var locale: String? = null
            private var senderId: String? = null
            private var appRealm: String? = null
            private var customCode: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(options: Options) = apply {
                templateId = options.templateId
                locale = options.locale
                senderId = options.senderId
                appRealm = options.appRealm
                customCode = options.customCode
                additionalProperties = options.additionalProperties.toMutableMap()
            }

            /**
             * The identifier of a verification settings template. It is used to be able to switch
             * behavior for specific use cases. Contact us if you need to use this functionality.
             */
            fun templateId(templateId: String) = apply { this.templateId = templateId }

            /**
             * A BCP-47 formatted locale string with the language the text message will be sent to.
             * If there's no locale set, the language will be determined by the country code of the
             * phone number. If the language specified doesn't exist, it defaults to US English.
             */
            fun locale(locale: String) = apply { this.locale = locale }

            /**
             * The Sender ID to use for this message. The Sender ID needs to be enabled by Prelude.
             */
            fun senderId(senderId: String) = apply { this.senderId = senderId }

            /**
             * The Android SMS Retriever API hash code that identifies your app. This allows you to
             * automatically retrieve and fill the OTP code on Android devices.
             */
            fun appRealm(appRealm: String) = apply { this.appRealm = appRealm }

            /**
             * The custom code to use for OTP verification. This feature is only available for
             * compatibility purposes and subject to Prelude’s approval. Contact us to discuss your
             * use case.
             */
            fun customCode(customCode: String) = apply { this.customCode = customCode }

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

            fun build(): Options =
                Options(
                    templateId,
                    locale,
                    senderId,
                    appRealm,
                    customCode,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Options && templateId == other.templateId && locale == other.locale && senderId == other.senderId && appRealm == other.appRealm && customCode == other.customCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(templateId, locale, senderId, appRealm, customCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Options{templateId=$templateId, locale=$locale, senderId=$senderId, appRealm=$appRealm, customCode=$customCode, additionalProperties=$additionalProperties}"
    }

    /** The signals used for anti-fraud. */
    @NoAutoDetect
    class Signals
    @JsonCreator
    private constructor(
        @JsonProperty("ip") private val ip: String?,
        @JsonProperty("device_id") private val deviceId: String?,
        @JsonProperty("device_platform") private val devicePlatform: DevicePlatform?,
        @JsonProperty("device_model") private val deviceModel: String?,
        @JsonProperty("os_version") private val osVersion: String?,
        @JsonProperty("app_version") private val appVersion: String?,
        @JsonProperty("is_trusted_user") private val isTrustedUser: Boolean?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The IP address of the user's device. */
        @JsonProperty("ip") fun ip(): Optional<String> = Optional.ofNullable(ip)

        /**
         * The unique identifier for the user's device. For Android, this corresponds to the
         * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
         */
        @JsonProperty("device_id") fun deviceId(): Optional<String> = Optional.ofNullable(deviceId)

        /** The type of the user's device. */
        @JsonProperty("device_platform")
        fun devicePlatform(): Optional<DevicePlatform> = Optional.ofNullable(devicePlatform)

        /** The model of the user's device. */
        @JsonProperty("device_model")
        fun deviceModel(): Optional<String> = Optional.ofNullable(deviceModel)

        /** The version of the user's device operating system. */
        @JsonProperty("os_version")
        fun osVersion(): Optional<String> = Optional.ofNullable(osVersion)

        /** The version of your application. */
        @JsonProperty("app_version")
        fun appVersion(): Optional<String> = Optional.ofNullable(appVersion)

        /**
         * This signal should provide a higher level of trust, indicating that the user is genuine.
         * For more details, refer to [Signals](/guides/prevent-fraud#signals).
         */
        @JsonProperty("is_trusted_user")
        fun isTrustedUser(): Optional<Boolean> = Optional.ofNullable(isTrustedUser)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var ip: String? = null
            private var deviceId: String? = null
            private var devicePlatform: DevicePlatform? = null
            private var deviceModel: String? = null
            private var osVersion: String? = null
            private var appVersion: String? = null
            private var isTrustedUser: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(signals: Signals) = apply {
                ip = signals.ip
                deviceId = signals.deviceId
                devicePlatform = signals.devicePlatform
                deviceModel = signals.deviceModel
                osVersion = signals.osVersion
                appVersion = signals.appVersion
                isTrustedUser = signals.isTrustedUser
                additionalProperties = signals.additionalProperties.toMutableMap()
            }

            /** The IP address of the user's device. */
            fun ip(ip: String) = apply { this.ip = ip }

            /**
             * The unique identifier for the user's device. For Android, this corresponds to the
             * `ANDROID_ID` and for iOS, this corresponds to the `identifierForVendor`.
             */
            fun deviceId(deviceId: String) = apply { this.deviceId = deviceId }

            /** The type of the user's device. */
            fun devicePlatform(devicePlatform: DevicePlatform) = apply {
                this.devicePlatform = devicePlatform
            }

            /** The model of the user's device. */
            fun deviceModel(deviceModel: String) = apply { this.deviceModel = deviceModel }

            /** The version of the user's device operating system. */
            fun osVersion(osVersion: String) = apply { this.osVersion = osVersion }

            /** The version of your application. */
            fun appVersion(appVersion: String) = apply { this.appVersion = appVersion }

            /**
             * This signal should provide a higher level of trust, indicating that the user is
             * genuine. For more details, refer to [Signals](/guides/prevent-fraud#signals).
             */
            fun isTrustedUser(isTrustedUser: Boolean) = apply { this.isTrustedUser = isTrustedUser }

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

            fun build(): Signals =
                Signals(
                    ip,
                    deviceId,
                    devicePlatform,
                    deviceModel,
                    osVersion,
                    appVersion,
                    isTrustedUser,
                    additionalProperties.toImmutable(),
                )
        }

        class DevicePlatform
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ANDROID = of("android")

                @JvmField val IOS = of("ios")

                @JvmField val IPADOS = of("ipados")

                @JvmField val TVOS = of("tvos")

                @JvmField val WEB = of("web")

                @JvmStatic fun of(value: String) = DevicePlatform(JsonField.of(value))
            }

            enum class Known {
                ANDROID,
                IOS,
                IPADOS,
                TVOS,
                WEB,
            }

            enum class Value {
                ANDROID,
                IOS,
                IPADOS,
                TVOS,
                WEB,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ANDROID -> Value.ANDROID
                    IOS -> Value.IOS
                    IPADOS -> Value.IPADOS
                    TVOS -> Value.TVOS
                    WEB -> Value.WEB
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ANDROID -> Known.ANDROID
                    IOS -> Known.IOS
                    IPADOS -> Known.IPADOS
                    TVOS -> Known.TVOS
                    WEB -> Known.WEB
                    else -> throw PreludeInvalidDataException("Unknown DevicePlatform: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DevicePlatform && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Signals && ip == other.ip && deviceId == other.deviceId && devicePlatform == other.devicePlatform && deviceModel == other.deviceModel && osVersion == other.osVersion && appVersion == other.appVersion && isTrustedUser == other.isTrustedUser && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(ip, deviceId, devicePlatform, deviceModel, osVersion, appVersion, isTrustedUser, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Signals{ip=$ip, deviceId=$deviceId, devicePlatform=$devicePlatform, deviceModel=$deviceModel, osVersion=$osVersion, appVersion=$appVersion, isTrustedUser=$isTrustedUser, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VerificationCreateParams && target == other.target && metadata == other.metadata && options == other.options && signals == other.signals && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(target, metadata, options, signals, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "VerificationCreateParams{target=$target, metadata=$metadata, options=$options, signals=$signals, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}

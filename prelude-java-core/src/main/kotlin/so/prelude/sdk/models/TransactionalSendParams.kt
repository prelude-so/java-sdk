// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.QueryParams
import so.prelude.sdk.core.immutableEmptyMap
import so.prelude.sdk.core.toImmutable

/** Send a transactional message to your user. */
class TransactionalSendParams
constructor(
    private val body: TransactionalSendBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /** The template identifier. */
    fun templateId(): String = body.templateId()

    /** The recipient's phone number. */
    fun to(): String = body.to()

    /** The callback URL. */
    fun callbackUrl(): Optional<String> = body.callbackUrl()

    /** A unique, user-defined identifier that will be included in webhook events. */
    fun correlationId(): Optional<String> = body.correlationId()

    /** The message expiration date. */
    fun expiresAt(): Optional<String> = body.expiresAt()

    /** The Sender ID. */
    fun from(): Optional<String> = body.from()

    /** The variables to be replaced in the template. */
    fun variables(): Optional<Variables> = body.variables()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): TransactionalSendBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class TransactionalSendBody
    @JsonCreator
    internal constructor(
        @JsonProperty("template_id") private val templateId: String,
        @JsonProperty("to") private val to: String,
        @JsonProperty("callback_url") private val callbackUrl: String?,
        @JsonProperty("correlation_id") private val correlationId: String?,
        @JsonProperty("expires_at") private val expiresAt: String?,
        @JsonProperty("from") private val from: String?,
        @JsonProperty("variables") private val variables: Variables?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The template identifier. */
        @JsonProperty("template_id") fun templateId(): String = templateId

        /** The recipient's phone number. */
        @JsonProperty("to") fun to(): String = to

        /** The callback URL. */
        @JsonProperty("callback_url")
        fun callbackUrl(): Optional<String> = Optional.ofNullable(callbackUrl)

        /** A unique, user-defined identifier that will be included in webhook events. */
        @JsonProperty("correlation_id")
        fun correlationId(): Optional<String> = Optional.ofNullable(correlationId)

        /** The message expiration date. */
        @JsonProperty("expires_at")
        fun expiresAt(): Optional<String> = Optional.ofNullable(expiresAt)

        /** The Sender ID. */
        @JsonProperty("from") fun from(): Optional<String> = Optional.ofNullable(from)

        /** The variables to be replaced in the template. */
        @JsonProperty("variables")
        fun variables(): Optional<Variables> = Optional.ofNullable(variables)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var templateId: String? = null
            private var to: String? = null
            private var callbackUrl: String? = null
            private var correlationId: String? = null
            private var expiresAt: String? = null
            private var from: String? = null
            private var variables: Variables? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionalSendBody: TransactionalSendBody) = apply {
                templateId = transactionalSendBody.templateId
                to = transactionalSendBody.to
                callbackUrl = transactionalSendBody.callbackUrl
                correlationId = transactionalSendBody.correlationId
                expiresAt = transactionalSendBody.expiresAt
                from = transactionalSendBody.from
                variables = transactionalSendBody.variables
                additionalProperties = transactionalSendBody.additionalProperties.toMutableMap()
            }

            /** The template identifier. */
            fun templateId(templateId: String) = apply { this.templateId = templateId }

            /** The recipient's phone number. */
            fun to(to: String) = apply { this.to = to }

            /** The callback URL. */
            fun callbackUrl(callbackUrl: String?) = apply { this.callbackUrl = callbackUrl }

            /** The callback URL. */
            fun callbackUrl(callbackUrl: Optional<String>) = callbackUrl(callbackUrl.orElse(null))

            /** A unique, user-defined identifier that will be included in webhook events. */
            fun correlationId(correlationId: String?) = apply { this.correlationId = correlationId }

            /** A unique, user-defined identifier that will be included in webhook events. */
            fun correlationId(correlationId: Optional<String>) =
                correlationId(correlationId.orElse(null))

            /** The message expiration date. */
            fun expiresAt(expiresAt: String?) = apply { this.expiresAt = expiresAt }

            /** The message expiration date. */
            fun expiresAt(expiresAt: Optional<String>) = expiresAt(expiresAt.orElse(null))

            /** The Sender ID. */
            fun from(from: String?) = apply { this.from = from }

            /** The Sender ID. */
            fun from(from: Optional<String>) = from(from.orElse(null))

            /** The variables to be replaced in the template. */
            fun variables(variables: Variables?) = apply { this.variables = variables }

            /** The variables to be replaced in the template. */
            fun variables(variables: Optional<Variables>) = variables(variables.orElse(null))

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

            fun build(): TransactionalSendBody =
                TransactionalSendBody(
                    checkNotNull(templateId) { "`templateId` is required but was not set" },
                    checkNotNull(to) { "`to` is required but was not set" },
                    callbackUrl,
                    correlationId,
                    expiresAt,
                    from,
                    variables,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionalSendBody && templateId == other.templateId && to == other.to && callbackUrl == other.callbackUrl && correlationId == other.correlationId && expiresAt == other.expiresAt && from == other.from && variables == other.variables && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(templateId, to, callbackUrl, correlationId, expiresAt, from, variables, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionalSendBody{templateId=$templateId, to=$to, callbackUrl=$callbackUrl, correlationId=$correlationId, expiresAt=$expiresAt, from=$from, variables=$variables, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: TransactionalSendBody.Builder = TransactionalSendBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(transactionalSendParams: TransactionalSendParams) = apply {
            body = transactionalSendParams.body.toBuilder()
            additionalHeaders = transactionalSendParams.additionalHeaders.toBuilder()
            additionalQueryParams = transactionalSendParams.additionalQueryParams.toBuilder()
        }

        /** The template identifier. */
        fun templateId(templateId: String) = apply { body.templateId(templateId) }

        /** The recipient's phone number. */
        fun to(to: String) = apply { body.to(to) }

        /** The callback URL. */
        fun callbackUrl(callbackUrl: String?) = apply { body.callbackUrl(callbackUrl) }

        /** The callback URL. */
        fun callbackUrl(callbackUrl: Optional<String>) = callbackUrl(callbackUrl.orElse(null))

        /** A unique, user-defined identifier that will be included in webhook events. */
        fun correlationId(correlationId: String?) = apply { body.correlationId(correlationId) }

        /** A unique, user-defined identifier that will be included in webhook events. */
        fun correlationId(correlationId: Optional<String>) =
            correlationId(correlationId.orElse(null))

        /** The message expiration date. */
        fun expiresAt(expiresAt: String?) = apply { body.expiresAt(expiresAt) }

        /** The message expiration date. */
        fun expiresAt(expiresAt: Optional<String>) = expiresAt(expiresAt.orElse(null))

        /** The Sender ID. */
        fun from(from: String?) = apply { body.from(from) }

        /** The Sender ID. */
        fun from(from: Optional<String>) = from(from.orElse(null))

        /** The variables to be replaced in the template. */
        fun variables(variables: Variables?) = apply { body.variables(variables) }

        /** The variables to be replaced in the template. */
        fun variables(variables: Optional<Variables>) = variables(variables.orElse(null))

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

        fun build(): TransactionalSendParams =
            TransactionalSendParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /** The variables to be replaced in the template. */
    @NoAutoDetect
    class Variables
    @JsonCreator
    private constructor(
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(variables: Variables) = apply {
                additionalProperties = variables.additionalProperties.toMutableMap()
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

            fun build(): Variables = Variables(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Variables && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() = "Variables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionalSendParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TransactionalSendParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

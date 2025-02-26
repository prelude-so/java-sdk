// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.util.Objects
import java.util.Optional
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.Params
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.QueryParams
import so.prelude.sdk.core.immutableEmptyMap
import so.prelude.sdk.core.toImmutable

/** Send a transactional message to your user. */
class TransactionalSendParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    /** The template identifier. */
    fun _templateId(): JsonField<String> = body._templateId()

    /** The recipient's phone number. */
    fun _to(): JsonField<String> = body._to()

    /** The callback URL. */
    fun _callbackUrl(): JsonField<String> = body._callbackUrl()

    /** A unique, user-defined identifier that will be included in webhook events. */
    fun _correlationId(): JsonField<String> = body._correlationId()

    /** The message expiration date. */
    fun _expiresAt(): JsonField<String> = body._expiresAt()

    /** The Sender ID. */
    fun _from(): JsonField<String> = body._from()

    /** The variables to be replaced in the template. */
    fun _variables(): JsonField<Variables> = body._variables()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("template_id")
        @ExcludeMissing
        private val templateId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("to") @ExcludeMissing private val to: JsonField<String> = JsonMissing.of(),
        @JsonProperty("callback_url")
        @ExcludeMissing
        private val callbackUrl: JsonField<String> = JsonMissing.of(),
        @JsonProperty("correlation_id")
        @ExcludeMissing
        private val correlationId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("expires_at")
        @ExcludeMissing
        private val expiresAt: JsonField<String> = JsonMissing.of(),
        @JsonProperty("from")
        @ExcludeMissing
        private val from: JsonField<String> = JsonMissing.of(),
        @JsonProperty("variables")
        @ExcludeMissing
        private val variables: JsonField<Variables> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The template identifier. */
        fun templateId(): String = templateId.getRequired("template_id")

        /** The recipient's phone number. */
        fun to(): String = to.getRequired("to")

        /** The callback URL. */
        fun callbackUrl(): Optional<String> =
            Optional.ofNullable(callbackUrl.getNullable("callback_url"))

        /** A unique, user-defined identifier that will be included in webhook events. */
        fun correlationId(): Optional<String> =
            Optional.ofNullable(correlationId.getNullable("correlation_id"))

        /** The message expiration date. */
        fun expiresAt(): Optional<String> = Optional.ofNullable(expiresAt.getNullable("expires_at"))

        /** The Sender ID. */
        fun from(): Optional<String> = Optional.ofNullable(from.getNullable("from"))

        /** The variables to be replaced in the template. */
        fun variables(): Optional<Variables> =
            Optional.ofNullable(variables.getNullable("variables"))

        /** The template identifier. */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun _templateId(): JsonField<String> = templateId

        /** The recipient's phone number. */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /** The callback URL. */
        @JsonProperty("callback_url")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

        /** A unique, user-defined identifier that will be included in webhook events. */
        @JsonProperty("correlation_id")
        @ExcludeMissing
        fun _correlationId(): JsonField<String> = correlationId

        /** The message expiration date. */
        @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<String> = expiresAt

        /** The Sender ID. */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /** The variables to be replaced in the template. */
        @JsonProperty("variables")
        @ExcludeMissing
        fun _variables(): JsonField<Variables> = variables

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            templateId()
            to()
            callbackUrl()
            correlationId()
            expiresAt()
            from()
            variables().ifPresent { it.validate() }
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var templateId: JsonField<String>? = null
            private var to: JsonField<String>? = null
            private var callbackUrl: JsonField<String> = JsonMissing.of()
            private var correlationId: JsonField<String> = JsonMissing.of()
            private var expiresAt: JsonField<String> = JsonMissing.of()
            private var from: JsonField<String> = JsonMissing.of()
            private var variables: JsonField<Variables> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                templateId = body.templateId
                to = body.to
                callbackUrl = body.callbackUrl
                correlationId = body.correlationId
                expiresAt = body.expiresAt
                from = body.from
                variables = body.variables
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The template identifier. */
            fun templateId(templateId: String) = templateId(JsonField.of(templateId))

            /** The template identifier. */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

            /** The recipient's phone number. */
            fun to(to: String) = to(JsonField.of(to))

            /** The recipient's phone number. */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /** The callback URL. */
            fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

            /** The callback URL. */
            fun callbackUrl(callbackUrl: JsonField<String>) = apply {
                this.callbackUrl = callbackUrl
            }

            /** A unique, user-defined identifier that will be included in webhook events. */
            fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

            /** A unique, user-defined identifier that will be included in webhook events. */
            fun correlationId(correlationId: JsonField<String>) = apply {
                this.correlationId = correlationId
            }

            /** The message expiration date. */
            fun expiresAt(expiresAt: String) = expiresAt(JsonField.of(expiresAt))

            /** The message expiration date. */
            fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

            /** The Sender ID. */
            fun from(from: String) = from(JsonField.of(from))

            /** The Sender ID. */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /** The variables to be replaced in the template. */
            fun variables(variables: Variables) = variables(JsonField.of(variables))

            /** The variables to be replaced in the template. */
            fun variables(variables: JsonField<Variables>) = apply { this.variables = variables }

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

            fun build(): Body =
                Body(
                    checkRequired("templateId", templateId),
                    checkRequired("to", to),
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

            return /* spotless:off */ other is Body && templateId == other.templateId && to == other.to && callbackUrl == other.callbackUrl && correlationId == other.correlationId && expiresAt == other.expiresAt && from == other.from && variables == other.variables && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(templateId, to, callbackUrl, correlationId, expiresAt, from, variables, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{templateId=$templateId, to=$to, callbackUrl=$callbackUrl, correlationId=$correlationId, expiresAt=$expiresAt, from=$from, variables=$variables, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionalSendParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
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

        /** The template identifier. */
        fun templateId(templateId: JsonField<String>) = apply { body.templateId(templateId) }

        /** The recipient's phone number. */
        fun to(to: String) = apply { body.to(to) }

        /** The recipient's phone number. */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        /** The callback URL. */
        fun callbackUrl(callbackUrl: String) = apply { body.callbackUrl(callbackUrl) }

        /** The callback URL. */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { body.callbackUrl(callbackUrl) }

        /** A unique, user-defined identifier that will be included in webhook events. */
        fun correlationId(correlationId: String) = apply { body.correlationId(correlationId) }

        /** A unique, user-defined identifier that will be included in webhook events. */
        fun correlationId(correlationId: JsonField<String>) = apply {
            body.correlationId(correlationId)
        }

        /** The message expiration date. */
        fun expiresAt(expiresAt: String) = apply { body.expiresAt(expiresAt) }

        /** The message expiration date. */
        fun expiresAt(expiresAt: JsonField<String>) = apply { body.expiresAt(expiresAt) }

        /** The Sender ID. */
        fun from(from: String) = apply { body.from(from) }

        /** The Sender ID. */
        fun from(from: JsonField<String>) = apply { body.from(from) }

        /** The variables to be replaced in the template. */
        fun variables(variables: Variables) = apply { body.variables(variables) }

        /** The variables to be replaced in the template. */
        fun variables(variables: JsonField<Variables>) = apply { body.variables(variables) }

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
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap()
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Variables = apply {
            if (validated) {
                return@apply
            }

            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Variables]. */
        class Builder internal constructor() {

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

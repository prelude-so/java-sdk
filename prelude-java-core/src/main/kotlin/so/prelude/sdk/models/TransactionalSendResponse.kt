// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.immutableEmptyMap
import so.prelude.sdk.core.toImmutable

@NoAutoDetect
class TransactionalSendResponse
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("template_id")
    @ExcludeMissing
    private val templateId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("to") @ExcludeMissing private val to: JsonField<String> = JsonMissing.of(),
    @JsonProperty("variables")
    @ExcludeMissing
    private val variables: JsonField<Variables> = JsonMissing.of(),
    @JsonProperty("callback_url")
    @ExcludeMissing
    private val callbackUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("correlation_id")
    @ExcludeMissing
    private val correlationId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("from") @ExcludeMissing private val from: JsonField<String> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The message identifier. */
    fun id(): String = id.getRequired("id")

    /** The message creation date. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The message expiration date. */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /** The template identifier. */
    fun templateId(): String = templateId.getRequired("template_id")

    /** The recipient's phone number. */
    fun to(): String = to.getRequired("to")

    /** The variables to be replaced in the template. */
    fun variables(): Variables = variables.getRequired("variables")

    /** The callback URL. */
    fun callbackUrl(): Optional<String> =
        Optional.ofNullable(callbackUrl.getNullable("callback_url"))

    /** A unique, user-defined identifier that will be included in webhook events. */
    fun correlationId(): Optional<String> =
        Optional.ofNullable(correlationId.getNullable("correlation_id"))

    /** The Sender ID. */
    fun from(): Optional<String> = Optional.ofNullable(from.getNullable("from"))

    /** The message identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The message creation date. */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** The message expiration date. */
    @JsonProperty("expires_at")
    @ExcludeMissing
    fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

    /** The template identifier. */
    @JsonProperty("template_id") @ExcludeMissing fun _templateId(): JsonField<String> = templateId

    /** The recipient's phone number. */
    @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

    /** The variables to be replaced in the template. */
    @JsonProperty("variables") @ExcludeMissing fun _variables(): JsonField<Variables> = variables

    /** The callback URL. */
    @JsonProperty("callback_url")
    @ExcludeMissing
    fun _callbackUrl(): JsonField<String> = callbackUrl

    /** A unique, user-defined identifier that will be included in webhook events. */
    @JsonProperty("correlation_id")
    @ExcludeMissing
    fun _correlationId(): JsonField<String> = correlationId

    /** The Sender ID. */
    @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TransactionalSendResponse = apply {
        if (!validated) {
            id()
            createdAt()
            expiresAt()
            templateId()
            to()
            variables().validate()
            callbackUrl()
            correlationId()
            from()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var expiresAt: JsonField<OffsetDateTime>? = null
        private var templateId: JsonField<String>? = null
        private var to: JsonField<String>? = null
        private var variables: JsonField<Variables>? = null
        private var callbackUrl: JsonField<String> = JsonMissing.of()
        private var correlationId: JsonField<String> = JsonMissing.of()
        private var from: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionalSendResponse: TransactionalSendResponse) = apply {
            id = transactionalSendResponse.id
            createdAt = transactionalSendResponse.createdAt
            expiresAt = transactionalSendResponse.expiresAt
            templateId = transactionalSendResponse.templateId
            to = transactionalSendResponse.to
            variables = transactionalSendResponse.variables
            callbackUrl = transactionalSendResponse.callbackUrl
            correlationId = transactionalSendResponse.correlationId
            from = transactionalSendResponse.from
            additionalProperties = transactionalSendResponse.additionalProperties.toMutableMap()
        }

        /** The message identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The message identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The message creation date. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The message creation date. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The message expiration date. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /** The message expiration date. */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** The template identifier. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /** The template identifier. */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /** The recipient's phone number. */
        fun to(to: String) = to(JsonField.of(to))

        /** The recipient's phone number. */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** The variables to be replaced in the template. */
        fun variables(variables: Variables) = variables(JsonField.of(variables))

        /** The variables to be replaced in the template. */
        fun variables(variables: JsonField<Variables>) = apply { this.variables = variables }

        /** The callback URL. */
        fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

        /** The callback URL. */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { this.callbackUrl = callbackUrl }

        /** A unique, user-defined identifier that will be included in webhook events. */
        fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

        /** A unique, user-defined identifier that will be included in webhook events. */
        fun correlationId(correlationId: JsonField<String>) = apply {
            this.correlationId = correlationId
        }

        /** The Sender ID. */
        fun from(from: String) = from(JsonField.of(from))

        /** The Sender ID. */
        fun from(from: JsonField<String>) = apply { this.from = from }

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

        fun build(): TransactionalSendResponse =
            TransactionalSendResponse(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(expiresAt) { "`expiresAt` is required but was not set" },
                checkNotNull(templateId) { "`templateId` is required but was not set" },
                checkNotNull(to) { "`to` is required but was not set" },
                checkNotNull(variables) { "`variables` is required but was not set" },
                callbackUrl,
                correlationId,
                from,
                additionalProperties.toImmutable(),
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

        private var validated: Boolean = false

        fun validate(): Variables = apply {
            if (!validated) {
                validated = true
            }
        }

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

        return /* spotless:off */ other is TransactionalSendResponse && id == other.id && createdAt == other.createdAt && expiresAt == other.expiresAt && templateId == other.templateId && to == other.to && variables == other.variables && callbackUrl == other.callbackUrl && correlationId == other.correlationId && from == other.from && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, createdAt, expiresAt, templateId, to, variables, callbackUrl, correlationId, from, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionalSendResponse{id=$id, createdAt=$createdAt, expiresAt=$expiresAt, templateId=$templateId, to=$to, variables=$variables, callbackUrl=$callbackUrl, correlationId=$correlationId, from=$from, additionalProperties=$additionalProperties}"
}

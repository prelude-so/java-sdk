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
    @JsonProperty("from") @ExcludeMissing private val from: JsonField<String> = JsonMissing.of(),
    @JsonProperty("to") @ExcludeMissing private val to: JsonField<String> = JsonMissing.of(),
    @JsonProperty("template_id")
    @ExcludeMissing
    private val templateId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("variables")
    @ExcludeMissing
    private val variables: JsonField<Variables> = JsonMissing.of(),
    @JsonProperty("callback_url")
    @ExcludeMissing
    private val callbackUrl: JsonField<String> = JsonMissing.of(),
    @JsonProperty("correlation_id")
    @ExcludeMissing
    private val correlationId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("expires_at")
    @ExcludeMissing
    private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The message identifier. */
    fun id(): String = id.getRequired("id")

    /** The Sender ID. */
    fun from(): Optional<String> = Optional.ofNullable(from.getNullable("from"))

    /** The recipient's phone number. */
    fun to(): String = to.getRequired("to")

    /** The template identifier. */
    fun templateId(): String = templateId.getRequired("template_id")

    /** The variables to be replaced in the template. */
    fun variables(): Variables = variables.getRequired("variables")

    /** The callback URL. */
    fun callbackUrl(): Optional<String> =
        Optional.ofNullable(callbackUrl.getNullable("callback_url"))

    /** A unique, user-defined identifier that will be included in webhook events. */
    fun correlationId(): Optional<String> =
        Optional.ofNullable(correlationId.getNullable("correlation_id"))

    /** The message expiration date. */
    fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

    /** The message creation date. */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The message identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The Sender ID. */
    @JsonProperty("from") @ExcludeMissing fun _from() = from

    /** The recipient's phone number. */
    @JsonProperty("to") @ExcludeMissing fun _to() = to

    /** The template identifier. */
    @JsonProperty("template_id") @ExcludeMissing fun _templateId() = templateId

    /** The variables to be replaced in the template. */
    @JsonProperty("variables") @ExcludeMissing fun _variables() = variables

    /** The callback URL. */
    @JsonProperty("callback_url") @ExcludeMissing fun _callbackUrl() = callbackUrl

    /** A unique, user-defined identifier that will be included in webhook events. */
    @JsonProperty("correlation_id") @ExcludeMissing fun _correlationId() = correlationId

    /** The message expiration date. */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

    /** The message creation date. */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): TransactionalSendResponse = apply {
        if (!validated) {
            id()
            from()
            to()
            templateId()
            variables().validate()
            callbackUrl()
            correlationId()
            expiresAt()
            createdAt()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var from: JsonField<String> = JsonMissing.of()
        private var to: JsonField<String> = JsonMissing.of()
        private var templateId: JsonField<String> = JsonMissing.of()
        private var variables: JsonField<Variables> = JsonMissing.of()
        private var callbackUrl: JsonField<String> = JsonMissing.of()
        private var correlationId: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transactionalSendResponse: TransactionalSendResponse) = apply {
            id = transactionalSendResponse.id
            from = transactionalSendResponse.from
            to = transactionalSendResponse.to
            templateId = transactionalSendResponse.templateId
            variables = transactionalSendResponse.variables
            callbackUrl = transactionalSendResponse.callbackUrl
            correlationId = transactionalSendResponse.correlationId
            expiresAt = transactionalSendResponse.expiresAt
            createdAt = transactionalSendResponse.createdAt
            additionalProperties = transactionalSendResponse.additionalProperties.toMutableMap()
        }

        /** The message identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The message identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Sender ID. */
        fun from(from: String) = from(JsonField.of(from))

        /** The Sender ID. */
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** The recipient's phone number. */
        fun to(to: String) = to(JsonField.of(to))

        /** The recipient's phone number. */
        fun to(to: JsonField<String>) = apply { this.to = to }

        /** The template identifier. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /** The template identifier. */
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

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

        /** The message expiration date. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /** The message expiration date. */
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** The message creation date. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The message creation date. */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

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
                id,
                from,
                to,
                templateId,
                variables,
                callbackUrl,
                correlationId,
                expiresAt,
                createdAt,
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

        return /* spotless:off */ other is TransactionalSendResponse && id == other.id && from == other.from && to == other.to && templateId == other.templateId && variables == other.variables && callbackUrl == other.callbackUrl && correlationId == other.correlationId && expiresAt == other.expiresAt && createdAt == other.createdAt && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, from, to, templateId, variables, callbackUrl, correlationId, expiresAt, createdAt, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TransactionalSendResponse{id=$id, from=$from, to=$to, templateId=$templateId, variables=$variables, callbackUrl=$callbackUrl, correlationId=$correlationId, expiresAt=$expiresAt, createdAt=$createdAt, additionalProperties=$additionalProperties}"
}

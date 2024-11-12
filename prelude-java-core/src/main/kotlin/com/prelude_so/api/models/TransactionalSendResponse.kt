// File generated from our OpenAPI spec by Stainless.

package com.prelude_so.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.prelude_so.api.core.ExcludeMissing
import com.prelude_so.api.core.JsonField
import com.prelude_so.api.core.JsonMissing
import com.prelude_so.api.core.JsonValue
import com.prelude_so.api.core.NoAutoDetect
import com.prelude_so.api.core.toImmutable
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = TransactionalSendResponse.Builder::class)
@NoAutoDetect
class TransactionalSendResponse
private constructor(
    private val id: JsonField<String>,
    private val from: JsonField<String>,
    private val to: JsonField<String>,
    private val templateId: JsonField<String>,
    private val variables: JsonField<Variables>,
    private val callbackUrl: JsonField<String>,
    private val correlationId: JsonField<String>,
    private val expiresAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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
            this.id = transactionalSendResponse.id
            this.from = transactionalSendResponse.from
            this.to = transactionalSendResponse.to
            this.templateId = transactionalSendResponse.templateId
            this.variables = transactionalSendResponse.variables
            this.callbackUrl = transactionalSendResponse.callbackUrl
            this.correlationId = transactionalSendResponse.correlationId
            this.expiresAt = transactionalSendResponse.expiresAt
            this.createdAt = transactionalSendResponse.createdAt
            additionalProperties(transactionalSendResponse.additionalProperties)
        }

        /** The message identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The message identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Sender ID. */
        fun from(from: String) = from(JsonField.of(from))

        /** The Sender ID. */
        @JsonProperty("from")
        @ExcludeMissing
        fun from(from: JsonField<String>) = apply { this.from = from }

        /** The recipient's phone number. */
        fun to(to: String) = to(JsonField.of(to))

        /** The recipient's phone number. */
        @JsonProperty("to") @ExcludeMissing fun to(to: JsonField<String>) = apply { this.to = to }

        /** The template identifier. */
        fun templateId(templateId: String) = templateId(JsonField.of(templateId))

        /** The template identifier. */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

        /** The variables to be replaced in the template. */
        fun variables(variables: Variables) = variables(JsonField.of(variables))

        /** The variables to be replaced in the template. */
        @JsonProperty("variables")
        @ExcludeMissing
        fun variables(variables: JsonField<Variables>) = apply { this.variables = variables }

        /** The callback URL. */
        fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

        /** The callback URL. */
        @JsonProperty("callback_url")
        @ExcludeMissing
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { this.callbackUrl = callbackUrl }

        /** A unique, user-defined identifier that will be included in webhook events. */
        fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

        /** A unique, user-defined identifier that will be included in webhook events. */
        @JsonProperty("correlation_id")
        @ExcludeMissing
        fun correlationId(correlationId: JsonField<String>) = apply {
            this.correlationId = correlationId
        }

        /** The message expiration date. */
        fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

        /** The message expiration date. */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply { this.expiresAt = expiresAt }

        /** The message creation date. */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /** The message creation date. */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
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
    @JsonDeserialize(builder = Variables.Builder::class)
    @NoAutoDetect
    class Variables
    private constructor(
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                additionalProperties(variables.additionalProperties)
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Variables = Variables(additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Variables && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() = "Variables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionalSendResponse && this.id == other.id && this.from == other.from && this.to == other.to && this.templateId == other.templateId && this.variables == other.variables && this.callbackUrl == other.callbackUrl && this.correlationId == other.correlationId && this.expiresAt == other.expiresAt && this.createdAt == other.createdAt && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(id, from, to, templateId, variables, callbackUrl, correlationId, expiresAt, createdAt, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "TransactionalSendResponse{id=$id, from=$from, to=$to, templateId=$templateId, variables=$variables, callbackUrl=$callbackUrl, correlationId=$correlationId, expiresAt=$expiresAt, createdAt=$createdAt, additionalProperties=$additionalProperties}"
}

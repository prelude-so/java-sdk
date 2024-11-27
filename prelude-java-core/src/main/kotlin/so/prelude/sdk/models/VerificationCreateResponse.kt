// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import java.util.Objects
import java.util.Optional
import so.prelude.sdk.core.Enum
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.NoAutoDetect
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

@JsonDeserialize(builder = VerificationCreateResponse.Builder::class)
@NoAutoDetect
class VerificationCreateResponse
private constructor(
    private val id: JsonField<String>,
    private val status: JsonField<Status>,
    private val method: JsonField<Method>,
    private val metadata: JsonField<Metadata>,
    private val requestId: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The verification identifier. */
    fun id(): String = id.getRequired("id")

    /** The status of the verification. */
    fun status(): Status = status.getRequired("status")

    /** The method used for verifying this phone number. */
    fun method(): Method = method.getRequired("method")

    /** The metadata for this verification. */
    fun metadata(): Optional<Metadata> = Optional.ofNullable(metadata.getNullable("metadata"))

    fun requestId(): Optional<String> = Optional.ofNullable(requestId.getNullable("request_id"))

    /** The verification identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The status of the verification. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The method used for verifying this phone number. */
    @JsonProperty("method") @ExcludeMissing fun _method() = method

    /** The metadata for this verification. */
    @JsonProperty("metadata") @ExcludeMissing fun _metadata() = metadata

    @JsonProperty("request_id") @ExcludeMissing fun _requestId() = requestId

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): VerificationCreateResponse = apply {
        if (!validated) {
            id()
            status()
            method()
            metadata().map { it.validate() }
            requestId()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var method: JsonField<Method> = JsonMissing.of()
        private var metadata: JsonField<Metadata> = JsonMissing.of()
        private var requestId: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(verificationCreateResponse: VerificationCreateResponse) = apply {
            this.id = verificationCreateResponse.id
            this.status = verificationCreateResponse.status
            this.method = verificationCreateResponse.method
            this.metadata = verificationCreateResponse.metadata
            this.requestId = verificationCreateResponse.requestId
            additionalProperties(verificationCreateResponse.additionalProperties)
        }

        /** The verification identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The verification identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The status of the verification. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the verification. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The method used for verifying this phone number. */
        fun method(method: Method) = method(JsonField.of(method))

        /** The method used for verifying this phone number. */
        @JsonProperty("method")
        @ExcludeMissing
        fun method(method: JsonField<Method>) = apply { this.method = method }

        /** The metadata for this verification. */
        fun metadata(metadata: Metadata) = metadata(JsonField.of(metadata))

        /** The metadata for this verification. */
        @JsonProperty("metadata")
        @ExcludeMissing
        fun metadata(metadata: JsonField<Metadata>) = apply { this.metadata = metadata }

        fun requestId(requestId: String) = requestId(JsonField.of(requestId))

        @JsonProperty("request_id")
        @ExcludeMissing
        fun requestId(requestId: JsonField<String>) = apply { this.requestId = requestId }

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

        fun build(): VerificationCreateResponse =
            VerificationCreateResponse(
                id,
                status,
                method,
                metadata,
                requestId,
                additionalProperties.toImmutable(),
            )
    }

    class Method
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Method && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val MESSAGE = Method(JsonField.of("message"))

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        enum class Known {
            MESSAGE,
        }

        enum class Value {
            MESSAGE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MESSAGE -> Value.MESSAGE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MESSAGE -> Known.MESSAGE
                else -> throw PreludeInvalidDataException("Unknown Method: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SUCCESS = Status(JsonField.of("success"))

            @JvmField val RETRY = Status(JsonField.of("retry"))

            @JvmField val BLOCKED = Status(JsonField.of("blocked"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            SUCCESS,
            RETRY,
            BLOCKED,
        }

        enum class Value {
            SUCCESS,
            RETRY,
            BLOCKED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SUCCESS -> Value.SUCCESS
                RETRY -> Value.RETRY
                BLOCKED -> Value.BLOCKED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SUCCESS -> Known.SUCCESS
                RETRY -> Known.RETRY
                BLOCKED -> Known.BLOCKED
                else -> throw PreludeInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** The metadata for this verification. */
    @JsonDeserialize(builder = Metadata.Builder::class)
    @NoAutoDetect
    class Metadata
    private constructor(
        private val correlationId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun correlationId(): Optional<String> =
            Optional.ofNullable(correlationId.getNullable("correlation_id"))

        @JsonProperty("correlation_id") @ExcludeMissing fun _correlationId() = correlationId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Metadata = apply {
            if (!validated) {
                correlationId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var correlationId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(metadata: Metadata) = apply {
                this.correlationId = metadata.correlationId
                additionalProperties(metadata.additionalProperties)
            }

            fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

            @JsonProperty("correlation_id")
            @ExcludeMissing
            fun correlationId(correlationId: JsonField<String>) = apply {
                this.correlationId = correlationId
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is VerificationCreateResponse && id == other.id && status == other.status && method == other.method && metadata == other.metadata && requestId == other.requestId && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, status, method, metadata, requestId, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "VerificationCreateResponse{id=$id, status=$status, method=$method, metadata=$metadata, requestId=$requestId, additionalProperties=$additionalProperties}"
}

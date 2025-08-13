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
import so.prelude.sdk.core.ExcludeMissing
import so.prelude.sdk.core.JsonField
import so.prelude.sdk.core.JsonMissing
import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.Params
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.QueryParams
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

/** Send a transactional message to your user. */
class TransactionalSendParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The template identifier.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun templateId(): String = body.templateId()

    /**
     * The recipient's phone number.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun to(): String = body.to()

    /**
     * The callback URL.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun callbackUrl(): Optional<String> = body.callbackUrl()

    /**
     * A user-defined identifier to correlate this transactional message with. It is returned in the
     * response and any webhook events that refer to this transactionalmessage.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun correlationId(): Optional<String> = body.correlationId()

    /**
     * The message expiration date.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun expiresAt(): Optional<String> = body.expiresAt()

    /**
     * The Sender ID.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun from(): Optional<String> = body.from()

    /**
     * A BCP-47 formatted locale string with the language the text message will be sent to. If
     * there's no locale set, the language will be determined by the country code of the phone
     * number. If the language specified doesn't exist, the default set on the template will be
     * used.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun locale(): Optional<String> = body.locale()

    /**
     * The variables to be replaced in the template.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun variables(): Optional<Variables> = body.variables()

    /**
     * Returns the raw JSON value of [templateId].
     *
     * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _templateId(): JsonField<String> = body._templateId()

    /**
     * Returns the raw JSON value of [to].
     *
     * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _to(): JsonField<String> = body._to()

    /**
     * Returns the raw JSON value of [callbackUrl].
     *
     * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _callbackUrl(): JsonField<String> = body._callbackUrl()

    /**
     * Returns the raw JSON value of [correlationId].
     *
     * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _correlationId(): JsonField<String> = body._correlationId()

    /**
     * Returns the raw JSON value of [expiresAt].
     *
     * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _expiresAt(): JsonField<String> = body._expiresAt()

    /**
     * Returns the raw JSON value of [from].
     *
     * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _from(): JsonField<String> = body._from()

    /**
     * Returns the raw JSON value of [locale].
     *
     * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _locale(): JsonField<String> = body._locale()

    /**
     * Returns the raw JSON value of [variables].
     *
     * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _variables(): JsonField<Variables> = body._variables()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionalSendParams].
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * .to()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TransactionalSendParams]. */
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

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [templateId]
         * - [to]
         * - [callbackUrl]
         * - [correlationId]
         * - [expiresAt]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /** The template identifier. */
        fun templateId(templateId: String) = apply { body.templateId(templateId) }

        /**
         * Sets [Builder.templateId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.templateId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun templateId(templateId: JsonField<String>) = apply { body.templateId(templateId) }

        /** The recipient's phone number. */
        fun to(to: String) = apply { body.to(to) }

        /**
         * Sets [Builder.to] to an arbitrary JSON value.
         *
         * You should usually call [Builder.to] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun to(to: JsonField<String>) = apply { body.to(to) }

        /** The callback URL. */
        fun callbackUrl(callbackUrl: String) = apply { body.callbackUrl(callbackUrl) }

        /**
         * Sets [Builder.callbackUrl] to an arbitrary JSON value.
         *
         * You should usually call [Builder.callbackUrl] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun callbackUrl(callbackUrl: JsonField<String>) = apply { body.callbackUrl(callbackUrl) }

        /**
         * A user-defined identifier to correlate this transactional message with. It is returned in
         * the response and any webhook events that refer to this transactionalmessage.
         */
        fun correlationId(correlationId: String) = apply { body.correlationId(correlationId) }

        /**
         * Sets [Builder.correlationId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.correlationId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun correlationId(correlationId: JsonField<String>) = apply {
            body.correlationId(correlationId)
        }

        /** The message expiration date. */
        fun expiresAt(expiresAt: String) = apply { body.expiresAt(expiresAt) }

        /**
         * Sets [Builder.expiresAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.expiresAt] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun expiresAt(expiresAt: JsonField<String>) = apply { body.expiresAt(expiresAt) }

        /** The Sender ID. */
        fun from(from: String) = apply { body.from(from) }

        /**
         * Sets [Builder.from] to an arbitrary JSON value.
         *
         * You should usually call [Builder.from] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun from(from: JsonField<String>) = apply { body.from(from) }

        /**
         * A BCP-47 formatted locale string with the language the text message will be sent to. If
         * there's no locale set, the language will be determined by the country code of the phone
         * number. If the language specified doesn't exist, the default set on the template will be
         * used.
         */
        fun locale(locale: String) = apply { body.locale(locale) }

        /**
         * Sets [Builder.locale] to an arbitrary JSON value.
         *
         * You should usually call [Builder.locale] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun locale(locale: JsonField<String>) = apply { body.locale(locale) }

        /** The variables to be replaced in the template. */
        fun variables(variables: Variables) = apply { body.variables(variables) }

        /**
         * Sets [Builder.variables] to an arbitrary JSON value.
         *
         * You should usually call [Builder.variables] with a well-typed [Variables] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
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

        /**
         * Returns an immutable instance of [TransactionalSendParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .templateId()
         * .to()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TransactionalSendParams =
            TransactionalSendParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val templateId: JsonField<String>,
        private val to: JsonField<String>,
        private val callbackUrl: JsonField<String>,
        private val correlationId: JsonField<String>,
        private val expiresAt: JsonField<String>,
        private val from: JsonField<String>,
        private val locale: JsonField<String>,
        private val variables: JsonField<Variables>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("template_id")
            @ExcludeMissing
            templateId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("to") @ExcludeMissing to: JsonField<String> = JsonMissing.of(),
            @JsonProperty("callback_url")
            @ExcludeMissing
            callbackUrl: JsonField<String> = JsonMissing.of(),
            @JsonProperty("correlation_id")
            @ExcludeMissing
            correlationId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            expiresAt: JsonField<String> = JsonMissing.of(),
            @JsonProperty("from") @ExcludeMissing from: JsonField<String> = JsonMissing.of(),
            @JsonProperty("locale") @ExcludeMissing locale: JsonField<String> = JsonMissing.of(),
            @JsonProperty("variables")
            @ExcludeMissing
            variables: JsonField<Variables> = JsonMissing.of(),
        ) : this(
            templateId,
            to,
            callbackUrl,
            correlationId,
            expiresAt,
            from,
            locale,
            variables,
            mutableMapOf(),
        )

        /**
         * The template identifier.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun templateId(): String = templateId.getRequired("template_id")

        /**
         * The recipient's phone number.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun to(): String = to.getRequired("to")

        /**
         * The callback URL.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun callbackUrl(): Optional<String> = callbackUrl.getOptional("callback_url")

        /**
         * A user-defined identifier to correlate this transactional message with. It is returned in
         * the response and any webhook events that refer to this transactionalmessage.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun correlationId(): Optional<String> = correlationId.getOptional("correlation_id")

        /**
         * The message expiration date.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun expiresAt(): Optional<String> = expiresAt.getOptional("expires_at")

        /**
         * The Sender ID.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun from(): Optional<String> = from.getOptional("from")

        /**
         * A BCP-47 formatted locale string with the language the text message will be sent to. If
         * there's no locale set, the language will be determined by the country code of the phone
         * number. If the language specified doesn't exist, the default set on the template will be
         * used.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun locale(): Optional<String> = locale.getOptional("locale")

        /**
         * The variables to be replaced in the template.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun variables(): Optional<Variables> = variables.getOptional("variables")

        /**
         * Returns the raw JSON value of [templateId].
         *
         * Unlike [templateId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("template_id")
        @ExcludeMissing
        fun _templateId(): JsonField<String> = templateId

        /**
         * Returns the raw JSON value of [to].
         *
         * Unlike [to], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("to") @ExcludeMissing fun _to(): JsonField<String> = to

        /**
         * Returns the raw JSON value of [callbackUrl].
         *
         * Unlike [callbackUrl], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("callback_url")
        @ExcludeMissing
        fun _callbackUrl(): JsonField<String> = callbackUrl

        /**
         * Returns the raw JSON value of [correlationId].
         *
         * Unlike [correlationId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("correlation_id")
        @ExcludeMissing
        fun _correlationId(): JsonField<String> = correlationId

        /**
         * Returns the raw JSON value of [expiresAt].
         *
         * Unlike [expiresAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt(): JsonField<String> = expiresAt

        /**
         * Returns the raw JSON value of [from].
         *
         * Unlike [from], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("from") @ExcludeMissing fun _from(): JsonField<String> = from

        /**
         * Returns the raw JSON value of [locale].
         *
         * Unlike [locale], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("locale") @ExcludeMissing fun _locale(): JsonField<String> = locale

        /**
         * Returns the raw JSON value of [variables].
         *
         * Unlike [variables], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("variables")
        @ExcludeMissing
        fun _variables(): JsonField<Variables> = variables

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

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```java
             * .templateId()
             * .to()
             * ```
             */
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
            private var locale: JsonField<String> = JsonMissing.of()
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
                locale = body.locale
                variables = body.variables
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The template identifier. */
            fun templateId(templateId: String) = templateId(JsonField.of(templateId))

            /**
             * Sets [Builder.templateId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.templateId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun templateId(templateId: JsonField<String>) = apply { this.templateId = templateId }

            /** The recipient's phone number. */
            fun to(to: String) = to(JsonField.of(to))

            /**
             * Sets [Builder.to] to an arbitrary JSON value.
             *
             * You should usually call [Builder.to] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun to(to: JsonField<String>) = apply { this.to = to }

            /** The callback URL. */
            fun callbackUrl(callbackUrl: String) = callbackUrl(JsonField.of(callbackUrl))

            /**
             * Sets [Builder.callbackUrl] to an arbitrary JSON value.
             *
             * You should usually call [Builder.callbackUrl] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun callbackUrl(callbackUrl: JsonField<String>) = apply {
                this.callbackUrl = callbackUrl
            }

            /**
             * A user-defined identifier to correlate this transactional message with. It is
             * returned in the response and any webhook events that refer to this
             * transactionalmessage.
             */
            fun correlationId(correlationId: String) = correlationId(JsonField.of(correlationId))

            /**
             * Sets [Builder.correlationId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.correlationId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun correlationId(correlationId: JsonField<String>) = apply {
                this.correlationId = correlationId
            }

            /** The message expiration date. */
            fun expiresAt(expiresAt: String) = expiresAt(JsonField.of(expiresAt))

            /**
             * Sets [Builder.expiresAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.expiresAt] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun expiresAt(expiresAt: JsonField<String>) = apply { this.expiresAt = expiresAt }

            /** The Sender ID. */
            fun from(from: String) = from(JsonField.of(from))

            /**
             * Sets [Builder.from] to an arbitrary JSON value.
             *
             * You should usually call [Builder.from] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun from(from: JsonField<String>) = apply { this.from = from }

            /**
             * A BCP-47 formatted locale string with the language the text message will be sent to.
             * If there's no locale set, the language will be determined by the country code of the
             * phone number. If the language specified doesn't exist, the default set on the
             * template will be used.
             */
            fun locale(locale: String) = locale(JsonField.of(locale))

            /**
             * Sets [Builder.locale] to an arbitrary JSON value.
             *
             * You should usually call [Builder.locale] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun locale(locale: JsonField<String>) = apply { this.locale = locale }

            /** The variables to be replaced in the template. */
            fun variables(variables: Variables) = variables(JsonField.of(variables))

            /**
             * Sets [Builder.variables] to an arbitrary JSON value.
             *
             * You should usually call [Builder.variables] with a well-typed [Variables] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .templateId()
             * .to()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("templateId", templateId),
                    checkRequired("to", to),
                    callbackUrl,
                    correlationId,
                    expiresAt,
                    from,
                    locale,
                    variables,
                    additionalProperties.toMutableMap(),
                )
        }

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
            locale()
            variables().ifPresent { it.validate() }
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
            (if (templateId.asKnown().isPresent) 1 else 0) +
                (if (to.asKnown().isPresent) 1 else 0) +
                (if (callbackUrl.asKnown().isPresent) 1 else 0) +
                (if (correlationId.asKnown().isPresent) 1 else 0) +
                (if (expiresAt.asKnown().isPresent) 1 else 0) +
                (if (from.asKnown().isPresent) 1 else 0) +
                (if (locale.asKnown().isPresent) 1 else 0) +
                (variables.asKnown().getOrNull()?.validity() ?: 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Body &&
                templateId == other.templateId &&
                to == other.to &&
                callbackUrl == other.callbackUrl &&
                correlationId == other.correlationId &&
                expiresAt == other.expiresAt &&
                from == other.from &&
                locale == other.locale &&
                variables == other.variables &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                templateId,
                to,
                callbackUrl,
                correlationId,
                expiresAt,
                from,
                locale,
                variables,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{templateId=$templateId, to=$to, callbackUrl=$callbackUrl, correlationId=$correlationId, expiresAt=$expiresAt, from=$from, locale=$locale, variables=$variables, additionalProperties=$additionalProperties}"
    }

    /** The variables to be replaced in the template. */
    class Variables
    @JsonCreator
    private constructor(
        @com.fasterxml.jackson.annotation.JsonValue
        private val additionalProperties: Map<String, JsonValue>
    ) {

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Variables]. */
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

            /**
             * Returns an immutable instance of [Variables].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Variables = Variables(additionalProperties.toImmutable())
        }

        private var validated: Boolean = false

        fun validate(): Variables = apply {
            if (validated) {
                return@apply
            }

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
            additionalProperties.count { (_, value) -> !value.isNull() && !value.isMissing() }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Variables && additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() = "Variables{additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionalSendParams &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int = Objects.hash(body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "TransactionalSendParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}

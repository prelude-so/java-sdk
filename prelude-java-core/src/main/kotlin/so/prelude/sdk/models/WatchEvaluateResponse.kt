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
import so.prelude.sdk.core.checkRequired
import so.prelude.sdk.core.toImmutable
import so.prelude.sdk.errors.PreludeInvalidDataException

class WatchEvaluateResponse
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val id: JsonField<String>,
    private val action: JsonField<Action>,
    private val recipes: JsonField<List<Recipe>>,
    private val verdict: JsonField<Verdict>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("action") @ExcludeMissing action: JsonField<Action> = JsonMissing.of(),
        @JsonProperty("recipes")
        @ExcludeMissing
        recipes: JsonField<List<Recipe>> = JsonMissing.of(),
        @JsonProperty("verdict") @ExcludeMissing verdict: JsonField<Verdict> = JsonMissing.of(),
    ) : this(id, action, recipes, verdict, mutableMapOf())

    /**
     * The evaluation identifier.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * What the evaluation suggests you do, being the most severe action across the recipes that
     * ran. Advisory: enforcement is yours.
     * * `ALLOW` - Let the request through.
     * * `BLOCK` - Refuse the request.
     * * `CHALLENGE` - Let the request through behind an additional check.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun action(): Action = action.getRequired("action")

    /**
     * One result per recipe that ran. A recipe the flow names but that is not in service is absent
     * rather than reported as having passed.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun recipes(): List<Recipe> = recipes.getRequired("recipes")

    /**
     * The evaluation-level verdict, being the most severe verdict across the recipes that ran.
     * * `PASS` - No recipe flagged.
     * * `FLAG` - At least one recipe flagged.
     *
     * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verdict(): Verdict = verdict.getRequired("verdict")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [action].
     *
     * Unlike [action], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("action") @ExcludeMissing fun _action(): JsonField<Action> = action

    /**
     * Returns the raw JSON value of [recipes].
     *
     * Unlike [recipes], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("recipes") @ExcludeMissing fun _recipes(): JsonField<List<Recipe>> = recipes

    /**
     * Returns the raw JSON value of [verdict].
     *
     * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Verdict> = verdict

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
         * Returns a mutable builder for constructing an instance of [WatchEvaluateResponse].
         *
         * The following fields are required:
         * ```java
         * .id()
         * .action()
         * .recipes()
         * .verdict()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [WatchEvaluateResponse]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var action: JsonField<Action>? = null
        private var recipes: JsonField<MutableList<Recipe>>? = null
        private var verdict: JsonField<Verdict>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(watchEvaluateResponse: WatchEvaluateResponse) = apply {
            id = watchEvaluateResponse.id
            action = watchEvaluateResponse.action
            recipes = watchEvaluateResponse.recipes.map { it.toMutableList() }
            verdict = watchEvaluateResponse.verdict
            additionalProperties = watchEvaluateResponse.additionalProperties.toMutableMap()
        }

        /** The evaluation identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * What the evaluation suggests you do, being the most severe action across the recipes that
         * ran. Advisory: enforcement is yours.
         * * `ALLOW` - Let the request through.
         * * `BLOCK` - Refuse the request.
         * * `CHALLENGE` - Let the request through behind an additional check.
         */
        fun action(action: Action) = action(JsonField.of(action))

        /**
         * Sets [Builder.action] to an arbitrary JSON value.
         *
         * You should usually call [Builder.action] with a well-typed [Action] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun action(action: JsonField<Action>) = apply { this.action = action }

        /**
         * One result per recipe that ran. A recipe the flow names but that is not in service is
         * absent rather than reported as having passed.
         */
        fun recipes(recipes: List<Recipe>) = recipes(JsonField.of(recipes))

        /**
         * Sets [Builder.recipes] to an arbitrary JSON value.
         *
         * You should usually call [Builder.recipes] with a well-typed `List<Recipe>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun recipes(recipes: JsonField<List<Recipe>>) = apply {
            this.recipes = recipes.map { it.toMutableList() }
        }

        /**
         * Adds a single [Recipe] to [recipes].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addRecipe(recipe: Recipe) = apply {
            recipes =
                (recipes ?: JsonField.of(mutableListOf())).also {
                    checkKnown("recipes", it).add(recipe)
                }
        }

        /**
         * The evaluation-level verdict, being the most severe verdict across the recipes that ran.
         * * `PASS` - No recipe flagged.
         * * `FLAG` - At least one recipe flagged.
         */
        fun verdict(verdict: Verdict) = verdict(JsonField.of(verdict))

        /**
         * Sets [Builder.verdict] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verdict] with a well-typed [Verdict] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun verdict(verdict: JsonField<Verdict>) = apply { this.verdict = verdict }

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
         * Returns an immutable instance of [WatchEvaluateResponse].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .id()
         * .action()
         * .recipes()
         * .verdict()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): WatchEvaluateResponse =
            WatchEvaluateResponse(
                checkRequired("id", id),
                checkRequired("action", action),
                checkRequired("recipes", recipes).map { it.toImmutable() },
                checkRequired("verdict", verdict),
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
    fun validate(): WatchEvaluateResponse = apply {
        if (validated) {
            return@apply
        }

        id()
        action().validate()
        recipes().forEach { it.validate() }
        verdict().validate()
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
        (if (id.asKnown().isPresent) 1 else 0) +
            (action.asKnown().getOrNull()?.validity() ?: 0) +
            (recipes.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
            (verdict.asKnown().getOrNull()?.validity() ?: 0)

    /**
     * What the evaluation suggests you do, being the most severe action across the recipes that
     * ran. Advisory: enforcement is yours.
     * * `ALLOW` - Let the request through.
     * * `BLOCK` - Refuse the request.
     * * `CHALLENGE` - Let the request through behind an additional check.
     */
    class Action @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ALLOW = of("ALLOW")

            @JvmField val BLOCK = of("BLOCK")

            @JvmField val CHALLENGE = of("CHALLENGE")

            @JvmStatic fun of(value: String) = Action(JsonField.of(value))
        }

        /** An enum containing [Action]'s known values. */
        enum class Known {
            ALLOW,
            BLOCK,
            CHALLENGE,
        }

        /**
         * An enum containing [Action]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Action] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ALLOW,
            BLOCK,
            CHALLENGE,
            /** An enum member indicating that [Action] was instantiated with an unknown value. */
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
                ALLOW -> Value.ALLOW
                BLOCK -> Value.BLOCK
                CHALLENGE -> Value.CHALLENGE
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
                ALLOW -> Known.ALLOW
                BLOCK -> Known.BLOCK
                CHALLENGE -> Known.CHALLENGE
                else -> throw PreludeInvalidDataException("Unknown Action: $value")
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
        fun validate(): Action = apply {
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

            return other is Action && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Recipe
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val partialEvidence: JsonField<Boolean>,
        private val recipeId: JsonField<String>,
        private val rules: JsonField<List<Rule>>,
        private val score: JsonField<Long>,
        private val threshold: JsonField<Long>,
        private val verdict: JsonField<Verdict>,
        private val determinedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("partial_evidence")
            @ExcludeMissing
            partialEvidence: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("recipe_id")
            @ExcludeMissing
            recipeId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("rules") @ExcludeMissing rules: JsonField<List<Rule>> = JsonMissing.of(),
            @JsonProperty("score") @ExcludeMissing score: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("threshold")
            @ExcludeMissing
            threshold: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("verdict") @ExcludeMissing verdict: JsonField<Verdict> = JsonMissing.of(),
            @JsonProperty("determined_by")
            @ExcludeMissing
            determinedBy: JsonField<String> = JsonMissing.of(),
        ) : this(
            partialEvidence,
            recipeId,
            rules,
            score,
            threshold,
            verdict,
            determinedBy,
            mutableMapOf(),
        )

        /**
         * At least one rule could not be evaluated, so the score rests on less than the whole
         * recipe. The score is still returned — a partial verdict is more useful than none — but it
         * is labeled rather than passed off as whole.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun partialEvidence(): Boolean = partialEvidence.getRequired("partial_evidence")

        /**
         * The recipe that produced this result.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipeId(): String = recipeId.getRequired("recipe_id")

        /**
         * One result per rule in the recipe, in membership order. Every rule runs — a score is only
         * meaningful when complete, so there is no short-circuit on the first trigger.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun rules(): List<Rule> = rules.getRequired("rules")

        /**
         * The sum of the weights of the rules that triggered, clamped to the range -100 to 100. Two
         * scores at a bound are not comparable.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun score(): Long = score.getRequired("score")

        /**
         * The score at or above which this recipe flags.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun threshold(): Long = threshold.getRequired("threshold")

        /**
         * This recipe's own verdict. Normally the score against the threshold, unless a preempting
         * rule fired — see `determined_by`.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun verdict(): Verdict = verdict.getRequired("verdict")

        /**
         * The preempting rule that set `verdict`, present only when a rule rather than the score
         * decided it. Without it a recipe can report a score under its threshold and still flag,
         * with nothing in the payload accounting for the difference.
         *
         * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun determinedBy(): Optional<String> = determinedBy.getOptional("determined_by")

        /**
         * Returns the raw JSON value of [partialEvidence].
         *
         * Unlike [partialEvidence], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("partial_evidence")
        @ExcludeMissing
        fun _partialEvidence(): JsonField<Boolean> = partialEvidence

        /**
         * Returns the raw JSON value of [recipeId].
         *
         * Unlike [recipeId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("recipe_id") @ExcludeMissing fun _recipeId(): JsonField<String> = recipeId

        /**
         * Returns the raw JSON value of [rules].
         *
         * Unlike [rules], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rules") @ExcludeMissing fun _rules(): JsonField<List<Rule>> = rules

        /**
         * Returns the raw JSON value of [score].
         *
         * Unlike [score], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("score") @ExcludeMissing fun _score(): JsonField<Long> = score

        /**
         * Returns the raw JSON value of [threshold].
         *
         * Unlike [threshold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("threshold") @ExcludeMissing fun _threshold(): JsonField<Long> = threshold

        /**
         * Returns the raw JSON value of [verdict].
         *
         * Unlike [verdict], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("verdict") @ExcludeMissing fun _verdict(): JsonField<Verdict> = verdict

        /**
         * Returns the raw JSON value of [determinedBy].
         *
         * Unlike [determinedBy], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("determined_by")
        @ExcludeMissing
        fun _determinedBy(): JsonField<String> = determinedBy

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
             * Returns a mutable builder for constructing an instance of [Recipe].
             *
             * The following fields are required:
             * ```java
             * .partialEvidence()
             * .recipeId()
             * .rules()
             * .score()
             * .threshold()
             * .verdict()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Recipe]. */
        class Builder internal constructor() {

            private var partialEvidence: JsonField<Boolean>? = null
            private var recipeId: JsonField<String>? = null
            private var rules: JsonField<MutableList<Rule>>? = null
            private var score: JsonField<Long>? = null
            private var threshold: JsonField<Long>? = null
            private var verdict: JsonField<Verdict>? = null
            private var determinedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(recipe: Recipe) = apply {
                partialEvidence = recipe.partialEvidence
                recipeId = recipe.recipeId
                rules = recipe.rules.map { it.toMutableList() }
                score = recipe.score
                threshold = recipe.threshold
                verdict = recipe.verdict
                determinedBy = recipe.determinedBy
                additionalProperties = recipe.additionalProperties.toMutableMap()
            }

            /**
             * At least one rule could not be evaluated, so the score rests on less than the whole
             * recipe. The score is still returned — a partial verdict is more useful than none —
             * but it is labeled rather than passed off as whole.
             */
            fun partialEvidence(partialEvidence: Boolean) =
                partialEvidence(JsonField.of(partialEvidence))

            /**
             * Sets [Builder.partialEvidence] to an arbitrary JSON value.
             *
             * You should usually call [Builder.partialEvidence] with a well-typed [Boolean] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun partialEvidence(partialEvidence: JsonField<Boolean>) = apply {
                this.partialEvidence = partialEvidence
            }

            /** The recipe that produced this result. */
            fun recipeId(recipeId: String) = recipeId(JsonField.of(recipeId))

            /**
             * Sets [Builder.recipeId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipeId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipeId(recipeId: JsonField<String>) = apply { this.recipeId = recipeId }

            /**
             * One result per rule in the recipe, in membership order. Every rule runs — a score is
             * only meaningful when complete, so there is no short-circuit on the first trigger.
             */
            fun rules(rules: List<Rule>) = rules(JsonField.of(rules))

            /**
             * Sets [Builder.rules] to an arbitrary JSON value.
             *
             * You should usually call [Builder.rules] with a well-typed `List<Rule>` value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun rules(rules: JsonField<List<Rule>>) = apply {
                this.rules = rules.map { it.toMutableList() }
            }

            /**
             * Adds a single [Rule] to [rules].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRule(rule: Rule) = apply {
                rules =
                    (rules ?: JsonField.of(mutableListOf())).also {
                        checkKnown("rules", it).add(rule)
                    }
            }

            /**
             * The sum of the weights of the rules that triggered, clamped to the range -100 to 100.
             * Two scores at a bound are not comparable.
             */
            fun score(score: Long) = score(JsonField.of(score))

            /**
             * Sets [Builder.score] to an arbitrary JSON value.
             *
             * You should usually call [Builder.score] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun score(score: JsonField<Long>) = apply { this.score = score }

            /** The score at or above which this recipe flags. */
            fun threshold(threshold: Long) = threshold(JsonField.of(threshold))

            /**
             * Sets [Builder.threshold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.threshold] with a well-typed [Long] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun threshold(threshold: JsonField<Long>) = apply { this.threshold = threshold }

            /**
             * This recipe's own verdict. Normally the score against the threshold, unless a
             * preempting rule fired — see `determined_by`.
             */
            fun verdict(verdict: Verdict) = verdict(JsonField.of(verdict))

            /**
             * Sets [Builder.verdict] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verdict] with a well-typed [Verdict] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun verdict(verdict: JsonField<Verdict>) = apply { this.verdict = verdict }

            /**
             * The preempting rule that set `verdict`, present only when a rule rather than the
             * score decided it. Without it a recipe can report a score under its threshold and
             * still flag, with nothing in the payload accounting for the difference.
             */
            fun determinedBy(determinedBy: String) = determinedBy(JsonField.of(determinedBy))

            /**
             * Sets [Builder.determinedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.determinedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun determinedBy(determinedBy: JsonField<String>) = apply {
                this.determinedBy = determinedBy
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
             * Returns an immutable instance of [Recipe].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .partialEvidence()
             * .recipeId()
             * .rules()
             * .score()
             * .threshold()
             * .verdict()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Recipe =
                Recipe(
                    checkRequired("partialEvidence", partialEvidence),
                    checkRequired("recipeId", recipeId),
                    checkRequired("rules", rules).map { it.toImmutable() },
                    checkRequired("score", score),
                    checkRequired("threshold", threshold),
                    checkRequired("verdict", verdict),
                    determinedBy,
                    additionalProperties.toMutableMap(),
                )
        }

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
        fun validate(): Recipe = apply {
            if (validated) {
                return@apply
            }

            partialEvidence()
            recipeId()
            rules().forEach { it.validate() }
            score()
            threshold()
            verdict().validate()
            determinedBy()
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
            (if (partialEvidence.asKnown().isPresent) 1 else 0) +
                (if (recipeId.asKnown().isPresent) 1 else 0) +
                (rules.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (score.asKnown().isPresent) 1 else 0) +
                (if (threshold.asKnown().isPresent) 1 else 0) +
                (verdict.asKnown().getOrNull()?.validity() ?: 0) +
                (if (determinedBy.asKnown().isPresent) 1 else 0)

        class Rule
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val outcome: JsonField<Outcome>,
            private val ruleId: JsonField<String>,
            private val weight: JsonField<Long>,
            private val blockedBy: JsonField<String>,
            private val name: JsonField<String>,
            private val unavailable: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("outcome")
                @ExcludeMissing
                outcome: JsonField<Outcome> = JsonMissing.of(),
                @JsonProperty("rule_id")
                @ExcludeMissing
                ruleId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("weight") @ExcludeMissing weight: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("blocked_by")
                @ExcludeMissing
                blockedBy: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("unavailable")
                @ExcludeMissing
                unavailable: JsonField<Boolean> = JsonMissing.of(),
            ) : this(outcome, ruleId, weight, blockedBy, name, unavailable, mutableMapOf())

            /**
             * What the rule concluded.
             * * `TRIGGERED` - The condition held; `weight` was added to the score.
             * * `NOT_TRIGGERED` - The condition did not hold.
             * * `NOT_EVALUATED` - The rule could not run, because something it reads never arrived.
             *   This is not a quieter `NOT_TRIGGERED`: it contributed nothing either way, and it is
             *   why `partial_evidence` is set on the recipe.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun outcome(): Outcome = outcome.getRequired("outcome")

            /**
             * The rule that produced this result. Present whatever the rule's visibility, so a rule
             * you cannot see the condition of is still one you can reweight, switch off, or ask us
             * about.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun ruleId(): String = ruleId.getRequired("rule_id")

            /**
             * What this rule contributes to the recipe's score when it triggers.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun weight(): Long = weight.getRequired("weight")

            /**
             * Why the rule could not run, set only when `outcome` is `NOT_EVALUATED`.
             *
             * A rule you authored names the signal or attribute it waited on, since you wrote the
             * expression that reads it. A Prelude-managed rule reports `missing_data` and nothing
             * more: the signal it waited on is part of a condition that is not disclosed.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun blockedBy(): Optional<String> = blockedBy.getOptional("blocked_by")

            /**
             * The rule's name, present for a rule you authored and omitted for a Prelude-managed
             * one. A managed rule's name describes what it looks for, which is as much of the
             * condition as the expression is.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The rule could not run for a reason on our side rather than anything about your
             * request. `outcome` is `NOT_EVALUATED` and the failure is ours to fix.
             *
             * @throws PreludeInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun unavailable(): Optional<Boolean> = unavailable.getOptional("unavailable")

            /**
             * Returns the raw JSON value of [outcome].
             *
             * Unlike [outcome], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("outcome") @ExcludeMissing fun _outcome(): JsonField<Outcome> = outcome

            /**
             * Returns the raw JSON value of [ruleId].
             *
             * Unlike [ruleId], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("rule_id") @ExcludeMissing fun _ruleId(): JsonField<String> = ruleId

            /**
             * Returns the raw JSON value of [weight].
             *
             * Unlike [weight], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("weight") @ExcludeMissing fun _weight(): JsonField<Long> = weight

            /**
             * Returns the raw JSON value of [blockedBy].
             *
             * Unlike [blockedBy], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("blocked_by")
            @ExcludeMissing
            fun _blockedBy(): JsonField<String> = blockedBy

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [unavailable].
             *
             * Unlike [unavailable], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("unavailable")
            @ExcludeMissing
            fun _unavailable(): JsonField<Boolean> = unavailable

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
                 * Returns a mutable builder for constructing an instance of [Rule].
                 *
                 * The following fields are required:
                 * ```java
                 * .outcome()
                 * .ruleId()
                 * .weight()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Rule]. */
            class Builder internal constructor() {

                private var outcome: JsonField<Outcome>? = null
                private var ruleId: JsonField<String>? = null
                private var weight: JsonField<Long>? = null
                private var blockedBy: JsonField<String> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var unavailable: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(rule: Rule) = apply {
                    outcome = rule.outcome
                    ruleId = rule.ruleId
                    weight = rule.weight
                    blockedBy = rule.blockedBy
                    name = rule.name
                    unavailable = rule.unavailable
                    additionalProperties = rule.additionalProperties.toMutableMap()
                }

                /**
                 * What the rule concluded.
                 * * `TRIGGERED` - The condition held; `weight` was added to the score.
                 * * `NOT_TRIGGERED` - The condition did not hold.
                 * * `NOT_EVALUATED` - The rule could not run, because something it reads never
                 *   arrived. This is not a quieter `NOT_TRIGGERED`: it contributed nothing either
                 *   way, and it is why `partial_evidence` is set on the recipe.
                 */
                fun outcome(outcome: Outcome) = outcome(JsonField.of(outcome))

                /**
                 * Sets [Builder.outcome] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.outcome] with a well-typed [Outcome] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun outcome(outcome: JsonField<Outcome>) = apply { this.outcome = outcome }

                /**
                 * The rule that produced this result. Present whatever the rule's visibility, so a
                 * rule you cannot see the condition of is still one you can reweight, switch off,
                 * or ask us about.
                 */
                fun ruleId(ruleId: String) = ruleId(JsonField.of(ruleId))

                /**
                 * Sets [Builder.ruleId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.ruleId] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun ruleId(ruleId: JsonField<String>) = apply { this.ruleId = ruleId }

                /** What this rule contributes to the recipe's score when it triggers. */
                fun weight(weight: Long) = weight(JsonField.of(weight))

                /**
                 * Sets [Builder.weight] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.weight] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun weight(weight: JsonField<Long>) = apply { this.weight = weight }

                /**
                 * Why the rule could not run, set only when `outcome` is `NOT_EVALUATED`.
                 *
                 * A rule you authored names the signal or attribute it waited on, since you wrote
                 * the expression that reads it. A Prelude-managed rule reports `missing_data` and
                 * nothing more: the signal it waited on is part of a condition that is not
                 * disclosed.
                 */
                fun blockedBy(blockedBy: String) = blockedBy(JsonField.of(blockedBy))

                /**
                 * Sets [Builder.blockedBy] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.blockedBy] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun blockedBy(blockedBy: JsonField<String>) = apply { this.blockedBy = blockedBy }

                /**
                 * The rule's name, present for a rule you authored and omitted for a
                 * Prelude-managed one. A managed rule's name describes what it looks for, which is
                 * as much of the condition as the expression is.
                 */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /**
                 * The rule could not run for a reason on our side rather than anything about your
                 * request. `outcome` is `NOT_EVALUATED` and the failure is ours to fix.
                 */
                fun unavailable(unavailable: Boolean) = unavailable(JsonField.of(unavailable))

                /**
                 * Sets [Builder.unavailable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.unavailable] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun unavailable(unavailable: JsonField<Boolean>) = apply {
                    this.unavailable = unavailable
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Rule].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .outcome()
                 * .ruleId()
                 * .weight()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Rule =
                    Rule(
                        checkRequired("outcome", outcome),
                        checkRequired("ruleId", ruleId),
                        checkRequired("weight", weight),
                        blockedBy,
                        name,
                        unavailable,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PreludeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Rule = apply {
                if (validated) {
                    return@apply
                }

                outcome().validate()
                ruleId()
                weight()
                blockedBy()
                name()
                unavailable()
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
                (outcome.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (ruleId.asKnown().isPresent) 1 else 0) +
                    (if (weight.asKnown().isPresent) 1 else 0) +
                    (if (blockedBy.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (if (unavailable.asKnown().isPresent) 1 else 0)

            /**
             * What the rule concluded.
             * * `TRIGGERED` - The condition held; `weight` was added to the score.
             * * `NOT_TRIGGERED` - The condition did not hold.
             * * `NOT_EVALUATED` - The rule could not run, because something it reads never arrived.
             *   This is not a quieter `NOT_TRIGGERED`: it contributed nothing either way, and it is
             *   why `partial_evidence` is set on the recipe.
             */
            class Outcome @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val TRIGGERED = of("TRIGGERED")

                    @JvmField val NOT_TRIGGERED = of("NOT_TRIGGERED")

                    @JvmField val NOT_EVALUATED = of("NOT_EVALUATED")

                    @JvmStatic fun of(value: String) = Outcome(JsonField.of(value))
                }

                /** An enum containing [Outcome]'s known values. */
                enum class Known {
                    TRIGGERED,
                    NOT_TRIGGERED,
                    NOT_EVALUATED,
                }

                /**
                 * An enum containing [Outcome]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Outcome] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    TRIGGERED,
                    NOT_TRIGGERED,
                    NOT_EVALUATED,
                    /**
                     * An enum member indicating that [Outcome] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        TRIGGERED -> Value.TRIGGERED
                        NOT_TRIGGERED -> Value.NOT_TRIGGERED
                        NOT_EVALUATED -> Value.NOT_EVALUATED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws PreludeInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        TRIGGERED -> Known.TRIGGERED
                        NOT_TRIGGERED -> Known.NOT_TRIGGERED
                        NOT_EVALUATED -> Known.NOT_EVALUATED
                        else -> throw PreludeInvalidDataException("Unknown Outcome: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws PreludeInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        PreludeInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                /**
                 * Validates that the types of all values in this object match their expected types
                 * recursively.
                 *
                 * This method is _not_ forwards compatible with new types from the API for existing
                 * fields.
                 *
                 * @throws PreludeInvalidDataException if any value type in this object doesn't
                 *   match its expected type.
                 */
                fun validate(): Outcome = apply {
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

                    return other is Outcome && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Rule &&
                    outcome == other.outcome &&
                    ruleId == other.ruleId &&
                    weight == other.weight &&
                    blockedBy == other.blockedBy &&
                    name == other.name &&
                    unavailable == other.unavailable &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    outcome,
                    ruleId,
                    weight,
                    blockedBy,
                    name,
                    unavailable,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Rule{outcome=$outcome, ruleId=$ruleId, weight=$weight, blockedBy=$blockedBy, name=$name, unavailable=$unavailable, additionalProperties=$additionalProperties}"
        }

        /**
         * This recipe's own verdict. Normally the score against the threshold, unless a preempting
         * rule fired — see `determined_by`.
         */
        class Verdict @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val PASS = of("PASS")

                @JvmField val FLAG = of("FLAG")

                @JvmStatic fun of(value: String) = Verdict(JsonField.of(value))
            }

            /** An enum containing [Verdict]'s known values. */
            enum class Known {
                PASS,
                FLAG,
            }

            /**
             * An enum containing [Verdict]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Verdict] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                PASS,
                FLAG,
                /**
                 * An enum member indicating that [Verdict] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    PASS -> Value.PASS
                    FLAG -> Value.FLAG
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws PreludeInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    PASS -> Known.PASS
                    FLAG -> Known.FLAG
                    else -> throw PreludeInvalidDataException("Unknown Verdict: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws PreludeInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    PreludeInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            /**
             * Validates that the types of all values in this object match their expected types
             * recursively.
             *
             * This method is _not_ forwards compatible with new types from the API for existing
             * fields.
             *
             * @throws PreludeInvalidDataException if any value type in this object doesn't match
             *   its expected type.
             */
            fun validate(): Verdict = apply {
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

                return other is Verdict && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Recipe &&
                partialEvidence == other.partialEvidence &&
                recipeId == other.recipeId &&
                rules == other.rules &&
                score == other.score &&
                threshold == other.threshold &&
                verdict == other.verdict &&
                determinedBy == other.determinedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                partialEvidence,
                recipeId,
                rules,
                score,
                threshold,
                verdict,
                determinedBy,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Recipe{partialEvidence=$partialEvidence, recipeId=$recipeId, rules=$rules, score=$score, threshold=$threshold, verdict=$verdict, determinedBy=$determinedBy, additionalProperties=$additionalProperties}"
    }

    /**
     * The evaluation-level verdict, being the most severe verdict across the recipes that ran.
     * * `PASS` - No recipe flagged.
     * * `FLAG` - At least one recipe flagged.
     */
    class Verdict @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val PASS = of("PASS")

            @JvmField val FLAG = of("FLAG")

            @JvmStatic fun of(value: String) = Verdict(JsonField.of(value))
        }

        /** An enum containing [Verdict]'s known values. */
        enum class Known {
            PASS,
            FLAG,
        }

        /**
         * An enum containing [Verdict]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Verdict] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            PASS,
            FLAG,
            /** An enum member indicating that [Verdict] was instantiated with an unknown value. */
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
                PASS -> Value.PASS
                FLAG -> Value.FLAG
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
                PASS -> Known.PASS
                FLAG -> Known.FLAG
                else -> throw PreludeInvalidDataException("Unknown Verdict: $value")
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
        fun validate(): Verdict = apply {
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

            return other is Verdict && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is WatchEvaluateResponse &&
            id == other.id &&
            action == other.action &&
            recipes == other.recipes &&
            verdict == other.verdict &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(id, action, recipes, verdict, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "WatchEvaluateResponse{id=$id, action=$action, recipes=$recipes, verdict=$verdict, additionalProperties=$additionalProperties}"
}

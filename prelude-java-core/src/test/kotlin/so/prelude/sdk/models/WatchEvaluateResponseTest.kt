// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import so.prelude.sdk.core.jsonMapper

internal class WatchEvaluateResponseTest {

    @Test
    fun create() {
        val watchEvaluateResponse =
            WatchEvaluateResponse.builder()
                .id("evl_01jc0t6fwwfgfsq1md24mhyztj")
                .action(WatchEvaluateResponse.Action.ALLOW)
                .addRecipe(
                    WatchEvaluateResponse.Recipe.builder()
                        .partialEvidence(true)
                        .recipeId("rcp_01jc0t6fwwfgfsq1md24mhyztj")
                        .addRule(
                            WatchEvaluateResponse.Recipe.Rule.builder()
                                .outcome(WatchEvaluateResponse.Recipe.Rule.Outcome.TRIGGERED)
                                .ruleId("rul_01jc0t6fwwfgfsq1md24mhyztj")
                                .weight(10L)
                                .blockedBy("missing_data")
                                .name("high_value_cart_new_account")
                                .unavailable(true)
                                .build()
                        )
                        .score(20L)
                        .threshold(30L)
                        .verdict(WatchEvaluateResponse.Recipe.Verdict.PASS)
                        .determinedBy("rul_01jc0t6fwwfgfsq1md24mhyztj")
                        .build()
                )
                .verdict(WatchEvaluateResponse.Verdict.PASS)
                .build()

        assertThat(watchEvaluateResponse.id()).isEqualTo("evl_01jc0t6fwwfgfsq1md24mhyztj")
        assertThat(watchEvaluateResponse.action()).isEqualTo(WatchEvaluateResponse.Action.ALLOW)
        assertThat(watchEvaluateResponse.recipes())
            .containsExactly(
                WatchEvaluateResponse.Recipe.builder()
                    .partialEvidence(true)
                    .recipeId("rcp_01jc0t6fwwfgfsq1md24mhyztj")
                    .addRule(
                        WatchEvaluateResponse.Recipe.Rule.builder()
                            .outcome(WatchEvaluateResponse.Recipe.Rule.Outcome.TRIGGERED)
                            .ruleId("rul_01jc0t6fwwfgfsq1md24mhyztj")
                            .weight(10L)
                            .blockedBy("missing_data")
                            .name("high_value_cart_new_account")
                            .unavailable(true)
                            .build()
                    )
                    .score(20L)
                    .threshold(30L)
                    .verdict(WatchEvaluateResponse.Recipe.Verdict.PASS)
                    .determinedBy("rul_01jc0t6fwwfgfsq1md24mhyztj")
                    .build()
            )
        assertThat(watchEvaluateResponse.verdict()).isEqualTo(WatchEvaluateResponse.Verdict.PASS)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val watchEvaluateResponse =
            WatchEvaluateResponse.builder()
                .id("evl_01jc0t6fwwfgfsq1md24mhyztj")
                .action(WatchEvaluateResponse.Action.ALLOW)
                .addRecipe(
                    WatchEvaluateResponse.Recipe.builder()
                        .partialEvidence(true)
                        .recipeId("rcp_01jc0t6fwwfgfsq1md24mhyztj")
                        .addRule(
                            WatchEvaluateResponse.Recipe.Rule.builder()
                                .outcome(WatchEvaluateResponse.Recipe.Rule.Outcome.TRIGGERED)
                                .ruleId("rul_01jc0t6fwwfgfsq1md24mhyztj")
                                .weight(10L)
                                .blockedBy("missing_data")
                                .name("high_value_cart_new_account")
                                .unavailable(true)
                                .build()
                        )
                        .score(20L)
                        .threshold(30L)
                        .verdict(WatchEvaluateResponse.Recipe.Verdict.PASS)
                        .determinedBy("rul_01jc0t6fwwfgfsq1md24mhyztj")
                        .build()
                )
                .verdict(WatchEvaluateResponse.Verdict.PASS)
                .build()

        val roundtrippedWatchEvaluateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(watchEvaluateResponse),
                jacksonTypeRef<WatchEvaluateResponse>(),
            )

        assertThat(roundtrippedWatchEvaluateResponse).isEqualTo(watchEvaluateResponse)
    }
}

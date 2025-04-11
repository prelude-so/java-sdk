// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.blocking

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClient
import so.prelude.sdk.models.LookupLookupParams

@ExtendWith(TestServerExtension::class)
internal class LookupServiceTest {

    @Test
    fun lookup() {
        val client =
            PreludeOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val lookupService = client.lookup()

        val response =
            lookupService.lookup(
                LookupLookupParams.builder()
                    .phoneNumber("+12065550100")
                    .addType(LookupLookupParams.Type.CNAM)
                    .build()
            )

        response.validate()
    }
}

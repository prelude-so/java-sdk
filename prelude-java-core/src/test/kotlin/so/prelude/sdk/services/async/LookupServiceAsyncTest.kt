// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.services.async

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import so.prelude.sdk.TestServerExtension
import so.prelude.sdk.client.okhttp.PreludeOkHttpClientAsync
import so.prelude.sdk.models.LookupLookupParams

@ExtendWith(TestServerExtension::class)
internal class LookupServiceAsyncTest {

    @Test
    fun lookup() {
        val client =
            PreludeOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiToken("My API Token")
                .build()
        val lookupServiceAsync = client.lookup()

        val responseFuture =
            lookupServiceAsync.lookup(
                LookupLookupParams.builder()
                    .phoneNumber("+12065550100")
                    .addType(LookupLookupParams.Type.CNAM)
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }
}

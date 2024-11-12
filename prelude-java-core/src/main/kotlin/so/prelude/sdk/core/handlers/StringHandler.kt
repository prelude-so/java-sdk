@file:JvmName("StringHandler")

package so.prelude.sdk.core.handlers

import so.prelude.sdk.core.http.HttpResponse
import so.prelude.sdk.core.http.HttpResponse.Handler

@JvmSynthetic internal fun stringHandler(): Handler<String> = StringHandlerInternal

private object StringHandlerInternal : Handler<String> {
    override fun handle(response: HttpResponse): String =
        response.body().readBytes().toString(Charsets.UTF_8)
}

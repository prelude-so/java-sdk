// File generated from our OpenAPI spec by Stainless.

package so.prelude.sdk.errors

import so.prelude.sdk.core.JsonValue
import so.prelude.sdk.core.http.Headers

abstract class PreludeServiceException
protected constructor(message: String, cause: Throwable? = null) :
    PreludeException(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}

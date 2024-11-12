package so.prelude.sdk.errors

import so.prelude.sdk.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(statusCode, headers, body, error)

package so.prelude.sdk.errors

import so.prelude.sdk.core.http.Headers

class BadRequestException(
        headers: Headers,
        body: String,
        error: PreludeError,
) : PreludeServiceException(400, headers, body, error)

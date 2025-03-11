package so.prelude.sdk.errors

import so.prelude.sdk.core.http.Headers

class UnauthorizedException(
        headers: Headers,
        body: String,
        error: PreludeError,
) : PreludeServiceException(401, headers, body, error)

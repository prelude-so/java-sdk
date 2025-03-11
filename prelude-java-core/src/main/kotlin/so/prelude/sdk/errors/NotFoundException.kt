package so.prelude.sdk.errors

import so.prelude.sdk.core.http.Headers

class NotFoundException(
        headers: Headers,
        body: String,
        error: PreludeError,
) : PreludeServiceException(404, headers, body, error)

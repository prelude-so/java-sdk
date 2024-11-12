package so.prelude.sdk.errors

import so.prelude.sdk.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(422, headers, body, error)

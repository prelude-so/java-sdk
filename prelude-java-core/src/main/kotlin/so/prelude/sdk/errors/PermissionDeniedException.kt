package so.prelude.sdk.errors

import so.prelude.sdk.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(403, headers, body, error)

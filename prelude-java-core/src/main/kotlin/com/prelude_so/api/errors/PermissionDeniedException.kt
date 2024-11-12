package com.prelude_so.api.errors

import com.prelude_so.api.core.http.Headers

class PermissionDeniedException(
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(403, headers, body, error)

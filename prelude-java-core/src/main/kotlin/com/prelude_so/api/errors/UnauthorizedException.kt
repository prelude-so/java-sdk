package com.prelude_so.api.errors

import com.prelude_so.api.core.http.Headers

class UnauthorizedException(
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(401, headers, body, error)

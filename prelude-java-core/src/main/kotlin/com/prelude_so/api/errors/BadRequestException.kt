package com.prelude_so.api.errors

import com.prelude_so.api.core.http.Headers

class BadRequestException(
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(400, headers, body, error)

package com.prelude_so.api.errors

import com.prelude_so.api.core.http.Headers

class NotFoundException(
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(404, headers, body, error)

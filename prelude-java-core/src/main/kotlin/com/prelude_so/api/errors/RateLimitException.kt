package com.prelude_so.api.errors

import com.prelude_so.api.core.http.Headers

class RateLimitException(
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(429, headers, body, error)

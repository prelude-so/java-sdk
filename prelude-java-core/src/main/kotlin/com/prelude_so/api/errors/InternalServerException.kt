package com.prelude_so.api.errors

import com.prelude_so.api.core.http.Headers

class InternalServerException(
    statusCode: Int,
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(statusCode, headers, body, error)

package com.prelude_so.api.errors

import com.prelude_so.api.core.http.Headers

class UnprocessableEntityException(
    headers: Headers,
    body: String,
    error: PreludeError,
) : PreludeServiceException(422, headers, body, error)

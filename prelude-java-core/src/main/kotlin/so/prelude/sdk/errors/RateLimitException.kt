package so.prelude.sdk.errors

import so.prelude.sdk.core.http.Headers

class RateLimitException(headers: Headers, body: String, error: PreludeError) :
    PreludeServiceException(429, headers, body, error)

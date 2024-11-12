package com.prelude_so.api.errors

import com.prelude_so.api.core.http.Headers

abstract class PreludeServiceException
@JvmOverloads
constructor(
    private val statusCode: Int,
    private val headers: Headers,
    private val body: String,
    private val error: PreludeError,
    message: String = "$statusCode: $error",
    cause: Throwable? = null
) : PreludeException(message, cause) {

    fun statusCode(): Int = statusCode

    fun headers(): Headers = headers

    fun body(): String = body

    fun error(): PreludeError = error
}

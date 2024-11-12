package com.prelude_so.api.errors

open class PreludeException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : RuntimeException(message, cause)

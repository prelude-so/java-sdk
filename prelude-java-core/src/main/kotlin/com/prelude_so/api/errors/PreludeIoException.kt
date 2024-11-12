package com.prelude_so.api.errors

class PreludeIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : PreludeException(message, cause)

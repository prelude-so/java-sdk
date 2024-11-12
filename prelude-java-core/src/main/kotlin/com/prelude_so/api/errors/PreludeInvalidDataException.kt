package com.prelude_so.api.errors

class PreludeInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : PreludeException(message, cause)

package so.prelude.sdk.errors

class PreludeInvalidDataException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : PreludeException(message, cause)

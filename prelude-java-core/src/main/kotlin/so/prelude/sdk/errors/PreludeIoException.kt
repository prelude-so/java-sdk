package so.prelude.sdk.errors

class PreludeIoException
@JvmOverloads
constructor(message: String? = null, cause: Throwable? = null) : PreludeException(message, cause)

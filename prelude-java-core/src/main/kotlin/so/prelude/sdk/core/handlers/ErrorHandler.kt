@file:JvmName("ErrorHandler")

package so.prelude.sdk.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import so.prelude.sdk.core.http.Headers
import so.prelude.sdk.core.http.HttpResponse
import so.prelude.sdk.core.http.HttpResponse.Handler
import so.prelude.sdk.errors.BadRequestException
import so.prelude.sdk.errors.InternalServerException
import so.prelude.sdk.errors.NotFoundException
import so.prelude.sdk.errors.PermissionDeniedException
import so.prelude.sdk.errors.RateLimitException
import so.prelude.sdk.errors.PreludeError
import so.prelude.sdk.errors.PreludeException
import so.prelude.sdk.errors.UnauthorizedException
import so.prelude.sdk.errors.UnexpectedStatusCodeException
import so.prelude.sdk.errors.UnprocessableEntityException
import java.io.ByteArrayInputStream
import java.io.InputStream

@JvmSynthetic
internal fun errorHandler(jsonMapper: JsonMapper): Handler<PreludeError> {
    val handler = jsonHandler<PreludeError>(jsonMapper)

    return object : Handler<PreludeError> {
        override fun handle(response: HttpResponse): PreludeError =
            try {
                handler.handle(response)
            } catch (e: Exception) {
                PreludeError.builder().build()
            }
    }
}

@JvmSynthetic
internal fun <T> Handler<T>.withErrorHandler(errorHandler: Handler<PreludeError>): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            when (val statusCode = response.statusCode()) {
                in 200..299 -> {
                    return this@withErrorHandler.handle(response)
                }
                400 -> {
                    val buffered = response.buffered()
                    throw BadRequestException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                401 -> {
                    val buffered = response.buffered()
                    throw UnauthorizedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                403 -> {
                    val buffered = response.buffered()
                    throw PermissionDeniedException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                404 -> {
                    val buffered = response.buffered()
                    throw NotFoundException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                422 -> {
                    val buffered = response.buffered()
                    throw UnprocessableEntityException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                429 -> {
                    val buffered = response.buffered()
                    throw RateLimitException(
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                in 500..599 -> {
                    val buffered = response.buffered()
                    throw InternalServerException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
                else -> {
                    val buffered = response.buffered()
                    throw UnexpectedStatusCodeException(
                        statusCode,
                        buffered.headers(),
                        stringHandler().handle(buffered),
                        errorHandler.handle(buffered),
                    )
                }
            }
        }
    }

private fun HttpResponse.buffered(): HttpResponse {
    val body = body().readBytes()

    return object : HttpResponse {
        override fun statusCode(): Int = this@buffered.statusCode()

        override fun headers(): Headers = this@buffered.headers()

        override fun body(): InputStream = ByteArrayInputStream(body)

        override fun close() = this@buffered.close()
    }
}

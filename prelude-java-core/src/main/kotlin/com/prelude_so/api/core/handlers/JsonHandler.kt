@file:JvmName("JsonHandler")

package com.prelude_so.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.prelude_so.api.core.http.HttpResponse
import com.prelude_so.api.core.http.HttpResponse.Handler
import com.prelude_so.api.errors.PreludeException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T {
            try {
                return jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw PreludeException("Error reading response", e)
            }
        }
    }

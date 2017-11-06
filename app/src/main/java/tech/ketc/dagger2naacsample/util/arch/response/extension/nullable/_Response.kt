package tech.ketc.dagger2naacsample.util.arch.response.extension.nullable

import tech.ketc.dagger2naacsample.util.arch.response.Response


inline fun <T : Any?> Response<T>.orElseGet(supply: () -> T) = result ?: supply()

fun <T : Any?> Response<T>.orElse(other: T) = result ?: other
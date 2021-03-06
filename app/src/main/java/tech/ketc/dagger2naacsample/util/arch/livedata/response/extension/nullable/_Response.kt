package tech.ketc.dagger2naacsample.util.arch.livedata.response.extension.nullable

import tech.ketc.dagger2naacsample.util.arch.livedata.response.Response


inline fun <T : Any?> Response<T>.orElseGet(supply: () -> T) = result ?: supply()

fun <T : Any?> Response<T>.orElse(other: T) = result ?: other
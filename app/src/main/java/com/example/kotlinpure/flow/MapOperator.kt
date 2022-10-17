package com.example.kotlinpure.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        (1..3).asFlow()
            .map {
                performRequest(it)
            }
            .collect() {
                println(it)
            }
    }
}

suspend fun performRequest(request: Int): String {
    delay(1000)
    return "response $request"
}
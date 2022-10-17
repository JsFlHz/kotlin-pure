package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        (1..3).asFlow()
            .filter { it > 1 }
            .map{
                performRequest(it)
            }
            .collect() {
                println(it)
            }
    }
}


package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.runBlocking

/***
 * Cancels the current flow when the defined limit is reached.
 */
fun main() {
    runBlocking {
        (1..3).asFlow()
            .take(2)
            .collect() {
                println(it)
            }
    }
}

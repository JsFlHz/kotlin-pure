package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.transform
import kotlinx.coroutines.runBlocking

/***
 *   In this example, by applying the transformation operator, we output string elements and not int,
 *   which was the original collection type
 */
fun main() {
    runBlocking {
        (1..3).asFlow()
            .transform{
                    emit(" making request $it")
                    emit(performRequest(it))
            }
            .collect() {
                println(it)
            }
    }
}


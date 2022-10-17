package com.example.kotlinpure.flow.terminaloperators

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.runBlocking

/***
 *   first is a terminal operator that reutnrs the first element in a flow
 */
fun main() {
    runBlocking {
        val value =  (1..3).asFlow()
            .first()
        println( "value = $value")
    }
}
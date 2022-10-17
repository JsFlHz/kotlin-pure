package com.example.kotlinpure.flow.terminaloperators

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.reduce
import kotlinx.coroutines.runBlocking

/***
 *   reduce is a terminal operator that helps us to reduce elements of an flow by an function
 */
fun main() {
    runBlocking {
        val resultado =  (1..3).asFlow()
            .reduce{ a,b-> a + b }
        println(resultado)
    }
}
package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

/***
 * In the following example we can see that the filter is the first operator to be executed
 * and then the map operator transforms the element into a String element,
 * this shows that the flow has a sequential behavior.
 */
fun main() {
    runBlocking {
        (1..5).asFlow()
            .filter {
                println("filtering $it")
                it % 2 == 0
            }
            .map {
                " $it is even"
            }
            .collect{
                println(it)
            }
    }
}
package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.take
import kotlinx.coroutines.flow.toList
import kotlinx.coroutines.runBlocking

/***
 *   toList is a terminal operator that helps us to transform the elements of the stream into a list.
 */
fun main() {
    runBlocking {
      val list: List<Int> =  (1..3).asFlow()
            .take(2)
            .filter { it > 1 }
            .toList()
        list.forEach{
            println(it)
        }
    }
}
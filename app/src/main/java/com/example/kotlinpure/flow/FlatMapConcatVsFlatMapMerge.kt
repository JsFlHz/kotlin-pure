package com.example.kotlinpure.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main(){
    withFlapMap()
    println("============= vs ============")
    withFlapMapMerge()
}

fun withFlapMap() = runBlocking{
        val startTime: Long = System.currentTimeMillis()
        (1..3).asFlow().onEach { delay(100) }
            .flatMapConcat { requestFlow(it) }
            .collect{
                println("$it at ${System.currentTimeMillis() - startTime} ms from start")
            }
}

fun withFlapMapMerge() = runBlocking{
    val startTime: Long = System.currentTimeMillis()
    (1..3).asFlow().onEach { delay(100) }
        .flatMapConcat { requestFlow(it) }
        .collect{
            println("$it at ${System.currentTimeMillis() - startTime} ms from start")
        }
}

fun requestFlow(i:Int):Flow<String> = flow {
    emit("$i  first")
    delay(500)
    emit("$i  second")
}



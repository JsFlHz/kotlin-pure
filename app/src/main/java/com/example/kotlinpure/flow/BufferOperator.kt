package com.example.kotlinpure.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main(){
    runBlocking {
        withoutBuffer()
        withBuffer()
        withConflate()
        withCollectLastest()
    }
}

suspend fun withoutBuffer(){
    val time =  measureTimeMillis {
        flowOne()
            .collect{
                delay(3000)
                println(it)
            }
    }
    println(" withoutBuffer total: ${time/1000} seg")
}

suspend fun withBuffer(){
    val time =  measureTimeMillis {
        flowOne()
            .buffer()
            .collect{
                delay(3000)
                println(it)
            }
    }
    println("withBuffer total: ${time/1000} seg")
}

// shows first and last value of the flow
suspend fun withConflate(){
    val time =  measureTimeMillis {
        flowOne()
            .conflate()
            .collect{
                delay(3000)
                println(it)
            }
    }
    println(" withConflate total: ${time/1000} seg")
}

suspend fun withCollectLastest(){
    val time =  measureTimeMillis {
        flowOne()
            .collectLatest{
                delay(3000)
                println(it)
            }
    }
    println(" withCollectLastest total: ${time/1000} seg")
}

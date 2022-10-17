package com.example.kotlinpure

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    jobExample()
    Thread.sleep(5000)
}

fun jobExample(){
    println("Threada 1 ${Thread.currentThread().name}")
    val job = GlobalScope.launch {
        delayCoroutine("Tarea2")
    }
    runBlocking {
        delay(2_000)
    }
    job.cancel()
    println("Tarea3 ${Thread.currentThread().name}")
}
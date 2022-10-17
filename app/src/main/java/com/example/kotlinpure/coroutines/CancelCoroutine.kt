package com.example.kotlinpure

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    cancelableCoroutine()
}

fun cancelableCoroutine() = runBlocking{
    val job = launch {
        repeat(1000){
            i ->
            println("job $i")
            delay(500L)
        }
    }
    delay(1400)
    println("cansado de esperar")
    job.cancel()

}
package com.example.kotlinpure

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
fun main(){

    suspendExampleLanunch()
    Thread.sleep(5000)
}


fun suspendExampleLanunch(){
    println("Threada 1 ${Thread.currentThread().name}")
    GlobalScope.launch {
        delayCoroutine("Tarea2")
    }
    println("Tarea3 ${Thread.currentThread().name}")
}
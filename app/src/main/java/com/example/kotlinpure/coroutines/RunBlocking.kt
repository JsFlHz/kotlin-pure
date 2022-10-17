package com.example.kotlinpure

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

    fun main(){
        suspendExample()
        suspendExample2()
    }
    suspend fun delayCoroutine(message:String){
        delay(4000)
        println("$message ${Thread.currentThread().name}")
    }

    fun suspendExample(){
        println("Threada 1 ${Thread.currentThread().name}")
        runBlocking {
            delayCoroutine("Tarea2")
        }
        println("Tarea3 ${Thread.currentThread().name}")
    }

    fun suspendExample2() = runBlocking{
        println("Threada 1 ${Thread.currentThread().name}")
            delayCoroutine("Tarea2")
        println("Tarea3 ${Thread.currentThread().name}")
    }

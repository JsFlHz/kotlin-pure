package com.example.kotlinpure

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main(){
 dispatchers()
}
fun dispatchers() {
    runBlocking {
        println("Hilo en el que se ejecuta ${Thread.currentThread().name}")
    }
    runBlocking(Dispatchers.Unconfined) {
        println("Hilo en el que se ejecuta 2 ${Thread.currentThread().name}")
    }
    runBlocking(Dispatchers.Default) {
        println("Hilo en el que se ejecuta 3 ${Thread.currentThread().name}")
    }
    runBlocking(Dispatchers.IO){
        println("Hilo en el que se ejecuta4 ${Thread.currentThread().name}")
    }
    runBlocking( newSingleThreadContext("miHilo")) {
        println("Hilo en el que se ejecuta 5 ${Thread.currentThread().name}")
    }
//  runBlocking( Dispatchers.Main) {
//        println("Hilo en el que se ejecuta 5 ${Thread.currentThread().name}")
//    }
}

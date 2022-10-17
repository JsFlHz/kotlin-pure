package com.example.kotlinpure.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main(){
    coroutineList().forEach{
        println(it)
    }
}

fun coroutineList():List<Int>{
    return runBlocking {
        delay(3000)
        listOf(1,2,3)
    }
}
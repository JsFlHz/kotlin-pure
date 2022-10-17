package com.example.kotlinpure.flow

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


/***
 * Flow is a call asychronoues data stream, thath is executed on a coroutine, throws: complete state or exception
 */

fun main(){
   runBlocking {
       launch {
           for(j in 1..3){
               println("no estoy bloqueado $j")
               delay(1000)
           }

       }
       flowOne().collect(){
           println("value = $it")
       }
   }

}

fun flowOne(): Flow<Int> = flow{
    for( i in 1..3){
        emit(i)
        delay(1000)
    }
}

suspend fun printFlow( flow:Flow<Int>){
   flow.collect(){
        println("value = $it")
    }
}


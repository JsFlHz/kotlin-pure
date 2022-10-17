package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

fun main(){
    // los valores se comienzan a emitir hasta que se usa collect
    runBlocking {
        val flow = flowOne()
        println( "Llamando Flow")
        flow.collect{
            println(it)
        }
        println("Collecting")
        flow.collect{
            println(it)
        }
        println( "Collecting")
    }
}
package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.zip
import kotlinx.coroutines.runBlocking

fun main(){
    val numbers = (1..4).asFlow()
    val strings = flowOf("one", "tow", "three")
    runBlocking {
        numbers.zip(strings){
            n,s ->  "$n -> $s"
        }.collect{
            println(it)
        }
    }
}
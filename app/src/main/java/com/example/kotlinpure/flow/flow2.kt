package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.runBlocking

fun main(){
    runBlocking {
        printFlow( flowOne() )
        printFlow( secondFlow() )
        printFlow( thirdFlow() )
    }
}

//using flowOf constructor
fun secondFlow():Flow<Int> {
    return flowOf(1,2,3)
}

// using asFlow() constructor
fun thirdFlow (): Flow<Int>{
    return (1..3).asFlow()
}
package com.example.kotlinpure

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main(){
    asyncAwaitExample()
    println( "========= Vs =========")
    asyncDeferredExample()
}

suspend fun hardCalculate():Int{
    delay(5000)
    return 3
}

fun asyncAwaitExample() = runBlocking{
    println( System.currentTimeMillis().toString() )
    val number1 = async {
        hardCalculate()
    }.await()
    println( System.currentTimeMillis().toString() )
    val number2 = async {
        hardCalculate()
    }.await()

    println("the result ${ number1 + number2 }")
}


fun asyncDeferredExample() = runBlocking{
    println( System.currentTimeMillis().toString() )
    val number1 = async {
        hardCalculate()
    }
    println( System.currentTimeMillis().toString() )
    val number2 = async {
        hardCalculate()
    }

    println("the result ${ number1.await() + number2.await() }")
}
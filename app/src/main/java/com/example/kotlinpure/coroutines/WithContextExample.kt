package com.example.kotlinpure

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.system.measureTimeMillis

fun main() {
    println( "asyncAwait total: ${measureTimeMillis { asyncAwaitExample() }}" )
    println( "asyncDeferred total: ${measureTimeMillis { asyncDeferredExample() }}" )
    println( "withContext total: ${measureTimeMillis { withContextIOExample() }}" )
}

fun withContextIOExample() = runBlocking {
    val number1 = withContext(Dispatchers.IO){ hardCalculate() }
    val number2 = withContext(Dispatchers.IO){ hardCalculate() }
    println("resultado ${ number1 + number2 }")
}
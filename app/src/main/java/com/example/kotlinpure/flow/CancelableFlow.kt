package com.example.kotlinpure.flow

import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main(){
    runBlocking {
        /** la emision total requiere 3 segundos, al establecer withTimeoutorNull no da tiempo sufieciente
         * pra que termine, en este caso el flow se cancela lo que muestra que un flow es cancelable en cualquier momento
         */
        withTimeoutOrNull(2000){
            flowOne().collect{
                println(it)
            }
        }
        println("done")
    }
}
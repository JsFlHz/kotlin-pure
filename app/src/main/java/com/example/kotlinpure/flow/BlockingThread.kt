package com.example.kotlinpure.flow

import kotlinx.coroutines.yield


fun main(){
    show()
}

fun show(){
    sequence().forEach { i-> println(i) }
}

fun sequence():Sequence<Int> = sequence {
    for( i in 1..3){
        yield(i)
        Thread.sleep(3000)
    }
}
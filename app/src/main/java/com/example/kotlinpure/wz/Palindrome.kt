package com.example.kotlinpure.wz

fun main(){
    println("hello")
}

fun isPalindrome( number:Int ){

}

fun romanToInt( romanNumber:String ){
    if( romanNumber.length >= 1 && romanNumber.length <= 15 ){

    }else{
        println("invalid number")
    }
}

fun romanUnit( digit:String):Int{
    return when(digit) {
        "I" -> 1
        "V" -> 5
        "X" -> 10
        "L" -> 50
        "C" -> 100
        "D" -> 500
        "M" -> 1000
        else -> 0
    }
}
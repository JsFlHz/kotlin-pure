package com.example.kotlinpure

import android.os.Build
import androidx.annotation.RequiresApi
import kotlinx.coroutines.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/*
/***
* first version
 */
@OptIn(DelicateCoroutinesApi::class)
fun main() = runBlocking{
    repeat(3){
        GlobalScope.launch { printMessage()}
    }
}


  fun  printMessage(){
    println("hi form ${Thread.currentThread()} ")
}

 */


/*
/***
 * second version
 */
@RequiresApi(Build.VERSION_CODES.O)
val formatter = DateTimeFormatter.ISO_LOCAL_TIME
@RequiresApi(Build.VERSION_CODES.O)
val time = { formatter.format(LocalDateTime.now())}

suspend fun getValue():Double{
    println("entering getValue() at ${time()}")
    delay(3000)
    println("leaving getValue() at ${time()}")
    return Math.random()
}

/*
// using async and await
fun main() = runBlocking{
    val num1 = async { getValue() }
    val num2 = async { getValue() }
    println(" a + b = ${num1.await()+num2.await()}")
}

 */
/*
fun main() = runBlocking{
    val num1 = getValue()
    val num2 = getValue()
    println(" a + b = ${num1 + num2}")
}
*/

*/

/***
 * last version
 */


//// migrate this to coroutines
//fun main() {
//    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
//    repeat(3) {
//        Thread {
//            println("${Thread.currentThread()} has started")
//            for (i in states) {
//                println("${Thread.currentThread()} - $i")
//                Thread.sleep(50)
//            }
//        }.start()
//    }
//}




suspend fun migration() {
    val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
    repeat(3) {
        GlobalScope.launch {
            println("${Thread.currentThread()} has started")
            for (state in states) {
                 val message = async{executeCoroutine(state)}
                println(message.await())
            }
        }
    }
}

suspend fun executeCoroutine(state:String): String{
    delay(50)
    return   "${Thread.currentThread()} - $state"
}

//fun main() = runBlocking{
//   migration()
//}



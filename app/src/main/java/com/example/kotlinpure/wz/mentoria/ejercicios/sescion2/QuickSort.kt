package com.example.kotlinpure.wz.mentoria.ejercicios.sescion2

fun main() {
    mergeAndOrder(
        listOf(63, 2, 4, 1, 9, 3, 8, 5, 0, 5),
        listOf(63, 2, 4, 1, 9, 3, 8, 5, 0, 5)
    )
}

fun mergeAndOrder(listOne: List<Int>, listTwo: List<Int>) {
    val mergeList = mutableListOf<Int>()
    mergeList.addAll(listOne)
    mergeList.addAll(listTwo)
    println("original list $mergeList")
    val sorted = sort(mergeList)
    println(sorted)
}

fun sort(elements: List<Int>): MutableList<Int> {
    if (elements.size < 1) {
        return mutableListOf<Int>()
    }
    val pivot = elements.get(0)
    val left = mutableListOf<Int>()
    val right = mutableListOf<Int>()
    for (i in 1..elements.size - 1) {
        if (elements[i] > pivot) {
            left.add(elements[i])
        } else {
            right.add(elements[i])
        }
    }
    var acumulator = mutableListOf<Int>()
    acumulator.addAll(sort(left))
    acumulator.add(pivot)
    acumulator.addAll(sort(right))
    return acumulator
}






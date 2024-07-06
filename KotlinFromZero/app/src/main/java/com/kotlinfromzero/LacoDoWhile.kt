package com.kotlinfromzero

fun main() {
    /*
    Estrutura de repetição Do While
    * */
    var x = 0
    val numeros = arrayListOf<Int>()
    do {
        println(x)
        x++
        numeros.add(x)
        println("Tamanho da lista: ${numeros.size}")
    } while (x < 10)

    println("-------------------")
    val numeros2 = arrayListOf<Int>()
    var y = 0
    do {
        numeros2.add(y++)
        println("Tamanho da lista: ${numeros2.size}")
    } while (x < 0)
}
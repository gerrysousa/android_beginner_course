package com.kotlinfromzero

fun main() {
    /*
    Estrutura de repetição While
    * */
    var x = 0
    while (x < 10) {
        println(x)
        x++
    }
    println("-------------------")

    var numeros = arrayListOf<Int>()
    var tamaho = 0
    while (numeros.size < 5) {
        numeros.add(tamaho++)
        println(tamaho)
    }
    println("------------------- minha lista ")
    numeros.forEach {
        println(it)
    }
    println("-------------------")
}
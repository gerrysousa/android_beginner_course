package com.kotlinfromzero

fun main() {
    /*
    != verifica se é diferente de
    == verifica se é igual
    is (instanceof) verifica se é do tipo

    * */
    val x = 5
    val y = 10
    val z = "10"

    println(x != y)
    println(x == y)
    println(x is Int)
    println(y is Int)
    println(z is String)
}
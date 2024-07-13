package com.kotlinfromzero

fun main() {
    /*
    Funções com valores padrão
    * */

   val result = somar2(10, 20)
    println("-------------------")
    println("Resultado soma passando 2 parametros: $result")
    println("-------------------")

    val result2 = somar2( b=5)
    println("Resultado soma passando apenas B: $result2")
    println("-------------------")

    val result3 = somar3()
    println("Resultado soma passando nenhum parametro: $result3")
    println("-------------------")

    val result4 = somar3(a=5)
    println("Resultado soma passando apenas A: $result4")
    println("-------------------")
}

fun somar2(a: Int=2, b: Int): Int {
    return a + b
}

fun somar3(a: Int=10, b: Int=20): Int {
    return a + b
}

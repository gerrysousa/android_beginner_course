package com.kotlinfromzero

fun main() {
    /*
    Estrutura de repetição For
    * */

   val result = somar(10, 20)
    println("-------------------")
    println("Resultado soma: $result")
    println("-------------------")
    val result2 = multiplicar(10, 20)
    println("Resultado multiplicação: $result2")
    println("-------------------")
}

/**
fun somar(a: Int, b: Int): Int {
a: Int é o parâmetro do tipo Int
b: Int é o parâmetro do tipo Int
): Int é o retorno da função
* */
fun somar(a: Int, b: Int): Int {
    return a + b
}

/***
 * Multiplicar
 podemos simplificar a função  para o modelo abaixo
 */
fun multiplicar(a: Int, b: Int): Int = a * b
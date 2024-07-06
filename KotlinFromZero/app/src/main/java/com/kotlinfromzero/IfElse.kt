package com.kotlinfromzero

fun main() {
    /*
   If else
   When
   For
   While
   Do while

    * */
    var x = 5
    val y = 10

    if (x > y) {
        println("x é maior que y")
    } else {
        println("x é menor que y")
    }

    println("Digite um numero: ")
    val num = readLine()!!.toInt()

    if (num % 2 == 0) {
        println("Número é par")
    } else {
        println("Número é impar")
    }

    println("Digite sua nota escolar: ")
    val nota = readLine()!!.toDouble()
    if (nota >= 7) {
        println("Aprovado")
    } else if (nota >= 5) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }
}
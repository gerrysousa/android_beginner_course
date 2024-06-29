package com.kotlinfromzero

fun main(args: Array<String>) {
    println("Hello Word")

    println("Val é usado para variareis constantes que não mudam")
    val PI = 3.14
    println("PI= $PI")

    println("var é usado para variaveis que podem mudar")
    var idade = 10
    println("Idade= " + idade)
    idade = idade + 1
    println("Nova Idade= $idade")
}
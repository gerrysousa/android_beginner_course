package com.kotlinfromzero

fun main(args: Array<String>) {
    println("Variaveis Mutaveis e Imutaveis")

    println("Variaveis Mutaveis: podem mudar (var)")
    var idade = 10
    println("Idade= " + idade)
    idade = idade + 1
    println("Nova Idade= $idade")

    println("Variaveis Imutaveis: não podem mudar (val)")
    val PI = 3.14
    println("Valor de PI= $PI")
}
package com.kotlinfromzero

fun main() {
    /*
   When

    * */
    println("Digite a idade: ")
    val idade = readLine()!!.toInt()

    when (idade) {
        in 0..2 -> println("Bebê")
        in 3..10 -> println("Criança")
        in 11..17 -> println("Adolescente")
        in 18..69 -> println("Adulto")
        else -> {
            println("Idoso")
            println("==========")// duas linhas no codigo use as chaves
        }
    }
}
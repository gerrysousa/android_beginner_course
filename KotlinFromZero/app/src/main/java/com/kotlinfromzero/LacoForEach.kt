package com.kotlinfromzero

fun main() {
    /*
    Estrutura de repetição Foreach
    * */

    val frutas = arrayListOf("Maçã", "Banana", "Laranja", "Pera")

    println("------------------- it por default")
    frutas.forEach {
        println(it)
    }

    println("------------------- mudando o nome da variavel")
    frutas.forEach { nomeFruta ->
        println(nomeFruta.uppercase())
    }

}
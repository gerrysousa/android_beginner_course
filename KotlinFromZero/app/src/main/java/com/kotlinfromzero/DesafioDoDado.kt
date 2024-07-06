package com.kotlinfromzero

fun main() {
    /*
   Desafio do Dado
    * */
    println("Digite um número de 1 a 6:")
    val num = readLine()!!.toInt()

    val random = (1..6).random()
    println("O número sorteado foi: $random")
    if (num == random) {
        println("Você acertou!")
    } else {
        println("Você errou!")
    }

    when(num== random){
        true -> println("Muito bem!!!")
        false -> println("Que Pena, tente novamente!!!")
    }
}
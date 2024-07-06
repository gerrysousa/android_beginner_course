package com.kotlinfromzero

fun main() {
    /*
   Array List
    * */

    val cores = arrayListOf("Vermelho", "Verde", "Azul")
    cores.add("Amarelo")
    cores.forEach {
        println(it)
    }
    println("-------------------")
    val ultimo = cores.last()
    println("O ultimo elemento é: $ultimo")
    println("-------------------")
    val primeiro = cores.first()
    println("O primeiro elemento é: $primeiro")
    println("-------------------")

    cores.remove("Vermelho")
    cores.forEach {
        println(it)
    }
    println("-------------------")
    cores.removeAt(1)
    cores.forEach {
        println(it)
    }
    println("-------------------")
    cores.clear()
    cores.forEach {
        println(it)
    }
    println("-------------------")
    println(cores.size)
    cores.addAll(arrayListOf("Roxo", "Laranja", "Preto"))
    cores.forEach {
        println(it)
    }
    println("-------------------")
    cores.sort()
    cores.forEach {
        println(it)
    }
    println("-------------------")

}
package com.kotlinfromzero

fun main(args: Array<String>) {
    println("Conversao Tipos Primitivos")

    val idade = 10
    println("Idade= " + idade)
    val stringIdade = idade.toString()
    val byteIdade = idade.toByte()
    val floatIdade = idade.toFloat()

    println("val stringIdade = idade.toString() -> $stringIdade")
    println("val byteIdade = idade.toByte() -> $byteIdade")
    println("val floatIdade = idade.toFloat() -> $floatIdade")

    val stringTwelve = "12"
    val stringToInt = stringTwelve.toInt()

    println("val strintToInt = stringTwelve.toInt() -> $stringToInt")
    val soma = stringToInt + 4
    println("val soma = stringToInt + 4 -> $soma")

}
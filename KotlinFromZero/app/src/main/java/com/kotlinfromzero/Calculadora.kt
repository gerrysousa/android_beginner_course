package com.kotlinfromzero

fun main(args: Array<String>) {
    println("Calculadora soma")

    //val number1 = readLine()?.toInt()!!  adicionamos duas exclamações(!!) para afirmar aque o valor não será null
    println("Digite o primeiro numero: ")
    val number1 = readLine()?.toInt()!!
    println("Digite o segundo numero: ")
    val number2 = readLine()?.toInt()!!

    val soma = (number1 + number2)

    println("A soma dos valores é: $soma")
    println("____________________________")
    println("val number1 = readLine()?.toInt()!!  adicionamos duas exclamações(!!) para afirmar aque o valor não será null")
    println("Temos que fazer isso, senão esse codigo não irá compilar 'val soma = (number1 + number2)'")
}
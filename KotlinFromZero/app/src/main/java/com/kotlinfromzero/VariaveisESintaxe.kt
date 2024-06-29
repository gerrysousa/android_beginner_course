package com.kotlinfromzero

fun main (args: Array<String>){
    println("Variaveis 'val' não muram e variaveis 'var' podem mudar")
    println("Ponto e virgura é opcional em Kotlin ")
    println("Podemos inicializar de varias formas ")
    println("val intType = 1  ou var intType2: Int ")
    val intType = 1
    var intType2: Int
    intType2=10
    println("intType=$intType e intType2=$intType2")

    var nome: String
    nome="Bastiao"
    println("O nome é $nome")

    println("Tipos primititos")
    var idade: Int
    var nome2: String
    var salario: Double
    var price: Float

    println("var idade: Int")
    println("var nome2: String")
    println("var salario: Double")
    println("var price: Float")
}
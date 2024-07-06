package com.kotlinfromzero

fun main() {
    /*
    Estrutura de repetição For
    * */

    val frutas= arrayListOf("Maçã", "Banana", "Laranja", "Pera")

    println("-------- for (fruta in frutas){-----------")
    for (fruta in frutas){
        println(fruta)
    }
    println("-------- for (i in 1..10){-----------")
    for (i in 1..10){
        println(i)
    }
    println("--------- for (i in 10 downTo 1){----------")
    for (i in 10 downTo 1){
        println(i)
    }
    println("------- for (i in 1..10 step 2){------------")
    for (i in 1..10 step 2){
        println(i)
    }
    println("---------for (i in 10 downTo 1 step 2){----------")
    for (i in 10 downTo 1 step 2){
        println(i)
    }
    println("---------- for (i in 1 until 10){---------")
    for (i in 1 until 10){
        println(i)
    }
    println("----------for (i in 1 until 10 step 2){---------")
    for (i in 1 until 10 step 2){
        println(i)
    }
    println("-------------------")
}
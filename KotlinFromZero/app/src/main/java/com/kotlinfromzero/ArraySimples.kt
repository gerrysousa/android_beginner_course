package com.kotlinfromzero

import java.util.Arrays

fun main() {
    /*
   Array simples
    * */

    val array = arrayOf(1, 2, 3, 4)
    println(array[0])
    println(array[1])
    println(array[2])
    println(array[3])

    val (x, y, z) = arrayOf(1, 2, 3)
    println(x)
    println(y)
    println(z)

    val countries = arrayOf("Brasil", "Estados Unidos", "Canadá", "China")
    countries.forEach {
        println(it)
    }
    println("-------------------")
    val BRposition = Arrays.binarySearch(countries, "Brasil")
    println("Brasil está na posição: $BRposition")
    println("Estados Unidos está na posição: ${Arrays.binarySearch(countries, "Estados Unidos")}")


    val countrySize = countries.size
    println(countrySize)

    println("Reverse")
    countries.reverse()
    countries.forEach {
        println(it)
    }
    println("-------------------")
    countries.sortBy { it.length }
    countries.forEach {
        println(it)
    }
    println("-------------------")
    val EUAposition = Arrays.binarySearch(countries, "Estados Unidos")
    println("Estados Unidos está na posição: ${Arrays.binarySearch(countries, "Estados Unidos")}")

    println("-------------------")
    countries[EUAposition] = "EUA"
    countries.forEach {
        println(it)
    }
    println("-------------------")
}
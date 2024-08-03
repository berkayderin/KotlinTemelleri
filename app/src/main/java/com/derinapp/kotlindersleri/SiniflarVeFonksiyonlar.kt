package com.derinapp.kotlindersleri

var sayac = 10
fun main() {
    // fonksiyonları çağır
    birinciFonksiyon()
    ikinciFonksiyon()

    cikarmaIslemi(10, 5)
    println("Toplama Sonuç: ${toplamaIslemi(10, 5)}")
}

fun birinciFonksiyon() {
    sayac++
    println("birinci fonksiyon çalıştı ve sayac: $sayac")
}

fun ikinciFonksiyon() {
    sayac *= 2
    println("ikinci fonksiyon çalıştı ve sayac: $sayac")
}

fun cikarmaIslemi(sayi1: Int, sayi2: Int){
    println("Çıkarma Sonuç: ${sayi1 - sayi2}") // buradan dönen sonuç: Unit
}

fun toplamaIslemi(sayi1: Int, sayi2: Int): Int { // buradan dönen sonuç: Int
    return sayi1 + sayi2
}


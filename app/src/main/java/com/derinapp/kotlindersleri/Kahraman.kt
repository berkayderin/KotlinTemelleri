package com.derinapp.kotlindersleri

open class Kahraman(val isim: String, val ozelGuc: String) { // default halde final class'tır. Kalıtım alınmasını istiyorsak açmalıyız. Bunuda open ile yaparız
    fun kos() {
        println("kahraman koşuyor")
    }
}
package com.derinapp.kotlindersleri

class Kopek: Hayvan() {
    fun hayla() {
        println("Hav hav hav")
        // super.sesCikar() // Hayvan sınıfındaki sesCikar metodunu çağırdık. bir üst sınıfın metoduna eriştik.
    }

    override fun sesCikar() { // Hayvan sınıfındaki sesCikar metodunu ezeriz.
        println("Köpek sınıfından ses çıkar metodu çalıştı.")
    }
}
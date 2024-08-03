package com.derinapp.kotlindersleri

/*
NORMAL ŞEKİLDE SINIFTAN CONSTRUCTOR OLUŞTURMA
class Superkahraman {

    var isim = ""
    var yas = 0
    var meslek = ""

    // constructor: Sınıfın yapıcı fonksiyonu
    constructor(isim: String, yas: Int, meslek: String) {

        this.isim = isim
        this.yas = yas
        this.meslek = meslek
    }

}
*/

class Superkahraman(var isim: String, var yas: Int, var meslek: String) {

    // Sınıfın yapıcı fonksiyonu
    init {
        println("Superkahraman sınıfından bir nesne oluşturuldu.")
    }

}

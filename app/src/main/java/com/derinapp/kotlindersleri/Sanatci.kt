package com.derinapp.kotlindersleri

class Sanatci (var isim: String , val yas: Int,  var enstruman : String) : Insan(), Sarki, Dans {
    // yukarıdaki değişkenlerin hepsi publictir. Erişim belirleyicisi belirtilmediği için publictir.
    // direkt enstruman yazarsak başka sınıftan düzelemeyiz. Bu yüzden private yaparız.


    var sacRengi = ""
    private var tur = "insan"

    var gozRengi = ""
        private set
        public get

    fun turuYazdir() {
        println(this.tur)
    }

    fun sarkiSoyle() {
        println("Şarkıcı şarkı söyled: ${this.isim}")
    }

    init {
        println("init çağrıldı") // sınıf oluşturulduğunda çalışacak
    }
}

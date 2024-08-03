package com.derinapp.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    lateinit var benimKahraman : Superkahraman // lateinit ile ileride değer atayacağımızı belirttik (KOTLİNE GÜVEN VERDİK :))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        // Superkahraman sınıfından bir nesne oluşturuyoruz.
        var superman = Superkahraman("Superman", 30, "Gazeteci")
        println("Superman'ın mesleği: ${superman.meslek}")

        // Nullability
        val kullaniciGirdisi = "atil"
        val kullaciGirdisiInteger = kullaniciGirdisi.toIntOrNull() // uygulamanın çökmemesi için null olabilir

        if (kullaciGirdisiInteger != null) {
            println(kullaciGirdisiInteger * 2)
            println("Kullanıcı girdisi integer'a dönüştürülebilir.")
        } else {
            println("Kullanıcı girdisi integer'a dönüştürülemez.")
        }

        val benimDouble: Double? // ? işareti ile null olabilir olduğunu belirttik
        val kullaniciGirdisiDouble = kullaniciGirdisi.toDoubleOrNull() // uygulamanın çökmemesi için null olabilir

        // !! => null olmayacak EMİNİM demektir => kullanımı önerilmez
        kullaniciGirdisiDouble!!.plus(5.0) // null olmayacak emin olduğumuz için !! kullandık

        // ? => safe call operatörü
        println(kullaniciGirdisiDouble?.minus(3.0)) // null olabilir, olursa işlem yapma

        // ?: => Elvis operatörü => null olursa varsayılan değeri ata
        val sonuc = kullaniciGirdisiDouble?.minus(3.0) ?: 0.0 // null olursa 0.0 döndür

        // let fonksiyonu
        val kullaniciYasi = 30
        kullaniciYasi.let {
            println("Kullanıcı yaşını yazdırıyoruz: $it")
        }

         */


        // Encapsulation (Kapsülleme)
        var atil = Sanatci("Atil", 30, "Gitar")
        println("Sanatçının ismi: ${atil.isim}")
        atil.isim = "Atil Samancioglu"
        println("Sanatçının ismi: ${atil.isim}")

        atil.sarkiSoyle()
        atil.sacRengi = "Siyah"
        atil.turuYazdir()

        println(atil.yas)

        // Inheritance (Kalıtım)
        val kahraman = Kahraman("Atil", "Uçmak")
        kahraman.kos()

        val muhtesemKahraman = MuhtesemKahraman("batman", "zengin olmak")
        muhtesemKahraman.kos()
        println(muhtesemKahraman.isim)

        // Polymorphism (Çok biçimlilik)

        // static polymorphism
        val islemler = Islemler()
        println(islemler.cikarma(5, 3))
        println(islemler.cikarma(5, 3, 2))

        // dynamic polymorphism
        val kedi = Hayvan()
        val kopek = Kopek()
        val ornekDizi = arrayOf(kedi, kopek)
        ornekDizi.forEach { hayvan ->
            hayvan.sesCikar()
        }


        // Abstraction (Soyutlama)
        // Abstract class ve interface

        //val insan = Insan() // abstract class'tan nesne oluşturamayız
    }

}
package com.derinapp.kotlindersleri

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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

    }
}
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
    }
}
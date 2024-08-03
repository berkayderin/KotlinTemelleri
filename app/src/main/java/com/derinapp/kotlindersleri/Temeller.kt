package com.derinapp.kotlindersleri

fun main() {
    var x = 10
    println(x)

    x=30
    println(x)
    // yani en güncel değer neyse o kullanılır. eski değerler değişmez

    val z = 20 // sonradan değerini değiştirmeyeceksek "val" değişkenini kullanırız

    var ornek: Long = 10 // tipini long yaptık
    println(ornek)

    println(5/2)
    println(5.0/2.0) // farklı sonuçlar verir

    val ornekFloat : Float = 2.25f // float tanımlarken sonuna f koyuyoruz (sadece flotlarda bulunan bir istisna)

    val unsignedByte : UByte = 10u // unsigned tanımlama

    // STRİNGLER
    var ben = "benim 'string'im"
    println(ben)

    var isim = "berkay"
    println(isim.uppercase())

    val benimStr : String
    benimStr = "naber" // initalize, init, initialization (değişkenin ilk değerini atama)

    // VERİ DÖNÜŞÜMLERİ
    val yas = "25"
    println(yas.toInt())

    // BOOLEAN
    var benimBoolean : Boolean = true
    println(benimBoolean)

    // VERİ YAPILARI
    // DİZİLER
    println("-------- DİZİLER -----------")
    val benimDizim = arrayOf(1,2,3,4,5,"berkay")
    println(benimDizim[5])

    benimDizim[2] = "Naber" // dizilerde val olmasına rağmen değiştirebiliriz
    println(benimDizim[2])
    println(benimDizim.get(2))

    println("-------- ARRAYLİST -----------")
    val isimListesi = arrayListOf("berkay","derin","ali")
    println(isimListesi[1])
    println(isimListesi.size)
    isimListesi.add("veli")
    println(isimListesi.size)
    println(isimListesi)
    println(isimListesi.get(3))
    isimListesi[3] = "veli2"
    println(isimListesi.get(3))
    // isimListesi.remove(3)

    // aşağıdaki gibi iki şekilde arraylist oluşturabiliriz
    val liste1 = arrayListOf<Int>()
    val liste2 = ArrayList<Int>()

    // karışık liste oluşturmak
    val karisikListe = arrayListOf<Any>()
    karisikListe.add("berkay")
    karisikListe.add(25)
    karisikListe.add(true)
    println(karisikListe)

    println("-------- SET -----------") // unique değerler tutar, aynı değeri birden fazla ekleyemezsin
    val benimSet = setOf(10,10,10,10,20,30,40)
    println(benimSet.size)

    // benimSet.add(50) // hata verir, setlerde add metodu yoktur
    // setlerde index mantığı yoktur
    // println(benimSet[0]) // hata verir

    benimSet.forEach {
        println(it)
    }

    val bosSetOrnegı = HashSet<String>()
    bosSetOrnegı.add("berkay")
    bosSetOrnegı.add("derin")
    bosSetOrnegı.add("ali")
    bosSetOrnegı.add("berkay")
    println(bosSetOrnegı.size)

    bosSetOrnegı.forEach() {
        println(it)
    }

    val ornekTekilSet = bosSetOrnegı.toHashSet()
    println(ornekTekilSet.size)
    ornekTekilSet.forEach {
        println(it)
    }

    // MAP
    println("-------- MAP -----------") // key-value mantığı

    val yemekDizisi = arrayListOf("elma","armut","muz")
    val kaloriDizisi = arrayListOf(100,200,300)

    println("${yemekDizisi[0]} : ${kaloriDizisi[0]}")

    val yemekKaloriMap = hashMapOf<String,Int>()
    yemekKaloriMap.put("elma",100)
    yemekKaloriMap.put("armut",200)
    yemekKaloriMap.put("muz",300)
    println(yemekKaloriMap["elma"])

    println(yemekKaloriMap.get("armut"))

    yemekKaloriMap.put("elma",20000)
    println(yemekKaloriMap["elma"])

    // KONTROLLER
    println("-------- KONTROLLER -----------")

    println("------- IF ELSE -----------")
    val sayi = 12
    if (sayi < 10) {
        println("sayı 10'dan küçük")
    } else if (sayi == 10) {
        println("sayı 10'a eşit")
    } else {
        println("sayı 10'dan büyük")
    }

    println("------- WHEN -----------")
    val not = 0
    var notString = ""
    when(not) {
        0 -> notString = "Geçersiz not"
        1 -> notString = "Zayıf"
        2 -> notString = "İyi"
        3 -> notString = "Çok İyi"
        4 -> notString = "Mükemmel"
        else -> notString = "Bilinmeyen not"
    }

    println(notString)

    println("------- WHILE -----------")

    var j = 0
    while (j < 10) {
        println(j)
        j++
    }

    println("------- FOR -----------")
    val baskaDizi = arrayOf(1,2,3,4,5,6,7,8,9,10)
    for (i in baskaDizi) {
        println(i)
    }

    for (i in 0..4) {
        println("index : $i")
    }
}



















package com.example.uzbekistanabout

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.uzbekistanabout.mvp.Contract
import com.example.uzbekistanabout.mvp.province

class MainActivity : AppCompatActivity(), Contract.view {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val toshkent = findViewById<ConstraintLayout>(R.id.toshkent_btn)
        val samarqand = findViewById<ConstraintLayout>(R.id.Samarqand_btn)
        val andijon = findViewById<ConstraintLayout>(R.id.andijon_btn)
        val navoiy = findViewById<ConstraintLayout>(R.id.navoiy_btn)
        val qashqadaryo = findViewById<ConstraintLayout>(R.id.qashqadaryo_btn)
        val surxondaryo = findViewById<ConstraintLayout>(R.id.surxondaryo_btn)
        val qoraqalpogiston = findViewById<ConstraintLayout>(R.id.qoraqalpogiston_btn)
        val fargona = findViewById<ConstraintLayout>(R.id.fargona_btn)
        val namangan = findViewById<ConstraintLayout>(R.id.namangan_btn)
        val buxoro = findViewById<ConstraintLayout>(R.id.buxoro_btn)
        val jizzax = findViewById<ConstraintLayout>(R.id.jizzax_btn)
        val xorazm = findViewById<ConstraintLayout>(R.id.xorazm_btn)
        val backbutton = findViewById<Button>(R.id.button3)

        val intent = Intent(this, Secondactivity::class.java)
        val intent1 = Intent(this, MainActivity::class.java)

//
        backbutton.setOnClickListener { onBackPressed() }

        toshkent.setOnClickListener {
            intent.putExtra("name", "Toshkent")
            intent.putExtra("image", R.drawable.toshkent_activity2)
            intent.putExtra(

                "about",
                R.string.asdf
            )
            startActivity(intent)

        }
        samarqand.setOnClickListener {
            intent.putExtra("name", "Samarqand")
            intent.putExtra("image", R.drawable.samarqand_activity2)
            intent.putExtra(
                "about",
                " Oʻzbekiston Respublikasi Samarqand viloyatidagi qadimiy shahar. Viloyatning maʼmuriy, iqtisodiy va madaniy markazi (1938-yildan). 1925-1930-yillarda Respublika poytaxti. Oʻzbekistonning janubi-gʻarbida, Zarafshon vodiysining markaziy qismida (Dargʻom va Siyob kanallari orasida) joylashgan. Oʻrtacha 695 m balandlikda. Toshkentdan 300 km."
            )
            startActivity(intent)

        }
        andijon.setOnClickListener {
            intent.putExtra("name", "Andijon")
            intent.putExtra("image", R.drawable.andijon_activity2)
            intent.putExtra(
                "about",
                " Oʻzbekiston Respublikasi tarkibidagi viloyat. Fargʻona vodiysining sharqiy qismida. 1941-yil 6-martda tashkil etilgan. Maydoni 4,2 ming km². Aholisi 3 253 501 kishi (2022-yil 1-yanvar holatiga). Andijon viloyatida 14 qishloq tuman, 11 shahar va 95 qishloq fuqarolari yigʻini bor"
            )
            startActivity(intent)

        }
        navoiy.setOnClickListener {
            intent.putExtra("name", "Navoiy")
            intent.putExtra("image", R.drawable.navoiy_activity2)
            intent.putExtra(
                "about",
                " Bu shahar Navoiy viloyatning maʼmuriy, iqtisodiy va madaniy markazidir. Oʻzbekistonning janubi-gʻarbida, Zarafshon daryosi vodiysida, viloyatning sharqiy chekkasida, 347 m balandlikda joylashgan. Ushbu shaharda temir yoʻl stansiyasi avtotransport yoʻllarining muhim tuguni boʻlib, Toshkentdan 509 km uzoqlikda joylashgan. Aholisi — 136 374 ming kishi"
            )
            startActivity(intent)

        }
        qashqadaryo.setOnClickListener {
            intent.putExtra("name", "Qashqadaryo")
            intent.putExtra("image", R.drawable.qashqadaryo_activity2)
            intent.putExtra(
                "about",
                " Oʻzbekiston Respublikasi tarkibidagi viloyat. 1924-yil 1-noyabrda tashkil etilgan. Respublikaning janubi-gʻarbida, Qashqadaryo havzasida, Pomir-Oloy togʻ tizmasining gʻarbiy chekkasida, Amudaryo va Zarafshon daryolari, Hisor va Zarafshon tizma togʻlari orasida. Shimoli-gʻarbdan Buxoro va janubi-sharqdan Surxondaryo viloyatlari, janubi-gʻarb va gʻarbdan Turkmaniston Respublikasi, sharqdan Tojikiston Respublikasi hamda Samarqand viloyati bilan chegaradosh. Maydoni 28,6 ming km². Aholisi 3,408,300 kishi (3-oʻrin) (2022)."
            )
            startActivity(intent)

        }
        surxondaryo.setOnClickListener {
            intent.putExtra("name", "Surxondaryo")
            intent.putExtra("image", R.drawable.surxondaryo_activity2)
            intent.putExtra(
                "about",
                " Oʻzbekiston Respublikasi tarkibidagi viloyat. 1941-yil 6-martda tashkil etilgan (1925-yil 29-iyundan Surxondaryo okrugi boʻlgan). 1960-yil 25-yanvarda Qashqadaryo viloyati bilan qoʻshilgan. 1964-yil fevralda qaytadan tashkil qilindi. Respublikaning janubi-sharqida, Surxon-Sherobod vodiysida joylashgan. Viloyat nomi vohadan oqib oʻtuvchi „Surxon“ (fors-tojik: „qizil“) daryosi nomidan kelib chiqqan. "
            )
            startActivity(intent)

        }
        qoraqalpogiston.setOnClickListener {
            intent.putExtra("name", "Qoraqalpog'iston")
            intent.putExtra("image", R.drawable.qoraqalpogiston_activity2)
            intent.putExtra(
                "about",
                "Qoraqalpogʻiston — parlament boshqaruv shakliga ega boʻlgan O'zbekiston respublikasi tarkibidagi suveren demokratik respublikadir. Qonun chiqaruvchi oliy davlat vakolatli organi — koʻp partiyaviylik asosida 5 yil muddatga saylangan deputatlardan iborat Qoraqalpogʻiston hududi Joʻqorgʻi Kengeshi (QR JK). Qoraqalpogʻiston hududi Joʻqorgʻi Kengeshi raisi respublika rahbari hisoblanib, u Joʻqorgʻi Kengesh deputatlari orasidan 5 yil muddatga saylanadi (faqat ketma-ket 2 muddatdan oshmaydi)."
            )
            startActivity(intent)

        }
        fargona.setOnClickListener {
            intent.putExtra("name", "Farg'ona")
            intent.putExtra("image", R.drawable.fargona_activity2)
            intent.putExtra(
                "about",
                "Fargʻona soʻzining kelib chiqishi toʻgʻrisida turli fikrlar mavjud. Olimlar „Fargʻona“ soʻzining bundan 13 asr ilgari sugʻd yozuvlarida „Pargʻana“, „Pragʻana“ shakllarida yozilganligini hamda hind-sanskrit tilida „kichik viloyat“; fors tillarida „togʻ oraligʻidagi vodiy“, „atrofi berk soylik“ degan maʼnolarga ega boʻlganligini taʼkidlaydilar. Fargʻona oʻzining goʻzal landshaftlari bilan mashhur boʻlgan olis shahar."
            )
            startActivity(intent)

        }
        namangan.setOnClickListener {
            intent.putExtra("name", "Namangan")
            intent.putExtra("image", R.drawable.namangan_activity2)
            intent.putExtra(
                "about",
                "Namangan viloyatidagi shahar. Viloyatning maʼmuriy, iqtisodiy va madaniy markazi Aholi soni boʻyicha Fargʻonadan oldingi oʻrinda. Oʻzbekistonning yirik shaharlaridan biri. Fargʻona vodiysining har jihatdan peshqadam viloyati. Vodiyning shim.da, Shim. Fargʻona kanali bilan Namangansoy kesishgan yerda, 450 m balandlikda joylashgan. Maydoni 83,3 ming km². Iyulning oʻrtacha temperaturasi 26,3°, yanv.niki —2,3°. Aholisi 1 mln ming kishi atrofida "
            )
            startActivity(intent)

        }
        buxoro.setOnClickListener {
            intent.putExtra("name", "Buxoro")
            intent.putExtra("image", R.drawable.buxoro_activity2)
            intent.putExtra(
                "about",
                " Oʻzbekiston Respublikasining qadimiy shaharlaridan biri, Buxoro viloyatining maʼmuriy, iqtisodiy va madaniy markazi. O'zbekistonning ilk poytaxti. Buyuk ipаk yoʻlida yirik tijorat markazlaridan boʻlgan. Oʻzbekistonning janubiy-gʻarbida, Zarafshon daryosi quyi oqimida joylashgan. Toshkentdan 616 km. Buxoro 2 ta shahar rayoni (Fayzulla Xoʻjayev va Toʻqimachilik)ga boʻlingan. Aholisi 290000 (2019). Aholisining katta qismini o'zbeklar tashkil etadi. "
            )
            startActivity(intent)

        }
        jizzax.setOnClickListener {
            intent.putExtra("name", "Jizzax")
            intent.putExtra("image", R.drawable.jizzax_activity2)
            intent.putExtra(
                "about",
                " Oʻzbekiston Respublikasining Jizzax viloyatidagi shahar. Viloyatning maʼmuriy, iqtisodiy va madaniy markazi.\n" +
                        "\n" +
                        "Sangzor daryosi boʻyida, 460 m balandlikda joylashgan. Toshkent-Samarqand temir yoʻl va Katta Oʻzbekiston trakti yoqasida. Maydon 0,7 ming km2. Aholisi 132,5 ming kishi (2000; 1939-yil-9 ming, 1959-yil-15 ming, 1970-yil-35 ming kishi), asosan oʻzbeklar; rus, tatar, ukrain, eroniy va boshqalar ham yashaydi."
            )
            startActivity(intent)

        }
        xorazm.setOnClickListener {
            intent.putExtra("name", "Xorazm")
            intent.putExtra("image", R.drawable.xorazm_activity2)
            intent.putExtra(
                "about",
                "Xorazm (arabcha: خوارزم) — Amudaryo sohillarida markazga ega Oʻrta Osiyo qadimiy mintaqasi — qadimiy davlat[1][2][3] va rivojlangan irrigatsiyali dehqonchilik, hunarmandlik va savdo mintaqasi. Xorazm orqali Buyuk Ipak yoʻli oʻtgan. III asr oxirlarida Xorazm poytaxti Kat shahri boʻlgan; X asr oxirlarida poytaxt Urganch shahriga koʻchiriladi (hozirgi Koʻhna Urganch shahri)."
            )
            startActivity(intent)
        }


    }

    override fun setProvincesToViews(Provinces: List<province>) {

    }

}
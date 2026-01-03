package com.example.uzbekistanabout

import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView
import com.example.uzbekistanabout.R

class MultiActivity1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.multilanguage)

        val uzb_btn = findViewById<CardView>(R.id.cardView)
        val rus_btn = findViewById<CardView>(R.id.cardView1)
        val eng_btn = findViewById<CardView>(R.id.cardView2)
        val backbutton = findViewById<ImageView>(R.id.backbutton)
        val intent = Intent(this, MainActivity::class.java)



        uzb_btn.setOnClickListener {
            MultiLanguageActivity.setLocale(this, "uz")
            this.recreate()
            startActivity(intent)
        }
        rus_btn.setOnClickListener {
            MultiLanguageActivity.setLocale(this, "ru")
            this.recreate()
            startActivity(intent)
        }
        eng_btn.setOnClickListener {
            MultiLanguageActivity.setLocale(this, "")
            this.recreate()
            startActivity(intent)
        }

        backbutton.setOnClickListener {

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Uzbekistan about").setMessage("Ilovadan chiqishni xohlaysizmi?")
                .setPositiveButton("Ha") { Dialog, i ->
                    System.exit(0)
                }.setNegativeButton("Yo'q") { Dialog, i ->

                }
            builder.create().show()

        }
    }
}
package com.example.uzbekistanabout

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Secondactivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)


        val name = intent.getStringExtra("name") ?: "uzbekistan"
        val image = intent.getIntExtra("image", R.drawable.toshkent_activity1)
        val about = intent.getIntExtra("about",0)


        val cityname = findViewById<TextView>(R.id.second_text1)
        val cityabout = findViewById<TextView>(R.id.second_text2)
        val cityimg = findViewById<ImageView>(R.id.secod_image)
        val backbutton = findViewById<Button>(R.id.back_btn)

        cityimg.setImageResource(image)
        cityname.text = name
        cityabout.setText (about)

        backbutton.setOnClickListener { onBackPressed() }


    }
}
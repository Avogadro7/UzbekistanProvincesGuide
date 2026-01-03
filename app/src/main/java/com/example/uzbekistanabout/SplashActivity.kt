package com.example.uzbekistanabout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val mainIntent = Intent(this@SplashActivity, MultiActivity1::class.java)
        Handler().postDelayed(
            {
                startActivity(mainIntent)
                finish()
            }, 2000
        )
    }
}
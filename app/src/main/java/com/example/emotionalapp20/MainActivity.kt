package com.example.emotionalapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME: Long = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed( {
            startActivity(Intent ( this,Mainpage::class.java))
            finish()

        } ,SPLASH_TIME)
    }
}
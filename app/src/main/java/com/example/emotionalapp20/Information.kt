package com.example.emotionalapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class Information : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_information)

        val informationback = findViewById<ImageButton>(R.id.btnBackInformation)
        informationback.setOnClickListener {
            val intent = Intent( this,Mainpage::class.java)
            startActivity(intent)
        }
    }
}
package com.example.emotionalapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AIFunction : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aifunction)

        var intent = intent
        val username = intent.getStringExtra("Username")

        val welcomeTV = findViewById<TextView>(R.id.welcomeTV)
        welcomeTV.text = "Welcome:  " + username



    }
}
package com.example.emotionalapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Mainpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        val descriptionButton = findViewById<Button>(R.id.btnDescription)
        descriptionButton.setOnClickListener {
            val intent = Intent( this,Description::class.java)
            startActivity(intent)
        }

        val infobutton = findViewById<Button>(R.id.btnInformation)
        infobutton.setOnClickListener {
            val intent = Intent( this,Information::class.java)
            startActivity(intent)

        }

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val proceedBtn = findViewById<Button>(R.id.btnProceed)

        proceedBtn.setOnClickListener {
            var username = etUsername.text.toString()

            val intent = Intent( this@Mainpage, AIFunction::class.java)
            intent.putExtra("Username", username)
            startActivity(intent)
        }




    }

}

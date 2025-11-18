package com.example.helloandroidui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

import android.widget.EditText

import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.btnClickMe)
        val etName = findViewById<EditText>(R.id.etName)
        val btnGoToSecond = findViewById<Button>(R.id.btnGoToSecond)

        btnClickMe.setOnClickListener {
            val name = etName.text.toString().trim()
            val message = if (name.isNotEmpty()) {
                "Hello, $name! Welcome to Android Development!"
            } else {
                "Hello! Please enter your name."
            }
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        btnGoToSecond.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}


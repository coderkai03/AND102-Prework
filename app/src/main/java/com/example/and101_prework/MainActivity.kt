package com.example.and101_prework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            Log.d("Main", "Button clicked!")
            Toast.makeText(this, "Connected on LinkedIn!", Toast.LENGTH_SHORT).show()
        }
    }
}
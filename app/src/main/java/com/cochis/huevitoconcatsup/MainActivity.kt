package com.cochis.huevitoconcatsup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Hola mundo de Android",
            Toast.LENGTH_LONG).show()
    }

    fun saludar() {
        var botonSaludar = findViewById<Button>(R.id.buttonMainSaludar)
    }
}
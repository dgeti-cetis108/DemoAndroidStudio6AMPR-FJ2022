package com.cochis.huevitoconcatsup

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class IntentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // forma de bloquear el giro automático horizontal del activity
        // requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        var btnCalcularEdad = findViewById<Button>(R.id.buttonIntentsCalculateAge)
        btnCalcularEdad.setOnClickListener {
            // TODO: add code to calculate age
        }

        var btnSiguiente = findViewById<Button>(R.id.buttonIntentsNext)
        btnSiguiente.setOnClickListener {
            // TODO: add code to call another activity
        }
    }
}
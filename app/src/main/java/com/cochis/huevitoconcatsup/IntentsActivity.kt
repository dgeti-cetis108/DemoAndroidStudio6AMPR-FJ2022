package com.cochis.huevitoconcatsup

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception
import java.lang.NumberFormatException
import java.util.*

class IntentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // forma de bloquear el giro automático horizontal del activity
        // requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)

        var btnCalcularEdad = findViewById<Button>(R.id.buttonIntentsCalculateAge)
        btnCalcularEdad.setOnClickListener {
            try {
                val añoDeNacimiento =
                    findViewById<EditText>(R.id.editTextIntentsYearOfBirth).text.toString()
                if (añoDeNacimiento.isNullOrEmpty()) {
                    throw IllegalArgumentException("Cadena vacía")
                }
                val añoActual = Calendar.getInstance().get(Calendar.YEAR)
                val edad = añoActual - añoDeNacimiento.toInt()
                var tuEdadEs = findViewById<TextView>(R.id.textViewIntentsEdad)
                if (edad > 122) {
                    tuEdadEs.text = "Demasiada edad para calcular"
                } else {
                    tuEdadEs.text = "Tu edad es: ${edad.toString()}"
                }
            } catch (ex: NumberFormatException) {
                Toast.makeText(this,
                    "Valor de año incorrecto",
                    Toast.LENGTH_SHORT
                ).show()
            } catch (ex: IllegalArgumentException) {
                Toast.makeText(this,
                    "El año es obligatorio, escribelo c...",
                    Toast.LENGTH_SHORT
                ).show()
            }

        }

        var btnSiguiente = findViewById<Button>(R.id.buttonIntentsNext)
        btnSiguiente.setOnClickListener {
            val intent = Intent(this, AnotherActivity::class.java)
            this.startActivity(intent)
            // this.finish()
            // TODO: Busca la manera de agregar el boton de back en Another Activity
            // y ya que la encuentres agregala y has que funcione
        }
    }
}
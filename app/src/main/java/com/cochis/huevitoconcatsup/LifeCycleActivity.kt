package com.cochis.huevitoconcatsup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.view.menu.ShowableListMenu

class LifeCycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_cycle)
    }

    fun showMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        showMessage("Estoy en onStart")
        super.onStart()
    }

    override fun onResume() {
        showMessage("Estoy en onResume")
        super.onResume()
    }

    override fun onPause() {
        showMessage("Estoy en onPause")
        super.onPause()
    }

    override fun onStop() {
        showMessage("Estoy en onStop")
        super.onStop()
    }

    override fun onRestart() {
        showMessage("Estoy en onRestart")
        super.onRestart()
    }

    override fun onDestroy() {
        showMessage("Estoy en onDestroy")
        super.onDestroy()
    }
}
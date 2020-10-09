package com.example.saludapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowName.setOnClickListener { checkValue() }
    }

    fun checkValue() {

        if (etName.text.isNotEmpty()) { //Si el nombre no está vacio
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("INTENT_NAME",etName.text)
            startActivity(intent)
        } else { //Sino
            showErrorName()
        }

    }

    fun showErrorName() {
        Toast.makeText(this, "Necesito saber tu nombre para poder saludarte", Toast.LENGTH_SHORT).show()
    }
}
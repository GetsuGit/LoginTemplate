package com.getsucode.logintemplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // ini sial id dar layout
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val edEmail = findViewById<EditText>(R.id.edEmail)

        btnLogin.setOnClickListener {

            // membuat variabel yang menampung nilai input string
            val namaEmail = edEmail.text.toString()

            Intent(this, ScondActivity::class.java).also{
                //membuat nick name unic sebagai ID
                it.putExtra("EXTRA_NAMA_EMAIL", namaEmail)
                startActivity(it)
            }
        }
    }
}

// Upload to Github
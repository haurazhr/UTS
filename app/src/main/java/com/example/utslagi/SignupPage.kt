package com.example.utslagi

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_page)

        val loginLink = findViewById<TextView>(R.id.daftaro)

        loginLink.setOnClickListener {
            // Navigate to LoginActivity
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)

        }
    }
}
package com.example.utslagi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        val signupLink = findViewById<TextView>(R.id.daftar)
        val btnLogin = findViewById<Button>(R.id.buttonLogin) // Assuming you have a button with this ID

        // Navigate to SignUpActivity when signup link is clicked
        signupLink.setOnClickListener {
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }

        // Navigate to ListOrderActivity on successful login
        btnLogin.setOnClickListener {
            // Here you might want to add your login validation logic before navigating
            val intent = Intent(this, ListOrder::class.java)
            startActivity(intent)
        }


    }
}
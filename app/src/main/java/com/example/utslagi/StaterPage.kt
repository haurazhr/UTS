package com.example.utslagi

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class StaterPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_stater_page)

        val btnLogin = findViewById<Button>(R.id.btnmasuk)
        val btnSignUp = findViewById<Button>(R.id.btndaftar)

        btnLogin.setOnClickListener {
            // Navigate to LoginActivity
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener {
            // Navigate to SignUpActivity
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
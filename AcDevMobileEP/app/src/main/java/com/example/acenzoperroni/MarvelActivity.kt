package com.example.acenzoperroni

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MarvelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marvel)

        val email = intent.getStringExtra("USER_EMAIL")
        val buttonEmail: Button = findViewById(R.id.buttonEmail)

        buttonEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$email")
                putExtra(Intent.EXTRA_SUBJECT, "Marvel Fans")
                putExtra(Intent.EXTRA_TEXT, "Obrigado por escolher a Marvel!")
            }
            startActivity(intent)
        }
    }
}

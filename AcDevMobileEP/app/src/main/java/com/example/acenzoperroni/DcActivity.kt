package com.example.acenzoperroni

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DcActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dc)

        val email = intent.getStringExtra("USER_EMAIL")
        val buttonEmail: Button = findViewById(R.id.buttonEmail)

        buttonEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO).apply {
                data = Uri.parse("mailto:$email")
                putExtra(Intent.EXTRA_SUBJECT, "DC Fans")
                putExtra(Intent.EXTRA_TEXT, "Obrigado por escolher a DC!")
            }
            startActivity(intent)
        }
    }
}

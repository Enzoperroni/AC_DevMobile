import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.acenzoperroni.MarvelActivity
import com.example.acenzoperroni.R
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: TextInputEditText
    private lateinit var radioGroup: RadioGroup
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameEditText = findViewById(R.id.editTextName)
        emailEditText = findViewById(R.id.editTextEmail)
        radioGroup = findViewById(R.id.radioGroupChoice)
        button = findViewById(R.id.buttonSubmit)

        button.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val selectedId = radioGroup.checkedRadioButtonId

            val intent = when (selectedId) {
                R.id.radioDc -> Intent(this, DcActivity::class.java)
                R.id.radioMarvel -> Intent(this, MarvelActivity::class.java)
                else -> null
            }

            intent?.putExtra("USER_EMAIL", email)
            intent?.let { startActivity(it) }
        }
    }
}

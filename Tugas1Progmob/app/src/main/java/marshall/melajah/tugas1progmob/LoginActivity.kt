package marshall.melajah.tugas1progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {


    private lateinit var yusername: EditText
    private lateinit var katasandi: EditText
    private lateinit var button: Button

    private fun initComp() {
        yusername = findViewById(R.id.username)
        katasandi = findViewById(R.id.passwordlogin)
        button = findViewById(R.id.buttonlogin)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
//        val greetingTextView = findViewById<TextView>(R.id.login)
//        val inputField = findViewById<EditText>(R.id.username)

        initComp()

        button.setOnClickListener {
            startActivity(
                Intent(this, WelcomeActivity::class.java)
                    .putExtra("yusername", yusername.text.toString())
                    .putExtra("katasandi", katasandi.text.toString())
            )
        }

        var buttonregis = findViewById<Button>(R.id.buttonregis)
        buttonregis.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

//        var buttonlogin = findViewById<Button>(R.id.buttonlogin)
//        buttonlogin.setOnClickListener {
//            val intent = Intent(this, WelcomeActivity::class.java)
//            startActivity(intent)

//            val enteredName = inputField.text.toString()
//            val message = "Welcome $enteredName"
//            greetingTextView.text =message
//        }

    }
}



package marshall.melajah.tugas1progmob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {

    private lateinit var yusername:TextView
    private lateinit var katasandi:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        yusername = findViewById(R.id.tvwelcome)
        katasandi = findViewById(R.id.tvpassword)


        val showUsername = intent.getStringExtra("yusername")
        val showkatasandi = intent.getStringExtra("katasandi")

        yusername.text = "Welcome $showUsername"
        katasandi.text = "Password kamu adalah $showkatasandi"


        var buttonhome = findViewById<Button>(R.id.buttonhome)
        buttonhome.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}
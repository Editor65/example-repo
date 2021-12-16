package ru.oooa4.finalwork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DaughterActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daughter)


        nextActivityButton = findViewById(R.id.finally_crest_button)
        nextActivityButton.setOnClickListener {
            val emergencyActivityIntent: Intent = Intent(this, EmergenceActivity::class.java)
            startActivity(emergencyActivityIntent)

            nextActivityButton = findViewById(R.id.back_button)
            nextActivityButton.setOnClickListener {
                val mainActivityIntent: Intent = Intent(this, MainActivity::class.java)
                startActivity(mainActivityIntent)
            }
        }
    }
}
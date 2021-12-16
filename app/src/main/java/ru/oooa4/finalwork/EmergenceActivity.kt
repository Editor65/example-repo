package ru.oooa4.finalwork

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EmergenceActivity : AppCompatActivity() {


    //lateinit var mainActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergence)
    }
}

// mainActivityButton = findViewById(R.id.back_button)
// mainActivityButton.setOnClickListener {
// val mainActivityIntent: Intent = Intent(this, MainActivity::class.java)
// startActivity(mainActivityIntent)
// /*nextActivityButton = findViewById(R.id.daughter_button)
// nextActivityButton.setOnClickListener {
// val daughterActivityIntent: Intent = Intent(this, DaughterActivity::class.java)
// startActivity(daughterActivityIntent)*/
//
//
// }
// }
// }
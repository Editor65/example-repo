package ru.oooa4.finalwork

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var emergencyActivityButton: ImageButton
    //lateinit var daughterActivityButton: ImageButton
    lateinit var catsActivityButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emergencyActivityButton = findViewById(R.id.crest)
        emergencyActivityButton.setOnClickListener() {
            val emergencyActivityIntent: Intent = Intent(this, EmergenceActivity::class.java)
            startActivity(emergencyActivityIntent)

            /*daughterActivityButton = findViewById(R.id.crest)
            daughterActivityButton.setOnClickListener() {
                val daughterActivityIntent: Intent = Intent(this, DaughterActivity::class.java)
                startActivity(daughterActivityIntent)*/



                catsActivityButton = findViewById(R.id.button)
                catsActivityButton.setOnClickListener {
                    val catsActivityIntent: Intent = Intent(this, CatsActivity::class.java)
                    startActivity(catsActivityIntent)

                }
            }
        }
    }

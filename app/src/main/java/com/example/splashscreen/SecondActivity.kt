package com.example.splashscreen

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.PopupMenu
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val popbtn = findViewById<Button>(R.id.button2)
        val bg = findViewById<RelativeLayout>(R.id.main)

        popbtn.setOnClickListener {
            val popupMenu = PopupMenu(this@SecondActivity, popbtn)
            popupMenu.menuInflater.inflate(R.menu.items, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { item ->
                when (item!!.itemId) {
                    R.id.btn1 -> bg.setBackgroundColor(Color.parseColor("#AB2328"))
                    R.id.btn2 -> bg.setBackgroundColor(Color.parseColor("#63666A"))
                    R.id.btn3 -> bg.setBackgroundColor(Color.parseColor("#CD001A"))
                }
                true
            }
            popupMenu.show()
        }

        val chickenBBQCard = findViewById<CardView>(R.id.chickenBBQCard)
        val pepperoniPizzaCard = findViewById<CardView>(R.id.pepperoniPizzaCard)
        val hawaiianPizzaCard = findViewById<CardView>(R.id.hawaiianPizzaCard)

        chickenBBQCard.setOnClickListener {
            val intent = Intent(this, ChickenBBQActivity::class.java)
            startActivity(intent)
        }

        pepperoniPizzaCard.setOnClickListener {
            val intent = Intent(this, PepperoniPizzaActivity::class.java)
            startActivity(intent)
        }

        hawaiianPizzaCard.setOnClickListener {
            val intent = Intent(this, HawaiianPizzaActivity::class.java)
            startActivity(intent)
        }
        // Find the ImageButton by its ID
        val imageButton4: ImageButton = findViewById(R.id.imageButton4)

        // Set an OnClickListener on the ImageButton
        imageButton4.setOnClickListener {
            // Create an Intent to start the AccountDetails activity
            val intent = Intent(this, Accountdetails::class.java)
            // Start the AccountDetails activity
            startActivity(intent)
        }
        val imageButton: ImageButton = findViewById(R.id.imagebtn)
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}


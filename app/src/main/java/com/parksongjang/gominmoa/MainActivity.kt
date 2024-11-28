package com.parksongjang.gominmoa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val FBook : ImageView = findViewById(R.id.FBook)
        val TBook : ImageView = findViewById(R.id.TBook)
        val historybutton : TextView = findViewById(R.id.historybutton)

        FBook.setOnClickListener {
            val intent = Intent(this@MainActivity, ::class.java)
            startActivity(intent)
        }

        TBook.setOnClickListener {
            val intent = Intent(this@MainActivity, ::class.java)
            startActivity(intent)
        }

        historybutton.setOnClickListener {
            val intent = Intent(this@MainActivity, ::class.java)
            startActivity(intent)        }
    }
}
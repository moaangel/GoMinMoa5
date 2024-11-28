package com.parksongjang.gominmoa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonFBook = findViewById<Button>(R.id.buttonFBook)
        val buttonTBook = findViewById<Button>(R.id.buttonTBook)

        buttonFBook.setOnClickListener{
            val intent = Intent(applicationContext, QuestionActivity::class.java)
            intent.putExtra("Book", 0)
            startActivity(intent)
        }

        buttonTBook.setOnClickListener{
            val intent = Intent(applicationContext, QuestionActivity::class.java)
            intent.putExtra("Book", 1)
            startActivity(intent)
        }
    }
}
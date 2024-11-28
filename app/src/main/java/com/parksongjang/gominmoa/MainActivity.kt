package com.parksongjang.gominmoa

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
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
        val loadingLayout = View.inflate(this, R.layout.book_animation, null)


        FBook.setOnClickListener {
            // 로딩 레이아웃 표시
            setContentView(loadingLayout)

            // 1.5초 지연 후 QuestionActivity로 이동
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@MainActivity, QuestionActivity::class.java)
                intent.putExtra("Book", 0)
                startActivity(intent)
            }, 1500) //
        }

        TBook.setOnClickListener {
            // 로딩 레이아웃 표시
            setContentView(loadingLayout)

            // 1.5초 지연 후 QuestionActivity로 이동
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@MainActivity, QuestionActivity::class.java)
                intent.putExtra("Book", 1)
                startActivity(intent)
            }, 1500) //
        }
        historybutton.setOnClickListener {
            val intent = Intent(this@MainActivity, HistoryActivity::class.java)
            startActivity(intent)        }
    }
}
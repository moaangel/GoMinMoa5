package com.parksongjang.gominmoa

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AdviceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_advice)

        //intent로 넘어온 정보
        val type: String? = intent.getStringExtra("type")
        val question: String? = intent.getStringExtra("question")
        val advice: String? = intent.getStringExtra("advice")

        // 초기화
        val textViewAdvice = findViewById<TextView>(R.id.textViewAdvice)
        val buttonList = findViewById<ImageView>(R.id.buttonList)
        val buttonShare = findViewById<ImageView>(R.id.buttonShare)

        // advice 화면에 띄워주기
        textViewAdvice.text = advice

        // 공유하기 버튼
        buttonShare.setOnClickListener{
            val chooserTitle = "친구에게 공유하기"
            val formattedText = """
🌟 오늘의 고민 🌟

[ 선택한 조언 📌 ]  
$type

[ 고민 🤔 ]  
$question

[ 오늘의 메시지 💬 ]  
$advice
""".trimIndent()
            val intent = Intent(Intent.ACTION_SEND_MULTIPLE)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, formattedText)
            startActivity(Intent.createChooser(intent, chooserTitle))
        }

        buttonList.setOnClickListener{
            val intent = Intent(applicationContext, HistoryActivity::class.java)
            startActivity(intent)
        }
    }
}
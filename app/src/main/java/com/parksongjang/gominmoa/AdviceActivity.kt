package com.parksongjang.gominmoa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
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
        val buttonList = findViewById<Button>(R.id.buttonList)
        val buttonShare = findViewById<Button>(R.id.buttonShare)

        // advice 화면에 띄워주기
        textViewAdvice.text = advice

        // 공유하기 버튼
        buttonShare.setOnClickListener{
            val chooserTitle = "친구에게 공유하기"
            val intent = Intent(Intent.ACTION_SEND_MULTIPLE)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, "오늘의 고민\n선택한 조언 : $type \n고민 : $question \n조언 : $advice")
            startActivity(Intent.createChooser(intent, chooserTitle))
        }
    }
}
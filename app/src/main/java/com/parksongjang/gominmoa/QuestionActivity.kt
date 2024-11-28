package com.parksongjang.gominmoa

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.parksongjang.gominmoa.data.FBookList
import com.parksongjang.gominmoa.data.HistoryManager
import com.parksongjang.gominmoa.data.TBookList
import com.parksongjang.gominmoa.enum.BookCategory


class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)

        // FBook인지 TBook인지 판별하는 것(Enum 쓰려고 넣음)
        val symbol: Int = intent.getIntExtra("Book", 0)
        val book: BookCategory = when(symbol){
            0 -> BookCategory.FBOOK
            1 -> BookCategory.TBOOK
            else -> TODO()
        }

        // 초기화
        val editTextQuestion = findViewById<EditText>(R.id.editTextQuestion)
        val buttonInput = findViewById<Button>(R.id.buttonInput)
        val loadingLayout = View.inflate(this, R.layout.send_animation, null)


        // 입력 버튼 클릭시 동작 (입력칸 공백이면 메세지 출력)
        buttonInput.setOnClickListener {
            if (editTextQuestion.text.toString().isEmpty()) {
                showNoInputAlert()
            } else {
                // 로딩 화면 표시
                setContentView(loadingLayout)

                // 2초 후에 AdviceActivity로 전환
                Handler(Looper.getMainLooper()).postDelayed({
                    val advice = when (book) {
                        BookCategory.FBOOK -> FBookList.getFBooks().random().advice
                        BookCategory.TBOOK -> TBookList.getTBooks().random().advice
                    }
                    HistoryManager.addHistory(
                        type = book,
                        question = editTextQuestion.text.toString(),
                        advice = advice
                    )
                    val intent = Intent(applicationContext, AdviceActivity::class.java).apply {
                        putExtra("type", when (book) {
                            BookCategory.FBOOK -> "위로의 조언"
                            BookCategory.TBOOK -> "따끔한 조언"
                        })
                        putExtra("question", editTextQuestion.text.toString())
                        putExtra("advice", advice)
                    }
                    startActivity(intent)
                    finish() // 현재 Activity 종료
                }, 3000) // 2초 후 실행
            }
        }
    }

    fun showNoInputAlert(){
        val builder = AlertDialog.Builder(this)

        builder.setTitle("고민 입력칸이 비어있습니다.\n고민 해소를 위해 당신의 고민을 입력해주세요.")
        builder.setPositiveButton("확인"){ dialog, _ ->
            dialog.dismiss()
        }

        val dialog = builder.create()
        dialog.show()
    }
}
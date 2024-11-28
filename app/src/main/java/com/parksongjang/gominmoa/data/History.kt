package com.parksongjang.gominmoa.data

import java.time.LocalDate

data class History(
    val question: String,
    val advice: String,
    val date: LocalDate
)

object HistoryManager {
    private val historyList = mutableListOf<History>()

    // History 추가
    fun addHistory(question: String, advice: String) {
        // 내역을 새로 추가
        historyList.add(History(question, advice, LocalDate.now()))
    }

    // History 리스트 가져오기
    fun getHistoryList(): List<History> {
        return historyList
    }

    // 특정 날짜에 해당하는 History 조회
    fun getHistoryListByDate(date: LocalDate): List<History> {
        return historyList.filter { it.date == date }
    }

    // 전체 History 초기화
    fun clearHistoryList() {
        historyList.clear()
    }
}

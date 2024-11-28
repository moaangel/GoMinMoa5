package com.parksongjang.gominmoa.data

data class TBook(
    val advice: String  // 따뜻한 한마디
)

object TBookList{

    // 여기에는 데이터를 추가로 넣지 않을 것이므로 초기화 시점을 처음 접근할 때로 했고
    // 처음에만 초기화하고 이후에는 초기화되지 않도록 함
    private val tBookList: List<TBook> by lazy{
        mutableListOf(
            TBook("섣부른 판단을 하지 마라"),
            TBook("준비가 필요하다"),
            TBook("세월이 약이다"),
            TBook("솔직해질 필요가 있다"),
            TBook("다짐을 행동으로 옮겨라"),
            TBook("변화가 필요하다"),
            TBook("기회는 다시 오지 않는다"),
            TBook("과거에 얽매이지 말아라"),
            TBook("나답게 살아라"),
            TBook("항상 조심하라"),
            TBook("감정적으로 결정하지 마라"),
            TBook("답은 내 마음 안에 있다"),
            TBook("고민 속에 갇혀 있지 마라"),
            TBook("다른 사람이 내 마음을 알아주길 바라지 마라"),
            TBook("다시 생각해 봐라"),
            TBook("이 또한 지나갈 것이다"),
            TBook("도움을 요청하라"),
            TBook("너무 많은 감정을 쏟지 마라"),
            TBook("초심을 잃지 마라"),
            TBook("좌절해도 포기하지 않으면 된다"),
            TBook("스스로의 생각이 기분을 만든다"),
            TBook("쉬어가라"),
            TBook("남들의 기준에 꼭 맞출 필요는 없다"),
            TBook("비판을 두려워하지 말고 건설적으로 받아들이세요."),
            TBook("불필요한 감정 소모는 생산성을 떨어뜨립니다."),
            TBook("모든 사람을 만족시킬 수는 없습니다. 중요한 사람에 집중하세요."),
            TBook("변화는 고통스러울 수 있지만, 성장의 시작입니다."),
            TBook("자신의 한계를 인정하는 것이 강점이 될 수 있습니다."),
            TBook("결단력이 없으면 기회도 없습니다."),
            TBook("완벽함을 추구하기보다 우선 실행하세요."),
            TBook("문제를 미룬다고 사라지지 않습니다. 지금 해결하세요."),
            TBook("논리가 흔들리면 설득력도 잃습니다. 근거를 명확히 하세요."),
            TBook("다른 사람의 인정보다 자신의 기준을 믿으세요."),
            TBook("지나친 공감은 오히려 방해가 될 수 있습니다."),
            TBook("한 번의 실패로 모든 것을 정의하지 마세요."),
            TBook("목표가 없다면 방향도 없습니다."),
            TBook("단기적인 만족보다 장기적인 성공을 선택하세요."),
            TBook("감정과 데이터 중 선택이 필요할 땐 데이터를 우선하세요."),
            TBook("시간과 에너지를 어디에 쓰는지 냉철하게 평가하세요.")

        )
    }

    // 따뜻한 한마디 리스트 가져오기
    fun getTBooks(): List<TBook>{
        return tBookList
    }

    // 특정 인덱스의 TBook 가져오기 -> 이는 List의 인덱스를 기준으로 가져올 예정
    // 인덱스는 인덱스 범위에서 랜덤으로 가져올 것
    fun getTBookByIndex(index: Int): TBook {
        return tBookList.get(index)
    }
}

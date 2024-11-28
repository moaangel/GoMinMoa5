package com.parksongjang.gominmoa.data

data class FBook(
    val advice: String  // 따뜻한 한마디
)

object FBookList{

    // 여기에는 데이터를 추가로 넣지 않을 것이므로 초기화 시점을 처음 접근할 때로 했고
    // 처음에만 초기화하고 이후에는 초기화되지 않도록 함
    private val fBookList: List<FBook> by lazy{
        mutableListOf(
            FBook("마음을 여세요."),
            FBook("신중하게 생각해 보는건 어떨까요?."),
            FBook("행운이 올 거에요."),
            FBook("준비가 되어 있다면 좋은 결과가 있을 거에요"),
            FBook("시간이 지나면 괜찮아 질 거에요"),
            FBook("자신에게 솔직해져 보세요"),
            FBook("단순하게 생각해보세요."),
            FBook("생각했던 걸 실천으로 옮겨보세요"),
            FBook("헤어 나오기 힘들 것 같아요."),
            FBook("용기를 내보세요."),
            FBook("변화가 필요해요."),
            FBook("기회는 다시 오지 않아요."),
            FBook("과거에 얽메이지 말아요."),
            FBook("자신을 되돌아 보세요."),
            FBook("그만두고 싶다는 생각이 들어도 딛고 일어나세요."),
            FBook("다양한 경험을 해 보세요"),
            FBook("모르는게 나을 수도 있어요."),
            FBook("지름길은 없어요"),
            FBook("문제가 생길 수도 있어요."),
            FBook("말을 조심하세요."),
            FBook("미련을 버리세요."),
            FBook("넘어지는 것보다 일어나는 것이 중요해요."),
            FBook("가능성을 열어두세요."),
            FBook("위기는 곧 기회에요."),
            FBook("지금은 때가 아니에요."),
            FBook("지금 필요한 건 걱정이 아니라 실행이에요."),
            FBook("나약해지지 말아요."),
            FBook("인정하세요."),
            FBook("후회하게 될 수도 있어요."),
            FBook("쉬어갈 때도 필요해요."),
            FBook("스스로의 생각이 기분을 만들어요."),
            FBook("걱정하지 마세요. 아직 아무 일도 일어나지 않았어요."),
            FBook("지금 이 순간을 즐기세요."),
            FBook("자만하지 마세요."),
            FBook("마음에 여유를 가져 보세요."),
            FBook("강하게 떨어 질수록 더 높이 뛰어 오를 수 있어요."),
            FBook("기다리세요."),
            FBook("마음을 비우세요."),
            FBook("현실적으로 판단하세요."),
            FBook("그럴 수도 있어요."),
            FBook("한 귀로 듣고 한 귀로 흘리세요."),
            FBook("주변에 도움을 요청하세요."),
            FBook("충분해요."),
            FBook("너무 완벽하게 하려고 하지 마세요."),
            FBook("간절하면 이루어 질 거에요."),
            FBook("여기서 멈추세요."),
            FBook("버티세요."),
            FBook("알려고 하지 마세요."),
            FBook("다시 생각해 보세요."),
            FBook("이성적으로 판단하세요.")
        )
    }

    // 따뜻한 한마디 리스트 가져오기
    fun getFBooks(): List<FBook>{
        return fBookList
    }

    // 특정 인덱스의 FBook 가져오기 -> 이는 List의 인덱스를 기준으로 가져올 예정
    // 인덱스는 인덱스 범위에서 랜덤으로 가져올 것
    fun getFBookByIndex(index: Int): FBook {
        return fBookList.get(index)
    }
}

package com.parksongjang.gominmoa.data

data class FBook(
    val advice: String  // 따뜻한 한마디
)

object FBookList{

    // 여기에는 데이터를 추가로 넣지 않을 것이므로 초기화 시점을 처음 접근할 때로 했고
    // 처음에만 초기화하고 이후에는 초기화되지 않도록 함
    private val fBookList: List<FBook> by lazy{
        mutableListOf(
            FBook("주변의 도움을 잘 받는다면 해결할 수 있을 거에요."),
            FBook("지금은 잠깐 힘든 시간이고 금방 괜찮아 질거에요."),
            FBook("실패는 성공의 발판입니다. 두려워하지 말고 도전하세요."),
            FBook("작은 성공도 축하하세요. 그것이 큰 성공으로 가는 길입니다."),
            FBook("오늘의 노력은 내일의 기적을 만듭니다."),
            FBook("모든 문제는 해결될 방법을 품고 있습니다."),
            FBook("꾸준함이 결국 당신을 성공으로 이끕니다."),
            FBook("긍정적인 생각은 긍정적인 삶을 만듭니다."),
            FBook("불가능은 단지 노력하지 않은 가능성일 뿐입니다."),
            FBook("자신을 믿는 순간 모든 것이 가능해집니다."),
            FBook("쉬어가는 것도 전략입니다. 힘들면 잠시 멈춰보세요."),
            FBook("배움은 끝이 없습니다. 매일 조금씩 성장하세요."),
            FBook("어려움은 당신을 더 강하게 만듭니다."),
            FBook("꿈꾸는 데 나이는 상관없습니다. 지금이 가장 빠른 시간입니다."),
            FBook("과거는 바꿀 수 없지만, 미래는 당신 손에 달려 있습니다."),
            FBook("주변 사람들에게 웃음을 선물하세요. 그 미소가 당신에게 돌아옵니다."),
            FBook("천천히 가도 괜찮습니다. 멈추지 않는 것이 중요합니다."),
            FBook("나만의 속도로 달려가세요. 비교는 무의미합니다."),
            FBook("감사하는 마음은 행복을 불러옵니다."),
            FBook("당신은 지금 이 순간도 누군가의 영웅입니다."),
            FBook("더 나은 내일은 오늘의 작은 행동에서 시작됩니다.")
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

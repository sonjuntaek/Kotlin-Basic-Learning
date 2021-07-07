fun main() {

    // 정수 리터럴
    println(100)
    println(100000000000) // Int범위 넘어가면 java 코드로 변경 될 때 자동으로 L(Long)이 붙음
    println(100000000000L)
    println(938_492_934_823) // _언더바를 이용해 숫자를 쉽게 알아볼 수 있게 가능.

    // double 리터럴
    println(11.11)

    // float 리터럴
    println(22.22f)

    // 문자 리터럴
    println('A')
    println('가')

    // 문자열 리터럴
    println("문자열")

    // 상수 : 변하지 않는 변수를 뜻한다.
    // 리터럴 : 데이터 그 자체를 뜻함.
    // final int a = 1  : 여기서 a는 상수, 리터럴은 1이다.
    // final Person a = person1  : a가 person1 객체를 가리키는 건 고정.
    // person1.name = "" 가능. 참조변수가 상수인 것이지 가리키는 데이터들까지 상수라는 법은 없다.

    //Raw String  """"""을 이용
    println("동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세")
    println(
        """동해물과 백두산이
        |마르고 닳도록
        |하느님이 보우하사
        |우리나라 만세
    """.trimMargin()
    )

    println("------------------------------------------------")

    //변수 선언 ,, 자료형은 기본 타입 이런거 없이 다 객체형태로 관리. int x , Integer o
    val a1: Int = 100
    println("a1 : ${a1}")
    println("a1 : $a1") // 중괄호 안에 변수만 들어있는 경우에 생략 가능.

    val a2 = 100 // 자료형을 생략해도 됨. 값에 따라 자동 결정됨. 코틀린에서는 생략하는 것을 추천.
    println("a2 : $a2")

    println("------------------------------------------------")

    //var vs val
    var a3 : Int = 100
    val a4 : Int = 100 // val 변수는 값을 다시 할당할 수 없다.
    a3 = 200
    //a4 = 200
    println("a3 : $a3")
    println("a4 : $a4")

    println("------------------------------------------------")

    // null 허용 변수
    var a5 : Int = 100
    var a6 : Int? = null // null이 나올 가능성이 있다면 Int? 형태로 타입을 지정해야됨.
    println("a5 : $a5")
    println("a6 : $a6")

    var a7 : Int? = a5
    println("a7 : $a7")

    //var a8 : Int = a6!! // null을 허용하는 변수를 null을 허용하지 않는 변수에 할당할 수 없음.
    // !!을 붙여주면 null을 허용하지 않는 변수로 변환해준다. 하지만 a6은 결국 null이 담겨있으므로 에러.

}
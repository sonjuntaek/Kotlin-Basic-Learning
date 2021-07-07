fun main() {
    whenTest(4)
    val a1 = "문자3"
}

fun whenTest(a1 : Int) = when(a1) {
    1 -> println("1입니다.");
    2 -> println("2입니다.");
    else -> println("1,2가 아닙니다.")
}



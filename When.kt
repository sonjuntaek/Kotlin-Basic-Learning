// java의 switch와 비슷하다. 정수뿐만 아니라 다양한 타입의 값을 비교 가능.
fun main() {
    val a1 = 2

    when(a1){
        1 -> println("a1은 1입니다")
        2 -> {
            println("실행될 코드가 여러 줄일 경우 중괄호")
            println("a1은 2입니다")
        }
        3 -> println("a1은 3입니다")
        4 -> println("a1은 4입니다")
        else -> println("a1은 1,2,3,4가 아닙니다.")
    }

    val a2 = 3
    when(a2){
        1,2 -> println("a2는 1이거나 2입니다.")
        3,4 -> println("a2는 3이거나 4입니다.")
        else -> println("a1은 1,2,3,4가 아닙니다.")
    }

    val a3 = 55.55
    val str  = when(a3){
        11.11 -> "a3는 11.11입니다."
        55.55 -> "a3는 55.55입니다."
        else -> "a3는 11.11, 55.55가 아닙니다."
    }
    println("str : $str")

    val a4 = "문자열2"
    when(a4){
        "문자열1" -> println("첫번째 문자열입니다.")
        "문자열2" -> println("두번째 문자열입니다.")
        "문자열3" -> println("세번째 문자열입니다.")
        else -> println("첫번째 두번째 세번째 문자열에 해당되지 않습니다.")
    }

    val a5 = 5
    when(a5){//java처럼 break없어도 특정 구문 돌고 끝남.
        in 1..3 -> println("1~3안에 포함되는 값입니다.")
        in 4..6 -> println("4~6안에 포함되는 값입니다.")
        in 5..6 -> println("4~6안에 포함되는 값입니다.")
        else -> println("1~6에 포함되지 않은 값입니다.")
    }

    val str1 = setValue(1)
    println("str1 : $str1")
    val str2 = setValue(2)
    println("str2 : $str2")
    val str3 = setValue(3)
    println("str3 : $str3")
}

fun setValue(a1 : Int) = when(a1){ //이렇게 바로 값이 할당되는 구조라면 else문 필요.
    1 -> "문자열 1"
    2 -> "문자열 2"
    else -> "그 외의 문자열"
}
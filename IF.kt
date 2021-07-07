fun main() {
    val a1: Int = 10

    //기본 if문 : 조건식이 true 인 경우에 내부 코드가 실행됨.
    if (a1 == 10) {
        println("a1은 10입니다.")
    } else {
        println("a1은 10이 아닙니다.")
    }

    if (a1 == 10) {
        println("a1은 10입니다.")
    } else if (a1 == 20) {
        println("a1은 20입니다.")
    } else {
        println("a1은 10,20이 아닌 숫자입니다.")
    }

    // 모든 조건을 만족해야할 경우.
    var a2: Int = 10
    var a3: Int = 20
    if (a2 == 10 && a3 == 20) {
        println("a2 는 10이고 a3은 20입니다.")
    }
    if (a2 == 10 && a3 == 30) {
        println("a2 는 10이고 a3은 30입니다.")
    }


    // 주어진 조건 중 하나만 만족해도 될 경우.
    if(a2 == 10 || a2 ==30){
        println("a2는 10이거나 30입니다.")
    }

    // IF문을 활용한 변수 값 설정. 코틀린에서 가능.

    var a4:String = ""
    val a5:Int = 10
    if(a5 == 10){
        a4 = "10 입니다."
    }else{
        a4 = "10이 아닙니다."
    }
    println(a4)

    //if 문을 한줄로해서 변수에 할당 가능.
    val a6 : String = if(a5 > 10) "10보다 큽니다." else "10 이하 입니다."
    println("a6 : $a6")

    //그냥 문자열을 쓰는 것으로도 변수에 할당 가능.
    val a7 : String = if(a5 > 10){
        println("if 문 시행")
        "if 문에서 출력되었습니다." //마지막에 적어준 값이 대입된다.
    }else{
        println("else 문 시행")
        "else 문에서 출력되었습니다." //마지막에 적어준 값이 대입된다.
    }
    println(a7)
}

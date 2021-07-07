// 코드 중복을 피하기 위해.
// java에서는 클래스에 메서드를 만들어 사용, Kotlin은 C언어처럼 함수 개념을 제공.
// 결국 자바코드로 변환하면 클래스 안에 들어있는 메서드 형태가 됨.
fun main() {
    test1()
    test2(100, 11.11)
    // a1: a2: 이런건 개발도구에서 제공하는 것. 언어적 특성은 아니다.

    var a1: Int = 100
    var a2: Double = 11.11
    test2(a1, a2)// 매개변수가 리터럴일 때만, 표시해줌. 변수는 표시 안됨
    test2(a2 = 66.66, a1 = 600)//이렇게 순서없이 지정해주는 것도 가능..
    // 언제 활용? 초기값을 갖고 있는 매개변수가 있을 때, 기본값을 이용하고 싶은 경우

    test3(200, 11.11)
    test3(200)
    test3(a2 = 33.3)
    // test2(a2 = 33.3) //기본값이 설정되어있는 메서드만 이렇게 사용 가능.

    val r1:Int = test4(100,200)
    val r2:Int = test4(1000,2000)
    println("r1 : $r1")
    println("r2 : $r2")
    println("--------------------------------")

    test5()

    test6()

    test7()
    test7(100)
    test7(11.11)
    test7(100,200)

    test8()
    // test9() //test8에서 정의한 test9라는 함수는 외부에서 접근불가. test8에서만 접근가능.
}

//함수 선언
fun test1() {
    println("test1 call")
    println("--------------------------------")
}

//매개변수
fun test2(a1: Int, a2: Double) {
    println("test2 call")
    println("a1 : $a1")
    println("a2 : $a2")
    println("--------------------------------")
}

fun test3(a1: Int = 0, a2: Double = 0.0) {
    println("a1 : $a1")
    println("a2 : $a2")
}

fun test4(a1: Int, a2: Int): Int {// 함수가 반환 값을 갖는 경우.
    val result: Int = a1 + a2
    return result
}


// return 타입이 아닌 함수, Unit사용
fun test5() : Unit{ // Unit은 java의 void에 해당. 반환값이 없을 경우. 생략 가능.
    println("test5 호출")
    println("--------------------------------")
}

// return 타입이 아닌 함수, Unit생략
fun test6() {
    println("test6 호출")
    println("--------------------------------")
}

//오버로딩 개념. java와 동일. 같은 이름의 함수 매개변수 타입이나 갯수로 구분 가능.
fun test7(){
    println("test7 호출 - 매개변수 없음")
    println("--------------------------------")

}

fun test7(a : Int){
    println("test7 호출 - 매개변수 1개(Int)")
    println("--------------------------------")

}

fun test7(a : Double){
    println("test7 호출 - 매개변수 1개(Double)")
    println("--------------------------------")

}

fun test7(a1 : Int, a2 : Int){
    println("test7 호출 - 매개변수 2개(Int, Int)")
    println("--------------------------------")

}

//지역함수. 함수안에 함수를 정의.
fun test8(){
    println("test8 호출")
    fun test9(){
        println("test9 호출")
    }
    test9()
    println("--------------------------------")
}
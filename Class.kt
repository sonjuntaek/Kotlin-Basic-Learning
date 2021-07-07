fun main() {
    //한줄 주석
    /*
    문장 주석
     */

    //세미콜론은 선택사항, 한줄에 여러 명령문 있을 땐 구분을 위해 사용.
    print("hello ")
    println("hello with new line")
    println("값 : "+ 100)
    println("값 : ${100}")// ${} 안에는 수식이던 변수던 상관없음.

    var obj1 = TestClass1()
    println("obj1 : $obj1")

    var obj2 = TestClass1()
    println("obj2 : $obj2")

    var obj3 = obj1
    println("obj3 : $obj3")

    val obj4 = TestClass1()
    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    //obj4.a1 = 200 // val이므로 수정 불가.
    obj4.a2 = 100

    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    obj4.testMethod1()
    obj4.testMethod2()
}

//자바에서는 모든 코드를 클래스에 정의해서 사용해야 한다.
//특정 매개체의 데이터를 관리하기보다는 기능을 구현하는 느낌이 더 크다.
//코틀린에서는 특정 매개체의 데이터를 관리하는 느낌으로 쓰임.
class TestClass1{
    //멤버 변수
    val a1 = 0 // get만 가능.
    var a2 = 0 // get, set 둘다 가능.

    //멤버 메서드
    fun testMethod1(){
        println("testMethod1")
    }
    fun testMethod2(){
        println("testMethod2")
    }
}
class TestClass2 // class 안에 내용이 없을 경우 생략 가능, 코틀린에서는 가끔 쓰임.
import pakage1.TestClass2
import pakage1.testFunction2
import pakage2.*
//만약 pakage1 , pakage2 에 똑같은 이름의 클래스가 있다면, 오류.

//많은 파일을 폴더별로 나누어 관리하는 개념을 패키지라고 부른다. 기준은 내 마음대로.
fun main() {
    val obj1: pakage1.TestClass1 = pakage1.TestClass1()
    //같은 패키지에 있는 파일이 아닐경우 위와같이 경로 명시 필요.
    obj1.testMethod1()

    pakage1.testFunction1() // import 를 이용하면  패키지 이름 생략 가능.

    val obj2 = TestClass2()
    obj2.testMethod2()
    testFunction2()

    val obj3 = TestClass3()
    obj3.testMethod3()

    val obj4 = TestClass4()
    obj4.testMethod4()
}
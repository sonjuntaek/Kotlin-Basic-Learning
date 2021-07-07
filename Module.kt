import testmodule.pakage1.TestClass1
import testmodule.pakage1.TestClass2
import testmodule.pakage2.TestClass3
import testmodule.pakage2.TestClass4

//코틀린 파일들을 모아서 관리하는 단위가 패키지, 패키지를 모아서 관리하는 단위가 모듈.
//하나의 프로그램에는 여러개의 모듈이 존재하고, 모듈은 독립적인 기능을 수행하는 실행 단위.
//다른 모듈을 사용하려는 경우 사용 등록을 꼭 해주어야 한다.
//같은 프로젝트에 있던 다른 프로젝트에 있던 마찬가지.

fun main() {
    val obj1 = TestClass1()
    val obj2 = TestClass2()
    val obj3 = TestClass3()
    val obj4 = TestClass4()
    obj1.testMethod1();
    obj2.testMethod2();
    obj3.testMethod3();
    obj4.testMethod4();
}
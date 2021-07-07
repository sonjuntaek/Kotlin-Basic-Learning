// Any 는 모든 클래스의 부모 클래스. 상속을 받지 않는다면 자동으로 Any 를 상속받음.
// Any 는 모든 객체가 가지고 있어야할 메서드가 제공되고, 이 메서드들을
// Overriding 하여 재 구현 가능하다.

fun main() {
    var obj1 = AnyTestClass1()
    println(obj1.toString())

    var obj2 = AnyTestClass2()

    var obj3 = AnyTestClass2()

    testFun(obj1)
    testFun(obj2)
    testFun(obj3)
}
class AnyTestClass1{ //자동으로 Any 를 상속받는다.
    override fun toString(): String {
        return "TestCLass1의 객체입니다."
    }
}
class AnyTestClass2{ //자동으로 Any 를 상속받는다.
    override fun toString(): String {
        return "TestCLass2의 객체입니다."
    }
}
class AnyTestClass3{ //자동으로 Any 를 상속받는다.
    override fun toString(): String {
        return "TestCLass3의 객체입니다."
    }
}

//부모 클래스인 Any타입으로 받았고, 부모 타입의 메소드와 변수에만 접근가능하다.
//그런데 Override 개념에서 배웠듯이 자식 클래스가 Overriding 한
//toString 은 부모 클래스의 함수이므로 자식의 toString이 호출된다.
fun testFun(a1 : Any){
    println("a1 : $a1")
}


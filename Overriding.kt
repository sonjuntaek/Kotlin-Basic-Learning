fun main() {

    var obj2: OverridingSubClass1 = OverridingSubClass1()
    println("obj2.super1 : ${obj2.super1}")
    obj2.superMethod1()
    println("obj2.sub1 : ${obj2.sub1}")
    obj2.subMethod1()
    //자식 타입으로 변수를 선언하고 자식 클래스로 객체를 생성하면, 둘다 접근가능.

    var obj1: OverridingSuperClass1 = obj2
    println("obj1.super1 : ${obj1.super1}")
    obj1.superMethod1()
    //println("obj1.sub1 : ${obj1.sub1}")
    //obj1.subMethod1()
    //부모 타입으로 변수를 선언하고 자식 클래스로 객체를 생성하면, 부모클래스의 필드와 메서드에만 접근가능.

    println("-----------------------------------------")
    var obj3: OverridingSubClass2 = OverridingSubClass2()
    obj3.superMethod2()


    var obj4: OverridingSuperClass2 = OverridingSubClass2()
    obj4.superMethod2()
    // 부모 클래스 타입에 자식 클래스 객체를 생성하면 부모클래스에만 접근이 가능하다하였는데,
    // 자식클래스가 부모 클래스의 메서드를 재정의했다면 자식클래스의 메소드가 호출된다.

    println("-----------------------------------------")

    var obj5: OverridingSuperClass3 = OverridingSuperClass3()
    obj5.superMethod3()
    overridingTest(obj5)

    var obj6:OverridingSubCLass3 = OverridingSubCLass3()
    overridingTest(obj6)
}

//부모 자식 관계를 만들고 접근가능 필드 및 메서드를 확인하기 위함
open class OverridingSuperClass1 {
    var super1: Int = 100
    fun superMethod1() {
        println("superMethod1")
    }
}

class OverridingSubClass1 : OverridingSuperClass1() {
    var sub1: Int = 200
    fun subMethod1() {
        println("subMethod1")
    }
}
//-------------------끝---------------------


//부모 자식에서의 overriding 실험을 위함
open class OverridingSuperClass2 {
    var super2: Int = 100
    open fun superMethod2() {
        println("SuperClass2의 superMethod2()")
    }
}

class OverridingSubClass2 : OverridingSuperClass2() {
    var sub2: Int = 200

    override fun superMethod2() {
        //super.superMethod2() //부모 클래스의 메소드를 호출하고 싶다면,
        println("Override 한 SubClass2의 superMethod2()")
    }

    fun subMethod2() {
        println("subMethod2")
    }
}

//--------------------끝--------------------


//안드로이드 버튼 클릭과 같은 개념에 Overriding 이 어떻게 쓰이는지 실습.
open class OverridingSuperClass3 {//얘가 OS에서 제공하는 인터페이스 느낌.

    open fun superMethod3() {
        println("SuperClass3의 superMethod3()")
    }
}

fun overridingTest(obj1: OverridingSuperClass3) {//onClickListener 처럼 OS에서 리스너를 전달받으려는 메소드.
    obj1.superMethod3()
}

class OverridingSubCLass3 : OverridingSuperClass3() {//얘가 개발자가 정의한 리스너.
    override fun superMethod3() {
        super.superMethod3()//부모클래스도 같이 호출 가능.
        println("subclass3의 supermethod3")
    }
}
// View.onClickListener 를 통해 새로운 객체를 만들고, Button.SetOnClickListener()의 매개변수로 전달해주고,
// Button은 SetOnclickListener 로 전달받은 객체의 부모인 인터페이스에 정의된 메소드를 호출하면 개발자가 정의된 onClick이 호출되는 것이다.
//--------------------끝--------------------
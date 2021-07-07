fun main() {
    val obj1 = ConstructorClass1()
    println("obj1 : $obj1")

    println("--------------------------")

    val obj2 = ConstructorClass2()
    println("obj2 : $obj2")
    println("obj2.a1 : ${obj2.a1}")
    println("obj2.a2 : ${obj2.a2}")

    println("--------------------------")
    val obj3 = ConstructorClass2(100, 200)
    println("obj3 : $obj3")
    println("obj3.a1 : ${obj3.a1}")
    println("obj3.a2 : ${obj3.a2}")

    println("--------------------------")
    val obj4 = ConstructorClass3(50, 100)
    println("obj4.a1 : ${obj4.a1}")
    println("obj4.a2 : ${obj4.a2}")

    println("--------------------------")
    val obj5 = ConstructorClass5(50, 100)
    println("obj5.a1 : ${obj5.a1}")
    println("obj5.a2 : ${obj5.a2}")


    println("--------------------------")
    val obj6 = ConstructorClass6(50)
    println("obj6.a1 : ${obj6.a1}")
    println("obj6.a2 : ${obj6.a2}")
}

class ConstructorClass1 {
    init {//객체 생성시 자동으로 동작하는 부분.
        println("객체 생성시 자동으로 동작하는 부분")
    }
}

class ConstructorClass2 {
    var a1 = 0
    var a2 = 0

    //생성자 오버로딩 가능.
    constructor() {
        println("매개변수가 없는 생성자.")
    }

    constructor(v1: Int, v2: Int) {
        println("매개변수가 두 개인 생성자")
        a1 = v1
        a2 = v2
    }
}

//아무것도 만들지 않으면 기본 생성자가 디폴트로 만들어지는데,
//아래와 같이 선언하면 기본 생성자는 저 형태라는 것을 명시한다.
// + var,val 키워드를 같이 사용하면. getter setter 만들지 않아도 자동으로 만들어짐.


class ConstructorClass(a1: Int, a2: Int)//var,val 안붙이면 지역변수 안생김.
//그냥 매개변수만 있는 생성자만 있는 것.


class ConstructorClass3(var a1: Int, val a2: Int) // constructor 키워드 생략 가능.

// var, val 를 붙여주면 멤버변수로 a1,a2가 자동생성되어 대입되어지는 형태.
class ConstructorClass4 constructor(var a1: Int, val a2: Int)


class ConstructorClass5(var a1: Int, val a2: Int) {//객체 생성시 주 생성자가 먼저 호출되고, init 구문이 돔.
    init {
        println("init 블록 입니다.")
        println("a1 : $a1")
        println("a2 : $a2")
    }
}

class ConstructorClass6(var a1: Int, val a2: Int) {
    // 매개변수가 하나 일때 보조 생성자 구문을 먼저 돌지만,,
    // this() 구문의 주 생성자 호출을 먼저 하게됨.
    // 그 다음 init 구문을 돌고  보조 생성자 블록이 돌게됨.
    init {
        println("init 블록 입니다")
        println("a1 : $a1")
        println("a2 : $a2")
    }

    constructor(a1: Int) : this(a1, 200) {
        println("보조 생성자 호출")
    }
}


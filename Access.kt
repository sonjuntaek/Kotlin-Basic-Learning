import pakage3.InternalClass2
import pakage3.PublicClass2
import testmodule.pakage3.PublicClass3

fun main() {
    val obj1 = AccessTestClass2(100,200)
    println("obj1.a : ${obj1.a}")
    println("obj1.b : ${obj1.b}")
    println("obj1.c : ${obj1.c}")
    //멤버 변수에 직접 접근하는 것처럼 보이지만 getter를 통해 얻어오는 것이다.

    //----------------클래스 접근제한자---------------
    //같은 모듈 안에 있는 경우.
    //var obj2 = PrivateClass()//Private 클래스는 외부에서 사용 불가.
    var obj3 = PublicClass()
    //var obj4 = ProtectedClass() // protected 는 클래스에 사용 불가.
    var obj5 = InternalClass() // 같은 모듈에서 사용 가능

    //같은 모듈 다른 패키지에 있는 경우.
    var obj6 = PublicClass2();
    //var obj7 = PrivateClass2()
    var obj8 = InternalClass2();


    //다른 모듈에 있는 경우.
    var obj9 = PublicClass3()
    //var obj10 = PrivateClass3()
    //var obj11 = InternalClass3()
    //------------------------------------------


    //--------------변수 접근제한자------------------
    //자동으로 생성자로 만들어지는건 var,val에 따라 변수 값은 private 가 되고, public getter,setter 만들어짐.
    //명시적 private 로 만들 경우 접근 불가, protected,internal은 이 타입의 getter,setter 만들어짐.
    var obj12 = AccessTestClass()
    println("obj12.public1 ${obj12.public1}")
    //println("obj12.public2 ${obj12.private1}")
    //println("obj12.public1 ${obj12.protected1}")
    println("obj12.public1 ${obj12.internal1}")

    var obj13 = SubAccessTestClass()//상속받은 클래스에서는 Protected 사용 가능.
    println("obj13.protected2 ${obj13.protected2}")
}
//이렇게만 선언하면 생성자 안에 블록이 빈 함수만 생성됨
class AccessTestClass1(a: Int, b: Int)

//이렇게 var를 붙이면 this.a = a, getter, setter다 생긴다.
//또 a,b는 private 형태이다. +) val로 선언시 set은 불가능하므로 setter는 안만들어짐.
class AccessTestClass2(var a: Int, var b: Int){
    var c : Int = 10
}

// 클래스의 접근 제한자
// private : 외부에서 객체를 생성할 수 없다.
// public : 외부에서 객체를 생성할 수 있다.
// protected : 클래스에 지정할 수 업다.
// internal : 같은 모듈일 경우에만 생성 가능.
// 코틀린에서는 같은 패키지냐 아니냐는 판단 x, 같은 모듈이냐 아니냐 판단



// 변수, 메서드의 접근 제한자
// private : 외부에서 접근할 수 없다.
// public : 외부에서 접근이 자유롭다.
// protected : 상속관계일 경우에만 접근이 가능하다.
// internal : 같은 모듈일 경우에만 접근 가능.
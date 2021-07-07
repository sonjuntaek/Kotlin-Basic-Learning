fun main() {
    var sub1 = SubClass()

    println("sub1.subMember1 : ${sub1.subMember1}")
    sub1.subMethod1()

    println("sub1.superMember1 : ${sub1.superMember1}")
    sub1.superMethod1()

    //상속으 받으면 부모 클래스의 멤버변수와 메서드를 자신의 멤버변수, 메서드처럼 사용 가능하다.
}

class SuperClass1{
// class앞에 아무것도 안붙이면 final class가 됨.
// 더 이상 이 클래스를 상속할 수 없다.

}

open class SuperClass2{
// open을 붙여주면 일반 public class 형태가 된다.(상속 가능)
    var superMember1 = 100

    fun superMethod1(){
        println("SuperClass1의 메서드")
    }
}

class SubClass :SuperClass2(){
    var subMember1 = 200

    fun subMethod1(){
        println("SubClass의 메서드")
    }
}


class SubClass2 : SuperClass2(){ // SuperClass2() 이렇게 부모클래스의 생성자를 호출해주어야 한다.

}
class SubClass3 : SuperClass2 {
    // 이렇게 블록 안에서 생성자를 만들어서 호출도 가능.
    // 부모 클래스에 기본생성자로 아무 매개변수가 없는 녀석이 디폴트로 있으니 이렇게 호출.
    constructor() : super(){

    }
}

open class SuperClass3(var a1 : Int, var a2 : Int){
    // open을 붙여주면 일반 public class 형태가 된다.(상속 가능)
    var superMember1 = 100

    fun superMethod1(){
        println("SuperClass1의 메서드")
    }
}

//만약 부모클래스가 주 생성자를 만들어 놓은 상태라면, 그 형식을 따라야 함.
class SubClass4 : SuperClass3 {
    constructor(a1 : Int, a2 : Int) : super(a1,a2){

    }
}

class SubClass5 : SuperClass3(100,200) {
    //하지만 이렇게 할 경우, 클래스 정의를 할 때 값을 정해주어야 한다.
    //위의 방법은 클래스 호출을 할 때 값을 정의해줄 수 있다.

}
fun main() {
    var obj1 = ConstructorTestClass1(10, 200)
    println("obj1.a : ${obj1.a}")//실제로는 getter를 통해 가져옴.
    println("obj1.b : ${obj1.b}")
    obj1.a = 2000
    println("변경된 obj1.a : ${obj1.a}")
    //b는 val 로 선언해서 setter 가 없기 때문에 수정이 불가.

    println("obj1.c : ${obj1.c}")
    println("obj1.d : ${obj1.d}")
    obj1.c = 2000
    println("변경된 obj1.c : ${obj1.c}")
    println("obj1.d : ${obj1.d}")

    println("---------------------------------")
    var obj2 = ConstructorTestClass2(10)
    println("변경전 obj2.f : ${obj2.f}")
    obj2.f = 21000
    println("변경후 obj2.f : ${obj2.f}")
}

class ConstructorTestClass1(var a: Int, val b: Int) {
    var c: Int = 4
    val d: Int = 5
}
//a,b는 기본으로 public 형태가 된다. 하지만 코틀린에서는 멤버변수 직접 접근 허용 안함.
//a,b는 private 로 멤버변수로 선언되고, public 형태의 getter,setter 가 선언됨.

class ConstructorTestClass2(var a: Int = 10, val b: Int= 1) {
    var f: Int = 100
        get() {
            println("get 메서드 호출")
            return field
        }
        set(value){
            println("set 메서드 호출")
            field = value
        }

    // var,val 키워드는 주 생성자에서만 사용 가능. 보조 생성자에는 쓸 수 없다.
    constructor(c: Int) : this(a = c) {

    }
}
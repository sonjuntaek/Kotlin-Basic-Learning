fun main() {
    var obj1 = InitialClass1()
    println("obj1.a1 : ${obj1.a1}")
    println("obj1.a2 : ${obj1.a2}")

    println("---------------------")


    var obj2 = InitialClass3()
    obj2.a4 = "hello world"
    println("obj2.a4 : ${obj2.a4}")
    obj2.testMethod1()
}



// ---------------------lateinit 대한 내용----------------------
//kotlin은 변수를 선언하면 무조건 초기화를 시켜야 한다. 혹은 init 구문에서 처리.
class InitialClass1 {
    var a1: Int = 100
    var a2: Int

    //이렇게 선언하면 오류가 발생하지 않는다.
    init {
        a2 = 200 + 3
    }
}

class InitialClass2 {
    var a1 = 100
    /*
    var a2
    //이렇게 선언하면 오류가 발생. 어떤 타입인지 추론이 불가능하기 때문에.
    init {
        a2 = 200
    }
     */
}

//만약 init 구문이 아닌 특정 메소드를 통해 초기화 시키고 싶은 녀석이라면?
class InitialClass3 {
    var a1: Int = 100
    var a2: Int
    //lateinit var a3: Int // primitive와 관련없는 형태만 가능..
    lateinit var a4: String
    //val로 선언된 변수는 lateinit 불가. setter가 생기지 않기 때문에.

    //이렇게 선언하면 오류가 발생하지 않는다.
    init {
        a2 = 200 + 3
    }

    fun testMethod1(){
        // :: 리플렉션. 해당 객체가 속한 클래스에 대한 정보를 얻어올 수 있다.
        if(::a4.isInitialized == false){
            //변수 a4가 초기화된 적이 있는지 확인.
            a4 = "세팅이 아직 안되었습니다."
        }else{
            a4 = "세팅이 된 적이 있습니다."
        }
        println("a4 : $a4")
    }
}
// ---------------------------끝----------------------------






// ---------------------Lazy 대한 내용----------------------
//val로 선언된 변수는 setter가 만들어지지 않기 때문에 나중에 초기화가 불가.
//lazy라는 걸 제공한다.
class InitialClass4{
    val a1 : String by lazy{
        println("a4 init")
        "문자열2"
    }//a1을 사용할 때 초기화가 된다, 이 변수에 대한 접근이 이루어 질때 lazy 구문이 돌고 초기화 된다.
    //메모리 절약도 가능.

}


// ---------------------------끝--------------------------
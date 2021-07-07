//연산자 : 주어진 값을 정해진 방식에 따라 계산하고 그 값을 되돌려준다.
//Kotlin은 연산자와 함수 두 가지를 제공. 여기선 일단 특수문자를 이용한 연산만 다룬다.
fun main() {
    //단항연산자 : 항이 하나인 연산자
    // + : 양수 -> 양수 , 음수 -> 음수
    val a1: Int = 10
    val a2: Int = -10
    val r1: Int = +a1
    val r2: Int = +a2
    println("a1 : $a1 , r1 : $r1")
    println("a2 : $a2 , r2 : $r2")

    // + : 양수 -> 음수 , 음수 -> 양수
    val r3: Int = -a1
    val r4: Int = -a2
    println("a1 : $a1 , r3 : $r3")
    println("a2 : $a2 , r4 : $r4")


    // ! : true -> false , false -> true
    val a3: Boolean = true
    val a4: Boolean = false
    val r5: Boolean = !a3
    val r6: Boolean = !a4
    println("a3 : $a3 , r5 : $r5")
    println("a4 : $a4 , r6 : $r6")


    println("-----------------------------")

    //증감 연산자
    var a5: Int = 10
    var a6: Int = 10
    var r7: Int = a5++
    var r8: Int = a6--
    //변수를 val을 선언하면 당연히 안되지.
    println("a5 : $a5 , r7 : $r7")
    println("a6 : $a6 , r8 : $r8")


    var a7: Int = 10
    var a8: Int = 10
    var r9: Int = ++a5
    var r10: Int = --a6
    println("a5 : $a7, r9 : $r9")
    println("a6 : $a8, r10 : $r10")
    println("-----------------------------")

    //산술 연산자
    val r11: Int = 10 + 3
    val r12: Int = 10 - 3
    val r13: Int = 10 * 3
    val r14: Int = 10 / 3
    val r15: Int = 10 % 3
    println("$r11, $r12, $r13, $r14, $r15")

    val r16: IntRange = 10..20
    println("r16 : $r16")


    println("-----------------------------")

    //대입 연산자
    var a9: Int = 10
    var a10: Int = 10
    var a11: Int = 10
    var a12: Int = 10
    var a13: Int = 10

    a9 += 3
    a10 -= 3
    a11 *= 3
    a12 /= 3
    a13 %= 3

    println("$a9, $a10, $a11, $a12, $a13")


    println("-----------------------------")

    //비교연산자
    var a14: Int = 10
    var a15: Int = 15
    val r17: Boolean = a14 < a15
    val r18: Boolean = a14 > a15
    println("r17 : $r17, r18 : $r18")
}


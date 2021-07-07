fun main() {
    val r1 = testFun1(100)
    println("r1 : $r1")

    val r2 = testFun2(2)
    println("r2: $r2")

    val r3 = testFun2(0)
    println("r3: $r3")

    testFun3(0)
    testFun3(1)

    println("------------------------")
    for (item in 1..10) {
        if (item > 5) {
            break
        }
        println("item $item")
    }

    println("------------------------")
    for (item in 1..10) {
        if (item % 2 == 0) {
            continue
        }
        println("item $item")
    }
}

fun testFun1(a1: Int): Int {
    println("testFun1")
    return a1 + 100
}

fun testFun2(a1: Int): Int {
    println("testFun2")
    if (a1 == 0) {
        return -1
        // return 이란 함수를 호출한 구문에게 값을 전달하는 의미보단
        // 호출한 쪽으로 되돌아가는데 값일 있을 경우 전달해주는 것임.
    }
    println("0이 아닌 값이므로 계산이 가능합니다.")
    return 100 / a1
}

fun testFun3(a1: Int) {
    if (a1 == 0) {
        return
    }
    println("a1은 0이 아닙니다.")
}
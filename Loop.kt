fun main() {
    val a1 : IntRange = 1..10 //코틀린에서 생긴 데이터 타입.
    for(item in a1){
        println("a1 : $item")
    }
    println("------------------")
    val a2 = 1..10 step 2 //값을 얼만큼 증가 시킬것인지.
    for(item in a2){
        println("a2 : $item")
    }

    println("------------------")
    //val a3 = 10..1 // 동작 안함..
    val a3 = 10 downTo 1
    for(item in a3){
        println("a3 : $item")
    }


    println("------------------")
    //val a3 = 10..1 // 동작 안함..
    val a4 = 10 downTo 1 step 2
    for(item in a4){
        println("a4 : $item")
    }


    println("------------------")
    var a5 = 0
    while(a5 < 10){
        println("a5 : $a5")
        a5++
    }

    println("------------------")
    var a6 = 0
    do{
        println("a6 : $a6")
        a6++
    }while(a6 == 0)
}
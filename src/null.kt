fun main() {
    // null : 값이 아직 없는(할당되지 않은) 상태
    // nulluable vs Non-Nullable(Default)
    // Nullable로 만드는 방법 : ?
    var myName: String = "Tom"
    var nullableMyName1: String? = null
    var nullableMyName2: String? = "Tom"
    println(myName.reversed())
    /*
    12, 13 모두 오류. nullableMyName이 nulluable이기 때문에.
    15,16 처럼 사용하면 오류 사라짐.
    println(nullableMyName1.reversed())
    println(nullableMyName2.reversed()
    */
    println(nullableMyName1?.reversed())
    println(nullableMyName2?.reversed())

    // 엘비스 연산자 : ?:
    val tom1 = nullableMyName1?.reversed() ?: "Anonymous"
    val tom2 = nullableMyName2?.reversed() ?: "Anonymous"
    println("name : $tom1")
    println("name : $tom2")

    // 확정 연산자 : !! -> 너무 남용하면 안됨.
    // println("name : ${nullableMyName1!!.reversed()}") -> NullPointerException
    println("name : ${nullableMyName2!!.reversed()}")
}
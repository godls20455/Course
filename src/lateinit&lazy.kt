fun main() {
    // lateinit -> var(변수)
    // : 원시 자료형이 아닌 것에만 사용해야 함.
    // Primitive (원시 자료형) : Int, Double, Float, Boolean 등
    // Non Primitive (원시자료형X) : String, Array, Class 등
    lateinit var lunch: String // nullable type(String?)과는 함께 사용 불가능함.
    lunch = "waffle"
    println(lunch)

    // lazy -> val(상수)
    val lazyBear: String by lazy {
        println("Bear is coming!")
        "bear"
    }

    println("first try : $lazyBear") // 처음 실행될 때만 Bear is coming 나옴.
    println("second try : $lazyBear")
    println(lazyBear)

}
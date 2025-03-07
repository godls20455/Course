fun main() {
    // Lambda Expression : 값(value)처럼 다룰 수 있는 익명 함수

    val sayHello = fun() { println("Hello World!") }
    sayHello()

    val squareNum: (Int) -> (Int) = { num -> num * num }
    val squareNum2 = { num: Int -> num * num }
    val squareNum3: (Int) -> (Int) = { it * it }

    println(squareNum(10))
    println(squareNum2(10))
    println(squareNum3(10))

    fun invokeLambda(lambda: (Int) -> Boolean): Boolean {
        return lambda(5)
    }

    val falseValue = invokeLambda({num -> num == 10})
    val trueValue = invokeLambda({num -> num < 10})
    println(falseValue)
    println(trueValue)

    // 28~31 모두 같은 코드.
    invokeLambda({num -> num < 10})
    invokeLambda { it < 10 }
    invokeLambda (){ it <10 }
    invokeLambda { it > 10 }
}
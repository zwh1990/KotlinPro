/**
 * 密封类
 */
sealed class Cal

class Add : Cal()
class Subtract : Cal()
class Multiply : Cal()


fun calculate(a: Int, b: Int, cal: Cal) = when (cal) {
    is Add -> a + b
    is Subtract -> a - b
    is Multiply -> a * b
}

fun main() {
    println(calculate(1, 2, Add()))
    println(calculate(1, 2, Subtract()))
    println(calculate(1, 2, Multiply()))
}
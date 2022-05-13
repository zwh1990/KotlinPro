fun main() {
    println(cal("hello"))
    println(cal("world"))
    println(cal("1"))
    println("--------------")

    println(dis(1))
    println(dis(10))
    println(dis(20))
}

fun cal(str: String): String {
    return when (str) {
        "hello" -> "HELLO"
        "world" -> "WORLD"
        "hello world" -> "HELLO WORLD"
        else -> "other input"
    }
}

fun dis(x: Int): Int {
    when (x) {
        1 -> {
            println("x = 1")
            return 10;
        }
        2 -> {
            println("x = 2")
            return 20;
        }
        3, 4, 5 -> {
            println("x = 3或4或5")
            return 30;
        }
        in 6..10 -> {
            println("x = 6或7或8或9或10")
            return 40;
        }
        else -> {
            println("x 为其他值")
            return 0;
        }
    }
}
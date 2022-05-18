package learn2

/**
 * 内部类   InnerClass  对应于Java 中的非静态内部类
 */


class OutClass2 {
    private var str: String = "hello world"

    inner class InnerClass {
        fun method() = this@OutClass2.str
    }
}

fun main() {
    println(OutClass2().InnerClass().method())
}
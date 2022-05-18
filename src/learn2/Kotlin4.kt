package learn2

/**
 * 嵌套类 Nested class  相当于Java 的静态内部类Static
 */
fun main() {
    println(OutClass1.NestedClass1().method())
}

class OutClass1{

    private val str: String = "hello world"

    class NestedClass1{
        fun method() = "nested"
    }

    class NestedClass2{
       val nestedClass1 = NestedClass1()
    }


}
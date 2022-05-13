package learn1

/**
 * 方法扩展
 */
class ExtensionTest {
    fun add(a: Int, b: Int) = a + b
    fun subtract(a: Int, b: Int) = a - b
}

fun ExtensionTest.multiply(a: Int, b: Int) = a * b

fun main() {
    var extensionTest = ExtensionTest();
    println(extensionTest.add(1, 2))
    println(extensionTest.subtract(1, 2))
    println(extensionTest.multiply(1,2))
}
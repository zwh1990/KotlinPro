package learn1

/**
 * 伴生对象扩展函数
 */
class MyCompion {
    companion object MyObject {

    }
}

fun MyCompion.MyObject.method() {
    println("method")
}

fun main() {
    MyCompion.MyObject.method()
}
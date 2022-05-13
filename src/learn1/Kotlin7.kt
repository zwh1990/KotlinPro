/*
  对象声明
 */
object MyObject {
    fun method() {
        println("MyObject method")
    }
}

/*
  伴生对象
 */
class MyTest {
    companion object MyObject2 {
//        @JvmStatic
        fun method() {
            println("MyObject2 method")
        }
    }
}

fun main() {
    MyObject.method()
    println("---------------")
    MyTest.MyObject2.method()
    println("---------------")
    MyTest.method()
}